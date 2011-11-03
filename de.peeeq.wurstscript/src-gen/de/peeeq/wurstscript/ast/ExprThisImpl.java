//generated by parseq
package de.peeeq.wurstscript.ast;

class ExprThisImpl implements ExprThis, SortPosIntern {
	ExprThisImpl(WPos source) {
		if (source == null) throw new IllegalArgumentException();
		((SortPosIntern)source).setParent(this);
		this.source = source;
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

	public SortPos get(int i) {
		switch (i) {
			case 0: return source;
			default: throw new IllegalArgumentException("Index out of range: " + i);
		}
	}
	public int size() {
		return 1;
	}
	public ExprThis copy() {
		return new ExprThisImpl(source.copy());
	}
	@Override public void accept(InitBlock.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatement.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(PackageOrGlobal.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprMemberArrayVar.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprUnary.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeExpr.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtDecRefCount.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprMemberVar.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlots.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(OnDestroyDef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncSignature.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtCall.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtIncRefCount.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntities.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtDestroy.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtExitwhen.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(OptExpr.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprBinary.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtReturn.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtIf.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(TopLevelDeclaration.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprCast.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ConstructorDef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprNewObject.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprAssignable.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtSet.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(WParameter.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprFunctionCall.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(Arguments.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(NativeType.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassToplevelDeclaration.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(OptTypeExpr.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassSlot.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassMember.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(WPackage.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ClassDef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(VarDef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(WEntity.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprThis.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(WStatements.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(WParameters.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(Expr.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(GlobalVarDef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprVarArrayAccess.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(Indexes.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(VarRef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeDef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncRef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtLoop.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(NativeFunc.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(JassGlobalBlock.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ArraySizes.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(StmtWhile.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(FuncDef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(LocalVarDef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(TypeRef.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprAtomic.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(CompilationUnit.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(WScope.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(ExprMemberMethod.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public void accept(FunctionDefinition.Visitor v) {
		source.accept(v);
		v.visit(this);
	}
	@Override public <T> T match(OptExpr.Matcher<T> matcher) {
		return matcher.case_ExprThis(this);
	}
	@Override public void match(OptExpr.MatcherVoid matcher) {
		matcher.case_ExprThis(this);
	}

	@Override public <T> T match(ExprAtomic.Matcher<T> matcher) {
		return matcher.case_ExprThis(this);
	}
	@Override public void match(ExprAtomic.MatcherVoid matcher) {
		matcher.case_ExprThis(this);
	}

	@Override public <T> T match(Expr.Matcher<T> matcher) {
		return matcher.case_ExprThis(this);
	}
	@Override public void match(Expr.MatcherVoid matcher) {
		matcher.case_ExprThis(this);
	}

	@Override public String toString() {
		return "ExprThis(" + source+")";
	}
	private boolean attr_attrTyp_isCached = false;
	private de.peeeq.wurstscript.types.PscriptType attr_attrTyp_cache;
	public de.peeeq.wurstscript.types.PscriptType attrTyp() {
		if (!attr_attrTyp_isCached) {
			attr_attrTyp_cache = de.peeeq.wurstscript.attributes.AttrExprType.calculate(this);
			attr_attrTyp_isCached = true;
		}
		return attr_attrTyp_cache;
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
