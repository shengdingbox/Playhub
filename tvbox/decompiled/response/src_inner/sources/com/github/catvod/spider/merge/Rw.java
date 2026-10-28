package com.github.catvod.spider.merge;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Rw {
    private final byte[] yq = new byte[2];
    private final byte[] SN = new byte[4];
    private final byte[] N = new byte[8];

    private void yq(InputStream inputStream, byte[] bArr, int i) {
        if (FO.v3(inputStream, bArr, 0, i) != i) {
            throw new RH("Could not fill buffer");
        }
    }

    public final int B(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public final long Gc(InputStream inputStream) {
        Arrays.fill(this.N, (byte) 0);
        yq(inputStream, this.N, 4);
        return t0(this.N, 0);
    }

    public final int KJ(InputStream inputStream) {
        byte[] bArr = this.yq;
        yq(inputStream, bArr, bArr.length);
        return B(this.yq, 0);
    }

    public final long M(RandomAccessFile randomAccessFile) {
        Arrays.fill(this.N, (byte) 0);
        randomAccessFile.readFully(this.N, 0, 4);
        return t0(this.N, 0);
    }

    public final int N(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.SN);
        return tF(this.SN, 0);
    }

    public final int SN(InputStream inputStream) {
        yq(inputStream, this.SN, 4);
        return tF(this.SN, 0);
    }

    public final long i(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.N);
        return t0(this.N, 0);
    }

    public final int q(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.yq);
        return B(this.yq, 0);
    }

    public final long t0(byte[] bArr, int i) {
        if (bArr.length - i < 8) {
            Arrays.fill(this.N, (byte) 0);
        }
        System.arraycopy(bArr, i, this.N, 0, bArr.length < 8 ? bArr.length - i : 8);
        byte[] bArr2 = this.N;
        return ((((((((((((((0 | (bArr2[7] & 255)) << 8) | (bArr2[6] & 255)) << 8) | (bArr2[5] & 255)) << 8) | (bArr2[4] & 255)) << 8) | (bArr2[3] & 255)) << 8) | (bArr2[2] & 255)) << 8) | (bArr2[1] & 255)) << 8) | (bArr2[0] & 255);
    }

    public final int tF(byte[] bArr, int i) {
        return ((((bArr[i + 3] & 255) << 8) | (bArr[i + 2] & 255)) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public final long zH(InputStream inputStream) {
        byte[] bArr = this.N;
        yq(inputStream, bArr, bArr.length);
        return t0(this.N, 0);
    }
}
