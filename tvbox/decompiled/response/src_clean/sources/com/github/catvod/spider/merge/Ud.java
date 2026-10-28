package com.github.catvod.spider.merge;

import android.view.MotionEvent;
import android.view.View;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class Ud implements View.OnTouchListener {
    public static final /* synthetic */ Ud yq = new Ud();

    private /* synthetic */ Ud() {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return ProxyOrigin.N(view, motionEvent);
    }
}
