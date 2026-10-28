package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class zg extends wg<Integer, C0192uc> implements Ic {
    public int B;
    public int G;
    public int KJ;
    public int M;
    public boolean q;
    public YW t0;
    public qk tF;
    protected C0069Py<Ic, qk> zH;
    protected AbstractC0119i8<?> i = eb.yq;
    public int Gc = -1;
    public final C0185tj G4 = new C0185tj();
    public int dT = 0;

    public zg(qk qkVar) {
        this.tF = qkVar;
        this.zH = new C0069Py<>(this, qkVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.eb, com.github.catvod.spider.merge.i8<?>] */
    public final YW KJ() {
        int t0 = ((C0192uc) this.SN).t0();
        YW SN = this.i.SN(this.zH, -1, null, 0, this.tF.Gc(), this.tF.Gc() - 1, ((C0192uc) this.SN).Gc(), t0);
        this.t0 = SN;
        return SN;
    }

    @Override // com.github.catvod.spider.merge.Ic
    public final AbstractC0119i8<? extends YW> N() {
        return this.i;
    }

    @Override // com.github.catvod.spider.merge.Ic
    public final qk SN() {
        return this.tF;
    }

    @Override // com.github.catvod.spider.merge.Ic
    public final int getLine() {
        return ((C0192uc) this.SN).Gc();
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.github.catvod.spider.merge.eb, com.github.catvod.spider.merge.i8<?>] */
    @Override // com.github.catvod.spider.merge.Ic
    public final YW nextToken() {
        int i;
        qk qkVar = this.tF;
        if (qkVar != null) {
            qkVar.N();
            while (true) {
                try {
                    if (this.q) {
                        KJ();
                        break;
                    }
                    this.t0 = null;
                    this.B = 0;
                    this.Gc = this.tF.Gc();
                    this.KJ = ((C0192uc) this.SN).t0();
                    this.M = ((C0192uc) this.SN).Gc();
                    while (true) {
                        this.G = 0;
                        try {
                            i = ((C0192uc) this.SN).M(this.tF, this.dT);
                        } catch (MT e) {
                            q(e);
                            if (this.tF.t0(1) != -1) {
                                ((C0192uc) this.SN).zH(this.tF);
                            }
                            i = -3;
                        }
                        if (this.tF.t0(1) == -1) {
                            this.q = true;
                        }
                        if (this.G == 0) {
                            this.G = i;
                        }
                        int i2 = this.G;
                        if (i2 == -3) {
                            break;
                        } else if (i2 != -2) {
                            if (this.t0 == null) {
                                this.t0 = this.i.SN(this.zH, i2, null, this.B, this.Gc, this.tF.Gc() - 1, this.M, this.KJ);
                            }
                        }
                    }
                } finally {
                    this.tF.yq();
                }
            }
            return this.t0;
        }
        throw new IllegalStateException("nextToken requires a non-null input stream.");
    }

    public final void q(MT mt) {
        char[] charArray;
        qk qkVar = this.tF;
        String tF = qkVar.tF(C0169qt.SN(this.Gc, qkVar.Gc()));
        StringBuilder yq = by.yq("token recognition error at: '");
        StringBuilder sb = new StringBuilder();
        for (char c : tF.toCharArray()) {
            String valueOf = String.valueOf(c);
            if (c == 65535) {
                valueOf = "<EOF>";
            } else if (c == '\r') {
                valueOf = "\\r";
            } else if (c == '\t') {
                valueOf = "\\t";
            } else if (c == '\n') {
                valueOf = "\\n";
            }
            sb.append(valueOf);
        }
        yq.append(sb.toString());
        yq.append("'");
        ((PJ) zH()).yq(this, null, this.M, this.KJ, yq.toString(), mt);
    }

    @Override // com.github.catvod.spider.merge.Ic
    public final int yq() {
        return ((C0192uc) this.SN).t0();
    }
}
