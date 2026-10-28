package com.github.catvod.spider.merge;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Bo {
    private final String N;
    private final Map<String, String> SN;
    private String i;
    private final String tF;
    private final Map<String, String> yq;
    private Request zH;

    private Bo(String str, String str2, String str3, Map map, Map map2) {
        RequestBody requestBody;
        this.i = str2;
        this.tF = str3;
        this.N = str;
        this.SN = map;
        this.yq = map2;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            this.i = A7.N(new StringBuilder(), this.i, "?");
            for (String str4 : map.keySet()) {
                String str5 = this.i;
                StringBuilder yq = Sq.yq(str4, "=");
                yq.append(this.SN.get(str4));
                yq.append("&");
                this.i = str5.concat(yq.toString());
            }
            this.i = Rc.s(this.i);
        }
        if (this.N.equals("POST")) {
            if (!TextUtils.isEmpty(this.tF)) {
                requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.tF);
            } else {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map3 = this.SN;
                if (map3 != null) {
                    for (String str6 : map3.keySet()) {
                        builder2.add(str6, this.SN.get(str6));
                    }
                }
                requestBody = builder2.build();
            }
            builder.post(requestBody);
        }
        Map<String, String> map4 = this.yq;
        if (map4 != null) {
            for (String str7 : map4.keySet()) {
                builder.addHeader(str7, this.yq.get(str7));
            }
        }
        this.zH = builder.url(this.i).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bo(String str, String str2, Map map) {
        this("POST", str, str2, null, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bo(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this(str, str2, null, map, map2);
    }

    public final w2 yq(OkHttpClient okHttpClient) {
        try {
            Response execute = okHttpClient.newCall(this.zH).execute();
            return new w2(execute.code(), execute.body().string());
        } catch (IOException unused) {
            return new w2();
        }
    }
}
