package com.github.catvod.spider.merge;

import java.io.FilterOutputStream;
import java.io.OutputStream;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Tw extends FilterOutputStream {
    public Tw(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            ((FilterOutputStream) this).out.write("\r\n".getBytes());
        }
    }

    public final void yq() {
        ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
    }
}
