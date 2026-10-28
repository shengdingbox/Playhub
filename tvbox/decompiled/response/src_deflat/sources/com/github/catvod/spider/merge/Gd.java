package com.github.catvod.spider.merge;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Music;
import com.github.catvod.spider.ProxyOrigin;
import test.MainActivity;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class Gd implements Runnable {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ Gd(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                V.N((V) this.SN);
                return;
            case 1:
                RQ.KJ((RQ) this.SN);
                return;
            case 2:
                Z.Gc((Z) this.SN);
                return;
            case 3:
                C0203xU.M((C0203xU) this.SN);
                return;
            case 4:
                Bili.W((Bili) this.SN);
                return;
            case 5:
                Music.N((String) this.SN);
                return;
            default:
                MainActivity.yq((MainActivity) this.SN);
                return;
        }
    }
}
