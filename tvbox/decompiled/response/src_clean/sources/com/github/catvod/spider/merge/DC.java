package com.github.catvod.spider.merge;

import android.util.Base64;
import com.github.catvod.spider.ProxyOrigin;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class DC {
    private static final Map<Integer, Set<BigDecimal>> N;
    public static final /* synthetic */ int tF = 0;
    private static final Pattern yq = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static String SN = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN {
        int N;
        int SN;
        List<yq> yq;

        SN(List list, int i, int i2) {
            this.yq = list;
            this.SN = i;
            this.N = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        BigDecimal N;
        int SN;
        BigDecimal tF;
        List<String> yq;

        yq(List<String> list, int i, BigDecimal bigDecimal, int i2) {
            this.tF = BigDecimal.ZERO;
            this.yq = list;
            this.SN = i;
            this.N = bigDecimal;
            if (i2 > 0) {
                this.tF = bigDecimal.divide(new BigDecimal(i2), 6, RoundingMode.HALF_UP).stripTrailingZeros();
            }
        }

        public final String toString() {
            StringBuilder yq = by.yq("BlockInfo{uriSize=");
            yq.append(this.SN);
            yq.append(", avgDuration=");
            yq.append(this.tF);
            yq.append(", totalDuration=");
            yq.append(this.N);
            yq.append('}');
            return yq.toString();
        }
    }

    static {
        new BigDecimal("0.000001");
        HashMap hashMap = new HashMap();
        int[] iArr = {30, 25, 24};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            Integer valueOf = Integer.valueOf(i2);
            HashSet hashSet = new HashSet();
            double d = i2;
            SN(hashSet, d, i2);
            if (i2 == 24 || i2 == 30 || i2 == 60) {
                Double.isNaN(d);
                Double.isNaN(d);
                Double.isNaN(d);
                Double.isNaN(d);
                SN(hashSet, d / 1.001d, i2 * 10);
            }
            hashMap.put(valueOf, hashSet);
        }
        N = hashMap;
    }

    public static String B(String str, HashMap hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return ProxyOrigin.getUrl() + "?do=m3u8&url=" + URLEncoder.encode(str);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(URLEncoder.encode((String) entry.getKey()));
            sb.append(":");
            sb.append(URLEncoder.encode((String) entry.getValue()));
            sb.append(";");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        String encodeToString = Base64.encodeToString(sb.toString().getBytes(), 2);
        return ProxyOrigin.getUrl() + "?do=m3u8&url=" + URLEncoder.encode(str) + "&headers=" + encodeToString;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0764  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String G(java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.DC.G(java.lang.String, java.lang.String):java.lang.String");
    }

    private static String G4(String str, String str2) {
        Matcher matcher = Pattern.compile("URI=\"(.*?)\"").matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder yq2 = by.yq("URI=\"");
        yq2.append(M(str2, matcher.group(1)));
        yq2.append("\"");
        return matcher.replaceFirst(yq2.toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, java.util.Set<java.math.BigDecimal>>] */
    public static boolean Gc(BigDecimal bigDecimal, int i) {
        if (bigDecimal == null) {
            return false;
        }
        ?? r0 = N;
        if (!r0.containsKey(Integer.valueOf(i))) {
            return false;
        }
        return ((Set) r0.get(Integer.valueOf(i))).contains(bigDecimal.remainder(BigDecimal.ONE).abs().stripTrailingZeros());
    }

    private static BigDecimal KJ(String str) {
        try {
            int indexOf = str.indexOf(58);
            int indexOf2 = str.indexOf(44, indexOf);
            if (!(indexOf == -1 || indexOf2 == -1)) {
                return new BigDecimal(str.substring(indexOf + 1, indexOf2).trim()).stripTrailingZeros();
            }
        } catch (Exception unused) {
        }
        return BigDecimal.ZERO;
    }

    public static String M(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            URI uri = new URI(str.trim());
            String trim = str2.trim();
            URI uri2 = new URI(trim);
            if (!trim.startsWith("http://") && !trim.startsWith("https://")) {
                if (trim.startsWith("://")) {
                    return new URI(uri.getScheme() + trim).toString();
                } else if (!trim.startsWith("//")) {
                    return uri.resolve(trim).toString();
                } else {
                    return new URI(uri.getScheme() + ":" + trim).toString();
                }
            }
            return uri2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int N(Map<Integer, Integer> map) {
        int i = 0;
        for (Integer num : map.values()) {
            i += num.intValue();
        }
        if (i < 15) {
            return map.keySet().iterator().next().intValue();
        }
        int i2 = -1;
        int i3 = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int intValue = entry.getValue().intValue();
            if (intValue > i2) {
                i3 = entry.getKey().intValue();
                i2 = intValue;
            }
        }
        if (i2 <= 0) {
            return 0;
        }
        return i3;
    }

    private static void SN(Set<BigDecimal> set, double d, int i) {
        BigDecimal valueOf = BigDecimal.valueOf(d);
        for (int i2 = 1; i2 <= i; i2++) {
            BigDecimal remainder = BigDecimal.valueOf(i2).divide(valueOf, 10, RoundingMode.HALF_UP).remainder(BigDecimal.ONE);
            for (int i3 = 3; i3 <= 6; i3++) {
                BigDecimal stripTrailingZeros = remainder.setScale(i3, RoundingMode.HALF_UP).stripTrailingZeros();
                if (stripTrailingZeros.compareTo(BigDecimal.ZERO) != 0) {
                    set.add(stripTrailingZeros);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(java.lang.String r6, java.util.Map r7) {
        /*
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r1 = 0
            okhttp3.OkHttpClient$Builder r0 = r0.followRedirects(r1)
            okhttp3.OkHttpClient r0 = r0.build()
        Le:
            r2 = 2
            if (r1 >= r2) goto L6c
            okhttp3.Request$Builder r2 = new okhttp3.Request$Builder
            r2.<init>()
            okhttp3.Request$Builder r2 = r2.url(r6)
            if (r7 == 0) goto L40
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r2.addHeader(r5, r4)
            goto L24
        L40:
            okhttp3.Request r2 = r2.build()
            okhttp3.Call r2 = r0.newCall(r2)
            okhttp3.Response r2 = r2.execute()
            boolean r3 = r2.isRedirect()
            if (r3 == 0) goto L69
            java.lang.String r3 = "Location"
            java.lang.String r3 = r2.header(r3)
            r2.close()
            if (r3 == 0) goto L68
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L64
            goto L68
        L64:
            int r1 = r1 + 1
            r6 = r3
            goto Le
        L68:
            return r6
        L69:
            r2.close()
        L6c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.DC.i(java.lang.String, java.util.Map):java.lang.String");
    }

    public static String q(String str) {
        return B(str, null);
    }

    private static BigDecimal t0(String[] strArr) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (String str : strArr) {
            if (str.startsWith("#EXTINF")) {
                Matcher matcher = yq.matcher(str);
                if (matcher.find()) {
                    try {
                        bigDecimal = bigDecimal.add(new BigDecimal(matcher.group(1)));
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return bigDecimal;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String tF(java.lang.String r14, java.util.HashMap r15) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.DC.tF(java.lang.String, java.util.HashMap):java.lang.String");
    }

    private static int yq(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < str2.length() && str.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }

    private static int zH(double d) {
        if (d <= 30.0d) {
            return 15;
        }
        if (d <= 60.0d) {
            return 20;
        }
        return d <= 90.0d ? 25 : 30;
    }
}
