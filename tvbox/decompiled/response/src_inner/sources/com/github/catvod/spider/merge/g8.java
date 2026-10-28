package com.github.catvod.spider.merge;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class g8 {
    @SerializedName("sub_url")
    private String N;
    @SerializedName("img_url")
    private String SN;
    private final int[] yq = {46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    public final String yq(LinkedHashMap<String, Object> linkedHashMap) {
        String str = "";
        String str2 = Uri.parse(TextUtils.isEmpty(this.SN) ? str : this.SN).getLastPathSegment().split("\\.")[0];
        if (!TextUtils.isEmpty(this.N)) {
            str = this.N;
        }
        String yq = oX.yq(str2, Uri.parse(str).getLastPathSegment().split("\\.")[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(yq.charAt(this.yq[i]));
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        linkedHashMap.put("wts", Long.valueOf(System.currentTimeMillis() / 1000));
        for (String str3 : linkedHashMap.keySet()) {
            sb3.append(str3);
            sb3.append("=");
            sb3.append(URLEncoder.encode(linkedHashMap.get(str3).toString()));
            sb3.append("&");
        }
        String s = Rc.s(sb3.toString());
        return zH.SN(s, "&w_rid=", Rc.zH(s + sb2));
    }
}
