package com.github.catvod.spider.merge;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class G4 implements Runnable {
    public final /* synthetic */ Object N;
    public final /* synthetic */ String SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ G4(Object obj, String str, int i) {
        this.yq = i;
        this.N = obj;
        this.SN = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Z.yq((Z) this.N, this.SN);
                return;
            case 1:
                Bili.B((Bili) this.N, this.SN);
                return;
            default:
                C0098ew.zH((C0098ew) this.N, this.SN);
                return;
        }
    }
}
