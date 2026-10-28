package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
import java.util.Map;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class g9 implements Runnable {
    public final /* synthetic */ Map N;
    public final /* synthetic */ Object SN;
    public final /* synthetic */ String tF;
    public final /* synthetic */ int yq;

    public /* synthetic */ g9(Object obj, Map map, String str, int i) {
        this.yq = i;
        this.SN = obj;
        this.N = map;
        this.tF = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                C0203xU.tF((C0203xU) this.SN, this.N, this.tF);
                return;
            case 1:
                C0203xU.G4((C0203xU) this.SN, this.N, this.tF);
                return;
            default:
                Z.zH((Z) this.SN, this.tF);
                return;
        }
    }
}
