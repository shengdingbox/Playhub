package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class ru implements N2 {
    private final N2 SN;
    private final int yq;

    public ru(int i, N2 n2) {
        this.yq = i;
        this.SN = n2;
    }

    public final N2 N() {
        return this.SN;
    }

    @Override // com.github.catvod.spider.merge.N2
    public final void SN(zg zgVar) {
        this.SN.SN(zgVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        return this.yq == ruVar.yq && this.SN.equals(ruVar.SN);
    }

    public final int hashCode() {
        return A4.zH(A4.M(A4.Gc(0, this.yq), this.SN), 2);
    }

    public final int tF() {
        return this.yq;
    }

    @Override // com.github.catvod.spider.merge.N2
    public final boolean yq() {
        return true;
    }
}
