package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class fj implements Runnable {
    public final /* synthetic */ int yq;
    public static final /* synthetic */ fj SN = new fj(0);
    public static final /* synthetic */ fj N = new fj(1);

    public /* synthetic */ fj(int i) {
        this.yq = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                RQ.xa().p();
                return;
            default:
                ProxyOrigin.SN = true;
                return;
        }
    }
}
