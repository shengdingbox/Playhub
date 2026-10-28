package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class OB extends AbstractC0113h0<yq> {
    private byte[] i = new byte[1];
    private byte[] t0 = new byte[16];
    private int Gc = 0;
    private int M = 0;
    private int KJ = 0;
    private int q = 0;
    private int B = 0;
    private int G = 0;

    public OB(we weVar, Ki ki, char[] cArr, int i) {
        super(weVar, ki, cArr, i);
    }

    private void t0(byte[] bArr, int i) {
        int i2 = this.KJ;
        int i3 = this.M;
        if (i2 >= i3) {
            i2 = i3;
        }
        this.G = i2;
        System.arraycopy(this.t0, this.Gc, bArr, i, i2);
        int i4 = this.G;
        int i5 = this.Gc + i4;
        this.Gc = i5;
        if (i5 >= 15) {
            this.Gc = 15;
        }
        int i6 = this.M - i4;
        this.M = i6;
        if (i6 <= 0) {
            this.M = 0;
        }
        this.B += i4;
        this.KJ -= i4;
        this.q += i4;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0113h0, java.io.InputStream
    public final int read() {
        if (read(this.i) == -1) {
            return -1;
        }
        return this.i[0];
    }

    @Override // com.github.catvod.spider.merge.AbstractC0113h0, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0113h0, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        this.KJ = i2;
        this.q = i;
        this.B = 0;
        if (this.M != 0) {
            t0(bArr, i);
            int i3 = this.B;
            if (i3 == i2) {
                return i3;
            }
        }
        if (this.KJ < 16) {
            byte[] bArr2 = this.t0;
            int read = super.read(bArr2, 0, bArr2.length);
            this.Gc = 0;
            if (read == -1) {
                this.M = 0;
                int i4 = this.B;
                if (i4 > 0) {
                    return i4;
                }
                return -1;
            }
            this.M = read;
            t0(bArr, this.q);
            int i5 = this.B;
            if (i5 == i2) {
                return i5;
            }
        }
        int i6 = this.q;
        int i7 = this.KJ;
        int read2 = super.read(bArr, i6, i7 - (i7 % 16));
        if (read2 != -1) {
            return read2 + this.B;
        }
        int i8 = this.B;
        if (i8 > 0) {
            return i8;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.AbstractC0113h0
    public final void yq(InputStream inputStream) {
        byte[] bArr = new byte[10];
        if (FO.F5(inputStream, bArr) != 10) {
            throw new RH("Invalid AES Mac bytes. Could not read sufficient data");
        } else if (!tF().xU() || !kR.tF(2, FO.Gc(tF()))) {
            byte[] bArr2 = new byte[10];
            System.arraycopy(SN().SN(), 0, bArr2, 0, 10);
            if (!Arrays.equals(bArr, bArr2)) {
                throw new IOException("Reached end of data for this entry, but aes verification failed");
            }
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0113h0
    protected final yq zH(Ki ki, char[] cArr) {
        N Dr = ki.Dr();
        if (ki.Dr() != null) {
            byte[] bArr = new byte[C0202x.zH(ki.Dr().Dr())];
            i(bArr);
            byte[] bArr2 = new byte[2];
            i(bArr2);
            return new yq(Dr, cArr, bArr, bArr2);
        }
        throw new IOException("invalid aes extra data record");
    }
}
