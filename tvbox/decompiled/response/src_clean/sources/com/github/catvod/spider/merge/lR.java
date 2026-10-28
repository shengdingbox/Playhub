package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.QY;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class lR extends AbstractC0199w {
    public static final boolean q;
    protected int Gc;
    protected ZV KJ;
    protected Tu M;
    protected C0132lE<Bp, Bp, Bp> i;
    protected Go t0;
    protected final Fw tF;
    public final ZV[] zH;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException unused) {
            str = null;
        }
        q = Boolean.parseBoolean(str);
    }

    public lR(Fw fw, N0 n0, ZV[] zvArr, C0172rS rSVar) {
        super(n0, rSVar);
        this.tF = fw;
        this.zH = zvArr;
    }

    protected static int dT(i3 i3Var) {
        Iterator<J> it = i3Var.iterator();
        int i = 0;
        while (it.hasNext()) {
            J next = it.next();
            if (i == 0) {
                i = next.SN;
            } else if (next.SN != i) {
                return 0;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
        if (r9 == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int B(com.github.catvod.spider.merge.ZV r17, com.github.catvod.spider.merge.QY r18, com.github.catvod.spider.merge.Go r19, int r20, com.github.catvod.spider.merge.Tu r21) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.lR.B(com.github.catvod.spider.merge.ZV, com.github.catvod.spider.merge.QY, com.github.catvod.spider.merge.Go, int, com.github.catvod.spider.merge.Tu):int");
    }

    protected final LX F5(Go go, Tu tu, i3 i3Var, int i) {
        return new LX(this.tF, go, go.get(i), go.i(1), tu);
    }

    protected final int G(i3 i3Var) {
        C0184ta taVar = new C0184ta(new int[0]);
        Iterator<J> it = i3Var.iterator();
        while (it.hasNext()) {
            J next = it.next();
            if (next.SN() > 0 || ((next.yq instanceof Tq) && next.N.zH())) {
                taVar.yq(next.SN);
            }
        }
        if (taVar.KJ() == 0) {
            return 0;
        }
        return taVar.zH();
    }

    protected final int G4(i3 i3Var, Tu tu) {
        int G;
        i3 i3Var2 = new i3(i3Var.Gc);
        i3 i3Var3 = new i3(i3Var.Gc);
        Iterator<J> it = i3Var.iterator();
        while (it.hasNext()) {
            J next = it.next();
            r2 r2Var = next.zH;
            if (r2Var == r2.yq || q(r2Var, tu)) {
                i3Var2.yq(next, null);
            } else {
                i3Var3.yq(next, null);
            }
        }
        int G2 = G(i3Var2);
        if (G2 != 0) {
            return G2;
        }
        if (i3Var3.size() <= 0 || (G = G(i3Var3)) == 0) {
            return 0;
        }
        return G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0141, code lost:
        if (r15 == 0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.github.catvod.spider.merge.i3 Gc(com.github.catvod.spider.merge.i3 r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.lR.Gc(com.github.catvod.spider.merge.i3, int, boolean):com.github.catvod.spider.merge.i3");
    }

    protected final BitSet KJ(QY.yq[] yqVarArr, Tu tu) {
        BitSet bitSet = new BitSet();
        for (QY.yq yqVar : yqVarArr) {
            r2 r2Var = yqVar.yq;
            if (r2Var == r2.yq || q(r2Var, tu)) {
                bitSet.set(yqVar.SN);
            }
        }
        return bitSet;
    }

    protected final i3 M(AbstractC0137mG mGVar, My my, boolean z) {
        Bp yq = Bp.yq(this.yq, my);
        i3 i3Var = new i3(z);
        int i = 0;
        while (i < mGVar.SN()) {
            int i2 = i + 1;
            i(new J(mGVar.tF(i).yq, i2, yq, r2.yq), i3Var, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return i3Var;
    }

    protected final QY N(ZV zv, QY qy, int i, QY qy2) {
        if (qy2 == null) {
            return null;
        }
        QY tF = tF(zv, qy2);
        if (i < -1 || i > this.yq.i) {
            return tF;
        }
        synchronized (qy) {
            if (qy.N == null) {
                qy.N = new QY[this.yq.i + 1 + 1];
            }
            qy.N[i + 1] = tF;
        }
        return tF;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.github.catvod.spider.merge.ZV, com.github.catvod.spider.merge.lE<com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp>] */
    public final int SN(Go go, int i, Tu tu) {
        this.t0 = go;
        this.Gc = go.Gc();
        this.M = tu;
        ZV zv = this.zH[i];
        this.KJ = zv;
        go.N();
        int i2 = this.Gc;
        try {
            QY yq = zv.SN() ? zv.yq(this.tF.F5()) : zv.SN;
            if (yq == null) {
                if (tu == null) {
                    tu = My.N;
                }
                i3 M = M(zv.tF, My.N, false);
                if (zv.SN()) {
                    zv.SN.SN = M;
                    yq = tF(zv, new QY(zH(M)));
                    zv.N(this.tF.F5(), yq);
                } else {
                    yq = tF(zv, new QY(M));
                    zv.SN = yq;
                }
            }
            return B(zv, yq, go, i2, tu);
        } finally {
            this.i = null;
            this.KJ = null;
            go.zH(i2);
            go.yq();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    protected final void i(J j, i3 i3Var, Set<J> set, boolean z, boolean z2, int i, boolean z3) {
        if (j.yq instanceof Tq) {
            if (!j.N.i()) {
                for (int i2 = 0; i2 < j.N.Gc(); i2++) {
                    if (j.N.tF(i2) != Integer.MAX_VALUE) {
                        J j2 = new J((AbstractC0137mG) this.yq.yq.get(j.N.tF(i2)), j.SN, j.N.N(i2), j.zH);
                        j2.tF = j.tF;
                        i(j2, i3Var, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        i3Var.yq(new J(j, j.yq, Bp.SN, j.zH), this.i);
                    } else {
                        t0(j, i3Var, set, z, z2, i, z3);
                    }
                }
                return;
            } else if (z2) {
                i3Var.yq(j, this.i);
                return;
            }
        }
        t0(j, i3Var, set, z, z2, i, z3);
    }

    protected final boolean q(r2 r2Var, Tu tu) {
        return r2Var.N(this.tF, tu);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0200  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void t0(com.github.catvod.spider.merge.J r17, com.github.catvod.spider.merge.i3 r18, java.util.Set<com.github.catvod.spider.merge.J> r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.lR.t0(com.github.catvod.spider.merge.J, com.github.catvod.spider.merge.i3, java.util.Set, boolean, boolean, int, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<com.github.catvod.spider.merge.QY, com.github.catvod.spider.merge.QY>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<com.github.catvod.spider.merge.QY, com.github.catvod.spider.merge.QY>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map<com.github.catvod.spider.merge.QY, com.github.catvod.spider.merge.QY>, java.util.HashMap] */
    protected final QY tF(ZV zv, QY qy) {
        if (qy == AbstractC0199w.N) {
            return qy;
        }
        synchronized (zv.yq) {
            QY qy2 = (QY) zv.yq.get(qy);
            if (qy2 != null) {
                return qy2;
            }
            qy.yq = zv.yq.size();
            i3 i3Var = qy.SN;
            if (!i3Var.yq) {
                i3Var.SN(this);
                i3 i3Var2 = qy.SN;
                i3Var2.yq = true;
                i3Var2.SN = null;
            }
            zv.yq.put(qy, qy);
            return qy;
        }
    }

    protected final void v3(ZV zv, int i, int i2, BitSet bitSet, i3 i3Var) {
        Fw fw = this.tF;
        if (fw != null) {
            ((PJ) fw.zH()).SN(this.tF, zv, i, i2, bitSet, i3Var);
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0199w
    public final void yq() {
    }

    protected final i3 zH(i3 i3Var) {
        Bp bp;
        r2 tF;
        HashMap hashMap = new HashMap();
        i3 i3Var2 = new i3(i3Var.Gc);
        Iterator<J> it = i3Var.iterator();
        while (it.hasNext()) {
            J next = it.next();
            if (next.SN == 1 && (tF = next.zH.tF(this.tF, this.M)) != null) {
                hashMap.put(Integer.valueOf(next.yq.SN), next.N);
                if (tF != next.zH) {
                    i3Var2.yq(new J(next, next.yq, next.N, tF), this.i);
                } else {
                    i3Var2.yq(next, this.i);
                }
            }
        }
        Iterator<J> it2 = i3Var.iterator();
        while (it2.hasNext()) {
            J next2 = it2.next();
            if (next2.SN != 1 && (next2.N() || (bp = (Bp) hashMap.get(Integer.valueOf(next2.yq.SN))) == null || !bp.equals(next2.N))) {
                i3Var2.yq(next2, this.i);
            }
        }
        return i3Var2;
    }
}
