package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0191uC;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.github.catvod.spider.merge.vV  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0197vV extends DO {
    private VG B;
    private Ym F5;
    private VG G;
    private boolean G4;
    private String[] Gd = {null};
    private ArrayList<VG> W;
    private hN dT;
    private AbstractC0191uC.i ee;
    private boolean g9;
    private List<String> v;
    private ArrayList<hN> v3;
    private boolean xa;
    static final String[] Nl = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] OW = {"ol", "ul"};
    static final String[] O = {"button"};
    static final String[] g1 = {"html", "table"};
    static final String[] s = {"optgroup", "option"};
    static final String[] n = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    static final String[] un = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    static final String[] b = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    private void G(String... strArr) {
        for (int size = this.zH.size() - 1; size >= 0; size--) {
            hN hNVar = this.zH.get(size);
            String nQ = hNVar.nQ();
            int i = P1.i;
            int length = strArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (strArr[i2].equals(nQ)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z && !hNVar.nQ().equals("html")) {
                this.zH.remove(size);
            } else {
                return;
            }
        }
    }

    private boolean Zm(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.zH.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String nQ = this.zH.get(size).nQ();
            if (P1.N(nQ, strArr)) {
                return true;
            }
            if (P1.N(nQ, strArr2)) {
                return false;
            }
            if (strArr3 != null && P1.N(nQ, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k(com.github.catvod.spider.merge.MA r3) {
        /*
            r2 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.hN> r0 = r2.zH
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.github.catvod.spider.merge.Va r0 = r2.tF
            goto L27
        Lb:
            boolean r0 = r2.xa
            if (r0 == 0) goto L23
            com.github.catvod.spider.merge.hN r0 = r2.yq()
            java.lang.String r0 = r0.nQ()
            java.lang.String[] r1 = com.github.catvod.spider.merge.VG.OW.g1
            boolean r0 = com.github.catvod.spider.merge.P1.N(r0, r1)
            if (r0 == 0) goto L23
            r2.tO(r3)
            goto L2a
        L23:
            com.github.catvod.spider.merge.hN r0 = r2.yq()
        L27:
            r0.E1(r3)
        L2a:
            boolean r0 = r3 instanceof com.github.catvod.spider.merge.hN
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.hN r3 = (com.github.catvod.spider.merge.hN) r3
            com.github.catvod.spider.merge.AF r0 = r3.I()
            boolean r0 = r0.zH()
            if (r0 == 0) goto L41
            com.github.catvod.spider.merge.Ym r0 = r2.F5
            if (r0 == 0) goto L41
            r0.OT(r3)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0197vV.k(com.github.catvod.spider.merge.MA):void");
    }

    private static boolean lF(ArrayList<hN> arrayList, hN hNVar) {
        int size = arrayList.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            if (arrayList.get(size) == hNVar) {
                return true;
            }
            size--;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        hN hNVar;
        while (!this.v3.isEmpty()) {
            int size = this.v3.size();
            if (size > 0) {
                hNVar = this.v3.remove(size - 1);
                continue;
            } else {
                hNVar = null;
                continue;
            }
            if (hNVar == null) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final VG C() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Cu() {
        if (!i3("body")) {
            this.zH.add(this.tF.OT());
        }
        this.B = VG.t0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Dr(String str) {
        String[] strArr = g1;
        String[] strArr2 = this.Gd;
        strArr2[0] = str;
        return Zm(strArr2, strArr, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Ym E1(AbstractC0191uC.t0 t0Var, boolean z, boolean z2) {
        AF M = M(t0Var.Gd(), this.Gc);
        r6 r6Var = this.Gc;
        fx fxVar = t0Var.G4;
        r6Var.N(fxVar);
        Ym ym = new Ym(M, fxVar);
        if (!z2 || !i3("template")) {
            this.F5 = ym;
        }
        k(ym);
        if (z) {
            this.zH.add(ym);
        }
        return ym;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F5() {
        G("tr", "template");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hN Fz(AbstractC0191uC.t0 t0Var) {
        AF M = M(t0Var.Gd(), this.Gc);
        r6 r6Var = this.Gc;
        fx fxVar = t0Var.G4;
        r6Var.N(fxVar);
        hN hNVar = new hN(M, null, fxVar);
        k(hNVar);
        if (t0Var.G) {
            if (!M.t0()) {
                M.B();
            } else if (!M.tF()) {
                this.N.v("Tag [%s] cannot be self closing; not a void tag", M.KJ());
            }
        }
        return hNVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G4() {
        G("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hN Gd(String str) {
        for (int size = this.v3.size() - 1; size >= 0; size--) {
            hN hNVar = this.v3.get(size);
            if (hNVar == null) {
                return null;
            }
            if (hNVar.nQ().equals(str)) {
                return hNVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(AbstractC0191uC.SN sn) {
        MA ma;
        hN yq = yq();
        String nQ = yq.nQ();
        String B = sn.B();
        if (sn instanceof AbstractC0191uC.yq) {
            ma = new O4(B);
        } else {
            ma = tF(nQ) ? new Dv(B) : new QE(B);
        }
        yq.E1(ma);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Hj(AbstractC0191uC uCVar, VG vg) {
        this.t0 = uCVar;
        return vg.tF(uCVar, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(VG vg) {
        this.B = vg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J(hN hNVar) {
        return lF(this.zH, hNVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hN KJ(hN hNVar) {
        for (int size = this.zH.size() - 1; size >= 0; size--) {
            if (this.zH.get(size) == hNVar) {
                return this.zH.get(size - 1);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(hN hNVar, hN hNVar2) {
        ArrayList<hN> arrayList = this.v3;
        int lastIndexOf = arrayList.lastIndexOf(hNVar);
        li.i(lastIndexOf != -1);
        arrayList.set(lastIndexOf, hNVar2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0053 -> B:24:0x0054). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void LY() {
        /*
            r9 = this;
            java.util.ArrayList<com.github.catvod.spider.merge.hN> r0 = r9.zH
            int r0 = r0.size()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto Lb
            return
        Lb:
            java.util.ArrayList<com.github.catvod.spider.merge.hN> r0 = r9.v3
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L23
            java.util.ArrayList<com.github.catvod.spider.merge.hN> r0 = r9.v3
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.lang.Object r0 = r0.get(r2)
            com.github.catvod.spider.merge.hN r0 = (com.github.catvod.spider.merge.hN) r0
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L89
            boolean r2 = r9.J(r0)
            if (r2 == 0) goto L2d
            goto L89
        L2d:
            java.util.ArrayList<com.github.catvod.spider.merge.hN> r2 = r9.v3
            int r2 = r2.size()
            int r3 = r2 + (-12)
            r4 = 0
            if (r3 >= 0) goto L39
            r3 = 0
        L39:
            r5 = 1
            int r2 = r2 - r5
            r6 = r2
        L3c:
            if (r6 != r3) goto L40
            r3 = r9
            goto L54
        L40:
            java.util.ArrayList<com.github.catvod.spider.merge.hN> r0 = r9.v3
            int r6 = r6 + (-1)
            java.lang.Object r0 = r0.get(r6)
            com.github.catvod.spider.merge.hN r0 = (com.github.catvod.spider.merge.hN) r0
            if (r0 == 0) goto L52
            boolean r7 = r9.J(r0)
            if (r7 == 0) goto L3c
        L52:
            r3 = r9
        L53:
            r5 = 0
        L54:
            if (r5 != 0) goto L60
            java.util.ArrayList<com.github.catvod.spider.merge.hN> r0 = r3.v3
            int r6 = r6 + 1
            java.lang.Object r0 = r0.get(r6)
            com.github.catvod.spider.merge.hN r0 = (com.github.catvod.spider.merge.hN) r0
        L60:
            com.github.catvod.spider.merge.li.B(r0)
            com.github.catvod.spider.merge.hN r5 = new com.github.catvod.spider.merge.hN
            java.lang.String r7 = r0.nQ()
            com.github.catvod.spider.merge.r6 r8 = r3.Gc
            com.github.catvod.spider.merge.AF r7 = r3.M(r7, r8)
            com.github.catvod.spider.merge.fx r8 = r0.tF()
            com.github.catvod.spider.merge.fx r8 = r8.clone()
            r5.<init>(r7, r1, r8)
            r3.k(r5)
            java.util.ArrayList<com.github.catvod.spider.merge.hN> r7 = r3.zH
            r7.add(r5)
            java.util.ArrayList<com.github.catvod.spider.merge.hN> r7 = r3.v3
            r7.set(r6, r5)
            if (r6 != r2) goto L53
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0197vV.LY():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.DO
    public final void N(Reader reader, l3 l3Var) {
        super.N(reader, l3Var);
        this.B = VG.yq;
        this.G = null;
        this.G4 = false;
        this.dT = null;
        this.F5 = null;
        this.v3 = new ArrayList<>();
        this.W = new ArrayList<>();
        this.v = new ArrayList();
        this.ee = new AbstractC0191uC.i();
        this.g9 = true;
        this.xa = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N0(hN hNVar) {
        if (!this.G4) {
            String yq = hNVar.yq("href");
            if (yq.length() != 0) {
                this.i = yq;
                this.G4 = true;
                this.tF.Zm(yq);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Ym Nl() {
        return this.F5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hN O() {
        return this.dT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void OB(hN hNVar) {
        this.dT = hNVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hN OW(String str) {
        int size = this.zH.size() - 1;
        int i = size >= 256 ? size - 256 : 0;
        while (size >= i) {
            hN hNVar = this.zH.get(size);
            if (hNVar.nQ().equals(str)) {
                return hNVar;
            }
            size--;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hN Q4() {
        return this.zH.remove(this.zH.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R() {
        this.v = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hN RQ() {
        hN hNVar = new hN(M("html", this.Gc), null, null);
        k(hNVar);
        this.zH.add(hNVar);
        return hNVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(AbstractC0191uC.N n2) {
        k(new C0062Fy(n2.G()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean V(hN hNVar) {
        return P1.N(hNVar.nQ(), b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W(VG vg) {
        if (this.yq.yq().yq()) {
            this.yq.yq().add(new C0150my(this.SN, "Unexpected %s token [%s] when in state [%s]", this.t0.getClass().getSimpleName(), this.t0, vg));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void XO(hN hNVar) {
        q(hNVar);
        this.v3.add(hNVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Z(hN hNVar) {
        return lF(this.v3, hNVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str) {
        for (int size = this.zH.size() - 1; size >= 0; size--) {
            String nQ = this.zH.get(size).nQ();
            if (nQ.equals(str)) {
                return true;
            }
            if (!P1.N(nQ, s)) {
                return false;
            }
        }
        li.tF("Should not be reachable");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void cS(boolean z) {
        this.xa = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cp() {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0197vV.cp():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void dT() {
        G("table", "template");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ee() {
        return this.g9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hN g(AbstractC0191uC.t0 t0Var) {
        if (t0Var.g9() && !t0Var.G4.isEmpty() && t0Var.G4.q(this.Gc) > 0) {
            Object[] objArr = {t0Var.zH};
            wV yq = this.yq.yq();
            if (yq.yq()) {
                yq.add(new C0150my(this.SN, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (t0Var.G) {
            hN Fz = Fz(t0Var);
            this.zH.add(Fz);
            this.N.xa(mV.yq);
            Ng ng = this.N;
            AbstractC0191uC.i iVar = this.ee;
            iVar.Gc();
            iVar.xa(Fz.tl());
            ng.q(iVar);
            return Fz;
        }
        AF M = M(t0Var.Gd(), this.Gc);
        r6 r6Var = this.Gc;
        fx fxVar = t0Var.G4;
        r6Var.N(fxVar);
        hN hNVar = new hN(M, null, fxVar);
        k(hNVar);
        this.zH.add(hNVar);
        return hNVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> g1() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g9(String str) {
        while (P1.N(yq().nQ(), n)) {
            if (str == null || !SN(str)) {
                Q4();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i3(String str) {
        return OW(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(VG vg) {
        this.W.add(vg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean kR(hN hNVar) {
        for (int size = this.zH.size() - 1; size >= 0; size--) {
            if (this.zH.get(size) == hNVar) {
                this.zH.remove(size);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        this.v3.add(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int mG(hN hNVar) {
        for (int i = 0; i < this.v3.size(); i++) {
            if (hNVar == this.v3.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(String str, String[] strArr) {
        String[] strArr2 = Nl;
        String[] strArr3 = this.Gd;
        strArr3[0] = str;
        return Zm(strArr3, strArr2, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void nQ(hN hNVar) {
        int size = this.v3.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.v3.get(size) != hNVar);
        this.v3.remove(size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(hN hNVar, int i) {
        q(hNVar);
        try {
            this.v3.add(i, hNVar);
        } catch (IndexOutOfBoundsException unused) {
            this.v3.add(hNVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final hN p(String str) {
        for (int size = this.zH.size() - 1; size >= 0; size--) {
            hN hNVar = this.zH.get(size);
            this.zH.remove(size);
            if (hNVar.nQ().equals(str)) {
                boolean z = this.t0 instanceof AbstractC0191uC.i;
                return hNVar;
            }
        }
        return null;
    }

    final void q(hN hNVar) {
        int size = this.v3.size() - 1;
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = 0;
        while (size >= i) {
            hN hNVar2 = this.v3.get(size);
            if (hNVar2 != null) {
                if (hNVar.nQ().equals(hNVar2.nQ()) && hNVar.tF().equals(hNVar2.tF())) {
                    i2++;
                }
                if (i2 == 3) {
                    this.v3.remove(size);
                    return;
                }
                size--;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s(String str) {
        return n(str, O);
    }

    @Override // com.github.catvod.spider.merge.DO
    protected final boolean tF(String str) {
        return str.equals("script") || str.equals("style");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void tO(MA ma) {
        hN hNVar;
        hN OW2 = OW("table");
        boolean z = false;
        if (OW2 == null) {
            hNVar = this.zH.get(0);
        } else if (OW2.L() != null) {
            hNVar = OW2.L();
            z = true;
        } else {
            hNVar = KJ(OW2);
        }
        if (z) {
            li.B(OW2);
            OW2.xU(ma);
            return;
        }
        hNVar.E1(ma);
    }

    public final String toString() {
        StringBuilder yq = by.yq("TreeBuilder{currentToken=");
        yq.append(this.t0);
        yq.append(", state=");
        yq.append(this.B);
        yq.append(", currentElement=");
        yq.append(yq());
        yq.append('}');
        return yq.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u7() {
        this.F5 = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ue() {
        return this.W.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean un(String[] strArr) {
        return Zm(strArr, Nl, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(boolean z) {
        this.g9 = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v3() {
        g9("p");
        if (!"p".equals(yq().nQ())) {
            W(this.B);
        }
        p("p");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final VG w() {
        if (this.W.size() <= 0) {
            return null;
        }
        ArrayList<VG> arrayList = this.W;
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final VG x() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void xU() {
        this.G = this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void xa(boolean z) {
        String[] strArr = z ? un : n;
        while (P1.N(yq().nQ(), strArr)) {
            Q4();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.DO
    public final boolean zH(AbstractC0191uC uCVar) {
        this.t0 = uCVar;
        return this.B.tF(uCVar, this);
    }
}
