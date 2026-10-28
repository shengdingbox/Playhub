package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.u5;
import java.io.InputStream;
/* renamed from: com.github.catvod.spider.merge.h0  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
abstract class AbstractC0113h0<T extends u5> extends InputStream {
    private byte[] N;
    private T SN;
    private byte[] tF = new byte[1];
    private we yq;
    private Ki zH;

    public AbstractC0113h0(we weVar, Ki ki, char[] cArr, int i) {
        this.yq = weVar;
        this.SN = zH(ki, cArr);
        this.zH = ki;
        if (kR.tF(FO.Gc(ki), 2)) {
            this.N = new byte[i];
        }
    }

    public final byte[] N() {
        return this.N;
    }

    public final T SN() {
        return this.SN;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.yq.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int i(byte[] bArr) {
        return this.yq.yq(bArr);
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.tF) == -1) {
            return -1;
        }
        return this.tF[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int v3 = FO.v3(this.yq, bArr, i, i2);
        if (v3 > 0) {
            byte[] bArr2 = this.N;
            if (bArr2 != null) {
                System.arraycopy(bArr, 0, bArr2, 0, v3);
            }
            this.SN.yq(bArr, i, v3);
        }
        return v3;
    }

    public final Ki tF() {
        return this.zH;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void yq(InputStream inputStream) {
    }

    protected abstract T zH(Ki ki, char[] cArr);
}
