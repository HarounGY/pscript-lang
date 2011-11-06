//generated by parseq
package de.peeeq.wurstscript.jassAst;

class JassExprUnaryImpl implements JassExprUnary, JassAstElementIntern {
	JassExprUnaryImpl(JassOpUnary op, JassExpr right) {
		if (op == null) throw new IllegalArgumentException();
		((JassAstElementIntern)op).setParent(this);
		this.op = op;
		if (right == null) throw new IllegalArgumentException();
		((JassAstElementIntern)right).setParent(this);
		this.right = right;
	}

	private JassAstElement parent;
	public JassAstElement getParent() { return parent; }
	public void setParent(JassAstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private JassOpUnary op;
	public void setOp(JassOpUnary op) {
		if (op == null) throw new IllegalArgumentException();
		((JassAstElementIntern)this.op).setParent(null);
		((JassAstElementIntern)op).setParent(this);
		this.op = op;
	} 
	public JassOpUnary getOp() { return op; }

	private JassExpr right;
	public void setRight(JassExpr right) {
		if (right == null) throw new IllegalArgumentException();
		((JassAstElementIntern)this.right).setParent(null);
		((JassAstElementIntern)right).setParent(this);
		this.right = right;
	} 
	public JassExpr getRight() { return right; }

	public JassAstElement get(int i) {
		switch (i) {
			case 0: return op;
			case 1: return right;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 2;
	}
	public JassExprUnary copy() {
		return new JassExprUnaryImpl(op.copy(), right.copy());
	}
	@Override public void accept(JassStmtIf.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtExitwhen.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtReturn.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassExprVarArrayAccess.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassProg.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStatement.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStatements.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassExprBinary.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtLoop.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassExprlist.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassExpr.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassExprAtomic.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtCall.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassExprUnary.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassExprFunctionCall.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtSet.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunctions.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtSetArray.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunction.Visitor v) {
		op.accept(v);
		right.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(JassExpr.Matcher<T> matcher) {
		return matcher.case_JassExprUnary(this);
	}
	@Override public void match(JassExpr.MatcherVoid matcher) {
		matcher.case_JassExprUnary(this);
	}

	@Override public String toString() {
		return "JassExprUnary(" + op + ", " +right+")";
	}
}
