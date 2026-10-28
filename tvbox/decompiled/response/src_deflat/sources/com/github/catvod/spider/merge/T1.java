package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0055;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class T1 {
    @SerializedName("uid")
    private String i;
    @SerializedName("username")
    private String tF;
    @SerializedName("uk")
    private String zH;
    @SerializedName("total")
    private long yq = 0;
    @SerializedName("used")
    private long SN = 0;
    @SerializedName("is_svip")
    private int N = 0;

    public T1() {
        String str = C0031.m1705();
        this.tF = str;
        this.zH = str;
        this.i = str;
        int i = C0014.m418();

        if (i > 0) {
            return;
        } else {
            System.out.println(Integer.parseInt(C0042.m2014("l6MWUiCMSl")));
            return;
        }
    }

    public static T1 i(String str) {
        T1 t1 = (T1) C0030.m1682(str, T1.class);

        if (t1 != null) {
            return t1;
        } else {
            return new T1();
        }
    }

    /* renamed from: ظﻁﺩﻍ  reason: contains not printable characters */
    public static int m1155(Object obj) {
        int i = C0039.m1918();

        if (i >= 0) {
            return 0;
        } else {
            return ((T1) obj).N;
        }
    }

    /* renamed from: ﻕلﺩص  reason: contains not printable characters */
    public static long m1156(Object obj) {
        int i = C0042.m1998();

        if (i > 0) {
            return 0L;
        } else {
            return ((T1) obj).SN;
        }
    }

    /* renamed from: ﻝﻕقﻙ  reason: contains not printable characters */
    public static String m1157(Object obj, Object obj2) {
        int i = C0042.m1998();

        if (i > 0) {
            return null;
        } else {
            return ((Gson) obj).toJson(obj2);
        }
    }

    /* renamed from: ﻩبﺵع  reason: contains not printable characters */
    public static long m1158(Object obj) {
        int i = C0026.m1561();

        if (i >= 0) {
            return 0L;
        } else {
            return ((T1) obj).yq;
        }
    }

    /* renamed from: ﻩمﻁﻱ  reason: contains not printable characters */
    public static String m1159(Object obj) {
        int i = C0055.m2324();

        if (i < 0) {
            return null;
        } else {
            return ((T1) obj).i;
        }
    }

    public final long N() {
        long j = m1158(this);

        if (j != 0) {
            return j;
        } else {
            return 0L;
        }
    }

    public final long SN() {
        long j = m1158(this);

        if (j != 0) {
            return j - m1156(this);
        } else {
            return 0L;
        }
    }

    public final void t0(String str) {
        this.i = str;
    }

    public final String tF() {
        return m1159(this);
    }

    public final String toString() {
        return m1157(new Gson(), this);
    }

    public final T1 yq() {
        String str = null;
        String str2 = "ۣۡ۠";
        while (true) {
            switch (C0002.m76(str2)) {
                case 1746754:
                this.i = str;
                str2 = "ۣۣۦ";
                break;
                case 1750594:
                this.yq = 0L;
                str2 = "ۣۦۧ";
                break;
                case 1750662:
                return this;
                case 1750756:
                this.SN = 0L;
                str2 = "ۣۧۢ";
                break;
                case 1753480:
                this.zH = str;
                str2 = "ۨ۟ۨ";
                break;
                case 1754502:
                str = C0031.m1705();
                str2 = "ۦۣۡ";
                break;
                case 1755345:
                this.tF = str;
                str2 = "ۡۦ۟";
                break;
                default:
                this.N = 0;
                str2 = "۟ۡۤ";
                break;
            }
        }
    }

    public final boolean zH() {
        int i = m1155(this);

        if (i != 1) {
            return false;
        } else {
            return true;
        }
    }
}
