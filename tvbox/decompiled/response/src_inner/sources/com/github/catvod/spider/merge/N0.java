package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class N0 {
    public N2[] Gc;
    public xe[] N;
    public final int i;
    public int[] t0;
    public Tq[] tF;
    public final int zH;
    public final List<AbstractC0137mG> yq = new ArrayList();
    public final List<V2> SN = new ArrayList();
    public final List<C0074Xo> M = new ArrayList();

    public N0(int i, int i2) {
        new LinkedHashMap();
        this.zH = i;
        this.i = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    public final C0184ta N(int i, My my) {
        if (i < 0 || i >= this.yq.size()) {
            throw new IllegalArgumentException("Invalid state number.");
        }
        C0184ta zH = zH((AbstractC0137mG) this.yq.get(i));
        if (!zH.tF(-2)) {
            return zH;
        }
        C0184ta taVar = new C0184ta(new int[0]);
        taVar.N(zH);
        taVar.Gc();
        while (my != null && my.SN >= 0 && zH.tF(-2)) {
            zH = zH(((C0133lY) ((AbstractC0137mG) this.yq.get(my.SN)).tF(0)).N);
            taVar.N(zH);
            taVar.Gc();
            my = my.yq;
        }
        if (zH.tF(-2)) {
            taVar.yq(-1);
        }
        return taVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.V2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.V2>, java.util.ArrayList] */
    public final V2 SN(int i) {
        if (!this.SN.isEmpty()) {
            return (V2) this.SN.get(i);
        }
        return null;
    }

    public final C0184ta i(AbstractC0137mG mGVar, My my) {
        O1 o1 = new O1(this);
        C0184ta taVar = new C0184ta(new int[0]);
        o1.yq(mGVar, my != null ? Bp.yq(mGVar.yq, my) : null, taVar, new HashSet(), new BitSet());
        return taVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.V2>, java.util.ArrayList] */
    public final int tF() {
        return this.SN.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    public final void yq(AbstractC0137mG mGVar) {
        if (mGVar != null) {
            mGVar.yq = this;
            mGVar.SN = this.yq.size();
        }
        this.yq.add(mGVar);
    }

    public final C0184ta zH(AbstractC0137mG mGVar) {
        C0184ta taVar = mGVar.i;
        if (taVar != null) {
            return taVar;
        }
        C0184ta i = i(mGVar, null);
        mGVar.i = i;
        i.M();
        return mGVar.i;
    }
}
