package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.merge.A4;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.PA;
import com.github.catvod.spider.merge.RS;
import com.github.catvod.spider.merge.Sq;
import com.github.catvod.spider.merge.Yx;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.l3;
import com.github.catvod.spider.merge.rP;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Seedhub extends Pan {

    private CacheData Dr;
    private CacheData Zm;
    private String b;
    private CacheData g;
    private String O = "https://seedhub.pro/";
    private String g1 = "";
    private String s = "";
    private String n = "";
    private String un = "";

    /* renamed from: com.github.catvod.spider.Seedhub$1  reason: invalid class name */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class CacheData {
        private String N;
        private String SN;
        private String tF;
        private String yq;
        private String zH;

        CacheData() {
            int i = (-824) ^ C0004.f4;
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

        public String getBy() {
            return this.tF;
        }

        public String getData() {
            return this.SN;
        }

        public String getId() {
            return this.yq;
        }

        public String getPg() {
            return this.N;
        }

        public String getTypeOnly() {
            return this.zH;
        }

        public void setBy(String str) {
            this.tF = str;
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

        public void setData(String str) {
            this.SN = str;
        }

        public void setId(String str) {
            this.yq = str;
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

        public void setPg(String str) {
            this.N = str;
            int i = 923 ^ C0041.f99;
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

        public void setTypeOnly(String str) {
            this.zH = str;
        }
    }

    public Seedhub() {
        int i = (-185) ^ C0033.f91;
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

    private String B(String str, String str2, String str3) {
        boolean equals = str.equals(this.g1);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (equals) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    this.g1 = str;
                    this.un = str;
                    return str;
                case 239:
                    boolean equals2 = str2.equals(this.s);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (equals2) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                boolean equals3 = str3.equals(this.n);
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (equals3) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            return "";
                                        case 47417:
                                            this.n = str3;
                                            this.un = str3;
                                            return str3;
                                        case 47483:
                                            break;
                                    }
                                    i3 = 48705;
                                }
                                break;
                            case 500:
                                this.s = str2;
                                this.un = str2;
                                return str2;
                        }
                        i2 = 1802;
                    }
                    break;
            }
            i = 1678;
        }
    }

    private String G(String str) {
        StringBuilder sb = null;
String str3 = null;
        int i = 0;
                // [deflattened] 控制流平坦化已还原为线性代码
        str3 = "@Referer=";
        sb = Sq.yq(str, str3);
        str = this.O;
        str3 = "/";
        i = str.lastIndexOf(str3);
        str3 = str.substring(0, i);
        sb.append(str3);
        str = sb.toString();
        return str;
}

    private HashMap<String, String> q() {
        HashMap<String, String> hashMap = null;
        String str2 = null;
String str3 = null;
                // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap<>();
        str3 = A4.i();
        str2 = "User-Agent";
        hashMap.put(str2, str3);
        str2 = this.O;
        str3 = "Referer";
        hashMap.put(str3, str2);
        return hashMap;
}

    /* renamed from: تكﻝغ  reason: contains not printable characters */
    public static String m947(Object obj) {
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
                    return ((CacheData) obj).getData();
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

    /* renamed from: جﻱﺥﻅ  reason: contains not printable characters */
    public static String m948(Object obj) {
        int i = 293 ^ C0009.f9;
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
                    return ((Seedhub) obj).b;
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

    /* renamed from: دﺎسﻅ  reason: contains not printable characters */
    public static void m949(Object obj, Object obj2) {
        int i = 215 ^ C0038.f96;
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
                    ((CacheData) obj).setTypeOnly((String) obj2);
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

    /* renamed from: ضﺵﻅـ  reason: contains not printable characters */
    public static String m950(Object obj) {
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
                    return ((CacheData) obj).getId();
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

    /* renamed from: ظدنﺝ  reason: contains not printable characters */
    public static HashMap m951(Object obj) {
        int i = 909 ^ C0002.f2;
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
                    return ((Seedhub) obj).q();
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

    /* renamed from: ظقنﻩ  reason: contains not printable characters */
    public static String m952(Object obj) {
        int i = (-193) ^ C0041.f99;
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
                    return ((CacheData) obj).getBy();
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

    /* renamed from: ـوطﻍ  reason: contains not printable characters */
    public static CacheData m953(Object obj) {
        int i = (-422) ^ C0033.f91;
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
                    return ((Seedhub) obj).Zm;
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

    /* renamed from: قﺽفﺩ  reason: contains not printable characters */
    public static void m954(Object obj, Object obj2) {
        int i = (-404) ^ C0021.f79;
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
                    ((CacheData) obj).setId((String) obj2);
                    break;
                case 239:
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = 48674;
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
        int i4 = (-540) ^ C0001.f1;
        int i5 = 1740;
        while (true) {
            i5 ^= 1757;
            switch (i5) {
                case 17:
                    
                        break;
                    
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: كذعﻕ  reason: contains not printable characters */
    public static CacheData m955(Object obj) {
        int i = (-824) ^ C0004.f4;
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
                    return ((Seedhub) obj).g;
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

    /* renamed from: نتشر  reason: contains not printable characters */
    public static void m956(Object obj, Object obj2) {
        int i = 284 ^ C0041.f99;
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
                    ((CacheData) obj).setPg((String) obj2);
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

    /* renamed from: ﺥاﺡج  reason: contains not printable characters */
    public static String m957(Object obj) {
        int i = 215 ^ C0038.f96;
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
                    return ((CacheData) obj).getPg();
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

    /* renamed from: ﺩبطﺕ  reason: contains not printable characters */
    public static CacheData m958(Object obj) {
        int i = (-314) ^ C0002.f2;
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
                    return ((Seedhub) obj).Dr;
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

    /* renamed from: ﺩسﻡو  reason: contains not printable characters */
    public static String m959(Object obj, Object obj2, Object obj3, Object obj4) {
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
                    return ((Seedhub) obj).B((String) obj2, (String) obj3, (String) obj4);
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

    /* renamed from: ﺫﻅﻁﻝ  reason: contains not printable characters */
    public static String m960(Object obj) {
        int i = (-487) ^ C0053.f111;
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
                    return ((Seedhub) obj).un;
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

    /* renamed from: ﺭﺵﺹﻝ  reason: contains not printable characters */
    public static String m961(Object obj, Object obj2) {
        int i = (-4) ^ C0029.f87;
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
                    return ((Seedhub) obj).G((String) obj2);
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

    /* renamed from: ﺵطعب  reason: contains not printable characters */
    public static void m962(Object obj, Object obj2) {
        int i = (-1021) ^ C0026.f84;
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
                    ((CacheData) obj).setData((String) obj2);
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

    /* renamed from: ﻁﻍﺏﺡ  reason: contains not printable characters */
    public static void m963(Object obj, Object obj2) {
        int i = (-985) ^ C0024.f82;
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
                    ((CacheData) obj).setBy((String) obj2);
                    break;
                case 239:
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = 48674;
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
        int i4 = (-4) ^ C0029.f87;
        int i5 = 1740;
        while (true) {
            i5 ^= 1757;
            switch (i5) {
                case 17:
                    
                        break;
                    
                case 54:
                    break;
                case 471:
                    return;
                case 500:
                    return;
            }
            i5 = 1802;
        }
    }

    /* renamed from: ﻕﺥمغ  reason: contains not printable characters */
    public static void m964(Object obj) {
        int i = (-4) ^ C0029.f87;
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

    /* renamed from: ﻙهﻭﻩ  reason: contains not printable characters */
    public static String m965(Object obj) {
        int i = 354 ^ C0026.f84;
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
                    return ((Seedhub) obj).O;
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

    /* renamed from: ﻙﺫﻝق  reason: contains not printable characters */
    public static String m966(Object obj) {
        int i = (-703) ^ C0036.f94;
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
                    return ((CacheData) obj).getTypeOnly();
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 800
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String categoryContent(java.lang.String r25, java.lang.String r26, boolean r27, java.util.HashMap<java.lang.String, java.lang.String> r28) {
        /*
            Method dump skipped, instructions count: 5554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Seedhub.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String str;
        String str2;
        String str3 = "list";
        String str4 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject((String) (list.get(0)));
            JSONArray jSONArray = new JSONArray();
            String str5 = ((jSONObject2.getString("vod_id")).trim());
            boolean z = (str5.contains("link_start"));
            String str6 = "/";
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (!z) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        boolean z2 = (str5.contains("pan_id"));
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (z2) {
                                        break;
                                    } else {
                                        i2 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    StringBuilder sb = new StringBuilder();
                                    String str7 = m965(this);
                                    (sb.append((str7.substring(0,(str7.lastIndexOf(str6))))));
                                    (sb.append(str5));
                                    return super.detailContent((Arrays.asList(new String[]{new String(C0005.m179(C0007.m228("const data = \"(.*?)\"", C0028.m1633((sb.toString()), m951(this)), 1), 0))})));
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    case 239:
                        break;
                }
                i = 1678;
            }
            StringBuilder sb2 = new StringBuilder();
            String str8 = m965(this);
            (sb2.append((str8.substring(0,(str8.lastIndexOf(str6))))));
            (sb2.append(str5));
            JSONObject jSONObject3 = ((new JSONObject(super.detailContent(new ArrayList((Arrays.asList((C0007.m228("var panLink = \"(.*?)\"", C0028.m1633((sb2.toString()), C0027.m1590(str4, str4, 3)), 1).split(","))))))).getJSONArray(str3)).getJSONObject(0));
            String str9 = "vod_play_url";
            String str10 = "vod_play_from";
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        if (jSONObject3 == null) {
                            break;
                        } else {
                            i3 = 48736;
                            continue;
                        }
                    case 47384:
                        str = str4;
                        str2 = str4;
                        break;
                    case 47417:
                        str = (jSONObject3.getString(str10));
                        str2 = (jSONObject3.getString(str9));
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 239:
                                    i4 = 48798;
                                    break;
                            }
                        }
                        break;
                    case 47483:
                        break;
                }
                i3 = 48705;
            }
            boolean z3 = (str2.startsWith("$$$"));
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                        break;
                    case 53:
                        break;
                    case 503:
                        if (z3) {
                            break;
                        } else {
                            i5 = 49635;
                            continue;
                        }
                    case 32495:
                        (jSONObject2.put(str10,str));
                        (jSONObject2.put(str9,str2));
                        break;
                    default:
                        continue;
                }
                i5 = 48953;
            }
            boolean z4 = (str2.isEmpty());
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        if (!z4) {
                            break;
                        } else {
                            i6 = 49759;
                            continue;
                        }
                    case 50:
                        break;
                    case 76:
                        String str11 = "待补链";
                        String str12 = "此线路失效";
                        (jSONObject2.put(str10,str11));
                        (jSONObject2.put(str9,str12));
                        break;
                    case 83:
                        break;
                    default:
                        continue;
                }
                i6 = 49728;
            }
            (jSONArray.put(jSONObject2));
            (jSONObject.put(str3,jSONArray));
            return (jSONObject.toString());
        } catch (Exception e) {
            m964(e);
            return str4;
        }
    }

    public String homeContent(boolean z) {
        String str = "a";
        boolean z2 = (C0049.m2191(m948(this)).contains("56We56eY55qE5ZOl5ZOl5Lus"));
        String str2 = "";
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (z2) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return str2;
                case 239:
                    try {
                        CacheData cacheData = m955(this);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (cacheData == null) {
                                        break;
                                    } else {
                                        i2 = 1833;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 471:
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = new ArrayList();
                                    JSONObject jSONObject = new JSONObject(C0056.m2359());
                                    (arrayList2.add(new rP("1", "电影")));
                                    (arrayList2.add(new rP("3", "剧集")));
                                    (arrayList2.add(new rP("2", "动漫")));
                                    int i3 = 0;
                                    kB kBVar = (C0004.m119(C0011.m353(m965(this), m951(this), 0)).cS("div.cover-container div.cover"));
                                    while (true) {
                                        int i4 = (kBVar.size());
                                        int i5 = 1864;
                                        while (true) {
                                            i5 ^= 1881;
                                            switch (i5) {
                                                case 17:
                                                    i5 = i3 < i4 ? 48736 : 48705;
                                                case 47384:
                                                    CacheData cacheData2 = new CacheData();
                                                    this.g = cacheData2;
                                                    m962(cacheData2, C0054.m2296(arrayList2, arrayList, jSONObject));
                                                    return C0054.m2296(arrayList2, arrayList, jSONObject);
                                                case 47417:
                                                    hN hNVar = (hN) (kBVar.get(i3));
                                                    (Objects.requireNonNull(hNVar));
                                                    String str3 = (C0000.m12(str, hNVar).N("title"));
                                                    String str4 = m961(this, (C0000.m12("a img", hNVar).N("src")));
                                                    Iterator it = ((hNVar.cS("ul li")).iterator());
                                                    int i6 = 1;
                                                    String str5 = str2;
                                                    while (true) {
                                                        boolean z3 = (it.hasNext());
                                                        int i7 = 48767;
                                                        while (true) {
                                                            i7 ^= 48784;
                                                            switch (i7) {
                                                                case 14:
                                                                case 45:
                                                                    StringBuilder sb = new StringBuilder();
                                                                    (sb.append((C0000.m12(str, hNVar).N("href"))));
                                                                    (sb.append("@folder"));
                                                                    (arrayList.add(new ME((sb.toString()), str3, str4, str5, true)));
                                                                    i3++;
                                                                    int i8 = 49914;
                                                                    while (true) {
                                                                        i8 ^= 49931;
                                                                        switch (i8) {
                                                                            case 497:
                                                                                i8 = 50596;
                                                                            case 1711:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 76:
                                                                    hN hNVar2 = (hN) (it.next());
                                                                    int i9 = 48891;
                                                                    while (true) {
                                                                        i9 ^= 48908;
                                                                        switch (i9) {
                                                                            case 22:
                                                                            case 53:
                                                                                break;
                                                                            case 503:
                                                                                i9 = i6 == 2 ? 49635 : 48953;
                                                                            case 32495:
                                                                                C0039.m1941((hNVar2.Fo()));
                                                                                break;
                                                                        }
                                                                    }
                                                                    boolean z4 = ((hNVar2.Fo()).contains("豆瓣"));
                                                                    int i10 = 49666;
                                                                    while (true) {
                                                                        i10 ^= 49683;
                                                                        switch (i10) {
                                                                            case 17:
                                                                                i10 = z4 ? 49759 : 49728;
                                                                            case 50:
                                                                            case 76:
                                                                                str5 = ((hNVar2.cS(str)).t0());
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                        }
                                                                    }
                                                                    i6++;
                                                                    int i11 = 49790;
                                                                    while (true) {
                                                                        i11 ^= 49807;
                                                                        switch (i11) {
                                                                            case 18:
                                                                                break;
                                                                            case 241:
                                                                                i11 = 49821;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 239:
                                                                    i7 = z3 ? 48860 : 48829;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                    }
                                    break;
                                case 500:
                                    return m947(cacheData);
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    } catch (Exception e) {
                        (System.out.println(e));
                        return str2;
                    }
                    break;
            }
            i = 1678;
        }
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        int i;
        try {
            this.b = str;
            i = 1616;
        } catch (Exception e) {
            InitOrigin.show("");
        }
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    super.init(context, "{}");
                    int i2 = 697 ^ C0024.f82;
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                
                                    break;
                                
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                return;
                        }
                        i3 = 1802;
                    }
                    break;
                case 49:
                    i = 1647;
                    break;
            }
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = "a";
        try {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append(this.O);
            int i = 0;
            sb.append(String.format("s/%s/", URLEncoder.encode(str)));
            kB cS = l3.tF(RS.SN(sb.toString(), q(), 0)).cS("div.cover-container div.cover");
            while (true) {
                int size = cS.size();
                int i2 = 1616;
                while (true) {
                    i2 ^= 1633;
                    switch (i2) {
                        case 14:
                        case 49:
                            i2 = i < size ? 1709 : 1678;
                        case 204:
                            hN hNVar = cS.get(i);
                            Objects.requireNonNull(hNVar);
                            String N = PA.yq(str2, hNVar).N("title");
                            String N2 = PA.yq("a img", hNVar).N("src");
                            Iterator<hN> it = hNVar.cS("ul li").iterator();
                            String str3 = "";
                            int i3 = 1;
                            while (true) {
                                boolean hasNext = it.hasNext();
                                int i4 = 1740;
                                while (true) {
                                    i4 ^= 1757;
                                    switch (i4) {
                                        case 17:
                                            i4 = hasNext ? 1833 : 1802;
                                        case 54:
                                        case 471:
                                            arrayList.add(new ME(PA.yq(str2, hNVar).N("href") + "@folder", N, N2, str3, true));
                                            i++;
                                            int i5 = 49666;
                                            while (true) {
                                                i5 ^= 49683;
                                                switch (i5) {
                                                    case 17:
                                                        i5 = 49697;
                                                    case 50:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 500:
                                            hN next = it.next();
                                            int i6 = 1864;
                                            while (true) {
                                                i6 ^= 1881;
                                                switch (i6) {
                                                    case 17:
                                                        i6 = i3 == 2 ? 48736 : 48705;
                                                    case 47384:
                                                        break;
                                                    case 47417:
                                                        Yx.SN(next.Fo());
                                                        break;
                                                    case 47483:
                                                }
                                            }
                                            boolean contains = next.Fo().contains("豆瓣");
                                            int i7 = 48767;
                                            while (true) {
                                                i7 ^= 48784;
                                                switch (i7) {
                                                    case 14:
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        str3 = next.cS(str2).t0();
                                                        break;
                                                    case 239:
                                                        i7 = contains ? 48860 : 48829;
                                                }
                                            }
                                            i3++;
                                            int i8 = 48891;
                                            while (true) {
                                                i8 ^= 48908;
                                                switch (i8) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i8 = 48922;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }
                            break;
                        case 239:
                            return iX.ee(arrayList);
                    }
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
