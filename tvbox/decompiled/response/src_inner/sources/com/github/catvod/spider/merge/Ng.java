package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0191uC;
import java.util.Arrays;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Ng {
    private static final char[] g9;
    static final int[] xa = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    private String F5;
    private final wV SN;
    private String dT;
    private int v3;
    private final q2 yq;
    private mV N = mV.yq;
    private AbstractC0191uC tF = null;
    private boolean zH = false;
    private String i = null;
    private final StringBuilder t0 = new StringBuilder(1024);
    StringBuilder Gc = new StringBuilder(1024);
    AbstractC0191uC.t0 M = new AbstractC0191uC.t0();
    AbstractC0191uC.i KJ = new AbstractC0191uC.i();
    AbstractC0191uC.Gc q = this.M;
    AbstractC0191uC.SN B = new AbstractC0191uC.SN();
    AbstractC0191uC.tF G = new AbstractC0191uC.tF();
    AbstractC0191uC.N G4 = new AbstractC0191uC.N();
    private int W = -1;
    private final int[] v = new int[1];
    private final int[] ee = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        g9 = cArr;
        Arrays.sort(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Ng(q2 q2Var, wV wVVar) {
        this.yq = q2Var;
        this.SN = wVVar;
    }

    private void tF(String str, Object... objArr) {
        if (this.SN.yq()) {
            wV wVVar = this.SN;
            q2 q2Var = this.yq;
            wVVar.add(new C0150my(q2Var, String.format("Invalid character reference: " + str, objArr)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(String str) {
        if (this.i == null) {
            this.i = str;
        } else {
            if (this.t0.length() == 0) {
                this.t0.append(this.i);
            }
            this.t0.append(str);
        }
        this.B.KJ(this.W);
        this.B.yq(this.yq.E1());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F5() {
        this.q.v();
        q(this.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(StringBuilder sb) {
        if (this.i == null) {
            this.i = sb.toString();
        } else {
            if (this.t0.length() == 0) {
                this.t0.append(this.i);
            }
            this.t0.append((CharSequence) sb);
        }
        this.B.KJ(this.W);
        this.B.yq(this.yq.E1());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G4() {
        q(this.G4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final AbstractC0191uC.Gc Gc(boolean z) {
        AbstractC0191uC.Gc gc;
        if (z) {
            gc = this.M;
            gc.OW();
        } else {
            gc = this.KJ;
            gc.Gc();
        }
        this.q = gc;
        return gc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void KJ(char c) {
        if (this.i == null) {
            this.i = String.valueOf(c);
        } else {
            if (this.t0.length() == 0) {
                this.t0.append(this.i);
            }
            this.t0.append(c);
        }
        this.B.KJ(this.W);
        this.B.yq(this.yq.E1());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void M() {
        AbstractC0191uC.M(this.Gc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String N() {
        if (this.F5 == null) {
            StringBuilder yq = by.yq("</");
            yq.append(this.dT);
            this.F5 = yq.toString();
        }
        return this.F5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String SN() {
        return this.dT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W(mV mVVar) {
        if (this.SN.yq()) {
            wV wVVar = this.SN;
            q2 q2Var = this.yq;
            wVVar.add(new C0150my(q2Var, "Unexpected character '%s' in input state [%s]", Character.valueOf(q2Var.g9()), mVVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void dT() {
        q(this.G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ee() {
        return this.dT != null && this.q.Gd().equalsIgnoreCase(this.dT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final AbstractC0191uC g9() {
        while (!this.zH) {
            this.N.t0(this, this.yq);
        }
        StringBuilder sb = this.t0;
        if (sb.length() != 0) {
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            AbstractC0191uC.SN sn = this.B;
            sn.q(sb2);
            this.i = null;
            return sn;
        }
        String str = this.i;
        if (str != null) {
            AbstractC0191uC.SN sn2 = this.B;
            sn2.q(str);
            this.i = null;
            return sn2;
        }
        this.zH = false;
        return this.tF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.G4.Gc();
        Objects.requireNonNull(this.G4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(AbstractC0191uC uCVar) {
        li.zH(this.zH);
        this.tF = uCVar;
        this.zH = true;
        uCVar.KJ(this.v3);
        uCVar.yq(this.yq.E1());
        this.W = -1;
        int i = uCVar.yq;
        if (i == 2) {
            this.dT = ((AbstractC0191uC.t0) uCVar).tF;
            this.F5 = null;
        } else if (i == 3) {
            AbstractC0191uC.i iVar = (AbstractC0191uC.i) uCVar;
            if (iVar.g9()) {
                v("Attributes incorrectly present on end tag [/%s]", iVar.zH);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t0() {
        this.G.Gc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(String str, Object... objArr) {
        if (this.SN.yq()) {
            this.SN.add(new C0150my(this.yq, str, objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v3(mV mVVar) {
        if (this.SN.yq()) {
            this.SN.add(new C0150my(this.yq, "Unexpectedly reached end of file (EOF) in input state [%s]", mVVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void xa(mV mVVar) {
        int ordinal = mVVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 7) {
                this.v3 = this.yq.E1();
            }
        } else if (this.W == -1) {
            this.W = this.yq.E1();
        }
        this.N = mVVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void yq(mV mVVar) {
        xa(mVVar);
        this.yq.yq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] zH(Character ch, boolean z) {
        int i;
        if (this.yq.Gd()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.yq.g9()) || this.yq.Dr(g9)) {
            return null;
        }
        int[] iArr = this.v;
        this.yq.s();
        if (this.yq.n("#")) {
            boolean un = this.yq.un("X");
            q2 q2Var = this.yq;
            String KJ = un ? q2Var.KJ() : q2Var.M();
            if (KJ.length() == 0) {
                tF("numeric reference with no numerals", new Object[0]);
            } else {
                this.yq.Z();
                if (!this.yq.n(";")) {
                    tF("missing semicolon on [&#%s]", KJ);
                }
                try {
                    i = Integer.valueOf(KJ, un ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i = -1;
                }
                if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                    tF("character [%s] outside of valid range", Integer.valueOf(i));
                    iArr[0] = 65533;
                } else {
                    if (i >= 128) {
                        int[] iArr2 = xa;
                        if (i < 160) {
                            tF("character [%s] is not a valid unicode code point", Integer.valueOf(i));
                            i = iArr2[i - 128];
                        }
                    }
                    iArr[0] = i;
                }
                return iArr;
            }
        } else {
            String B = this.yq.B();
            boolean b = this.yq.b(';');
            if (!(C0123il.zH(B) || (C0123il.i(B) && b))) {
                this.yq.tO();
                if (b) {
                    tF("invalid named reference [%s]", B);
                }
                return null;
            } else if (!z || (!this.yq.U() && !this.yq.H() && !this.yq.Zm('=', '-', '_'))) {
                this.yq.Z();
                if (!this.yq.n(";")) {
                    tF("missing semicolon on [&%s]", B);
                }
                int N = C0123il.N(B, this.ee);
                if (N == 1) {
                    iArr[0] = this.ee[0];
                    return iArr;
                } else if (N == 2) {
                    return this.ee;
                } else {
                    li.tF("Unexpected characters returned for " + B);
                    throw null;
                }
            }
        }
        this.yq.tO();
        return null;
    }
}
