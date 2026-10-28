package com.github.catvod.spider.merge;

import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class sD {
    private C0092db SN = null;
    private Eo yq;

    public sD(Eo eo) {
        this.yq = eo;
    }

    public final byte[] yq(char[] cArr, int i) {
        Objects.requireNonNull(cArr);
        byte[] zH = FO.zH(cArr);
        if (this.SN == null) {
            Objects.requireNonNull(this.yq);
            this.SN = new C0092db("HmacSHA1");
        }
        this.SN.tF(zH);
        int N = i == 0 ? this.SN.N() : i;
        C0092db dbVar = this.SN;
        byte[] bArr = this.yq.yq;
        int i2 = 0;
        if (bArr == null) {
            bArr = new byte[0];
        }
        int N2 = dbVar.N();
        int i3 = 1;
        int i4 = (N / N2) + (N % N2 > 0 ? 1 : 0);
        int i5 = N - ((i4 - 1) * N2);
        byte[] bArr2 = new byte[i4 * N2];
        int i6 = 0;
        while (i3 <= i4) {
            int N3 = dbVar.N();
            byte[] bArr3 = new byte[N3];
            byte[] bArr4 = new byte[bArr.length + 4];
            System.arraycopy(bArr, i2, bArr4, i2, bArr.length);
            int length = bArr.length;
            bArr4[length] = (byte) (i3 / 16777216);
            bArr4[length + 1] = (byte) (i3 / 65536);
            bArr4[length + 2] = (byte) (i3 / 256);
            bArr4[length + 3] = (byte) i3;
            for (int i7 = 0; i7 < 1000; i7++) {
                bArr4 = dbVar.SN(bArr4);
                for (int i8 = 0; i8 < N3; i8++) {
                    bArr3[i8] = (byte) (bArr3[i8] ^ bArr4[i8]);
                }
            }
            System.arraycopy(bArr3, 0, bArr2, i6, N3);
            i6 += N2;
            i3++;
            i2 = 0;
        }
        if (i5 >= N2) {
            return bArr2;
        }
        byte[] bArr5 = new byte[N];
        System.arraycopy(bArr2, 0, bArr5, 0, N);
        return bArr5;
    }
}
