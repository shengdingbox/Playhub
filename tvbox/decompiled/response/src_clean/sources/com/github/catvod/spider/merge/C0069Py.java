package com.github.catvod.spider.merge;

import java.io.Serializable;
/* renamed from: com.github.catvod.spider.merge.Py  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0069Py<A, B> implements Serializable {
    public final B SN;
    public final A yq;

    public C0069Py(A a, B b) {
        this.yq = a;
        this.SN = b;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0069Py)) {
            return false;
        }
        C0069Py py = (C0069Py) obj;
        A a = this.yq;
        A a2 = py.yq;
        if (a == null) {
            z = a2 == null;
        } else {
            z = a.equals(a2);
        }
        if (z) {
            B b = this.SN;
            B b2 = py.SN;
            if (b == null) {
                z2 = b2 == null;
            } else {
                z2 = b.equals(b2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return A4.zH(A4.M(A4.M(0, this.yq), this.SN), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.yq, this.SN);
    }
}
