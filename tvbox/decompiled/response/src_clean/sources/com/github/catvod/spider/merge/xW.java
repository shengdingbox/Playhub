package com.github.catvod.spider.merge;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class xW implements Runnable {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ xW(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                C0080aF.M((C0080aF) this.SN);
                return;
            case 1:
                C0039.m1939(r0, RQ.m1082((RQ) this.SN));
                return;
            case 2:
                Z.W((Z) this.SN);
                return;
            case 3:
                C0203xU.yq((C0203xU) this.SN);
                return;
            case 4:
                Bili.W((Bili) this.SN);
                return;
            default:
                C0095eF.N((C0095eF) this.SN);
                return;
        }
    }
}
