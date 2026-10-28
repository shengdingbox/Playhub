package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class xc {
    public AbstractC0137mG yq;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static class yq extends HashMap<Class<? extends xc>, Integer> {
        yq() {
            put(C0213zn.class, 1);
            put(JN.class, 2);
            put(C0133lY.class, 3);
            put(RR.class, 4);
            put(Rx.class, 5);
            put(cS.class, 6);
            put(pq.class, 7);
            put(di.class, 8);
            put(C0164py.class, 9);
            put(Cw.class, 10);
        }
    }

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "EPSILON", "RANGE", "RULE", "PREDICATE", "ATOM", "ACTION", "SET", "NOT_SET", "WILDCARD", "PRECEDENCE"));
        Collections.unmodifiableMap(new yq());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public xc(AbstractC0137mG mGVar) {
        Objects.requireNonNull(mGVar, "target cannot be null.");
        this.yq = mGVar;
    }

    public C0184ta N() {
        return null;
    }

    public boolean SN() {
        return this instanceof cS;
    }

    public abstract boolean tF(int i, int i2);

    public abstract int yq();
}
