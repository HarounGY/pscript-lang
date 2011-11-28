//generated by parseq
package de.peeeq.wurstscript.jassAst;

class JassStmtCallImpl implements JassStmtCall, JassAstElementIntern {
	JassStmtCallImpl(String functionName, JassExprlist arguments) {
		if (functionName == null) throw new IllegalArgumentException();
		this.functionName = functionName;
		if (arguments == null) throw new IllegalArgumentException();
		((JassAstElementIntern)arguments).setParent(this);
		this.arguments = arguments;
	}

	private JassAstElement parent;
	public JassAstElement getParent() { return parent; }
	public void setParent(JassAstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private String functionName;
	public void setFunctionName(String functionName) {
		if (functionName == null) throw new IllegalArgumentException();
		this.functionName = functionName;
	} 
	public String getFunctionName() { return functionName; }

	private JassExprlist arguments;
	public void setArguments(JassExprlist arguments) {
		if (arguments == null) throw new IllegalArgumentException();
		((JassAstElementIntern)this.arguments).setParent(null);
		((JassAstElementIntern)arguments).setParent(this);
		this.arguments = arguments;
	} 
	public JassExprlist getArguments() { return arguments; }

	public JassAstElement get(int i) {
		switch (i) {
			case 0: return arguments;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 1;
	}
	@Override public JassStmtCall copy() {
		return new JassStmtCallImpl(functionName, (JassExprlist) arguments.copy());
	}
	@Override public void accept(JassStmtLoop.Visitor v) {
		arguments.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStatements.Visitor v) {
		arguments.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassProg.Visitor v) {
		arguments.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunction.Visitor v) {
		arguments.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStatement.Visitor v) {
		arguments.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassFunctions.Visitor v) {
		arguments.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtIf.Visitor v) {
		arguments.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassStmtCall.Visitor v) {
		arguments.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(JassStatement.Matcher<T> matcher) {
		return matcher.case_JassStmtCall(this);
	}
	@Override public void match(JassStatement.MatcherVoid matcher) {
		matcher.case_JassStmtCall(this);
	}

	@Override public String toString() {
		return "JassStmtCall(" + functionName + ", " +arguments+")";
	}
}
