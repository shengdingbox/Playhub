package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Response;
/* renamed from: com.github.catvod.spider.merge.Pe  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0068Pe {
    private static OkHttpClient N;
    private static String i;
    private static OkHttpClient t0;
    private static OkHttpClient tF;
    private static int yq;
    public static OkHttpClient zH;
    private static final Object SN = new Object();
    private static final ConnectionPool Gc = new ConnectionPool(50, 5, TimeUnit.MINUTES);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.Pe$N */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class N extends AbstractC0181tM<String> {
        final /* synthetic */ Map SN;

        N(Map map) {
            this.SN = map;
        }

        @Override // com.github.catvod.spider.merge.AbstractC0181tM
        public final void onFailure(Call call, Exception exc) {
            SN("");
            SpiderDebug.log(exc);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0181tM
        public final String onParseResponse(Call call, Response response) {
            try {
                Map map = this.SN;
                if (map != null) {
                    map.clear();
                    this.SN.putAll(response.headers().toMultimap());
                }
                return response.body().string();
            } catch (IOException unused) {
                return "";
            }
        }

        @Override // com.github.catvod.spider.merge.AbstractC0181tM
        public final /* bridge */ /* synthetic */ void onResponse(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.Pe$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class SN implements Interceptor {
        final /* synthetic */ String yq;

        SN(String str) {
            this.yq = str;
        }

        public final Response intercept(Interceptor.Chain chain) {
            return chain.proceed(chain.request().newBuilder().header("Host", this.yq).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.Pe$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class yq implements Dns {
        final /* synthetic */ String yq;

        yq(String str) {
            this.yq = str;
        }

        public final List<InetAddress> lookup(String str) {
            return Collections.singletonList(InetAddress.getByName(this.yq));
        }
    }

    public static String B(String str, Map<String, String> map, Map<String, String> map2) {
        return G4(str, map, map2, "");
    }

    public static Response F5(String str, Map<String, String> map, Map<String, String> map2) {
        return new MI("POST", str, map, map2, null).SN(yq(0));
    }

    public static void G(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC0181tM tMVar) {
        new MI("POST", str, map, map2, tMVar).yq(okHttpClient);
    }

    public static String G4(String str, Map map, Map map2, String str2) {
        OkHttpClient yq2;
        if (!str2.isEmpty()) {
            yq2 = SN(str2, 0);
        } else {
            str2.isEmpty();
            str2.isEmpty();
            yq2 = yq(0);
        }
        return g9(yq2, "POST", str, null, map, map2, null);
    }

    public static Response Gc(String str, Map<String, String> map) {
        return KJ(str, map, "", 0);
    }

    public static String Gd(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return xa(q(0), str, null, null, map, map2);
    }

    public static Response KJ(String str, Map<String, String> map, String str2, int i2) {
        if (Rc.ee(str2) || i2 != 0) {
            return (i2 == 0 || !Rc.ee(str2)) ? new MI("GET", str, "", map).SN(yq(0)) : new MI("GET", str, "", map).SN(yq(i2));
        }
        return new MI("GET", str, "", map).SN(SN(str2, 0));
    }

    public static Response M(String str, Map<String, String> map, int i2) {
        return KJ(str, map, "", i2);
    }

    public static OkHttpClient N() {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(100);
        dispatcher.setMaxRequestsPerHost(50);
        synchronized (SN) {
            OkHttpClient okHttpClient = zH;
            if (okHttpClient == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder protocols = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true).connectionPool(Gc).dispatcher(dispatcher).protocols(Collections.singletonList(Protocol.HTTP_1_1));
                X509TrustManager x509TrustManager = Bj.SN;
                OkHttpClient build = protocols.hostnameVerifier(Ir.yq).sslSocketFactory(new Bj(), Bj.SN).build();
                zH = build;
                yq = 0;
                return build;
            } else if (yq == 0) {
                return okHttpClient;
            } else {
                zH = null;
                return N();
            }
        }
    }

    public static OkHttpClient SN(String str, int i2) {
        synchronized (SN) {
            String[] split = str.split("\\|");
            boolean z = false;
            String str2 = split[0];
            if (tF == null) {
                if (split.length > 1) {
                    z = Boolean.parseBoolean(split[1]);
                }
                OkHttpClient.Builder dns = new OkHttpClient.Builder().dns(new yq(str2));
                long j = 15;
                long j2 = i2 == 0 ? 15L : i2;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder writeTimeout = dns.readTimeout(j2, timeUnit).writeTimeout(i2 == 0 ? 15L : i2, timeUnit);
                if (i2 != 0) {
                    j = i2;
                }
                OkHttpClient.Builder connectionPool = writeTimeout.connectTimeout(j, timeUnit).retryOnConnectionFailure(true).connectionPool(Gc);
                X509TrustManager x509TrustManager = Bj.SN;
                OkHttpClient.Builder sslSocketFactory = connectionPool.hostnameVerifier(Ir.yq).sslSocketFactory(new Bj(), Bj.SN);
                if (z) {
                    sslSocketFactory.addInterceptor(new SN(str2));
                }
                OkHttpClient build = sslSocketFactory.build();
                tF = build;
                i = str2;
                return build;
            } else if (i.equals(str2)) {
                return tF;
            } else {
                tF = null;
                return SN(str, i2);
            }
        }
    }

    public static String W(String str, Map<String, String> map) {
        return ee(str, map, "", 0);
    }

    public static Response dT(String str, String str2, Map<String, String> map) {
        String str3 = Rc.yq;
        return new MI("POST", str, str2, map).SN(yq(0));
    }

    public static String ee(String str, Map<String, String> map, String str2, int i2) {
        if (str2.isEmpty() || i2 != 0) {
            return (str2.isEmpty() || i2 <= 0) ? (!str2.isEmpty() || i2 <= 0) ? xa(yq(0), str, null, null, map, null) : xa(yq(i2), str, null, null, map, null) : xa(SN(str2, i2), str, null, null, map, null);
        }
        return xa(SN(str2, 0), str, null, null, map, null);
    }

    public static String g9(OkHttpClient okHttpClient, String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        N n = new N(map3);
        MI mi = new MI(str, str2, map, map2, n);
        mi.N(str3);
        mi.yq(okHttpClient);
        return n.getResult();
    }

    public static List<String> i(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        String str = "set-cookie";
        if (!map.containsKey(str)) {
            str = "Set-Cookie";
            if (!map.containsKey(str)) {
                return null;
            }
        }
        return map.get(str);
    }

    public static OkHttpClient q(int i2) {
        OkHttpClient okHttpClient;
        synchronized (SN) {
            if (t0 == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                long j = 15;
                long j2 = i2 == 0 ? 15L : i2;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder writeTimeout = builder.readTimeout(j2, timeUnit).writeTimeout(i2 == 0 ? 15L : i2, timeUnit);
                if (i2 != 0) {
                    j = i2;
                }
                OkHttpClient.Builder retryOnConnectionFailure = writeTimeout.connectTimeout(j, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = Wo.tF;
                t0 = retryOnConnectionFailure.sslSocketFactory(new Wo(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = t0;
        }
        return okHttpClient;
    }

    public static String t0(Map<String, List<String>> map) {
        String str = "location";
        if (!map.containsKey(str)) {
            str = "Location";
            if (!map.containsKey(str)) {
                return null;
            }
        }
        return map.get(str).get(0);
    }

    public static void tF(OkHttpClient okHttpClient, String str, Map map, AbstractC0181tM tMVar) {
        new MI("GET", str, null, map, tMVar).yq(okHttpClient);
    }

    public static String v(String str, Map<String, String> map, int i2) {
        return ee(str, map, "", i2);
    }

    public static Response v3(String str, Map<String, String> map, Map<String, List<String>> map2, int i2) {
        OkHttpClient q = q(i2);
        C0127jn jnVar = new C0127jn(map2);
        MI mi = new MI("GET", str, null, map, jnVar);
        mi.N(null);
        mi.yq(q);
        return jnVar.getResult();
    }

    public static String xa(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        return g9(okHttpClient, "GET", str, str2, map, map2, map3);
    }

    public static OkHttpClient yq(int i2) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(100);
        dispatcher.setMaxRequestsPerHost(50);
        synchronized (SN) {
            OkHttpClient okHttpClient = N;
            if (okHttpClient == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                long j = 15;
                long j2 = i2 == 0 ? 15L : i2;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder writeTimeout = builder.readTimeout(j2, timeUnit).writeTimeout(i2 == 0 ? 15L : i2, timeUnit);
                if (i2 != 0) {
                    j = i2;
                }
                OkHttpClient.Builder dispatcher2 = writeTimeout.connectTimeout(j, timeUnit).retryOnConnectionFailure(true).connectionPool(Gc).dispatcher(dispatcher);
                X509TrustManager x509TrustManager = Bj.SN;
                OkHttpClient build = dispatcher2.hostnameVerifier(Ir.yq).sslSocketFactory(new Bj(), Bj.SN).build();
                N = build;
                yq = i2;
                return build;
            } else if (yq == i2) {
                return okHttpClient;
            } else {
                N = null;
                return yq(i2);
            }
        }
    }

    public static String zH(Map map) {
        if (map == null) {
            return null;
        }
        String str = "set-cookie";
        if (!map.containsKey(str)) {
            str = "Set-Cookie";
            if (!map.containsKey(str)) {
                return null;
            }
        }
        return (String) ((List) map.get(str)).get(0);
    }
}
