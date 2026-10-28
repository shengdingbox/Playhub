package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class M implements Runnable {
    public final /* synthetic */ Z SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ M(Z z, int i) {
        this.yq = i;
        this.SN = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Z.SN(this.SN);
                return;
            default:
                Z.G(this.SN);
                return;
        }
    }
}
