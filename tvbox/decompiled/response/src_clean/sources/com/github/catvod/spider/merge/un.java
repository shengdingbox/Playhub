package com.github.catvod.spider.merge;

import android.app.Activity;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class un implements Runnable {
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ un(Object obj, Object obj2, int i) {
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
                RQ.B((RQ) this.SN, (String) this.N);
                return;
            case 2:
                Pan.tF((Pan) this.SN, (Activity) this.N);
                return;
            default:
                lW.t0((lW) this.SN, (w4) this.N);
                return;
        }
    }
}
