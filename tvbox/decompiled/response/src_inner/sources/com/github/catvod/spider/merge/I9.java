package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class I9 extends AbstractC0113h0<of> {
    public I9(we weVar, Ki ki, char[] cArr, int i) {
        super(weVar, ki, cArr, i);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0113h0
    protected final of zH(Ki ki, char[] cArr) {
        long U = ki.U();
        long RQ = ki.RQ();
        byte[] bArr = new byte[12];
        i(bArr);
        return new of(cArr, U, RQ, bArr);
    }
}
