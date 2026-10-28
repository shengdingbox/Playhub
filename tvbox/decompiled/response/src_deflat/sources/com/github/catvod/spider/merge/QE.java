package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Va;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class QE extends AbstractC0161pY {
    public QE(String str) {
        this.tF = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.merge.AbstractC0161pY, com.github.catvod.spider.merge.MA
    public final MA B() {
        return this;
    }

    public final String E1() {
        return H();
    }

    /* renamed from: Fz */
    public QE clone() {
        return (QE) super.clone();
    }

    @Override // com.github.catvod.spider.merge.MA
    void Gd(Appendable appendable, int i, Va.yq yqVar) {
    }

    @Override // com.github.catvod.spider.merge.AbstractC0161pY, com.github.catvod.spider.merge.MA
    public final /* bridge */ /* synthetic */ int t0() {
        return 0;
    }

    public final boolean tO() {
        return P1.tF(H());
    }

    @Override // com.github.catvod.spider.merge.MA
    public final String toString() {
        return ee();
    }

    @Override // com.github.catvod.spider.merge.MA
    public String v() {
        return "#text";
    }

    @Override // com.github.catvod.spider.merge.MA
    void xa(Appendable appendable, int i, Va.yq yqVar) {
        boolean z;
        boolean z2;
        boolean t0 = yqVar.t0();
        MA ma = this.yq;
        hN hNVar = ma instanceof hN ? (hN) ma : null;
        boolean z3 = true;
        boolean z4 = t0 && !hN.cp(ma);
        if (z4) {
            boolean z5 = (this.SN == 0 && hNVar != null && hNVar.I().N()) || (this.yq instanceof Va);
            boolean z6 = W() == null && hNVar != null && hNVar.I().N();
            MA W = W();
            if ((!(W instanceof hN) || !((hN) W).x(yqVar)) && (!(W instanceof QE) || !((QE) W).tO())) {
                z3 = false;
            }
            if (!z3 || !tO()) {
                if (this.SN == 0 && hNVar != null && hNVar.I().yq() && !tO()) {
                    v3(appendable, i, yqVar);
                }
                z2 = z5;
                z = z6;
            } else {
                return;
            }
        } else {
            z2 = false;
            z = false;
        }
        C0123il.tF(appendable, H(), yqVar, false, z4, z2, z);
    }
}
