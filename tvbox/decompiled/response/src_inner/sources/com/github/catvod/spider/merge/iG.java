package com.github.catvod.spider.merge;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class iG implements Runnable {
    final /* synthetic */ String yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public iG(String str) {
        this.yq = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pattern pattern;
        try {
            if (!TextUtils.isEmpty(this.yq)) {
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36");
                String SN = RS.SN(this.yq, hashMap, 0);
                if (SN.contains("btwaf")) {
                    pattern = cn.N;
                    Matcher matcher = pattern.matcher(SN);
                    String str = "";
                    if (matcher.find()) {
                        str = matcher.group(0);
                    }
                    C0068Pe.W(this.yq + "?btwaf=" + str, hashMap);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
