package com.github.catvod.spider.merge;

import java.util.EmptyStackException;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class zW implements N2 {
    public static final zW yq = new zW();

    private zW() {
    }

    @Override // com.github.catvod.spider.merge.N2
    public final void SN(zg zgVar) {
        if (!zgVar.G4.tF()) {
            C0185tj tjVar = zgVar.G4;
            zgVar.dT = tjVar.zH(tjVar.i() - 1);
            return;
        }
        throw new EmptyStackException();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return A4.zH(A4.Gc(0, 4), 1);
    }

    public final String toString() {
        return "popMode";
    }

    @Override // com.github.catvod.spider.merge.N2
    public final boolean yq() {
        return false;
    }
}
