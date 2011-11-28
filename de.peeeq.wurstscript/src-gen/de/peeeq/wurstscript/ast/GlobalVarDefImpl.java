//generated by parseq
package de.peeeq.wurstscript.ast;

class GlobalVarDefImpl implements GlobalVarDef, AstElementIntern {
	GlobalVarDefImpl(WPos source, Modifiers modifiers, boolean isConstant, OptTypeExpr typ, String name, OptExpr initialExpr) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)source).setParent(this);
		this.source = source;
		if (modifiers == null) throw new IllegalArgumentException();
		((AstElementIntern)modifiers).setParent(this);
		this.modifiers = modifiers;
		this.isConstant = isConstant;
		if (typ == null) throw new IllegalArgumentException();
		((AstElementIntern)typ).setParent(this);
		this.typ = typ;
		if (name == null) throw new IllegalArgumentException();
		this.name = name;
		if (initialExpr == null) throw new IllegalArgumentException();
		((AstElementIntern)initialExpr).setParent(this);
		this.initialExpr = initialExpr;
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

	private boolean isConstant;
	public void setIsConstant(boolean isConstant) {
		this.isConstant = isConstant;
	} 
	public boolean getIsConstant() { return isConstant; }

	private OptTypeExpr typ;
	public void setTyp(OptTypeExpr typ) {
		if (typ == null) throw new IllegalArgumentException();
		((AstElementIntern)this.typ).setParent(null);
		((AstElementIntern)typ).setParent(this);
		this.typ = typ;
	} 
	public OptTypeExpr getTyp() { return typ; }

	private String name;
	public void setName(String name) {
		if (name == null) throw new IllegalArgumentException();
		this.name = name;
	} 
	public String getName() { return name; }

	private OptExpr initialExpr;
	public void setInitialExpr(OptExpr initialExpr) {
		if (initialExpr == null) throw new IllegalArgumentException();
		((AstElementIntern)this.initialExpr).setParent(null);
		((AstElementIntern)initialExpr).setParent(this);
		this.initialExpr = initialExpr;
	} 
	public OptExpr getInitialExpr() { return initialExpr; }

	public AstElement get(int i) {
		switch (i) {
			case 0: return source;
			case 1: return modifiers;
			case 2: return typ;
			case 3: return initialExpr;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 4;
	}
	@Override public GlobalVarDef copy() {
		return new GlobalVarDefImpl((WPos) source.copy(), (Modifiers) modifiers.copy(), isConstant, (OptTypeExpr) typ.copy(), name, (OptExpr) initialExpr.copy());
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(NameDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(GlobalVarDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ModuleDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(AstElementWithModifier.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(VarDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassOrModule.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassGlobalBlock.Visitor v) {
		source.accept(v);
		modifiers.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(AstElementWithModifier.Matcher<T> matcher) {
		return matcher.case_GlobalVarDef(this);
	}
	@Override public void match(AstElementWithModifier.MatcherVoid matcher) {
		matcher.case_GlobalVarDef(this);
	}

	@Override public <T> T match(VarDef.Matcher<T> matcher) {
		return matcher.case_GlobalVarDef(this);
	}
	@Override public void match(VarDef.MatcherVoid matcher) {
		matcher.case_GlobalVarDef(this);
	}

	@Override public <T> T match(ClassSlot.Matcher<T> matcher) {
		return matcher.case_GlobalVarDef(this);
	}
	@Override public void match(ClassSlot.MatcherVoid matcher) {
		matcher.case_GlobalVarDef(this);
	}

	@Override public <T> T match(ClassMember.Matcher<T> matcher) {
		return matcher.case_GlobalVarDef(this);
	}
	@Override public void match(ClassMember.MatcherVoid matcher) {
		matcher.case_GlobalVarDef(this);
	}

	@Override public <T> T match(WEntity.Matcher<T> matcher) {
		return matcher.case_GlobalVarDef(this);
	}
	@Override public void match(WEntity.MatcherVoid matcher) {
		matcher.case_GlobalVarDef(this);
	}

	@Override public <T> T match(NameDef.Matcher<T> matcher) {
		return matcher.case_GlobalVarDef(this);
	}
	@Override public void match(NameDef.MatcherVoid matcher) {
		matcher.case_GlobalVarDef(this);
	}

	@Override public String toString() {
		return "GlobalVarDef(" + source + ", " +modifiers + ", " +isConstant + ", " +typ + ", " +name + ", " +initialExpr+")";
	}
	private boolean attr_attrTyp_isCached = false;
	private de.peeeq.wurstscript.types.PscriptType attr_attrTyp_cache;
	public de.peeeq.wurstscript.types.PscriptType attrTyp() {
		if (!attr_attrTyp_isCached) {
			attr_attrTyp_cache = de.peeeq.wurstscript.attributes.AttrVarDefType.calculate(this);
			attr_attrTyp_isCached = true;
		}
		return attr_attrTyp_cache;
	}
	private boolean attr_attrIsClassMember_isCached = false;
	private boolean attr_attrIsClassMember_cache;
	public boolean attrIsClassMember() {
		if (!attr_attrIsClassMember_isCached) {
			attr_attrIsClassMember_cache = de.peeeq.wurstscript.attributes.AttrIsClassMember.calculate(this);
			attr_attrIsClassMember_isCached = true;
		}
		return attr_attrIsClassMember_cache;
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
}
