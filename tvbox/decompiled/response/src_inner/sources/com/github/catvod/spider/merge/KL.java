package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class KL {
    private x5 N;
    private int SN;
    private int tF = -1;
    private J7 yq;
    private RT zH;

    public final void N(int i) {
        this.tF = i;
    }

    public final void SN(int i) {
        this.SN = i;
    }

    public final void i(x5 x5Var) {
        this.N = x5Var;
    }

    public final void tF(RT rt) {
        this.zH = rt;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.yq);
        sb.append("\n ecLevel: ");
        sb.append(C0136m.i(this.SN));
        sb.append("\n version: ");
        sb.append(this.N);
        sb.append("\n maskPattern: ");
        sb.append(this.tF);
        if (this.zH == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.zH);
        }
        sb.append(">>\n");
        return sb.toString();
    }

    public final RT yq() {
        return this.zH;
    }

    public final void zH(J7 j7) {
        this.yq = j7;
    }
}
