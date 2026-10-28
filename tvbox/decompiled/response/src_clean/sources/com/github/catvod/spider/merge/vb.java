package com.github.catvod.spider.merge;

import android.content.DialogInterface;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class vb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int yq;
    public static final /* synthetic */ vb SN = new vb(0);
    public static final /* synthetic */ vb N = new vb(1);

    public /* synthetic */ vb(int i) {
        this.yq = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                lW.xa.set(false);
                return;
            default:
                C0195vA.SN = false;
                return;
        }
    }
}
