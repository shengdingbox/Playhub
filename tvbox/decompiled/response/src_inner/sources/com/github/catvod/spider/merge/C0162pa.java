package com.github.catvod.spider.merge;
/* renamed from: com.github.catvod.spider.merge.pa  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0162pa {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.pa$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN {
        private final Y4 N;
        private hN yq = null;
        private hN SN = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SN(Y4 y4) {
            this.N = y4;
        }

        public final int SN(MA ma) {
            if (!(ma instanceof hN)) {
                return 1;
            }
            hN hNVar = (hN) ma;
            if (!this.N.yq(this.yq, hNVar)) {
                return 1;
            }
            this.SN = hNVar;
            return 5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final hN yq(hN hNVar, hN hNVar2) {
            this.yq = hNVar;
            this.SN = null;
            hN hNVar3 = hNVar2;
            int i = 0;
            while (hNVar3 != null) {
                int SN = SN(hNVar3);
                if (SN == 5) {
                    break;
                }
                int i2 = 1;
                if (SN != 1 || hNVar3.t0() <= 0) {
                    while (hNVar3.W() == null && i > 0) {
                        if (SN == 1 || SN == 2) {
                            SN = 1;
                        }
                        hNVar3 = hNVar3.O();
                        i--;
                        if (SN == 4) {
                            hNVar3.s();
                        }
                        SN = 1;
                    }
                    if (!(SN == 1 || SN == 2)) {
                        i2 = SN;
                    }
                    if (hNVar3 == hNVar2) {
                        break;
                    }
                    hNVar3 = hNVar3.W();
                    if (i2 == 4) {
                        hNVar3.s();
                    }
                } else {
                    hNVar3 = hNVar3.i(0);
                    i++;
                }
            }
            return this.SN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.pa$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq implements aA {
        private final Y4 N;
        private final kB SN;
        private final hN yq;

        yq(hN hNVar, kB kBVar, Y4 y4) {
            this.yq = hNVar;
            this.SN = kBVar;
            this.N = y4;
        }

        @Override // com.github.catvod.spider.merge.aA
        public final void SN(MA ma, int i) {
            if (ma instanceof hN) {
                hN hNVar = (hN) ma;
                if (this.N.yq(this.yq, hNVar)) {
                    this.SN.add(hNVar);
                }
            }
        }

        @Override // com.github.catvod.spider.merge.aA
        public final void yq(MA ma, int i) {
        }
    }

    public static kB yq(Y4 y4, hN hNVar) {
        kB kBVar = new kB();
        C0072So.M(new yq(hNVar, kBVar, y4), hNVar);
        return kBVar;
    }
}
