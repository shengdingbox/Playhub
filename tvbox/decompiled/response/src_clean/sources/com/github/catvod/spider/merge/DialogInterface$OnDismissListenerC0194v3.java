package com.github.catvod.spider.merge;

import android.content.DialogInterface;
import com.github.catvod.spider.Alllive;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Music;
import com.github.catvod.spider.ProxyOrigin;
import java.util.Objects;
/* renamed from: com.github.catvod.spider.merge.v3  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class DialogInterface$OnDismissListenerC0194v3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ DialogInterface$OnDismissListenerC0194v3(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                C0203xU xUVar = (C0203xU) this.SN;
                Objects.requireNonNull(xUVar);
                InitOrigin.zH = false;
                xUVar.v = false;
                InitOrigin.stopShowingToast();
                return;
            case 1:
                Alllive.N((Alllive) this.SN);
                return;
            default:
                Music.SN((Music) this.SN);
                return;
        }
    }
}
