//generated by parseq
package de.peeeq.wurstscript.jassAst;

class JassStmtReturnVoidImpl implements JassStmtReturnVoid, JassAstElementIntern {
	JassStmtReturnVoidImpl() {
	}

	private JassAstElement parent;
	public JassAstElement getParent() { return parent; }
	public void setParent(JassAstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	public JassAstElement get(int i) {
		switch (i) {
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 0;
	}
	public JassStmtReturnVoid copy() {
		return new JassStmtReturnVoidImpl();
	}
	@Override public void accept(JassStmtLoop.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStatements.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStmtReturnVoid.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassProg.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassFunction.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStatement.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassFunctions.Visitor v) {
		v.visit(this);
	}
	@Override public void accept(JassStmtIf.Visitor v) {
		v.visit(this);
	}
	@Override public <T> T match(JassStatement.Matcher<T> matcher) {
		return matcher.case_JassStmtReturnVoid(this);
	}
	@Override public void match(JassStatement.MatcherVoid matcher) {
		matcher.case_JassStmtReturnVoid(this);
	}

	@Override public String toString() {
		return "JassStmtReturnVoid";
	}
}
