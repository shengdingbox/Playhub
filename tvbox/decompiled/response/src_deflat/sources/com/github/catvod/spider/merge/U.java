package com.github.catvod.spider.merge;

import com.github.catvod.spider.Pan;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class U implements Runnable {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ U(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                RQ.M((RQ) this.SN);
                return;
            case 1:
                Z.tF((Z) this.SN);
                return;
            default:
                ((Pan) this.SN).showInputQRCode();
                return;
        }
    }
}
