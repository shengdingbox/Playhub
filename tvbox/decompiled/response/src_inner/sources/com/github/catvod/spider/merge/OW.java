package com.github.catvod.spider.merge;

import android.app.Application;
import android.widget.Toast;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
import com.google.net.cronet.okhttptransport.CronetInterceptor;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class OW implements Runnable {
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ OW(Object obj, int i) {
        this.yq = i;
        this.SN = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                V.tF((V) this.SN);
                return;
            case 1:
                String str = Rc.yq;
                Application context = InitOrigin.context();
                StringBuilder yq = by.yq("初始化失败:");
                yq.append(((Exception) this.SN).getCause().getMessage());
                Toast.makeText(context, yq.toString(), 1).show();
                return;
            default:
                CronetInterceptor.yq((CronetInterceptor) this.SN);
                return;
        }
    }
}
