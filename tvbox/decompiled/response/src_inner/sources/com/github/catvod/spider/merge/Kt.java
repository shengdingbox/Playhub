package com.github.catvod.spider.merge;

import java.io.RandomAccessFile;
import java.util.zip.ZipException;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class Kt {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static class yq {
        long SN;
        long yq;

        yq() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static yq yq(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    yq yqVar = new yq();
                    yqVar.SN = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    yqVar.yq = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return yqVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder yq2 = by.yq("File too short to be a zip file: ");
        yq2.append(randomAccessFile.length());
        throw new ZipException(yq2.toString());
    }
}
