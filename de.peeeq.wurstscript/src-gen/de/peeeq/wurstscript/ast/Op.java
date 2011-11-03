//generated by parseq
package de.peeeq.wurstscript.ast;

public interface Op extends SortPos{
	SortPos getParent();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_OpModInt(OpModInt opModInt);
		T case_OpDivReal(OpDivReal opDivReal);
		T case_OpAnd(OpAnd opAnd);
		T case_OpMinus(OpMinus opMinus);
		T case_OpModReal(OpModReal opModReal);
		T case_OpOr(OpOr opOr);
		T case_OpMult(OpMult opMult);
		T case_OpPlus(OpPlus opPlus);
		T case_OpNot(OpNot opNot);
		T case_OpLessEq(OpLessEq opLessEq);
		T case_OpLess(OpLess opLess);
		T case_OpGreater(OpGreater opGreater);
		T case_OpDivInt(OpDivInt opDivInt);
		T case_OpUnequals(OpUnequals opUnequals);
		T case_OpEquals(OpEquals opEquals);
		T case_OpGreaterEq(OpGreaterEq opGreaterEq);
	}

	public interface MatcherVoid {
		void case_OpModInt(OpModInt opModInt);
		void case_OpDivReal(OpDivReal opDivReal);
		void case_OpAnd(OpAnd opAnd);
		void case_OpMinus(OpMinus opMinus);
		void case_OpModReal(OpModReal opModReal);
		void case_OpOr(OpOr opOr);
		void case_OpMult(OpMult opMult);
		void case_OpPlus(OpPlus opPlus);
		void case_OpNot(OpNot opNot);
		void case_OpLessEq(OpLessEq opLessEq);
		void case_OpLess(OpLess opLess);
		void case_OpGreater(OpGreater opGreater);
		void case_OpDivInt(OpDivInt opDivInt);
		void case_OpUnequals(OpUnequals opUnequals);
		void case_OpEquals(OpEquals opEquals);
		void case_OpGreaterEq(OpGreaterEq opGreaterEq);
	}

	Op copy();
	public abstract void accept(Op.Visitor v);
	public interface Visitor {
		void visit(OpModInt opModInt);
		void visit(OpDivReal opDivReal);
		void visit(OpAnd opAnd);
		void visit(OpMinus opMinus);
		void visit(OpModReal opModReal);
		void visit(OpOr opOr);
		void visit(OpMult opMult);
		void visit(OpPlus opPlus);
		void visit(OpNot opNot);
		void visit(OpLessEq opLessEq);
		void visit(OpLess opLess);
		void visit(OpGreater opGreater);
		void visit(OpDivInt opDivInt);
		void visit(OpUnequals opUnequals);
		void visit(OpGreaterEq opGreaterEq);
		void visit(OpEquals opEquals);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(OpLessEq opLessEq) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(OpEquals opEquals) {}
	}
}
