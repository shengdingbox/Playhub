package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class J {
    public Bp N;
    public final int SN;
    public int tF;
    public final AbstractC0137mG yq;
    public final r2 zH;

    public J(J j, AbstractC0137mG mGVar, Bp bp, r2 r2Var) {
        this.yq = mGVar;
        this.SN = j.SN;
        this.N = bp;
        this.zH = r2Var;
        this.tF = j.tF;
    }

    public J(AbstractC0137mG mGVar, int i, Bp bp, r2 r2Var) {
        this.yq = mGVar;
        this.SN = i;
        this.N = bp;
        this.zH = r2Var;
    }

    public final boolean N() {
        return (this.tF & 1073741824) != 0;
    }

    public final int SN() {
        return this.tF & (-1073741825);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J)) {
            return false;
        }
        return yq((J) obj);
    }

    public int hashCode() {
        return A4.zH(A4.M(A4.M(A4.Gc(A4.Gc(7, this.yq.SN), this.SN), this.N), this.zH), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.yq);
        sb.append(",");
        sb.append(this.SN);
        if (this.N != null) {
            sb.append(",[");
            sb.append(this.N.toString());
            sb.append("]");
        }
        r2 r2Var = this.zH;
        if (!(r2Var == null || r2Var == r2.yq)) {
            sb.append(",");
            sb.append(this.zH);
        }
        if (SN() > 0) {
            sb.append(",up=");
            sb.append(SN());
        }
        sb.append(')');
        return sb.toString();
    }

    public boolean yq(J j) {
        Bp bp;
        Bp bp2;
        if (this == j) {
            return true;
        }
        return j != null && this.yq.SN == j.yq.SN && this.SN == j.SN && ((bp = this.N) == (bp2 = j.N) || (bp != null && bp.equals(bp2))) && this.zH.equals(j.zH) && N() == j.N();
    }
}
