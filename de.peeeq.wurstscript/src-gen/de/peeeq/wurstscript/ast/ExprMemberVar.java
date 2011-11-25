//generated by parseq
package de.peeeq.wurstscript.ast;

public interface ExprMemberVar extends AstElement, ExprAssignable, NameRef, Expr {
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	void setLeft(Expr left);
	Expr getLeft();
	void setVarName(String varName);
	String getVarName();
	ExprMemberVar copy();
	public abstract void accept(JassGlobalBlock.Visitor v);
	public abstract void accept(VarDef.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(InitBlock.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(StmtSet.Visitor v);
	public abstract void accept(FuncSignature.Visitor v);
	public abstract void accept(OnDestroyDef.Visitor v);
	public abstract void accept(StmtCall.Visitor v);
	public abstract void accept(StmtLoop.Visitor v);
	public abstract void accept(TypeExpr.Visitor v);
	public abstract void accept(NativeType.Visitor v);
	public abstract void accept(OptExpr.Visitor v);
	public abstract void accept(ExprVarArrayAccess.Visitor v);
	public abstract void accept(ExprMemberVar.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(StmtDestroy.Visitor v);
	public abstract void accept(Indexes.Visitor v);
	public abstract void accept(ExprMemberArrayVar.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(NameRef.Visitor v);
	public abstract void accept(ExprAtomic.Visitor v);
	public abstract void accept(ExprUnary.Visitor v);
	public abstract void accept(AstElementWithModifier.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(WParameter.Visitor v);
	public abstract void accept(Expr.Visitor v);
	public abstract void accept(ModuleDef.Visitor v);
	public abstract void accept(ExprBinary.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(WStatements.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(ExprMemberMethod.Visitor v);
	public abstract void accept(FuncRef.Visitor v);
	public abstract void accept(ClassOrModule.Visitor v);
	public abstract void accept(Arguments.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(StmtIf.Visitor v);
	public abstract void accept(ExprNewObject.Visitor v);
	public abstract void accept(WParameters.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(NameDef.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(LocalVarDef.Visitor v);
	public abstract void accept(NativeFunc.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(ExprAssignable.Visitor v);
	public abstract void accept(ExprFunctionCall.Visitor v);
	public abstract void accept(OptTypeExpr.Visitor v);
	public abstract void accept(GlobalVarDef.Visitor v);
	public abstract void accept(StmtWhile.Visitor v);
	public abstract void accept(ExprCast.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(TypeRef.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(WStatement.Visitor v);
	public abstract void accept(StmtReturn.Visitor v);
	public abstract void accept(ArraySizes.Visitor v);
	public abstract void accept(StmtExitwhen.Visitor v);
	public interface Visitor {
		void visit(ExprVarAccess exprVarAccess);
		void visit(OpMult opMult);
		void visit(OpAnd opAnd);
		void visit(WPos wPos);
		void visit(ExprBinary exprBinary);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(OpLess opLess);
		void visit(ExprIntVal exprIntVal);
		void visit(OpEquals opEquals);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(ExprNull exprNull);
		void visit(OpMinus opMinus);
		void visit(OpPlus opPlus);
		void visit(ExprStringVal exprStringVal);
		void visit(ExprUnary exprUnary);
		void visit(ExprCast exprCast);
		void visit(OpDivInt opDivInt);
		void visit(OpNot opNot);
		void visit(TypeExpr typeExpr);
		void visit(OpDivReal opDivReal);
		void visit(Arguments arguments);
		void visit(ExprFuncRef exprFuncRef);
		void visit(OpModInt opModInt);
		void visit(OpModReal opModReal);
		void visit(OpOr opOr);
		void visit(OpUnequals opUnequals);
		void visit(OpGreater opGreater);
		void visit(ExprNewObject exprNewObject);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(OpLessEq opLessEq);
		void visit(ExprThis exprThis);
		void visit(ExprRealVal exprRealVal);
		void visit(ArraySizes arraySizes);
		void visit(ExprBoolVal exprBoolVal);
		void visit(ExprMemberVar exprMemberVar);
		void visit(OpGreaterEq opGreaterEq);
		void visit(Indexes indexes);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(Indexes indexes) {}
	}
}
