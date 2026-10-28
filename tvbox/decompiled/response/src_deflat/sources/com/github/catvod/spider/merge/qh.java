package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class qh {
    private final List<C0087cR> SN;
    private final Ei yq;

    public qh(Ei ei) {
        this.yq = ei;
        ArrayList arrayList = new ArrayList();
        this.SN = arrayList;
        arrayList.add(new C0087cR(ei, new int[]{1}));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.cR>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.github.catvod.spider.merge.cR>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List<com.github.catvod.spider.merge.cR>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List<com.github.catvod.spider.merge.cR>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List<com.github.catvod.spider.merge.cR>, java.util.ArrayList] */
    public final void yq(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                if (i >= this.SN.size()) {
                    ?? r1 = this.SN;
                    C0087cR cRVar = (C0087cR) r1.get(r1.size() - 1);
                    for (int size = this.SN.size(); size <= i; size++) {
                        Ei ei = this.yq;
                        cRVar = cRVar.i(new C0087cR(ei, new int[]{1, ei.SN(ei.N() + (size - 1))}));
                        this.SN.add(cRVar);
                    }
                }
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] tF = new C0087cR(this.yq, iArr2).t0(i, 1).SN((C0087cR) this.SN.get(i))[1].tF();
                int length2 = i - tF.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(tF, 0, iArr, length + length2, tF.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
