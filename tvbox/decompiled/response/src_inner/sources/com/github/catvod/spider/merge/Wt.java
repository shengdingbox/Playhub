package com.github.catvod.spider.merge;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Wt extends Hj {
    public static final Wt yq = new Wt();

    private Wt() {
    }

    @Override // com.github.catvod.spider.merge.Hj
    public final int Zm(Object obj) {
        J j = (J) obj;
        return A4.zH(A4.M(A4.Gc(7, j.yq.SN), j.N), 2);
    }

    @Override // com.github.catvod.spider.merge.Hj
    public final boolean b(Object obj, Object obj2) {
        J j = (J) obj;
        J j2 = (J) obj2;
        if (j == j2) {
            return true;
        }
        return j != null && j2 != null && j.yq.SN == j2.yq.SN && j.N.equals(j2.N);
    }
}
