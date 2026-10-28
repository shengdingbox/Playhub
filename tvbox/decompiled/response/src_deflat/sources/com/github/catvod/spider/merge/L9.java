package com.github.catvod.spider.merge;

import android.webkit.WebViewClient;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Nmyswv;
import com.github.catvod.spider.ProxyOrigin;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class L9 implements Runnable {
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ L9(Object obj, Object obj2, int i) {
        this.yq = i;
        this.SN = obj;
        this.N = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Bili.Nl((Bili) this.SN, (JSONObject) this.N);
                return;
            default:
                Nmyswv.yq((WebViewClient) this.SN, (String) this.N);
                return;
        }
    }
}
