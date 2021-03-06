package de.peeeq.wurstscript.attributes;

import de.peeeq.wurstscript.ast.ModuleDef;
import de.peeeq.wurstscript.ast.ModuleInstanciation;

public class AttrModuleInstanciations {

	public static ModuleDef getModuleOrigin(ModuleInstanciation mi) {
		return NameResolution.searchTypedNameGetOne(ModuleDef.class, mi.getName(), mi.getParent());
	}

}
