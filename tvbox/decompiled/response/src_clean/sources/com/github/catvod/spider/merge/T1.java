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
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i > 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    System.out.println(Integer.parseInt(C0042.m2014("l6MWUiCMSl")));
                    return;
                case 239:
                    return;
            }
            i2 = 1678;
        }
    }

    public static T1 i(String str) {
        T1 t1 = (T1) C0030.m1682(str, T1.class);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (t1 != null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return new T1();
                case 239:
                    return t1;
            }
            i = 1678;
        }
    }

    /* renamed from: ظﻁﺩﻍ  reason: contains not printable characters */
    public static int m1155(Object obj) {
        int i = C0039.m1918();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((T1) obj).N;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻕلﺩص  reason: contains not printable characters */
    public static long m1156(Object obj) {
        int i = C0042.m1998();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i > 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((T1) obj).SN;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0L;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻝﻕقﻙ  reason: contains not printable characters */
    public static String m1157(Object obj, Object obj2) {
        int i = C0042.m1998();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i > 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((Gson) obj).toJson(obj2);
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

    /* renamed from: ﻩبﺵع  reason: contains not printable characters */
    public static long m1158(Object obj) {
        int i = C0026.m1561();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i >= 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((T1) obj).yq;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return 0L;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻩمﻁﻱ  reason: contains not printable characters */
    public static String m1159(Object obj) {
        int i = C0055.m2324();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i < 0) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    return ((T1) obj).i;
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

    public final long N() {
        long j = m1158(this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (j != 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return 0L;
                case 239:
                    return j;
            }
            i = 1678;
        }
    }

    public final long SN() {
        long j = m1158(this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (j != 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return 0L;
                        }
                    }
                    break;
                case 239:
                    return j - m1156(this);
            }
            i = 1678;
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
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i != 1) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return true;
                        }
                    }
                    break;
                case 239:
                    return false;
            }
            i2 = 1678;
        }
    }
}
