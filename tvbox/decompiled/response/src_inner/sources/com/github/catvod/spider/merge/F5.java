package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class F5 implements Runnable {
    public final /* synthetic */ Object Gc;
    public final /* synthetic */ String N;
    public final /* synthetic */ String SN;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object t0;
    public final /* synthetic */ List tF;
    public final /* synthetic */ int yq;
    public final /* synthetic */ List zH;

    public /* synthetic */ F5(Object obj, Object obj2, String str, String str2, List list, List list2, int i, int i2) {
        this.yq = i2;
        this.t0 = obj;
        this.Gc = obj2;
        this.SN = str;
        this.N = str2;
        this.tF = list;
        this.zH = list2;
        this.i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Z.B((Z) this.t0, (C0059Dl) this.Gc, this.SN, this.N, this.tF, this.zH, this.i);
                return;
            default:
                C0203xU.i((C0203xU) this.t0, (tX) this.Gc, this.SN, this.N, this.tF, this.zH, this.i);
                return;
        }
    }
}
