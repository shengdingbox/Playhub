package com.github.catvod.spider.merge;

import android.text.TextUtils;
import android.util.Base64;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class zr {
    private static final Set<String> yq = new HashSet(Arrays.asList("domain", "expires", "max-age", "path", "httponly", "secure", "samesite"));
    private static final Set<String> SN = new HashSet(Arrays.asList("DedeUserID", "DedeUserID__ckMd5", "SESSDATA", "bili_jct", "sid"));

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public static String N(Map<String, List<String>> map) {
        String trim;
        int indexOf;
        List<String> i = C0068Pe.i(map);
        if (i == null || i.isEmpty()) {
            return "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : i) {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(";");
                if (split.length != 0 && (indexOf = (trim = split[0].trim()).indexOf(61)) > 0) {
                    String trim2 = trim.substring(0, indexOf).trim();
                    if (!yq.contains(trim2.toLowerCase())) {
                        linkedHashMap.put(trim2, trim.substring(indexOf + 1).trim());
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    public static String SN(long j, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("https://www.bilibili.com/correspond/1/");
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDLgd2OAkcGVtoE3ThUREbio0EgUc/prcajMKXvkCKFCWhJYJcLkcM2DKKcSeFpD/j6Boy538YXnR6VhcuUJOhH2x71nzPjfdTcqMz7djHum0qSZA0AyCBDABUqCrfNgCiJ00Ra7GmRj+YCK1NJEuewlb40JNrRuoEUXpabUzGB8QIDAQAB", 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            cipher.init(1, generatePublic, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            byte[] doFinal = cipher.doFinal(("refresh_" + j).getBytes());
            StringBuilder sb2 = new StringBuilder(doFinal.length * 2);
            for (int i = 0; i < doFinal.length; i++) {
                if ((doFinal[i] & 255) < 16) {
                    sb2.append("0");
                }
                sb2.append(Long.toString(doFinal[i] & 255, 16));
            }
            str2 = sb2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            str2 = "";
        }
        sb.append(str2);
        String sb3 = sb.toString();
        HashMap SN2 = C0128k.SN("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36", "Referer", "https://www.bilibili.com");
        SN2.put("cookie", str);
        Matcher matcher = Pattern.compile("<div +id=\"1-name\">(.+?)</div>").matcher(V3.q(sb3, SN2));
        return !matcher.find() ? "" : matcher.group(1).trim();
    }

    public static String tF(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String tF = M4.tF(M4.SN("bili_refresh_token"));
        if (TextUtils.isEmpty(tF)) {
            return null;
        }
        HashMap SN2 = C0128k.SN("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36", "Referer", "https://www.bilibili.com");
        SN2.put("cookie", str);
        try {
            JSONObject jSONObject = new JSONObject(V3.q("https://passport.bilibili.com/x/passport-login/web/cookie/info", SN2)).getJSONObject("data");
            if (!jSONObject.getBoolean("refresh")) {
                System.out.println("bili 无需刷新token");
                return null;
            }
            String SN3 = SN(jSONObject.getLong("timestamp"), str);
            if (TextUtils.isEmpty(SN3)) {
                System.out.println("bili getRefreshCsrf fail");
                return null;
            }
            System.out.println("bili getRefreshCsrf success");
            String str2 = "";
            for (String str3 : str.split(";")) {
                if (str3.startsWith("bili_jct")) {
                    str2 = str3.split("=")[1];
                }
            }
            return zH(SN3, str2, tF, str);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public static String yq(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String query = new URL(str).getQuery();
            if (TextUtils.isEmpty(query)) {
                return "";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str2 : query.split("&")) {
                int indexOf = str2.indexOf(61);
                if (indexOf > 0) {
                    String substring = str2.substring(0, indexOf);
                    if (SN.contains(substring)) {
                        linkedHashMap.put(substring, str2.substring(indexOf + 1));
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String zH(String str, String str2, String str3, String str4) {
        String str5 = "https://passport.bilibili.com/x/passport-login/web/cookie/refresh?csrf=" + str2 + "&refresh_csrf=" + str + "&source=main_web&refresh_token=" + str3;
        HashMap SN2 = C0128k.SN("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36", "Referer", "https://www.bilibili.com");
        SN2.put("cookie", str4);
        Response dT = C0068Pe.dT(str5, null, SN2);
        try {
            JSONObject jSONObject = new JSONObject(dT.body().string()).getJSONObject("data");
            if (jSONObject.getInt("status") == 0) {
                String string = jSONObject.getString("refresh_token");
                String N = N(dT.headers().toMultimap());
                if (!TextUtils.isEmpty(N)) {
                    System.out.println("bili refreshCookie success");
                    M4.i(M4.SN("bili_refresh_token"), string);
                    M4.i(M4.SN("bili"), N);
                    return N;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
