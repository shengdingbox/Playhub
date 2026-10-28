package com.github.catvod.spider.merge;
/* renamed from: com.github.catvod.spider.merge.vD  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0196vD extends vR {
    static {
        new C0196vD(1, 0);
    }

    public C0196vD(int i, int i2) {
        super(i, i2, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0196vD) {
            if (!isEmpty() || !((C0196vD) obj).isEmpty()) {
                C0196vD vDVar = (C0196vD) obj;
                if (!(yq() == vDVar.yq() && SN() == vDVar.SN())) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (yq() * 31) + SN();
    }

    public final boolean isEmpty() {
        return yq() > SN();
    }

    public final String toString() {
        return yq() + ".." + SN();
    }
}
