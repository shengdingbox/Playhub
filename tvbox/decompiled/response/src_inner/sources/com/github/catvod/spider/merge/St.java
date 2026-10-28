package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class St implements Runnable {
    public final /* synthetic */ int yq;
    public static final /* synthetic */ St SN = new St(0);
    public static final /* synthetic */ St N = new St(1);

    public /* synthetic */ St(int i) {
        this.yq = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                C0203xU.s().u7();
                return;
            default:
                ProxyOrigin.SN = true;
                return;
        }
    }
}
