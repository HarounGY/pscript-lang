//generated by parseq
package de.peeeq.wurstscript.ast;

public interface VisibilityModifier extends AstElement, Modifier{
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_VisibilityPublicread(VisibilityPublicread visibilityPublicread);
		T case_VisibilityProtected(VisibilityProtected visibilityProtected);
		T case_VisibilityDefault(VisibilityDefault visibilityDefault);
		T case_VisibilityPrivate(VisibilityPrivate visibilityPrivate);
		T case_VisibilityPublic(VisibilityPublic visibilityPublic);
	}

	public interface MatcherVoid {
		void case_VisibilityPublicread(VisibilityPublicread visibilityPublicread);
		void case_VisibilityProtected(VisibilityProtected visibilityProtected);
		void case_VisibilityDefault(VisibilityDefault visibilityDefault);
		void case_VisibilityPrivate(VisibilityPrivate visibilityPrivate);
		void case_VisibilityPublic(VisibilityPublic visibilityPublic);
	}

	VisibilityModifier copy();
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(GlobalVarDef.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(JassGlobalBlock.Visitor v);
	public abstract void accept(ClassOrModule.Visitor v);
	public abstract void accept(VarDef.Visitor v);
	public abstract void accept(NativeFunc.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(NameDef.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(ModuleDef.Visitor v);
	public abstract void accept(VisibilityModifier.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(Modifier.Visitor v);
	public abstract void accept(NativeType.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(AstElementWithModifier.Visitor v);
	public abstract void accept(Modifiers.Visitor v);
	public interface Visitor {
		void visit(VisibilityPublicread visibilityPublicread);
		void visit(VisibilityProtected visibilityProtected);
		void visit(VisibilityDefault visibilityDefault);
		void visit(VisibilityPrivate visibilityPrivate);
		void visit(VisibilityPublic visibilityPublic);
		void visit(WPos wPos);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(VisibilityPublicread visibilityPublicread) {}
		@Override public void visit(VisibilityProtected visibilityProtected) {}
		@Override public void visit(VisibilityDefault visibilityDefault) {}
		@Override public void visit(VisibilityPrivate visibilityPrivate) {}
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(WPos wPos) {}
	}
}
