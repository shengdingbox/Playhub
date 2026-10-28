package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Rx extends xc {
    public final int SN;

    public Rx(AbstractC0137mG mGVar, int i) {
        super(mGVar);
        this.SN = i;
    }

    @Override // com.github.catvod.spider.merge.xc
    public final C0184ta N() {
        int i = this.SN;
        C0184ta taVar = new C0184ta(new int[0]);
        taVar.yq(i);
        return taVar;
    }

    @Override // com.github.catvod.spider.merge.xc
    public final boolean tF(int i, int i2) {
        return this.SN == i;
    }

    public final String toString() {
        return String.valueOf(this.SN);
    }

    @Override // com.github.catvod.spider.merge.xc
    public final int yq() {
        return 5;
    }
}
