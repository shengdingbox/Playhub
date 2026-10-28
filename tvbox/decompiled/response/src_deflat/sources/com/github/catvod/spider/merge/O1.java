package com.github.catvod.spider.merge;

import java.util.BitSet;
import java.util.Set;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class O1 {
    public final N0 yq;

    public O1(N0 n0) {
        this.yq = n0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    public final void yq(AbstractC0137mG mGVar, Bp bp, C0184ta taVar, Set set, BitSet bitSet) {
        if (set.add(new J(mGVar, 0, bp, r2.yq))) {
            if (mGVar == null) {
                if (bp == null) {
                    taVar.yq(-2);
                    return;
                } else if (bp.i()) {
                    taVar.yq(-1);
                    return;
                }
            }
            if (mGVar instanceof Tq) {
                if (bp == null) {
                    taVar.yq(-2);
                    return;
                } else if (bp.i()) {
                    taVar.yq(-1);
                    return;
                } else if (bp != Bp.SN) {
                    boolean z = bitSet.get(mGVar.N);
                    try {
                        bitSet.clear(mGVar.N);
                        for (int i = 0; i < bp.Gc(); i++) {
                            yq((AbstractC0137mG) this.yq.yq.get(bp.tF(i)), bp.N(i), taVar, set, bitSet);
                        }
                        if (!z) {
                            return;
                        }
                        return;
                    } finally {
                        if (z) {
                            bitSet.set(mGVar.N);
                        }
                    }
                }
            }
            int SN = mGVar.SN();
            for (int i2 = 0; i2 < SN; i2++) {
                xc tF = mGVar.tF(i2);
                if (tF.getClass() == C0133lY.class) {
                    C0133lY lYVar = (C0133lY) tF;
                    if (bitSet.get(lYVar.yq.N)) {
                        continue;
                    } else {
                        Nv M = Nv.M(bp, lYVar.N.SN);
                        try {
                            bitSet.set(((C0133lY) tF).yq.N);
                            yq(tF.yq, M, taVar, set, bitSet);
                        } finally {
                            bitSet.clear(lYVar.yq.N);
                        }
                    }
                } else if ((tF instanceof cp) || tF.SN()) {
                    yq(tF.yq, bp, taVar, set, bitSet);
                } else if (tF.getClass() == C0164py.class) {
                    taVar.N(C0184ta.t0(1, this.yq.i));
                } else {
                    C0184ta N = tF.N();
                    if (N != null) {
                        if (tF instanceof di) {
                            C0184ta t0 = C0184ta.t0(1, this.yq.i);
                            if (t0.i()) {
                                N = null;
                            } else if (N.i()) {
                                N = new C0184ta(new int[0]);
                                N.N(t0);
                            } else {
                                N = C0184ta.q(t0, N);
                            }
                        }
                        taVar.N(N);
                    }
                }
            }
        }
    }
}
