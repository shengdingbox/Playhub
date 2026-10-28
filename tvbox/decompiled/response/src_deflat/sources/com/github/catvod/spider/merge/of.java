package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class of implements u5 {
    private Ao yq;

    public of(char[] cArr, long j, long j2, byte[] bArr) {
        byte yq;
        Ao ao = new Ao();
        this.yq = ao;
        if (cArr == null || cArr.length <= 0) {
            throw new RH("Wrong password!", 1);
        }
        ao.SN(cArr);
        int i = 0;
        byte b = bArr[0];
        while (i < 12) {
            i++;
            if (i != 12 || (yq = (byte) (this.yq.yq() ^ b)) == ((byte) (j >> 24)) || yq == ((byte) (j2 >> 8))) {
                Ao ao2 = this.yq;
                ao2.N((byte) (ao2.yq() ^ b));
                if (i != 12) {
                    b = bArr[i];
                }
            } else {
                throw new RH("Wrong password!", 1);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.u5
    public final int yq(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new RH("one of the input parameters were null in standard decrypt data");
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            byte yq = (byte) (((bArr[i3] & 255) ^ this.yq.yq()) & 255);
            this.yq.N(yq);
            bArr[i3] = yq;
        }
        return i2;
    }
}
