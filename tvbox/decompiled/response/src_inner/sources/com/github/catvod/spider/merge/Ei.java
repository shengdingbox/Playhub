package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Ei {
    private final C0087cR N;
    private final int[] SN;
    private final int i;
    private final int tF;
    private final int[] yq;
    private final int zH;
    public static final Ei t0 = new Ei(4201, 4096, 1);
    public static final Ei Gc = new Ei(1033, 1024, 1);
    public static final Ei M = new Ei(67, 64, 1);
    public static final Ei KJ = new Ei(19, 16, 1);
    public static final Ei q = new Ei(285, 256, 0);
    public static final Ei B = new Ei(301, 256, 1);

    public Ei(int i, int i2, int i3) {
        this.zH = i;
        this.tF = i2;
        this.i = i3;
        this.yq = new int[i2];
        this.SN = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.yq[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.SN[this.yq[i6]] = i6;
        }
        this.N = new C0087cR(this, new int[]{0});
        new C0087cR(this, new int[]{1});
    }

    public final int N() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int SN(int i) {
        return this.yq[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int i(int i) {
        if (i != 0) {
            return this.SN[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int t0(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.yq;
        int[] iArr2 = this.SN;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.tF - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0087cR tF() {
        return this.N;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.zH) + ',' + this.tF + ')';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0087cR yq(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.N;
        } else {
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C0087cR(this, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zH(int i) {
        if (i != 0) {
            return this.yq[(this.tF - this.SN[i]) - 1];
        }
        throw new ArithmeticException();
    }
}
