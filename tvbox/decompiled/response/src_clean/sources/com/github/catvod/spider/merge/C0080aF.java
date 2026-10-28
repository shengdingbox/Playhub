package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.ProxyOrigin;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.aF  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0080aF extends Vd {
    public static int B;
    public static JSONObject G = new JSONObject();
    public static String G4 = "";
    private static int dT = 2;
    private static ExecutorService q;

    public C0080aF(int i) {
        super(i);
        q = Executors.newFixedThreadPool(65);
    }

    public static void KJ() {
        boolean z;
        boolean z2;
        int i = 6677;
        try {
            new ServerSocket(6677).close();
            z = false;
        } catch (IOException unused) {
            z = true;
        }
        try {
            if (z) {
                B = 6677;
                i = 6678;
                while (i < 7000) {
                    try {
                        new ServerSocket(i).close();
                        z2 = false;
                    } catch (IOException unused2) {
                        z2 = true;
                    }
                    if (!z2) {
                        break;
                    }
                    i++;
                }
            } else {
                B = 6678;
            }
            new C0080aF(i).t0();
        } catch (IOException unused3) {
        }
    }

    public static void M(C0080aF aFVar) {
        Objects.requireNonNull(aFVar);
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ExecutorService executorService = q;
        if (executorService != null && !executorService.isShutdown()) {
            q.shutdown();
            SpiderDebug.log("Executor service stopped.");
        }
        super.Gc();
        SpiderDebug.log("Server stopped.");
    }

    @Override // com.github.catvod.spider.merge.Vd
    public final pM i(AbstractC0198vd vdVar) {
        YU yu = YU.OK;
        String SN = vdVar.SN();
        String tF = A7.tF(vdVar.yq());
        Map<String, List<String>> parameters = vdVar.getParameters();
        Map<String, String> N = vdVar.N();
        if ("GET".equals(tF) && SN.startsWith("/live")) {
            HashMap hashMap = new HashMap();
            for (String str : parameters.keySet()) {
                hashMap.put(str, parameters.get(str).get(0));
            }
            StringBuilder yq = by.yq("#EXTM3U\n#EXT-X-VERSION:3\n#EXT-X-ALLOW-CACHE:NO\n#EXT-X-MEDIA-SEQUENCE:");
            yq.append(dT);
            yq.append("\n#EXT-X-TARGETDURATION:130\n\n#EXTINF:-1,Live Stream Segment  ");
            yq.append(dT);
            yq.append("\n");
            yq.append(ProxyOrigin.getOwnProxyUrl());
            yq.append("proxy/huya");
            yq.append(dT);
            yq.append(".ts?do=huya&url=");
            yq.append((String) hashMap.get("url"));
            yq.append("\n");
            String sb = yq.toString();
            dT++;
            return pM.i(yu, "application/vnd.apple.mpegurl", new ByteArrayInputStream(sb.getBytes()));
        } else if ("GET".equals(tF) && (SN.startsWith("/proxy") || SN.startsWith("/play"))) {
            try {
                if (SN.startsWith("/proxy")) {
                    SN = SN.replace("/proxy", "");
                }
                HashMap hashMap2 = new HashMap();
                for (String str2 : parameters.keySet()) {
                    hashMap2.put(str2, parameters.get(str2).get(0));
                }
                Object[] proxyDrive = ProxyOrigin.proxyDrive(hashMap2, SN, N, "", G4);
                YU SN2 = YU.SN(((Integer) proxyDrive[0]).intValue());
                String str3 = (String) proxyDrive[1];
                InputStream inputStream = (InputStream) proxyDrive[2];
                if (proxyDrive.length <= 3) {
                    return pM.i(SN2, str3, inputStream);
                }
                HashMap hashMap3 = (HashMap) proxyDrive[3];
                if (hashMap3.containsKey("location")) {
                    pM Gc = pM.Gc(SN2, str3, inputStream, 0L);
                    Gc.N("location", (String) hashMap3.get("location"));
                    return Gc;
                }
                if (!N.get("user-agent").contains("Kodi") && !N.get("user-agent").contains("Galaxy") && !N.get("user-agent").contains("VLC") && !N.get("user-agent").contains("Lavf")) {
                    pM i = pM.i(SN2, str3, inputStream);
                    for (String str4 : hashMap3.keySet()) {
                        i.N(str4, (String) hashMap3.get(str4));
                    }
                    return i;
                }
                pM Gc2 = pM.Gc(SN2, str3, inputStream, Long.parseLong((String) hashMap3.get("Content-Length")));
                for (String str5 : hashMap3.keySet()) {
                    Gc2.N(str5, (String) hashMap3.get(str5));
                }
                if (N.get("user-agent").contains("VLC")) {
                    Gc2.N("Connection", "close");
                }
                return Gc2;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (SN.equals("/shutdown") && "GET".equals(tF)) {
            new Thread(new xW(this, 0)).start();
            return pM.t0(yu, "Server is shutting down...");
        } else if ("HEAD".equals(tF)) {
            return pM.t0(YU.SN(404), "");
        } else {
            return null;
        }
    }
}
