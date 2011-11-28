//generated by parseq
package de.peeeq.wurstscript.jassAst;

public interface JassOpNot extends JassAstElement, JassOpUnary {
	JassAstElement getParent();
	JassOpNot copy();
	public abstract void accept(JassStmtLoop.Visitor v);
	public abstract void accept(JassStatements.Visitor v);
	public abstract void accept(JassExprAtomic.Visitor v);
	public abstract void accept(JassExpr.Visitor v);
	public abstract void accept(JassExprBinary.Visitor v);
	public abstract void accept(JassOpNot.Visitor v);
	public abstract void accept(JassStmtSet.Visitor v);
	public abstract void accept(JassExprFunctionCall.Visitor v);
	public abstract void accept(JassProg.Visitor v);
	public abstract void accept(JassExprUnary.Visitor v);
	public abstract void accept(JassExprlist.Visitor v);
	public abstract void accept(JassFunction.Visitor v);
	public abstract void accept(JassStmtSetArray.Visitor v);
	public abstract void accept(JassExprVarArrayAccess.Visitor v);
	public abstract void accept(JassStatement.Visitor v);
	public abstract void accept(JassFunctions.Visitor v);
	public abstract void accept(JassStmtReturn.Visitor v);
	public abstract void accept(JassStmtIf.Visitor v);
	public abstract void accept(JassOp.Visitor v);
	public abstract void accept(JassStmtExitwhen.Visitor v);
	public abstract void accept(JassStmtCall.Visitor v);
	public abstract void accept(JassOpUnary.Visitor v);
	public interface Visitor {
		void visit(JassOpNot jassOpNot);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(JassOpNot jassOpNot) {}
	}
}
