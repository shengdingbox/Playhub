package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Ao {
    private static final int[] SN = new int[256];
    private final int[] yq = new int[3];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 == 1) {
                    i2 ^= -306674912;
                }
            }
            SN[i] = i2;
        }
    }

    public final void N(byte b) {
        int[] iArr = this.yq;
        int i = iArr[0];
        int[] iArr2 = SN;
        iArr[0] = iArr2[(b ^ i) & 255] ^ (i >>> 8);
        iArr[1] = iArr[1] + (iArr[0] & 255);
        iArr[1] = (iArr[1] * 134775813) + 1;
        int i2 = iArr[2];
        iArr[2] = iArr2[(((byte) (iArr[1] >> 24)) ^ i2) & 255] ^ (i2 >>> 8);
    }

    public final void SN(char[] cArr) {
        int[] iArr = this.yq;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        for (byte b : FO.zH(cArr)) {
            N((byte) (b & 255));
        }
    }

    public final byte yq() {
        int i = this.yq[2] | 2;
        return (byte) ((i * (i ^ 1)) >>> 8);
    }
}
