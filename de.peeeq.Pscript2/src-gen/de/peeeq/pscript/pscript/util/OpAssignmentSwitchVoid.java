package de.peeeq.pscript.pscript.util;
import de.peeeq.pscript.pscript.*;
public abstract class OpAssignmentSwitchVoid {
	abstract public void caseOpMinusAssign(OpMinusAssign opMinusAssign);
	abstract public void caseOpPlusAssign(OpPlusAssign opPlusAssign);
	abstract public void caseOpAssign(OpAssign opAssign);
	public void doSwitch(OpAssignment opAssignment) {
if ( opAssignment == null) throw new IllegalArgumentException("Switch element must not be null.");
		if (opAssignment instanceof OpMinusAssign) { caseOpMinusAssign((OpMinusAssign)opAssignment); return; }
		if (opAssignment instanceof OpPlusAssign) { caseOpPlusAssign((OpPlusAssign)opAssignment); return; }
		if (opAssignment instanceof OpAssign) { caseOpAssign((OpAssign)opAssignment); return; }
		throw new Error("Switch did not match any case: " + opAssignment);
	}
}
