//generated by parseq
package de.peeeq.wurstscript.ast;

public abstract class CompilationUnit extends ParseqList<TopLevelDeclaration> implements AstElement, PackageOrGlobal{
	public CompilationUnit copy() {
		CompilationUnit result = new CompilationUnitImpl();
		for (TopLevelDeclaration elem : this) {
			result.add(elem.copy());
		}
		return result;
	}
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public interface Visitor {
		void visit(ExprNewObject exprNewObject);
		void visit(WPackage wPackage);
		void visit(OpDivInt opDivInt);
		void visit(NoTypeExpr noTypeExpr);
		void visit(NativeFunc nativeFunc);
		void visit(StmtIf stmtIf);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(ConstructorDef constructorDef);
		void visit(ModStatic modStatic);
		void visit(WParameters wParameters);
		void visit(ExprBoolVal exprBoolVal);
		void visit(ExprBinary exprBinary);
		void visit(ExprNull exprNull);
		void visit(ExprIntVal exprIntVal);
		void visit(OpMult opMult);
		void visit(ExprFuncRef exprFuncRef);
		void visit(OpAssign opAssign);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(OpLess opLess);
		void visit(OpOr opOr);
		void visit(OpNot opNot);
		void visit(ExprUnary exprUnary);
		void visit(WImports wImports);
		void visit(OpLessEq opLessEq);
		void visit(ExprThis exprThis);
		void visit(WImport wImport);
		void visit(WStatements wStatements);
		void visit(OpEquals opEquals);
		void visit(OpModReal opModReal);
		void visit(WEntities wEntities);
		void visit(WPos wPos);
		void visit(OpDivReal opDivReal);
		void visit(StmtReturn stmtReturn);
		void visit(OpAnd opAnd);
		void visit(StmtExitwhen stmtExitwhen);
		void visit(TypeExpr typeExpr);
		void visit(OpGreaterEq opGreaterEq);
		void visit(NativeType nativeType);
		void visit(VisibilityDefault visibilityDefault);
		void visit(StmtErr stmtErr);
		void visit(InitBlock initBlock);
		void visit(JassGlobalBlock jassGlobalBlock);
		void visit(NoExpr noExpr);
		void visit(ExprCast exprCast);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(Modifiers modifiers);
		void visit(Indexes indexes);
		void visit(StmtDestroy stmtDestroy);
		void visit(ArraySizes arraySizes);
		void visit(OpModInt opModInt);
		void visit(OpUnequals opUnequals);
		void visit(StmtWhile stmtWhile);
		void visit(FuncDef funcDef);
		void visit(LocalVarDef localVarDef);
		void visit(FuncSignature funcSignature);
		void visit(StmtLoop stmtLoop);
		void visit(ExprRealVal exprRealVal);
		void visit(StmtSet stmtSet);
		void visit(GlobalVarDef globalVarDef);
		void visit(VisibilityPublic visibilityPublic);
		void visit(OnDestroyDef onDestroyDef);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(ExprVarAccess exprVarAccess);
		void visit(ExprStringVal exprStringVal);
		void visit(VisibilityPublicread visibilityPublicread);
		void visit(WParameter wParameter);
		void visit(ExprMemberVar exprMemberVar);
		void visit(VisibilityProtected visibilityProtected);
		void visit(Arguments arguments);
		void visit(ClassSlots classSlots);
		void visit(OpGreater opGreater);
		void visit(VisibilityPrivate visibilityPrivate);
		void visit(OpPlus opPlus);
		void visit(CompilationUnit compilationUnit);
		void visit(ClassDef classDef);
		void visit(OpMinus opMinus);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(WPackage wPackage) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(NativeFunc nativeFunc) {}
		@Override public void visit(StmtIf stmtIf) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(ConstructorDef constructorDef) {}
		@Override public void visit(ModStatic modStatic) {}
		@Override public void visit(WParameters wParameters) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(OpAssign opAssign) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(WImports wImports) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(WImport wImport) {}
		@Override public void visit(WStatements wStatements) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(WEntities wEntities) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(StmtReturn stmtReturn) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(StmtExitwhen stmtExitwhen) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(NativeType nativeType) {}
		@Override public void visit(VisibilityDefault visibilityDefault) {}
		@Override public void visit(StmtErr stmtErr) {}
		@Override public void visit(InitBlock initBlock) {}
		@Override public void visit(JassGlobalBlock jassGlobalBlock) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(Modifiers modifiers) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(StmtDestroy stmtDestroy) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(StmtWhile stmtWhile) {}
		@Override public void visit(FuncDef funcDef) {}
		@Override public void visit(LocalVarDef localVarDef) {}
		@Override public void visit(FuncSignature funcSignature) {}
		@Override public void visit(StmtLoop stmtLoop) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(StmtSet stmtSet) {}
		@Override public void visit(GlobalVarDef globalVarDef) {}
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(OnDestroyDef onDestroyDef) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(VisibilityPublicread visibilityPublicread) {}
		@Override public void visit(WParameter wParameter) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(VisibilityProtected visibilityProtected) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(ClassSlots classSlots) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(VisibilityPrivate visibilityPrivate) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(CompilationUnit compilationUnit) {}
		@Override public void visit(ClassDef classDef) {}
		@Override public void visit(OpMinus opMinus) {}
	}
}
