package com.github.catvod.spider.mergeguard.oOoOoOoOoOoOoO0o;

import java.io.RandomAccessFile;
import java.util.zip.ZipException;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
final class oOo0oOo0Oo0oO0Oo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static oOoOo0O0Oo0o0OoO oOoOoOoOoOoOoO0o(RandomAccessFile randomAccessFile) {
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
                    oOoOo0O0Oo0o0OoO ooooo0o0oo0o0ooo = new oOoOo0O0Oo0o0OoO();
                    ooooo0o0oo0o0ooo.oOo0oOo0Oo0oO0Oo = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    ooooo0o0oo0o0ooo.oOoOoOoOoOoOoO0o = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return ooooo0o0oo0o0ooo;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder oOoOoOoOoOoOoO0o = oOoOoOoOoOoOoO0o.oOoOoOoOoOoOoO0o("File too short to be a zip file: ");
        oOoOoOoOoOoOoO0o.append(randomAccessFile.length());
        throw new ZipException(oOoOoOoOoOoOoO0o.toString());
    }
}
