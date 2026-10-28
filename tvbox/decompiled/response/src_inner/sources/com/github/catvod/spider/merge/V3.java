package com.github.catvod.spider.merge;

import com.github.catvod.crawler.Spider;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class V3 {
    private OkHttpClient yq;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        static volatile V3 yq = new V3();
    }

    public static String B(String str) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Response execute = builder.connectTimeout(2L, timeUnit).readTimeout(2L, timeUnit).writeTimeout(2L, timeUnit).build().newCall(new Request.Builder().url(str).build()).execute();
        try {
            if (execute.isSuccessful()) {
                String string = execute.body().string();
                execute.close();
                return string;
            }
            throw new Exception("请求失败: " + execute.code());
        } catch (Throwable th) {
            if (execute != null) {
                try {
                    execute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String Gc(String str, String str2) {
        return i(str, str2, null).yq();
    }

    public static String KJ(String str) {
        return q(str, null);
    }

    public static String M(String str, Map<String, String> map) {
        return t0(str, map, null).yq();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
        if (r3.containsKey(r4) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String N(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            okhttp3.OkHttpClient r0 = SN()
            okhttp3.OkHttpClient$Builder r0 = r0.newBuilder()
            r1 = 0
            okhttp3.OkHttpClient$Builder r0 = r0.followRedirects(r1)
            okhttp3.OkHttpClient$Builder r0 = r0.followSslRedirects(r1)
            okhttp3.OkHttpClient r0 = r0.build()
            okhttp3.Request$Builder r2 = new okhttp3.Request$Builder
            r2.<init>()
            okhttp3.Request$Builder r3 = r2.url(r3)
            okhttp3.Headers r4 = okhttp3.Headers.of(r4)
            okhttp3.Request$Builder r3 = r3.headers(r4)
            okhttp3.Request r3 = r3.build()
            okhttp3.Call r3 = r0.newCall(r3)
            okhttp3.Response r3 = r3.execute()
            okhttp3.Headers r3 = r3.headers()
            java.util.Map r3 = r3.toMultimap()
            if (r3 != 0) goto L3d
            goto L5b
        L3d:
            java.lang.String r4 = "location"
            boolean r0 = r3.containsKey(r4)
            if (r0 == 0) goto L46
            goto L4e
        L46:
            java.lang.String r4 = "Location"
            boolean r0 = r3.containsKey(r4)
            if (r0 == 0) goto L5b
        L4e:
            java.lang.Object r3 = r3.get(r4)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            goto L5c
        L5b:
            r3 = 0
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.V3.N(java.lang.String, java.util.Map):java.lang.String");
    }

    public static OkHttpClient SN() {
        Dns dns;
        try {
            OkHttpClient client = Spider.client();
            Objects.requireNonNull(client);
            OkHttpClient okHttpClient = client;
            return client;
        } catch (Throwable unused) {
            if (yq.yq.yq != null) {
                return yq.yq.yq;
            }
            V3 v3 = yq.yq;
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            try {
                dns = Spider.safeDns();
                Objects.requireNonNull(dns);
            } catch (Throwable unused2) {
                dns = Dns.SYSTEM;
            }
            OkHttpClient.Builder dns2 = builder.dns(dns);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder hostnameVerifier = dns2.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(cB.yq);
            SSLContext sSLContext = null;
            try {
                SSLContext sSLContext2 = SSLContext.getInstance("TLS");
                sSLContext2.init(null, new TrustManager[]{new C0210zc()}, new SecureRandom());
                sSLContext = sSLContext2;
            } catch (Throwable unused3) {
            }
            OkHttpClient build = hostnameVerifier.sslSocketFactory(sSLContext.getSocketFactory(), new C0210zc()).build();
            v3.yq = build;
            return build;
        }
    }

    public static w2 i(String str, String str2, Map<String, String> map) {
        return new Bo(str, str2, map).yq(SN());
    }

    public static String q(String str, Map map) {
        return str.startsWith("http") ? new Bo("GET", str, null, map).yq(SN()).yq() : "";
    }

    public static w2 t0(String str, Map<String, String> map, Map<String, String> map2) {
        return new Bo("POST", str, map, map2).yq(SN());
    }

    public static Response tF(String str) {
        return SN().newCall(new Request.Builder().url(str).build()).execute();
    }

    public static void yq() {
        for (Call call : SN().dispatcher().queuedCalls()) {
            if ("p_json_parse".equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call2 : SN().dispatcher().runningCalls()) {
            if ("p_json_parse".equals(call2.request().tag())) {
                call2.cancel();
            }
        }
    }

    public static Response zH(String str, Map<String, String> map) {
        return SN().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }
}
