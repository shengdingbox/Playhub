package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.Y4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class hN extends MA {
    private static final List<hN> Gc = Collections.emptyList();
    private static final String M = fx.v("baseUri");
    List<MA> i;
    fx t0;
    private AF tF;
    private WeakReference<List<hN>> zH;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN extends oJ<MA> {
        private final hN yq;

        SN(hN hNVar, int i) {
            super(i);
            this.yq = hNVar;
        }

        @Override // com.github.catvod.spider.merge.oJ
        public final void yq() {
            this.yq.LY();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq implements aA {
        final /* synthetic */ StringBuilder yq;

        yq(StringBuilder sb) {
            this.yq = sb;
        }

        @Override // com.github.catvod.spider.merge.aA
        public final void SN(MA ma, int i) {
            if (ma instanceof QE) {
                hN.k(this.yq, (QE) ma);
            } else if (ma instanceof hN) {
                hN hNVar = (hN) ma;
                if (this.yq.length() <= 0) {
                    return;
                }
                if ((hNVar.j() || hNVar.tF.KJ().equals("br")) && !QE.m(this.yq)) {
                    this.yq.append(' ');
                }
            }
        }

        @Override // com.github.catvod.spider.merge.aA
        public final void yq(MA ma, int i) {
            if ((ma instanceof hN) && ((hN) ma).j() && (ma.W() instanceof QE) && !QE.m(this.yq)) {
                this.yq.append(' ');
            }
        }
    }

    static {
        Pattern.compile("\\s+");
    }

    public hN(AF af, String str, fx fxVar) {
        li.B(af);
        this.i = MA.N;
        this.t0 = fxVar;
        this.tF = af;
        if (str != null) {
            q(str);
        }
    }

    private static void Fz(hN hNVar, kB kBVar) {
        hN hNVar2 = (hN) hNVar.yq;
        if (hNVar2 != null && !hNVar2.tl().equals("#root")) {
            kBVar.add(hNVar2);
            Fz(hNVar2, kBVar);
        }
    }

    private static <E extends hN> int XO(hN hNVar, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == hNVar) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z(MA ma, StringBuilder sb) {
        if (ma instanceof QE) {
            sb.append(((QE) ma).H());
        } else if ((ma instanceof hN) && ((hN) ma).tF.KJ().equals("br")) {
            sb.append("\n");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean cp(MA ma) {
        if (ma instanceof hN) {
            hN hNVar = (hN) ma;
            int i = 0;
            while (!hNVar.tF.q()) {
                hNVar = (hN) hNVar.yq;
                i++;
                if (i < 6) {
                    if (hNVar == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(StringBuilder sb, QE qe) {
        String H = qe.H();
        if (cp(qe.yq) || (qe instanceof O4)) {
            sb.append(H);
        } else {
            P1.yq(sb, H, QE.m(sb));
        }
    }

    @Override // com.github.catvod.spider.merge.MA
    public final MA B() {
        this.i.clear();
        return this;
    }

    public final int C() {
        MA ma = this.yq;
        if (((hN) ma) == null) {
            return 0;
        }
        return XO(this, ((hN) ma).R());
    }

    public final kB Cu() {
        kB kBVar = new kB();
        Fz(this, kBVar);
        return kBVar;
    }

    public final hN E1(MA ma) {
        MA ma2 = ma.yq;
        if (ma2 != null) {
            ma2.n(ma);
        }
        ma.yq = this;
        G();
        this.i.add(ma);
        ma.SN = this.i.size() - 1;
        return this;
    }

    public final String Fo() {
        StringBuilder SN2 = P1.SN();
        C0072So.M(new yq(SN2), this);
        return P1.Gc(SN2).trim();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.MA
    public final List<MA> G() {
        if (this.i == MA.N) {
            this.i = new SN(this, 4);
        }
        return this.i;
    }

    @Override // com.github.catvod.spider.merge.MA
    void Gd(Appendable appendable, int i, Va.yq yqVar) {
        if (!this.i.isEmpty() || !this.tF.M()) {
            if (yqVar.t0() && !this.i.isEmpty() && this.tF.yq()) {
                v3(appendable, i, yqVar);
            }
            appendable.append("</").append(tl()).append('>');
        }
    }

    public final String Hj() {
        fx fxVar = this.t0;
        return fxVar != null ? fxVar.G("id") : "";
    }

    public final AF I() {
        return this.tF;
    }

    public final kB J() {
        return new kB(R());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.MA
    public final MA KJ(MA ma) {
        hN hNVar = (hN) super.KJ(ma);
        fx fxVar = this.t0;
        hNVar.t0 = fxVar != null ? fxVar.clone() : null;
        SN sn = new SN(hNVar, this.i.size());
        hNVar.i = sn;
        sn.addAll(this.i);
        return hNVar;
    }

    public final hN L() {
        return (hN) this.yq;
    }

    final void LY() {
        this.zH = null;
    }

    public final hN N0() {
        return R().get(0);
    }

    public final hN OB(String str) {
        return PA.yq(str, this);
    }

    @Override // com.github.catvod.spider.merge.MA
    public final MA OW() {
        return (hN) this.yq;
    }

    public final kB Q4() {
        return C0162pa.yq(new Y4.yq(), this);
    }

    public hN Qz(String str) {
        li.B(str);
        this.i.clear();
        Va Nl = Nl();
        E1((Nl == null || !Nl.HE().SN(nQ())) ? new QE(str) : new Dv(str));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<hN> R() {
        List<hN> list;
        if (t0() == 0) {
            return Gc;
        }
        WeakReference<List<hN>> weakReference = this.zH;
        if (!(weakReference == null || (list = weakReference.get()) == null)) {
            return list;
        }
        int size = this.i.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            MA ma = this.i.get(i);
            if (ma instanceof hN) {
                arrayList.add((hN) ma);
            }
        }
        this.zH = new WeakReference<>(arrayList);
        return arrayList;
    }

    public final hN RQ(String str) {
        li.B(str);
        E1(new QE(str));
        return this;
    }

    public final hN V(String str, String str2) {
        tF().Nl(iK.yq(this).zH().SN(str), str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.github.catvod.spider.merge.MA] */
    @Override // com.github.catvod.spider.merge.MA
    public final MA b() {
        hN hNVar = this;
        while (true) {
            ?? r1 = hNVar.yq;
            if (r1 == 0) {
                return hNVar;
            }
            hNVar = r1;
        }
    }

    public final kB cS(String str) {
        li.KJ(str);
        Y4 KJ = xq.KJ(str);
        li.B(KJ);
        return C0162pa.yq(KJ, this);
    }

    @Override // com.github.catvod.spider.merge.MA
    protected final boolean dT() {
        return this.t0 != null;
    }

    public final String h() {
        StringBuilder SN2 = P1.SN();
        int t0 = t0();
        for (int i = 0; i < t0; i++) {
            Z(this.i.get(i), SN2);
        }
        return P1.Gc(SN2);
    }

    /* renamed from: i3 */
    public hN clone() {
        return (hN) super.clone();
    }

    public final boolean j() {
        return this.tF.N();
    }

    public final String kR() {
        StringBuilder SN2 = P1.SN();
        for (int i = 0; i < t0(); i++) {
            MA ma = this.i.get(i);
            if (ma instanceof QE) {
                k(SN2, (QE) ma);
            } else if ((ma instanceof hN) && ((hN) ma).tF.KJ().equals("br") && !QE.m(SN2)) {
                SN2.append(" ");
            }
        }
        return P1.Gc(SN2).trim();
    }

    public final String lF() {
        String H;
        StringBuilder SN2 = P1.SN();
        for (MA ma : this.i) {
            if (ma instanceof Dv) {
                H = ((Dv) ma).H();
            } else if (ma instanceof C0062Fy) {
                H = ((C0062Fy) ma).H();
            } else if (ma instanceof hN) {
                H = ((hN) ma).lF();
            } else if (ma instanceof O4) {
                H = ((O4) ma).H();
            }
            SN2.append(H);
        }
        return P1.Gc(SN2);
    }

    public final hN m(String str) {
        hN hNVar = new hN(AF.G(str, iK.yq(this).zH()), zH(), null);
        E1(hNVar);
        return hNVar;
    }

    public final String mG() {
        StringBuilder SN2 = P1.SN();
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            this.i.get(i).g9(SN2);
        }
        String Gc2 = P1.Gc(SN2);
        Va Nl = Nl();
        if (Nl == null) {
            Nl = new Va("");
        }
        return Nl.D().t0() ? Gc2.trim() : Gc2;
    }

    public final String nQ() {
        return this.tF.KJ();
    }

    public final hN o() {
        MA ma = this.yq;
        if (ma == null) {
            return null;
        }
        List<hN> R = ((hN) ma).R();
        int XO = XO(this, R) + 1;
        if (R.size() > XO) {
            return R.get(XO);
        }
        return null;
    }

    public final boolean p(String str) {
        fx fxVar = this.t0;
        if (fxVar == null) {
            return false;
        }
        String G = fxVar.G("class");
        int length = G.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(G);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(G.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else if (i2 - i == length2 && G.regionMatches(true, i, str, 0, length2)) {
                        return true;
                    } else {
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return G.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.MA
    protected final void q(String str) {
        tF().Gd(M, str);
    }

    public final List<QE> s0() {
        ArrayList arrayList = new ArrayList();
        for (MA ma : this.i) {
            if (ma instanceof QE) {
                arrayList.add((QE) ma);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.github.catvod.spider.merge.MA
    public final int t0() {
        return this.i.size();
    }

    @Override // com.github.catvod.spider.merge.MA
    public final fx tF() {
        if (this.t0 == null) {
            this.t0 = new fx();
        }
        return this.t0;
    }

    public final hN tO(Collection<? extends MA> collection) {
        if (collection != null) {
            int t0 = t0();
            int i = (t0 + 1) - 1;
            li.t0(i >= 0 && i <= t0, "Insert position out of bounds.");
            SN(i, (MA[]) new ArrayList(collection).toArray(new MA[0]));
            return this;
        }
        throw new ID("Children collection to be inserted must not be null.");
    }

    public final String tl() {
        return this.tF.SN();
    }

    public final hN u7() {
        List<hN> R;
        int XO;
        MA ma = this.yq;
        if (ma != null && (XO = XO(this, (R = ((hN) ma).R()))) > 0) {
            return R.get(XO - 1);
        }
        return null;
    }

    public final kB ue() {
        MA ma = this.yq;
        if (ma == null) {
            return new kB(0);
        }
        List<hN> R = ((hN) ma).R();
        kB kBVar = new kB(R.size() - 1);
        for (hN hNVar : R) {
            if (hNVar != this) {
                kBVar.add(hNVar);
            }
        }
        return kBVar;
    }

    @Override // com.github.catvod.spider.merge.MA
    public String v() {
        return this.tF.SN();
    }

    public final boolean w() {
        for (MA ma : this.i) {
            if (ma instanceof QE) {
                if (!((QE) ma).tO()) {
                    return true;
                }
            } else if ((ma instanceof hN) && ((hN) ma).w()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(com.github.catvod.spider.merge.Va.yq r5) {
        /*
            r4 = this;
            boolean r5 = r5.t0()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.AF r5 = r4.tF
            boolean r5 = r5.yq()
            if (r5 != 0) goto L20
            com.github.catvod.spider.merge.MA r5 = r4.yq
            com.github.catvod.spider.merge.hN r5 = (com.github.catvod.spider.merge.hN) r5
            if (r5 == 0) goto L1e
            com.github.catvod.spider.merge.AF r5 = r5.tF
            boolean r5 = r5.yq()
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L21
        L20:
            r5 = 1
        L21:
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.AF r5 = r4.tF
            boolean r5 = r5.i()
            if (r5 == 0) goto L54
            com.github.catvod.spider.merge.MA r5 = r4.yq
            com.github.catvod.spider.merge.hN r5 = (com.github.catvod.spider.merge.hN) r5
            if (r5 == 0) goto L37
            boolean r5 = r5.j()
            if (r5 == 0) goto L54
        L37:
            com.github.catvod.spider.merge.MA r5 = r4.yq
            r2 = 0
            if (r5 != 0) goto L3d
            goto L50
        L3d:
            int r3 = r4.SN
            if (r3 <= 0) goto L50
            java.util.List r5 = r5.G()
            int r2 = r4.SN
            int r2 = r2 + (-1)
            java.lang.Object r5 = r5.get(r2)
            r2 = r5
            com.github.catvod.spider.merge.MA r2 = (com.github.catvod.spider.merge.MA) r2
        L50:
            if (r2 == 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            if (r5 != 0) goto L58
            goto L59
        L58:
            r0 = 0
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.hN.x(com.github.catvod.spider.merge.Va$yq):boolean");
    }

    public final hN xU(MA ma) {
        li.B(this.yq);
        this.yq.SN(this.SN, ma);
        return this;
    }

    @Override // com.github.catvod.spider.merge.MA
    void xa(Appendable appendable, int i, Va.yq yqVar) {
        if (x(yqVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            v3(appendable, i, yqVar);
        }
        appendable.append('<').append(tl());
        fx fxVar = this.t0;
        if (fxVar != null) {
            fxVar.F5(appendable, yqVar);
        }
        if (!this.i.isEmpty() || !this.tF.M() || (yqVar.Gc() == 1 && this.tF.tF())) {
            appendable.append('>');
        } else {
            appendable.append(" />");
        }
    }

    @Override // com.github.catvod.spider.merge.MA
    public final String zH() {
        String str = M;
        for (hN hNVar = this; hNVar != null; hNVar = (hN) hNVar.yq) {
            fx fxVar = hNVar.t0;
            if (fxVar != null) {
                if (fxVar.v3(str) != -1) {
                    return hNVar.t0.B(str);
                }
            }
        }
        return "";
    }

    public hN(String str) {
        this(AF.G(str, r6.tF), "", null);
    }
}
