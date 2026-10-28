package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class RR extends cp {
    public final int N;
    public final int SN;
    public final boolean tF;

    public RR(AbstractC0137mG mGVar, int i, int i2, boolean z) {
        super(mGVar);
        this.SN = i;
        this.N = i2;
        this.tF = z;
    }

    @Override // com.github.catvod.spider.merge.xc
    public final boolean SN() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.xc
    public final boolean tF(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder yq = by.yq("pred_");
        yq.append(this.SN);
        yq.append(":");
        yq.append(this.N);
        return yq.toString();
    }

    @Override // com.github.catvod.spider.merge.xc
    public final int yq() {
        return 4;
    }
}
