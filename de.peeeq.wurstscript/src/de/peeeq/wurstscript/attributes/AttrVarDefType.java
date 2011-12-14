package de.peeeq.wurstscript.attributes;

import de.peeeq.wurstscript.ast.ClassDef;
import de.peeeq.wurstscript.ast.Expr;
import de.peeeq.wurstscript.ast.GlobalVarDef;
import de.peeeq.wurstscript.ast.LocalVarDef;
import de.peeeq.wurstscript.ast.ModuleDef;
import de.peeeq.wurstscript.ast.ModuleInstanciation;
import de.peeeq.wurstscript.ast.NoTypeExpr;
import de.peeeq.wurstscript.ast.OptExpr;
import de.peeeq.wurstscript.ast.OptTypeExpr;
import de.peeeq.wurstscript.ast.TypeExprArray;
import de.peeeq.wurstscript.ast.TypeExprSimple;
import de.peeeq.wurstscript.ast.TypeExprThis;
import de.peeeq.wurstscript.ast.WParameter;
import de.peeeq.wurstscript.types.PScriptTypeClassDefinition;
import de.peeeq.wurstscript.types.PScriptTypeModuleDefinition;
import de.peeeq.wurstscript.types.PscriptType;
import de.peeeq.wurstscript.types.PscriptTypeModuleInstanciation;


/**
 * this attribute can give you the type of a variable definition
 *
 */
public class AttrVarDefType {
	
	public static  PscriptType calculate(GlobalVarDef node) {
		return defaultCase(node.getTyp(), node.getInitialExpr());
	}
	
	public static  PscriptType calculate(LocalVarDef node) {
		return defaultCase(node.getTyp(), node.getInitialExpr());
	}
	
	public static  PscriptType calculate(WParameter node) {
		return node.getTyp().attrTyp();
	}
	
	public static PscriptType calculate(ClassDef c) {
		return PScriptTypeClassDefinition.instance(c);
	}
	
	private static PscriptType defaultCase(OptTypeExpr typ,
			final OptExpr initialExpr) {
		return typ.match(new OptTypeExpr.Matcher<PscriptType>() {

			@Override
			public PscriptType case_NoTypeExpr(NoTypeExpr nt)
					 {
				if (initialExpr instanceof Expr) {
					return ((Expr) initialExpr).attrTyp();
				} else {
					throw new Error("Vardef must either have a type or an initial value");
				}
			}

			@Override
			public PscriptType case_TypeExprSimple(TypeExprSimple term)
					 {
				return term.attrTyp();
			}
			
			@Override
			public PscriptType case_TypeExprThis(TypeExprThis term)
					 {
				return term.attrTyp();
			}

			@Override
			public PscriptType case_TypeExprArray(TypeExprArray term) {
				return term.attrTyp();
			}
		});
	}

	public static PscriptType calculate(ModuleDef moduleDef) {
		return PScriptTypeModuleDefinition.instance(moduleDef);
	}

	public static PscriptType calculate(ModuleInstanciation m) {
		return new PscriptTypeModuleInstanciation(m);
	}
	
	

}
