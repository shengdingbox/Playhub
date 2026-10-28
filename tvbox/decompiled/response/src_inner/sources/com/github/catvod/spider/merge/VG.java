package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
import com.github.catvod.spider.merge.AbstractC0191uC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class VG extends Enum<VG> {
    public static final N B;
    public static final t0 F5;
    public static final tF G;
    public static final zH G4;
    public static final Gd Gc;
    public static final dT Gd;
    public static final yq KJ;
    public static final Nl M;
    public static final W N;
    public static final F5 Nl;
    private static final /* synthetic */ VG[] O;
    private static final String OW = String.valueOf((char) 0);
    public static final v3 SN;
    public static final M W;
    public static final i dT;
    public static final B ee;
    public static final G g9;
    public static final g9 i;
    public static final SN q;
    public static final xa t0;
    public static final v tF;
    public static final KJ v;
    public static final Gc v3;
    public static final G4 xa;
    public static final q yq;
    public static final ee zH;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class B extends VG {
        B() {
            super("InFrameset", 19, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            VG vg;
            if (VG.yq(uCVar)) {
                vVVar.H((AbstractC0191uC.SN) uCVar);
            } else if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
            } else if (uCVar.tF()) {
                vVVar.W(this);
                return false;
            } else if (uCVar.t0()) {
                AbstractC0191uC.t0 t0Var = (AbstractC0191uC.t0) uCVar;
                String str = t0Var.zH;
                Objects.requireNonNull(str);
                char c = 65535;
                switch (str.hashCode()) {
                    case -1644953643:
                        if (str.equals("frameset")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (str.equals("html")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (str.equals("frame")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (str.equals("noframes")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case ProxyOrigin.Gc /* 0 */:
                        vVVar.g(t0Var);
                        break;
                    case 1:
                        vg = VG.t0;
                        return vVVar.Hj(t0Var, vg);
                    case 2:
                        vVVar.Fz(t0Var);
                        break;
                    case 3:
                        vg = VG.tF;
                        return vVVar.Hj(t0Var, vg);
                    default:
                        vVVar.W(this);
                        return false;
                }
            } else if (!uCVar.i() || !((AbstractC0191uC.i) uCVar).zH.equals("frameset")) {
                if (!uCVar.zH()) {
                    vVVar.W(this);
                    return false;
                } else if (!vVVar.SN("html")) {
                    vVVar.W(this);
                }
            } else if (vVVar.SN("html")) {
                vVVar.W(this);
                return false;
            } else {
                vVVar.Q4();
                if (!vVVar.SN("frameset")) {
                    vVVar.I(VG.g9);
                }
            }
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class G extends VG {
        G() {
            super("AfterFrameset", 20, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            VG vg;
            if (VG.yq(uCVar)) {
                vVVar.H((AbstractC0191uC.SN) uCVar);
                return true;
            } else if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
                return true;
            } else if (uCVar.tF()) {
                vVVar.W(this);
                return false;
            } else {
                if (uCVar.t0() && ((AbstractC0191uC.t0) uCVar).zH.equals("html")) {
                    vg = VG.t0;
                } else if (uCVar.i() && ((AbstractC0191uC.i) uCVar).zH.equals("html")) {
                    vVVar.I(VG.Gd);
                    return true;
                } else if (uCVar.t0() && ((AbstractC0191uC.t0) uCVar).zH.equals("noframes")) {
                    vg = VG.tF;
                } else if (uCVar.zH()) {
                    return true;
                } else {
                    vVVar.W(this);
                    return false;
                }
                return vVVar.Hj(uCVar, vg);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class G4 extends VG {
        G4() {
            super("AfterAfterBody", 21, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
                return true;
            } else if (uCVar.tF() || (uCVar.t0() && ((AbstractC0191uC.t0) uCVar).zH.equals("html"))) {
                return vVVar.Hj(uCVar, VG.t0);
            } else {
                if (VG.yq(uCVar)) {
                    vVVar.H((AbstractC0191uC.SN) uCVar);
                    return true;
                } else if (uCVar.zH()) {
                    return true;
                } else {
                    vVVar.W(this);
                    vVVar.Cu();
                    return vVVar.zH(uCVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class Gc extends VG {
        Gc() {
            super("InSelectInTable", 16, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            if (!uCVar.t0() || !P1.N(((AbstractC0191uC.t0) uCVar).zH, OW.Dr)) {
                if (uCVar.i()) {
                    AbstractC0191uC.i iVar = (AbstractC0191uC.i) uCVar;
                    if (P1.N(iVar.zH, OW.Dr)) {
                        vVVar.W(this);
                        if (!vVVar.Dr(iVar.zH)) {
                            return false;
                        }
                        vVVar.p("select");
                        vVVar.cp();
                        return vVVar.zH(uCVar);
                    }
                }
                return vVVar.Hj(uCVar, VG.F5);
            }
            vVVar.W(this);
            vVVar.p("select");
            vVVar.cp();
            return vVVar.zH(uCVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class Gd extends VG {
        Gd() {
            super("Text", 7, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            if (uCVar.SN()) {
                vVVar.H((AbstractC0191uC.SN) uCVar);
                return true;
            } else if (uCVar.zH()) {
                vVVar.W(this);
                vVVar.Q4();
                vVVar.I(vVVar.C());
                return vVVar.zH(uCVar);
            } else if (!uCVar.i()) {
                return true;
            } else {
                vVVar.Q4();
                vVVar.I(vVVar.C());
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class KJ extends VG {
        KJ() {
            super("AfterBody", 18, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            if (VG.yq(uCVar)) {
                vVVar.H((AbstractC0191uC.SN) uCVar);
                return true;
            } else if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
                return true;
            } else if (uCVar.tF()) {
                vVVar.W(this);
                return false;
            } else if (uCVar.t0() && ((AbstractC0191uC.t0) uCVar).zH.equals("html")) {
                return vVVar.Hj(uCVar, VG.t0);
            } else {
                if (uCVar.i() && ((AbstractC0191uC.i) uCVar).zH.equals("html")) {
                    Objects.requireNonNull(vVVar);
                    if (vVVar.i3("html")) {
                        vVVar.p("html");
                    }
                    vVVar.I(VG.xa);
                    return true;
                } else if (uCVar.zH()) {
                    return true;
                } else {
                    vVVar.W(this);
                    vVVar.Cu();
                    return vVVar.zH(uCVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class M extends VG {
        M() {
            super("InTemplate", 17, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            v vVar = VG.tF;
            xa xaVar = VG.t0;
            int zH = kR.zH(uCVar.yq);
            if (zH != 0) {
                if (zH == 1) {
                    String str = ((AbstractC0191uC.t0) uCVar).zH;
                    if (!P1.N(str, OW.Fz)) {
                        if (P1.N(str, OW.E1)) {
                            vVVar.w();
                            Nl nl = VG.M;
                            vVVar.j(nl);
                            vVVar.I(nl);
                            return vVVar.zH(uCVar);
                        } else if (str.equals("col")) {
                            vVVar.w();
                            N n = VG.B;
                            vVVar.j(n);
                            vVVar.I(n);
                            return vVVar.zH(uCVar);
                        } else if (str.equals("tr")) {
                            vVVar.w();
                            tF tFVar = VG.G;
                            vVVar.j(tFVar);
                            vVVar.I(tFVar);
                            return vVVar.zH(uCVar);
                        } else if (str.equals("td") || str.equals("th")) {
                            vVVar.w();
                            zH zHVar = VG.G4;
                            vVVar.j(zHVar);
                            vVVar.I(zHVar);
                            return vVVar.zH(uCVar);
                        } else {
                            vVVar.w();
                            vVVar.j(xaVar);
                            vVVar.I(xaVar);
                            return vVVar.zH(uCVar);
                        }
                    }
                } else if (zH != 2) {
                    if (!(zH == 3 || zH == 4)) {
                        if (zH != 5 || !vVVar.i3("template")) {
                            return true;
                        }
                        vVVar.W(this);
                        vVVar.p("template");
                        vVVar.B();
                        vVVar.w();
                        vVVar.cp();
                        if (vVVar.x() == VG.W || vVVar.ue() >= 12) {
                            return true;
                        }
                        return vVVar.zH(uCVar);
                    }
                } else if (!((AbstractC0191uC.i) uCVar).zH.equals("template")) {
                    vVVar.W(this);
                    return false;
                }
                vVVar.Hj(uCVar, vVar);
                return true;
            }
            vVVar.Hj(uCVar, xaVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class N extends VG {
        N() {
            super("InColumnGroup", 11, null);
        }

        private boolean zH(AbstractC0191uC uCVar, C0197vV vVVar) {
            if (!vVVar.SN("colgroup")) {
                vVVar.W(this);
                return false;
            }
            vVVar.Q4();
            vVVar.I(VG.M);
            vVVar.zH(uCVar);
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
            if (r7.equals("template") == false) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
        @Override // com.github.catvod.spider.merge.VG
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final boolean tF(com.github.catvod.spider.merge.AbstractC0191uC r12, com.github.catvod.spider.merge.C0197vV r13) {
            /*
                r11 = this;
                com.github.catvod.spider.merge.VG$v r0 = com.github.catvod.spider.merge.VG.tF
                boolean r1 = com.github.catvod.spider.merge.VG.yq(r12)
                r2 = 1
                if (r1 == 0) goto Lf
                com.github.catvod.spider.merge.uC$SN r12 = (com.github.catvod.spider.merge.AbstractC0191uC.SN) r12
                r13.H(r12)
                return r2
            Lf:
                int r1 = r12.yq
                int r1 = com.github.catvod.spider.merge.kR.zH(r1)
                if (r1 == 0) goto Lc0
                java.lang.String r3 = "html"
                r4 = 0
                java.lang.String r5 = "template"
                r6 = 2
                if (r1 == r2) goto L71
                if (r1 == r6) goto L3f
                r0 = 3
                if (r1 == r0) goto L38
                r0 = 5
                if (r1 == r0) goto L2c
                boolean r12 = r11.zH(r12, r13)
                return r12
            L2c:
                boolean r0 = r13.SN(r3)
                if (r0 == 0) goto L33
                return r2
            L33:
                boolean r12 = r11.zH(r12, r13)
                return r12
            L38:
                com.github.catvod.spider.merge.uC$N r12 = (com.github.catvod.spider.merge.AbstractC0191uC.N) r12
                r13.U(r12)
                goto Lc3
            L3f:
                r1 = r12
                com.github.catvod.spider.merge.uC$i r1 = (com.github.catvod.spider.merge.AbstractC0191uC.i) r1
                java.lang.String r1 = r1.zH
                java.util.Objects.requireNonNull(r1)
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto L6d
                java.lang.String r0 = "colgroup"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L5a
                boolean r12 = r11.zH(r12, r13)
                return r12
            L5a:
                boolean r12 = r13.SN(r1)
                if (r12 != 0) goto L64
                r13.W(r11)
                return r4
            L64:
                r13.Q4()
                com.github.catvod.spider.merge.VG$Nl r12 = com.github.catvod.spider.merge.VG.M
                r13.I(r12)
                goto Lc3
            L6d:
                r13.Hj(r12, r0)
                goto Lc3
            L71:
                r1 = r12
                com.github.catvod.spider.merge.uC$t0 r1 = (com.github.catvod.spider.merge.AbstractC0191uC.t0) r1
                java.lang.String r7 = r1.zH
                java.util.Objects.requireNonNull(r7)
                int r8 = r7.hashCode()
                r9 = -1321546630(0xffffffffb13acc7a, float:-2.7182794E-9)
                r10 = -1
                if (r8 == r9) goto La3
                r4 = 98688(0x18180, float:1.38291E-40)
                if (r8 == r4) goto L98
                r4 = 3213227(0x3107ab, float:4.50269E-39)
                if (r8 == r4) goto L8f
            L8d:
                r4 = -1
                goto Laa
            L8f:
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L96
                goto L8d
            L96:
                r4 = 2
                goto Laa
            L98:
                java.lang.String r3 = "col"
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto La1
                goto L8d
            La1:
                r4 = 1
                goto Laa
            La3:
                boolean r3 = r7.equals(r5)
                if (r3 != 0) goto Laa
                goto L8d
            Laa:
                if (r4 == 0) goto L6d
                if (r4 == r2) goto Lbc
                if (r4 == r6) goto Lb5
                boolean r12 = r11.zH(r12, r13)
                return r12
            Lb5:
                com.github.catvod.spider.merge.VG$xa r0 = com.github.catvod.spider.merge.VG.t0
                boolean r12 = r13.Hj(r12, r0)
                return r12
            Lbc:
                r13.Fz(r1)
                goto Lc3
            Lc0:
                r13.W(r11)
            Lc3:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.VG.N.tF(com.github.catvod.spider.merge.uC, com.github.catvod.spider.merge.vV):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class Nl extends VG {
        Nl() {
            super("InTable", 8, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            VG vg;
            v vVar = VG.tF;
            if (uCVar.SN() && P1.N(vVVar.yq().nQ(), OW.g1)) {
                vVVar.R();
                vVVar.xU();
                vVVar.I(VG.KJ);
            } else if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
                return true;
            } else if (uCVar.tF()) {
                vVVar.W(this);
                return false;
            } else if (uCVar.t0()) {
                AbstractC0191uC.t0 t0Var = (AbstractC0191uC.t0) uCVar;
                String str = t0Var.zH;
                if (str.equals("caption")) {
                    vVVar.dT();
                    vVVar.m();
                    vVVar.g(t0Var);
                    vg = VG.q;
                } else if (str.equals("colgroup")) {
                    vVVar.dT();
                    vVVar.g(t0Var);
                    vg = VG.B;
                } else if (str.equals("col")) {
                    vVVar.dT();
                    vVVar.Gc("colgroup");
                } else if (P1.N(str, OW.v)) {
                    vVVar.dT();
                    vVVar.g(t0Var);
                    vg = VG.G;
                } else if (P1.N(str, OW.ee)) {
                    vVVar.dT();
                    vVVar.Gc("tbody");
                } else if (str.equals("table")) {
                    vVVar.W(this);
                    if (!vVVar.Dr(str)) {
                        return false;
                    }
                    vVVar.p(str);
                    if (vVVar.cp()) {
                        return vVVar.zH(uCVar);
                    }
                    vVVar.g(t0Var);
                    return true;
                } else if (P1.N(str, OW.g9)) {
                    return vVVar.Hj(uCVar, vVar);
                } else {
                    if (str.equals("input")) {
                        if (!t0Var.g9() || !t0Var.G4.B("type").equalsIgnoreCase("hidden")) {
                            zH(uCVar, vVVar);
                            return true;
                        }
                        vVVar.Fz(t0Var);
                    } else if (str.equals("form")) {
                        vVVar.W(this);
                        if (vVVar.Nl() != null || vVVar.i3("template")) {
                            return false;
                        }
                        vVVar.E1(t0Var, false, false);
                    } else {
                        zH(uCVar, vVVar);
                        return true;
                    }
                    return true;
                }
                vVVar.I(vg);
                return true;
            } else if (uCVar.i()) {
                String str2 = ((AbstractC0191uC.i) uCVar).zH;
                if (str2.equals("table")) {
                    if (!vVVar.Dr(str2)) {
                        vVVar.W(this);
                        return false;
                    }
                    vVVar.p("table");
                    vVVar.cp();
                } else if (P1.N(str2, OW.O)) {
                    vVVar.W(this);
                    return false;
                } else if (str2.equals("template")) {
                    vVVar.Hj(uCVar, vVar);
                } else {
                    zH(uCVar, vVVar);
                    return true;
                }
                return true;
            } else if (uCVar.zH()) {
                if (vVVar.SN("html")) {
                    vVVar.W(this);
                }
                return true;
            } else {
                zH(uCVar, vVVar);
                return true;
            }
            return vVVar.zH(uCVar);
        }

        final void zH(AbstractC0191uC uCVar, C0197vV vVVar) {
            vVVar.W(this);
            vVVar.cS(true);
            vVVar.Hj(uCVar, VG.t0);
            vVVar.cS(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class OW {
        static final String[] yq = {"base", "basefont", "bgsound", "command", "link"};
        static final String[] SN = {"noframes", "style"};
        static final String[] N = {"body", "br", "html"};
        static final String[] tF = {"body", "br", "html"};
        static final String[] zH = {"body", "br", "head", "html"};
        static final String[] i = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
        static final String[] t0 = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
        static final String[] Gc = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
        static final String[] M = {"h1", "h2", "h3", "h4", "h5", "h6"};
        static final String[] KJ = {"address", "div", "p"};
        static final String[] q = {"dd", "dt"};
        static final String[] B = {"applet", "marquee", "object"};
        static final String[] G = {"param", "source", "track"};
        static final String[] G4 = {"action", "name", "prompt"};
        static final String[] dT = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] F5 = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        static final String[] v3 = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] W = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] v = {"tbody", "tfoot", "thead"};
        static final String[] ee = {"td", "th", "tr"};
        static final String[] g9 = {"script", "style", "template"};
        static final String[] xa = {"td", "th"};
        static final String[] Gd = {"body", "caption", "col", "colgroup", "html"};
        static final String[] Nl = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] OW = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] O = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] g1 = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] s = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        static final String[] n = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        static final String[] un = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        static final String[] b = {"body", "caption", "col", "colgroup", "html", "td", "th"};
        static final String[] Zm = {"input", "keygen", "textarea"};
        static final String[] Dr = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] g = {"tbody", "tfoot", "thead"};
        static final String[] H = {"head", "noscript"};
        static final String[] U = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] Fz = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
        static final String[] E1 = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class SN extends VG {
        SN() {
            super("InCaption", 10, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            if (uCVar.i()) {
                AbstractC0191uC.i iVar = (AbstractC0191uC.i) uCVar;
                if (iVar.zH.equals("caption")) {
                    if (!vVVar.Dr(iVar.zH)) {
                        vVVar.W(this);
                        return false;
                    }
                    vVVar.xa(false);
                    if (!vVVar.SN("caption")) {
                        vVVar.W(this);
                    }
                    vVVar.p("caption");
                    vVVar.B();
                    vVVar.I(VG.M);
                    return true;
                }
            }
            if ((uCVar.t0() && P1.N(((AbstractC0191uC.t0) uCVar).zH, OW.OW)) || (uCVar.i() && ((AbstractC0191uC.i) uCVar).zH.equals("table"))) {
                vVVar.W(this);
                if (vVVar.i("caption")) {
                    return vVVar.zH(uCVar);
                }
                return true;
            } else if (!uCVar.i() || !P1.N(((AbstractC0191uC.i) uCVar).zH, OW.U)) {
                return vVVar.Hj(uCVar, VG.t0);
            } else {
                vVVar.W(this);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class W extends VG {
        W() {
            super("BeforeHead", 2, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            if (VG.yq(uCVar)) {
                vVVar.H((AbstractC0191uC.SN) uCVar);
                return true;
            } else if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
                return true;
            } else if (uCVar.tF()) {
                vVVar.W(this);
                return false;
            } else if (uCVar.t0() && ((AbstractC0191uC.t0) uCVar).zH.equals("html")) {
                return VG.t0.tF(uCVar, vVVar);
            } else {
                if (uCVar.t0()) {
                    AbstractC0191uC.t0 t0Var = (AbstractC0191uC.t0) uCVar;
                    if (t0Var.zH.equals("head")) {
                        vVVar.OB(vVVar.g(t0Var));
                        vVVar.I(VG.tF);
                        return true;
                    }
                }
                if (uCVar.i() && P1.N(((AbstractC0191uC.i) uCVar).zH, OW.zH)) {
                    vVVar.Gc("head");
                    return vVVar.zH(uCVar);
                } else if (uCVar.i()) {
                    vVVar.W(this);
                    return false;
                } else {
                    vVVar.Gc("head");
                    return vVVar.zH(uCVar);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class dT extends VG {
        dT() {
            super("AfterAfterFrameset", 22, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
                return true;
            } else if (uCVar.tF() || VG.yq(uCVar) || (uCVar.t0() && ((AbstractC0191uC.t0) uCVar).zH.equals("html"))) {
                return vVVar.Hj(uCVar, VG.t0);
            } else {
                if (uCVar.zH()) {
                    return true;
                }
                if (uCVar.t0() && ((AbstractC0191uC.t0) uCVar).zH.equals("noframes")) {
                    return vVVar.Hj(uCVar, VG.tF);
                }
                vVVar.W(this);
                return false;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class ee extends VG {
        ee() {
            super("InHeadNoscript", 4, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            AbstractC0191uC.SN sn;
            v vVar = VG.tF;
            if (uCVar.tF()) {
                vVVar.W(this);
            } else if (uCVar.t0() && ((AbstractC0191uC.t0) uCVar).zH.equals("html")) {
                return vVVar.Hj(uCVar, VG.t0);
            } else {
                if (uCVar.i() && ((AbstractC0191uC.i) uCVar).zH.equals("noscript")) {
                    vVVar.Q4();
                    vVVar.I(vVar);
                } else if (VG.yq(uCVar) || uCVar.N() || (uCVar.t0() && P1.N(((AbstractC0191uC.t0) uCVar).zH, OW.i))) {
                    return vVVar.Hj(uCVar, vVar);
                } else {
                    if (uCVar.i() && ((AbstractC0191uC.i) uCVar).zH.equals("br")) {
                        vVVar.W(this);
                        sn = new AbstractC0191uC.SN();
                    } else if ((!uCVar.t0() || !P1.N(((AbstractC0191uC.t0) uCVar).zH, OW.H)) && !uCVar.i()) {
                        vVVar.W(this);
                        sn = new AbstractC0191uC.SN();
                    } else {
                        vVVar.W(this);
                        return false;
                    }
                    sn.q(uCVar.toString());
                    vVVar.H(sn);
                    return true;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class g9 extends VG {
        g9() {
            super("AfterHead", 5, null);
        }

        private boolean zH(AbstractC0191uC uCVar, C0197vV vVVar) {
            vVVar.Gc("body");
            vVVar.v(true);
            return vVVar.zH(uCVar);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            v vVar = VG.tF;
            xa xaVar = VG.t0;
            if (VG.yq(uCVar)) {
                vVVar.H((AbstractC0191uC.SN) uCVar);
                return true;
            } else if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
                return true;
            } else if (uCVar.tF()) {
                vVVar.W(this);
                return true;
            } else {
                if (uCVar.t0()) {
                    AbstractC0191uC.t0 t0Var = (AbstractC0191uC.t0) uCVar;
                    String str = t0Var.zH;
                    if (str.equals("html")) {
                        return vVVar.Hj(uCVar, xaVar);
                    }
                    if (str.equals("body")) {
                        vVVar.g(t0Var);
                        vVVar.v(false);
                        vVVar.I(xaVar);
                        return true;
                    } else if (str.equals("frameset")) {
                        vVVar.g(t0Var);
                        vVVar.I(VG.ee);
                        return true;
                    } else if (P1.N(str, OW.t0)) {
                        vVVar.W(this);
                        hN O = vVVar.O();
                        vVVar.zH.add(O);
                        vVVar.Hj(uCVar, vVar);
                        vVVar.kR(O);
                        return true;
                    } else if (str.equals("head")) {
                        vVVar.W(this);
                        return false;
                    }
                } else if (uCVar.i()) {
                    String str2 = ((AbstractC0191uC.i) uCVar).zH;
                    if (!P1.N(str2, OW.tF)) {
                        if (str2.equals("template")) {
                            vVVar.Hj(uCVar, vVar);
                            return true;
                        }
                        vVVar.W(this);
                        return false;
                    }
                }
                zH(uCVar, vVVar);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class i extends VG {
        i() {
            super("InCell", 14, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            zH zHVar = VG.G4;
            xa xaVar = VG.t0;
            String str = "th";
            if (uCVar.i()) {
                String str2 = ((AbstractC0191uC.i) uCVar).zH;
                if (P1.N(str2, OW.xa)) {
                    if (!vVVar.Dr(str2)) {
                        vVVar.W(this);
                        vVVar.I(zHVar);
                        return false;
                    }
                    vVVar.xa(false);
                    if (!vVVar.SN(str2)) {
                        vVVar.W(this);
                    }
                    vVVar.p(str2);
                    vVVar.B();
                    vVVar.I(zHVar);
                    return true;
                } else if (P1.N(str2, OW.Gd)) {
                    vVVar.W(this);
                    return false;
                } else if (!P1.N(str2, OW.Nl)) {
                    return vVVar.Hj(uCVar, xaVar);
                } else {
                    if (!vVVar.Dr(str2)) {
                        vVVar.W(this);
                        return false;
                    }
                    if (vVVar.Dr("td")) {
                        str = "td";
                    }
                    vVVar.i(str);
                    return vVVar.zH(uCVar);
                }
            } else if (!uCVar.t0() || !P1.N(((AbstractC0191uC.t0) uCVar).zH, OW.OW)) {
                return vVVar.Hj(uCVar, xaVar);
            } else {
                if (vVVar.Dr("td") || vVVar.Dr(str)) {
                    if (vVVar.Dr("td")) {
                        str = "td";
                    }
                    vVVar.i(str);
                    return vVVar.zH(uCVar);
                }
                vVVar.W(this);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class q extends VG {
        q() {
            super("Initial", 0, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            v3 v3Var = VG.SN;
            if (VG.yq(uCVar)) {
                return true;
            }
            if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
            } else if (uCVar.tF()) {
                AbstractC0191uC.tF tFVar = (AbstractC0191uC.tF) uCVar;
                xL xLVar = new xL(vVVar.Gc.tF(tFVar.tF.toString()), tFVar.i.toString(), tFVar.t0.toString());
                xLVar.E1(tFVar.zH);
                vVVar.tF.E1(xLVar);
                if (tFVar.Gc) {
                    vVVar.tF.gt();
                }
                vVVar.I(v3Var);
            } else {
                vVVar.I(v3Var);
                return vVVar.zH(uCVar);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class t0 extends VG {
        t0() {
            super("InSelect", 15, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
            if (r14.SN("html") == false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
            if (r14.SN("optgroup") != false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
            if (r14.SN("option") != false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
            r14.Q4();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00d7, code lost:
            r14.W(r12);
         */
        @Override // com.github.catvod.spider.merge.VG
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final boolean tF(com.github.catvod.spider.merge.AbstractC0191uC r13, com.github.catvod.spider.merge.C0197vV r14) {
            /*
                Method dump skipped, instructions count: 374
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.VG.t0.tF(com.github.catvod.spider.merge.uC, com.github.catvod.spider.merge.vV):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class tF extends VG {
        tF() {
            super("InTableBody", 12, null);
        }

        private boolean zH(AbstractC0191uC uCVar, C0197vV vVVar) {
            if (vVVar.Dr("tbody") || vVVar.Dr("thead") || vVVar.n("tfoot", null)) {
                vVVar.G4();
                vVVar.i(vVVar.yq().nQ());
                return vVVar.zH(uCVar);
            }
            vVVar.W(this);
            return false;
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            VG vg = VG.M;
            int zH = kR.zH(uCVar.yq);
            if (zH == 1) {
                AbstractC0191uC.t0 t0Var = (AbstractC0191uC.t0) uCVar;
                String str = t0Var.zH;
                if (str.equals("tr")) {
                    vVVar.G4();
                    vVVar.g(t0Var);
                    vVVar.I(VG.G4);
                } else if (!P1.N(str, OW.xa)) {
                    return P1.N(str, OW.s) ? zH(uCVar, vVVar) : vVVar.Hj(uCVar, vg);
                } else {
                    vVVar.W(this);
                    vVVar.Gc("tr");
                    return vVVar.zH(t0Var);
                }
            } else if (zH != 2) {
                return vVVar.Hj(uCVar, vg);
            } else {
                String str2 = ((AbstractC0191uC.i) uCVar).zH;
                if (P1.N(str2, OW.g)) {
                    if (!vVVar.Dr(str2)) {
                        vVVar.W(this);
                        return false;
                    }
                    vVVar.G4();
                    vVVar.Q4();
                    vVVar.I(vg);
                } else if (str2.equals("table")) {
                    return zH(uCVar, vVVar);
                } else {
                    if (!P1.N(str2, OW.n)) {
                        return vVVar.Hj(uCVar, vg);
                    }
                    vVVar.W(this);
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class v extends VG {
        v() {
            super("InHead", 3, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            VG vg;
            Gd gd = VG.Gc;
            if (VG.yq(uCVar)) {
                vVVar.H((AbstractC0191uC.SN) uCVar);
                return true;
            }
            int zH = kR.zH(uCVar.yq);
            if (zH == 0) {
                vVVar.W(this);
                return false;
            } else if (zH != 1) {
                if (zH == 2) {
                    String str = ((AbstractC0191uC.i) uCVar).zH;
                    if (str.equals("head")) {
                        vVVar.Q4();
                        vg = VG.i;
                        vVVar.I(vg);
                    } else if (P1.N(str, OW.N)) {
                        vVVar.i("head");
                        return vVVar.zH(uCVar);
                    } else if (!str.equals("template")) {
                        vVVar.W(this);
                        return false;
                    } else if (!vVVar.i3(str)) {
                        vVVar.W(this);
                    } else {
                        vVVar.xa(true);
                        if (!str.equals(vVVar.yq().nQ())) {
                            vVVar.W(this);
                        }
                        vVVar.p(str);
                        vVVar.B();
                        vVVar.w();
                        vVVar.cp();
                    }
                } else if (zH != 3) {
                    vVVar.i("head");
                    return vVVar.zH(uCVar);
                } else {
                    vVVar.U((AbstractC0191uC.N) uCVar);
                }
                return true;
            } else {
                AbstractC0191uC.t0 t0Var = (AbstractC0191uC.t0) uCVar;
                String str2 = t0Var.zH;
                if (str2.equals("html")) {
                    return VG.t0.tF(uCVar, vVVar);
                }
                if (P1.N(str2, OW.yq)) {
                    hN Fz = vVVar.Fz(t0Var);
                    if (str2.equals("base") && Fz.G4("href")) {
                        vVVar.N0(Fz);
                    }
                } else if (str2.equals("meta")) {
                    vVVar.Fz(t0Var);
                } else if (str2.equals("title")) {
                    vVVar.N.xa(mV.N);
                    vVVar.xU();
                    vVVar.I(gd);
                    vVVar.g(t0Var);
                } else if (P1.N(str2, OW.SN)) {
                    VG.SN(t0Var, vVVar);
                } else if (str2.equals("noscript")) {
                    vVVar.g(t0Var);
                    vg = VG.zH;
                    vVVar.I(vg);
                } else if (str2.equals("script")) {
                    vVVar.N.xa(mV.i);
                    vVVar.xU();
                    vVVar.I(gd);
                    vVVar.g(t0Var);
                } else if (str2.equals("head")) {
                    vVVar.W(this);
                    return false;
                } else if (str2.equals("template")) {
                    vVVar.g(t0Var);
                    vVVar.m();
                    vVVar.v(false);
                    M m = VG.W;
                    vVVar.I(m);
                    vVVar.j(m);
                } else {
                    vVVar.i("head");
                    return vVVar.zH(uCVar);
                }
                return true;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class v3 extends VG {
        v3() {
            super("BeforeHtml", 1, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            W w = VG.N;
            if (uCVar.tF()) {
                vVVar.W(this);
                return false;
            } else if (uCVar.N()) {
                vVVar.U((AbstractC0191uC.N) uCVar);
                return true;
            } else if (VG.yq(uCVar)) {
                vVVar.H((AbstractC0191uC.SN) uCVar);
                return true;
            } else {
                if (uCVar.t0()) {
                    AbstractC0191uC.t0 t0Var = (AbstractC0191uC.t0) uCVar;
                    if (t0Var.zH.equals("html")) {
                        vVVar.g(t0Var);
                        vVVar.I(w);
                        return true;
                    }
                }
                if ((!uCVar.i() || !P1.N(((AbstractC0191uC.i) uCVar).zH, OW.zH)) && uCVar.i()) {
                    vVVar.W(this);
                    return false;
                }
                vVVar.RQ();
                vVVar.I(w);
                return vVVar.zH(uCVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class xa extends VG {
        xa() {
            super("InBody", 6, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x01e0, code lost:
            if (r44.SN(r7) == false) goto L211;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0206, code lost:
            if (r44.SN(r7) == false) goto L211;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0257, code lost:
            if (r44.SN(r7) == false) goto L211;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x027d, code lost:
            if (r44.SN(r7) == false) goto L211;
         */
        /* JADX WARN: Code restructure failed: missing block: B:210:0x03e6, code lost:
            if (r44.SN(r7) == false) goto L211;
         */
        /* JADX WARN: Code restructure failed: missing block: B:211:0x03e8, code lost:
            r44.W(r42);
         */
        /* JADX WARN: Code restructure failed: missing block: B:212:0x03eb, code lost:
            r44.p(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:435:0x09b5, code lost:
            if (r44.Fz(r2).N("type").equalsIgnoreCase("hidden") == false) goto L577;
         */
        /* JADX WARN: Code restructure failed: missing block: B:512:0x0b62, code lost:
            if (r44.s(r0) != false) goto L537;
         */
        /* JADX WARN: Code restructure failed: missing block: B:536:0x0be6, code lost:
            if (r44.s(r0) != false) goto L537;
         */
        /* JADX WARN: Code restructure failed: missing block: B:537:0x0be8, code lost:
            r44.i(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:611:0x0d57, code lost:
            if (com.github.catvod.spider.merge.P1.N(r1, com.github.catvod.spider.merge.VG.OW.dT) != false) goto L459;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
            if (r44.i("body") != false) goto L134;
         */
        /* JADX WARN: Removed duplicated region for block: B:166:0x02f8  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x0362  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x03ba  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x03bc  */
        /* JADX WARN: Removed duplicated region for block: B:399:0x08bc  */
        /* JADX WARN: Removed duplicated region for block: B:401:0x08c9  */
        /* JADX WARN: Removed duplicated region for block: B:402:0x08cd  */
        /* JADX WARN: Removed duplicated region for block: B:424:0x0966  */
        /* JADX WARN: Removed duplicated region for block: B:428:0x097f  */
        /* JADX WARN: Removed duplicated region for block: B:434:0x09a0  */
        /* JADX WARN: Removed duplicated region for block: B:436:0x09b9  */
        /* JADX WARN: Removed duplicated region for block: B:440:0x09cd  */
        /* JADX WARN: Removed duplicated region for block: B:443:0x09e1  */
        /* JADX WARN: Removed duplicated region for block: B:455:0x0a2b  */
        /* JADX WARN: Removed duplicated region for block: B:464:0x0a51  */
        /* JADX WARN: Removed duplicated region for block: B:482:0x0ab4  */
        /* JADX WARN: Removed duplicated region for block: B:486:0x0ac6  */
        /* JADX WARN: Removed duplicated region for block: B:488:0x0acb  */
        /* JADX WARN: Removed duplicated region for block: B:492:0x0ae4  */
        /* JADX WARN: Removed duplicated region for block: B:501:0x0b22  */
        /* JADX WARN: Removed duplicated region for block: B:513:0x0b66  */
        /* JADX WARN: Removed duplicated region for block: B:516:0x0b75  */
        /* JADX WARN: Removed duplicated region for block: B:522:0x0b9a  */
        /* JADX WARN: Removed duplicated region for block: B:538:0x0bed  */
        /* JADX WARN: Removed duplicated region for block: B:543:0x0c08  */
        /* JADX WARN: Removed duplicated region for block: B:546:0x0c16  */
        /* JADX WARN: Removed duplicated region for block: B:560:0x0c5b  */
        /* JADX WARN: Removed duplicated region for block: B:564:0x0c77  */
        /* JADX WARN: Removed duplicated region for block: B:567:0x0c84  */
        /* JADX WARN: Removed duplicated region for block: B:569:0x0c8d  */
        /* JADX WARN: Removed duplicated region for block: B:572:0x0c97  */
        /* JADX WARN: Removed duplicated region for block: B:579:0x0cb6  */
        /* JADX WARN: Removed duplicated region for block: B:621:0x02ec A[SYNTHETIC] */
        @Override // com.github.catvod.spider.merge.VG
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final boolean tF(com.github.catvod.spider.merge.AbstractC0191uC r43, com.github.catvod.spider.merge.C0197vV r44) {
            /*
                Method dump skipped, instructions count: 3850
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.VG.xa.tF(com.github.catvod.spider.merge.uC, com.github.catvod.spider.merge.vV):boolean");
        }

        final boolean zH(AbstractC0191uC uCVar, C0197vV vVVar) {
            Objects.requireNonNull(uCVar);
            String str = ((AbstractC0191uC.i) uCVar).zH;
            ArrayList<hN> arrayList = vVVar.zH;
            if (vVVar.OW(str) == null) {
                vVVar.W(this);
                return false;
            }
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                hN hNVar = arrayList.get(size);
                if (hNVar.nQ().equals(str)) {
                    vVVar.g9(str);
                    if (!vVVar.SN(str)) {
                        vVVar.W(this);
                    }
                    vVVar.p(str);
                } else if (vVVar.V(hNVar)) {
                    vVVar.W(this);
                    return false;
                } else {
                    size--;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq extends VG {
        yq() {
            super("InTableText", 9, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            VG vg = VG.t0;
            if (uCVar.yq == 5) {
                AbstractC0191uC.SN sn = (AbstractC0191uC.SN) uCVar;
                if (sn.B().equals(VG.OW)) {
                    vVVar.W(this);
                    return false;
                }
                ((ArrayList) vVVar.g1()).add(sn.B());
                return true;
            }
            if (((ArrayList) vVVar.g1()).size() > 0) {
                Iterator it = ((ArrayList) vVVar.g1()).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!P1.tF(str)) {
                        vVVar.W(this);
                        if (P1.N(vVVar.yq().nQ(), OW.g1)) {
                            vVVar.cS(true);
                            AbstractC0191uC.SN sn2 = new AbstractC0191uC.SN();
                            sn2.q(str);
                            vVVar.Hj(sn2, vg);
                            vVVar.cS(false);
                        } else {
                            AbstractC0191uC.SN sn3 = new AbstractC0191uC.SN();
                            sn3.q(str);
                            vVVar.Hj(sn3, vg);
                        }
                    } else {
                        AbstractC0191uC.SN sn4 = new AbstractC0191uC.SN();
                        sn4.q(str);
                        vVVar.H(sn4);
                    }
                }
                vVVar.R();
            }
            vVVar.I(vVVar.C());
            return vVVar.zH(uCVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class zH extends VG {
        zH() {
            super("InRow", 13, null);
        }

        @Override // com.github.catvod.spider.merge.VG
        final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
            tF tFVar = VG.G;
            Nl nl = VG.M;
            if (uCVar.t0()) {
                AbstractC0191uC.t0 t0Var = (AbstractC0191uC.t0) uCVar;
                String str = t0Var.zH;
                if (P1.N(str, OW.xa)) {
                    vVVar.F5();
                    vVVar.g(t0Var);
                    vVVar.I(VG.dT);
                    vVVar.m();
                    return true;
                } else if (!P1.N(str, OW.un)) {
                    return vVVar.Hj(uCVar, nl);
                } else {
                    if (vVVar.i("tr")) {
                        return vVVar.zH(uCVar);
                    }
                    return false;
                }
            } else if (!uCVar.i()) {
                return vVVar.Hj(uCVar, nl);
            } else {
                String str2 = ((AbstractC0191uC.i) uCVar).zH;
                if (str2.equals("tr")) {
                    if (!vVVar.Dr(str2)) {
                        vVVar.W(this);
                        return false;
                    }
                } else if (str2.equals("table")) {
                    if (vVVar.i("tr")) {
                        return vVVar.zH(uCVar);
                    }
                    return false;
                } else if (P1.N(str2, OW.v)) {
                    if (!vVVar.Dr(str2) || !vVVar.Dr("tr")) {
                        vVVar.W(this);
                        return false;
                    }
                } else if (!P1.N(str2, OW.b)) {
                    return vVVar.Hj(uCVar, nl);
                } else {
                    vVVar.W(this);
                    return false;
                }
                vVVar.F5();
                vVVar.Q4();
                vVVar.I(tFVar);
                return true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.github.catvod.spider.merge.VG$F5] */
    static {
        q qVar = new q();
        yq = qVar;
        v3 v3Var = new v3();
        SN = v3Var;
        W w = new W();
        N = w;
        v vVar = new v();
        tF = vVar;
        ee eeVar = new ee();
        zH = eeVar;
        g9 g9Var = new g9();
        i = g9Var;
        xa xaVar = new xa();
        t0 = xaVar;
        Gd gd = new Gd();
        Gc = gd;
        Nl nl = new Nl();
        M = nl;
        yq yqVar = new yq();
        KJ = yqVar;
        SN sn = new SN();
        q = sn;
        N n = new N();
        B = n;
        tF tFVar = new tF();
        G = tFVar;
        zH zHVar = new zH();
        G4 = zHVar;
        i iVar = new i();
        dT = iVar;
        t0 t0Var = new t0();
        F5 = t0Var;
        Gc gc = new Gc();
        v3 = gc;
        M m = new M();
        W = m;
        KJ kj = new KJ();
        v = kj;
        B b = new B();
        ee = b;
        G g = new G();
        g9 = g;
        G4 g4 = new G4();
        xa = g4;
        dT dTVar = new dT();
        Gd = dTVar;
        ?? f5 = new VG() { // from class: com.github.catvod.spider.merge.VG.F5
            @Override // com.github.catvod.spider.merge.VG
            final boolean tF(AbstractC0191uC uCVar, C0197vV vVVar) {
                return true;
            }
        };
        Nl = f5;
        O = new VG[]{qVar, v3Var, w, vVar, eeVar, g9Var, xaVar, gd, nl, yqVar, sn, n, tFVar, zHVar, iVar, t0Var, gc, m, kj, b, g, g4, dTVar, f5};
    }

    VG(String str, int i2, q qVar) {
    }

    static void SN(AbstractC0191uC.t0 t0Var, C0197vV vVVar) {
        vVVar.N.xa(mV.zH);
        vVVar.xU();
        vVVar.I(Gc);
        vVVar.g(t0Var);
    }

    public static VG valueOf(String str) {
        return (VG) Enum.valueOf(VG.class, str);
    }

    public static VG[] values() {
        return (VG[]) O.clone();
    }

    static boolean yq(AbstractC0191uC uCVar) {
        if (uCVar.SN()) {
            return P1.tF(((AbstractC0191uC.SN) uCVar).B());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean tF(AbstractC0191uC uCVar, C0197vV vVVar);
}
