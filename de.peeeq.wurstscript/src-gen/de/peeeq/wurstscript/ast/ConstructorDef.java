//generated by parseq
package de.peeeq.wurstscript.ast;

public interface ConstructorDef extends SortPos, WScope, ClassSlot {
	SortPos getParent();
	void setSource(WPos source);
	WPos getSource();
	void setVisibility(VisibilityModifier visibility);
	VisibilityModifier getVisibility();
	void setParams(WParameters params);
	WParameters getParams();
	void setBody(WStatements body);
	WStatements getBody();
	ConstructorDef copy();
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public interface Visitor {
		void visit(OpAssign opAssign);
		void visit(OpDivReal opDivReal);
		void visit(VisibilityProtected visibilityProtected);
		void visit(ExprFuncRef exprFuncRef);
		void visit(VisibilityDefault visibilityDefault);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(ExprIntVal exprIntVal);
		void visit(ExprBoolVal exprBoolVal);
		void visit(ExprUnary exprUnary);
		void visit(ExprRealVal exprRealVal);
		void visit(OpGreater opGreater);
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
		void visit(WParameters wParameters);
		void visit(OpMinus opMinus);
		void visit(OpPlus opPlus);
		void visit(ExprNull exprNull);
		void visit(StmtIncRefCount stmtIncRefCount);
		void visit(NoTypeExpr noTypeExpr);
		void visit(OpUnequals opUnequals);
		void visit(VisibilityPublicread visibilityPublicread);
		void visit(StmtDestroy stmtDestroy);
		void visit(Indexes indexes);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(StmtExitwhen stmtExitwhen);
		void visit(ExprBinary exprBinary);
		void visit(StmtReturn stmtReturn);
		void visit(NoExpr noExpr);
		void visit(OpMult opMult);
		void visit(OpOr opOr);
		void visit(StmtIf stmtIf);
		void visit(WPos wPos);
		void visit(StmtLoop stmtLoop);
		void visit(ArraySizes arraySizes);
		void visit(ExprCast exprCast);
		void visit(StmtWhile stmtWhile);
		void visit(LocalVarDef localVarDef);
		void visit(ConstructorDef constructorDef);
		void visit(ExprNewObject exprNewObject);
		void visit(OpModReal opModReal);
		void visit(VisibilityPublic visibilityPublic);
		void visit(WParameter wParameter);
		void visit(StmtSet stmtSet);
		void visit(OpNot opNot);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(VisibilityPrivate visibilityPrivate);
		void visit(OpLessEq opLessEq);
		void visit(Arguments arguments);
		void visit(OpLess opLess);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(OpGreaterEq opGreaterEq);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(OpAssign opAssign) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(VisibilityProtected visibilityProtected) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(VisibilityDefault visibilityDefault) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(OpGreater opGreater) {}
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
		@Override public void visit(WParameters wParameters) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(StmtIncRefCount stmtIncRefCount) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(VisibilityPublicread visibilityPublicread) {}
		@Override public void visit(StmtDestroy stmtDestroy) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(StmtExitwhen stmtExitwhen) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(StmtReturn stmtReturn) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(StmtIf stmtIf) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(StmtLoop stmtLoop) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(StmtWhile stmtWhile) {}
		@Override public void visit(LocalVarDef localVarDef) {}
		@Override public void visit(ConstructorDef constructorDef) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(WParameter wParameter) {}
		@Override public void visit(StmtSet stmtSet) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(VisibilityPrivate visibilityPrivate) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
	}
}
