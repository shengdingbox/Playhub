package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class cS extends xc {
    public final int N;
    public final int SN;

    public cS(AbstractC0137mG mGVar, int i, int i2) {
        super(mGVar);
        this.SN = i;
        this.N = i2;
    }

    @Override // com.github.catvod.spider.merge.xc
    public final boolean tF(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder yq = by.yq("action_");
        yq.append(this.SN);
        yq.append(":");
        yq.append(this.N);
        return yq.toString();
    }

    @Override // com.github.catvod.spider.merge.xc
    public final int yq() {
        return 6;
    }
}
