package com.github.catvod.spider.merge;

import java.io.InputStream;
import java.io.PushbackInputStream;
/* renamed from: com.github.catvod.spider.merge.ma  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
abstract class AbstractC0147ma extends InputStream {
    protected byte[] SN = new byte[1];
    private AbstractC0113h0 yq;

    public AbstractC0147ma(AbstractC0113h0 h0Var) {
        this.yq = h0Var;
    }

    public void N(PushbackInputStream pushbackInputStream) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] SN() {
        return this.yq.N();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.yq.close();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.SN) == -1) {
            return -1;
        }
        return this.SN[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.yq.read(bArr, i, i2);
    }

    public void yq(InputStream inputStream) {
        this.yq.yq(inputStream);
    }
}
