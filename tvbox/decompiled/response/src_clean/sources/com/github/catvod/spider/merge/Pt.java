package com.github.catvod.spider.merge;

import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Pt implements N2 {
    private final int SN;
    private final int yq;

    public Pt(int i, int i2) {
        this.yq = i;
        this.SN = i2;
    }

    @Override // com.github.catvod.spider.merge.N2
    public final void SN(zg zgVar) {
        Objects.requireNonNull(zgVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pt)) {
            return false;
        }
        Pt pt = (Pt) obj;
        return this.yq == pt.yq && this.SN == pt.SN;
    }

    public final int hashCode() {
        return A4.zH(A4.Gc(A4.Gc(A4.Gc(0, 1), this.yq), this.SN), 3);
    }

    @Override // com.github.catvod.spider.merge.N2
    public final boolean yq() {
        return true;
    }
}
