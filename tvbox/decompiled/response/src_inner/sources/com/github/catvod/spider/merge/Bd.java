package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Bd extends J {
    private final Uz i;
    private final boolean t0;

    public Bd(Bd bd, AbstractC0137mG mGVar) {
        super(bd, mGVar, bd.N, bd.zH);
        this.i = bd.i;
        this.t0 = tF(bd, mGVar);
    }

    public Bd(Bd bd, AbstractC0137mG mGVar, Bp bp) {
        super(bd, mGVar, bp, bd.zH);
        this.i = bd.i;
        this.t0 = tF(bd, mGVar);
    }

    public Bd(Bd bd, AbstractC0137mG mGVar, Uz uz) {
        super(bd, mGVar, bd.N, bd.zH);
        this.i = uz;
        this.t0 = tF(bd, mGVar);
    }

    public Bd(AbstractC0137mG mGVar, int i, Bp bp) {
        super(mGVar, i, bp, r2.yq);
        this.t0 = false;
        this.i = null;
    }

    private static boolean tF(Bd bd, AbstractC0137mG mGVar) {
        return bd.t0 || ((mGVar instanceof V2) && ((V2) mGVar).Gc);
    }

    @Override // com.github.catvod.spider.merge.J
    public final int hashCode() {
        return A4.zH(A4.M(A4.Gc(A4.M(A4.M(A4.Gc(A4.Gc(7, this.yq.SN), this.SN), this.N), this.zH), this.t0 ? 1 : 0), this.i), 6);
    }

    public final boolean i() {
        return this.t0;
    }

    @Override // com.github.catvod.spider.merge.J
    public final boolean yq(J j) {
        boolean z = true;
        if (this == j) {
            return true;
        }
        if (!(j instanceof Bd)) {
            return false;
        }
        Bd bd = (Bd) j;
        if (this.t0 != bd.t0) {
            return false;
        }
        Uz uz = this.i;
        Uz uz2 = bd.i;
        if (uz != null) {
            z = uz.equals(uz2);
        } else if (uz2 != null) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return super.yq(j);
    }

    public final Uz zH() {
        return this.i;
    }
}
