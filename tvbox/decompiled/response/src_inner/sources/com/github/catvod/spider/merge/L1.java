package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class L1 {
    private L1 N;
    private boolean SN = false;
    private kB yq;

    private L1(hN hNVar) {
        kB kBVar = new kB();
        this.yq = kBVar;
        kBVar.add(hNVar);
    }

    private L1(kB kBVar) {
        kB kBVar2 = new kB();
        this.yq = kBVar2;
        kBVar2.addAll(kBVar);
    }

    public static L1 N(kB kBVar) {
        return new L1(kBVar);
    }

    public static L1 SN(hN hNVar) {
        return new L1(hNVar);
    }

    public static L1 tF(L1 l1) {
        L1 l12 = new L1(l1.yq);
        l12.N = l1;
        return l12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Gc() {
        this.SN = true;
    }

    public final L1 KJ(L1 l1) {
        this.N = l1;
        return this;
    }

    public final void M(kB kBVar) {
        this.yq = kBVar;
    }

    public final boolean i() {
        return this.SN;
    }

    public final hN q() {
        if (this.yq.size() == 1) {
            return this.yq.tF();
        }
        StringBuilder yq = by.yq("current context is more than one el,total = ");
        yq.append(this.yq.size());
        throw new B1(yq.toString());
    }

    public final void t0() {
        this.SN = false;
    }

    public final kB yq() {
        return this.yq;
    }

    public final L1 zH() {
        return this.N;
    }
}
