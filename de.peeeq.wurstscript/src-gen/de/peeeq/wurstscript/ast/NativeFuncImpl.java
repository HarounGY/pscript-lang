//generated by parseq
package de.peeeq.wurstscript.ast;

class NativeFuncImpl implements NativeFunc, SortPosIntern {
	NativeFuncImpl(WPos source, FuncSignature signature) {
		if (source == null) throw new IllegalArgumentException();
		((SortPosIntern)source).setParent(this);
		this.source = source;
		if (signature == null) throw new IllegalArgumentException();
		((SortPosIntern)signature).setParent(this);
		this.signature = signature;
	}

	private SortPos parent;
	public SortPos getParent() { return parent; }
	public void setParent(SortPos parent) {
		if (parent != null && this.parent != null) { 			throw new Error("Parent of " + this + " already set: " + this.parent + "\ntried to change to " + parent); 		}
		this.parent = parent;
	}

	private WPos source;
	public void setSource(WPos source) {
		if (source == null) throw new IllegalArgumentException();
		((SortPosIntern)this.source).setParent(null);
		((SortPosIntern)source).setParent(this);
		this.source = source;
	} 
	public WPos getSource() { return source; }

	private FuncSignature signature;
	public void setSignature(FuncSignature signature) {
		if (signature == null) throw new IllegalArgumentException();
		((SortPosIntern)this.signature).setParent(null);
		((SortPosIntern)signature).setParent(this);
		this.signature = signature;
	} 
	public FuncSignature getSignature() { return signature; }

	public SortPos get(int i) {
		switch (i) {
			case 0: return source;
			case 1: return signature;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 2;
	}
	public NativeFunc copy() {
		return new NativeFuncImpl(source.copy(), signature.copy());
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public void accept(NativeFunc.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		signature.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(WEntity.Matcher<T> matcher) {
		return matcher.case_NativeFunc(this);
	}
	@Override public void match(WEntity.MatcherVoid matcher) {
		matcher.case_NativeFunc(this);
	}

	@Override public <T> T match(TopLevelDeclaration.Matcher<T> matcher) {
		return matcher.case_NativeFunc(this);
	}
	@Override public void match(TopLevelDeclaration.MatcherVoid matcher) {
		matcher.case_NativeFunc(this);
	}

	@Override public <T> T match(JassToplevelDeclaration.Matcher<T> matcher) {
		return matcher.case_NativeFunc(this);
	}
	@Override public void match(JassToplevelDeclaration.MatcherVoid matcher) {
		matcher.case_NativeFunc(this);
	}

	@Override public <T> T match(FunctionDefinition.Matcher<T> matcher) {
		return matcher.case_NativeFunc(this);
	}
	@Override public void match(FunctionDefinition.MatcherVoid matcher) {
		matcher.case_NativeFunc(this);
	}

	@Override public String toString() {
		return "NativeFunc(" + source + ", " +signature+")";
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
