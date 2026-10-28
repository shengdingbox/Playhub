package com.github.catvod.spider.merge;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class Zm implements Runnable {
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ Zm(Object obj, Object obj2, int i) {
        this.yq = i;
        this.SN = obj;
        this.N = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                V v = (V) this.SN;
                Objects.requireNonNull(v);
                k9 N = k9.t0(V3.M("https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", (Map) this.N)).SN().N();
                if (N.i()) {
                    String zH = N.zH();
                    InitOrigin.show("Token:" + zH);
                    v.Gc.G4(zH);
                    v.i3(true, false);
                    return;
                }
                return;
            default:
                Bili.dT((Bili) this.SN, (JSONObject) this.N);
                return;
        }
    }
}
