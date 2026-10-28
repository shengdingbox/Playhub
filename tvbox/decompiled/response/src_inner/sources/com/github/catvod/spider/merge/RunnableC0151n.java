package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
import java.nio.channels.Pipe;
/* renamed from: com.github.catvod.spider.merge.n  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class RunnableC0151n implements Runnable {
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ RunnableC0151n(Object obj, Object obj2, int i) {
        this.yq = i;
        this.SN = obj;
        this.N = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                V.t0((V) this.SN, (k9) this.N);
                return;
            case 1:
                C0203xU.SN((C0203xU) this.SN, (String) this.N);
                return;
            default:
                C0095eF.yq((C0095eF) this.SN, (Pipe.SinkChannel) this.N);
                return;
        }
    }
}
