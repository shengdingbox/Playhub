package com.github.catvod.spider.merge;

import android.text.TextUtils;
import java.util.HashMap;
/* renamed from: com.github.catvod.spider.merge.d  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class RunnableC0091d implements Runnable {
    final /* synthetic */ String yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0091d(String str) {
        this.yq = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!TextUtils.isEmpty(this.yq)) {
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36");
                C0068Pe.W(this.yq, hashMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
