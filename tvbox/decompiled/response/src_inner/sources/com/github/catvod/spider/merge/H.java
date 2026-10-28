package com.github.catvod.spider.merge;

import android.app.Activity;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class H implements Runnable {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ H(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                RQ.N((RQ) this.SN);
                return;
            case 1:
                C0203xU.Gc((C0203xU) this.SN);
                return;
            case 2:
                Pan.showPanSourceSortDialog((Activity) this.SN);
                return;
            default:
                Ab.N((Ab) this.SN);
                return;
        }
    }
}
