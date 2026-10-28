package com.github.catvod.spider;

import android.net.Uri;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.spider.merge.AbstractC0181tM;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0068Pe;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Hmys extends Spider {

    private String F5;
    private String Gd;
    private String Nl;
    private String W;
    private String dT;
    private String ee;
    private String g9;
    private String tF;
    private String v;
    private String v3;
    private String xa;
    private String yq = "aZ9$kU5%qI7=yC2=zH2#gM0@pX7^wF3a";
    private String SN = "hY2&tN3]kF7,dL7=";
    private String N = "zD9[bM4~sF4~uY2)";
    private String zH = "https://u.yyxdmn.com/api/public/init";
    private String i = "tianjishipin";
    private String t0 = "tjsp_sp01";
    private String Gc = "51000";
    private String M = "com.wfighter.zmz";
    private String KJ = "IysJHCZ2Z7HBEoPPKC8nXIibjGHkKNrc";
    private String q = "608";
    private String B = "331";
    private boolean G = true;
    private boolean G4 = true;

    public Hmys() {
        String str = "";
        this.tF = str;
        this.dT = str;
        this.F5 = str;
        this.v3 = str;
        this.W = str;
        this.v = str;
        this.ee = str;
        this.g9 = str;
        this.xa = str;
        this.Nl = str;

        return;
    }

    private String B(String str, HashMap<String, String> hashMap) {
        String str2;
        String str3;
        AbstractC0181tM.SN sn = new AbstractC0181tM.SN() { // from class: com.github.catvod.spider.Hmys.1
            {
                int i = (-26) ^ C0033.f91;

                if (i > 0) {
                    return;
                } else {
                    return;
                }
            }

            /* renamed from: فبﻅو  reason: contains not printable characters */
            public static void m786(Object obj, Object obj2) {
                int i = 802 ^ C0052.f110;

                if (!(i >= 0)) {
                    ((AnonymousClass1) obj).onResponse2((String) obj2);
                }
                int i4 = 515 ^ C0028.f86;

                if (i4 > 0) {
                    return;
                } else {
                    return;
                }
            }

            @Override // com.github.catvod.spider.merge.AbstractC0181tM
            public void onFailure(Call call, Exception exc) {
            }

            @Override // com.github.catvod.spider.merge.AbstractC0181tM
            public /* bridge */ /* synthetic */ void onResponse(String str4) {
                m786(this, str4);
            }

            /* renamed from: onResponse  reason: avoid collision after fix types in other method */
            public void onResponse2(String str4) {
            }
        };
        OkHttpClient okHttpClient = m758(0);
        HashMap hashMap2 = new HashMap();
        String str4 = (String.valueOf(System.currentTimeMillis()));
        boolean z = (TextUtils.isEmpty(m761(this)));
        String str5 = "";

        if (!z) {
            str2 = m761(this);
        } else {
            str2 = str5;
            str2 = m761(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m749(this));
        sb.append(str2);
        sb.append(str4);
        String str6 = (m741((sb.toString())).toUpperCase());
        boolean z2 = m747(this);

        if (!z2) {
            str3 = "okhttp/4.9.0";
        } else {
            str3 = "okhttp/4.12.0";
            str3 = "okhttp/4.9.0";
        }
        hashMap2.put("User-Agent",str3);
        hashMap2.put("log-header","I am the log request header.");
        hashMap2.put("app_id",m762(this));
        hashMap2.put("channel_code",m775(this));
        hashMap2.put("cur_time",str4);
        hashMap2.put("device_id",str2);
        hashMap2.put("mob_mfr",Build.BRAND);
        hashMap2.put("mobmodel",Build.MODEL);
        hashMap2.put("package_name",m772(this));
        hashMap2.put("sign",str6);
        hashMap2.put("sys_platform","2");
        hashMap2.put("sysrelease","12");
        String str7 = m774(this);

        if (str7 != null) {
            str5 = str7;
        } else {
            str5 = str7;
        }
        hashMap2.put("token",str5);
        hashMap2.put("version",m751(this));
        m771(okHttpClient, str, hashMap, hashMap2, sn);
        String str8 = (String) (sn.getResult());
        boolean z3 = (TextUtils.isEmpty(str8));

        if (z3) {
            throw new Exception(C0022.m1434("empty response: ", str));
        } else {
            return str8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    r1 = (r4.endsWith("/"));
    r0 = 1740;
    */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    r0 = r0 ^ 1757;
    */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    switch(r0) {
        case 17: goto L31;
        case 54: goto L32;
        case 471: goto L30;
        case 500: goto L33;
        default: goto L37;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    if (r1 == false) goto L34;
    */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    r0 = 1833;
    */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    r0 = 1802;
    */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    r4 = (r4.substring(0,(r4.length()) - 1));
    r0 = 1864;
    */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    r0 = r0 ^ 1881;
    */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    switch(r0) {
        case 17: goto L41;
        case 47483: goto L40;
        default: goto L43;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    r0 = 48674;
    */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    return r4;
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String F5(java.lang.String r4) {
        /*
        r0 = 1616(0x650, float:2.264E-42)
    L2:
        r0 = r0 ^ 1633(0x661, float:2.288E-42)
        switch(r0) {
            case 14: goto L8;
            case 49: goto Lb;
            case 204: goto L10;
            case 239: goto L15;
            default: goto L7;
        }
    L7:
        goto L2
    L8:
        r0 = 1678(0x68e, float:2.351E-42)
        goto L2
    Lb:
        if (r4 != 0) goto L8
        r0 = 1709(0x6ad, float:2.395E-42)
        goto L2
    L10:
        java.lang.String r4 = ""
    L14:
        return r4
    L15:
        short[] r0 = m773()
        r1 = 372(0x174, float:5.21E-43)
        r2 = 1
        r3 = 1390(0x56e, float:1.948E-42)
        java.lang.String r0 = com.github.catvod.spider.merge.C0039.m1937(r0, r1, r2, r3)
        boolean r1 = (r4.endsWith(r0))
        r0 = 1740(0x6cc, float:2.438E-42)
    L28:
        r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
        switch(r0) {
            case 17: goto L2e;
            case 54: goto L33;
            case 471: goto L14;
            case 500: goto L36;
            default: goto L2d;
        }
    L2d:
        goto L28
    L2e:
        if (r1 == 0) goto L33
        r0 = 1833(0x729, float:2.569E-42)
        goto L28
    L33:
        r0 = 1802(0x70a, float:2.525E-42)
        goto L28
    L36:
        r0 = 0
        int r1 = (r4.length())
        int r1 = r1 + (-1)
        java.lang.String r4 = (r4.substring(r0,r1))
        r0 = 1864(0x748, float:2.612E-42)
    L43:
        r0 = r0 ^ 1881(0x759, float:2.636E-42)
        switch(r0) {
            case 17: goto L49;
            case 47483: goto L15;
            default: goto L48;
        }
    L48:
        goto L43
    L49:
        r0 = 48674(0xbe22, float:6.8207E-41)
        goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.F5(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
    return (r1.toString());
    */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
    r1.append(r0);
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String G(org.json.JSONObject r9) {
        /*
        Method dump skipped, instructions count: 648
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.G(org.json.JSONObject):java.lang.String");
    }

    private String G4(String str) {
        String str2;
        String str3;
        boolean z = (TextUtils.isEmpty(str));

        if (z) {
            return str;
        } else {
            boolean z2 = (TextUtils.isEmpty(m779(this)));
            if (z2) {
                return str;
            } else {
                boolean z3 = ("0".equals(m779(this)));
                if (!z3) {
                    try {
                        Uri uri = C0034.m1791(m779(this));
                        Uri uri2 = C0034.m1791(str);
                        String str4 = (uri.getEncodedAuthority());
                        boolean z4 = (TextUtils.isEmpty(str4));
                        if (!z4) {
                            str2 = str4;
                        } else {
                            str2 = (uri.getHost());
                            str2 = str4;
                        }
                        Uri.Builder builder = (uri2.buildUpon());
                        String str5 = (uri.getScheme());
                        if (str5 != null) {
                            str3 = (uri.getScheme());
                        } else {
                            str3 = "http";
                            str3 = (uri.getScheme());
                        }
                        str = ((((builder.scheme(str3)).encodedAuthority(str2)).build()).toString());
                        return str;
                    } catch (Exception e) {
                        return str;
                    }
                } else {
                    return str;
                }
                return str;
            }
            return str;
        }
    }

    private static String Gc(String str) {
        try {
            return (C0041.m1986((C0027.m1581("MD5").digest((str.getBytes(StandardCharsets.UTF_8))))).toLowerCase());
        } catch (Exception e) {
            return (C0052.m2266(str).toLowerCase());
        }
    }

    private JSONArray KJ(String str, HashMap hashMap) {
        Object jSONObject = new JSONObject(m745(this, m767(this, str, hashMap)));
        String str2 = "result";
        boolean z = (TextUtils.isEmpty(str2));

        if (!z) {
            String[] strArr = (str2.split("\\."));
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    String str3 = strArr[i3];
                    boolean z3 = jSONObject instanceof JSONObject;
                    if (!z3) {
                        return new JSONArray();
                    } else {
                        jSONObject = ((JSONObject) jSONObject.opt(str3));
                        i3++;
                    }
                } else {
                    boolean z2 = jSONObject instanceof JSONArray;
                    if (!z2) {
                        return new JSONArray();
                    } else {
                        return (JSONArray) jSONObject;
                    }
                }
            }
        } else {
            JSONArray jSONArray = (jSONObject.optJSONArray(str2));
            if (jSONArray != null) {
                return jSONArray;
            } else {
                return new JSONArray();
            }
            String[] strArr = (str2.split("\\."));
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    String str3 = strArr[i3];
                    boolean z3 = jSONObject instanceof JSONObject;
                    if (!z3) {
                        return new JSONArray();
                    } else {
                        jSONObject = ((JSONObject) jSONObject.opt(str3));
                        i3++;
                    }
                } else {
                    boolean z2 = jSONObject instanceof JSONArray;
                    if (!z2) {
                        return new JSONArray();
                    } else {
                        return (JSONArray) jSONObject;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    r1 = 50689;
    */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    r1 = r1 ^ 50706;
    */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
    switch(r1) {
        case 19: goto L196;
        case 50: goto L195;
        default: goto L198;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0123, code lost:
    r1 = 50720;
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String M(java.lang.String r9) {
        /*
        Method dump skipped, instructions count: 784
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.M(java.lang.String):java.lang.String");
    }

    private JSONArray N(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();

        if (jSONArray != null) {
            int i2 = 0;
            while (true) {
                int i3 = (jSONArray.length());
                if (i2 < i3) {
                    JSONObject jSONObject = (jSONArray.optJSONObject(i2));
                    if (!(jSONObject == null)) {
                        String str = "name";
                        String str2 = (jSONObject.optString(str));
                        JSONArray jSONArray3 = (jSONObject.optJSONArray("data"));
                        boolean z = (TextUtils.isEmpty(str2));
                        if (!z) {
                            if (jSONArray3 != null) {
                                int i8 = (jSONArray3.length());
                                if (!(i8 == 0)) {
                                    JSONArray jSONArray4 = new JSONArray();
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = (jSONArray3.length());
                                        if (i10 < i11) {
                                            String str3 = (jSONArray3.optString(i10));
                                            boolean z2 = (TextUtils.isEmpty(str3));
                                            if (!(z2)) {
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put("n",str3);
                                                jSONObject3.put("v",str3);
                                                jSONArray4.put(jSONObject3);
                                            }
                                            i10++;
                                        } else {
                                            int i13 = (jSONArray4.length());
                                            if (!(i13 == 0)) {
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("key",str2);
                                                jSONObject2.put(str,str2);
                                                jSONObject2.put("value",jSONArray4);
                                                jSONArray2.put(jSONObject2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i2++;
                } else {
                    return jSONArray2;
                }
            }
        } else {
            return jSONArray2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 365
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    private void SN() {
        /*
        Method dump skipped, instructions count: 1370
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.SN():void");
    }

    private static String dT(Object obj) {
        String str = "";

        if (obj == null) {
            return str;
        } else {
            boolean z = C0028.m1628(JSONObject.NULL, obj);
            if (!z) {
                String str2 = ((String.valueOf(obj)).trim());
                boolean z2 = ("null".equals(str2));
                if (!z2) {
                    return str2;
                } else {
                    return str;
                }
            } else {
                return str;
            }
            return str;
        }
    }

    static Object[] i(String str, String str2, String str3) {
        String str4;
        StringBuilder sb;
        String str5;
        String str6;
        String str7 = m738(str, str2, str3);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent","Mozi");
        hashMap.put("Accept","*/*");
        String str8 = C0001.m32(str7, hashMap);
        boolean z = (TextUtils.isEmpty(str8));

        if (!(z)) {
            boolean z2 = (str8.contains("#EXT"));
            if (z2) {
                String str9 = "UTF-8";
                String str10 = C0009.m260(str2, str9);
                String str11 = C0009.m260(str3, str9);
                Uri uri = C0034.m1791(str);
                StringBuilder sb2 = new StringBuilder();
                String[] strArr = (str8.split("\\r?\\n",-1));
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    int length = strArr.length;
                    if (i4 < length) {
                        if (i4 > 0) {
                            sb2.append('\n');
                        }
                        String str12 = strArr[i4];
                        boolean z3 = (str12.isEmpty());
                        if (!z3) {
                            boolean z4 = (str12.startsWith("#"));
                            if (!(z4)) {
                                boolean z5 = (str12.contains("?"));
                                if (z5) {
                                    str12 = (str12.substring(0,(str12.indexOf(63))));
                                }
                                String str13 = "://";
                                boolean z6 = (str12.contains(str13));
                                if (z6) {
                                    str5 = str12;
                                } else {
                                    boolean z7 = (str12.startsWith("/"));
                                    if (z7) {
                                        sb = new StringBuilder();
                                        sb.append((uri.getScheme()));
                                        sb.append(str13);
                                        sb.append((uri.getHost()));
                                        int i14 = (uri.getPort());
                                        if (i14 != -1) {
                                            StringBuilder sb3 = C0052.m2253(":");
                                            sb3.append((uri.getPort()));
                                            str4 = (sb3.toString());
                                        } else {
                                            str4 = "";
                                        }
                                    } else {
                                        String str14 = (uri.getLastPathSegment());
                                        if (str14 == null) {
                                            str4 = str;
                                        } else {
                                            str4 = (str.substring(0,(str.indexOf(str14))));
                                        }
                                        sb = new StringBuilder();
                                    }
                                    str5 = C0032.m1739(sb, str4, str12);
                                }
                                sb2.append(ProxyOrigin.getUrl());
                                sb2.append("?do=hmys&type=ts&url=");
                                sb2.append(C0034.m1790((str5.getBytes(StandardCharsets.UTF_8)), 10));
                                sb2.append("&ck=");
                                sb2.append(str10);
                                sb2.append("&sign=");
                                sb2.append(str11);
                            }
                        }
                        sb2.append(str12);
                        i3 = i4 + 1;
                    } else {
                        return new Object[]{(Integer.valueOf(200)), "application/vnd.apple.mpegurl", new ByteArrayInputStream(((sb2.toString()).getBytes(StandardCharsets.UTF_8)))};
                    }
                }
            } else {
                String str9 = "UTF-8";
                String str10 = C0009.m260(str2, str9);
                String str11 = C0009.m260(str3, str9);
                Uri uri = C0034.m1791(str);
                StringBuilder sb2 = new StringBuilder();
                String[] strArr = (str8.split("\\r?\\n",-1));
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    int length = strArr.length;
                    if (i4 < length) {
                        if (i4 > 0) {
                            sb2.append('\n');
                        }
                        String str12 = strArr[i4];
                        boolean z3 = (str12.isEmpty());
                        if (!z3) {
                            boolean z4 = (str12.startsWith("#"));
                            if (!(z4)) {
                                boolean z5 = (str12.contains("?"));
                                if (z5) {
                                    str12 = (str12.substring(0,(str12.indexOf(63))));
                                }
                                String str13 = "://";
                                boolean z6 = (str12.contains(str13));
                                if (z6) {
                                    str5 = str12;
                                } else {
                                    boolean z7 = (str12.startsWith("/"));
                                    if (z7) {
                                        sb = new StringBuilder();
                                        sb.append((uri.getScheme()));
                                        sb.append(str13);
                                        sb.append((uri.getHost()));
                                        int i14 = (uri.getPort());
                                        if (i14 != -1) {
                                            StringBuilder sb3 = C0052.m2253(":");
                                            sb3.append((uri.getPort()));
                                            str4 = (sb3.toString());
                                        } else {
                                            str4 = "";
                                        }
                                    } else {
                                        String str14 = (uri.getLastPathSegment());
                                        if (str14 == null) {
                                            str4 = str;
                                        } else {
                                            str4 = (str.substring(0,(str.indexOf(str14))));
                                        }
                                        sb = new StringBuilder();
                                    }
                                    str5 = C0032.m1739(sb, str4, str12);
                                }
                                sb2.append(ProxyOrigin.getUrl());
                                sb2.append("?do=hmys&type=ts&url=");
                                sb2.append(C0034.m1790((str5.getBytes(StandardCharsets.UTF_8)), 10));
                                sb2.append("&ck=");
                                sb2.append(str10);
                                sb2.append("&sign=");
                                sb2.append(str11);
                            }
                        }
                        sb2.append(str12);
                        i3 = i4 + 1;
                    } else {
                        return new Object[]{(Integer.valueOf(200)), "application/vnd.apple.mpegurl", new ByteArrayInputStream(((sb2.toString()).getBytes(StandardCharsets.UTF_8)))};
                    }
                }
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("m3u8 fetch fail url=");
        sb4.append(str7);
        sb4.append(" bodyHead=");

        if (str8 != null) {
            str6 = (str8.substring(0,(Math.min(80,(str8.length())))));
        } else {
            str6 = "null";
            str6 = (str8.substring(0,(Math.min(80,(str8.length())))));
        }
        sb4.append(str6);
        sb4.toString();
        "Hmys";
        Exception exc = new Exception("m3u8 fetch fail");

        throw exc;
    }

    private JSONObject q(String str, HashMap<String, String> hashMap, String str2) {
        JSONObject jSONObject = new JSONObject(m745(this, m767(this, str, hashMap)));
        boolean z = (TextUtils.isEmpty(str2));

        if (!z) {
            String[] strArr = (str2.split("\\."));
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    jSONObject = (jSONObject.optJSONObject(strArr[i2]));
                    if (jSONObject != null) {
                        i2++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("missing path ");
                        sb.append(str2);
                        sb.append(" url=");
                        sb.append(str);
                        throw new Exception((sb.toString()));
                    }
                }
            }
        } else {
            String[] strArr = (str2.split("\\."));
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    jSONObject = (jSONObject.optJSONObject(strArr[i2]));
                    if (jSONObject != null) {
                        i2++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("missing path ");
                        sb.append(str2);
                        sb.append(" url=");
                        sb.append(str);
                        throw new Exception((sb.toString()));
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String randomDeviceId(int i) {
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int i2 = 0;
        while (true) {

            if (i2 < i) {
                sb.append(("abcdefghijklmnopqrstuvwxyz0123456789".charAt((secureRandom.nextInt(36)))));
                i2++;
            } else {
                return (m741((sb.toString())).substring(0,16));
            }
        }
    }

    private JSONObject t0(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        String str = m757((jSONObject.opt("id")));
        boolean z = (TextUtils.isEmpty(str));
        String str2 = "vod_id";

        if (z) {
            str = m757((jSONObject.opt(str2)));
        }
        jSONObject2.put(str2,str);
        String str3 = (jSONObject.optString("title"));
        String str4 = "vod_name";
        jSONObject2.put(str4,(jSONObject.optString(str4,str3)));
        String str5 = (jSONObject.optString("pic"));
        String str6 = "vod_pic";
        jSONObject2.put(str6,(jSONObject.optString(str6,str5)));
        jSONObject2.put("vod_remarks",m739(this, jSONObject));
        return jSONObject2;
    }

    private static String tF(String str, String str2, String str3) {
        String str4;
        String str5 = "?";
        boolean z = (str.contains(str5));

        if (z) {
            str = (str.substring(0,(str.indexOf(63))));
        }
        String str6 = (C0034.m1791(str).getPath());
        boolean z2 = (TextUtils.isEmpty(str6));

        if (z2) {
            throw new Exception(C0022.m1434("cdn path empty: ", str));
        } else {
            boolean z3 = (TextUtils.isEmpty(str3));
            if (z3) {
                str3 = "vT1RQRz8YzlzTgN26pIXNJ7Mi65juwSP";
            }
            String str7 = (Long.toHexString(System.currentTimeMillis() / 1000));
            String str8 = m741(C0048.m2149(str3, str6, str7));
            boolean z4 = (TextUtils.isEmpty(str2));
            if (z4) {
                throw new Exception("empty ck");
            } else {
                String str9 = (str2.trim());
                String str10 = "Time=";
                boolean z5 = (str9.contains(str10));
                if (!(z5)) {
                    String str11 = "k=";
                    boolean z6 = (str9.startsWith(str11));
                    if (!(z6)) {
                        String str12 = "az=";
                        boolean z7 = (str9.startsWith(str12));
                        if (!z7) {
                            byte[] bArr = C0022.m1420(str9, 0);
                            if (!(bArr == null)) {
                                int length = bArr.length;
                            }
                            bArr = C0022.m1420(str9, 10);
                            if (!(bArr == null)) {
                                int length2 = bArr.length;
                                if (!(length2 == 0)) {
                                    str4 = (new String(bArr, StandardCharsets.UTF_8).trim());
                                    boolean z8 = (str4.contains(str10));
                                    if (!(z8)) {
                                        boolean z9 = (str4.startsWith(str11));
                                        if (!(z9)) {
                                            boolean z10 = (str4.startsWith(str12));
                                            if (!z10) {
                                                StringBuilder sb = C0052.m2253("ck decode not query: ");
                                                sb.append((str4.substring(0,(Math.min(48,(str4.length()))))));
                                                throw new Exception((sb.toString()));
                                            } else {
                                                StringBuilder sb = C0052.m2253("ck decode not query: ");
                                                sb.append((str4.substring(0,(Math.min(48,(str4.length()))))));
                                                throw new Exception((sb.toString()));
                                            }
                                        }
                                    }
                                }
                            }
                            throw new Exception("ck base64 decode fail");
                        } else {
                            str4 = str9;
                            byte[] bArr = C0022.m1420(str9, 0);
                            if (!(bArr == null)) {
                                int length = bArr.length;
                            }
                            bArr = C0022.m1420(str9, 10);
                            if (!(bArr == null)) {
                                int length2 = bArr.length;
                                if (!(length2 == 0)) {
                                    str4 = (new String(bArr, StandardCharsets.UTF_8).trim());
                                    boolean z8 = (str4.contains(str10));
                                    if (!(z8)) {
                                        boolean z9 = (str4.startsWith(str11));
                                        if (!(z9)) {
                                            boolean z10 = (str4.startsWith(str12));
                                            if (!z10) {
                                                StringBuilder sb = C0052.m2253("ck decode not query: ");
                                                sb.append((str4.substring(0,(Math.min(48,(str4.length()))))));
                                                throw new Exception((sb.toString()));
                                            } else {
                                                StringBuilder sb = C0052.m2253("ck decode not query: ");
                                                sb.append((str4.substring(0,(Math.min(48,(str4.length()))))));
                                                throw new Exception((sb.toString()));
                                            }
                                        }
                                    }
                                }
                            }
                            throw new Exception("ck base64 decode fail");
                        }
                    }
                }
                str4 = str9;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str5);
                sb2.append(str4);
                sb2.append("&wsSecret=");
                sb2.append(str8);
                String str13 = C0032.m1739(sb2, "&wsTime=", str7);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("cdn sign path=");
                sb3.append(str6);
                sb3.append(" time=");
                sb3.append(str7);
                sb3.append(" secret=");
                sb3.append(str8);
                sb3.append(" signLen=");
                sb3.append((str3.length()));
                sb3.append(" deckHead=");
                sb3.append((str4.substring(0,(Math.min(24,(str4.length()))))));
                sb3.toString();
                "Hmys";
                return str13;
            }
            throw new Exception(C0022.m1434("cdn path empty: ", str));
        }
    }

    public static Object[] vod(Map<String, String> map) {
        String str = (String) (map.get("type"));
        String str2 = (String) (map.get("url"));
        String str3 = (String) (map.get("ck"));
        String str4 = (String) (map.get("sign"));
        boolean z = (TextUtils.isEmpty(str4));

        if (z) {
            str4 = "vT1RQRz8YzlzTgN26pIXNJ7Mi65juwSP";
        }
        String str5 = new String(C0022.m1420(str2, 10));
        try {
            boolean z2 = ("m3u8".equals(str));

            if (!z2) {
                boolean z3 = ("ts".equals(str));
                if (!z3) {
                    return null;
                } else {
                    return m750(str5, str3, str4);
                }
            } else {
                return m753(str5, str3, str4);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String yq(String str) {

        if (!(str == null)) {
            boolean z = (str.startsWith("http"));
            if (z) {
                return str;
            }
        }
        return C0032.m1739(new StringBuilder(), m744(this), str);
    }

    static Object[] zH(String str, String str2, String str3) {
        int i;
        boolean z = (str.contains("?"));

        if (z) {
            str = (str.substring(0,(str.indexOf(63))));
        }
        String str4 = m738(str, str2, str3);
        AbstractC0181tM.yq yqVar = new AbstractC0181tM.yq() { // from class: com.github.catvod.spider.Hmys.2
            {
                int i3 = (-556) ^ C0004.f4;

                if (i3 < 0) {
                    return;
                } else {
                    return;
                }
            }

            /* renamed from: ﺯفاﺡ  reason: contains not printable characters */
            public static void m787(Object obj, Object obj2) {
                int i3 = (-26) ^ C0033.f91;

                if (i3 < 0) {
                    return;
                } else {
                    ((AnonymousClass2) obj).onResponse2((Response) obj2);
                    return;
                }
            }

            @Override // com.github.catvod.spider.merge.AbstractC0181tM
            public void onFailure(Call call, Exception exc) {
            }

            @Override // com.github.catvod.spider.merge.AbstractC0181tM
            public /* bridge */ /* synthetic */ void onResponse(Response response) {
                m787(this, response);
            }

            /* renamed from: onResponse  reason: avoid collision after fix types in other method */
            public void onResponse2(Response response) {
                int i3 = 215 ^ C0038.f96;

                if (i3 < 0) {
                    return;
                } else {
                    return;
                }
            }
        };
        m764(m758(0), str4, C0055.m2325("User-Agent", "Mozi", "Accept", "*/*"), yqVar);
        Response response = (Response) (yqVar.getResult());

        if (!(response == null)) {
            int i4 = m776(response);
            if (!(i4 != 200)) {
                ResponseBody responseBody = m785(response);
                if (!(responseBody == null)) {
                    String str5 = m768(m763(response), "Content-Type");
                    if (!(str5 != null)) {
                        str5 = "video/mp2t";
                    }
                    return new Object[]{(Integer.valueOf(200)), str5, m748(m785(response))};
                }
            }
        }
        StringBuilder sb = C0052.m2253("ts fetch fail code=");

        if (response != null) {
            i = m776(response);
        } else {
            i = -1;
            i = m776(response);
        }
        sb.append(i);
        sb.append(" url=");
        sb.append(str4);
        sb.toString();
        "Hmys";
        return null;
    }

    /* renamed from: باﺙك  reason: contains not printable characters */
    public static void m736(Object obj) {
        int i = (-824) ^ C0004.f4;

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: بغﻝض  reason: contains not printable characters */
    public static JSONArray m737(Object obj, Object obj2) {
        int i = (-477) ^ C0042.f100;

        return ((Hmys) obj).N((JSONArray) obj2);
    }

    /* renamed from: بﺙﻉم  reason: contains not printable characters */
    public static String m738(Object obj, Object obj2, Object obj3) {
        int i = (-886) ^ C0021.f79;

        return tF((String) obj, (String) obj2, (String) obj3);
    }

    /* renamed from: بﺱـﺭ  reason: contains not printable characters */
    public static String m739(Object obj, Object obj2) {
        int i = (-314) ^ C0002.f2;

        return ((Hmys) obj).G((JSONObject) obj2);
    }

    /* renamed from: تنلﺙ  reason: contains not printable characters */
    public static String m740(Object obj) {
        int i = (-185) ^ C0033.f91;

        return F5((String) obj);
    }

    /* renamed from: تﺕﻕز  reason: contains not printable characters */
    public static String m741(Object obj) {
        int i = 57 ^ C0032.f90;

        return Gc((String) obj);
    }

    /* renamed from: تﺝﺙي  reason: contains not printable characters */
    public static String m742(Object obj) {
        int i = 284 ^ C0041.f99;

        return ((Hmys) obj).KJ;
    }

    /* renamed from: تﺹﺥﺕ  reason: contains not printable characters */
    public static String m743(Object obj) {
        int i = (-404) ^ C0021.f79;

        return ((Hmys) obj).W;
    }

    /* renamed from: ثﺙﺡو  reason: contains not printable characters */
    public static String m744(Object obj) {
        int i = (-193) ^ C0041.f99;

        return ((Hmys) obj).tF;
    }

    /* renamed from: ثﻭذﺩ  reason: contains not printable characters */
    public static String m745(Object obj, Object obj2) {
        int i = 802 ^ C0052.f110;

        return ((Hmys) obj).M((String) obj2);
    }

    /* renamed from: جشﺥﺎ  reason: contains not printable characters */
    public static JSONArray m746(Object obj, Object obj2, Object obj3) {
        int i = (-1021) ^ C0026.f84;

        return ((Hmys) obj).KJ((String) obj2, (HashMap) obj3);
    }

    /* renamed from: ذفصط  reason: contains not printable characters */
    public static boolean m747(Object obj) {
        int i = 284 ^ C0041.f99;

        return ((Hmys) obj).G;
    }

    /* renamed from: رذﻝم  reason: contains not printable characters */
    public static InputStream m748(Object obj) {
        int i = (-767) ^ C0037.f95;

        return ((ResponseBody) obj).byteStream();
    }

    /* renamed from: زﺥﻱـ  reason: contains not printable characters */
    public static String m749(Object obj) {
        int i = (-556) ^ C0004.f4;

        return ((Hmys) obj).N;
    }

    /* renamed from: سﺝبث  reason: contains not printable characters */
    public static Object[] m750(Object obj, Object obj2, Object obj3) {
        int i = (-31) ^ C0041.f99;

        return zH((String) obj, (String) obj2, (String) obj3);
    }

    /* renamed from: طﺫوﺥ  reason: contains not printable characters */
    public static String m751(Object obj) {
        int i = 125 ^ C0037.f95;

        return ((Hmys) obj).Gc;
    }

    /* renamed from: ظﺏخد  reason: contains not printable characters */
    public static String m752(Object obj) {
        int i = (-26) ^ C0033.f91;

        return ((Hmys) obj).q;
    }

    /* renamed from: غاﻝﺝ  reason: contains not printable characters */
    public static Object[] m753(Object obj, Object obj2, Object obj3) {
        int i = 658 ^ C0029.f87;

        return i((String) obj, (String) obj2, (String) obj3);
    }

    /* renamed from: غﻭمت  reason: contains not printable characters */
    public static String m754(Object obj) {
        int i = 515 ^ C0028.f86;

        return ((Hmys) obj).B;
    }

    /* renamed from: غﻭوﺱ  reason: contains not printable characters */
    public static String m755(Object obj) {
        int i = (-1021) ^ C0026.f84;

        return ((Hmys) obj).xa;
    }

    /* renamed from: ـتمﻡ  reason: contains not printable characters */
    public static String m756(Object obj) {
        int i = 293 ^ C0009.f9;

        return ((Hmys) obj).F5;
    }

    /* renamed from: ـﻭﺱم  reason: contains not printable characters */
    public static String m757(Object obj) {
        int i = (-886) ^ C0021.f79;

        return dT(obj);
    }

    /* renamed from: كﺎذﺕ  reason: contains not printable characters */
    public static OkHttpClient m758(int i) {
        int i2 = (-732) ^ f2;

        if (i2 > 0) {
            return null;
        } else {
            return C0068Pe.yq(i);
        }
    }

    /* renamed from: لكﺱﺏ  reason: contains not printable characters */
    public static JSONObject m759(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 753 ^ C0000.f0;

        return ((Hmys) obj).q((String) obj2, (HashMap) obj3, (String) obj4);
    }

    /* renamed from: ماﻝﺭ  reason: contains not printable characters */
    public static String m760(Object obj) {
        int i = (-448) ^ C0025.f83;

        return ((Hmys) obj).SN;
    }

    /* renamed from: هصكخ  reason: contains not printable characters */
    public static String m761(Object obj) {
        int i = 658 ^ C0029.f87;

        return ((Hmys) obj).Gd;
    }

    /* renamed from: ﺏيﻙم  reason: contains not printable characters */
    public static String m762(Object obj) {
        int i = (-388) ^ C0035.f93;

        return ((Hmys) obj).i;
    }

    /* renamed from: ﺏﺵﻙر  reason: contains not printable characters */
    public static Headers m763(Object obj) {
        int i = (-404) ^ C0021.f79;

        return ((Response) obj).headers();
    }

    /* renamed from: ﺏﻍﺎا  reason: contains not printable characters */
    public static void m764(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 658 ^ C0029.f87;

        C0068Pe.tF((OkHttpClient) obj, (String) obj2, (Map) obj3, (AbstractC0181tM) obj4);
        int i4 = 923 ^ C0041.f99;

        return;
    }

    /* renamed from: ﺕﺩذت  reason: contains not printable characters */
    public static String m765(Object obj) {
        int i = 658 ^ C0029.f87;

        return ((Hmys) obj).v;
    }

    /* renamed from: ﺙﺎرﻕ  reason: contains not printable characters */
    public static String m766(Object obj) {
        int i = (-31) ^ C0006.f6;

        return ((Hmys) obj).yq;
    }

    /* renamed from: ﺝﺕﺎه  reason: contains not printable characters */
    public static String m767(Object obj, Object obj2, Object obj3) {
        int i = (-422) ^ C0033.f91;

        return ((Hmys) obj).B((String) obj2, (HashMap) obj3);
    }

    /* renamed from: ﺝﺥﺙﻕ  reason: contains not printable characters */
    public static String m768(Object obj, Object obj2) {
        int i = 498 ^ C0002.f2;

        return ((Headers) obj).get((String) obj2);
    }

    /* renamed from: ﺭنخث  reason: contains not printable characters */
    public static String m769(Object obj) {
        int i = 706 ^ C0003.f3;

        return ((Hmys) obj).g9;
    }

    /* renamed from: ﺭﻩكز  reason: contains not printable characters */
    public static boolean m770(Object obj) {
        int i = 938 ^ C0033.f91;

        return ((Hmys) obj).G4;
    }

    /* renamed from: ﺱصتك  reason: contains not printable characters */
    public static void m771(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = (-821) ^ C0025.f83;

        C0068Pe.G((OkHttpClient) obj, (String) obj2, (Map) obj3, (Map) obj4, (AbstractC0181tM) obj5);
        return;
    }

    /* renamed from: ﺱقـم  reason: contains not printable characters */
    public static String m772(Object obj) {
        int i = (-185) ^ C0033.f91;

        return ((Hmys) obj).M;
    }

    /* renamed from: ﺵﺫﻱم  reason: contains not printable characters */
    public static String m774(Object obj) {
        int i = (-406) ^ C0053.f111;

        return ((Hmys) obj).Nl;
    }

    /* renamed from: ﺽجدح  reason: contains not printable characters */
    public static String m775(Object obj) {
        int i = 57 ^ C0032.f90;

        return ((Hmys) obj).t0;
    }

    /* renamed from: ﺽﺹﻡغ  reason: contains not printable characters */
    public static int m776(Object obj) {
        int i = (-767) ^ C0037.f95;

        return ((Response) obj).code();
    }

    /* renamed from: ﺽﻍطﻝ  reason: contains not printable characters */
    public static String m777(Object obj) {
        int i = 909 ^ C0002.f2;

        return ((Hmys) obj).ee;
    }

    /* renamed from: ﻁﺩﺯز  reason: contains not printable characters */
    public static String m778(Object obj, Object obj2) {
        int i = (-26) ^ C0033.f91;

        return ((Hmys) obj).G4((String) obj2);
    }

    /* renamed from: ﻅاﻡﻱ  reason: contains not printable characters */
    public static String m779(Object obj) {
        int i = (-314) ^ C0002.f2;

        return ((Hmys) obj).dT;
    }

    /* renamed from: ﻅﻉظﻡ  reason: contains not printable characters */
    public static void m780(Object obj) {
        int i = 354 ^ C0026.f84;

        ((Hmys) obj).SN();
        return;
    }

    /* renamed from: ﻉذدﻡ  reason: contains not printable characters */
    public static JSONObject m781(Object obj, Object obj2) {
        int i = 697 ^ C0024.f82;

        return ((Hmys) obj).t0((JSONObject) obj2);
    }

    /* renamed from: ﻍﺯﺩﻡ  reason: contains not printable characters */
    public static String m782(Object obj, Object obj2) {
        int i = 284 ^ C0041.f99;

        return ((Hmys) obj).yq((String) obj2);
    }

    /* renamed from: ﻙاهخ  reason: contains not printable characters */
    public static String m783(Object obj) {
        int i = (-821) ^ C0025.f83;

        return ((Hmys) obj).v3;
    }

    /* renamed from: ﻭﺙحﺡ  reason: contains not printable characters */
    public static String m784(Object obj) {
        int i = (-422) ^ C0033.f91;

        return ((Hmys) obj).zH;
    }

    /* renamed from: ﻭﺱغﺩ  reason: contains not printable characters */
    public static ResponseBody m785(Object obj) {
        int i = (-985) ^ C0024.f82;

        return ((Response) obj).body();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        int i = 1;
        String str3 = "";
        try {
            boolean z2 = ("-100".equals(str));

            if (!z2) {
                boolean z3 = (TextUtils.isEmpty(str2));
                if (z3) {
                    str2 = "1";
                }
                int i4 = (Integer.parseInt(str2));
                if (i4 > 0) {
                    i = i4;
                } else {
                    i = i4;
                }
                if (!(hashMap != null)) {
                    hashMap = new HashMap<>();
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("pn",(String.valueOf(i)));
                hashMap2.put("type_id",str);
                hashMap2.put("tag_type",str3);
                hashMap2.put("type",str3);
                hashMap2.put("area",str3);
                hashMap2.put("sort",str3);
                hashMap2.put("year",str3);
                Iterator it = ((hashMap.entrySet()).iterator());
                while (true) {
                    boolean z4 = (it.hasNext());
                    if (z4) {
                        Map.Entry entry = (Map.Entry) (it.next());
                        Object obj = (entry.getValue());
                        if (obj != null) {
                            boolean z6 = ((String) (entry.getValue()).isEmpty());
                            if (!z6) {
                                boolean z7 = ("全部".equals((entry.getValue())));
                                if (!z7) {
                                    hashMap2.put((String) (entry.getKey()),(String) (entry.getValue()));
                                }
                            }
                        }
                    } else {
                        JSONArray jSONArray = m746(this, m782(this, m765(this)), hashMap2);
                        JSONArray jSONArray2 = new JSONArray();
                        int i8 = 0;
                        while (true) {
                            int i9 = (jSONArray.length());
                            if (i8 < i9) {
                                JSONObject jSONObject2 = m781(this, (jSONArray.getJSONObject(i8)));
                                boolean z5 = (TextUtils.isEmpty((jSONObject2.optString("vod_id"))));
                                if (!z5) {
                                    jSONArray2.put(jSONObject2);
                                }
                                i8++;
                            } else {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("page",i);
                                String str4 = "pagecount";
                                int i11 = (jSONArray2.length());
                                if (i11 != 0) {
                                    i++;
                                } else {
                                    i++;
                                }
                                jSONObject.put(str4,i);
                                jSONObject.put("limit",20);
                                jSONObject.put("total",Integer.MAX_VALUE);
                                jSONObject.put("list",jSONArray2);
                                return (jSONObject.toString());
                            }
                        }
                    }
                }
            } else {
                return (this.homeVideoContent());
            }
        } catch (Exception e) {
            m736(e);
            return str3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0219, code lost:
    r8 = (r7.length());
    r1 = 1864;
    */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x021f, code lost:
    r1 = r1 ^ 1881;
    */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0221, code lost:
    switch(r1) {
        case 17: goto L61;
        case 47384: goto L60;
        case 47417: goto L63;
        case 47483: goto L62;
        default: goto L64;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0225, code lost:
    if (r3 >= r8) goto L65;
    */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0227, code lost:
    r1 = 48736;
    */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x022b, code lost:
    r1 = 48705;
    */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x022f, code lost:
    r1 = (r7.getJSONObject(r3));
    r8 = (r1.optString("title"));
    r9 = m757((r1.opt(r11)));
    r1 = (r1.optString("vod_token"));
    r10 = new java.lang.StringBuilder();
    r10.append(r8);
    r10.append("$");
    r10.append(r9);
    r10.append(r13);
    r10.append(r1);
    r10.append(r13);
    r10.append(r6);
    r10.append(r13);
    r10.append(r4);
    r5.add((r10.toString()));
    r3 = r3 + 1;
    r3 = 48767;
    */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x029b, code lost:
    r3 = r3 ^ 48784;
    */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x029f, code lost:
    switch(r3) {
        case 14: goto L71;
        case 239: goto L72;
        default: goto L73;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02a3, code lost:
    r3 = 48798;
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r19) {
        /*
        Method dump skipped, instructions count: 820
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        String str;
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = m746(this, m782(this, m783(this)), new HashMap());
            String str3 = m756(this);
            HashSet hashSet = new HashSet();
            boolean z2 = (TextUtils.isEmpty(str3));
            int i = 0;

            if (!z2) {
                String[] strArr = (str3.split("\\|"));
                int length = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        String str4 = strArr[i4];
                        boolean z3 = (TextUtils.isEmpty(str4));
                        if (!z3) {
                            hashSet.add(str4);
                        }
                        i4++;
                    }
                }
            } else {
                String[] strArr = (str3.split("\\|"));
                int length = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        String str4 = strArr[i4];
                        boolean z3 = (TextUtils.isEmpty(str4));
                        if (!z3) {
                            hashSet.add(str4);
                        }
                        i4++;
                    }
                }
            }
            while (true) {
                int i8 = (jSONArray2.length());

                if (i < i8) {
                    JSONObject jSONObject3 = (jSONArray2.getJSONObject(i));
                    String str5 = (jSONObject3.optString("name"));
                    boolean z4 = (TextUtils.isEmpty(str5));
                    if (z4) {
                        str = str2;
                    } else {
                        str = ((str5.replaceAll("[\\p{So}\\p{Cn}]",str2)).trim());
                    }
                    boolean z5 = ("待添加".equals(str));
                    if (!z5) {
                        boolean z6 = (TextUtils.isEmpty(str));
                        if (!z6) {
                            boolean z7 = (hashSet.contains(str));
                            if (!(z7)) {
                                String str6 = m757((jSONObject3.opt("id")));
                                boolean z8 = (TextUtils.isEmpty(str6));
                                if (!(z8)) {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("type_id",str6);
                                    jSONObject4.put("type_name",str);
                                    jSONArray.put(jSONObject4);
                                    if (z) {
                                        JSONArray jSONArray3 = m737(this, (jSONObject3.optJSONArray("msg")));
                                        int i17 = (jSONArray3.length());
                                        if (i17 > 0) {
                                            jSONObject2.put(str6,jSONArray3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i++;
                } else {
                    jSONObject.put("class",jSONArray);
                    if (z) {
                        int i23 = (jSONObject2.length());
                        if (!(i23 <= 0)) {
                            jSONObject.put("filters",jSONObject2);
                        }
                    }
                    return (jSONObject.toString());
                }
            }
        } catch (Throwable th) {
            m736(th);
            return str2;
        }
    }

    public String homeVideoContent() {
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            HashMap hashMap = new HashMap();
            hashMap.put("pn","1");
            hashMap.put("psize","100");
            String str2 = "channel_id";
            boolean z = m747(this);

            if (!z) {
                str = m752(this);
            } else {
                str = m754(this);
                str = m752(this);
            }
            hashMap.put(str2,str);
            JSONArray jSONArray2 = (m759(this, m782(this, m743(this)), hashMap, null).optJSONArray("result"));
            String str3 = "list";

            if (jSONArray2 != null) {
                int i4 = 0;
                while (true) {
                    int i5 = (jSONArray2.length());
                    if (i4 < i5) {
                        JSONArray jSONArray3 = ((jSONArray2.getJSONObject(i4)).optJSONArray("block_list"));
                        if (!(jSONArray3 == null)) {
                            int i8 = 0;
                            while (true) {
                                int i9 = (jSONArray3.length());
                                if (i8 < i9) {
                                    JSONObject jSONObject = (jSONArray3.getJSONObject(i8));
                                    JSONObject jSONObject2 = (jSONObject.optJSONObject("vod_info"));
                                    String str4 = "vod_id";
                                    if (jSONObject2 != null) {
                                        int i12 = (jSONArray.length());
                                        if (i12 < 30) {
                                            JSONObject jSONObject3 = m781(this, jSONObject2);
                                            String str5 = (jSONObject.optString("banner_pic"));
                                            boolean z2 = (TextUtils.isEmpty(str5));
                                            if (!z2) {
                                                jSONObject3.put("vod_pic",str5);
                                            }
                                            boolean z3 = (TextUtils.isEmpty((jSONObject3.optString(str4))));
                                            if (!z3) {
                                                jSONArray.put(jSONObject3);
                                            }
                                        }
                                    }
                                    JSONArray jSONArray4 = (jSONObject.optJSONArray("vod_list"));
                                    if (!(jSONArray4 == null)) {
                                        int i17 = 0;
                                        while (true) {
                                            int i18 = (jSONArray4.length());
                                            if (i17 < i18) {
                                                int i20 = (jSONArray.length());
                                                if (i20 < 30) {
                                                    JSONObject jSONObject4 = m781(this, (jSONArray4.getJSONObject(i17)));
                                                    boolean z4 = (TextUtils.isEmpty((jSONObject4.optString(str4))));
                                                    if (!z4) {
                                                        jSONArray.put(jSONObject4);
                                                    }
                                                    i17++;
                                                }
                                            }
                                        }
                                    }
                                    i8++;
                                }
                            }
                        }
                        i4++;
                    } else {
                        return ((new JSONObject().put(str3,jSONArray)).toString());
                    }
                }
            } else {
                return ((new JSONObject().put(str3,jSONArray)).toString());
            }
        } catch (Exception e) {
            m736(e);
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 472
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public void init(android.content.Context r32, java.lang.String r33) {
        /*
        Method dump skipped, instructions count: 2318
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Hmys.init(android.content.Context, java.lang.String):void");
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = "UTF-8";
        String str4 = "";
        C0029.m1662();
        C0056.m2351(true);
        JSONObject jSONObject = new JSONObject();
        try {
            String[] strArr = (str2.split("@@@",-1));
            int length = strArr.length;

            if (length < 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("bad play id: ");
                sb2.append(str2);
                throw new Exception((sb2.toString()));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("vod_id",strArr[3]);
                hashMap.put("sig",str4);
                hashMap.put("nc_token",str4);
                hashMap.put("code",str4);
                hashMap.put("phone",str4);
                hashMap.put("session_id",str4);
                hashMap.put("cur_time",strArr[2]);
                hashMap.put("vod_token",strArr[1]);
                hashMap.put("collection_id",strArr[0]);
                JSONObject jSONObject2 = m759(this, m782(this, m777(this)), hashMap, "result");
                String str5 = m778(this, (jSONObject2.optString("vod_url")));
                String str6 = (jSONObject2.optString("ck"));
                boolean z = (TextUtils.isEmpty((jSONObject2.optString("check_url",(jSONObject2.optString("check_page_url"))))));
                String str7 = "url";
                String str8 = "parse";
                if (z) {
                    if (!(str5 == null)) {
                        boolean z2 = (str5.endsWith(".mp4"));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(ProxyOrigin.getUrl());
                    sb.append("?do=hmys&type=m3u8&url=");
                    sb.append(C0034.m1790((str5.getBytes(StandardCharsets.UTF_8)), 10));
                    sb.append("&ck=");
                    sb.append(C0009.m260(str6, str3));
                    sb.append("&sign=");
                    sb.append(C0009.m260(m742(this), str3));
                    String str9 = (sb.toString());
                    jSONObject.put(str8,0);
                    jSONObject.put(str7,str9);
                    jSONObject.put("playUrl",str4);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("User-Agent","Mozi");
                    jSONObject3.put("Accept","*/*");
                    jSONObject.put("header",(jSONObject3.toString()));
                    jSONObject.put("danmaku",C0033.m1778(str9));
                }
                jSONObject.put(str8,0);
                jSONObject.put(str7,str4);
                jSONObject.put("msg","请退出播放页面，重新验证码");
                return (jSONObject.toString());
            }
        } catch (Exception e) {
            m736(e);
        }
        return (jSONObject.toString());
    }

    public void regLogin() {
        String str;
        String str2;
        String str3;
        int i = 0;
        String str4 = "";
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("invited_by",str4);
            String str5 = "is_install";
            boolean z = m747(this);

            if (!z) {
                str = "1";
            } else {
                str = "0";
                str = "1";
            }
            hashMap.put(str5,str);
            String str6 = "ua";
            StringBuilder sb = new StringBuilder();
            (sb.append("Mozilla/5.0 (Linux; Android 12; ");
                sb.append(Build.MODEL);
                sb.append(" Build/SKQ1.211113.001; wv)) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/97.0.4692.98 Mobile Safari/537.36");
                hashMap.put(str6,(sb.toString()));
                JSONObject jSONObject = m759(this, m784(this), hashMap, "result");
                JSONObject jSONObject2 = (jSONObject.optJSONObject("user_info"));

                if (jSONObject2 == null) {
                    throw new Exception("no user_info");
                } else {
                    int i5 = (jSONObject2.optInt("user_id",0));
                    if (i5 == 0) {
                        throw new Exception("注册失败，用流量重试一次即可");
                    } else {
                        this.Nl = (jSONObject2.optString("token"));
                        boolean z2 = m770(this);
                        if (z2) {
                            JSONObject jSONObject3 = (jSONObject.optJSONObject("sys_conf"));
                            if (jSONObject3 != null) {
                                str2 = (jSONObject3.optString("api_url"));
                            } else {
                                str2 = str4;
                                str2 = (jSONObject3.optString("api_url"));
                            }
                            boolean z3 = (TextUtils.isEmpty(str2));
                            if (!(z3)) {
                                this.tF = m740(str2);
                            }
                        }
                        boolean z4 = (TextUtils.isEmpty(m744(this)));
                        if (z4) {
                            boolean z5 = (m784(this).startsWith("http"));
                            if (z5) {
                                int i13 = (m784(this).indexOf("/api/"));
                                if (i13 <= 0) {
                                    str3 = m784(this);
                                } else {
                                    str3 = (m784(this).substring(0,i13));
                                    str3 = m784(this);
                                }
                                this.tF = m740(str3);
                            }
                        }
                        "HideHmys";
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("user init ok tokenLen=");
                        String str7 = m774(this);
                        if (str7 != null) {
                            i = (str7.length());
                        } else {
                            i = (str7.length());
                        }
                        sb2.append(i);
                        sb2.append(" api=");
                        sb2.append(m744(this));
                        sb2.append(" v2=");
                        sb2.append(m747(this));
                        sb2.toString();
                        throw new Exception("注册失败，用流量重试一次即可");
                    }
                    throw new Exception("no user_info");
                }
            } catch (Exception e) {
                e.printStackTrace();
                m736(e);
            }

            return;
        }

        public String searchContent(String str, boolean z) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("pn","1");
                hashMap.put("kw",str);
                JSONArray jSONArray = m746(this, m782(this, m769(this)), hashMap);
                JSONArray jSONArray2 = new JSONArray();
                int i = 0;
                while (true) {
                    int i2 = (jSONArray.length());

                    if (i < i2) {
                        JSONObject jSONObject = (jSONArray.getJSONObject(i));
                        String str2 = (jSONObject.optString("vod_name"));
                        boolean z2 = (TextUtils.isEmpty(str));
                        if (!z2) {
                            boolean z3 = (str2.contains(str));
                        }
                        boolean z4 = C0010.m289(str2);
                        if (!(z4)) {
                            JSONObject jSONObject2 = m781(this, jSONObject);
                            boolean z5 = (TextUtils.isEmpty((jSONObject2.optString("vod_id"))));
                            if (!z5) {
                                jSONArray2.put(jSONObject2);
                            }
                        }
                        i++;
                    } else {
                        return ((new JSONObject().put("list",jSONArray2)).toString());
                    }
                }
            } catch (Exception e) {
                m736(e);
                return "";
            }
        }
    }
