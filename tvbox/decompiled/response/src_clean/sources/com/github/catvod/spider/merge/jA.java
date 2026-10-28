package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class jA implements Runnable {
    public final /* synthetic */ int yq;
    public static final /* synthetic */ jA SN = new jA(0);
    public static final /* synthetic */ jA N = new jA(1);

    public /* synthetic */ jA(int i) {
        this.yq = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                StringBuilder yq = by.yq("http://127.0.0.1:");
                yq.append(C0080aF.B);
                yq.append("/shutdown");
                V3.KJ(yq.toString());
                return;
            default:
                ProxyOrigin.tF();
                return;
        }
    }
}
