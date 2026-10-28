package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0080aF;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.RQ;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Cloud_baidu extends Spider {
    public static boolean i = false;

    private static String zH = "";
    private final Pattern yq = C0005.m166("/s/([^/]+)\\?pwd=([^/]+)");
    private final Pattern SN = C0005.m166("提取码:([^/]+)");
    private final Pattern N = C0005.m166("pan.baidu.com/.*?\\?surl=([^/]+)&pwd=([^/]+)");
    private final Pattern tF = C0005.m166("/s/([^\\?]+)");

    public Cloud_baidu() {
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        break;
                    
                case 204:
                    return;
                case 239:
                    return;
            }
            i3 = 1678;
        }
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = (String) (map.get("type"));
        boolean z = (str.equals("sub"));
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return (RQ.xa().Q4(map));
                case 239:
                    boolean z2 = (str.equals("302"));
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (!z2) {
                                    break;
                                } else {
                                    i3 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                boolean z3 = (str.equals("input"));
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i4 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            return null;
                                        case 47417:
                                            return (RQ.xa().RQ(map));
                                        case 47483:
                                            break;
                                    }
                                    i4 = 48705;
                                }
                                break;
                            case 500:
                                return (RQ.xa().lF());
                        }
                        i3 = 1802;
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    public static Object[] proxys(Map<String, String> map, Map<String, String> map2, String str) {
        RQ rq = null;
        Object[] objArr = null;
                // [deflattened] 控制流平坦化已还原为线性代码
        rq = RQ.xa();
        objArr = (rq.C(map2));
        return objArr;
}

    /* renamed from: سخﺫﺽ  reason: contains not printable characters */
    public static String m703() {
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return zH;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: عﻙﺝﺏ  reason: contains not printable characters */
    public static Pattern m704(Object obj) {
        int i2 = 697 ^ C0024.f82;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Cloud_baidu) obj).tF;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: وﻉﻱت  reason: contains not printable characters */
    public static Pattern m705(Object obj) {
        int i2 = (-31) ^ C0041.f99;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Cloud_baidu) obj).SN;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: يذﻉا  reason: contains not printable characters */
    public static Pattern m706(Object obj) {
        int i2 = (-388) ^ C0035.f93;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Cloud_baidu) obj).N;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    /* renamed from: ﻁﺝﻉر  reason: contains not printable characters */
    public static Pattern m707(Object obj) {
        int i2 = (-914) ^ C0004.f4;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        i3 = 1709;
                        continue;
                    
                case 204:
                    return ((Cloud_baidu) obj).yq;
                case 239:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
            i3 = 1678;
        }
    }

    public String detailContent(List<String> list) {
        ME me = (this.detailVideo(list));
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (me != null) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return "";
                case 239:
                    return C0000.m21(me);
            }
            i2 = 1678;
        }
    }

    public ME detailVideo(List<String> list) {
        String str;
        String str2;
        boolean z = C0020.m1370((C0015.m439(RQ.xa()).N()));
        String str3 = "";
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    zH = str3;
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        String str4 = ((String) (list.get(0)).trim());
        boolean z2 = (str4.contains("提取码"));
        int i3 = 1740;
        while (true) {
            i3 ^= 1757;
            switch (i3) {
                case 17:
                    if (!z2) {
                        break;
                    } else {
                        i3 = 1833;
                        continue;
                    }
                case 54:
                    break;
                case 471:
                    break;
                case 500:
                    Matcher matcher = (m704(this).matcher(str4));
                    boolean z3 = (matcher.find());
                    int i4 = 1864;
                    while (true) {
                        i4 ^= 1881;
                        switch (i4) {
                            case 17:
                                if (!z3) {
                                    break;
                                } else {
                                    i4 = 48736;
                                    continue;
                                }
                            case 47384:
                                str = str3;
                                break;
                            case 47417:
                                str = (matcher.group(1));
                                int i5 = 48767;
                                while (true) {
                                    i5 ^= 48784;
                                    switch (i5) {
                                        case 14:
                                            break;
                                        case 239:
                                            i5 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                        }
                        i4 = 48705;
                    }
                    Matcher matcher2 = (m705(this).matcher(str4));
                    boolean z4 = (matcher2.find());
                    int i6 = 48891;
                    while (true) {
                        i6 ^= 48908;
                        switch (i6) {
                            case 22:
                                break;
                            case 53:
                                str2 = str3;
                                break;
                            case 503:
                                if (!z4) {
                                    break;
                                } else {
                                    i6 = 49635;
                                    continue;
                                }
                            case 32495:
                                str2 = (matcher2.group(1));
                                int i7 = 49666;
                                while (true) {
                                    i7 ^= 49683;
                                    switch (i7) {
                                        case 17:
                                            i7 = 49697;
                                            break;
                                        case 50:
                                            break;
                                    }
                                }
                                break;
                        }
                        i6 = 48953;
                    }
                    boolean z5 = (str.isEmpty());
                    int i8 = 49790;
                    while (true) {
                        i8 ^= 49807;
                        switch (i8) {
                            case 18:
                                break;
                            case 51:
                                break;
                            case 84:
                                boolean z6 = (str2.isEmpty());
                                int i9 = 49914;
                                while (true) {
                                    i9 ^= 49931;
                                    switch (i9) {
                                        case 497:
                                            if (z6) {
                                                break;
                                            } else {
                                                i9 = 50658;
                                                continue;
                                            }
                                        case 1711:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            return (RQ.xa().m(str,str2));
                                    }
                                    i9 = 50627;
                                }
                                break;
                            case 241:
                                if (z5) {
                                    break;
                                } else {
                                    i8 = 49883;
                                    continue;
                                }
                        }
                        i8 = 49852;
                    }
                    break;
            }
            i3 = 1802;
        }
        Matcher matcher3 = (m707(this).matcher(str4));
        boolean z7 = (matcher3.find());
        int i10 = 50689;
        while (true) {
            i10 ^= 50706;
            switch (i10) {
                case 19:
                    if (!z7) {
                        break;
                    } else {
                        i10 = 50782;
                        continue;
                    }
                case 45:
                    Matcher matcher4 = (m706(this).matcher(str4));
                    boolean z8 = (matcher4.find());
                    int i11 = 50813;
                    while (true) {
                        i11 ^= 50830;
                        switch (i11) {
                            case 18:
                                break;
                            case 53:
                                Matcher matcher5 = (m704(this).matcher(str4));
                                boolean z9 = (matcher5.find());
                                int i12 = 51588;
                                while (true) {
                                    i12 ^= 51605;
                                    switch (i12) {
                                        case 17:
                                            if (!z9) {
                                                break;
                                            } else {
                                                i12 = 51681;
                                                continue;
                                            }
                                        case 54:
                                            break;
                                        case 87:
                                            return null;
                                        case 116:
                                            return (RQ.xa().m((matcher5.group(1)),str3));
                                    }
                                    i12 = 51650;
                                }
                                break;
                            case 243:
                                if (!z8) {
                                    break;
                                } else {
                                    i11 = 51557;
                                    continue;
                                }
                            case 4075:
                                StringBuilder sb = C0052.m2253("1");
                                (sb.append((matcher4.group(1))));
                                return (RQ.xa().m((sb.toString()),(matcher4.group(2))));
                        }
                        i11 = 50875;
                    }
                    break;
                case 50:
                    break;
                case 76:
                    return (RQ.xa().m((matcher3.group(1)),(matcher3.group(2))));
            }
            i10 = 50751;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x020e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Cloud_baidu.init(android.content.Context, java.lang.String):void");
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3 = "[智无限存]";
        String str4 = "";
        try {
            boolean z = Cloud_baidu.i;
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (z) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        boolean z2 = C0020.m1370((C0015.m439(RQ.xa()).N()));
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (z2) {
                                        break;
                                    } else {
                                        i3 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean z3 = (RQ.xa().F5());
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                if (!z3) {
                                                    break;
                                                } else {
                                                    i4 = 48736;
                                                    continue;
                                                }
                                            case 47384:
                                                i = true;
                                                return (C0007.m215("未扫码授权无法播放，刚已扫码的请刷新").toString());
                                            case 47417:
                                                boolean z4 = C0013.m396(RQ.xa());
                                                int i5 = 48767;
                                                while (true) {
                                                    i5 ^= 48784;
                                                    switch (i5) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            break;
                                                        case 76:
                                                            long j = System.currentTimeMillis() / 1000;
                                                            long j2 = (C0030.m1673(RQ.xa()).tF());
                                                            int i6 = 48891;
                                                            while (true) {
                                                                i6 ^= 48908;
                                                                switch (i6) {
                                                                    case 22:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 503:
                                                                        if (j <= j2) {
                                                                            break;
                                                                        } else {
                                                                            i6 = 49635;
                                                                            continue;
                                                                        }
                                                                    case 32495:
                                                                        boolean z5 = C0020.m1370((C0015.m439(RQ.xa()).t0()));
                                                                        int i7 = 49666;
                                                                        while (true) {
                                                                            i7 ^= 49683;
                                                                            switch (i7) {
                                                                                case 17:
                                                                                    if (z5) {
                                                                                        break;
                                                                                    } else {
                                                                                        i7 = 49759;
                                                                                        continue;
                                                                                    }
                                                                                case 50:
                                                                                    break;
                                                                                case 76:
                                                                                    (RQ.xa().w());
                                                                                    break;
                                                                                case 83:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i7 = 49728;
                                                                        }
                                                                    default:
                                                                        continue;
                                                                }
                                                                i6 = 48953;
                                                            }
                                                            (RQ.xa().ee(C0046.m2126(RQ.xa())));
                                                            break;
                                                        case 239:
                                                            if (z4) {
                                                                break;
                                                            } else {
                                                                i5 = 48860;
                                                                continue;
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                    i5 = 48829;
                                                }
                                                i = true;
                                                int i8 = 49790;
                                                while (true) {
                                                    i8 ^= 49807;
                                                    switch (i8) {
                                                        case 18:
                                                            break;
                                                        case 241:
                                                            i8 = 49821;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i4 = 48705;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 1802;
                        }
                        break;
                    case 239:
                        break;
                    default:
                        continue;
                }
                i2 = 1678;
            }
            boolean z6 = C0020.m1370((C0015.m439(RQ.xa()).N()));
            int i9 = 49914;
            while (true) {
                i9 ^= 49931;
                switch (i9) {
                    case 497:
                        if (!z6) {
                            break;
                        } else {
                            i9 = 50658;
                            continue;
                        }
                    case 1711:
                        break;
                    case 1736:
                        break;
                    case 1769:
                        boolean z7 = ((m703().replaceAll(str3,str4)).equals((str.replaceAll(str3,str4))));
                        int i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    if (z7) {
                                        break;
                                    } else {
                                        i10 = 50782;
                                        continue;
                                    }
                                case 45:
                                    break;
                                case 50:
                                    break;
                                case 76:
                                    (RQ.xa().F5());
                                    zH = str;
                                    i = true;
                                    break;
                                default:
                                    continue;
                            }
                            i10 = 50751;
                        }
                    default:
                        continue;
                }
                i9 = 50627;
            }
            C0080aF.G4 = str;
            return (RQ.xa().R(str2,str));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            (sb.append(C0050.m2227(e)));
            (sb.append("---"));
            C0006.m194((sb.toString()));
            return str4;
        }
    }

    public void setFlag(String str) {
        zH = "";
        int i2 = 57 ^ C0032.f90;
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    
                        break;
                    
                case 204:
                    return;
                case 239:
                    return;
            }
            i3 = 1678;
        }
    }
}
