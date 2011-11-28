//generated by parseq
package de.peeeq.wurstscript.ast;

class WEntitiesImpl extends WEntities implements AstElementIntern {
 	private AstElement parent;
	public AstElement getParent() { return parent; }
	public void setParent(AstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	protected void other_setParentToThis(WEntity t) {
		((AstElementIntern) t).setParent(this);
	}
	protected void other_clearParent(WEntity t) {
		((AstElementIntern) t).setParent(null);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		for (WEntity i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		for (WEntity i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		for (WEntity i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		for (WEntity i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		for (WEntity i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		for (WEntity i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	private boolean attr_attrNearestPackage_isCached = false;
	private PackageOrGlobal attr_attrNearestPackage_cache;
	public PackageOrGlobal attrNearestPackage() {
		if (!attr_attrNearestPackage_isCached) {
			attr_attrNearestPackage_cache = de.peeeq.wurstscript.attributes.AttrNearestPackage.calculate(this);
			attr_attrNearestPackage_isCached = true;
		}
		return attr_attrNearestPackage_cache;
	}
	private boolean attr_attrNearestFuncDef_isCached = false;
	private FuncDef attr_attrNearestFuncDef_cache;
	public FuncDef attrNearestFuncDef() {
		if (!attr_attrNearestFuncDef_isCached) {
			attr_attrNearestFuncDef_cache = de.peeeq.wurstscript.attributes.AttrNearestFuncDef.calculate(this);
			attr_attrNearestFuncDef_isCached = true;
		}
		return attr_attrNearestFuncDef_cache;
	}
	private boolean attr_attrNearestClassDef_isCached = false;
	private ClassDef attr_attrNearestClassDef_cache;
	public ClassDef attrNearestClassDef() {
		if (!attr_attrNearestClassDef_isCached) {
			attr_attrNearestClassDef_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.calculate(this);
			attr_attrNearestClassDef_isCached = true;
		}
		return attr_attrNearestClassDef_cache;
	}
	private boolean attr_attrNearestClassOrModule_isCached = false;
	private ClassOrModule attr_attrNearestClassOrModule_cache;
	public ClassOrModule attrNearestClassOrModule() {
		if (!attr_attrNearestClassOrModule_isCached) {
			attr_attrNearestClassOrModule_cache = de.peeeq.wurstscript.attributes.AttrNearestClassDef.nearestClassOrModule(this);
			attr_attrNearestClassOrModule_isCached = true;
		}
		return attr_attrNearestClassOrModule_cache;
	}
	@Override public String toString() {
		String result =  "WEntities(";
		boolean first = true;
		for (WEntity i : this ) {
			if (!first) { result +=", "; }
			if (result.length() > 1000) { result +="..."; break; }
			result += i;
			first = false;
		}
		result +=  ")";
		return result;
	}
}
