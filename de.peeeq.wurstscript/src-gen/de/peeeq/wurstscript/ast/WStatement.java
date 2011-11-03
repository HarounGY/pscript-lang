//generated by parseq
package de.peeeq.wurstscript.ast;

public interface WStatement extends SortPos{
	SortPos getParent();
	void setSource(WPos source);
	WPos getSource();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_StmtDestroy(StmtDestroy stmtDestroy);
		T case_StmtWhile(StmtWhile stmtWhile);
		T case_LocalVarDef(LocalVarDef localVarDef);
		T case_StmtExitwhen(StmtExitwhen stmtExitwhen);
		T case_ExprNewObject(ExprNewObject exprNewObject);
		T case_StmtReturn(StmtReturn stmtReturn);
		T case_StmtIf(StmtIf stmtIf);
		T case_StmtSet(StmtSet stmtSet);
		T case_ExprFunctionCall(ExprFunctionCall exprFunctionCall);
		T case_ExprMemberMethod(ExprMemberMethod exprMemberMethod);
		T case_StmtIncRefCount(StmtIncRefCount stmtIncRefCount);
		T case_StmtErr(StmtErr stmtErr);
		T case_StmtDecRefCount(StmtDecRefCount stmtDecRefCount);
		T case_StmtLoop(StmtLoop stmtLoop);
	}

	public interface MatcherVoid {
		void case_StmtDestroy(StmtDestroy stmtDestroy);
		void case_StmtWhile(StmtWhile stmtWhile);
		void case_LocalVarDef(LocalVarDef localVarDef);
		void case_StmtExitwhen(StmtExitwhen stmtExitwhen);
		void case_ExprNewObject(ExprNewObject exprNewObject);
		void case_StmtReturn(StmtReturn stmtReturn);
		void case_StmtIf(StmtIf stmtIf);
		void case_StmtSet(StmtSet stmtSet);
		void case_ExprFunctionCall(ExprFunctionCall exprFunctionCall);
		void case_ExprMemberMethod(ExprMemberMethod exprMemberMethod);
		void case_StmtIncRefCount(StmtIncRefCount stmtIncRefCount);
		void case_StmtErr(StmtErr stmtErr);
		void case_StmtDecRefCount(StmtDecRefCount stmtDecRefCount);
		void case_StmtLoop(StmtLoop stmtLoop);
	}

	WStatement copy();
	public abstract void accept(InitBlock.Visitor v);
	public abstract void accept(WStatement.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(OnDestroyDef.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(StmtIf.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(WStatements.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(StmtLoop.Visitor v);
	public abstract void accept(StmtWhile.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public interface Visitor {
		void visit(OpAssign opAssign);
		void visit(OpDivReal opDivReal);
		void visit(ExprFuncRef exprFuncRef);
		void visit(ExprIntVal exprIntVal);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(ExprBoolVal exprBoolVal);
		void visit(ExprUnary exprUnary);
		void visit(OpGreater opGreater);
		void visit(ExprRealVal exprRealVal);
		void visit(OpDivInt opDivInt);
		void visit(StmtDecRefCount stmtDecRefCount);
		void visit(StmtErr stmtErr);
		void visit(TypeExpr typeExpr);
		void visit(ExprMemberVar exprMemberVar);
		void visit(OpEquals opEquals);
		void visit(ExprThis exprThis);
		void visit(OpModInt opModInt);
		void visit(ExprVarAccess exprVarAccess);
		void visit(OpAnd opAnd);
		void visit(WStatements wStatements);
		void visit(ExprStringVal exprStringVal);
		void visit(OpMinus opMinus);
		void visit(OpPlus opPlus);
		void visit(ExprNull exprNull);
		void visit(StmtIncRefCount stmtIncRefCount);
		void visit(NoTypeExpr noTypeExpr);
		void visit(OpUnequals opUnequals);
		void visit(StmtDestroy stmtDestroy);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(StmtExitwhen stmtExitwhen);
		void visit(Indexes indexes);
		void visit(ExprBinary exprBinary);
		void visit(StmtReturn stmtReturn);
		void visit(NoExpr noExpr);
		void visit(OpMult opMult);
		void visit(OpOr opOr);
		void visit(StmtIf stmtIf);
		void visit(WPos wPos);
		void visit(StmtLoop stmtLoop);
		void visit(ArraySizes arraySizes);
		void visit(StmtWhile stmtWhile);
		void visit(ExprCast exprCast);
		void visit(LocalVarDef localVarDef);
		void visit(ExprNewObject exprNewObject);
		void visit(OpModReal opModReal);
		void visit(StmtSet stmtSet);
		void visit(OpNot opNot);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(OpLessEq opLessEq);
		void visit(Arguments arguments);
		void visit(OpLess opLess);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(OpGreaterEq opGreaterEq);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(OpAssign opAssign) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(StmtDecRefCount stmtDecRefCount) {}
		@Override public void visit(StmtErr stmtErr) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(WStatements wStatements) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(StmtIncRefCount stmtIncRefCount) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(StmtDestroy stmtDestroy) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(StmtExitwhen stmtExitwhen) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(StmtReturn stmtReturn) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(StmtIf stmtIf) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(StmtLoop stmtLoop) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(StmtWhile stmtWhile) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(LocalVarDef localVarDef) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(StmtSet stmtSet) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
	}
}
