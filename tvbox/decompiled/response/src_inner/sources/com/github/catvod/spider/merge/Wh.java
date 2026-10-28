package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Wh implements N2 {
    private final int yq;

    public Wh(int i) {
        this.yq = i;
    }

    @Override // com.github.catvod.spider.merge.N2
    public final void SN(zg zgVar) {
        zgVar.dT = this.yq;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Wh) && this.yq == ((Wh) obj).yq;
    }

    public final int hashCode() {
        return A4.zH(A4.Gc(A4.Gc(0, 2), this.yq), 2);
    }

    public final String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.yq));
    }

    @Override // com.github.catvod.spider.merge.N2
    public final boolean yq() {
        return false;
    }
}
