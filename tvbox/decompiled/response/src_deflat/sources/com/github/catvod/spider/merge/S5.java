package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class S5 implements N2 {
    private final int yq;

    public S5(int i) {
        this.yq = i;
    }

    @Override // com.github.catvod.spider.merge.N2
    public final void SN(zg zgVar) {
        zgVar.G = this.yq;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof S5) && this.yq == ((S5) obj).yq;
    }

    public final int hashCode() {
        return A4.zH(A4.Gc(A4.Gc(0, 7), this.yq), 2);
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.yq));
    }

    @Override // com.github.catvod.spider.merge.N2
    public final boolean yq() {
        return false;
    }
}
