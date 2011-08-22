package de.peeeq.wurstscript.ast;

import katja.common.*;
import java.util.List;
import java.io.IOException;

public interface OpOrPos extends de.peeeq.wurstscript.ast.OpBinaryPos, de.peeeq.wurstscript.ast.AST.TuplePos<de.peeeq.wurstscript.ast.OpOr> {

    //----- methods of OpOrPos -----

    public de.peeeq.wurstscript.ast.OpOr termOpBinary();
    public de.peeeq.wurstscript.ast.OpOr termOp();
    public de.peeeq.wurstscript.ast.OpOr term();
    public KatjaSortPos<de.peeeq.wurstscript.ast.CompilationUnitPos> get(int i);
    public int size();
    public de.peeeq.wurstscript.ast.OpOrPos replace(de.peeeq.wurstscript.ast.OpOr term);
    public de.peeeq.wurstscript.ast.ExprBinaryPos parent();
    public de.peeeq.wurstscript.ast.ExprPos lsib();
    public de.peeeq.wurstscript.ast.ExprPos rsib();
    public de.peeeq.wurstscript.ast.AST.SortPos preOrder();
    public de.peeeq.wurstscript.ast.AST.SortPos preOrderSkip();
    public de.peeeq.wurstscript.ast.AST.SortPos postOrder();
    public de.peeeq.wurstscript.ast.AST.SortPos postOrderStart();
    public de.peeeq.wurstscript.ast.AST.SortPos follow(List<Integer> path);
    public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.OpBinaryPos.Switch<CT, E> switchClass) throws E;
    public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.OpPos.Switch<CT, E> switchClass) throws E;

    //----- nested classes of OpOrPos -----

    static interface VisitorType<E extends Throwable> {

        //----- methods of VisitorType<E extends Throwable> -----

        public void visit(de.peeeq.wurstscript.ast.OpOrPos term) throws E;
    }

    public static abstract class Visitor<E extends Throwable> implements de.peeeq.wurstscript.ast.OpOrPos.VisitorType<E> {
    }

    static class Impl extends KatjaTuplePosImpl<de.peeeq.wurstscript.ast.CompilationUnitPos, de.peeeq.wurstscript.ast.OpOr> implements de.peeeq.wurstscript.ast.OpOrPos {

        //----- methods of Impl -----

        public de.peeeq.wurstscript.ast.OpOr termOpBinary() {
            return term();
        }

        public de.peeeq.wurstscript.ast.OpOr termOp() {
            return term();
        }

        Impl(KatjaNodePos<de.peeeq.wurstscript.ast.CompilationUnitPos, ?> parent, de.peeeq.wurstscript.ast.OpOr term, int pos) {
            super(parent, term, pos);
        }

        public KatjaSortPos<de.peeeq.wurstscript.ast.CompilationUnitPos> get(int i) {
            int ith = i;

            if(ith < 0) ith += 0;

            switch(ith) {
                default:
                    if(ith < 0) {
                        throw new IllegalArgumentException("get on sort OpOrPos invoked with negative parameter "+i);
                    } else {
                        throw new IllegalArgumentException("get on sort OpOrPos invoked with too large parameter "+i+", sort has only 0 components");
                    }
            }
        }

        public int size() {
            return 0;
        }

        public de.peeeq.wurstscript.ast.OpOrPos replace(de.peeeq.wurstscript.ast.OpOr term) {
            return (de.peeeq.wurstscript.ast.OpOrPos) super.replace(term);
        }

        protected de.peeeq.wurstscript.ast.CompilationUnitPos freshRootPosition(KatjaSort term) {
            if(!(term instanceof de.peeeq.wurstscript.ast.CompilationUnit))
                throw new IllegalArgumentException("given term to replace root position has not the correct sort CompilationUnit");

            return AST.CompilationUnitPos((CompilationUnit) term);
        }

        public de.peeeq.wurstscript.ast.ExprBinaryPos parent() {
            return (de.peeeq.wurstscript.ast.ExprBinaryPos) super.parent();
        }

        public de.peeeq.wurstscript.ast.ExprPos lsib() {
            return (de.peeeq.wurstscript.ast.ExprPos) super.lsib();
        }

        public de.peeeq.wurstscript.ast.ExprPos rsib() {
            return (de.peeeq.wurstscript.ast.ExprPos) super.rsib();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos preOrder() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.preOrder();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos preOrderSkip() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.preOrderSkip();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos postOrder() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.postOrder();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos postOrderStart() {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.postOrderStart();
        }

        public de.peeeq.wurstscript.ast.AST.SortPos follow(List<Integer> path) {
            return (de.peeeq.wurstscript.ast.AST.SortPos) super.follow(path);
        }

        public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.OpBinaryPos.Switch<CT, E> switchClass) throws E {
            return switchClass.CaseOpOrPos(this);
        }

        public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.OpPos.Switch<CT, E> switchClass) throws E {
            return switchClass.CaseOpOrPos(this);
        }

        public Appendable toJavaCode(Appendable builder) throws IOException {
            builder.append("AST.CompilationUnitPos");
            builder.append("( ");
            root().term().toJavaCode(builder);
            builder.append(" )");
            for(int pos : path()) builder.append(".get("+pos+")");

            return builder;
        }

        public Appendable toString(Appendable builder) throws IOException {
            term().toString(builder);
            builder.append("@CompilationUnit");
            for(int pos : path()) builder.append("."+pos);

            return builder;
        }

        public final String sortName() {
            return "OpOrPos";
        }
    }
}

