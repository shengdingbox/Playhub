package com.github.catvod.spider.merge;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class W3 extends RandomAccessFile {
    private RandomAccessFile N;
    private File[] SN;
    private String i;
    private long yq;
    private byte[] tF = new byte[1];
    private int zH = 0;

    public W3(File file, String str, File[] fileArr) {
        super(file, str);
        close();
        if (!C0202x.i(2).equals(str)) {
            int i = 1;
            for (File file2 : fileArr) {
                String name = file2.getName();
                String substring = !name.contains(".") ? "" : name.substring(name.lastIndexOf(".") + 1);
                try {
                    if (i == Integer.parseInt(substring)) {
                        i++;
                    } else {
                        throw new IOException("Split file number " + i + " does not exist");
                    }
                } catch (NumberFormatException unused) {
                    throw new IOException(zH.SN("Split file extension not in expected format. Found: ", substring, " expected of format: .001, .002, etc"));
                }
            }
            this.N = new RandomAccessFile(file, str);
            this.SN = fileArr;
            this.yq = file.length();
            this.i = str;
            return;
        }
        throw new IllegalArgumentException("write mode is not allowed for NumberedSplitRandomAccessFile");
    }

    private void SN(int i) {
        if (this.zH != i) {
            if (i <= this.SN.length - 1) {
                RandomAccessFile randomAccessFile = this.N;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.N = new RandomAccessFile(this.SN[i], this.i);
                this.zH = i;
                return;
            }
            throw new IOException("split counter greater than number of split files");
        }
    }

    public final void N(long j) {
        this.N.seek(j);
    }

    @Override // java.io.RandomAccessFile
    public final long getFilePointer() {
        return this.N.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public final long length() {
        return this.N.length();
    }

    @Override // java.io.RandomAccessFile
    public final int read() {
        if (read(this.tF) == -1) {
            return -1;
        }
        return this.tF[0] & 255;
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.N.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = this.zH;
        if (i3 == this.SN.length - 1) {
            return -1;
        }
        SN(i3 + 1);
        return read(bArr, i, i2);
    }

    @Override // java.io.RandomAccessFile
    public final void seek(long j) {
        int i = (int) (j / this.yq);
        if (i != this.zH) {
            SN(i);
        }
        this.N.seek(j - (i * this.yq));
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        throw null;
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public final void yq() {
        SN(this.SN.length - 1);
    }
}
