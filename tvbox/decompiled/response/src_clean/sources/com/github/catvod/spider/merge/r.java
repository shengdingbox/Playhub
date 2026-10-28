package com.github.catvod.spider.merge;

import android.widget.Toast;
import com.github.catvod.spider.InitOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class r implements Runnable {
    final /* synthetic */ String yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(String str) {
        this.yq = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(InitOrigin.context(), this.yq, 1).show();
    }
}
