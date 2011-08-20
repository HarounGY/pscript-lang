package de.peeeq.wurstscript.ast;

import java.io.IOException;

import katja.common.KatjaTuple;
import katja.common.KatjaTupleImpl;

public interface OpEquals extends de.peeeq.wurstscript.ast.OpBinary, KatjaTuple {

    //----- methods of OpEquals -----

    public Object get(int i);
    public int size();
    public de.peeeq.wurstscript.ast.OpEquals replace(int pos, Object term);
    public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.OpBinary.Switch<CT, E> switchClass) throws E;

    //----- nested classes of OpEquals -----

    static interface VisitorType<E extends Throwable> {

        //----- methods of VisitorType<E extends Throwable> -----

        public void visit(de.peeeq.wurstscript.ast.OpEquals term) throws E;
    }

    public static abstract class Visitor<E extends Throwable> implements de.peeeq.wurstscript.ast.OpEquals.VisitorType<E> {
    }

    static class Impl extends KatjaTupleImpl implements de.peeeq.wurstscript.ast.OpEquals {

        //----- methods of Impl -----

        Impl() {

        }

        public Object get(int i) {
            int ith = i;

            if(ith < 0) ith += 0;

            switch(ith) {
                default:
                    if(ith < 0) {
                        throw new IllegalArgumentException("get on sort OpEquals invoked with negative parameter "+i);
                    } else {
                        throw new IllegalArgumentException("get on sort OpEquals invoked with too large parameter "+i+", sort has only 0 components");
                    }
            }
        }

        public int size() {
            return 0;
        }

        public de.peeeq.wurstscript.ast.OpEquals replace(int pos, Object term) {
            if(pos < 0)
                throw new IllegalArgumentException("replace on sort OpEquals invoked with negative parameter "+pos);
            if(pos >= 0)
                throw new IllegalArgumentException("replace on sort OpEquals invoked with too large parameter "+pos+", sort has only 0 components");


            return (de.peeeq.wurstscript.ast.OpEquals) AST.unique(new de.peeeq.wurstscript.ast.OpEquals.Impl(
            ));
        }

        public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.OpBinary.Switch<CT, E> switchClass) throws E {
            return switchClass.CaseOpEquals(this);
        }

        public Appendable toJavaCode(Appendable builder) throws IOException {
            builder.append("AST.OpEquals");
            builder.append("( ");
            builder.append(" )");

            return builder;
        }

        public Appendable toString(Appendable builder) throws IOException {
            builder.append("OpEquals");
            builder.append("( ");
            builder.append(" )");

            return builder;
        }

        public final String sortName() {
            return "OpEquals";
        }
    }
}

