//generated by parseq
package de.peeeq.wurstscript.jassAst;

public interface JassOpUnary extends JassAstElement, JassOp{
	JassAstElement getParent();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_JassOpNot(JassOpNot jassOpNot);
		T case_JassOpMinus(JassOpMinus jassOpMinus);
	}

	public interface MatcherVoid {
		void case_JassOpNot(JassOpNot jassOpNot);
		void case_JassOpMinus(JassOpMinus jassOpMinus);
	}

	JassOpUnary copy();
	public abstract void accept(JassStmtIf.Visitor v);
	public abstract void accept(JassStmtExitwhen.Visitor v);
	public abstract void accept(JassStmtReturn.Visitor v);
	public abstract void accept(JassExprVarArrayAccess.Visitor v);
	public abstract void accept(JassProg.Visitor v);
	public abstract void accept(JassStatement.Visitor v);
	public abstract void accept(JassStatements.Visitor v);
	public abstract void accept(JassExprBinary.Visitor v);
	public abstract void accept(JassStmtLoop.Visitor v);
	public abstract void accept(JassExprlist.Visitor v);
	public abstract void accept(JassExpr.Visitor v);
	public abstract void accept(JassExprAtomic.Visitor v);
	public abstract void accept(JassStmtCall.Visitor v);
	public abstract void accept(JassExprUnary.Visitor v);
	public abstract void accept(JassExprFunctionCall.Visitor v);
	public abstract void accept(JassStmtSet.Visitor v);
	public abstract void accept(JassFunctions.Visitor v);
	public abstract void accept(JassStmtSetArray.Visitor v);
	public abstract void accept(JassOp.Visitor v);
	public abstract void accept(JassFunction.Visitor v);
	public abstract void accept(JassOpUnary.Visitor v);
	public interface Visitor {
		void visit(JassOpNot jassOpNot);
		void visit(JassOpMinus jassOpMinus);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(JassOpNot jassOpNot) {}
		@Override public void visit(JassOpMinus jassOpMinus) {}
	}
}
