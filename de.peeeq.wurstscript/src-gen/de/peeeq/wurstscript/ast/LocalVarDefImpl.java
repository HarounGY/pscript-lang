//generated by parseq
package de.peeeq.wurstscript.ast;

class LocalVarDefImpl implements LocalVarDef, AstElementIntern {
	LocalVarDefImpl(WPos source, boolean constant, OptTypeExpr typ, String name, OptExpr initialExpr) {
		if (source == null) throw new IllegalArgumentException();
		((AstElementIntern)source).setParent(this);
		this.source = source;
		this.constant = constant;
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

	private boolean constant;
	public void setConstant(boolean constant) {
		this.constant = constant;
	} 
	public boolean getConstant() { return constant; }

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
			case 1: return typ;
			case 2: return initialExpr;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 3;
	}
	public LocalVarDef copy() {
		return new LocalVarDefImpl(source.copy(), constant, typ.copy(), name, initialExpr.copy());
	}
	@Override public void accept(InitBlock.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatement.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(OnDestroyDef.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatements.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtIf.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ConstructorDef.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(VarDef.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtLoop.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtWhile.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(LocalVarDef.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		typ.accept(v);
		initialExpr.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(VarDef.Matcher<T> matcher) {
		return matcher.case_LocalVarDef(this);
	}
	@Override public void match(VarDef.MatcherVoid matcher) {
		matcher.case_LocalVarDef(this);
	}

	@Override public <T> T match(WStatement.Matcher<T> matcher) {
		return matcher.case_LocalVarDef(this);
	}
	@Override public void match(WStatement.MatcherVoid matcher) {
		matcher.case_LocalVarDef(this);
	}

	@Override public String toString() {
		return "LocalVarDef(" + source + ", " +constant + ", " +typ + ", " +name + ", " +initialExpr+")";
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
}
