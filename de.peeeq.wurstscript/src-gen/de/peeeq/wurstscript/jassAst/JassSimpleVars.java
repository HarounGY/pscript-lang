//generated by parseq
package de.peeeq.wurstscript.jassAst;

public abstract class JassSimpleVars extends ParseqList<JassSimpleVar> implements JassAstElement{
	public JassSimpleVars copy() {
		JassSimpleVars result = new JassSimpleVarsImpl();
		for (JassSimpleVar elem : this) {
			result.add(elem.copy());
		}
		return result;
	}
	public abstract void accept(JassFunction.Visitor v);
	public abstract void accept(JassSimpleVars.Visitor v);
	public abstract void accept(JassProg.Visitor v);
	public abstract void accept(JassFunctions.Visitor v);
	public interface Visitor {
		void visit(JassSimpleVar jassSimpleVar);
		void visit(JassSimpleVars jassSimpleVars);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(JassSimpleVar jassSimpleVar) {}
		@Override public void visit(JassSimpleVars jassSimpleVars) {}
	}
}
