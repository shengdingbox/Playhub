package com.github.catvod.spider.merge;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.github.catvod.spider.Pan;
import com.github.catvod.spider.ProxyOrigin;
/* renamed from: com.github.catvod.spider.merge.b  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class RunnableC0083b implements Runnable {
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ RunnableC0083b(Object obj, Object obj2, int i) {
        this.yq = i;
        this.SN = obj;
        this.N = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                V.t0((V) this.SN, (k9) this.N);
                return;
            case 1:
                Pan.yq((Pan) this.SN, (Activity) this.N);
                return;
            default:
                Drawable drawable = (Drawable) this.SN;
                TextView textView = (TextView) this.N;
                int i = ProxyOrigin.Gc;
                if (drawable != null && textView.getWidth() > 0 && textView.getHeight() > 0) {
                    drawable.setBounds(0, 0, textView.getWidth(), textView.getHeight());
                    textView.invalidate();
                    return;
                }
                return;
        }
    }
}
