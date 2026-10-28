package com.github.catvod.spider.merge;

import java.util.IdentityHashMap;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class Bp {
    public static final hB SN = new hB();
    public final int yq;

    /* JADX INFO: Access modifiers changed from: protected */
    public Bp(int i) {
        this.yq = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp>, java.util.HashMap] */
    public static Bp SN(Bp bp, C0172rS rSVar, IdentityHashMap<Bp, Bp> identityHashMap) {
        if (bp.i()) {
            return bp;
        }
        Bp bp2 = identityHashMap.get(bp);
        if (bp2 != null) {
            return bp2;
        }
        Bp bp3 = (Bp) rSVar.yq.get(bp);
        if (bp3 != null) {
            identityHashMap.put(bp, bp3);
            return bp3;
        }
        Bp[] bpArr = new Bp[bp.Gc()];
        boolean z = false;
        for (int i = 0; i < bpArr.length; i++) {
            Bp SN2 = SN(bp.N(i), rSVar, identityHashMap);
            if (z || SN2 != bp.N(i)) {
                if (!z) {
                    bpArr = new Bp[bp.Gc()];
                    for (int i2 = 0; i2 < bp.Gc(); i2++) {
                        bpArr[i2] = bp.N(i2);
                    }
                    z = true;
                }
                bpArr[i] = SN2;
            }
        }
        if (!z) {
            rSVar.yq(bp);
            identityHashMap.put(bp, bp);
            return bp;
        }
        Bp M = bpArr.length == 0 ? SN : bpArr.length == 1 ? Nv.M(bpArr[0], bp.tF(0)) : new Sk(bpArr, ((Sk) bp).tF);
        rSVar.yq(M);
        identityHashMap.put(M, M);
        identityHashMap.put(bp, M);
        return M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r1 == r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00da, code lost:
        if (r19 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
        r19.SN(r0, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
        if (r19 != 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Type inference failed for: r10v12, types: [com.github.catvod.spider.merge.Sk] */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.github.catvod.spider.merge.Sk] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.github.catvod.spider.merge.lE<com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp>, com.github.catvod.spider.merge.lE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.github.catvod.spider.merge.Bp t0(com.github.catvod.spider.merge.Bp r16, com.github.catvod.spider.merge.Bp r17, boolean r18, com.github.catvod.spider.merge.C0132lE<com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp> r19) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Bp.t0(com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp, boolean, com.github.catvod.spider.merge.lE):com.github.catvod.spider.merge.Bp");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    public static Bp yq(N0 n0, My my) {
        if (my == null) {
            my = My.N;
        }
        My my2 = my.yq;
        return (my2 == null || my == My.N) ? SN : Nv.M(yq(n0, my2), ((C0133lY) ((AbstractC0137mG) n0.yq.get(my.SN)).tF(0)).N.SN);
    }

    public abstract int Gc();

    public abstract Bp N(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        return this.yq;
    }

    public boolean i() {
        return this == SN;
    }

    public abstract int tF(int i);

    public final boolean zH() {
        return tF(Gc() - 1) == Integer.MAX_VALUE;
    }
}
