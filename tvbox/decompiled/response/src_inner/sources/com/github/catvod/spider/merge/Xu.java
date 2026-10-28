package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Xu extends RuntimeException {
    private final HL N;
    private final Tu SN;
    private YW tF;
    private final wg<?, ?> yq;
    private int zH;

    public Xu(wg<?, ?> wgVar, HL hl, Tu tu) {
        this.zH = -1;
        this.yq = wgVar;
        this.N = hl;
        this.SN = tu;
        if (wgVar != null) {
            this.zH = wgVar.t0();
        }
    }

    public final YW N() {
        return this.tF;
    }

    public final HL SN() {
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void tF(int i) {
        this.zH = i;
    }

    public final C0184ta yq() {
        wg<?, ?> wgVar = this.yq;
        if (wgVar != null) {
            return wgVar.tF().N(this.zH, this.SN);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zH(YW yw) {
        this.tF = yw;
    }
}
