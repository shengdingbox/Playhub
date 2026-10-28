package com.github.catvod.spider.merge;

import java.util.BitSet;
import java.util.Collection;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class PJ implements tF {
    private final Collection<? extends tF> yq;

    public PJ(Collection<? extends tF> collection) {
        Objects.requireNonNull(collection, "delegates");
        this.yq = collection;
    }

    @Override // com.github.catvod.spider.merge.tF
    public final void N(Fw fw, ZV zv, int i, int i2, int i3, i3 i3Var) {
        for (tF tFVar : this.yq) {
            tFVar.N(fw, zv, i, i2, i3, i3Var);
        }
    }

    @Override // com.github.catvod.spider.merge.tF
    public final void SN(Fw fw, ZV zv, int i, int i2, BitSet bitSet, i3 i3Var) {
        for (tF tFVar : this.yq) {
            tFVar.SN(fw, zv, i, i2, bitSet, i3Var);
        }
    }

    @Override // com.github.catvod.spider.merge.tF
    public final void tF(Fw fw, ZV zv, int i, int i2, BitSet bitSet, i3 i3Var) {
        for (tF tFVar : this.yq) {
            tFVar.tF(fw, zv, i, i2, bitSet, i3Var);
        }
    }

    @Override // com.github.catvod.spider.merge.tF
    public final void yq(wg<?, ?> wgVar, Object obj, int i, int i2, String str, Xu xu) {
        for (tF tFVar : this.yq) {
            tFVar.yq(wgVar, obj, i, i2, str, xu);
        }
    }
}
