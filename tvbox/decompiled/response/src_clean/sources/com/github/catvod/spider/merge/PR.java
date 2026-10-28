package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class PR implements Runnable {
    public final /* synthetic */ int yq;
    public static final /* synthetic */ PR SN = new PR(0);
    public static final /* synthetic */ PR N = new PR(1);

    public /* synthetic */ PR(int i) {
        this.yq = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                int i = ProxyOrigin.Gc;
                StringBuilder yq = by.yq("http://127.0.0.1:9978/action?do=refresh&type=danmaku&path=");
                yq.append(Rc.b(ProxyOrigin.getOwnProxyUrl() + "proxy?do=noDanmu"));
                V3.KJ(yq.toString());
                return;
            default:
                int i2 = ProxyOrigin.Gc;
                try {
                    new lW(iX.ee, "push").g1();
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
