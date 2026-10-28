package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0051;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.merge.RQ;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Nh {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f60short = {1580, 499, 2866, 1227, 2221, 1220, 1482, 2957, 533, 2239, 1271, 913, 2887, 541, 1472, 2652, 2697, 2706, 2715, 2696, 2719, 2710, 2707, 2708, 2705, 1066, 1078, 1078, 1074, 1073, 1144, 1133, 1133, 1067, 1071, 1061, 1138, 1141, 1132, 1073, 1069, 1061, 1069, 1079, 1057, 1062, 1068, 1132, 1057, 1069, 1071, 1133, 1076, 1136, 1133, 1078, 1066, 1079, 1071, 1056, 1133, 1072, 1063, 1078, 1083, 1074, 1063, 1053, 1063, 1082, 1057, 1070, 1079, 1062, 1063, 1053, 1061, 1067, 1060, 1133, 1063, 1082, 1078, 1133, 1059, 1079, 1078, 1069, 1133, 1075, 1133, 1147, 1143, 1133, 1057, 1072, 1069, 1074, 1133, 1082, 1083, 1133, 1059, 1067, 1133, 1078, 1133, 1138, 1133, 1149, 1059, 1074, 1074, 1067, 1062, 1151, 1139, 1136, 1136, 1124, 1079, 1072, 1070, 1151, 1066, 1078, 1078, 1074, 1073, 1144, 1133, 1133, 1077, 1077, 1077, 1132, 1077, 1065, 1066, 1079, 1056, 1132, 1057, 1069, 1071, 1133, 1077, 1074, 1135, 1057, 1069, 1068, 1078, 1063, 1068, 1078, 1133, 1057, 1059, 1057, 1066, 1063, 1133, 1078, 1066, 1079, 1071, 1056, 1068, 1059, 1067, 1070, 1073, 1133, 1136, 1138, 1136, 1136, 1133, 1139, 1136, 1133, 1142, 1033, 1135, 1051, 1069, 1079, 1046, 1079, 1056, 1063, 1135, 1078, 1069, 1135, 1039, 1042, 1137, 1135, 1143, 1140, 1138, 1082, 1142, 1136, 1138, 1135, 1057, 1132, 1074, 1068, 1061, 651, 652, 658, 717, 2546, 2528, 2519, 2516, 2519, 2496, 2519, 2496, 2447, 2522, 2502, 2502, 2498, 2497, 2440, 2461, 2461, 2498, 2515, 2524, 2460, 2512, 2515, 2523, 2518, 2503, 2460, 2513, 2525, 2527, 2461, 2546, 2535, 2497, 2519, 2496, 2463, 2547, 2517, 2519, 2524, 2502, 2447, 2559, 2525, 2504, 2523, 2526, 2526, 2515, 2461, 2439, 2460, 2434, 2450, 2458, 2533, 2523, 2524, 2518, 2525, 2501, 2497, 2450, 2556, 2534, 2450, 2435, 2434, 2460, 2434, 2441, 2450, 2533, 2523, 2524, 2436, 2438, 2441, 2450, 2506, 2436, 2438, 2459, 2450, 2547, 2498, 2498, 2526, 2519, 2533, 2519, 2512, 2553, 2523, 2502, 2461, 2439, 2433, 2437, 2460, 2433, 2436, 2450, 2458, 2553, 2554, 2534, 2559, 2558, 2462, 2450, 2526, 2523, 2521, 2519, 2450, 2549, 2519, 2513, 2521, 2525, 2459, 2450, 2545, 2522, 2496, 2525, 2527, 2519, 2461, 2435, 2435, 2433, 2460, 2434, 2460, 2434, 2460, 2434, 2450, 2529, 2515, 2516, 2515, 2496, 2523, 2461, 2439, 2433, 2437, 2460, 2433, 2436, 2546, 2545, 2525, 2525, 2521, 2523, 2519, 2447};
    @SerializedName("isdir")
    private String B;
    @SerializedName("share_id")
    private String F5;
    @SerializedName("category")
    private int G;
    @SerializedName("md5")
    private String G4;
    @SerializedName("share_fid_token")
    private String Gc;
    @SerializedName("size")
    private long KJ;
    @SerializedName("path")
    private String M;
    @SerializedName("sub")
    private String N;
    @SerializedName("flag")
    private String SN;
    @SerializedName("seKey")
    private String W;
    @SerializedName("fs_id")
    private String dT;
    @SerializedName("thumbs")
    private JsonObject ee;
    @SerializedName("parent")
    private String g9;
    @SerializedName("shareUser")
    private String i;
    @SerializedName("server_filename")
    private String q;
    @SerializedName("sToken")
    private String t0;
    @SerializedName("vodName")
    private String tF;
    @SerializedName("pg")
    private String v;
    @SerializedName("uk")
    private String v3;
    @SerializedName("list")
    private List<Nh> yq;
    @SerializedName("surl")
    private String zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN {
        @SerializedName("pg")
        private String B;
        @SerializedName("parent")
        private String F5;
        @SerializedName("share_id")
        private String G;
        @SerializedName("uk")
        private String G4;
        @SerializedName("surl")
        private String Gc;
        @SerializedName("fs_id")
        private String KJ;
        @SerializedName("shareUser")
        private String M;
        @SerializedName("path")
        private String N;
        @SerializedName("fid")
        private String SN;
        @SerializedName("seKey")
        private String dT;
        @SerializedName("vodName")
        private String i;
        @SerializedName("pdir_fid")
        private String q;
        @SerializedName("sub")
        private String t0;
        @SerializedName("size")
        private long tF;
        @SerializedName("isdir")
        private String v3;
        @SerializedName("flag")
        private String yq;
        @SerializedName("server_filename")
        private String zH;

        public SN(Nh nh) {
            long j;
            this.yq = C0009.m269(nh);
            boolean z = C0054.m2307(C0026.m1571(nh));

            if (!z) {
                j = C0010.m288(C0026.m1571(nh));
            } else {
                j = 0;
                j = C0010.m288(C0026.m1571(nh));
            }
            this.tF = j;
            this.zH = C0014.m420(nh);
            this.i = C0030.m1675(nh);
            this.t0 = C0056.m2352(nh);
            this.Gc = C0009.m262(nh);
            this.KJ = C0009.m282(nh);
            this.M = C0033.m1759(nh);
            this.B = C0012.m372(nh);
            this.F5 = C0050.m2209(nh);
            this.N = C0010.m314(C0049.m2177(nh));
            this.G4 = C0023.m1455(nh);
            this.G = C0050.m2222(nh);
            this.dT = C0031.m1711(nh);
            this.v3 = C0036.m1835(nh);
            int i3 = C0004.m129();

            if (i3 < 0) {
                return;
            } else {
                System.out.println(C0033.m1775("Va"));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class yq extends TypeToken<List<Nh>> {
        yq() {
            int i = C0028.m1612();

            if (i < 0) {
                return;
            } else {
                System.out.println(Float.decode(C0030.m1663("6YvMQYAMvrSz")));
                return;
            }
        }
    }

    public Nh() {
        int i = C0011.m344();

        if (i > 0) {
            return;
        } else {
            System.out.println(Float.valueOf(C0033.m1775("UX3liqDSpk")));
            return;
        }
    }

    public static Nh OW(String str) {
        return (Nh) C0030.m1682(str, Nh.class);
    }

    public static String SN(Object obj) {
        return m1055(new Gson(), obj);
    }

    public static List<Nh> yq(String str) {
        String str2 = "ۡۥۨ";
        yq yqVar = null;
        Gson gson = null;
        Type type = null;
        Object obj = null;
        List<Nh> list = null;
        while (true) {
            switch (C0002.m76(str2)) {
                case 56296:
                type = m1047(yqVar);
                str2 = "ۤۤ";
                break;
                case 1746974:
                return list;
                case 1748804:
                yqVar = new yq();
                str2 = "۟ۧ";
                break;
                case 1749792:
                obj = m1059(gson, str, type);
                str2 = "ۥۧۡ";
                break;
                case 1752703:
                list = (List) obj;
                str2 = "۟ۨۧ";
                break;
                default:
                gson = new Gson();
                str2 = "ۢۦۤ";
                break;
            }
        }
    }

    /* renamed from: جﻉﺵـ  reason: contains not printable characters */
    public static long m1038(Object obj) {
        int i = C0011.m344();

        if (i < 0) {
            return 0L;
        } else {
            return ((Nh) obj).KJ;
        }
    }

    /* renamed from: حﺥﺩﺹ  reason: contains not printable characters */
    public static String m1039(Object obj) {
        int i = C0004.m129();

        if (i > 0) {
            return null;
        } else {
            return ((Nh) obj).B;
        }
    }

    /* renamed from: داﺙﺩ  reason: contains not printable characters */
    public static List m1040(Object obj) {
        int i = C0007.m214();

        if (i >= 0) {
            return null;
        } else {
            return ((Nh) obj).yq;
        }
    }

    /* renamed from: زﻕﺯﺭ  reason: contains not printable characters */
    public static String m1041(Object obj) {
        int i = C0002.m60();

        if (i >= 0) {
            return null;
        } else {
            return ((Nh) obj).M;
        }
    }

    /* renamed from: شﺎصﻱ  reason: contains not printable characters */
    public static String m1042(Object obj) {
        int i = C0000.m13();

        if (i <= 0) {
            return null;
        } else {
            return ((Nh) obj).q;
        }
    }

    /* renamed from: ضوشث  reason: contains not printable characters */
    public static String m1043(Object obj) {
        int i = C0040.m1954();

        if (i > 0) {
            return null;
        } else {
            return ((Nh) obj).g9;
        }
    }

    /* renamed from: طﻱصﻙ  reason: contains not printable characters */
    public static String m1044(Object obj) {
        int i = C0020.m1371();

        if (i > 0) {
            return null;
        } else {
            return ((Nh) obj).F5;
        }
    }

    /* renamed from: ظﺕﺽي  reason: contains not printable characters */
    public static JsonObject m1045(Object obj) {
        int i = C0026.m1561();

        if (i > 0) {
            return null;
        } else {
            return ((Nh) obj).ee;
        }
    }

    /* renamed from: عﻅﺫﻝ  reason: contains not printable characters */
    public static String m1046(Object obj) {
        int i = C0024.m1502();

        if (i <= 0) {
            return null;
        } else {
            return ((Nh) obj).dT;
        }
    }

    /* renamed from: غلقﺡ  reason: contains not printable characters */
    public static Type m1047(Object obj) {
        int i = C0051.m2229();

        if (i >= 0) {
            return null;
        } else {
            return ((TypeToken) obj).getType();
        }
    }

    /* renamed from: قﻩير  reason: contains not printable characters */
    public static String m1048(Object obj) {
        int i = C0033.m1755();

        if (i >= 0) {
            return null;
        } else {
            return ((Nh) obj).v3;
        }
    }

    /* renamed from: كدﻱت  reason: contains not printable characters */
    public static String m1049(Object obj) {
        int i = C0050.m2221();

        if (i > 0) {
            return null;
        } else {
            return ((Nh) obj).zH;
        }
    }

    /* renamed from: هطﺕﺭ  reason: contains not printable characters */
    public static String m1050(Object obj) {
        int i = C0037.m1870();

        if (i <= 0) {
            return null;
        } else {
            return ((Nh) obj).v;
        }
    }

    /* renamed from: ﺎثﺥـ  reason: contains not printable characters */
    public static JsonElement m1051(Object obj, Object obj2) {
        int i = C0027.m1588();

        if (i < 0) {
            return null;
        } else {
            return ((JsonObject) obj).get((String) obj2);
        }
    }

    /* renamed from: ﺕﻝاق  reason: contains not printable characters */
    public static RQ m1052() {
        int i = C0051.m2229();

        if (i > 0) {
            return null;
        } else {
            return RQ.tF.yq;
        }
    }

    /* renamed from: ﺙطصﺏ  reason: contains not printable characters */
    public static String m1053(Object obj) {
        int i = C0055.m2324();

        if (i <= 0) {
            return null;
        } else {
            return ((Nh) obj).N;
        }
    }

    /* renamed from: ﺙﻡغﻱ  reason: contains not printable characters */
    public static String m1054(Object obj) {
        int i = C0032.m1750();

        if (i > 0) {
            return null;
        } else {
            return ((Nh) obj).i;
        }
    }

    /* renamed from: ﺱﻁدﺏ  reason: contains not printable characters */
    public static String m1055(Object obj, Object obj2) {
        int i = C0048.m2140();

        if (i > 0) {
            return null;
        } else {
            return ((Gson) obj).toJson(obj2);
        }
    }

    /* renamed from: ﺵطﺙذ  reason: contains not printable characters */
    public static String m1056(Object obj) {
        int i = C0035.m1802();

        if (i < 0) {
            return null;
        } else {
            return ((Nh) obj).W;
        }
    }

    /* renamed from: ﺽﻩﺏا  reason: contains not printable characters */
    public static String m1057(Object obj) {
        int i = C0003.m81();

        if (i < 0) {
            return null;
        } else {
            return ((JsonElement) obj).getAsString();
        }
    }

    /* renamed from: ﻉحجﺝ  reason: contains not printable characters */
    public static short[] m1058() {
        int i = C0012.m378();

        if (i >= 0) {
            return null;
        } else {
            return f60short;
        }
    }

    /* renamed from: ﻉشصد  reason: contains not printable characters */
    public static Object m1059(Object obj, Object obj2, Object obj3) {
        int i = C0044.m2051();

        if (i > 0) {
            return null;
        } else {
            return ((Gson) obj).fromJson((String) obj2, (Type) obj3);
        }
    }

    /* renamed from: ﻉﻭﺵـ  reason: contains not printable characters */
    public static String m1060(Object obj) {
        int i = C0030.m1683();

        if (i < 0) {
            return null;
        } else {
            return ((Nh) obj).tF;
        }
    }

    /* renamed from: ﻕﺯﺝﺕ  reason: contains not printable characters */
    public static String m1061(Object obj) {
        int i = C0000.m13();

        if (i < 0) {
            return null;
        } else {
            return ((Nh) obj).SN;
        }
    }

    public final String B() {
        boolean z = C0029.m1658(m1050(this));

        if (!z) {
            return m1050(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final void Dr(String str) {
        this.v3 = str;
    }

    public final String F5() {
        String str = "ۨۡۨ";
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        List list = null;
        String str4 = null;
        short[] sArr = null;
        String str5 = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 1748766:
                return str5;
                case 1749731:
                strArr[1] = str4;
                str = "ۣۤ۠";
                break;
                case 1749760:
                sArr = m1058();
                str = "ۦۣۨ";
                break;
                case 1750687:
                list = C0031.m1721(strArr);
                str = "ۢۥۣ";
                break;
                case 1751559:
                str5 = C0024.m1512(str2);
                str = "ۡۤۡ";
                break;
                case 1752673:
                str4 = C0014.m420(this);
                str = "ۢۤۥ";
                break;
                case 1753571:
                str2 = C0038.m1902(str5, list);
                str = "ۤۡۤ";
                break;
                case 1753697:
                str5 = C0044.m2052(sArr, 0, 1, 1548);
                str = "ۦۤۡ";
                break;
                case 1755407:
                strArr = new String[2];
                str = "ۥۨ";
                break;
                case 1755436:
                strArr[0] = str3;
                str = "ۥۦۢ";
                break;
                default:
                str3 = C0050.m2209(this);
                str = "ۨۢۦ";
                break;
            }
        }
    }

    public final String G() {
        boolean z = C0029.m1658(m1056(this));

        if (!z) {
            return m1056(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final String G4() {
        boolean z = C0029.m1658(m1044(this));

        if (!z) {
            return m1044(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final String Gc() {
        boolean z = C0020.m1370(m1042(this));
        String str = C0031.m1705();

        if (!z) {
            return C0036.m1853(C0036.m1853(C0036.m1853(C0036.m1853(C0036.m1853(C0036.m1853(C0022.m1427(C0040.m1964(m1042(this))), C0049.m2175(m1058(), 1, 1, 464), str), C0045.m2098(m1058(), 2, 1, 2930), str), C0020.m1390(m1058(), 3, 1, 1261), str), C0020.m1390(m1058(), 4, 1, 2182), str), C0028.m1613(m1058(), 5, 1, 1252), C0047.m2133(m1058(), 6, 1, 1508)), C0000.m18(m1058(), 7, 1, 2999), str);
        } else {
            return str;
        }
    }

    public final String Gd() {
        boolean z = C0029.m1658(m1060(this));

        if (!z) {
            return m1060(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final String KJ() {
        boolean z = C0029.m1658(m1041(this));

        if (!z) {
            return m1041(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final String M() {
        boolean z = C0020.m1370(m1043(this));

        if (!z) {
            return C0032.m1739(C0052.m2253(C0027.m1601(m1058(), 8, 1, 590)), m1043(this), C0002.m57(m1058(), 9, 1, 2274));
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    com.github.catvod.spider.C0043.m2036(r1, (java.lang.CharSequence) com.github.catvod.spider.merge.C0026.m1556(r2));
    r3 = com.github.catvod.parser.C0000.m11(r2);
    r0 = 1864;
    */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    r0 = r0 ^ 1881;
    */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    switch(r0) {
        case 17: goto L64;
        case 47384: goto L63;
        case 47417: goto L66;
        case 47483: goto L65;
        default: goto L70;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    if (r3 == false) goto L67;
    */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    r0 = 48736;
    */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    r0 = 48705;
    */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    com.github.catvod.spider.C0043.m2036(r1, com.github.catvod.spider.merge.C0031.m1705());
    r0 = 48767;
    */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    r0 = r0 ^ 48784;
    */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    switch(r0) {
        case 14: goto L73;
        case 239: goto L74;
        default: goto L76;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    r0 = 48798;
    */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    com.github.catvod.spider.C0043.m2036(r1, (java.lang.CharSequence) com.github.catvod.spider.merge.C0026.m1556(r2));
    r3 = com.github.catvod.parser.C0000.m11(r2);
    r0 = 49666;
    */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    r0 = r0 ^ 49683;
    */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    switch(r0) {
        case 17: goto L89;
        case 50: goto L90;
        case 76: goto L91;
        case 83: goto L88;
        default: goto L95;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    if (r3 == false) goto L92;
    */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    r0 = 49759;
    */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    r0 = 49728;
    */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    com.github.catvod.spider.C0043.m2036(r1, com.github.catvod.spider.merge.C0021.m1417(m1058(), 10, 1, 1242));
    r0 = 49790;
    */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f7, code lost:
    r0 = r0 ^ 49807;
    */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
    switch(r0) {
        case 18: goto L98;
        case 241: goto L99;
        default: goto L101;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
    r0 = 49821;
    */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String N() {
        /*
        Method dump skipped, instructions count: 380
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Nh.N():java.lang.String");
    }

    public final boolean Nl() {
        boolean z = false;
        String str = "ۨ۟ۢ";
        String str2 = null;
        String str3 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56321:
                str2 = C0046.m2123(sArr, 11, 1, 928);
                str = "ۢۡۨ";
                break;
                case 1747812:
                return z;
                case 1749641:
                z = C0022.m1448(str3, str2);
                str = "۠ۤۨ";
                break;
                case 1755339:
                str3 = C0036.m1835(this);
                str = "ۦۣۧ";
                break;
                default:
                sArr = m1058();
                str = "۠ۡ";
                break;
            }
        }
    }

    public final void O(String str) {
        this.SN = str;
    }

    public final String W() {
        boolean z = C0020.m1370(m1049(this));

        if (!z) {
            return m1049(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final void Zm(String str) {
        this.zH = str;
    }

    public final void b(String str) {
        this.N = str;
        int i = C0011.m344();

        if (i > 0) {
            return;
        } else {
            System.out.println(Long.parseLong(C0000.m7("OX5r0KM1vJYKgh5")));
            return;
        }
    }

    public final String dT() {
        long j = m1038(this);

        if (j >= 500) {
            StringBuilder sb = C0052.m2253(C0032.m1749(m1058(), 12, 1, 2844));
            C0032.m1746(sb, C0003.m109(m1038(this)));
            C0032.m1746(sb, C0029.m1635(m1058(), 13, 1, 576));
            return C0043.m2039(sb);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final String ee() {
        boolean z = C0029.m1658(m1048(this));

        if (!z) {
            return m1048(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final void g(String str) {
        this.tF = str;
    }

    public final void g1(String str) {
        this.dT = str;
        int i = C0046.m2112();

        if (i > 0) {
            return;
        } else {
            System.out.println(Integer.valueOf(C0024.m1516("2b93DuMPMGtlyjikcgXF")));
            return;
        }
    }

    public final String g9() {
        long j = m1038(this);

        if (j >= 500) {
            return C0049.m2192(j);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final String i() {
        boolean z = C0029.m1658(m1039(this));

        if (!z) {
            return m1039(this);
        } else {
            String str = C0010.m296(m1058(), 14, 1, 1520);
            return str;
        }
    }

    public final void n(String str) {
        this.W = str;
    }

    public final String q() {
        boolean z = C0029.m1658(m1041(this));
        String str = C0031.m1705();

        if (!z) {
            String str2 = m1041(this);
            String str3 = C0037.m1882(m1058(), 15, 1, 2675);
            String str4 = C0053.m2278(str2, str3, str);
            boolean z2 = C0037.m1888(m1041(this), C0054.m2301(m1058(), 16, 9, 2810));
            if (!z2) {
                int length = C0011.m339(str4, C0031.m1701(m1042(this))).length;
                if (length <= 2) {
                    StringBuilder sb = C0052.m2253(str3);
                    C0032.m1746(sb, C0010.m314(m1042(this)));
                    return C0043.m2039(sb);
                } else {
                    StringBuilder sb2 = C0052.m2253(str3);
                    C0032.m1746(sb2, m1042(this));
                    C0032.m1746(sb2, str3);
                    C0032.m1746(sb2, C0011.m339(m1041(this), m1042(this))[2]);
                    String str5 = C0010.m314(C0043.m2039(sb2));
                    return str5;
                }
            } else {
                return C0010.m314(C0028.m1621(str4, C0027.m1592(str4, str3)));
            }
        } else {
            return str;
        }
    }

    public final void s(String str) {
        this.v = str;
    }

    public final List<Nh> t0() {
        List<Nh> list = m1040(this);

        if (list != null) {
            return list;
        } else {
            return C0006.m183();
        }
    }

    public final String tF() {
        boolean z = C0029.m1658(m1061(this));

        if (!z) {
            return m1061(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final void un(String str) {
        this.F5 = str;
        int i = C0056.m2341();

        if (i < 0) {
            return;
        } else {
            System.out.println(Float.decode(C0044.m2045("vOh7w7mFtKO")));
            return;
        }
    }

    public final String v() {
        boolean z = C0020.m1370(m1054(this));

        if (!z) {
            return m1054(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final String v3() {
        boolean z = C0029.m1658(m1053(this));

        if (!z) {
            return m1053(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final ME xa(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        C0032.m1746(sb, C0039.m1928(this));
        String str4 = C0031.m1705();
        C0032.m1746(sb, str4);
        C0032.m1746(sb, C0014.m420(this));
        String str5 = C0024.m1512(C0043.m2039(sb));
        boolean z = C0001.m23(this);

        if (!z) {
            boolean z2 = C0040.m1944(C0035.m1832(), C0033.m1774(C0004.m150(C0014.m420(this))));
            if (!z2) {
                JsonObject jsonObject = m1045(this);
                if (!(jsonObject == null)) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        C0032.m1746(sb2, m1057(m1051(m1045(this), C0024.m1513(m1058(), 213, 4, 766))));
                        C0032.m1746(sb2, C0020.m1390(m1058(), 217, 162, 2482));
                        C0007.m217();
                        C0032.m1746(sb2, C0037.m1873(C0015.m439(m1052())));
                        str4 = C0043.m2039(sb2);
                    } catch (Exception e) {
                        C0043.m2037(C0003.m108(), e);
                        break;
                    }
                }
            } else {
                str4 = C0004.m130(m1058(), 25, 188, 1090);
                JsonObject jsonObject = m1045(this);
                if (!(jsonObject == null)) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        C0032.m1746(sb2, m1057(m1051(m1045(this), C0024.m1513(m1058(), 213, 4, 766))));
                        C0032.m1746(sb2, C0020.m1390(m1058(), 217, 162, 2482));
                        C0007.m217();
                        C0032.m1746(sb2, C0037.m1873(C0015.m439(m1052())));
                        str4 = C0043.m2039(sb2);
                    } catch (Exception e) {
                        C0043.m2037(C0003.m108(), e);
                        break;
                    }
                }
            }
        } else {
            str4 = str2;
            boolean z2 = C0040.m1944(C0035.m1832(), C0033.m1774(C0004.m150(C0014.m420(this))));
            if (!z2) {
                JsonObject jsonObject = m1045(this);
                if (!(jsonObject == null)) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        C0032.m1746(sb2, m1057(m1051(m1045(this), C0024.m1513(m1058(), 213, 4, 766))));
                        C0032.m1746(sb2, C0020.m1390(m1058(), 217, 162, 2482));
                        C0007.m217();
                        C0032.m1746(sb2, C0037.m1873(C0015.m439(m1052())));
                        str4 = C0043.m2039(sb2);
                    } catch (Exception e) {
                        C0043.m2037(C0003.m108(), e);
                        break;
                    }
                }
            } else {
                str4 = C0004.m130(m1058(), 25, 188, 1090);
                JsonObject jsonObject = m1045(this);
                if (!(jsonObject == null)) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        C0032.m1746(sb2, m1057(m1051(m1045(this), C0024.m1513(m1058(), 213, 4, 766))));
                        C0032.m1746(sb2, C0020.m1390(m1058(), 217, 162, 2482));
                        C0007.m217();
                        C0032.m1746(sb2, C0037.m1873(C0015.m439(m1052())));
                        str4 = C0043.m2039(sb2);
                    } catch (Exception e) {
                        C0043.m2037(C0003.m108(), e);
                        break;
                    }
                }
            }
        }

        return new ME(str, str5, str4, str3, C0001.m23(this));
    }

    public final String zH() {
        boolean z = C0029.m1658(m1046(this));

        if (!z) {
            return m1046(this);
        } else {
            String str = C0031.m1705();
            return str;
        }
    }
}
