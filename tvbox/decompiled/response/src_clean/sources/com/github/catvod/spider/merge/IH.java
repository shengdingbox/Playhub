package com.github.catvod.spider.merge;

import com.github.catvod.spider.DexNative;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class IH implements Runnable {
    public final /* synthetic */ int yq;
    public static final /* synthetic */ IH SN = new IH(0);
    public static final /* synthetic */ IH N = new IH(1);

    public /* synthetic */ IH(int i) {
        this.yq = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                DexNative.danmuStart();
                return;
            default:
                int i = ProxyOrigin.Gc;
                try {
                    new lW(iX.ee, "push").g1();
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
