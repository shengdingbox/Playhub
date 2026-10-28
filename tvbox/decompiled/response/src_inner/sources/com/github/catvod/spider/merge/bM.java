package com.github.catvod.spider.merge;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class bM implements Runnable {
    public final /* synthetic */ Bili SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ bM(Bili bili, int i) {
        this.yq = i;
        this.SN = bili;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Bili.G(this.SN);
                return;
            default:
                Bili.F5(this.SN);
                return;
        }
    }
}
