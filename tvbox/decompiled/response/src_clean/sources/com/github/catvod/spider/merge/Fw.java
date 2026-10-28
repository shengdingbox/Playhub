package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class Fw extends wg<YW, lR> {
    protected List<Js> KJ;
    protected final C0185tj i;
    protected Go zH;
    protected Fp tF = new Fp();
    protected boolean Gc = true;
    protected Tu t0 = null;
    protected boolean q = false;
    private yq M = null;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class yq implements Js {
    }

    static {
        new WeakHashMap();
    }

    public Fw(Go go) {
        C0185tj tjVar = new C0185tj();
        this.i = tjVar;
        tjVar.yq(0);
        this.zH = null;
        Fp fp = this.tF;
        fp.yq = false;
        fp.N = null;
        fp.SN = -1;
        v(this.M);
        tjVar.SN();
        tjVar.yq(0);
        ATNInterpreter atninterpreter = this.SN;
        if (atninterpreter != 0) {
            atninterpreter.yq();
        }
        this.zH = go;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.Js>, java.util.ArrayList] */
    public final void B(Tu tu, int i) {
        M(i);
        this.t0 = tu;
        tu.zH = this.zH.i(1);
        if (this.Gc) {
            Tu tu2 = this.t0;
            Tu tu3 = (Tu) tu2.yq;
            if (tu3 != null) {
                tu3.t0(tu2);
            }
        }
        ?? r2 = this.KJ;
        if (r2 != 0) {
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                Js js = (Js) it.next();
                js.G(this.t0);
                this.t0.Gc(js);
            }
        }
    }

    public final int F5() {
        if (this.i.tF()) {
            return -1;
        }
        C0185tj tjVar = this.i;
        return tjVar.N(tjVar.i() - 1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.Js>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.Js>, java.util.ArrayList] */
    public final void G() {
        YW yw;
        Tu tu;
        if (this.q) {
            tu = this.t0;
            yw = this.zH.i(1);
        } else {
            tu = this.t0;
            yw = this.zH.i(-1);
        }
        tu.i = yw;
        ?? r0 = this.KJ;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                Js js = (Js) this.KJ.get(size);
                this.t0.M(js);
                js.un(this.t0);
            }
        }
        M(this.t0.SN);
        this.t0 = (Tu) this.t0.yq;
    }

    public final Tu G4() {
        return this.t0;
    }

    @Override // com.github.catvod.spider.merge.wg
    public final boolean Gc(int i) {
        C0185tj tjVar = this.i;
        return i >= tjVar.N(tjVar.i() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<com.github.catvod.spider.merge.Js>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<com.github.catvod.spider.merge.Js>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List<com.github.catvod.spider.merge.Js>, java.util.ArrayList] */
    public final YW KJ() {
        YW dT = dT();
        if (dT.getType() != -1) {
            this.zH.KJ();
        }
        ?? r1 = this.KJ;
        boolean z = r1 != 0 && !r1.isEmpty();
        if (this.Gc || z) {
            if (this.tF.yq) {
                Tu tu = this.t0;
                hs hsVar = new hs(dT);
                Objects.requireNonNull(tu);
                tu.t0(hsVar);
                ?? r12 = this.KJ;
                if (r12 != 0) {
                    Iterator it = r12.iterator();
                    while (it.hasNext()) {
                        ((Js) it.next()).yq();
                    }
                }
            } else {
                Tu tu2 = this.t0;
                NO no = new NO(dT);
                Objects.requireNonNull(tu2);
                tu2.t0(no);
                ?? r13 = this.KJ;
                if (r13 != 0) {
                    Iterator it2 = r13.iterator();
                    while (it2.hasNext()) {
                        ((Js) it2.next()).RQ(no);
                    }
                }
            }
        }
        return dT;
    }

    public final void W(YW yw, String str, Xu xu) {
        ((PJ) zH()).yq(this, yw, yw.getLine(), yw.yq(), str, xu);
    }

    public final YW dT() {
        return this.zH.i(1);
    }

    public final void ee(Fp fp) {
        this.tF = fp;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.wA>, java.util.ArrayList] */
    public final void q(Tu tu) {
        Tu tu2;
        Tu tu3;
        if (!(!this.Gc || (tu2 = this.t0) == tu || (tu3 = (Tu) tu2.yq) == null)) {
            ?? r1 = tu3.tF;
            if (r1 != 0) {
                r1.remove(r1.size() - 1);
            }
            tu3.t0(tu);
        }
        this.t0 = tu;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.Js>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.Js>, java.util.ArrayList] */
    public final void v(Js js) {
        ?? r0 = this.KJ;
        if (r0 != 0 && r0.remove(js) && this.KJ.isEmpty()) {
            this.KJ = null;
        }
    }

    public final YW v3(int i) {
        YW dT = dT();
        if (dT.getType() == i) {
            if (i == -1) {
                this.q = true;
            }
            this.tF.M();
            KJ();
        } else {
            dT = this.tF.t0(this);
            if (this.Gc && dT.N() == -1) {
                Tu tu = this.t0;
                hs hsVar = new hs(dT);
                Objects.requireNonNull(tu);
                tu.t0(hsVar);
            }
        }
        return dT;
    }
}
