package de.peeeq.pscript.pscript.util;
import de.peeeq.pscript.pscript.*;
public abstract class EntitySwitchVoid {
	abstract public void caseTypeDef(TypeDef typeDef);
	abstract public void caseInitBlock(InitBlock initBlock);
	abstract public void caseVarDef(VarDef varDef);
	abstract public void caseFuncDef(FuncDef funcDef);
	public void doSwitch(Entity entity) {
if ( entity == null) throw new IllegalArgumentException("Switch element must not be null.");
		if (entity instanceof TypeDef) { caseTypeDef((TypeDef)entity); return; }
		if (entity instanceof InitBlock) { caseInitBlock((InitBlock)entity); return; }
		if (entity instanceof VarDef) { caseVarDef((VarDef)entity); return; }
		if (entity instanceof FuncDef) { caseFuncDef((FuncDef)entity); return; }
		throw new Error("Switch did not match any case: " + entity);
	}
}

