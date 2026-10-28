package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0055;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Q6 {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f62short = {2778, 2781, 2758, 2754, 2764, 2759, 1047, 1040, 1035, 1039, 1025, 1034, 1145, 1872, 1878, 1863, 1857, 1857, 3283, 3285, 3268, 3266, 3266, 3244, 2973, 2448, 2454, 2439, 2433, 2433, 3323, 1262, 1256, 1273, 1279, 1279, 1169, 2824, 2828, 2839, 2835, 2845, 2838, 298, 302, 309, 305, 319, 308, 327, 2574};
    @SerializedName("ptoken")
    private String N;
    @SerializedName("stoken")
    private String SN;
    @SerializedName("devuid")
    private String tF;
    @SerializedName("bduss")
    private String yq;

    public Q6() {
        String str = C0031.m1705();
        this.yq = str;
        this.SN = str;
        this.N = str;
        this.tF = str;
        int i = C0037.m1870();

        if (i > 0) {
            return;
        } else {
            System.out.println(Float.valueOf(C0013.m395("fVysM")));
            return;
        }
    }

    public static Q6 M(String str) {
        Q6 q6 = (Q6) C0030.m1682(str, Q6.class);

        if (q6 != null) {
            return q6;
        } else {
            return new Q6();
        }
    }

    /* renamed from: زﺫمغ  reason: contains not printable characters */
    public static String m1067(Object obj) {
        int i = C0040.m1954();

        if (i >= 0) {
            return null;
        } else {
            return ((Q6) obj).N;
        }
    }

    /* renamed from: فﻱﻕا  reason: contains not printable characters */
    public static String m1068(Object obj) {
        int i = C0055.m2324();

        if (i < 0) {
            return null;
        } else {
            return ((Q6) obj).SN;
        }
    }

    /* renamed from: لعﻍﻩ  reason: contains not printable characters */
    public static String m1069(Object obj, Object obj2) {
        int i = C0009.m276();

        if (i <= 0) {
            return null;
        } else {
            return ((Gson) obj).toJson(obj2);
        }
    }

    /* renamed from: ﺕﻡخج  reason: contains not printable characters */
    public static short[] m1070() {
        int i = C0003.m81();

        if (i <= 0) {
            return null;
        } else {
            return f62short;
        }
    }

    /* renamed from: ﺫتشﺝ  reason: contains not printable characters */
    public static String m1071(Object obj) {
        int i = C0033.m1755();

        if (i > 0) {
            return null;
        } else {
            return ((Q6) obj).yq;
        }
    }

    /* renamed from: ﺭظخﻕ  reason: contains not printable characters */
    public static String m1072(Object obj) {
        int i = C0001.m25();

        if (i > 0) {
            return null;
        } else {
            return ((Q6) obj).tF;
        }
    }

    public final void B(String str) {
        this.SN = str;
        int i = C0039.m1918();

        if (i < 0) {
            return;
        } else {
            System.out.println(Double.parseDouble(C0027.m1578("4b7WfzktrbUH3uA7Nr5DRD")));
            return;
        }
    }

    public final String Gc() {
        boolean z = C0020.m1370(m1068(this));

        if (!z) {
            boolean z2 = C0030.m1681(m1068(this), C0046.m2123(m1070(), 0, 6, 2697));
            if (!z2) {
                StringBuilder sb = C0052.m2253(C0011.m328(m1070(), 6, 7, 1092));
                C0032.m1746(sb, m1068(this));
                return C0043.m2039(sb);
            } else {
                String str2 = m1068(this);
                return str2;
            }
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final void KJ(String str) {
        this.yq = str;
    }

    public final String N() {
        boolean z = C0020.m1370(m1071(this));

        if (!z) {
            boolean z2 = C0030.m1681(m1071(this), C0043.m2020(m1070(), 13, 5, 1810));
            if (!z2) {
                StringBuilder sb = C0052.m2253(C0045.m2098(m1070(), 18, 6, 3217));
                C0032.m1746(sb, m1071(this));
                return C0043.m2039(sb);
            } else {
                String str2 = m1071(this);
                return str2;
            }
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final String SN() {
        String str = "ۣ۠ۨ";
        short[] sArr = null;
        StringBuilder sb = null;
        String str2 = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 1746689:
                C0032.m1746(sb, str2);
                str = "ۥۧۦ";
                break;
                case 1747781:
                sb = new StringBuilder();
                str = "ۢۦ۠";
                break;
                case 1749665:
                C0032.m1746(sb, str2);
                str = "ۦۥۤ";
                break;
                case 1749669:
                str2 = C0004.m130(sArr, 24, 1, 2982);
                str = "ۢۢۡ";
                break;
                case 1749788:
                str2 = C0037.m1873(this);
                str = "ۣۤۡ";
                break;
                case 1750688:
                C0032.m1746(sb, str2);
                str = "ۢ۟ۥ";
                break;
                case 1752708:
                str2 = C0043.m2039(sb);
                str = "ۧ۟ۧ";
                break;
                case 1753605:
                str2 = C0020.m1372(this);
                str = "۟۟ۡ";
                break;
                case 1754383:
                return str2;
                default:
                sArr = m1070();
                str = "ۢۢۥ";
                break;
            }
        }
    }

    public final String i() {
        String str;
        boolean z = C0020.m1370(m1071(this));
        String str2 = C0031.m1705();

        if (!z) {
            boolean z2 = C0030.m1681(m1071(this), C0007.m210(m1070(), 25, 5, 2514));
            String str3 = C0041.m1994(m1070(), 30, 1, 3264);
            if (!z2) {
                str = m1071(this);
            } else {
                str = C0036.m1853(m1071(this), C0047.m2133(m1070(), 31, 6, 1196), str2);
                str = m1071(this);
            }
            return C0036.m1853(str, str3, str2);
        } else {
            return str2;
        }
    }

    public final Q6 q(String str) {
        this.tF = str;
        return this;
    }

    public final String t0() {
        boolean z = C0020.m1370(m1067(this));

        if (!z) {
            boolean z2 = C0030.m1681(m1067(this), C0002.m57(m1070(), 37, 6, 2904));
            if (!z2) {
                StringBuilder sb = C0052.m2253(C0022.m1433(m1070(), 43, 7, 378));
                C0032.m1746(sb, m1067(this));
                return C0043.m2039(sb);
            } else {
                String str2 = m1067(this);
                return str2;
            }
        } else {
            String str = C0031.m1705();
            return str;
        }
    }

    public final String tF() {
        StringBuilder sb;
        String str = C0037.m1873(this);
        String str2 = C0055.m2320(m1070(), 50, 1, 2613);
        boolean z = C0050.m2218(str, str2);

        if (!z) {
            sb = new StringBuilder();
            C0032.m1746(sb, C0037.m1873(this));
        } else {
            sb = new StringBuilder();
            str2 = C0037.m1873(this);
            sb = new StringBuilder();
            C0032.m1746(sb, C0037.m1873(this));
        }
        C0032.m1746(sb, str2);
        C0032.m1746(sb, C0030.m1672(this));
        return C0043.m2039(sb);
    }

    public final String toString() {
        return m1069(new Gson(), this);
    }

    public final Q6 yq() {
        String str = null;
        String str2 = "ۦۢ";
        while (true) {
            switch (C0002.m76(str2)) {
                case 56508:
                str = C0031.m1705();
                str2 = "ۥۤۡ";
                break;
                case 1749699:
                this.N = str;
                str2 = "ۤۧۥ";
                break;
                case 1751746:
                this.tF = str;
                str2 = "۠ۨۧ";
                break;
                case 1752610:
                this.yq = str;
                str2 = "ۦۦۡ";
                break;
                case 1753633:
                this.SN = str;
                str2 = "ۣۢۤ";
                break;
                default:
                return this;
            }
        }
    }

    public final String zH() {
        return m1072(this);
    }
}
