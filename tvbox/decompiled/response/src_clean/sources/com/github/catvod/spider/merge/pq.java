package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class pq extends xc {
    public final C0184ta SN;

    public pq(AbstractC0137mG mGVar, C0184ta taVar) {
        super(mGVar);
        if (taVar == null) {
            taVar = new C0184ta(new int[0]);
            taVar.yq(0);
        }
        this.SN = taVar;
    }

    @Override // com.github.catvod.spider.merge.xc
    public final C0184ta N() {
        return this.SN;
    }

    @Override // com.github.catvod.spider.merge.xc
    public boolean tF(int i, int i2) {
        return this.SN.tF(i);
    }

    public String toString() {
        return this.SN.toString();
    }

    @Override // com.github.catvod.spider.merge.xc
    public int yq() {
        return 7;
    }
}
