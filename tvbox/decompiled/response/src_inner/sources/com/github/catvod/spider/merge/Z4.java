package com.github.catvod.spider.merge;

import java.nio.charset.StandardCharsets;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class Z4 implements qk {
    protected int SN = 0;
    protected final int yq;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class N extends Z4 {
        private final byte[] N;

        /* JADX INFO: Access modifiers changed from: package-private */
        public N(int i, int i2, byte[] bArr) {
            super(i2);
            this.N = bArr;
        }

        @Override // com.github.catvod.spider.merge.HL
        public final int t0(int i) {
            byte b;
            int signum = Integer.signum(1);
            if (signum == -1) {
                int i2 = this.SN + 1;
                if (i2 < 0) {
                    return -1;
                }
                b = this.N[i2];
            } else if (signum == 0) {
                return 0;
            } else {
                if (signum == 1) {
                    int i3 = (this.SN + 1) - 1;
                    if (i3 >= this.yq) {
                        return -1;
                    }
                    b = this.N[i3];
                } else {
                    throw new UnsupportedOperationException("Not reached");
                }
            }
            return b & 255;
        }

        @Override // com.github.catvod.spider.merge.qk
        public final String tF(C0169qt qtVar) {
            int min = Math.min(qtVar.yq, this.yq);
            return new String(this.N, min, Math.min((qtVar.SN - qtVar.yq) + 1, this.yq - min), StandardCharsets.ISO_8859_1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN extends Z4 {
        private final int[] N;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SN(int i, int i2, int[] iArr) {
            super(i2);
            this.N = iArr;
        }

        @Override // com.github.catvod.spider.merge.HL
        public final int t0(int i) {
            int signum = Integer.signum(1);
            if (signum == -1) {
                int i2 = this.SN + 1;
                if (i2 < 0) {
                    return -1;
                }
                return this.N[i2];
            } else if (signum == 0) {
                return 0;
            } else {
                if (signum == 1) {
                    int i3 = (this.SN + 1) - 1;
                    if (i3 >= this.yq) {
                        return -1;
                    }
                    return this.N[i3];
                }
                throw new UnsupportedOperationException("Not reached");
            }
        }

        @Override // com.github.catvod.spider.merge.qk
        public final String tF(C0169qt qtVar) {
            int min = Math.min(qtVar.yq, this.yq);
            return new String(this.N, min, Math.min((qtVar.SN - qtVar.yq) + 1, this.yq - min));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class yq extends Z4 {
        private final char[] N;

        /* JADX INFO: Access modifiers changed from: package-private */
        public yq(int i, int i2, char[] cArr) {
            super(i2);
            this.N = cArr;
        }

        @Override // com.github.catvod.spider.merge.HL
        public final int t0(int i) {
            char c;
            int signum = Integer.signum(1);
            if (signum == -1) {
                int i2 = this.SN + 1;
                if (i2 < 0) {
                    return -1;
                }
                c = this.N[i2];
            } else if (signum == 0) {
                return 0;
            } else {
                if (signum == 1) {
                    int i3 = (this.SN + 1) - 1;
                    if (i3 >= this.yq) {
                        return -1;
                    }
                    c = this.N[i3];
                } else {
                    throw new UnsupportedOperationException("Not reached");
                }
            }
            return c & 65535;
        }

        @Override // com.github.catvod.spider.merge.qk
        public final String tF(C0169qt qtVar) {
            int min = Math.min(qtVar.yq, this.yq);
            return new String(this.N, min, Math.min((qtVar.SN - qtVar.yq) + 1, this.yq - min));
        }
    }

    Z4(int i) {
        this.yq = i;
    }

    @Override // com.github.catvod.spider.merge.HL
    public final int Gc() {
        return this.SN;
    }

    @Override // com.github.catvod.spider.merge.HL
    public final void KJ() {
        int i = this.yq;
        int i2 = this.SN;
        if (i - i2 != 0) {
            this.SN = i2 + 1;
            return;
        }
        throw new IllegalStateException("cannot consume EOF");
    }

    @Override // com.github.catvod.spider.merge.HL
    public final int N() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.HL
    public final int size() {
        return this.yq;
    }

    public final String toString() {
        return tF(C0169qt.SN(0, this.yq - 1));
    }

    @Override // com.github.catvod.spider.merge.HL
    public final void yq() {
    }

    @Override // com.github.catvod.spider.merge.HL
    public final void zH(int i) {
        this.SN = i;
    }
}
