//generated by parseq
package de.peeeq.wurstscript.ast;

class JassGlobalBlockImpl extends JassGlobalBlock implements SortPosIntern {
 	private SortPos parent;
	public SortPos getParent() { return parent; }
	public void setParent(SortPos parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	protected void other_setParentToThis(GlobalVarDef t) {
		((SortPosIntern) t).setParent(this);
	}
	protected void other_clearParent(GlobalVarDef t) {
		((SortPosIntern) t).setParent(null);
	}
	@Override public <T> T match(TopLevelDeclaration.Matcher<T> matcher) {
		return matcher.case_JassGlobalBlock(this);
	}
	@Override public void match(TopLevelDeclaration.MatcherVoid matcher) {
		matcher.case_JassGlobalBlock(this);
	}

	@Override public <T> T match(JassToplevelDeclaration.Matcher<T> matcher) {
		return matcher.case_JassGlobalBlock(this);
	}
	@Override public void match(JassToplevelDeclaration.MatcherVoid matcher) {
		matcher.case_JassGlobalBlock(this);
	}

	@Override public void accept(CompilationUnit.Visitor v) {
		for (GlobalVarDef i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(JassGlobalBlock.Visitor v) {
		for (GlobalVarDef i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		for (GlobalVarDef i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		for (GlobalVarDef i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		for (GlobalVarDef i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		for (GlobalVarDef i : this ) {
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
}
