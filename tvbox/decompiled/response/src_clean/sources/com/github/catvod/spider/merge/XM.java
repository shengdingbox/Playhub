package com.github.catvod.spider.merge;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class XM implements Runnable {
    public final /* synthetic */ int yq;
    public static final /* synthetic */ XM SN = new XM(0);
    public static final /* synthetic */ XM N = new XM(1);
    public static final /* synthetic */ XM tF = new XM(2);

    public /* synthetic */ XM(int i) {
        this.yq = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                V.v().i3(false, false);
                return;
            case 1:
                int i = ProxyOrigin.Gc;
                StringBuilder yq = by.yq("http://127.0.0.1:9978/action?do=refresh&type=danmaku&path=");
                yq.append(Rc.b(ProxyOrigin.getOwnProxyUrl() + "proxy?do=reLoadDanmu"));
                V3.KJ(yq.toString());
                return;
            default:
                int i2 = ProxyOrigin.Gc;
                InitOrigin.execute(PR.N);
                return;
        }
    }
}
