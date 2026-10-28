package com.github.catvod.spider.merge;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class MI {
    private final Map<String, String> N;
    private Object SN;
    private Request i;
    private Request.Builder t0;
    private final Map<String, String> tF;
    private String yq;
    private final AbstractC0181tM zH;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MI(String str, String str2, String str3, Map map) {
        this(str, str2, str3, null, map, null);
    }

    private MI(String str, String str2, String str3, Map map, Map map2, AbstractC0181tM tMVar) {
        StringBuilder sb;
        RequestBody requestBody;
        this.SN = null;
        this.yq = str2;
        this.N = map;
        this.tF = map2;
        this.zH = tMVar;
        this.t0 = new Request.Builder();
        if (!str.equals("GET")) {
            if (str.equals("POST")) {
                Request.Builder builder = this.t0;
                if (!TextUtils.isEmpty(str3)) {
                    requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str3);
                } else {
                    FormBody.Builder builder2 = new FormBody.Builder();
                    if (map != null) {
                        for (String str4 : map.keySet()) {
                            builder2.add(str4, this.N.get(str4));
                        }
                    }
                    requestBody = builder2.build();
                }
                builder.post(requestBody);
            }
        } else if (map != null) {
            if (this.yq.contains("?")) {
                sb = new StringBuilder();
                sb.append(this.yq);
                sb.append("&");
            } else {
                sb = new StringBuilder();
                sb.append(this.yq);
                sb.append("?");
            }
            this.yq = sb.toString();
            for (String str5 : map.keySet()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.yq);
                sb2.append(str5);
                sb2.append("=");
                this.yq = A7.N(sb2, this.N.get(str5), "&");
            }
            String str6 = this.yq;
            this.yq = str6.substring(0, str6.length() - 1);
        }
        this.t0.url(this.yq);
        Object obj = this.SN;
        if (obj != null) {
            this.t0.tag(obj);
        }
        Map<String, String> map3 = this.tF;
        if (map3 != null) {
            for (String str7 : map3.keySet()) {
                this.t0.addHeader(str7, this.tF.get(str7));
            }
        }
        this.i = this.t0.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MI(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC0181tM tMVar) {
        this(str, str2, null, map, map2, tMVar);
    }

    public final void N(Object obj) {
        this.SN = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Response SN(OkHttpClient okHttpClient) {
        try {
            return okHttpClient.newCall(this.i).execute();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void yq(OkHttpClient okHttpClient) {
        Call newCall = okHttpClient.newCall(this.i);
        try {
            Response execute = newCall.execute();
            AbstractC0181tM tMVar = this.zH;
            if (tMVar != null) {
                tMVar.yq(newCall, execute);
            }
        } catch (IOException e) {
            AbstractC0181tM tMVar2 = this.zH;
            if (tMVar2 != null) {
                tMVar2.onError(newCall, e);
            }
        }
    }
}
