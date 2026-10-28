package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.Objects;
/* renamed from: com.github.catvod.spider.merge.uc  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0192uc extends AbstractC0199w {
    public final ZV[] Gc;
    protected final zg tF;
    protected int zH = -1;
    protected int i = 1;
    protected int t0 = 0;
    protected int M = 0;
    protected final yq KJ = new yq();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.github.catvod.spider.merge.uc$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        protected QY tF;
        protected int yq = -1;
        protected int SN = 0;
        protected int N = -1;

        protected yq() {
        }
    }

    public C0192uc(zg zgVar, N0 n0, ZV[] zvArr, C0172rS rSVar) {
        super(n0, rSVar);
        this.Gc = zvArr;
        this.tF = zgVar;
    }

    public final int Gc() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.Xo>, java.util.ArrayList] */
    protected final int KJ(qk qkVar) {
        AbstractC0137mG mGVar = (AbstractC0137mG) this.yq.M.get(this.M);
        hB hBVar = Bp.SN;
        Jr jr = new Jr();
        int i = 0;
        while (i < mGVar.SN()) {
            int i2 = i + 1;
            tF(qkVar, new Bd(mGVar.tF(i).yq, i2, hBVar), jr, false, false, false);
            i = i2;
        }
        boolean z = jr.i;
        jr.i = false;
        QY N = N(jr);
        if (!z) {
            this.Gc[this.M].SN = N;
        }
        return i(qkVar, N);
    }

    public final int M(qk qkVar, int i) {
        this.M = i;
        qkVar.N();
        try {
            this.zH = qkVar.Gc();
            yq yqVar = this.KJ;
            yqVar.yq = -1;
            yqVar.SN = 0;
            yqVar.N = -1;
            yqVar.tF = null;
            ZV zv = this.Gc[i];
            return zv.SN == null ? KJ(qkVar) : i(qkVar, zv.SN);
        } finally {
            qkVar.yq();
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map<com.github.catvod.spider.merge.QY, com.github.catvod.spider.merge.QY>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map<com.github.catvod.spider.merge.QY, com.github.catvod.spider.merge.QY>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map<com.github.catvod.spider.merge.QY, com.github.catvod.spider.merge.QY>, java.util.HashMap] */
    protected final QY N(i3 i3Var) {
        J j;
        QY qy = new QY(i3Var);
        Iterator<J> it = i3Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                j = null;
                break;
            }
            j = it.next();
            if (j.yq instanceof Tq) {
                break;
            }
        }
        if (j != null) {
            qy.tF = true;
            qy.i = ((Bd) j).zH();
            qy.zH = this.yq.t0[j.yq.N];
        }
        ZV zv = this.Gc[this.M];
        synchronized (zv.yq) {
            QY qy2 = (QY) zv.yq.get(qy);
            if (qy2 != null) {
                return qy2;
            }
            qy.yq = zv.yq.size();
            i3Var.yq = true;
            i3Var.SN = null;
            qy.SN = i3Var;
            zv.yq.put(qy, qy);
            return qy;
        }
    }

    protected final void SN(QY qy, int i, QY qy2) {
        if (i >= 0 && i <= 127) {
            synchronized (qy) {
                if (qy.N == null) {
                    qy.N = new QY[128];
                }
                qy.N[i + 0] = qy2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124 A[EDGE_INSN: B:81:0x0124->B:65:0x0124 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int i(com.github.catvod.spider.merge.qk r22, com.github.catvod.spider.merge.QY r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0192uc.i(com.github.catvod.spider.merge.qk, com.github.catvod.spider.merge.QY):int");
    }

    public final int t0() {
        return this.t0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    protected final boolean tF(qk qkVar, Bd bd, i3 i3Var, boolean z, boolean z2, boolean z3) {
        Bd bd2;
        Bd bd3;
        AbstractC0137mG mGVar = bd.yq;
        boolean z4 = true;
        if (mGVar instanceof Tq) {
            Bp bp = bd.N;
            if (bp == null || bp.zH()) {
                Bp bp2 = bd.N;
                if (bp2 == null || bp2.i()) {
                    i3Var.yq(bd, null);
                    return true;
                }
                i3Var.yq(new Bd(bd, bd.yq, Bp.SN), null);
            } else {
                z4 = z;
            }
            Bp bp3 = bd.N;
            if (bp3 == null || bp3.i()) {
                return z4;
            }
            boolean z5 = z4;
            for (int i = 0; i < bd.N.Gc(); i++) {
                if (bd.N.tF(i) != Integer.MAX_VALUE) {
                    z5 = tF(qkVar, new Bd(bd, (AbstractC0137mG) this.yq.yq.get(bd.N.tF(i)), bd.N.N(i)), i3Var, z5, z2, z3);
                }
            }
            return z5;
        }
        if (!mGVar.tF && (!z || !bd.i())) {
            i3Var.yq(bd, null);
        }
        AbstractC0137mG mGVar2 = bd.yq;
        boolean z6 = z;
        for (int i2 = 0; i2 < mGVar2.SN(); i2++) {
            xc tF = mGVar2.tF(i2);
            int yq2 = tF.yq();
            if (yq2 != 10) {
                switch (yq2) {
                    case 1:
                        bd3 = new Bd(bd, tF.yq);
                        bd2 = bd3;
                        break;
                    case 2:
                    case 5:
                    case 7:
                        if (z3 && tF.tF(-1, 1114111)) {
                            bd3 = new Bd(bd, tF.yq);
                            bd2 = bd3;
                            break;
                        }
                        bd2 = null;
                        break;
                    case 3:
                        bd2 = new Bd(bd, tF.yq, Nv.M(bd.N, ((C0133lY) tF).N.SN));
                        break;
                    case 4:
                        RR rr = (RR) tF;
                        i3Var.i = true;
                        if (this.tF != null && z2) {
                            int i3 = this.t0;
                            int i4 = this.i;
                            int Gc = qkVar.Gc();
                            qkVar.N();
                            try {
                                zH(qkVar);
                                Objects.requireNonNull(this.tF);
                            } finally {
                                this.t0 = i3;
                                this.i = i4;
                                qkVar.zH(Gc);
                                qkVar.yq();
                            }
                        }
                        bd3 = new Bd(bd, tF.yq);
                        bd2 = bd3;
                        break;
                    case 6:
                        Bp bp4 = bd.N;
                        if (bp4 != null && !bp4.zH()) {
                            bd3 = new Bd(bd, tF.yq);
                            bd2 = bd3;
                            break;
                        } else {
                            bd2 = new Bd(bd, tF.yq, Uz.yq(bd.zH(), this.yq.Gc[((cS) tF).N]));
                            break;
                        }
                        break;
                    default:
                        bd2 = null;
                        break;
                }
                if (bd2 != null) {
                    z6 = tF(qkVar, bd2, i3Var, z6, z2, z3);
                }
            } else {
                throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
            }
        }
        return z6;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0199w
    public final void yq() {
        yq yqVar = this.KJ;
        yqVar.yq = -1;
        yqVar.SN = 0;
        yqVar.N = -1;
        yqVar.tF = null;
        this.zH = -1;
        this.i = 1;
        this.t0 = 0;
        this.M = 0;
    }

    public final void zH(qk qkVar) {
        if (qkVar.t0(1) == 10) {
            this.i++;
            this.t0 = 0;
        } else {
            this.t0++;
        }
        qkVar.KJ();
    }
}
