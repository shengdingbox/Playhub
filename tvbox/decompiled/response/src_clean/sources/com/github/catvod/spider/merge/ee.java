package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class ee implements Runnable {
    public final /* synthetic */ C0203xU SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ ee(C0203xU xUVar, int i) {
        this.yq = i;
        this.SN = xUVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                C0203xU.G(this.SN);
                return;
            default:
                C0203xU.t0(this.SN);
                return;
        }
    }
}
