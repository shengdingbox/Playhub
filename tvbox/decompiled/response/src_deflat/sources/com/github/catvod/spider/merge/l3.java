package com.github.catvod.spider.merge;

import java.io.StringReader;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class l3 {
    private r6 N = r6.N;
    private wV SN = new wV();
    private DO yq;

    public l3(DO r1) {
        this.yq = r1;
    }

    public static Va tF(String str) {
        AbstractC0191uC g9;
        C0197vV vVVar = new C0197vV();
        vVVar.N(new StringReader(str), new l3(vVVar));
        Ng ng = vVVar.N;
        do {
            g9 = ng.g9();
            vVVar.zH(g9);
            g9.Gc();
        } while (g9.yq != 6);
        vVVar.SN.tF();
        vVVar.SN = null;
        vVVar.N = null;
        vVVar.zH = null;
        vVVar.M = null;
        return vVVar.tF;
    }

    public final boolean N() {
        return this.SN.SN() > 0;
    }

    public final boolean SN(String str) {
        return this.yq.tF(str);
    }

    public final wV yq() {
        return this.SN;
    }

    public final r6 zH() {
        return this.N;
    }
}
