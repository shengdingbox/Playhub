package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class c6 extends InputStream {
    private H0 M;
    private AbstractC0147ma SN;
    private byte[] t0;
    private char[] tF;
    private PushbackInputStream yq;
    private Ki zH;
    private Z8 N = new Z8();
    private CRC32 i = new CRC32();
    private boolean Gc = false;
    private boolean KJ = false;
    private boolean q = false;

    public c6(InputStream inputStream, char[] cArr, H0 h0) {
        if (h0.yq() >= 512) {
            this.yq = new PushbackInputStream(inputStream, h0.yq());
            this.tF = cArr;
            this.M = h0;
            return;
        }
        throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
    }

    private boolean N(Ki ki) {
        return ki.R() && kR.tF(2, ki.Fz());
    }

    private void yq() {
        this.SN.N(this.yq);
        this.SN.yq(this.yq);
        int i = 1;
        if (this.zH.xU() && !this.Gc) {
            Z8 z8 = this.N;
            PushbackInputStream pushbackInputStream = this.yq;
            List<bA> E1 = this.zH.E1();
            boolean z = false;
            if (E1 != null) {
                Iterator<bA> it = E1.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().g() == A7.SN(11)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            C0173rT tF = z8.tF(pushbackInputStream, z);
            this.zH.lF(tF.Dr());
            this.zH.L(tF.H());
            this.zH.Q4(tF.g());
        }
        if ((this.zH.Fz() != 4 || !kR.tF(this.zH.Dr().g(), 2)) && this.zH.U() != this.i.getValue()) {
            if (!N(this.zH)) {
                i = 3;
            }
            StringBuilder yq = by.yq("Reached end of entry, but crc verification failed for ");
            yq.append(this.zH.m());
            throw new RH(yq.toString(), i);
        }
        this.zH = null;
        this.i.reset();
        this.q = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010c, code lost:
        if (com.github.catvod.spider.merge.kR.tF(r12.Fz(), 2) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.github.catvod.spider.merge.Ki SN(com.github.catvod.spider.merge.NJ r12) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.c6.SN(com.github.catvod.spider.merge.NJ):com.github.catvod.spider.merge.Ki");
    }

    @Override // java.io.InputStream
    public final int available() {
        if (!this.KJ) {
            return !this.q ? 1 : 0;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.KJ) {
            AbstractC0147ma maVar = this.SN;
            if (maVar != null) {
                maVar.close();
            }
            this.KJ = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.KJ) {
            throw new IOException("Stream closed");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Negative read length");
        } else if (i2 == 0) {
            return 0;
        } else {
            Ki ki = this.zH;
            if (ki == null || ki.N0()) {
                return -1;
            }
            try {
                int read = this.SN.read(bArr, i, i2);
                if (read == -1) {
                    yq();
                } else {
                    this.i.update(bArr, i, read);
                }
                return read;
            } catch (IOException e) {
                if (N(this.zH)) {
                    throw new RH(e.getMessage(), e.getCause());
                }
                throw e;
            }
        }
    }
}
