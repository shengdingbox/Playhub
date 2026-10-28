package com.github.catvod.spider.merge;

import android.content.DialogInterface;
import com.github.catvod.spider.Alllive;
import com.github.catvod.spider.ProxyOrigin;
/* renamed from: com.github.catvod.spider.merge.h  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class DialogInterface$OnClickListenerC0112h implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ DialogInterface$OnClickListenerC0112h(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Alllive.SN((Alllive) this.SN);
                return;
            default:
                C0098ew.SN((C0098ew) this.SN);
                return;
        }
    }
}
