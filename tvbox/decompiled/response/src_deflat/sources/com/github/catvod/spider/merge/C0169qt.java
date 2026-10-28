package com.github.catvod.spider.merge;
/* renamed from: com.github.catvod.spider.merge.qt  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0169qt {
    static C0169qt[] N = new C0169qt[1001];
    public int SN;
    public int yq;

    public C0169qt(int i, int i2) {
        this.yq = i;
        this.SN = i2;
    }

    public static C0169qt SN(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C0169qt(i, i2);
        }
        C0169qt[] qtVarArr = N;
        if (qtVarArr[i] == null) {
            qtVarArr[i] = new C0169qt(i, i);
        }
        return qtVarArr[i];
    }

    public final C0169qt N(C0169qt qtVar) {
        return SN(Math.min(this.yq, qtVar.yq), Math.max(this.SN, qtVar.SN));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0169qt)) {
            return false;
        }
        C0169qt qtVar = (C0169qt) obj;
        return this.yq == qtVar.yq && this.SN == qtVar.SN;
    }

    public final int hashCode() {
        return ((713 + this.yq) * 31) + this.SN;
    }

    public final String toString() {
        return this.yq + ".." + this.SN;
    }

    public final boolean yq(C0169qt qtVar) {
        int i = this.yq;
        int i2 = qtVar.yq;
        if (!(i < i2 && this.SN < i2)) {
            if (!(i > qtVar.SN)) {
                return false;
            }
        }
        return true;
    }
}
