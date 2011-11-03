//generated by parseq
package de.peeeq.wurstscript.ast;

class CompilationUnitImpl extends CompilationUnit implements SortPosIntern {
 	private SortPos parent;
	public SortPos getParent() { return parent; }
	public void setParent(SortPos parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	protected void other_setParentToThis(TopLevelDeclaration t) {
		((SortPosIntern) t).setParent(this);
	}
	protected void other_clearParent(TopLevelDeclaration t) {
		((SortPosIntern) t).setParent(null);
	}
	@Override public <T> T match(WScope.Matcher<T> matcher) {
		return matcher.case_CompilationUnit(this);
	}
	@Override public void match(WScope.MatcherVoid matcher) {
		matcher.case_CompilationUnit(this);
	}

	@Override public <T> T match(PackageOrGlobal.Matcher<T> matcher) {
		return matcher.case_CompilationUnit(this);
	}
	@Override public void match(PackageOrGlobal.MatcherVoid matcher) {
		matcher.case_CompilationUnit(this);
	}

	@Override public void accept(PackageOrGlobal.Visitor v) {
		for (TopLevelDeclaration i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		for (TopLevelDeclaration i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		for (TopLevelDeclaration i : this ) {
			i.accept(v);
		}
		v.visit(this);
	}
	private boolean attr_attrScopeVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopeVariables_cache;
	public java.util.Map<String, VarDef> attrScopeVariables() {
		if (!attr_attrScopeVariables_isCached) {
			attr_attrScopeVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculate(this);
			attr_attrScopeVariables_isCached = true;
		}
		return attr_attrScopeVariables_cache;
	}
	private boolean attr_attrScopePackageVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopePackageVariables_cache;
	public java.util.Map<String, VarDef> attrScopePackageVariables() {
		if (!attr_attrScopePackageVariables_isCached) {
			attr_attrScopePackageVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculatePackage(this);
			attr_attrScopePackageVariables_isCached = true;
		}
		return attr_attrScopePackageVariables_cache;
	}
	private boolean attr_attrScopePublicVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopePublicVariables_cache;
	public java.util.Map<String, VarDef> attrScopePublicVariables() {
		if (!attr_attrScopePublicVariables_isCached) {
			attr_attrScopePublicVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculatePublic(this);
			attr_attrScopePublicVariables_isCached = true;
		}
		return attr_attrScopePublicVariables_cache;
	}
	private boolean attr_attrScopePublicReadVariables_isCached = false;
	private java.util.Map<String, VarDef> attr_attrScopePublicReadVariables_cache;
	public java.util.Map<String, VarDef> attrScopePublicReadVariables() {
		if (!attr_attrScopePublicReadVariables_isCached) {
			attr_attrScopePublicReadVariables_cache = de.peeeq.wurstscript.attributes.AttrScopeVariables.calculatePublicRead(this);
			attr_attrScopePublicReadVariables_isCached = true;
		}
		return attr_attrScopePublicReadVariables_cache;
	}
	private boolean attr_attrScopeFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrScopeFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrScopeFunctions() {
		if (!attr_attrScopeFunctions_isCached) {
			attr_attrScopeFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculate(this);
			attr_attrScopeFunctions_isCached = true;
		}
		return attr_attrScopeFunctions_cache;
	}
	private boolean attr_attrScopePackageFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrScopePackageFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrScopePackageFunctions() {
		if (!attr_attrScopePackageFunctions_isCached) {
			attr_attrScopePackageFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePackage(this);
			attr_attrScopePackageFunctions_isCached = true;
		}
		return attr_attrScopePackageFunctions_cache;
	}
	private boolean attr_attrScopePublicFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, FunctionDefinition> attr_attrScopePublicFunctions_cache;
	public com.google.common.collect.Multimap<String, FunctionDefinition> attrScopePublicFunctions() {
		if (!attr_attrScopePublicFunctions_isCached) {
			attr_attrScopePublicFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePublic(this);
			attr_attrScopePublicFunctions_isCached = true;
		}
		return attr_attrScopePublicFunctions_cache;
	}
	private boolean attr_attrPackageElements_isCached = false;
	private com.google.common.collect.Multimap<String, WEntity> attr_attrPackageElements_cache;
	public com.google.common.collect.Multimap<String, WEntity> attrPackageElements() {
		if (!attr_attrPackageElements_isCached) {
			attr_attrPackageElements_cache = de.peeeq.wurstscript.attributes.AttrPackageElements.calculate(this);
			attr_attrPackageElements_isCached = true;
		}
		return attr_attrPackageElements_cache;
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
