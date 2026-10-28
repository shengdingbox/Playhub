package com.github.catvod.spider.merge;

import android.app.Application;
import android.widget.Toast;
import com.github.catvod.spider.Alllive;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class Fz implements Runnable {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ Fz(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                final RQ rq = (RQ) this.SN;
                Objects.requireNonNull(rq);
                try {
                    String str = Rc.yq;
                    final long currentTimeMillis = System.currentTimeMillis();
                    final String upperCase = UUID.randomUUID().toString().toUpperCase();
                    String q = V3.q("https://passport.baidu.com/v2/api/getqrcode?lp=pc&qrloginfrom=pc&gid=" + upperCase + "&callback=tangram_guid_" + currentTimeMillis + "&apiver=v3&tt=" + currentTimeMillis + "&tpl=netdisk&logPage=traceId%3Apc_loginv5_1751366078%2ClogPage%3Aloginv5&_=" + currentTimeMillis, rq.b(""));
                    System.out.println("json-" + q);
                    JSONObject jSONObject = new JSONObject(q.substring(q.indexOf(123), q.lastIndexOf(125) + 1));
                    final String string = jSONObject.getString("sign");
                    final byte[] bytes = V3.tF("https://" + jSONObject.getString("imgurl")).body().bytes();
                    InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.t0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RQ.zH(RQ.this, bytes, string, upperCase, currentTimeMillis);
                        }
                    });
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                Alllive.zH((String) this.SN);
                return;
            default:
                String str2 = Rc.yq;
                Application context = InitOrigin.context();
                StringBuilder yq = by.yq("初始化失败:");
                yq.append(((Exception) this.SN).getCause().getMessage());
                Toast.makeText(context, yq.toString(), 1).show();
                return;
        }
    }
}
