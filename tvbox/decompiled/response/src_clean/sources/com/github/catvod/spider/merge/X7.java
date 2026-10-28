package com.github.catvod.spider.merge;

import java.io.Serializable;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class X7 implements B8, Serializable {
    protected int Gc;
    protected int M;
    protected int N;
    protected int SN;
    protected String i;
    protected int t0 = -1;
    protected int tF;
    protected int yq;
    protected C0069Py<Ic, qk> zH;

    public X7(C0069Py<Ic, qk> py, int i, int i2, int i3, int i4) {
        this.N = -1;
        this.zH = py;
        this.yq = i;
        this.tF = i2;
        this.Gc = i3;
        this.M = i4;
        Ic ic = py.yq;
        if (ic != null) {
            this.SN = ic.getLine();
            this.N = py.yq.yq();
        }
    }

    @Override // com.github.catvod.spider.merge.YW
    public final int N() {
        return this.t0;
    }

    @Override // com.github.catvod.spider.merge.YW
    public final Ic SN() {
        return this.zH.yq;
    }

    @Override // com.github.catvod.spider.merge.YW
    public final int getChannel() {
        return this.tF;
    }

    @Override // com.github.catvod.spider.merge.YW
    public final int getLine() {
        return this.SN;
    }

    @Override // com.github.catvod.spider.merge.YW
    public final String getText() {
        int i;
        String str = this.i;
        if (str != null) {
            return str;
        }
        qk qkVar = this.zH.SN;
        if (qkVar == null) {
            return null;
        }
        int size = qkVar.size();
        int i2 = this.Gc;
        return (i2 >= size || (i = this.M) >= size) ? "<EOF>" : qkVar.tF(C0169qt.SN(i2, i));
    }

    @Override // com.github.catvod.spider.merge.YW
    public final int getType() {
        return this.yq;
    }

    @Override // com.github.catvod.spider.merge.B8
    public final void tF(int i) {
        this.t0 = i;
    }

    public final String toString() {
        String str;
        if (this.tF > 0) {
            StringBuilder yq = by.yq(",channel=");
            yq.append(this.tF);
            str = yq.toString();
        } else {
            str = "";
        }
        String text = getText();
        String replace = text != null ? text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String valueOf = String.valueOf(this.yq);
        StringBuilder yq2 = by.yq("[@");
        yq2.append(this.t0);
        yq2.append(",");
        yq2.append(this.Gc);
        yq2.append(":");
        yq2.append(this.M);
        yq2.append("='");
        yq2.append(replace);
        yq2.append("',<");
        yq2.append(valueOf);
        yq2.append(">");
        yq2.append(str);
        yq2.append(",");
        yq2.append(this.SN);
        yq2.append(":");
        yq2.append(this.N);
        yq2.append("]");
        return yq2.toString();
    }

    @Override // com.github.catvod.spider.merge.YW
    public final int yq() {
        return this.N;
    }
}
