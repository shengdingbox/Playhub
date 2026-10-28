package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* renamed from: com.github.catvod.spider.merge.v  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class RunnableC0193v implements Runnable {
    public final /* synthetic */ C0203xU SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ RunnableC0193v(C0203xU xUVar, int i) {
        this.yq = i;
        this.SN = xUVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                C0203xU.q(this.SN);
                return;
            default:
                C0203xU.B(this.SN);
                return;
        }
    }
}
