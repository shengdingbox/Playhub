package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Ym extends hN {
    private final kB KJ = new kB();

    public Ym(AF af, fx fxVar) {
        super(af, null, fxVar);
    }

    public final Ym OT(hN hNVar) {
        this.KJ.add(hNVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.MA
    public final void n(MA ma) {
        super.n(ma);
        this.KJ.remove(ma);
    }

    /* renamed from: z */
    public final Ym i3() {
        return (Ym) super.clone();
    }
}
