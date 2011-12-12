package de.peeeq.wurstscript.validation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.net.SMTPAppender;

import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

import de.peeeq.wurstscript.ast.AstElement;
import de.peeeq.wurstscript.ast.ClassDef;
import de.peeeq.wurstscript.ast.CompilationUnit;
import de.peeeq.wurstscript.ast.ConstructorDef;
import de.peeeq.wurstscript.ast.Expr;
import de.peeeq.wurstscript.ast.ExprAssignable;
import de.peeeq.wurstscript.ast.ExprFuncRef;
import de.peeeq.wurstscript.ast.ExprFunctionCall;
import de.peeeq.wurstscript.ast.ExprMemberArrayVar;
import de.peeeq.wurstscript.ast.ExprMemberMethod;
import de.peeeq.wurstscript.ast.ExprMemberVar;
import de.peeeq.wurstscript.ast.ExprNewObject;
import de.peeeq.wurstscript.ast.ExprVarAccess;
import de.peeeq.wurstscript.ast.ExprVarArrayAccess;
import de.peeeq.wurstscript.ast.ExtensionFuncDef;
import de.peeeq.wurstscript.ast.FuncDef;
import de.peeeq.wurstscript.ast.FuncSignature;
import de.peeeq.wurstscript.ast.FunctionDefinition;
import de.peeeq.wurstscript.ast.FunctionImplementation;
import de.peeeq.wurstscript.ast.GlobalVarDef;
import de.peeeq.wurstscript.ast.InitBlock;
import de.peeeq.wurstscript.ast.LocalVarDef;
import de.peeeq.wurstscript.ast.ModStatic;
import de.peeeq.wurstscript.ast.Modifier;
import de.peeeq.wurstscript.ast.Modifiers;
import de.peeeq.wurstscript.ast.ModuleDef;
import de.peeeq.wurstscript.ast.NameDef;
import de.peeeq.wurstscript.ast.NameRef;
import de.peeeq.wurstscript.ast.OnDestroyDef;
import de.peeeq.wurstscript.ast.OpAssignment;
import de.peeeq.wurstscript.ast.OpUpdateAssign;
import de.peeeq.wurstscript.ast.OptExpr;
import de.peeeq.wurstscript.ast.OptTypeExpr;
import de.peeeq.wurstscript.ast.StmtDestroy;
import de.peeeq.wurstscript.ast.StmtErr;
import de.peeeq.wurstscript.ast.StmtExitwhen;
import de.peeeq.wurstscript.ast.StmtForRange;
import de.peeeq.wurstscript.ast.StmtIf;
import de.peeeq.wurstscript.ast.StmtLoop;
import de.peeeq.wurstscript.ast.StmtReturn;
import de.peeeq.wurstscript.ast.StmtSet;
import de.peeeq.wurstscript.ast.StmtWhile;
import de.peeeq.wurstscript.ast.TypeExpr;
import de.peeeq.wurstscript.ast.TypeExprSimple;
import de.peeeq.wurstscript.ast.VarDef;
import de.peeeq.wurstscript.ast.VisibilityModifier;
import de.peeeq.wurstscript.ast.WPackage;
import de.peeeq.wurstscript.ast.WParameter;
import de.peeeq.wurstscript.ast.WPos;
import de.peeeq.wurstscript.ast.WScope;
import de.peeeq.wurstscript.ast.WStatement;
import de.peeeq.wurstscript.ast.WStatements;
import de.peeeq.wurstscript.attributes.FuncDefInstance;
import de.peeeq.wurstscript.attributes.attr;
import de.peeeq.wurstscript.gui.ProgressHelper;
import de.peeeq.wurstscript.types.PScriptTypeArray;
import de.peeeq.wurstscript.types.PScriptTypeBool;
import de.peeeq.wurstscript.types.PScriptTypeInt;
import de.peeeq.wurstscript.types.PScriptTypeReal;
import de.peeeq.wurstscript.types.PScriptTypeVoid;
import de.peeeq.wurstscript.types.PscriptType;
import de.peeeq.wurstscript.types.PscriptTypeClass;
import de.peeeq.wurstscript.types.PscriptTypeModule;
import de.peeeq.wurstscript.utils.Utils;

/**
 * this class validates a pscript program
 * 
 * it has visit methods for different elements in the AST and checks whether
 * these are correct
 * 
 * the validation phase might not find all errors, code transformation and
 * optimization phases might detect other errors because they do a more
 * sophisticated analysis of the program
 * 
 * also note that many cases are already caught by the calculation of the
 * attributes
 * 
 */
public class WurstValidator extends CompilationUnit.DefaultVisitor {

	private CompilationUnit prog;
	private int functionCount;
	private int visitedFunctions;

	public WurstValidator(CompilationUnit prog) {
		this.prog = prog;
	}

	public void validate() {
		functionCount = countFunctions();
		visitedFunctions = 0;

		prog.accept(this);
	}

	private int countFunctions() {
		final int functionCount[] = new int[1];
		prog.accept(new CompilationUnit.DefaultVisitor() {
			@Override
			public void visit(FuncDef f) {
				functionCount[0]++;
			}
		});
		return functionCount[0];
	}

	@Override
	public void visit(StmtSet s) {
		super.visit(s);

		PscriptType leftType = s.getLeft().attrTyp();
		PscriptType rightType = s.getRight().attrTyp();

		checkAssignment(Utils.isJassCode(s), s.getSource(), leftType, rightType);

	}

	private void checkAssignment(boolean isJassCode, WPos pos, PscriptType leftType, PscriptType rightType) {
		if (!rightType.isSubtypeOf(leftType)) {
			if (isJassCode) {
				if (leftType instanceof PScriptTypeReal && rightType instanceof PScriptTypeInt) {
					// special case: jass allows to assign an integer to a real
					// variable
					return;
				}
			}
			attr.addError(pos, "Cannot assign " + rightType + " to " + leftType);
		}
	}

	@Override
	public void visit(LocalVarDef s) {
		checkVarName(s, false);
		super.visit(s);
		if (s.getInitialExpr() instanceof Expr) {
			Expr initial = (Expr) s.getInitialExpr();
			PscriptType leftType = s.attrTyp();
			PscriptType rightType = initial.attrTyp();

			checkAssignment(Utils.isJassCode(s), s.getSource(), leftType, rightType);
		}
	}

	private void checkVarName(VarDef s, boolean isConstant) {
		String varName = s.getName(); 
		if (!Utils.isJassCode(s)) {
			if (!Character.isLowerCase(varName.charAt(0))) {
				if (!varName.matches("[A-Z0-9_]+")) {
					attr.addError(s.getSource(), "Variable names must start with a lower case character. (" + varName + ")" );
				}
			}
		}
	}
	
	@Override
	public void visit(WParameter wParameter) {
		checkVarName(wParameter, false);
	}

	@Override
	public void visit(GlobalVarDef s) {
		checkVarName(s, s.attrIsConstant());
		super.visit(s);
		if (s.getInitialExpr() instanceof Expr) {
			Expr initial = (Expr) s.getInitialExpr();
			PscriptType leftType = s.attrTyp();
			PscriptType rightType = initial.attrTyp();
			checkAssignment(Utils.isJassCode(s), s.getSource(), leftType, rightType);
		}
	}

	@Override
	public void visit(StmtIf stmtIf) {
		super.visit(stmtIf);
		PscriptType condType = stmtIf.getCond().attrTyp();
		if (!(condType instanceof PScriptTypeBool)) {
			attr.addError(stmtIf.getCond().getSource(), "If condition must be a boolean but found " + condType);
		}
	}

	@Override
	public void visit(StmtWhile stmtWhile) {
		super.visit(stmtWhile);
		PscriptType condType = stmtWhile.getCond().attrTyp();
		if (!(condType instanceof PScriptTypeBool)) {
			attr.addError(stmtWhile.getCond().getSource(), "While condition must be a boolean but found " + condType);
		}
	}

	@Override
	public void visit(ExtensionFuncDef func) {
		checkFunctionName(func.getSignature());
		
		
		checkReturn(func);
		UninitializedVars.checkFunc(func.attrScopeNames().values(), func.getBody());
	}

	private void checkFunctionName(FuncSignature signature) {
		if (!Utils.isJassCode(signature)) {
			if (Character.isUpperCase(signature.getName().charAt(0))) {
				attr.addError(signature.getSource(), "Function names must start with an lower case character.");
			}
		}
	}

	

	

	

	private void checkReturn(FunctionImplementation func) {
		String functionName = func.getSignature().getName();
		if (func.getSignature().getTyp() instanceof TypeExpr) {
			if (!func.getBody().attrDoesReturn()) {
				attr.addError(func.getSource(), "Function " + functionName + " is missing a return statement.");
			}
		}
	}

	@Override
	public void visit(FuncDef func) {
		visitedFunctions++;
		attr.setProgress(null, ProgressHelper.getValidatorPercent(visitedFunctions, functionCount));

		checkFunctionName(func.getSignature());
		
		String functionName = func.getSignature().getName();
		if (func.attrIsAbstract()) {
			if (func.getBody().size() > 0) {
				attr.addError(func.getBody().get(0).getSource(), "The abstract function " + functionName
						+ " must not have any statements.");
			}
		} else { // not abstract
			checkReturn(func);
			UninitializedVars.checkFunc(func.attrScopeNames().values(), func.getBody());
		}

		if (func.attrNearestClassOrModule() instanceof ModuleDef) {
			// function is in module -> must be private or public
			if (!func.attrIsPrivate() && !func.attrIsPublic()) {
				attr.addError(func.getSource(), "Function " + functionName + " must be declared " + "public or private.\n");
			}
		}

	}
	
	@Override
	public void visit(InitBlock initBlock) {
		UninitializedVars.checkFunc(initBlock.attrScopeNames().values(), initBlock.getBody());
	}
	
	@Override
	public void visit(OnDestroyDef onDestroyDef) {
		UninitializedVars.checkFunc(onDestroyDef.attrScopeNames().values(), onDestroyDef.getBody());
	}
	
	@Override
	public void visit(ConstructorDef constructorDef) {
		UninitializedVars.checkFunc(constructorDef.attrScopeNames().values(), constructorDef.getBody());
	}

	@Override
	public void visit(ExprFunctionCall stmtCall) {
		String funcName = stmtCall.getFuncName();
		// calculating the exprType should reveal most errors:
		stmtCall.attrTyp();
		
		FunctionImplementation nearestFunc = stmtCall.attrNearestFuncDef();
		if (stmtCall.attrFuncDef() != null) {
			FunctionDefinition calledFunc = stmtCall.attrFuncDef().getDef();
			if (calledFunc.attrNearestClassOrModule() != null) {
				if (!calledFunc.attrIsStatic()) {
					if (nearestFunc instanceof FuncDef) {
						FuncDef funcDef = (FuncDef) nearestFunc;
						if (funcDef.attrIsStatic()) {
							attr.addError(stmtCall.getSource(), "Cannot call dynamic function " + funcName  +
									" from static function " + nearestFunc.getSignature().getName());
						}
						
					}
				}
			}
		}
		
		// special check for filter & condition:
		if (Utils.oneOf(funcName, "Condition", "Filter")) {
			Expr firstArg = stmtCall.getArgs().get(0);
			if (firstArg instanceof ExprFuncRef) {
				ExprFuncRef exprFuncRef = (ExprFuncRef) firstArg;
				FuncDefInstance f = exprFuncRef.attrFuncDef();
				if (f != null) {
					FunctionDefinition def = f.getDef();
					if (def.getSignature().getParameters().size() > 0) {
						attr.addError(firstArg.getSource(), "Functions passed to Filter or Condition must have no parameters.");
					}
					if (!(def.getSignature().getTyp().attrTyp() instanceof PScriptTypeBool)) {
						attr.addError(firstArg.getSource(), "Functions passed to Filter or Condition must return boolean.");
					}
				}
			}
		}
	}

	@Override
	public void visit(ExprMemberMethod stmtCall) {
		// calculating the exprType should reveal all errors:
		stmtCall.attrTyp();
	}

	@Override
	public void visit(ExprNewObject stmtCall) {
		stmtCall.attrTyp();
		stmtCall.attrConstructorDef();
	}

	@Override
	public void visit(Modifiers modifiers) {
		boolean hasVis = false;
		boolean isStatic = false;
		for (Modifier m : modifiers) {
			if (m instanceof VisibilityModifier) {
				if (hasVis) {
					attr.addError(m.getSource(), "Each element can only have one visibility modfifier (public, private, ...)");
				}
				hasVis = true;
			} else if (m instanceof ModStatic) {
				if (isStatic) {
					attr.addError(m.getSource(), "double static? - what r u trying to do?");
				}
				isStatic = true;
			}
		}
	}

	@Override
	public void visit(StmtReturn s) {
		FunctionImplementation func = s.attrNearestFuncDef();
		if (func == null) {
			attr.addError(s.getSource(), "return statements can only be used inside functions");
			return;
		}
		PscriptType returnType = func.getSignature().getTyp().attrTyp();
		if (s.getObj() instanceof Expr) {
			Expr returned = (Expr) s.getObj();
			if (returnType.isSubtypeOf(PScriptTypeVoid.instance())) {
				attr.addError(s.getSource(), "Cannot return a value from a function which returns nothing");
			} else {
				PscriptType returnedType = returned.attrTyp();
				if (!returnedType.isSubtypeOf(returnType)) {
					attr.addError(s.getSource(), "Cannot return " + returnedType + ", expected expression of type "
							+ returnType);
				}
			}
		} else { // empty return
			if (!returnType.isSubtypeOf(PScriptTypeVoid.instance())) {
				attr.addError(s.getSource(), "Missing return value");
			}
		}
	}

	@Override
	public void visit(ClassDef classDef) {
		checkTypeName(classDef.getSource(), classDef.getName());
		
		// calculate all functions to find possible errors
		Multimap<String, FuncDefInstance> functions = classDef.attrAllFunctions();
		for (FuncDefInstance f : functions.values()) {
			FunctionDefinition funcDef = f.getDef();
			if (funcDef.attrIsAbstract()) {
				attr.addError(classDef.getSource(), "The abstract method " + funcDef.getSignature().getName()
						+ " must be implemented in class " + classDef.getName() + ".");
			}
		}
	}

	private void checkTypeName(WPos source, String name) {
		if (!Character.isUpperCase(name.charAt(0))) {
			attr.addError(source, "Type names must start with upper case characters.");
		}
	}

	@Override
	public void visit(ModuleDef moduleDef) {
		checkTypeName(moduleDef.getSource(), moduleDef.getName());
		// calculate all functions to find possible errors
		moduleDef.attrAllFunctions();
	}
	

	@Override
	public void visit(StmtDestroy stmtDestroy) {
		PscriptType typ = stmtDestroy.getObj().attrTyp();
		if (!(typ instanceof PscriptTypeModule || typ instanceof PscriptTypeClass)) {
			attr.addError(stmtDestroy.getSource(), "Cannot destroy objects of type " + typ);
		}
	}
	
	@Override 
	public void visit(ExprVarAccess e) {
		checkVarRef(e, isDynamicContext(e));
	}

	private boolean isDynamicContext(ExprVarAccess e) {
		AstElement elem = e;
		while (elem != null) {
			if (elem instanceof FuncDef) {
				FuncDef funcDef = (FuncDef) elem;
				return funcDef.attrIsDynamicClassMember();
			} else if (elem instanceof ConstructorDef) {
				return true;
			} else if (elem instanceof OnDestroyDef) {
				return true;
			} else if (elem instanceof GlobalVarDef) {
				GlobalVarDef g = (GlobalVarDef) elem;
				return g.attrIsDynamicClassMember();
			}
			
			elem = elem.getParent();
		}
		return false;
	}

	/**
	 * check if the nameRef e is accessed correctly
	 * i.e. not using a dynamic variable from a static context
	 * @param e
	 * @param dynamicContext
	 */
	private void checkVarRef(NameRef e, boolean dynamicContext) {
		NameDef def = e.attrNameDef();
		if (def instanceof GlobalVarDef) {
			GlobalVarDef g = (GlobalVarDef) def;
			if (g.attrIsDynamicClassMember() && !dynamicContext) {
				attr.addError(e.getSource(), "Cannot reference dynamic variable " +e.getVarName() + " from static context.");
			}
		}
	}
}
