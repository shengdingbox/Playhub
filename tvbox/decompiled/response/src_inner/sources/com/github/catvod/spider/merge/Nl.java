package com.github.catvod.spider.merge;

import com.github.catvod.spider.Alllive;
import com.github.catvod.spider.Music;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class Nl implements Runnable {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ Nl(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                V.i((V) this.SN);
                return;
            case 1:
                Z.dT((Z) this.SN);
                return;
            case 2:
                C0203xU.KJ((C0203xU) this.SN);
                return;
            case 3:
                ((Alllive) this.SN).showInputQRCode();
                return;
            case 4:
                Music.zH((Music) this.SN);
                return;
            default:
                C0095eF.SN((C0095eF) this.SN);
                return;
        }
    }
}
