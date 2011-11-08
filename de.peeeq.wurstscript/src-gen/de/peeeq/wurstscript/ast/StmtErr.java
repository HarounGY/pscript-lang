//generated by parseq
package de.peeeq.wurstscript.ast;

public interface StmtErr extends AstElement, WStatement {
	AstElement getParent();
	void setSource(WPos source);
	WPos getSource();
	StmtErr copy();
	public abstract void accept(InitBlock.Visitor v);
	public abstract void accept(WStatement.Visitor v);
	public abstract void accept(OnDestroyDef.Visitor v);
	public abstract void accept(StmtErr.Visitor v);
	public abstract void accept(WStatements.Visitor v);
	public abstract void accept(StmtIf.Visitor v);
	public abstract void accept(TopLevelDeclaration.Visitor v);
	public abstract void accept(ConstructorDef.Visitor v);
	public abstract void accept(FunctionDefinition.Visitor v);
	public abstract void accept(JassToplevelDeclaration.Visitor v);
	public abstract void accept(ClassSlot.Visitor v);
	public abstract void accept(ClassMember.Visitor v);
	public abstract void accept(WPackage.Visitor v);
	public abstract void accept(ClassDef.Visitor v);
	public abstract void accept(WEntity.Visitor v);
	public abstract void accept(ClassSlots.Visitor v);
	public abstract void accept(WEntities.Visitor v);
	public abstract void accept(TypeDef.Visitor v);
	public abstract void accept(WScope.Visitor v);
	public abstract void accept(StmtLoop.Visitor v);
	public abstract void accept(StmtWhile.Visitor v);
	public abstract void accept(FuncDef.Visitor v);
	public abstract void accept(CompilationUnit.Visitor v);
	public abstract void accept(PackageOrGlobal.Visitor v);
	public interface Visitor {
		void visit(StmtErr stmtErr);
		void visit(WPos wPos);
	}
	public static abstract class DefaultVisitor implements Visitor {
		@Override public void visit(StmtErr stmtErr) {}
		@Override public void visit(WPos wPos) {}
	}
}
