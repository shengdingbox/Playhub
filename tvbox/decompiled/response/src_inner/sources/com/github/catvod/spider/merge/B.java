package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ Z SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ B(Z z, int i) {
        this.yq = i;
        this.SN = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Z.F5(this.SN);
                return;
            default:
                Z.M(this.SN);
                return;
        }
    }
}
