package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0191uC;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class mV extends Enum<mV> {
    public static final N B;
    public static final N0 C;
    public static final LY Cu;
    public static final O Dr;
    public static final C0139b E1;
    public static final t0 F5;
    public static final un Fz;
    public static final tF G;
    public static final zH G4;
    public static final u7 Gc;
    public static final dT Gd;
    public static final s H;
    public static final C Hj;
    private static final /* synthetic */ mV[] I;
    public static final RQ J;
    public static final yq KJ;
    public static final C0144o L;
    public static final Hj LY;
    public static final cS M;
    public static final Dr N;
    public static final C0142m N0;
    public static final F5 Nl;
    public static final W O;
    public static final v3 OW;
    public static final R Q4;
    public static final k R;
    public static final U RQ;
    public static final xa SN;
    public static final C0143n U;
    public static final E1 V;
    public static final M W;
    public static final Q4 XO;
    public static final Fz Z;
    public static final OW Zm;
    public static final Nl b;
    public static final L cS;
    public static final nQ cp;
    public static final i dT;
    public static final B ee;
    public static final g1 g;
    public static final C0145v g1;
    public static final G g9;
    public static final Cu i;
    public static final Z i3;
    public static final p j;
    public static final H k;
    public static final C0141j kR;
    public static final xU lF;
    public static final C0140g m;
    public static final lF mG;
    public static final g9 n;
    public static final XO nQ;
    public static final C0146w o;
    public static final J p;
    public static final SN q;
    public static final ee s;
    public static final cp t0;
    public static final V tF;
    public static final Zm tO;
    public static final kR u7;
    public static final Gd un;
    public static final KJ v;
    public static final Gc v3;
    public static final i3 w;
    public static final tO xU;
    public static final G4 xa;
    public static final q yq;
    public static final mG zH;
    static final char[] OB = {'\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
    static final char[] x = {0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
    private static final String ue = String.valueOf((char) 65533);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class B extends mV {
        B() {
            super("ScriptDataEscapeStart", 19, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            if (q2Var.b('-')) {
                ng.KJ('-');
                ng.yq(mV.g9);
                return;
            }
            ng.xa(mV.i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class C extends mV {
        C() {
            super("BeforeDoctypePublicIdentifier", 55, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i != '\t' && i != '\n' && i != '\f' && i != '\r' && i != ' ') {
                if (i == '\"') {
                    mVVar = mV.XO;
                } else if (i != '\'') {
                    if (i == '>') {
                        ng.W(this);
                    } else if (i != 65535) {
                        ng.W(this);
                        ng.G.Gc = true;
                        mVVar = mV.u7;
                    } else {
                        ng.v3(this);
                    }
                    ng.G.Gc = true;
                    ng.dT();
                    ng.xa(qVar);
                    return;
                } else {
                    mVVar = mV.j;
                }
                ng.xa(mVVar);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class Cu extends mV {
        Cu() {
            super("ScriptData", 5, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.SN(ng, q2Var, this, mV.v3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class Dr extends mV {
        Dr() {
            super("Rcdata", 2, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            char g9 = q2Var.g9();
            if (g9 != 0) {
                if (g9 == '&') {
                    mVVar = mV.tF;
                } else if (g9 == '<') {
                    mVVar = mV.q;
                } else if (g9 != 65535) {
                    ng.B(q2Var.Gc());
                    return;
                } else {
                    ng.q(new AbstractC0191uC.zH());
                    return;
                }
                ng.yq(mVVar);
                return;
            }
            ng.W(this);
            q2Var.yq();
            ng.KJ((char) 65533);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class E1 extends mV {
        E1() {
            super("MarkupDeclarationOpen", 43, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            if (q2Var.n("--")) {
                ng.G4.Gc();
                mVVar = mV.xU;
            } else if (q2Var.un("DOCTYPE")) {
                mVVar = mV.C;
            } else if (q2Var.n("[CDATA[")) {
                ng.M();
                mVVar = mV.cS;
            } else {
                ng.W(this);
                ng.i();
                mVVar = mV.Z;
            }
            ng.xa(mVVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class F5 extends mV {
        F5() {
            super("ScriptDataEscapedDashDash", 23, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            G4 g4 = mV.xa;
            if (q2Var.Gd()) {
                ng.v3(this);
                ng.xa(mV.yq);
                return;
            }
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                ng.KJ((char) 65533);
            } else if (i != '-') {
                if (i != '<') {
                    ng.KJ(i);
                    if (i == '>') {
                        mVVar = mV.i;
                    }
                } else {
                    mVVar = mV.OW;
                }
                ng.xa(mVVar);
                return;
            } else {
                ng.KJ(i);
                return;
            }
            ng.xa(g4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class Fz extends mV {
        Fz() {
            super("BogusComment", 42, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            ng.G4.B(q2Var.F5('>'));
            char g9 = q2Var.g9();
            if (g9 == '>' || g9 == 65535) {
                q2Var.i();
                ng.G4();
                ng.xa(mV.yq);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class G extends mV {
        G() {
            super("ScriptDataEscapeStartDash", 20, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            if (q2Var.b('-')) {
                ng.KJ('-');
                ng.yq(mV.Nl);
                return;
            }
            ng.xa(mV.i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class G4 extends mV {
        G4() {
            super("ScriptDataEscaped", 21, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            if (q2Var.Gd()) {
                ng.v3(this);
                ng.xa(mV.yq);
                return;
            }
            char g9 = q2Var.g9();
            if (g9 != 0) {
                if (g9 == '-') {
                    ng.KJ('-');
                    mVVar = mV.Gd;
                } else if (g9 != '<') {
                    ng.B(q2Var.v3('-', '<', 0));
                    return;
                } else {
                    mVVar = mV.OW;
                }
                ng.yq(mVVar);
                return;
            }
            ng.W(this);
            q2Var.yq();
            ng.KJ((char) 65533);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class Gc extends mV {
        Gc() {
            super("ScriptDataLessthanSign", 16, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            char i = q2Var.i();
            if (i == '!') {
                ng.B("<!");
                mVVar = mV.ee;
            } else if (i != '/') {
                ng.B("<");
                if (i != 65535) {
                    q2Var.RQ();
                    mVVar = mV.i;
                } else {
                    ng.v3(this);
                    mVVar = mV.yq;
                }
            } else {
                ng.M();
                mVVar = mV.W;
            }
            ng.xa(mVVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class Gd extends mV {
        Gd() {
            super("ScriptDataDoubleEscapedDash", 29, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            g9 g9Var = mV.n;
            char i = q2Var.i();
            if (i != 0) {
                if (i == '-') {
                    ng.KJ(i);
                    mVVar = mV.b;
                } else if (i == '<') {
                    ng.KJ(i);
                    mVVar = mV.Zm;
                } else if (i == 65535) {
                    ng.v3(this);
                    mVVar = mV.yq;
                }
                ng.xa(mVVar);
                return;
            }
            ng.W(this);
            i = 65533;
            ng.KJ(i);
            ng.xa(g9Var);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class H extends mV {
        H() {
            super("AfterAttributeValue_quoted", 40, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            q qVar = mV.yq;
            g1 g1Var = mV.g;
            char i = q2Var.i();
            if (!(i == '\t' || i == '\n' || i == '\f' || i == '\r' || i == ' ')) {
                if (i != '/') {
                    if (i == '>') {
                        ng.F5();
                    } else if (i != 65535) {
                        q2Var.RQ();
                        ng.W(this);
                    } else {
                        ng.v3(this);
                    }
                    ng.xa(qVar);
                    return;
                }
                ng.xa(mV.RQ);
                return;
            }
            ng.xa(g1Var);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class Hj extends mV {
        Hj() {
            super("BetweenDoctypePublicAndSystemIdentifiers", 59, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i != '\t' && i != '\n' && i != '\f' && i != '\r' && i != ' ') {
                if (i == '\"') {
                    ng.W(this);
                    mVVar = mV.L;
                } else if (i != '\'') {
                    if (i != '>') {
                        if (i != 65535) {
                            ng.W(this);
                            ng.G.Gc = true;
                            mVVar = mV.u7;
                        } else {
                            ng.v3(this);
                            ng.G.Gc = true;
                        }
                    }
                    ng.dT();
                    ng.xa(qVar);
                    return;
                } else {
                    ng.W(this);
                    mVVar = mV.Cu;
                }
                ng.xa(mVVar);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class J extends mV {
        J() {
            super("DoctypeName", 52, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            StringBuilder sb;
            q qVar = mV.yq;
            if (q2Var.U()) {
                ng.G.tF.append(q2Var.q());
                return;
            }
            char i = q2Var.i();
            if (i != 0) {
                if (i != ' ') {
                    if (i != '>') {
                        if (i == 65535) {
                            ng.v3(this);
                            ng.G.Gc = true;
                        } else if (!(i == '\t' || i == '\n' || i == '\f' || i == '\r')) {
                            sb = ng.G.tF;
                        }
                    }
                    ng.dT();
                    ng.xa(qVar);
                    return;
                }
                ng.xa(mV.w);
                return;
            }
            ng.W(this);
            sb = ng.G.tF;
            i = 65533;
            sb.append(i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class KJ extends mV {
        KJ() {
            super("ScriptDataEndTagName", 18, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.zH(ng, q2Var, mV.i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class L extends mV {
        L() {
            super("CdataSection", 66, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            ng.Gc.append(q2Var.dT());
            if (q2Var.n("]]>") || q2Var.Gd()) {
                ng.q(new AbstractC0191uC.yq(ng.Gc.toString()));
                ng.xa(mV.yq);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class LY extends mV {
        LY() {
            super("DoctypeSystemIdentifier_singleQuoted", 63, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            StringBuilder sb;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                sb = ng.G.t0;
                i = 65533;
            } else if (i != '\'') {
                if (i == '>') {
                    ng.W(this);
                } else if (i != 65535) {
                    sb = ng.G.t0;
                } else {
                    ng.v3(this);
                }
                ng.G.Gc = true;
                ng.dT();
                ng.xa(qVar);
                return;
            } else {
                ng.xa(mV.cp);
                return;
            }
            sb.append(i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class M extends mV {
        M() {
            super("ScriptDataEndTagOpen", 17, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.tF(ng, q2Var, mV.v, mV.i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class N extends mV {
        N() {
            super("RCDATAEndTagOpen", 11, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            if (q2Var.g()) {
                ng.Gc(false);
                ng.q.F5(q2Var.g9());
                ng.Gc.append(q2Var.g9());
                ng.yq(mV.G);
                return;
            }
            ng.B("</");
            ng.xa(mV.N);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class N0 extends mV {
        N0() {
            super("Doctype", 50, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            R r = mV.Q4;
            char i = q2Var.i();
            if (!(i == '\t' || i == '\n' || i == '\f' || i == '\r' || i == ' ')) {
                if (i != '>') {
                    if (i != 65535) {
                        ng.W(this);
                    } else {
                        ng.v3(this);
                    }
                }
                ng.W(this);
                ng.t0();
                ng.G.Gc = true;
                ng.dT();
                ng.xa(mV.yq);
                return;
            }
            ng.xa(r);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class Nl extends mV {
        Nl() {
            super("ScriptDataDoubleEscapedDashDash", 30, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            g9 g9Var = mV.n;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                i = 65533;
            } else if (i != '-') {
                if (i == '<') {
                    ng.KJ(i);
                    mVVar = mV.Zm;
                } else if (i == '>') {
                    ng.KJ(i);
                    mVVar = mV.i;
                } else if (i == 65535) {
                    ng.v3(this);
                    mVVar = mV.yq;
                }
                ng.xa(mVVar);
                return;
            } else {
                ng.KJ(i);
                return;
            }
            ng.KJ(i);
            ng.xa(g9Var);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class O extends mV {
        O() {
            super("ScriptDataDoubleEscapeEnd", 32, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.i(ng, q2Var, mV.xa, mV.n);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class OW extends mV {
        OW() {
            super("ScriptDataDoubleEscapedLessthanSign", 31, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            if (q2Var.b('/')) {
                ng.KJ('/');
                ng.M();
                ng.yq(mV.Dr);
                return;
            }
            ng.xa(mV.n);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class Q4 extends mV {
        Q4() {
            super("DoctypePublicIdentifier_doubleQuoted", 56, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            StringBuilder sb;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                sb = ng.G.i;
                i = 65533;
            } else if (i != '\"') {
                if (i == '>') {
                    ng.W(this);
                } else if (i != 65535) {
                    sb = ng.G.i;
                } else {
                    ng.v3(this);
                }
                ng.G.Gc = true;
                ng.dT();
                ng.xa(qVar);
                return;
            } else {
                ng.xa(mV.o);
                return;
            }
            sb.append(i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class R extends mV {
        R() {
            super("BeforeDoctypeName", 51, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            J j = mV.p;
            if (q2Var.g()) {
                ng.t0();
                ng.xa(j);
                return;
            }
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                ng.t0();
                ng.G.tF.append((char) 65533);
            } else if (i == ' ') {
                return;
            } else {
                if (i == 65535) {
                    ng.v3(this);
                    ng.t0();
                    ng.G.Gc = true;
                    ng.dT();
                    ng.xa(mV.yq);
                    return;
                } else if (i != '\t' && i != '\n' && i != '\f' && i != '\r') {
                    ng.t0();
                    ng.G.tF.append(i);
                } else {
                    return;
                }
            }
            ng.xa(j);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class RQ extends mV {
        RQ() {
            super("CommentEndDash", 47, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            k kVar = mV.R;
            char i = q2Var.i();
            if (i != 0) {
                if (i == '-') {
                    mVVar = mV.i3;
                } else if (i != 65535) {
                    AbstractC0191uC.N n = ng.G4;
                    n.q('-');
                    n.q(i);
                } else {
                    ng.v3(this);
                    ng.G4();
                    mVVar = mV.yq;
                }
                ng.xa(mVVar);
                return;
            }
            ng.W(this);
            AbstractC0191uC.N n2 = ng.G4;
            n2.q('-');
            n2.q((char) 65533);
            ng.xa(kVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class SN extends mV {
        SN() {
            super("RcdataLessthanSign", 10, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            if (q2Var.b('/')) {
                ng.M();
                ng.yq(mV.B);
                return;
            }
            if (!q2Var.g() || ng.SN() == null || q2Var.ee(ng.N())) {
                ng.B("<");
                mVVar = mV.N;
            } else {
                AbstractC0191uC.Gc Gc = ng.Gc(false);
                Gc.xa(ng.SN());
                ng.q = Gc;
                ng.F5();
                mVVar = mV.Gc;
            }
            ng.xa(mVVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class U extends mV {
        U() {
            super("SelfClosingStartTag", 41, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i == '>') {
                ng.q.G = true;
                ng.F5();
            } else if (i != 65535) {
                q2Var.RQ();
                ng.W(this);
                ng.xa(mV.g);
                return;
            } else {
                ng.v3(this);
            }
            ng.xa(qVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class V extends mV {
        V() {
            super("CharacterReferenceInRcdata", 3, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.yq(ng, mV.N);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class W extends mV {
        W() {
            super("ScriptDataEscapedEndTagOpen", 25, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            if (q2Var.g()) {
                ng.Gc(false);
                ng.q.F5(q2Var.g9());
                ng.Gc.append(q2Var.g9());
                ng.yq(mV.g1);
                return;
            }
            ng.B("</");
            ng.xa(mV.xa);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class XO extends mV {
        XO() {
            super("AfterDoctypeSystemKeyword", 60, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i == '\t' || i == '\n' || i == '\f' || i == '\r' || i == ' ') {
                mVVar = mV.kR;
            } else if (i == '\"') {
                ng.W(this);
                mVVar = mV.L;
            } else if (i != '\'') {
                if (i == '>') {
                    ng.W(this);
                } else if (i != 65535) {
                    ng.W(this);
                    ng.G.Gc = true;
                    ng.dT();
                    return;
                } else {
                    ng.v3(this);
                }
                ng.G.Gc = true;
                ng.dT();
                ng.xa(qVar);
                return;
            } else {
                ng.W(this);
                mVVar = mV.Cu;
            }
            ng.xa(mVVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class Z extends mV {
        Z() {
            super("CommentEnd", 48, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            q qVar = mV.yq;
            k kVar = mV.R;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                AbstractC0191uC.N n = ng.G4;
                n.B("--");
                n.q((char) 65533);
            } else if (i == '!') {
                ng.xa(mV.lF);
                return;
            } else if (i != '-') {
                if (i != '>') {
                    if (i != 65535) {
                        AbstractC0191uC.N n2 = ng.G4;
                        n2.B("--");
                        n2.q(i);
                    } else {
                        ng.v3(this);
                    }
                }
                ng.G4();
                ng.xa(qVar);
                return;
            } else {
                ng.G4.q('-');
                return;
            }
            ng.xa(kVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class Zm extends mV {
        Zm() {
            super("AttributeValue_singleQuoted", 38, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            AbstractC0191uC.Gc gc;
            mV mVVar;
            String t0 = q2Var.t0(true);
            if (t0.length() > 0) {
                ng.q.G4(t0);
            } else {
                ng.q.O();
            }
            char i = q2Var.i();
            if (i != 0) {
                if (i == 65535) {
                    ng.v3(this);
                    mVVar = mV.yq;
                } else if (i == '&') {
                    int[] zH = ng.zH('\'', true);
                    AbstractC0191uC.Gc gc2 = ng.q;
                    if (zH != null) {
                        gc2.dT(zH);
                        return;
                    } else {
                        gc2.G('&');
                        return;
                    }
                } else if (i != '\'') {
                    gc = ng.q;
                } else {
                    mVVar = mV.k;
                }
                ng.xa(mVVar);
                return;
            }
            ng.W(this);
            gc = ng.q;
            i = 65533;
            gc.G(i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.github.catvod.spider.merge.mV$b  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class C0139b extends mV {
        C0139b() {
            super("AttributeValue_doubleQuoted", 37, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            AbstractC0191uC.Gc gc;
            mV mVVar;
            String t0 = q2Var.t0(false);
            if (t0.length() > 0) {
                ng.q.G4(t0);
            } else {
                ng.q.O();
            }
            char i = q2Var.i();
            if (i != 0) {
                if (i == '\"') {
                    mVVar = mV.k;
                } else if (i == '&') {
                    int[] zH = ng.zH('\"', true);
                    AbstractC0191uC.Gc gc2 = ng.q;
                    if (zH != null) {
                        gc2.dT(zH);
                        return;
                    } else {
                        gc2.G('&');
                        return;
                    }
                } else if (i != 65535) {
                    gc = ng.q;
                } else {
                    ng.v3(this);
                    mVVar = mV.yq;
                }
                ng.xa(mVVar);
                return;
            }
            ng.W(this);
            gc = ng.q;
            i = 65533;
            gc.G(i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class cS extends mV {
        cS() {
            super("EndTagOpen", 8, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            if (q2Var.Gd()) {
                ng.v3(this);
                ng.B("</");
                ng.xa(qVar);
                return;
            }
            if (q2Var.g()) {
                ng.Gc(false);
                mVVar = mV.KJ;
            } else {
                boolean b = q2Var.b('>');
                ng.W(this);
                if (b) {
                    ng.yq(qVar);
                    return;
                }
                ng.i();
                ng.G4.q('/');
                mVVar = mV.Z;
            }
            ng.xa(mVVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class cp extends mV {
        cp() {
            super("PLAINTEXT", 6, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            char g9 = q2Var.g9();
            if (g9 == 0) {
                ng.W(this);
                q2Var.yq();
                ng.KJ((char) 65533);
            } else if (g9 != 65535) {
                ng.B(q2Var.F5((char) 0));
            } else {
                ng.q(new AbstractC0191uC.zH());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class dT extends mV {
        dT() {
            super("ScriptDataEscapedDash", 22, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            G4 g4 = mV.xa;
            if (q2Var.Gd()) {
                ng.v3(this);
                ng.xa(mV.yq);
                return;
            }
            char i = q2Var.i();
            if (i != 0) {
                if (i == '-') {
                    ng.KJ(i);
                    mVVar = mV.Nl;
                } else if (i == '<') {
                    mVVar = mV.OW;
                }
                ng.xa(mVVar);
                return;
            }
            ng.W(this);
            i = 65533;
            ng.KJ(i);
            ng.xa(g4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class ee extends mV {
        ee() {
            super("ScriptDataDoubleEscapeStart", 27, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.i(ng, q2Var, mV.n, mV.xa);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.github.catvod.spider.merge.mV$g  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class C0140g extends mV {
        C0140g() {
            super("AttributeValue_unquoted", 39, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            AbstractC0191uC.Gc gc;
            q qVar = mV.yq;
            String W = q2Var.W(mV.x);
            if (W.length() > 0) {
                ng.q.G4(W);
            }
            char i = q2Var.i();
            if (i != 0) {
                if (i != ' ') {
                    if (!(i == '\"' || i == '`')) {
                        if (i == 65535) {
                            ng.v3(this);
                        } else if (!(i == '\t' || i == '\n' || i == '\f' || i == '\r')) {
                            if (i == '&') {
                                int[] zH = ng.zH('>', true);
                                AbstractC0191uC.Gc gc2 = ng.q;
                                if (zH != null) {
                                    gc2.dT(zH);
                                    return;
                                } else {
                                    gc2.G('&');
                                    return;
                                }
                            } else if (i != '\'') {
                                switch (i) {
                                    case '>':
                                        ng.F5();
                                        break;
                                    case '<':
                                    case '=':
                                        ng.W(this);
                                        break;
                                }
                                gc = ng.q;
                            }
                        }
                        ng.xa(qVar);
                        return;
                    }
                    ng.W(this);
                    gc = ng.q;
                }
                ng.xa(mV.g);
                return;
            }
            ng.W(this);
            gc = ng.q;
            i = 65533;
            gc.G(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class g1 extends mV {
        g1() {
            super("BeforeAttributeName", 33, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            q qVar = mV.yq;
            s sVar = mV.H;
            char i = q2Var.i();
            if (i == 0) {
                q2Var.RQ();
                ng.W(this);
                ng.q.Nl();
            } else if (i != ' ') {
                if (!(i == '\"' || i == '\'')) {
                    if (i != '/') {
                        if (i != 65535) {
                            if (i != '\t' && i != '\n' && i != '\f' && i != '\r') {
                                switch (i) {
                                    case '<':
                                        q2Var.RQ();
                                        ng.W(this);
                                        ng.F5();
                                        break;
                                    case '=':
                                        break;
                                    case '>':
                                        ng.F5();
                                        break;
                                    default:
                                        ng.q.Nl();
                                        q2Var.RQ();
                                        break;
                                }
                            } else {
                                return;
                            }
                        } else {
                            ng.v3(this);
                        }
                        ng.xa(qVar);
                        return;
                    }
                    ng.xa(mV.RQ);
                    return;
                }
                ng.W(this);
                ng.q.Nl();
                ng.q.q(i);
            } else {
                return;
            }
            ng.xa(sVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class g9 extends mV {
        g9() {
            super("ScriptDataDoubleEscaped", 28, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            char g9 = q2Var.g9();
            if (g9 != 0) {
                if (g9 == '-') {
                    ng.KJ(g9);
                    mVVar = mV.un;
                } else if (g9 == '<') {
                    ng.KJ(g9);
                    mVVar = mV.Zm;
                } else if (g9 != 65535) {
                    ng.B(q2Var.v3('-', '<', 0));
                    return;
                } else {
                    ng.v3(this);
                    ng.xa(mV.yq);
                    return;
                }
                ng.yq(mVVar);
                return;
            }
            ng.W(this);
            q2Var.yq();
            ng.KJ((char) 65533);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class i extends mV {
        i() {
            super("RawtextEndTagOpen", 14, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.tF(ng, q2Var, mV.F5, mV.zH);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class i3 extends mV {
        i3() {
            super("AfterDoctypeName", 53, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            if (q2Var.Gd()) {
                ng.v3(this);
                ng.G.Gc = true;
                ng.dT();
                ng.xa(qVar);
            } else if (q2Var.Zm('\t', '\n', '\r', '\f', ' ')) {
                q2Var.yq();
            } else if (q2Var.b('>')) {
                ng.dT();
                ng.yq(qVar);
            } else {
                if (q2Var.un("PUBLIC")) {
                    ng.G.zH = "PUBLIC";
                    mVVar = mV.mG;
                } else if (q2Var.un("SYSTEM")) {
                    ng.G.zH = "SYSTEM";
                    mVVar = mV.nQ;
                } else {
                    ng.W(this);
                    ng.G.Gc = true;
                    ng.yq(mV.u7);
                    return;
                }
                ng.xa(mVVar);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.github.catvod.spider.merge.mV$j  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class C0141j extends mV {
        C0141j() {
            super("BeforeDoctypeSystemIdentifier", 61, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i != '\t' && i != '\n' && i != '\f' && i != '\r' && i != ' ') {
                if (i == '\"') {
                    mVVar = mV.L;
                } else if (i != '\'') {
                    if (i == '>') {
                        ng.W(this);
                    } else if (i != 65535) {
                        ng.W(this);
                        ng.G.Gc = true;
                        mVVar = mV.u7;
                    } else {
                        ng.v3(this);
                    }
                    ng.G.Gc = true;
                    ng.dT();
                    ng.xa(qVar);
                    return;
                } else {
                    mVVar = mV.Cu;
                }
                ng.xa(mVVar);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class k extends mV {
        k() {
            super("Comment", 46, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            char g9 = q2Var.g9();
            if (g9 == 0) {
                ng.W(this);
                q2Var.yq();
                ng.G4.q((char) 65533);
            } else if (g9 == '-') {
                ng.yq(mV.J);
            } else if (g9 != 65535) {
                ng.G4.B(q2Var.v3('-', 0));
            } else {
                ng.v3(this);
                ng.G4();
                ng.xa(mV.yq);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class kR extends mV {
        kR() {
            super("BogusDoctype", 65, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i == '>' || i == 65535) {
                ng.dT();
                ng.xa(qVar);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class lF extends mV {
        lF() {
            super("AfterDoctypePublicKeyword", 54, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i == '\t' || i == '\n' || i == '\f' || i == '\r' || i == ' ') {
                mVVar = mV.Hj;
            } else if (i == '\"') {
                ng.W(this);
                mVVar = mV.XO;
            } else if (i != '\'') {
                if (i == '>') {
                    ng.W(this);
                } else if (i != 65535) {
                    ng.W(this);
                    ng.G.Gc = true;
                    mVVar = mV.u7;
                } else {
                    ng.v3(this);
                }
                ng.G.Gc = true;
                ng.dT();
                ng.xa(qVar);
                return;
            } else {
                ng.W(this);
                mVVar = mV.j;
            }
            ng.xa(mVVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.github.catvod.spider.merge.mV$m  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class C0142m extends mV {
        C0142m() {
            super("CommentStartDash", 45, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            q qVar = mV.yq;
            k kVar = mV.R;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                ng.G4.q((char) 65533);
            } else if (i != '-') {
                if (i == '>') {
                    ng.W(this);
                } else if (i != 65535) {
                    ng.G4.q(i);
                } else {
                    ng.v3(this);
                }
                ng.G4();
                ng.xa(qVar);
                return;
            } else {
                ng.xa(mV.i3);
                return;
            }
            ng.xa(kVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class mG extends mV {
        mG() {
            super("Rawtext", 4, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.SN(ng, q2Var, this, mV.G4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.github.catvod.spider.merge.mV$n  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class C0143n extends mV {
        C0143n() {
            super("AfterAttributeName", 35, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            s sVar = mV.H;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                ng.q.q((char) 65533);
            } else if (i != ' ') {
                if (!(i == '\"' || i == '\'')) {
                    if (i != '/') {
                        if (i != 65535) {
                            if (i != '\t' && i != '\n' && i != '\f' && i != '\r') {
                                switch (i) {
                                    case '<':
                                        break;
                                    case '=':
                                        mVVar = mV.Fz;
                                        break;
                                    case '>':
                                        ng.F5();
                                        break;
                                    default:
                                        ng.q.Nl();
                                        q2Var.RQ();
                                        break;
                                }
                            } else {
                                return;
                            }
                        } else {
                            ng.v3(this);
                        }
                        ng.xa(qVar);
                        return;
                    }
                    mVVar = mV.RQ;
                    ng.xa(mVVar);
                    return;
                }
                ng.W(this);
                ng.q.Nl();
                ng.q.q(i);
            } else {
                return;
            }
            ng.xa(sVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class nQ extends mV {
        nQ() {
            super("AfterDoctypeSystemIdentifier", 64, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i != '\t' && i != '\n' && i != '\f' && i != '\r' && i != ' ') {
                if (i != '>') {
                    if (i != 65535) {
                        ng.W(this);
                        ng.xa(mV.u7);
                        return;
                    }
                    ng.v3(this);
                    ng.G.Gc = true;
                }
                ng.dT();
                ng.xa(qVar);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.github.catvod.spider.merge.mV$o  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class C0144o extends mV {
        C0144o() {
            super("DoctypeSystemIdentifier_doubleQuoted", 62, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            StringBuilder sb;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                sb = ng.G.t0;
                i = 65533;
            } else if (i != '\"') {
                if (i == '>') {
                    ng.W(this);
                } else if (i != 65535) {
                    sb = ng.G.t0;
                } else {
                    ng.v3(this);
                }
                ng.G.Gc = true;
                ng.dT();
                ng.xa(qVar);
                return;
            } else {
                ng.xa(mV.cp);
                return;
            }
            sb.append(i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class p extends mV {
        p() {
            super("DoctypePublicIdentifier_singleQuoted", 57, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            StringBuilder sb;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                sb = ng.G.i;
                i = 65533;
            } else if (i != '\'') {
                if (i == '>') {
                    ng.W(this);
                } else if (i != 65535) {
                    sb = ng.G.i;
                } else {
                    ng.v3(this);
                }
                ng.G.Gc = true;
                ng.dT();
                ng.xa(qVar);
                return;
            } else {
                ng.xa(mV.o);
                return;
            }
            sb.append(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class q extends mV {
        q() {
            super("Data", 0, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            char g9 = q2Var.g9();
            if (g9 != 0) {
                if (g9 == '&') {
                    mVVar = mV.SN;
                } else if (g9 == '<') {
                    mVVar = mV.Gc;
                } else if (g9 != 65535) {
                    ng.B(q2Var.Gc());
                    return;
                } else {
                    ng.q(new AbstractC0191uC.zH());
                    return;
                }
                ng.yq(mVVar);
                return;
            }
            ng.W(this);
            ng.KJ(q2Var.i());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class s extends mV {
        s() {
            super("AttributeName", 34, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            ng.q.B(q2Var.W(mV.OB));
            char i = q2Var.i();
            if (i == '\t' || i == '\n' || i == '\f' || i == '\r' || i == ' ') {
                mVVar = mV.U;
            } else {
                if (!(i == '\"' || i == '\'')) {
                    if (i != '/') {
                        if (i != 65535) {
                            switch (i) {
                                case '=':
                                    mVVar = mV.Fz;
                                    break;
                                case '>':
                                    ng.F5();
                                    break;
                            }
                            ng.q.q(i);
                            return;
                        }
                        ng.v3(this);
                        ng.xa(qVar);
                        return;
                    }
                    mVVar = mV.RQ;
                }
                ng.W(this);
                ng.q.q(i);
                return;
            }
            ng.xa(mVVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class t0 extends mV {
        t0() {
            super("RawtextEndTagName", 15, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.zH(ng, q2Var, mV.zH);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class tF extends mV {
        tF() {
            super("RCDATAEndTagName", 12, null);
        }

        private void Gc(Ng ng, q2 q2Var) {
            ng.B("</");
            ng.G(ng.Gc);
            q2Var.RQ();
            ng.xa(mV.N);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            if (q2Var.g()) {
                String q = q2Var.q();
                ng.q.v3(q);
                ng.Gc.append(q);
                return;
            }
            char i = q2Var.i();
            if (i == '\t' || i == '\n' || i == '\f' || i == '\r' || i == ' ') {
                if (ng.ee()) {
                    mVVar = mV.g;
                    ng.xa(mVVar);
                    return;
                }
                Gc(ng, q2Var);
            } else if (i != '/') {
                if (i == '>' && ng.ee()) {
                    ng.F5();
                    mVVar = mV.yq;
                    ng.xa(mVVar);
                    return;
                }
                Gc(ng, q2Var);
            } else {
                if (ng.ee()) {
                    mVVar = mV.RQ;
                    ng.xa(mVVar);
                    return;
                }
                Gc(ng, q2Var);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class tO extends mV {
        tO() {
            super("CommentStart", 44, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            q qVar = mV.yq;
            k kVar = mV.R;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                ng.G4.q((char) 65533);
            } else if (i != '-') {
                if (i == '>') {
                    ng.W(this);
                } else if (i != 65535) {
                    q2Var.RQ();
                } else {
                    ng.v3(this);
                }
                ng.G4();
                ng.xa(qVar);
                return;
            } else {
                ng.xa(mV.N0);
                return;
            }
            ng.xa(kVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class u7 extends mV {
        u7() {
            super("TagOpen", 7, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            mV mVVar2;
            char g9 = q2Var.g9();
            if (g9 == '!') {
                mVVar = mV.V;
            } else if (g9 != '/') {
                if (g9 == '?') {
                    ng.i();
                    mVVar2 = mV.Z;
                } else if (q2Var.g()) {
                    ng.Gc(true);
                    mVVar2 = mV.KJ;
                } else {
                    ng.W(this);
                    ng.KJ('<');
                    mVVar2 = mV.yq;
                }
                ng.xa(mVVar2);
                return;
            } else {
                mVVar = mV.M;
            }
            ng.yq(mVVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class un extends mV {
        un() {
            super("BeforeAttributeValue", 36, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            C0140g gVar = mV.m;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                ng.q.G((char) 65533);
            } else if (i != ' ') {
                if (i != '\"') {
                    if (i != '`') {
                        if (i == 65535) {
                            ng.v3(this);
                        } else if (i != '\t' && i != '\n' && i != '\f' && i != '\r') {
                            if (i != '&') {
                                if (i != '\'') {
                                    switch (i) {
                                        case '>':
                                            ng.W(this);
                                            break;
                                    }
                                } else {
                                    mVVar = mV.tO;
                                }
                            }
                            q2Var.RQ();
                        } else {
                            return;
                        }
                        ng.F5();
                        ng.xa(qVar);
                        return;
                    }
                    ng.W(this);
                    ng.q.G(i);
                } else {
                    mVVar = mV.E1;
                }
                ng.xa(mVVar);
                return;
            } else {
                return;
            }
            ng.xa(gVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.github.catvod.spider.merge.mV$v  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class C0145v extends mV {
        C0145v() {
            super("ScriptDataEscapedEndTagName", 26, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.zH(ng, q2Var, mV.xa);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class v3 extends mV {
        v3() {
            super("ScriptDataEscapedLessthanSign", 24, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            if (q2Var.g()) {
                ng.M();
                ng.Gc.append(q2Var.g9());
                ng.B("<");
                ng.KJ(q2Var.g9());
                mVVar = mV.s;
            } else if (q2Var.b('/')) {
                ng.M();
                mVVar = mV.O;
            } else {
                ng.KJ('<');
                ng.xa(mV.xa);
                return;
            }
            ng.yq(mVVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.github.catvod.spider.merge.mV$w  reason: case insensitive filesystem */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class C0146w extends mV {
        C0146w() {
            super("AfterDoctypePublicIdentifier", 58, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            char i = q2Var.i();
            if (i == '\t' || i == '\n' || i == '\f' || i == '\r' || i == ' ') {
                mVVar = mV.LY;
            } else if (i == '\"') {
                ng.W(this);
                mVVar = mV.L;
            } else if (i != '\'') {
                if (i != '>') {
                    if (i != 65535) {
                        ng.W(this);
                        ng.G.Gc = true;
                        mVVar = mV.u7;
                    } else {
                        ng.v3(this);
                        ng.G.Gc = true;
                    }
                }
                ng.dT();
                ng.xa(qVar);
                return;
            } else {
                ng.W(this);
                mVVar = mV.Cu;
            }
            ng.xa(mVVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class xU extends mV {
        xU() {
            super("CommentEndBang", 49, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            q qVar = mV.yq;
            k kVar = mV.R;
            char i = q2Var.i();
            if (i == 0) {
                ng.W(this);
                AbstractC0191uC.N n = ng.G4;
                n.B("--!");
                n.q((char) 65533);
            } else if (i != '-') {
                if (i != '>') {
                    if (i != 65535) {
                        AbstractC0191uC.N n2 = ng.G4;
                        n2.B("--!");
                        n2.q(i);
                    } else {
                        ng.v3(this);
                    }
                }
                ng.G4();
                ng.xa(qVar);
                return;
            } else {
                ng.G4.B("--!");
                ng.xa(mV.J);
                return;
            }
            ng.xa(kVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class xa extends mV {
        xa() {
            super("CharacterReferenceInData", 1, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV.yq(ng, mV.yq);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq extends mV {
        yq() {
            super("TagName", 9, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            mV mVVar;
            q qVar = mV.yq;
            ng.q.v3(q2Var.G4());
            char i = q2Var.i();
            if (i != 0) {
                if (i != ' ') {
                    if (i != '/') {
                        if (i == '<') {
                            q2Var.RQ();
                            ng.W(this);
                        } else if (i != '>') {
                            if (i == 65535) {
                                ng.v3(this);
                                ng.xa(qVar);
                                return;
                            } else if (!(i == '\t' || i == '\n' || i == '\f' || i == '\r')) {
                                ng.q.F5(i);
                                return;
                            }
                        }
                        ng.F5();
                        ng.xa(qVar);
                        return;
                    }
                    mVVar = mV.RQ;
                    ng.xa(mVVar);
                    return;
                }
                mVVar = mV.g;
                ng.xa(mVVar);
                return;
            }
            ng.q.v3(mV.ue);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class zH extends mV {
        zH() {
            super("RawtextLessthanSign", 13, null);
        }

        @Override // com.github.catvod.spider.merge.mV
        final void t0(Ng ng, q2 q2Var) {
            if (q2Var.b('/')) {
                ng.M();
                ng.yq(mV.dT);
                return;
            }
            ng.KJ('<');
            ng.xa(mV.zH);
        }
    }

    static {
        q qVar = new q();
        yq = qVar;
        xa xaVar = new xa();
        SN = xaVar;
        Dr dr = new Dr();
        N = dr;
        V v2 = new V();
        tF = v2;
        mG mGVar = new mG();
        zH = mGVar;
        Cu cu = new Cu();
        i = cu;
        cp cpVar = new cp();
        t0 = cpVar;
        u7 u7Var = new u7();
        Gc = u7Var;
        cS cSVar = new cS();
        M = cSVar;
        yq yqVar = new yq();
        KJ = yqVar;
        SN sn = new SN();
        q = sn;
        N n2 = new N();
        B = n2;
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
        M m2 = new M();
        W = m2;
        KJ kj = new KJ();
        v = kj;
        B b2 = new B();
        ee = b2;
        G g2 = new G();
        g9 = g2;
        G4 g4 = new G4();
        xa = g4;
        dT dTVar = new dT();
        Gd = dTVar;
        F5 f5 = new F5();
        Nl = f5;
        v3 v3Var = new v3();
        OW = v3Var;
        W w2 = new W();
        O = w2;
        C0145v vVar = new C0145v();
        g1 = vVar;
        ee eeVar = new ee();
        s = eeVar;
        g9 g9Var = new g9();
        n = g9Var;
        Gd gd = new Gd();
        un = gd;
        Nl nl = new Nl();
        b = nl;
        OW ow = new OW();
        Zm = ow;
        O o2 = new O();
        Dr = o2;
        g1 g1Var = new g1();
        g = g1Var;
        s sVar = new s();
        H = sVar;
        C0143n nVar = new C0143n();
        U = nVar;
        un unVar = new un();
        Fz = unVar;
        C0139b bVar = new C0139b();
        E1 = bVar;
        Zm zm = new Zm();
        tO = zm;
        C0140g gVar = new C0140g();
        m = gVar;
        H h = new H();
        k = h;
        U u = new U();
        RQ = u;
        Fz fz = new Fz();
        Z = fz;
        E1 e1 = new E1();
        V = e1;
        tO tOVar = new tO();
        xU = tOVar;
        C0142m mVar = new C0142m();
        N0 = mVar;
        k kVar = new k();
        R = kVar;
        RQ rq = new RQ();
        J = rq;
        Z z = new Z();
        i3 = z;
        xU xUVar = new xU();
        lF = xUVar;
        N0 n0 = new N0();
        C = n0;
        R r = new R();
        Q4 = r;
        J j2 = new J();
        p = j2;
        i3 i3Var = new i3();
        w = i3Var;
        lF lFVar = new lF();
        mG = lFVar;
        C c = new C();
        Hj = c;
        Q4 q4 = new Q4();
        XO = q4;
        p pVar = new p();
        j = pVar;
        C0146w wVar = new C0146w();
        o = wVar;
        Hj hj = new Hj();
        LY = hj;
        XO xo = new XO();
        nQ = xo;
        C0141j jVar = new C0141j();
        kR = jVar;
        C0144o oVar = new C0144o();
        L = oVar;
        LY ly = new LY();
        Cu = ly;
        nQ nQVar = new nQ();
        cp = nQVar;
        kR kRVar = new kR();
        u7 = kRVar;
        L l = new L();
        cS = l;
        I = new mV[]{qVar, xaVar, dr, v2, mGVar, cu, cpVar, u7Var, cSVar, yqVar, sn, n2, tFVar, zHVar, iVar, t0Var, gc, m2, kj, b2, g2, g4, dTVar, f5, v3Var, w2, vVar, eeVar, g9Var, gd, nl, ow, o2, g1Var, sVar, nVar, unVar, bVar, zm, gVar, h, u, fz, e1, tOVar, mVar, kVar, rq, z, xUVar, n0, r, j2, i3Var, lFVar, c, q4, pVar, wVar, hj, xo, jVar, oVar, ly, nQVar, kRVar, l};
    }

    mV(String str, int i2, q qVar) {
    }

    static void SN(Ng ng, q2 q2Var, mV mVVar, mV mVVar2) {
        char g92 = q2Var.g9();
        if (g92 == 0) {
            ng.W(mVVar);
            q2Var.yq();
            ng.KJ((char) 65533);
        } else if (g92 == '<') {
            ng.yq(mVVar2);
        } else if (g92 != 65535) {
            ng.B(q2Var.G());
        } else {
            ng.q(new AbstractC0191uC.zH());
        }
    }

    static void i(Ng ng, q2 q2Var, mV mVVar, mV mVVar2) {
        if (q2Var.U()) {
            String q2 = q2Var.q();
            ng.Gc.append(q2);
            ng.B(q2);
            return;
        }
        char i2 = q2Var.i();
        if (i2 == '\t' || i2 == '\n' || i2 == '\f' || i2 == '\r' || i2 == ' ' || i2 == '/' || i2 == '>') {
            if (ng.Gc.toString().equals("script")) {
                ng.xa(mVVar);
            } else {
                ng.xa(mVVar2);
            }
            ng.KJ(i2);
            return;
        }
        q2Var.RQ();
        ng.xa(mVVar2);
    }

    static void tF(Ng ng, q2 q2Var, mV mVVar, mV mVVar2) {
        if (q2Var.g()) {
            ng.Gc(false);
            ng.xa(mVVar);
            return;
        }
        ng.B("</");
        ng.xa(mVVar2);
    }

    public static mV valueOf(String str) {
        return (mV) Enum.valueOf(mV.class, str);
    }

    public static mV[] values() {
        return (mV[]) I.clone();
    }

    static void yq(Ng ng, mV mVVar) {
        int[] zH2 = ng.zH(null, false);
        if (zH2 == null) {
            ng.KJ('&');
        } else {
            ng.B(new String(zH2, 0, zH2.length));
        }
        ng.xa(mVVar);
    }

    static void zH(Ng ng, q2 q2Var, mV mVVar) {
        mV mVVar2;
        if (q2Var.U()) {
            String q2 = q2Var.q();
            ng.q.v3(q2);
            ng.Gc.append(q2);
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (ng.ee() && !q2Var.Gd()) {
            char i2 = q2Var.i();
            if (i2 == '\t' || i2 == '\n' || i2 == '\f' || i2 == '\r' || i2 == ' ') {
                mVVar2 = g;
            } else if (i2 == '/') {
                mVVar2 = RQ;
            } else if (i2 != '>') {
                ng.Gc.append(i2);
                z = true;
                z2 = z;
            } else {
                ng.F5();
                mVVar2 = yq;
            }
            ng.xa(mVVar2);
            z2 = z;
        }
        if (z2) {
            ng.B("</");
            ng.G(ng.Gc);
            ng.xa(mVVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void t0(Ng ng, q2 q2Var);
}
