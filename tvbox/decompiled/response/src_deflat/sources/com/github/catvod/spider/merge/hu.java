package com.github.catvod.spider.merge;

import android.app.Activity;
import android.widget.LinearLayout;
import com.github.catvod.spider.ProxyOrigin;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class hu implements Runnable {
    public final /* synthetic */ Object N;
    public final /* synthetic */ lW SN;
    public final /* synthetic */ Object tF;
    public final /* synthetic */ int yq;

    public /* synthetic */ hu(lW lWVar, Object obj, Object obj2, int i) {
        this.yq = i;
        this.SN = lWVar;
        this.N = obj;
        this.tF = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                lW lWVar = this.SN;
                String str = (String) this.N;
                String str2 = (String) this.tF;
                Objects.requireNonNull(lWVar);
                try {
                    lWVar.b(str, str2);
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                lW.yq(this.SN, (Activity) this.N, (LinearLayout.LayoutParams) this.tF);
                return;
        }
    }
}
