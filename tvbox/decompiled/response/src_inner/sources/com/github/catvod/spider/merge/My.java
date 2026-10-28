package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class My implements e2 {
    public static final Tu N = new Tu();
    public int SN;
    public My yq;

    public My() {
        this.SN = -1;
    }

    public My(My my, int i) {
        this.yq = my;
        this.SN = i;
    }

    @Override // com.github.catvod.spider.merge.wA
    public wA N(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.wA
    public final String getText() {
        if (tF() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tF(); i++) {
            sb.append(N(i).getText());
        }
        return sb.toString();
    }

    public final boolean i() {
        return this.SN == -1;
    }

    @Override // com.github.catvod.spider.merge.wA
    public int tF() {
        throw null;
    }

    public final String toString() {
        StringBuilder yq = by.yq("[");
        for (My my = this; my != null; my = my.yq) {
            if (!my.i()) {
                yq.append(my.SN);
            }
            My my2 = my.yq;
            if (my2 != null && !my2.i()) {
                yq.append(" ");
            }
        }
        yq.append("]");
        return yq.toString();
    }

    @Override // com.github.catvod.spider.merge.wA
    public <T> T yq(l4<? extends T> l4Var) {
        return l4Var.tF(this);
    }

    public int zH() {
        return -1;
    }
}
