package com.github.catvod.spider.merge;

import android.webkit.WebView;
import com.github.catvod.spider.InitOrigin;
/* renamed from: com.github.catvod.spider.merge.Ly  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class RunnableC0067Ly implements Runnable {
    public static final /* synthetic */ RunnableC0067Ly yq = new RunnableC0067Ly();

    private /* synthetic */ RunnableC0067Ly() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = Rc.yq;
        Rc.yq = new WebView(InitOrigin.context()).getSettings().getUserAgentString();
    }
}
