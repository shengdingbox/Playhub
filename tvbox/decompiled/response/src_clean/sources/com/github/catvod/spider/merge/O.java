package com.github.catvod.spider.merge;

import android.app.Application;
import android.widget.Toast;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class O implements Runnable {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ O(Object obj, int i) {
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
                C0039.m1939(r0, RQ.m1082((RQ) this.SN));
                return;
            case 2:
                Bili.ee((Bili) this.SN);
                return;
            case 3:
                C0098ew.yq((C0098ew) this.SN);
                return;
            default:
                String str = Rc.yq;
                Application context = InitOrigin.context();
                StringBuilder yq = by.yq("初始化失败:");
                yq.append(((Exception) this.SN).getCause().getMessage());
                Toast.makeText(context, yq.toString(), 1).show();
                return;
        }
    }
}
