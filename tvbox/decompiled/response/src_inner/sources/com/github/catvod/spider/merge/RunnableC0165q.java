package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* renamed from: com.github.catvod.spider.merge.q  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class RunnableC0165q implements Runnable {
    public final /* synthetic */ Z SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ RunnableC0165q(Z z, int i) {
        this.yq = i;
        this.SN = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Z.G4(this.SN);
                return;
            default:
                Z.i(this.SN);
                return;
        }
    }
}
