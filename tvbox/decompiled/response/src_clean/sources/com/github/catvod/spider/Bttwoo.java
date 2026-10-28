package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Va;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Bttwoo extends Spider {

    private String yq = "https://www.bttwo.life/";

    public Bttwoo() {
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        break;
                    
                case 204:
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    public static String encodePlayKey(String str) {
        String str2 = "0";
        boolean z = (str2.equals(str));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z2 = (str.isEmpty());
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z2) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                byte[] bArr = ("nbmovie2024secretkey".getBytes(StandardCharsets.UTF_8));
                                byte[] bArr2 = (str.getBytes(StandardCharsets.UTF_8));
                                byte[] bArr3 = new byte[bArr2.length];
                                int i3 = 0;
                                while (true) {
                                    int length = bArr2.length;
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                            case 45:
                                                return ((C0034.m1790(bArr3, 0).replace('+','-')).replace('/','_'));
                                            case 76:
                                                bArr3[i3] = (byte) (bArr[i3 % bArr.length] ^ bArr2[i3]);
                                                i3++;
                                                int i5 = 48891;
                                                while (true) {
                                                    i5 ^= 48908;
                                                    switch (i5) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i5 = 48922;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i4 = i3 < length ? 48860 : 48829;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i6 = 1864;
                                while (true) {
                                    i6 ^= 1881;
                                    switch (i6) {
                                        case 17:
                                            i6 = 48674;
                                            break;
                                        case 47483:
                                            return str2;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return str2;
            }
            i = 1678;
        }
    }

    private List yq(kB kBVar, String str) {
        Iterator it;
        hN hNVar;
        ArrayList arrayList = new ArrayList();
        try {
            it = (kBVar.iterator());
        } catch (Exception e) {
            m701(e);
        }
        while (true) {
            boolean z = (it.hasNext());
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                    case 49:
                        i = z ? 1709 : 1678;
                    case 204:
                        hN hNVar2 = (hN) (it.next());
                        int i2 = ((hNVar2.cS("span:contains(VIP)")).size());
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = i2 > 0 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    String str2 = ((C0000.m12("a[href*=play]", hNVar2).N("href")).substring(1));
                                    hN hNVar3 = C0000.m12("img.object-cover", hNVar2);
                                    String str3 = (hNVar3.N("data-src"));
                                    String str4 = (hNVar3.N("alt"));
                                    boolean z2 = C0010.m289(str4);
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                            case 45:
                                                String str5 = "";
                                                hN hNVar4 = null;
                                                boolean z3 = (str.equals("home"));
                                                int i5 = 49666;
                                                while (true) {
                                                    i5 ^= 49683;
                                                    switch (i5) {
                                                        case 17:
                                                            i5 = z3 ? 49759 : 49728;
                                                        case 50:
                                                        case 76:
                                                            hNVar4 = C0000.m12("span.text-right", hNVar2);
                                                            break;
                                                        case 83:
                                                            break;
                                                    }
                                                }
                                                boolean z4 = (str.equals("cate"));
                                                int i6 = 49790;
                                                while (true) {
                                                    i6 ^= 49807;
                                                    switch (i6) {
                                                        case 18:
                                                        case 51:
                                                            hNVar = hNVar4;
                                                            break;
                                                        case 84:
                                                            hNVar = C0000.m12("span.text-text-muted", hNVar2);
                                                            break;
                                                        case 241:
                                                            i6 = z4 ? 49883 : 49852;
                                                    }
                                                }
                                                int i7 = 49914;
                                                while (true) {
                                                    i7 ^= 49931;
                                                    switch (i7) {
                                                        case 497:
                                                            i7 = hNVar != null ? 50658 : 50627;
                                                        case 1711:
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            str5 = (hNVar.Fo());
                                                            break;
                                                    }
                                                }
                                                (arrayList.add(new ME(str2, str4, str3, str5)));
                                                int i8 = 50689;
                                                while (true) {
                                                    i8 ^= 50706;
                                                    switch (i8) {
                                                        case 19:
                                                            i8 = 50720;
                                                        case 50:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 76:
                                                int i9 = 48891;
                                                while (true) {
                                                    i9 ^= 48908;
                                                    switch (i9) {
                                                        case 22:
                                                            continue;
                                                        case 503:
                                                            i9 = 48922;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i4 = z2 ? 48860 : 48829;
                                        }
                                    }
                                    break;
                                case 500:
                                    int i10 = 1864;
                                    while (true) {
                                        i10 ^= 1881;
                                        switch (i10) {
                                            case 17:
                                                i10 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: هسثظ  reason: contains not printable characters */
    public static String m698(Object obj) {
        int i = 57 ^ C0032.f90;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Bttwoo) obj).yq;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﺽﻍثﻭ  reason: contains not printable characters */
    public static List m700(Object obj, Object obj2, Object obj3) {
        int i = (-185) ^ C0033.f91;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    return ((Bttwoo) obj).yq((kB) obj2, (String) obj3);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻅﺏصل  reason: contains not printable characters */
    public static void m701(Object obj) {
        int i = 658 ^ C0029.f87;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    
                        i2 = 1709;
                        continue;
                    
                case 204:
                    SpiderDebug.log((Throwable) obj);
                    return;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        try {
            StringBuilder sb = new StringBuilder();
            (sb.append(m698(this)));
            (sb.append(str));
            (sb.append(str2));
            kB kBVar = (C0004.m119(C0001.m32((sb.toString()), Rc.yq())).cS("div[data-vod-id]"));
            iX iXVar = new iX();
            (iXVar.b(m700(this, kBVar, "cate")));
            return (iXVar.toString());
        } catch (Exception e) {
            m701(e);
            return (new iX().toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0337, code lost:
        (r3.append((java.lang.CharSequence) (r2.next())));
        r4 = (r2.hasNext());
        r0 = 53510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0347, code lost:
        r0 = r0 ^ 53527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x034b, code lost:
        switch(r0) {
            case 17: goto L268;
            case 50: goto L269;
            case 83: goto L267;
            case 116: goto L270;
            default: goto L271;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x034f, code lost:
        if (r4 == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0351, code lost:
        r0 = 53603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0355, code lost:
        r0 = 53572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0359, code lost:
        (r3.append(r1));
        r0 = 53634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x035f, code lost:
        r0 = r0 ^ 53651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0363, code lost:
        switch(r0) {
            case 17: goto L279;
            case 50: goto L278;
            default: goto L280;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0367, code lost:
        r0 = 53665;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Bttwoo.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        try {
            Va va = C0004.m119(C0001.m32(m698(this), Rc.yq()));
            ArrayList arrayList = new ArrayList();
            (arrayList.add(new rP("filter?classify=1&page=", "电影")));
            (arrayList.add(new rP("filter?classify=2&page=", "电视剧")));
            (arrayList.add(new rP("filter?classify=3&page=", "动漫")));
            kB kBVar = (va.cS("div[class*=4xl:grid-cols-8] div[data-vod-id]"));
            iX iXVar = new iX();
            (iXVar.SN(arrayList));
            (iXVar.b(m700(this, kBVar, "home")));
            return (iXVar.toString());
        } catch (Exception e) {
            m701(e);
            return (new iX().toString());
        }
    }

    public void init(Context context, String str) {
        try {
            boolean z = C0020.m1370(str);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (z) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        String str2 = (new JSONObject(str).optString("siteUrl"));
                        boolean z2 = (str2.startsWith("http"));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (!z2) {
                                        break;
                                    } else {
                                        i2 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    return;
                                case 500:
                                    this.yq = str2;
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                break;
                                            case 47483:
                                                return;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Exception e) {
            m701(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = ":";
        try {
            C0029.m1662();
            boolean z = cn.yq;
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (z) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        C0056.m2351(true);
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            HashMap hashMap = C0009.m283(str2);
            String str4 = ((String) (hashMap.get("playUrl")).replace("play/",""));
            String str5 = (String) (hashMap.get("play_id"));
            String str6 = (String.valueOf(System.currentTimeMillis()));
            StringBuilder sb = new StringBuilder();
            (sb.append(str5));
            (sb.append(str3));
            (sb.append(str6));
            (sb.append(str3));
            (sb.append(str4));
            String str7 = (C0051.m2232((sb.toString()), str4).substring(0,32));
            String str8 = C0038.m1899((String) (hashMap.get("userlink")));
            StringBuilder sb2 = new StringBuilder();
            (sb2.append(m698(this)));
            (sb2.append("video/play?p=%s&v=%s&q=1080&s=%s&t=%s&k=%s"));
            JSONArray jSONArray = ((new JSONObject(C0001.m32((String.format((sb2.toString()),new Object[]{str5, str4, str7, str6, str8})), Rc.yq())).optJSONObject("data")).optJSONArray("quality_urls"));
            String str9 = ((jSONArray.getJSONObject((jSONArray.length()) - 1)).optString("url"));
            iX iXVar = new iX();
            (iXVar.g1(str9));
            return (iXVar.toString());
        } catch (Exception e) {
            m701(e);
            return (new iX().toString());
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            (sb.append(m698(this)));
            (sb.append("search?q="));
            (sb.append(str));
            kB kBVar = (C0004.m119(C0001.m32((sb.toString()), Rc.yq())).cS("div.group.relative"));
            iX iXVar = new iX();
            (iXVar.b(m700(this, kBVar, "search")));
            return (iXVar.toString());
        } catch (Exception e) {
            m701(e);
            return (new iX().toString());
        }
    }
}
