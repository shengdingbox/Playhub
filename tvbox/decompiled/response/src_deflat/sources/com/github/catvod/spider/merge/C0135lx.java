package com.github.catvod.spider.merge;
/* renamed from: com.github.catvod.spider.merge.lx  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0135lx implements N2 {
    private final int yq;

    public C0135lx(int i) {
        this.yq = i;
    }

    @Override // com.github.catvod.spider.merge.N2
    public final void SN(zg zgVar) {
        int i = this.yq;
        zgVar.G4.yq(zgVar.dT);
        zgVar.dT = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0135lx) && this.yq == ((C0135lx) obj).yq;
    }

    public final int hashCode() {
        return A4.zH(A4.Gc(A4.Gc(0, 5), this.yq), 2);
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.yq));
    }

    @Override // com.github.catvod.spider.merge.N2
    public final boolean yq() {
        return false;
    }
}
