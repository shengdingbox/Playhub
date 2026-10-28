package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* renamed from: com.github.catvod.spider.merge.sN  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class RunnableC0178sN implements Runnable {
    public final /* synthetic */ int yq;
    public static final /* synthetic */ RunnableC0178sN SN = new RunnableC0178sN(0);
    public static final /* synthetic */ RunnableC0178sN N = new RunnableC0178sN(1);

    public /* synthetic */ RunnableC0178sN(int i) {
        this.yq = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Z.Zm().x();
                return;
            default:
                ProxyOrigin.G();
                return;
        }
    }
}
