package com.github.catvod.spider.merge;

import java.io.PrintStream;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Fp {
    protected C0184ta N;
    protected Tu tF;
    protected int zH;
    protected boolean yq = false;
    protected int SN = -1;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    public final void B(Fw fw) {
        AbstractC0137mG mGVar = (AbstractC0137mG) ((lR) fw.SN).yq.yq.get(fw.t0());
        if (!this.yq) {
            int t0 = fw.zH.t0(1);
            N0 n0 = Uf.v3;
            C0184ta zH = n0.zH(mGVar);
            if (zH.tF(t0)) {
                this.tF = null;
                this.zH = -1;
            } else if (!zH.tF(-2)) {
                int N = mGVar.N();
                if (!(N == 3 || N == 4 || N == 5)) {
                    switch (N) {
                        case 9:
                        case 11:
                            KJ(fw);
                            C0184ta N2 = n0.N(fw.t0(), fw.t0);
                            C0184ta N3 = N(fw);
                            C0184ta taVar = new C0184ta(new int[0]);
                            taVar.N(N2);
                            taVar.N(N3);
                            yq(fw, taVar);
                            return;
                        case 10:
                            break;
                        default:
                            return;
                    }
                }
                if (q(fw) == null) {
                    throw new Xj(fw);
                }
            } else if (this.tF == null) {
                this.tF = fw.t0;
                this.zH = fw.t0();
            }
        }
    }

    public final void Gc(Fw fw, Xu xu) {
        String str;
        if (!this.yq) {
            this.yq = true;
            if (xu instanceof LX) {
                LX lx = (LX) xu;
                Go go = fw.zH;
                if (go != null) {
                    str = lx.i().getType() == -1 ? "<EOF>" : go.M(lx.i(), lx.N());
                } else {
                    str = "<unknown input>";
                }
                StringBuilder yq = by.yq("no viable alternative at input ");
                yq.append(SN(str));
                fw.W(lx.N(), yq.toString(), lx);
            } else if (xu instanceof Xj) {
                Xu xu2 = (Xj) xu;
                StringBuilder yq2 = by.yq("mismatched input ");
                yq2.append(zH(xu2.N()));
                yq2.append(" expecting ");
                C0184ta yq3 = xu2.yq();
                Objects.requireNonNull((Uf) fw);
                yq2.append(yq3.B(Uf.dT));
                fw.W(xu2.N(), yq2.toString(), xu2);
            } else if (xu instanceof A1) {
                Xu xu3 = (A1) xu;
                Objects.requireNonNull((Uf) fw);
                String str2 = Uf.G4[fw.t0.zH()];
                fw.W(xu3.N(), "rule " + str2 + " " + xu3.getMessage(), xu3);
            } else {
                PrintStream printStream = System.err;
                StringBuilder yq4 = by.yq("unknown recognition error type: ");
                yq4.append(xu.getClass().getName());
                printStream.println(yq4.toString());
                fw.W(xu.N(), xu.getMessage(), xu);
            }
        }
    }

    protected final void KJ(Fw fw) {
        if (!this.yq) {
            this.yq = true;
            YW dT = fw.dT();
            String zH = zH(dT);
            C0184ta tF = tF(fw);
            fw.W(dT, "extraneous input " + zH + " expecting " + tF.B(Uf.dT), null);
        }
    }

    public final void M() {
        this.yq = false;
        this.N = null;
        this.SN = -1;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    protected final C0184ta N(Fw fw) {
        N0 n0 = ((lR) fw.SN).yq;
        C0184ta taVar = new C0184ta(new int[0]);
        for (My my = fw.t0; my != null; my = my.yq) {
            int i = my.SN;
            if (i < 0) {
                break;
            }
            taVar.N(n0.zH(((C0133lY) ((AbstractC0137mG) n0.yq.get(i)).tF(0)).N));
        }
        taVar.Gc();
        return taVar;
    }

    protected final String SN(String str) {
        return zH.SN("'", str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"), "'");
    }

    public void i(Fw fw, Xu xu) {
        C0184ta taVar;
        if (this.SN == fw.zH.Gc() && (taVar = this.N) != null && taVar.tF(fw.t0())) {
            fw.KJ();
        }
        this.SN = fw.zH.Gc();
        if (this.N == null) {
            this.N = new C0184ta(new int[0]);
        }
        this.N.yq(fw.t0());
        yq(fw, N(fw));
    }

    protected final YW q(Fw fw) {
        if (!tF(fw).tF(fw.zH.t0(2))) {
            return null;
        }
        KJ(fw);
        fw.KJ();
        YW dT = fw.dT();
        M();
        return dT;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    public YW t0(Fw fw) {
        String str;
        YW q = q(fw);
        if (q != null) {
            fw.KJ();
            return q;
        }
        boolean z = true;
        if (!((lR) fw.SN).yq.i(((AbstractC0137mG) ((lR) fw.SN).yq.yq.get(fw.t0())).tF(0).yq, fw.t0).tF(fw.zH.t0(1))) {
            z = false;
        } else if (!this.yq) {
            this.yq = true;
            YW dT = fw.dT();
            C0184ta tF = tF(fw);
            StringBuilder yq = by.yq("missing ");
            yq.append(tF.B(Uf.dT));
            yq.append(" at ");
            yq.append(zH(dT));
            fw.W(dT, yq.toString(), null);
        }
        if (z) {
            YW dT2 = fw.dT();
            C0184ta tF2 = tF(fw);
            int zH = !tF2.i() ? tF2.zH() : 0;
            if (zH == -1) {
                str = "<missing EOF>";
            } else {
                StringBuilder yq2 = by.yq("<missing ");
                yq2.append(Uf.dT.yq(zH));
                yq2.append(">");
                str = yq2.toString();
            }
            String str2 = str;
            YW i = fw.zH.i(-1);
            if (dT2.getType() == -1 && i != null) {
                dT2 = i;
            }
            return ((eb) fw.zH.SN().N()).SN(new C0069Py(dT2.SN(), dT2.SN().SN()), zH, str2, 0, -1, -1, dT2.getLine(), dT2.yq());
        } else if (this.tF == null) {
            throw new Xj(fw);
        } else {
            throw new Xj(fw, this.zH, this.tF);
        }
    }

    protected final C0184ta tF(Fw fw) {
        Objects.requireNonNull(fw);
        return Uf.v3.N(fw.t0(), fw.t0);
    }

    protected final void yq(Fw fw, C0184ta taVar) {
        Go go = fw.zH;
        while (true) {
            int t0 = go.t0(1);
            if (t0 != -1 && !taVar.tF(t0)) {
                fw.KJ();
                go = fw.zH;
            } else {
                return;
            }
        }
    }

    protected final String zH(YW yw) {
        if (yw == null) {
            return "<no token>";
        }
        String text = yw.getText();
        if (text == null) {
            if (yw.getType() == -1) {
                text = "<EOF>";
            } else {
                StringBuilder yq = by.yq("<");
                yq.append(yw.getType());
                yq.append(">");
                text = yq.toString();
            }
        }
        return SN(text);
    }
}
