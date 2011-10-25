//generated by parseq
package de.peeeq.wurstscript.ast;

public interface VisibilityModifier extends SortPos{
	SortPos getParent();
	<T> T match(Matcher<T> s);
	void match(MatcherVoid s);
	public interface Matcher<T> {
		T case_VisibilityProtected(VisibilityProtected visibilityProtected);
		T case_VisibilityPublicread(VisibilityPublicread visibilityPublicread);
		T case_VisibilityPublic(VisibilityPublic visibilityPublic);
		T case_VisibilityDefault(VisibilityDefault visibilityDefault);
		T case_VisibilityPrivate(VisibilityPrivate visibilityPrivate);
	}

	public interface MatcherVoid {
		void case_VisibilityProtected(VisibilityProtected visibilityProtected);
		void case_VisibilityPublicread(VisibilityPublicread visibilityPublicread);
		void case_VisibilityPublic(VisibilityPublic visibilityPublic);
		void case_VisibilityDefault(VisibilityDefault visibilityDefault);
		void case_VisibilityPrivate(VisibilityPrivate visibilityPrivate);
	}

	VisibilityModifier copy();
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(JassGlobalBlock.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(NativeType.Visitor v);
	public abstract void accept(VarDef.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(GlobalVarDef.Visitor v);
	public abstract void accept(VisibilityModifier.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public interface Visitor {
		void visit(VisibilityProtected visibilityProtected);
		void visit(VisibilityPublicread visibilityPublicread);
		void visit(VisibilityPublic visibilityPublic);
		void visit(WPos wPos);
		void visit(VisibilityDefault visibilityDefault);
		void visit(VisibilityPrivate visibilityPrivate);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(VisibilityProtected visibilityProtected) {}
		@Override public void visit(VisibilityPublicread visibilityPublicread) {}
		@Override public void visit(VisibilityPublic visibilityPublic) {}
		@Override public void visit(WPos wPos) {}
		@Override public void visit(VisibilityDefault visibilityDefault) {}
		@Override public void visit(VisibilityPrivate visibilityPrivate) {}
	}
}
