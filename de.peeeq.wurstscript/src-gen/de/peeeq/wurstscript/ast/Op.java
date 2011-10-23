//generated by parseq
package de.peeeq.wurstscript.ast;

public interface Op extends SortPos{
	SortPos getParent();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_OpModInt(OpModInt opModInt);
		T case_OpUnequals(OpUnequals opUnequals);
		T case_OpAnd(OpAnd opAnd);
		T case_OpDivReal(OpDivReal opDivReal);
		T case_OpDivInt(OpDivInt opDivInt);
		T case_OpEquals(OpEquals opEquals);
		T case_OpModReal(OpModReal opModReal);
		T case_OpMult(OpMult opMult);
		T case_OpOr(OpOr opOr);
		T case_OpGreaterEq(OpGreaterEq opGreaterEq);
		T case_OpGreater(OpGreater opGreater);
		T case_OpMinus(OpMinus opMinus);
		T case_OpNot(OpNot opNot);
		T case_OpLess(OpLess opLess);
		T case_OpLessEq(OpLessEq opLessEq);
		T case_OpPlus(OpPlus opPlus);
	}

	public interface MatcherVoid {
		void case_OpModInt(OpModInt opModInt);
		void case_OpUnequals(OpUnequals opUnequals);
		void case_OpAnd(OpAnd opAnd);
		void case_OpDivReal(OpDivReal opDivReal);
		void case_OpDivInt(OpDivInt opDivInt);
		void case_OpEquals(OpEquals opEquals);
		void case_OpModReal(OpModReal opModReal);
		void case_OpMult(OpMult opMult);
		void case_OpOr(OpOr opOr);
		void case_OpGreaterEq(OpGreaterEq opGreaterEq);
		void case_OpGreater(OpGreater opGreater);
		void case_OpMinus(OpMinus opMinus);
		void case_OpNot(OpNot opNot);
		void case_OpLess(OpLess opLess);
		void case_OpLessEq(OpLessEq opLessEq);
		void case_OpPlus(OpPlus opPlus);
	}

	public abstract void accept(Op.Visitor v);
	public interface Visitor {
		void visit(OpModInt opModInt);
		void visit(OpUnequals opUnequals);
		void visit(OpAnd opAnd);
		void visit(OpDivReal opDivReal);
		void visit(OpDivInt opDivInt);
		void visit(OpEquals opEquals);
		void visit(OpModReal opModReal);
		void visit(OpMult opMult);
		void visit(OpGreaterEq opGreaterEq);
		void visit(OpOr opOr);
		void visit(OpGreater opGreater);
		void visit(OpMinus opMinus);
		void visit(OpNot opNot);
		void visit(OpLess opLess);
		void visit(OpPlus opPlus);
		void visit(OpLessEq opLessEq);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(OpModInt opModInt) {}
		@Override public void visit(OpUnequals opUnequals) {}
		@Override public void visit(OpAnd opAnd) {}
		@Override public void visit(OpDivReal opDivReal) {}
		@Override public void visit(OpDivInt opDivInt) {}
		@Override public void visit(OpEquals opEquals) {}
		@Override public void visit(OpModReal opModReal) {}
		@Override public void visit(OpMult opMult) {}
		@Override public void visit(OpGreaterEq opGreaterEq) {}
		@Override public void visit(OpOr opOr) {}
		@Override public void visit(OpGreater opGreater) {}
		@Override public void visit(OpMinus opMinus) {}
		@Override public void visit(OpNot opNot) {}
		@Override public void visit(OpLess opLess) {}
		@Override public void visit(OpPlus opPlus) {}
		@Override public void visit(OpLessEq opLessEq) {}
	}
}
