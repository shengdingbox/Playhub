package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class JN extends xc {
    public final int N;
    public final int SN;

    public JN(AbstractC0137mG mGVar, int i, int i2) {
        super(mGVar);
        this.SN = i;
        this.N = i2;
    }

    @Override // com.github.catvod.spider.merge.xc
    public final C0184ta N() {
        return C0184ta.t0(this.SN, this.N);
    }

    @Override // com.github.catvod.spider.merge.xc
    public final boolean tF(int i, int i2) {
        return i >= this.SN && i <= this.N;
    }

    public final String toString() {
        StringBuilder appendCodePoint = new StringBuilder("'").appendCodePoint(this.SN);
        appendCodePoint.append("'..'");
        StringBuilder appendCodePoint2 = appendCodePoint.appendCodePoint(this.N);
        appendCodePoint2.append("'");
        return appendCodePoint2.toString();
    }

    @Override // com.github.catvod.spider.merge.xc
    public final int yq() {
        return 2;
    }
}
