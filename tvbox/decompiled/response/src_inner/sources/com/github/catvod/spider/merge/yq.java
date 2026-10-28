package com.github.catvod.spider.merge;

import java.util.Arrays;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class yq implements u5 {
    private C0092db SN;
    private SN yq;
    private int N = 1;
    private byte[] tF = new byte[16];
    private byte[] zH = new byte[16];

    public yq(N n, char[] cArr, byte[] bArr, byte[] bArr2) {
        if (cArr == null || cArr.length <= 0) {
            throw new RH("empty or null password provided for AES decryption");
        }
        int Dr = n.Dr();
        sD sDVar = new sD(new Eo(bArr));
        int SN = C0202x.SN(Dr);
        int N = C0202x.N(Dr);
        int i = SN + N + 2;
        byte[] yq = sDVar.yq(cArr, i);
        if (yq.length == i) {
            byte[] bArr3 = new byte[2];
            System.arraycopy(yq, C0202x.N(Dr) + C0202x.SN(Dr), bArr3, 0, 2);
            if (Arrays.equals(bArr2, bArr3)) {
                int SN2 = C0202x.SN(Dr);
                byte[] bArr4 = new byte[SN2];
                System.arraycopy(yq, 0, bArr4, 0, SN2);
                this.yq = new SN(bArr4);
                int N2 = C0202x.N(Dr);
                byte[] bArr5 = new byte[N2];
                System.arraycopy(yq, C0202x.SN(Dr), bArr5, 0, N2);
                C0092db dbVar = new C0092db("HmacSHA1");
                dbVar.tF(bArr5);
                this.SN = dbVar;
                return;
            }
            throw new RH("Wrong Password", 1);
        }
        throw new RH(String.format("Derived Key invalid for Key Length [%d] MAC Length [%d]", Integer.valueOf(SN), Integer.valueOf(N)));
    }

    public final byte[] SN() {
        return this.SN.yq();
    }

    @Override // com.github.catvod.spider.merge.u5
    public final int yq(byte[] bArr, int i, int i2) {
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                return i2;
            }
            int i5 = i3 + 16;
            int i6 = i5 <= i4 ? 16 : i4 - i3;
            this.SN.zH(bArr, i3, i6);
            byte[] bArr2 = this.tF;
            int i7 = this.N;
            bArr2[0] = (byte) i7;
            bArr2[1] = (byte) (i7 >> 8);
            bArr2[2] = (byte) (i7 >> 16);
            bArr2[3] = (byte) (i7 >> 24);
            for (int i8 = 4; i8 <= 15; i8++) {
                bArr2[i8] = 0;
            }
            this.yq.yq(this.tF, this.zH);
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = i3 + i9;
                bArr[i10] = (byte) (bArr[i10] ^ this.zH[i9]);
            }
            this.N++;
            i3 = i5;
        }
    }
}
