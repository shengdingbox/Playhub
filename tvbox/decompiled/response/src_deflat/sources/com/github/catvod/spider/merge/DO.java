package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0191uC;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class DO {
    protected r6 Gc;
    protected Map<String, AF> M;
    Ng N;
    q2 SN;
    protected String i;
    protected AbstractC0191uC t0;
    protected Va tF;
    protected l3 yq;
    protected ArrayList<hN> zH;
    private AbstractC0191uC.t0 KJ = new AbstractC0191uC.t0();
    private AbstractC0191uC.i q = new AbstractC0191uC.i();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean Gc(String str) {
        AbstractC0191uC.t0 t0Var = this.KJ;
        if (this.t0 == t0Var) {
            t0Var = new AbstractC0191uC.t0();
        } else {
            t0Var.OW();
        }
        t0Var.xa(str);
        return zH(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.AF>, java.util.HashMap] */
    public final AF M(String str, r6 r6Var) {
        AF af = (AF) this.M.get(str);
        if (af != null) {
            return af;
        }
        AF G = AF.G(str, r6Var);
        this.M.put(str, G);
        return G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N(Reader reader, l3 l3Var) {
        Va va = new Va("");
        this.tF = va;
        va.C7(l3Var);
        this.yq = l3Var;
        this.Gc = l3Var.zH();
        q2 q2Var = new q2(reader, 32768);
        this.SN = q2Var;
        q2Var.k(l3Var.N());
        this.t0 = null;
        this.N = new Ng(this.SN, l3Var.yq());
        this.zH = new ArrayList<>(32);
        this.M = new HashMap();
        this.i = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean SN(String str) {
        hN yq;
        return (this.zH.size() == 0 || (yq = yq()) == null || !yq.nQ().equals(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean i(String str) {
        AbstractC0191uC uCVar = this.t0;
        AbstractC0191uC.i iVar = this.q;
        if (uCVar == iVar) {
            AbstractC0191uC.i iVar2 = new AbstractC0191uC.i();
            iVar2.xa(str);
            return zH(iVar2);
        }
        iVar.Gc();
        iVar.xa(str);
        return zH(iVar);
    }

    public boolean t0(fx fxVar) {
        AbstractC0191uC.t0 t0Var = this.KJ;
        if (this.t0 == t0Var) {
            t0Var = new AbstractC0191uC.t0();
            t0Var.tF = "input";
            t0Var.G4 = fxVar;
        } else {
            t0Var.OW();
            t0Var.tF = "input";
            t0Var.G4 = fxVar;
        }
        t0Var.zH = eb.zH("input");
        return zH(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean tF(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final hN yq() {
        int size = this.zH.size();
        return size > 0 ? this.zH.get(size - 1) : this.tF;
    }

    protected abstract boolean zH(AbstractC0191uC uCVar);
}
