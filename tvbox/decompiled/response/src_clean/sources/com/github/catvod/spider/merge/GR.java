package com.github.catvod.spider.merge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class GR implements a9 {
    private Boolean N;
    private volatile a9 SN;
    private Queue<zF> i;
    private final boolean t0;
    private Method tF;
    private final String yq;
    private C0102fN zH;

    public GR(String str, Queue<zF> queue, boolean z) {
        this.yq = str;
        this.i = queue;
        this.t0 = z;
    }

    public final boolean N() {
        return this.SN instanceof sv;
    }

    public final boolean SN() {
        Boolean bool = this.N;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.tF = this.SN.getClass().getMethod("log", kH.class);
            this.N = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.N = Boolean.FALSE;
        }
        return this.N.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && GR.class == obj.getClass() && this.yq.equals(((GR) obj).yq);
    }

    @Override // com.github.catvod.spider.merge.a9
    public final String getName() {
        return this.yq;
    }

    public final int hashCode() {
        return this.yq.hashCode();
    }

    public final void i(a9 a9Var) {
        this.SN = a9Var;
    }

    public final boolean tF() {
        return this.SN == null;
    }

    @Override // com.github.catvod.spider.merge.a9
    public final void yq(String str, Throwable th) {
        a9 a9Var;
        if (this.SN != null) {
            a9Var = this.SN;
        } else if (this.t0) {
            a9Var = sv.yq;
        } else {
            if (this.zH == null) {
                this.zH = new C0102fN(this, this.i);
            }
            a9Var = this.zH;
        }
        a9Var.yq(str, th);
    }

    public final void zH(kH kHVar) {
        if (SN()) {
            try {
                this.tF.invoke(this.SN, kHVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }
}
