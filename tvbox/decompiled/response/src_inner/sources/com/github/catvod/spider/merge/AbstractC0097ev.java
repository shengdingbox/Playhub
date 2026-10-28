package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0162pa;
/* renamed from: com.github.catvod.spider.merge.ev  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
abstract class AbstractC0097ev extends Y4 {
    Y4 yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.ev$N */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class N extends AbstractC0097ev {
        public N(Y4 y4) {
            this.yq = y4;
        }

        public final String toString() {
            return String.format("%s + ", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            hN u7;
            return (hNVar == hNVar2 || (u7 = hNVar2.u7()) == null || !this.yq.yq(hNVar, u7)) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.ev$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN extends AbstractC0097ev {
        public SN(Y4 y4) {
            this.yq = y4;
        }

        public final String toString() {
            return String.format("%s > ", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            hN L;
            return (hNVar == hNVar2 || (L = hNVar2.L()) == null || !this.yq.yq(hNVar, L)) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.ev$i */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class i extends AbstractC0097ev {
        public i(Y4 y4) {
            this.yq = y4;
        }

        public final String toString() {
            return String.format("%s ~ ", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            if (hNVar == hNVar2) {
                return false;
            }
            do {
                hNVar2 = hNVar2.u7();
                if (hNVar2 == null) {
                    return false;
                }
            } while (!this.yq.yq(hNVar, hNVar2));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.ev$t0 */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class t0 extends Y4 {
        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return hNVar == hNVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.ev$tF */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class tF extends AbstractC0097ev {
        public tF(Y4 y4) {
            this.yq = y4;
        }

        public final String toString() {
            return String.format(":not(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            return !this.yq.yq(hNVar, hNVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.ev$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq extends AbstractC0097ev {
        final C0162pa.SN SN;

        public yq(Y4 y4) {
            this.yq = y4;
            this.SN = new C0162pa.SN(y4);
        }

        public final String toString() {
            return String.format(":has(%s)", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            for (int i = 0; i < hNVar2.t0(); i++) {
                MA i2 = hNVar2.i(i);
                if ((i2 instanceof hN) && this.SN.yq(hNVar2, (hN) i2) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.ev$zH */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class zH extends AbstractC0097ev {
        public zH(Y4 y4) {
            this.yq = y4;
        }

        public final String toString() {
            return String.format("%s ", this.yq);
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            if (hNVar == hNVar2) {
                return false;
            }
            do {
                hNVar2 = hNVar2.L();
                if (hNVar2 == null) {
                    break;
                } else if (this.yq.yq(hNVar, hNVar2)) {
                    return true;
                }
            } while (hNVar2 != hNVar);
            return false;
        }
    }

    AbstractC0097ev() {
    }
}
