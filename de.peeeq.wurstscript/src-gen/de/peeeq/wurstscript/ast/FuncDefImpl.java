//generated by parseq
package de.peeeq.wurstscript.ast;

class FuncDefImpl implements FuncDef, AstElementIntern {
	FuncDefImpl(WPos source, Modifiers modifiers, FuncSignature signature, WStatements body) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)source).setParent(this);
		this.source = source;
		if (modifiers == null) throw new IllegalArgumentException();
		((AstElementIntern)modifiers).setParent(this);
		this.modifiers = modifiers;
		if (signature == null) throw new IllegalArgumentException();
		((AstElementIntern)signature).setParent(this);
		this.signature = signature;
		if (body == null) throw new IllegalArgumentException();
		((AstElementIntern)body).setParent(this);
		this.body = body;
	}

	private AstElement parent;
	public AstElement getParent() { return parent; }
	public void setParent(AstElement parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private WPos source;
	public void setSource(WPos source) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)this.source).setParent(null);
		((AstElementIntern)source).setParent(this);
		this.source = source;
	} 
	public WPos getSource() { return source; }

	private Modifiers modifiers;
	public void setModifiers(Modifiers modifiers) {
		if (modifiers == null) throw new IllegalArgumentException();
		((AstElementIntern)this.modifiers).setParent(null);
		((AstElementIntern)modifiers).setParent(this);
		this.modifiers = modifiers;
	} 
	public Modifiers getModifiers() { return modifiers; }

	private FuncSignature signature;
	public void setSignature(FuncSignature signature) {
		if (signature == null) throw new IllegalArgumentException();
		((AstElementIntern)this.signature).setParent(null);
		((AstElementIntern)signature).setParent(this);
		this.signature = signature;
	} 
	public FuncSignature getSignature() { return signature; }

	private WStatements body;
	public void setBody(WStatements body) {
		if (body == null) throw new IllegalArgumentException();
		((AstElementIntern)this.body).setParent(null);
		((AstElementIntern)body).setParent(this);
		this.body = body;
	} 
	public WStatements getBody() { return body; }

	public AstElement get(int i) {
		switch (i) {
			case 0: return source;
			case 1: return modifiers;
			case 2: return signature;
			case 3: return body;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 4;
	}
	public FuncDef copy() {
		return new FuncDefImpl(source.copy(), modifiers.copy(), signature.copy(), body.copy());
	}
	@Override public void accept(ModuleDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(AstElementWithModifier.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassOrModule.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(NameDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		signature.accept(v);
		body.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(WScope.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(WScope.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(FunctionDefinition.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(FunctionDefinition.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(TopLevelDeclaration.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(TopLevelDeclaration.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(AstElementWithModifier.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(AstElementWithModifier.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(WEntity.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(WEntity.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(JassToplevelDeclaration.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(JassToplevelDeclaration.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(ClassSlot.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(ClassSlot.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public <T> T match(ClassMember.Matcher<T> matcher) {
		return matcher.case_FuncDef(this);
	}
	@Override public void match(ClassMember.MatcherVoid matcher) {
		matcher.case_FuncDef(this);
	}

	@Override public String toString() {
		return "FuncDef(" + source + ", " +modifiers + ", " +signature + ", " +body+")";
	}
	private boolean attr_attrScopeNames_isCached = false;
	private java.util.Map<String, NameDef> attr_attrScopeNames_cache;
	public java.util.Map<String, NameDef> attrScopeNames() {
		if (!attr_attrScopeNames_isCached) {
			attr_attrScopeNames_cache = de.peeeq.wurstscript.attributes.AttrScopeNames.calculate(this);
			attr_attrScopeNames_isCached = true;
		}
		return attr_attrScopeNames_cache;
	}
	private boolean attr_attrScopePackageNames_isCached = false;
	private java.util.Map<String, NameDef> attr_attrScopePackageNames_cache;
	public java.util.Map<String, NameDef> attrScopePackageNames() {
		if (!attr_attrScopePackageNames_isCached) {
			attr_attrScopePackageNames_cache = de.peeeq.wurstscript.attributes.AttrScopeNames.calculatePackage(this);
			attr_attrScopePackageNames_isCached = true;
		}
		return attr_attrScopePackageNames_cache;
	}
	private boolean attr_attrScopePublicNames_isCached = false;
	private java.util.Map<String, NameDef> attr_attrScopePublicNames_cache;
	public java.util.Map<String, NameDef> attrScopePublicNames() {
		if (!attr_attrScopePublicNames_isCached) {
			attr_attrScopePublicNames_cache = de.peeeq.wurstscript.attributes.AttrScopeNames.calculatePublic(this);
			attr_attrScopePublicNames_isCached = true;
		}
		return attr_attrScopePublicNames_cache;
	}
	private boolean attr_attrScopePublicReadNamess_isCached = false;
	private java.util.Map<String, NameDef> attr_attrScopePublicReadNamess_cache;
	public java.util.Map<String, NameDef> attrScopePublicReadNamess() {
		if (!attr_attrScopePublicReadNamess_isCached) {
			attr_attrScopePublicReadNamess_cache = de.peeeq.wurstscript.attributes.AttrScopeNames.calculatePublicRead(this);
			attr_attrScopePublicReadNamess_isCached = true;
		}
		return attr_attrScopePublicReadNamess_cache;
	}
	private boolean attr_attrScopeFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attr_attrScopeFunctions_cache;
	public com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrScopeFunctions() {
		if (!attr_attrScopeFunctions_isCached) {
			attr_attrScopeFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculate(this);
			attr_attrScopeFunctions_isCached = true;
		}
		return attr_attrScopeFunctions_cache;
	}
	private boolean attr_attrScopePackageFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attr_attrScopePackageFunctions_cache;
	public com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrScopePackageFunctions() {
		if (!attr_attrScopePackageFunctions_isCached) {
			attr_attrScopePackageFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePackage(this);
			attr_attrScopePackageFunctions_isCached = true;
		}
		return attr_attrScopePackageFunctions_cache;
	}
	private boolean attr_attrScopePublicFunctions_isCached = false;
	private com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attr_attrScopePublicFunctions_cache;
	public com.google.common.collect.Multimap<String, de.peeeq.wurstscript.attributes.FuncDefInstance> attrScopePublicFunctions() {
		if (!attr_attrScopePublicFunctions_isCached) {
			attr_attrScopePublicFunctions_cache = de.peeeq.wurstscript.attributes.AttrScopeFunctions.calculatePublic(this);
			attr_attrScopePublicFunctions_isCached = true;
		}
		return attr_attrScopePublicFunctions_cache;
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
	private boolean attr_attrIsPublic_isCached = false;
	private boolean attr_attrIsPublic_cache;
	public boolean attrIsPublic() {
		if (!attr_attrIsPublic_isCached) {
			attr_attrIsPublic_cache = de.peeeq.wurstscript.attributes.ModifiersHelper.isPublic(this);
			attr_attrIsPublic_isCached = true;
		}
		return attr_attrIsPublic_cache;
	}
	private boolean attr_attrIsPublicRead_isCached = false;
	private boolean attr_attrIsPublicRead_cache;
	public boolean attrIsPublicRead() {
		if (!attr_attrIsPublicRead_isCached) {
			attr_attrIsPublicRead_cache = de.peeeq.wurstscript.attributes.ModifiersHelper.isPublicRead(this);
			attr_attrIsPublicRead_isCached = true;
		}
		return attr_attrIsPublicRead_cache;
	}
	private boolean attr_attrIsPrivate_isCached = false;
	private boolean attr_attrIsPrivate_cache;
	public boolean attrIsPrivate() {
		if (!attr_attrIsPrivate_isCached) {
			attr_attrIsPrivate_cache = de.peeeq.wurstscript.attributes.ModifiersHelper.isPrivate(this);
			attr_attrIsPrivate_isCached = true;
		}
		return attr_attrIsPrivate_cache;
	}
	private boolean attr_attrIsStatic_isCached = false;
	private boolean attr_attrIsStatic_cache;
	public boolean attrIsStatic() {
		if (!attr_attrIsStatic_isCached) {
			attr_attrIsStatic_cache = de.peeeq.wurstscript.attributes.ModifiersHelper.isStatic(this);
			attr_attrIsStatic_isCached = true;
		}
		return attr_attrIsStatic_cache;
	}
	private boolean attr_attrIsOverride_isCached = false;
	private boolean attr_attrIsOverride_cache;
	public boolean attrIsOverride() {
		if (!attr_attrIsOverride_isCached) {
			attr_attrIsOverride_cache = de.peeeq.wurstscript.attributes.ModifiersHelper.isOverride(this);
			attr_attrIsOverride_isCached = true;
		}
		return attr_attrIsOverride_cache;
	}
	private boolean attr_attrOverriddenFunctions_isCached = false;
	private java.util.Collection<de.peeeq.wurstscript.attributes.FuncDefInstance> attr_attrOverriddenFunctions_cache;
	public java.util.Collection<de.peeeq.wurstscript.attributes.FuncDefInstance> attrOverriddenFunctions() {
		if (!attr_attrOverriddenFunctions_isCached) {
			attr_attrOverriddenFunctions_cache = de.peeeq.wurstscript.attributes.OverriddenFunctions.calculate(this);
			attr_attrOverriddenFunctions_isCached = true;
		}
		return attr_attrOverriddenFunctions_cache;
	}
}
