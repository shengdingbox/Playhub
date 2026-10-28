package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class we extends InputStream {
    private long tF;
    private InputStream yq;
    private long SN = 0;
    private byte[] N = new byte[1];

    public we(InputStream inputStream, long j) {
        this.yq = inputStream;
        this.tF = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.yq.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.N) == -1) {
            return -1;
        }
        return this.N[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.tF;
        if (j != -1) {
            long j2 = this.SN;
            if (j2 >= j) {
                return -1;
            }
            if (i2 > j - j2) {
                i2 = (int) (j - j2);
            }
        }
        int read = this.yq.read(bArr, i, i2);
        if (read > 0) {
            this.SN += read;
        }
        return read;
    }

    public final int yq(byte[] bArr) {
        int read = this.yq.read(bArr);
        if (read != bArr.length) {
            int length = bArr.length - read;
            int i = 0;
            for (int i2 = 0; read < bArr.length && i != -1 && i2 < 15; i2++) {
                i += this.yq.read(bArr, read, length);
                if (i > 0) {
                    read += i;
                    length -= i;
                }
            }
            if (read != bArr.length) {
                throw new IOException("Cannot read fully into byte buffer");
            }
        }
        return read;
    }
}
