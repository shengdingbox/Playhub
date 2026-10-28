package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
import java.util.Map;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class dT implements Runnable {
    public final /* synthetic */ String N;
    public final /* synthetic */ Map SN;
    public final /* synthetic */ Object tF;
    public final /* synthetic */ int yq;

    public /* synthetic */ dT(Object obj, Map map, String str, int i) {
        this.yq = i;
        this.tF = obj;
        this.SN = map;
        this.N = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Z.zH((Z) this.tF, this.N);
                return;
            default:
                C0203xU.tF((C0203xU) this.tF, this.SN, this.N);
                return;
        }
    }
}
