package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class NO implements em {
    public YW yq;

    public NO(YW yw) {
        this.yq = yw;
    }

    @Override // com.github.catvod.spider.merge.em
    public final YW SN() {
        return this.yq;
    }

    @Override // com.github.catvod.spider.merge.wA
    public final String getText() {
        return this.yq.getText();
    }

    public final String toString() {
        return this.yq.getType() == -1 ? "<EOF>" : this.yq.getText();
    }

    @Override // com.github.catvod.spider.merge.wA
    public <T> T yq(l4<? extends T> l4Var) {
        l4Var.M();
        return null;
    }
}
