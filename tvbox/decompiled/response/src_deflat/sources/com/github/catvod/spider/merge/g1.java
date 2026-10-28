package com.github.catvod.spider.merge;

import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Alllive;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Music;
import com.github.catvod.spider.ProxyOrigin;
import java.io.InputStream;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ g1(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                V v = (V) this.SN;
                Objects.requireNonNull(v);
                InitOrigin.run(new RunnableC0177s(v, k9.t0(V3.q("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null)).SN().N(), 0));
                return;
            case 1:
                C0039.m1939(r0, RQ.m1082((RQ) this.SN));
                return;
            case 2:
                Alllive.tF((Alllive) this.SN);
                return;
            case 3:
                Bili.g9((Bili) this.SN);
                return;
            case 4:
                Toast.makeText(InitOrigin.context(), (String) this.SN, 1).show();
                return;
            case 5:
                ((Music) this.SN).showInputQRCode();
                return;
            case 6:
                InputStream inputStream = (InputStream) this.SN;
                int i = ProxyOrigin.Gc;
                try {
                    inputStream.close();
                    return;
                } catch (Exception unused) {
                    SpiderDebug.log("Failed to close input stream: ");
                    return;
                }
            case 7:
                C0098ew.tF((C0098ew) this.SN);
                return;
            default:
                Ab.yq((Ab) this.SN);
                return;
        }
    }
}
