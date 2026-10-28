package com.github.catvod.spider.merge;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.ProxyOrigin;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.s  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class RunnableC0177s implements Runnable {
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ RunnableC0177s(Object obj, Object obj2, int i) {
        this.yq = i;
        this.SN = obj;
        this.N = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                V.SN((V) this.SN, (k9) this.N);
                return;
            case 1:
                Z.t0((Z) this.SN, (String) this.N);
                return;
            default:
                Bili.Nl((Bili) this.SN, (JSONObject) this.N);
                return;
        }
    }
}
