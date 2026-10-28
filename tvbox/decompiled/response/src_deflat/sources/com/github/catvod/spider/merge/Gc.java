package com.github.catvod.spider.merge;

import android.content.DialogInterface;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.ProxyOrigin;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class Gc implements DialogInterface.OnDismissListener {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ Gc(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Z.q((Z) this.SN);
                return;
            default:
                Objects.requireNonNull((Bili) this.SN);
                return;
        }
    }
}
