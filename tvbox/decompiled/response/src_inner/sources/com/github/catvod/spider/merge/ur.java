package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class ur implements N2 {
    private final int yq;

    public ur(int i) {
        this.yq = i;
    }

    @Override // com.github.catvod.spider.merge.N2
    public final void SN(zg zgVar) {
        zgVar.B = this.yq;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ur) && this.yq == ((ur) obj).yq;
    }

    public final int hashCode() {
        return A4.zH(A4.Gc(A4.Gc(0, 0), this.yq), 2);
    }

    public final String toString() {
        return String.format("channel(%d)", Integer.valueOf(this.yq));
    }

    @Override // com.github.catvod.spider.merge.N2
    public final boolean yq() {
        return false;
    }
}
