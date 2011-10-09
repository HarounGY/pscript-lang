package de.peeeq.wurstscript.ast;

import katja.common.*;
import java.io.IOException;

public interface OpLess extends de.peeeq.wurstscript.ast.OpBinary, KatjaTuple {

    //----- methods of OpLess -----

    public Object get(int i);
    public int size();
    public de.peeeq.wurstscript.ast.OpLess replace(int pos, Object term);
    public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.OpBinary.Switch<CT, E> switchClass) throws E;
    public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.Op.Switch<CT, E> switchClass) throws E;

    //----- nested classes of OpLess -----

    static interface VisitorType<E extends Throwable> {

        //----- methods of VisitorType<E extends Throwable> -----

        public void visit(de.peeeq.wurstscript.ast.OpLess term) throws E;
    }

    public static abstract class Visitor<E extends Throwable> implements de.peeeq.wurstscript.ast.OpLess.VisitorType<E> {
    }

    static class Impl extends KatjaTupleImpl implements de.peeeq.wurstscript.ast.OpLess {

        //----- methods of Impl -----

        Impl() {

        }

        public Object get(int i) {
            int ith = i;

            if(ith < 0) ith += 0;

            switch(ith) {
                default:
                    if(ith < 0) {
                        throw new IllegalArgumentException("get on sort OpLess invoked with negative parameter "+i);
                    } else {
                        throw new IllegalArgumentException("get on sort OpLess invoked with too large parameter "+i+", sort has only 0 components");
                    }
            }
        }

        public int size() {
            return 0;
        }

        public de.peeeq.wurstscript.ast.OpLess replace(int pos, Object term) {
            if(pos < 0)
                throw new IllegalArgumentException("replace on sort OpLess invoked with negative parameter "+pos);
            if(pos >= 0)
                throw new IllegalArgumentException("replace on sort OpLess invoked with too large parameter "+pos+", sort has only 0 components");


            return (de.peeeq.wurstscript.ast.OpLess) AST.unique(new de.peeeq.wurstscript.ast.OpLess.Impl(
            ));
        }

        public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.OpBinary.Switch<CT, E> switchClass) throws E {
            return switchClass.CaseOpLess(this);
        }

        public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.Op.Switch<CT, E> switchClass) throws E {
            return switchClass.CaseOpLess(this);
        }

        public Appendable toJavaCode(Appendable builder) throws IOException {
            builder.append("AST.OpLess");
            builder.append("( ");
            builder.append(" )");

            return builder;
        }

        public Appendable toString(Appendable builder) throws IOException {
            builder.append("OpLess");
            builder.append("( ");
            builder.append(" )");

            return builder;
        }

        public final String sortName() {
            return "OpLess";
        }
    }
}

