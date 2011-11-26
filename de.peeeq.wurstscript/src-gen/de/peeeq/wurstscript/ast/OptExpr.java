//generated by parseq
package de.peeeq.wurstscript.ast;

public interface OptExpr extends AstElement{
	AstElement getParent();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_ExprIntVal(ExprIntVal exprIntVal);
		T case_ExprBinary(ExprBinary exprBinary);
		T case_ExprMemberMethod(ExprMemberMethod exprMemberMethod);
		T case_ExprCast(ExprCast exprCast);
		T case_NoExpr(NoExpr noExpr);
		T case_ExprVarArrayAccess(ExprVarArrayAccess exprVarArrayAccess);
		T case_ExprNull(ExprNull exprNull);
		T case_ExprStringVal(ExprStringVal exprStringVal);
		T case_ExprMemberArrayVar(ExprMemberArrayVar exprMemberArrayVar);
		T case_ExprNewObject(ExprNewObject exprNewObject);
		T case_ExprFunctionCall(ExprFunctionCall exprFunctionCall);
		T case_ExprMemberVar(ExprMemberVar exprMemberVar);
		T case_ExprUnary(ExprUnary exprUnary);
		T case_ExprRealVal(ExprRealVal exprRealVal);
		T case_ExprBoolVal(ExprBoolVal exprBoolVal);
		T case_ExprFuncRef(ExprFuncRef exprFuncRef);
		T case_ExprVarAccess(ExprVarAccess exprVarAccess);
		T case_ExprThis(ExprThis exprThis);
	}

	public interface MatcherVoid {
		void case_ExprIntVal(ExprIntVal exprIntVal);
		void case_ExprBinary(ExprBinary exprBinary);
		void case_ExprMemberMethod(ExprMemberMethod exprMemberMethod);
		void case_ExprCast(ExprCast exprCast);
		void case_NoExpr(NoExpr noExpr);
		void case_ExprVarArrayAccess(ExprVarArrayAccess exprVarArrayAccess);
		void case_ExprNull(ExprNull exprNull);
		void case_ExprStringVal(ExprStringVal exprStringVal);
		void case_ExprMemberArrayVar(ExprMemberArrayVar exprMemberArrayVar);
		void case_ExprNewObject(ExprNewObject exprNewObject);
		void case_ExprFunctionCall(ExprFunctionCall exprFunctionCall);
		void case_ExprMemberVar(ExprMemberVar exprMemberVar);
		void case_ExprUnary(ExprUnary exprUnary);
		void case_ExprRealVal(ExprRealVal exprRealVal);
		void case_ExprBoolVal(ExprBoolVal exprBoolVal);
		void case_ExprFuncRef(ExprFuncRef exprFuncRef);
		void case_ExprVarAccess(ExprVarAccess exprVarAccess);
		void case_ExprThis(ExprThis exprThis);
	}

	OptExpr copy();
	public abstract void accept(WStatements.Visitor v);
	public abstract void accept(ModuleDef.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(StmtReturn.Visitor v);
	public abstract void accept(WStatement.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(VarDef.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(StmtIf.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(OptExpr.Visitor v);
	public abstract void accept(AstElementWithModifier.Visitor v);
	public abstract void accept(ClassOrModule.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(JassGlobalBlock.Visitor v);
	public abstract void accept(OnDestroyDef.Visitor v);
	public abstract void accept(StmtLoop.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(InitBlock.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(LocalVarDef.Visitor v);
	public abstract void accept(GlobalVarDef.Visitor v);
	public abstract void accept(NameDef.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(StmtWhile.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public interface Visitor {
		void visit(OpModReal opModReal);
		void visit(ExprBinary exprBinary);
		void visit(OpUnequals opUnequals);
		void visit(ExprCast exprCast);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(OpGreater opGreater);
		void visit(ExprStringVal exprStringVal);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(ExprNewObject exprNewObject);
		void visit(OpLessEq opLessEq);
		void visit(TypeExpr typeExpr);
		void visit(OpOr opOr);
		void visit(OpDivReal opDivReal);
		void visit(OpMult opMult);
		void visit(ExprRealVal exprRealVal);
		void visit(ExprFuncRef exprFuncRef);
		void visit(ExprIntVal exprIntVal);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(OpNot opNot);
		void visit(NoExpr noExpr);
		void visit(OpModInt opModInt);
		void visit(ExprNull exprNull);
		void visit(OpDivInt opDivInt);
		void visit(OpEquals opEquals);
		void visit(WPos wPos);
		void visit(OpLess opLess);
		void visit(OpMinus opMinus);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(ExprUnary exprUnary);
		void visit(ExprMemberVar exprMemberVar);
		void visit(OpAnd opAnd);
		void visit(ExprBoolVal exprBoolVal);
		void visit(OpGreaterEq opGreaterEq);
		void visit(ExprThis exprThis);
		void visit(ExprVarAccess exprVarAccess);
		void visit(Indexes indexes);
		void visit(OpPlus opPlus);
		void visit(ArraySizes arraySizes);
		void visit(Arguments arguments);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(Arguments arguments) {}
	}
}
