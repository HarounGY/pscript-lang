//generated by parseq
package de.peeeq.wurstscript.ast;

public interface VarDef extends AstElement{
	AstElement getParent();
	void setName(String name);
	String getName();
	void setSource(WPos source);
	WPos getSource();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_WParameter(WParameter wParameter);
		T case_GlobalVarDef(GlobalVarDef globalVarDef);
		T case_LocalVarDef(LocalVarDef localVarDef);
	}

	public interface MatcherVoid {
		void case_WParameter(WParameter wParameter);
		void case_GlobalVarDef(GlobalVarDef globalVarDef);
		void case_LocalVarDef(LocalVarDef localVarDef);
	}

	VarDef copy();
	public abstract void accept(VarDef.Visitor v);
	public interface Visitor {
		void visit(ExprNewObject exprNewObject);
		void visit(OpDivInt opDivInt);
		void visit(NoTypeExpr noTypeExpr);
		void visit(ExprFunctionCall exprFunctionCall);
		void visit(ExprBinary exprBinary);
		void visit(ExprBoolVal exprBoolVal);
		void visit(ExprNull exprNull);
		void visit(ExprIntVal exprIntVal);
		void visit(ExprFuncRef exprFuncRef);
		void visit(OpMult opMult);
		void visit(ExprVarArrayAccess exprVarArrayAccess);
		void visit(OpLess opLess);
		void visit(OpOr opOr);
		void visit(OpNot opNot);
		void visit(ExprUnary exprUnary);
		void visit(OpLessEq opLessEq);
		void visit(ExprThis exprThis);
		void visit(Indexes indexes);
		void visit(Arguments arguments);
		void visit(OpEquals opEquals);
		void visit(OpModReal opModReal);
		void visit(ArraySizes arraySizes);
		void visit(OpDivReal opDivReal);
		void visit(OpAnd opAnd);
		void visit(TypeExpr typeExpr);
		void visit(OpGreaterEq opGreaterEq);
		void visit(NoExpr noExpr);
		void visit(ExprCast exprCast);
		void visit(ExprMemberMethod exprMemberMethod);
		void visit(OpUnequals opUnequals);
		void visit(OpModInt opModInt);
		void visit(LocalVarDef localVarDef);
		void visit(ExprRealVal exprRealVal);
		void visit(GlobalVarDef globalVarDef);
		void visit(VisibilityPrivate visibilityPrivate);
		void visit(ExprMemberArrayVar exprMemberArrayVar);
		void visit(ExprVarAccess exprVarAccess);
		void visit(ExprStringVal exprStringVal);
		void visit(VisibilityProtected visibilityProtected);
		void visit(WParameter wParameter);
		void visit(ExprMemberVar exprMemberVar);
		void visit(VisibilityDefault visibilityDefault);
		void visit(VisibilityPublic visibilityPublic);
		void visit(OpGreater opGreater);
		void visit(OpPlus opPlus);
		void visit(VisibilityPublicread visibilityPublicread);
		void visit(WPos wPos);
		void visit(OpMinus opMinus);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(ExprNewObject exprNewObject) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(NoTypeExpr noTypeExpr) {}
		@Override public void visit(ExprFunctionCall exprFunctionCall) {}
		@Override public void visit(ExprBinary exprBinary) {}
		@Override public void visit(ExprBoolVal exprBoolVal) {}
		@Override public void visit(ExprNull exprNull) {}
		@Override public void visit(ExprIntVal exprIntVal) {}
		@Override public void visit(ExprFuncRef exprFuncRef) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(ExprVarArrayAccess exprVarArrayAccess) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(ExprUnary exprUnary) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(ExprThis exprThis) {}
		@Override public void visit(Indexes indexes) {}
		@Override public void visit(Arguments arguments) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(ArraySizes arraySizes) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(TypeExpr typeExpr) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(NoExpr noExpr) {}
		@Override public void visit(ExprCast exprCast) {}
		@Override public void visit(ExprMemberMethod exprMemberMethod) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(LocalVarDef localVarDef) {}
		@Override public void visit(ExprRealVal exprRealVal) {}
		@Override public void visit(GlobalVarDef globalVarDef) {}
		@Override public void visit(VisibilityPrivate visibilityPrivate) {}
		@Override public void visit(ExprMemberArrayVar exprMemberArrayVar) {}
		@Override public void visit(ExprVarAccess exprVarAccess) {}
		@Override public void visit(ExprStringVal exprStringVal) {}
		@Override public void visit(VisibilityProtected visibilityProtected) {}
		@Override public void visit(WParameter wParameter) {}
		@Override public void visit(ExprMemberVar exprMemberVar) {}
		@Override public void visit(VisibilityDefault visibilityDefault) {}
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(VisibilityPublicread visibilityPublicread) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(OpMinus opMinus) {}
	}
	public abstract de.peeeq.wurstscript.types.PscriptType attrTyp();
}
