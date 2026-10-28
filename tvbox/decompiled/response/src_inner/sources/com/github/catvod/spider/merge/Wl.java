package com.github.catvod.spider.merge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class Wl extends InputStream {
    private boolean N;
    protected File SN;
    private int tF;
    protected RandomAccessFile yq;
    private byte[] zH = new byte[1];

    public Wl(File file, boolean z, int i) {
        this.tF = 0;
        this.yq = new RandomAccessFile(file, C0202x.i(1));
        this.SN = file;
        this.N = z;
        if (z) {
            this.tF = i;
        }
    }

    public final void N(NJ nj) {
        if (this.N && this.tF != nj.cp()) {
            SN(nj.cp());
            this.tF = nj.cp();
        }
        this.yq.seek(nj.cS());
    }

    protected final void SN(int i) {
        File yq = yq(i);
        if (yq.exists()) {
            this.yq.close();
            this.yq = new RandomAccessFile(yq, C0202x.i(1));
            return;
        }
        throw new FileNotFoundException("zip split file does not exist: " + yq);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFile = this.yq;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.zH) == -1) {
            return -1;
        }
        return this.zH[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.yq.read(bArr, i, i2);
        if ((read == i2 && read != -1) || !this.N) {
            return read;
        }
        SN(this.tF + 1);
        this.tF++;
        if (read < 0) {
            read = 0;
        }
        int read2 = this.yq.read(bArr, read, i2 - read);
        return read2 > 0 ? read + read2 : read;
    }

    protected abstract File yq(int i);
}
