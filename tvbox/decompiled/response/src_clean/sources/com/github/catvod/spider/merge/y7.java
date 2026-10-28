package com.github.catvod.spider.merge;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class y7 extends AbstractC0147ma {
    private int i;
    private byte[] tF;
    private byte[] zH = new byte[1];
    private Inflater N = new Inflater(true);

    public y7(AbstractC0113h0 h0Var, int i) {
        super(h0Var);
        this.tF = new byte[i];
    }

    @Override // com.github.catvod.spider.merge.AbstractC0147ma
    public final void N(PushbackInputStream pushbackInputStream) {
        int remaining = this.N.getRemaining();
        if (remaining > 0) {
            pushbackInputStream.unread(SN(), this.i - remaining, remaining);
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0147ma, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Inflater inflater = this.N;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0147ma, java.io.InputStream
    public final int read() {
        if (read(this.zH) == -1) {
            return -1;
        }
        return this.zH[0];
    }

    @Override // com.github.catvod.spider.merge.AbstractC0147ma, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        throw new java.io.EOFException("Unexpected end of input stream");
     */
    @Override // com.github.catvod.spider.merge.AbstractC0147ma, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
        L0:
            java.util.zip.Inflater r0 = r4.N     // Catch: java.util.zip.DataFormatException -> L40
            int r0 = r0.inflate(r5, r6, r7)     // Catch: java.util.zip.DataFormatException -> L40
            if (r0 != 0) goto L3f
            java.util.zip.Inflater r0 = r4.N     // Catch: java.util.zip.DataFormatException -> L40
            boolean r0 = r0.finished()     // Catch: java.util.zip.DataFormatException -> L40
            r1 = -1
            if (r0 != 0) goto L3e
            java.util.zip.Inflater r0 = r4.N     // Catch: java.util.zip.DataFormatException -> L40
            boolean r0 = r0.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L40
            if (r0 == 0) goto L1a
            goto L3e
        L1a:
            java.util.zip.Inflater r0 = r4.N     // Catch: java.util.zip.DataFormatException -> L40
            boolean r0 = r0.needsInput()     // Catch: java.util.zip.DataFormatException -> L40
            if (r0 == 0) goto L0
            byte[] r0 = r4.tF     // Catch: java.util.zip.DataFormatException -> L40
            int r2 = r0.length     // Catch: java.util.zip.DataFormatException -> L40
            r3 = 0
            int r0 = super.read(r0, r3, r2)     // Catch: java.util.zip.DataFormatException -> L40
            r4.i = r0     // Catch: java.util.zip.DataFormatException -> L40
            if (r0 == r1) goto L36
            java.util.zip.Inflater r1 = r4.N     // Catch: java.util.zip.DataFormatException -> L40
            byte[] r2 = r4.tF     // Catch: java.util.zip.DataFormatException -> L40
            r1.setInput(r2, r3, r0)     // Catch: java.util.zip.DataFormatException -> L40
            goto L0
        L36:
            java.io.EOFException r5 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L40
            java.lang.String r6 = "Unexpected end of input stream"
            r5.<init>(r6)     // Catch: java.util.zip.DataFormatException -> L40
            throw r5     // Catch: java.util.zip.DataFormatException -> L40
        L3e:
            return r1
        L3f:
            return r0
        L40:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            goto L48
        L47:
            throw r6
        L48:
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.y7.read(byte[], int, int):int");
    }

    @Override // com.github.catvod.spider.merge.AbstractC0147ma
    public final void yq(InputStream inputStream) {
        Inflater inflater = this.N;
        if (inflater != null) {
            inflater.end();
            this.N = null;
        }
        super.yq(inputStream);
    }
}
