package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
import java.net.URLEncoder;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class A5 implements Runnable {
    public static final /* synthetic */ A5 yq = new A5();

    private /* synthetic */ A5() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = lW.W;
        StringBuilder yq2 = by.yq("http://127.0.0.1:9978/action?do=refresh&type=danmaku&path=");
        yq2.append(Rc.b(ProxyOrigin.getOwnProxyUrl() + "proxy?do=danmu&act=&url=" + URLEncoder.encode(iX.ee)));
        V3.KJ(yq2.toString());
    }
}
