package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0035;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class AppYsV2 extends Spider {
    protected String N;
    private List<String> i;
    private String tF;
    public String yq;
    private String zH;

    static final Pattern Gc = C0005.m166("api\\.php/.*?/vod");
    static final Pattern M = C0005.m166(".*(url|v|vid|php\\?id)=");
    static final Pattern KJ = C0005.m166("https?://[^/]*");
    protected static final Pattern[] q = {C0005.m166("player=new"), C0005.m166("<div id=\"video\""), C0005.m166("<div id=\"[^\"]*?player\""), C0005.m166("//视频链接"), C0005.m166("HlsJsPlayer\\("), C0005.m166("<iframe[\\s\\S]*?src=\"[^\"]+?\""), C0005.m166("<video[\\s\\S]*?src=\"[^\"]+?\"")};
    protected boolean SN = false;
    protected final HashMap<String, ArrayList<String>> t0 = new HashMap<>();

    static {
        C0005.m166("api\\.php/.+?\\.vod");
        C0005.m166("/.+\\?.+=");
    }

    public AppYsV2() {
        String str = "";
        this.yq = str;
        this.N = str;
        this.tF = str;
        this.zH = str;
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 421
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private java.lang.String B(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.B(java.lang.String, java.lang.String):java.lang.String");
    }

    private boolean G(String str) {
        boolean z = (str.equals("伦理"));
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
                    boolean z2 = (str.equals("情色"));
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
                                boolean z3 = (str.equals("福利"));
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        return false;
                                                    case 503:
                                                        i4 = 48922;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47417:
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
                                    i3 = 48705;
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        return true;
    }

    private String G4(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = (jSONArray.length());
                int i3 = 1616;
                while (true) {
                    i3 ^= 1633;
                    switch (i3) {
                        case 14:
                        case 49:
                            i3 = i < i2 ? 1709 : 1678;
                        case 204:
                            (arrayList.add((jSONArray.getString(i))));
                            i++;
                            int i4 = 1740;
                            while (true) {
                                i4 ^= 1757;
                                switch (i4) {
                                    case 17:
                                        i4 = 1771;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            return (TextUtils.join(",",arrayList));
                    }
                }
            }
        } catch (JSONException e) {
            return "";
        }
    }

    private HashMap<String, String> Gc(String str) {
        String str2;
        HashMap<String, String> hashMap = new HashMap<>();
        boolean z = (str.contains("vod.9e03.com"));
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
                    str2 = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36";
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    boolean z2 = (str.contains("api.php/app"));
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                if (z2) {
                                    break;
                                } else {
                                    i3 = 48736;
                                    continue;
                                }
                            case 47384:
                                break;
                            case 47417:
                                boolean z3 = (str.contains("xgapp"));
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            boolean z4 = (str.contains("freekan"));
                                            int i5 = 48891;
                                            while (true) {
                                                i5 ^= 48908;
                                                switch (i5) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        boolean z5 = (str.contains("zsb"));
                                                        int i6 = 49790;
                                                        while (true) {
                                                            i6 ^= 49807;
                                                            switch (i6) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 84:
                                                                    boolean z6 = (str.contains("fkxs"));
                                                                    int i7 = 49914;
                                                                    while (true) {
                                                                        i7 ^= 49931;
                                                                        switch (i7) {
                                                                            case 497:
                                                                                if (z6) {
                                                                                    break;
                                                                                } else {
                                                                                    i7 = 50658;
                                                                                    continue;
                                                                                }
                                                                            case 1711:
                                                                                break;
                                                                            case 1736:
                                                                                break;
                                                                            case 1769:
                                                                                boolean z7 = (str.contains("xays"));
                                                                                int i8 = 50689;
                                                                                while (true) {
                                                                                    i8 ^= 50706;
                                                                                    switch (i8) {
                                                                                        case 19:
                                                                                            if (z7) {
                                                                                                break;
                                                                                            } else {
                                                                                                i8 = 50782;
                                                                                                continue;
                                                                                            }
                                                                                        case 45:
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case 76:
                                                                                            boolean z8 = (str.contains("xcys"));
                                                                                            int i9 = 50813;
                                                                                            while (true) {
                                                                                                i9 ^= 50830;
                                                                                                switch (i9) {
                                                                                                    case 18:
                                                                                                        break;
                                                                                                    case 53:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        if (z8) {
                                                                                                            break;
                                                                                                        } else {
                                                                                                            i9 = 51557;
                                                                                                            continue;
                                                                                                        }
                                                                                                    case 4075:
                                                                                                        boolean z9 = (str.contains("szys"));
                                                                                                        int i10 = 51588;
                                                                                                        while (true) {
                                                                                                            i10 ^= 51605;
                                                                                                            switch (i10) {
                                                                                                                case 17:
                                                                                                                    if (z9) {
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        i10 = 51681;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                                case 87:
                                                                                                                    break;
                                                                                                                case 116:
                                                                                                                    boolean z10 = (str.contains("dxys"));
                                                                                                                    int i11 = 51712;
                                                                                                                    while (true) {
                                                                                                                        i11 ^= 51729;
                                                                                                                        switch (i11) {
                                                                                                                            case 14:
                                                                                                                                break;
                                                                                                                            case 17:
                                                                                                                                if (z10) {
                                                                                                                                    break;
                                                                                                                                } else {
                                                                                                                                    i11 = 51805;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                            case 47:
                                                                                                                                break;
                                                                                                                            case 76:
                                                                                                                                boolean z11 = (str.contains("ytys"));
                                                                                                                                int i12 = 51836;
                                                                                                                                while (true) {
                                                                                                                                    i12 ^= 51853;
                                                                                                                                    switch (i12) {
                                                                                                                                        case 241:
                                                                                                                                            if (z11) {
                                                                                                                                                break;
                                                                                                                                            } else {
                                                                                                                                                i12 = 52580;
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                        case 1963:
                                                                                                                                            break;
                                                                                                                                        case 1992:
                                                                                                                                            break;
                                                                                                                                        case 2025:
                                                                                                                                            boolean z12 = (str.contains("qnys"));
                                                                                                                                            int i13 = 52611;
                                                                                                                                            while (true) {
                                                                                                                                                i13 ^= 52628;
                                                                                                                                                switch (i13) {
                                                                                                                                                    case 23:
                                                                                                                                                        if (!z12) {
                                                                                                                                                            break;
                                                                                                                                                        } else {
                                                                                                                                                            i13 = 52704;
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                    case 54:
                                                                                                                                                        break;
                                                                                                                                                    case 85:
                                                                                                                                                        boolean z13 = (str.contains(".vod"));
                                                                                                                                                        int i14 = 53510;
                                                                                                                                                        while (true) {
                                                                                                                                                            i14 ^= 53527;
                                                                                                                                                            switch (i14) {
                                                                                                                                                                case 17:
                                                                                                                                                                    if (!z13) {
                                                                                                                                                                        break;
                                                                                                                                                                    } else {
                                                                                                                                                                        i14 = 53603;
                                                                                                                                                                        continue;
                                                                                                                                                                    }
                                                                                                                                                                case 50:
                                                                                                                                                                    break;
                                                                                                                                                                case 83:
                                                                                                                                                                    str2 = "Dalvik/2.1.0";
                                                                                                                                                                    int i15 = 53758;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i15 ^= 53775;
                                                                                                                                                                        switch (i15) {
                                                                                                                                                                            case 1009:
                                                                                                                                                                                i15 = 54440;
                                                                                                                                                                                break;
                                                                                                                                                                            case 1703:
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 116:
                                                                                                                                                                    str2 = "okhttp/4.1.0";
                                                                                                                                                                    int i16 = 53634;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i16 ^= 53651;
                                                                                                                                                                        switch (i16) {
                                                                                                                                                                            case 17:
                                                                                                                                                                                i16 = 53665;
                                                                                                                                                                                break;
                                                                                                                                                                            case 50:
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                            i14 = 53572;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 116:
                                                                                                                                                        int i17 = 52735;
                                                                                                                                                        while (true) {
                                                                                                                                                            i17 ^= 52752;
                                                                                                                                                            switch (i17) {
                                                                                                                                                                case 14:
                                                                                                                                                                    break;
                                                                                                                                                                case 1007:
                                                                                                                                                                    i17 = 52766;
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                                i13 = 52673;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    i12 = 52549;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i11 = 51774;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            i10 = 51650;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                                i9 = 50875;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    i8 = 50751;
                                                                                }
                                                                                break;
                                                                        }
                                                                        i7 = 50627;
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    if (z5) {
                                                                        break;
                                                                    } else {
                                                                        i6 = 49883;
                                                                        continue;
                                                                    }
                                                            }
                                                            i6 = 49852;
                                                        }
                                                        str2 = "Dart/2.15 (dart:io)";
                                                        int i18 = 54533;
                                                        while (true) {
                                                            i18 ^= 54550;
                                                            switch (i18) {
                                                                case 19:
                                                                    i18 = 54564;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        if (!z4) {
                                                            break;
                                                        } else {
                                                            i5 = 49635;
                                                            continue;
                                                        }
                                                    case 32495:
                                                        int i19 = 49666;
                                                        while (true) {
                                                            i19 ^= 49683;
                                                            switch (i19) {
                                                                case 17:
                                                                    i19 = 49697;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                                i5 = 48953;
                                            }
                                            break;
                                        case 239:
                                            if (z3) {
                                                break;
                                            } else {
                                                i4 = 48860;
                                                continue;
                                            }
                                    }
                                    i4 = 48829;
                                }
                                break;
                            case 47483:
                                break;
                        }
                        i3 = 48705;
                    }
                    str2 = "Dart/2.14 (dart:io)";
                    break;
            }
            i = 1678;
        }
        (hashMap.put("User-Agent",str2));
        return hashMap;
    }

    private void KJ() {
        boolean z = (TextUtils.isEmpty(m617(this)));
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
                    return;
                case 239:
                    int i2 = (C0057.m2383(this).lastIndexOf("."));
                    StringBuilder sb = new StringBuilder();
                    (sb.append((C0057.m2383(this).substring(0,i2 + 1))));
                    (sb.append("Vodad"));
                    String str = (sb.toString());
                    this.N = ((new JSONObject(C0001.m32(str, m614(this, str))).optJSONObject("data")).optString("jiexi_key"));
                    return;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void SN(org.json.JSONObject r8, java.lang.String r9, java.util.ArrayList<org.json.JSONArray> r10) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.SN(org.json.JSONObject, java.lang.String, java.util.ArrayList):void");
    }

    public static String xiaFanSign(Map<String, String> map, String str) {
        TreeMap treeMap = new TreeMap(map);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((treeMap.entrySet()).iterator());
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
                        Map.Entry entry = (Map.Entry) (it.next());
                        String str2 = (String) (entry.getKey());
                        String str3 = (String) (entry.getValue());
                        boolean z2 = (str3.isEmpty());
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = !z2 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    break;
                                case 500:
                                    int i3 = (sb.length());
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = i3 > 0 ? 48736 : 48705;
                                            case 47384:
                                                break;
                                            case 47417:
                                                (sb.append("&"));
                                                break;
                                            case 47483:
                                        }
                                    }
                                    (sb.append(str2));
                                    (sb.append("="));
                                    (sb.append(str3));
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                                break;
                                            case 239:
                                                i5 = 48798;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 239:
                        StringBuilder sb2 = new StringBuilder();
                        (sb2.append(sb));
                        (sb2.append(str));
                        return C0023.m1463((sb2.toString()));
                }
            }
        }
    }

    /* renamed from: اطﺹﺎ  reason: contains not printable characters */
    public static String m600(Object obj, Object obj2) {
        int i = 753 ^ C0000.f0;
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
                    return ((AppYsV2) obj).tF((String) obj2);
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

    /* renamed from: تفنﺫ  reason: contains not printable characters */
    public static void m601(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = (-388) ^ C0035.f93;
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
                    ((AppYsV2) obj).N((String) obj2, (JSONObject) obj3, (JSONObject) obj4, (String) obj5);
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

    /* renamed from: تﻙﻅس  reason: contains not printable characters */
    public static List m602(Object obj) {
        int i = 596 ^ C0009.f9;
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
                    return ((AppYsV2) obj).i;
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

    /* renamed from: حﻭﺭف  reason: contains not printable characters */
    public static Pattern m603() {
        int i = (-675) ^ C0038.f96;
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
                    return Gc;
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

    /* renamed from: ذبشﻁ  reason: contains not printable characters */
    public static String m604(Object obj) {
        int i = (-767) ^ C0037.f95;
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
                    return ((AppYsV2) obj).zH;
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

    /* renamed from: رﻩظد  reason: contains not printable characters */
    public static String m606(Object obj, Object obj2) {
        int i = (-556) ^ C0004.f4;
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
                    return ((AppYsV2) obj).M((String) obj2);
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

    /* renamed from: سبغﺥ  reason: contains not printable characters */
    public static void m607(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 812 ^ C0022.f80;
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
                    ((AppYsV2) obj).SN((JSONObject) obj2, (String) obj3, (ArrayList) obj4);
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

    /* renamed from: طﺙغﻡ  reason: contains not printable characters */
    public static Pattern[] m608() {
        int i = (-821) ^ C0025.f83;
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
                    return q;
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

    /* renamed from: غضسﺫ  reason: contains not printable characters */
    public static void m609(Object obj) {
        int i = (-821) ^ C0025.f83;
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

    /* renamed from: ـدصﻡ  reason: contains not printable characters */
    public static String m610(Object obj, Object obj2) {
        int i = (-767) ^ C0037.f95;
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
                    return ((AppYsV2) obj).G4((JSONArray) obj2);
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

    /* renamed from: ﺏهﻝﺹ  reason: contains not printable characters */
    public static void m611(Object obj) {
        int i = 930 ^ C0038.f96;
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
                    SpiderDebug.log((String) obj);
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

    /* renamed from: ﺏﻁﻙط  reason: contains not printable characters */
    public static String m612(Object obj, Object obj2, Object obj3) {
        int i = (-821) ^ C0025.f83;
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
                    return ((AppYsV2) obj).i((String) obj2, (JSONObject) obj3);
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

    /* renamed from: ﺥبطل  reason: contains not printable characters */
    public static Pattern m613() {
        int i = 515 ^ C0028.f86;
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
                    return M;
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

    /* renamed from: ﺥﺯسﺙ  reason: contains not printable characters */
    public static HashMap m614(Object obj, Object obj2) {
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
                    return ((AppYsV2) obj).Gc((String) obj2);
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

    /* renamed from: ﺩﺭسل  reason: contains not printable characters */
    public static String m615(Object obj, Object obj2) {
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
                    return ((AppYsV2) obj).q((String) obj2);
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

    /* renamed from: ﺯظﺕح  reason: contains not printable characters */
    public static String m616(Object obj, Object obj2) {
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
                    return ((AppYsV2) obj).yq((String) obj2);
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

    /* renamed from: ﺵحﺙخ  reason: contains not printable characters */
    public static String m617(Object obj) {
        int i = (-556) ^ C0004.f4;
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
                    return ((AppYsV2) obj).N;
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

    /* renamed from: ﺵعكث  reason: contains not printable characters */
    public static Pattern m618() {
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
                    return KJ;
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

    /* renamed from: ﺵنغﻱ  reason: contains not printable characters */
    public static String m619(Object obj, Object obj2) {
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
                    return ((AppYsV2) obj).zH((String) obj2);
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

    /* renamed from: ﺹضهﻉ  reason: contains not printable characters */
    public static JSONObject m620(Object obj, Object obj2, Object obj3) {
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
                    return ((AppYsV2) obj).t0((ArrayList) obj2, (String) obj3);
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

    /* renamed from: ﻉـنغ  reason: contains not printable characters */
    public static boolean m621(Object obj) {
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
                    return ((AppYsV2) obj).SN;
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻍسﻙﺫ  reason: contains not printable characters */
    public static void m622(Object obj) {
        int i = 753 ^ C0000.f0;
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
                    ((AppYsV2) obj).KJ();
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
        int i4 = 354 ^ C0026.f84;
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

    /* renamed from: ﻡﻩﻱا  reason: contains not printable characters */
    public static HashMap m623(Object obj) {
        int i = 624 ^ C0012.f12;
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
                    return ((AppYsV2) obj).t0;
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

    /* renamed from: ﻩخفﺱ  reason: contains not printable characters */
    public static boolean m624(Object obj, Object obj2) {
        int i = (-31) ^ C0006.f6;
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
                    return ((AppYsV2) obj).G((String) obj2);
                case 239:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                break;
                            case 54:
                                return false;
                        }
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    /* renamed from: ﻩغقش  reason: contains not printable characters */
    public static String m625(Object obj) {
        int i = (-31) ^ C0041.f99;
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
                    return ((AppYsV2) obj).tF;
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

    /* renamed from: ﻭﺯﻡﺫ  reason: contains not printable characters */
    public static String m626(Object obj, Object obj2, Object obj3) {
        int i = 125 ^ C0037.f95;
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
                    return ((AppYsV2) obj).B((String) obj2, (String) obj3);
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

    final String M(String str) {
        StringBuilder sb;
        String str2;
        boolean z = (str.contains("api.php/app"));
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
                    boolean z2 = (str.contains("xgapp"));
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
                                boolean z3 = (str.contains(".vod"));
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            return "";
                                        case 76:
                                            boolean z4 = (str.contains("iopenyun"));
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        sb = C0052.m2253(str);
                                                        str2 = "/detail?vod_id=";
                                                        int i5 = 49790;
                                                        while (true) {
                                                            i5 ^= 49807;
                                                            switch (i5) {
                                                                case 18:
                                                                    break;
                                                                case 241:
                                                                    i5 = 49821;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        if (!z4) {
                                                            break;
                                                        } else {
                                                            i4 = 49635;
                                                            continue;
                                                        }
                                                    case 32495:
                                                        sb = C0052.m2253(str);
                                                        str2 = "/detailID?vod_id=";
                                                        int i6 = 49666;
                                                        while (true) {
                                                            i6 ^= 49683;
                                                            switch (i6) {
                                                                case 17:
                                                                    i6 = 49697;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                                i4 = 48953;
                                            }
                                            break;
                                        case 239:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i3 = 48860;
                                                continue;
                                            }
                                    }
                                    i3 = 48829;
                                }
                                break;
                            case 500:
                                int i7 = 1864;
                                while (true) {
                                    i7 ^= 1881;
                                    switch (i7) {
                                        case 17:
                                            i7 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        boolean z5 = (str.contains("dijiaxia"));
        int i8 = 49914;
        while (true) {
            i8 ^= 49931;
            switch (i8) {
                case 497:
                    if (!z5) {
                        break;
                    } else {
                        i8 = 50658;
                        continue;
                    }
                case 1711:
                    break;
                case 1736:
                    boolean z6 = (str.contains("1010dy"));
                    int i9 = 50689;
                    while (true) {
                        i9 ^= 50706;
                        switch (i9) {
                            case 19:
                                if (!z6) {
                                    break;
                                } else {
                                    i9 = 50782;
                                    continue;
                                }
                            case 45:
                                sb = C0052.m2253(str);
                                str2 = "video_detail?id=";
                                break;
                            case 50:
                                break;
                            case 76:
                                return "http://www.1010dy.cc/api.php/app/video_detail?id=";
                        }
                        i9 = 50751;
                    }
                    break;
                case 1769:
                    return "https://www.dijiaxia.com/api.php/app/video_detail?id=";
            }
            i8 = 50627;
        }
        (sb.append(str2));
        return (sb.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 612
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    protected final void N(java.lang.String r30, org.json.JSONObject r31, org.json.JSONObject r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 4630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.N(java.lang.String, org.json.JSONObject, org.json.JSONObject, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 583
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String categoryContent(java.lang.String r24, java.lang.String r25, boolean r26, java.util.HashMap<java.lang.String, java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 2990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        try {
            StringBuilder sb = new StringBuilder();
            (sb.append(m606(this, C0057.m2383(this))));
            (sb.append((String) (list.get(0))));
            String str = m616(this, (sb.toString()));
            m611(str);
            JSONObject jSONObject = new JSONObject(C0001.m32(str, m614(this, str)));
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            m601(this, C0057.m2383(this), jSONObject, jSONObject3, (String) (list.get(0)));
            JSONArray jSONArray = new JSONArray();
            (jSONArray.put(jSONObject3));
            (jSONObject2.put("list",jSONArray));
            return (jSONObject2.toString());
        } catch (Exception e) {
            m609(e);
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 615
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String homeContent(boolean r36) {
        /*
            Method dump skipped, instructions count: 2892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.homeContent(boolean):java.lang.String");
    }

    public String homeVideoContent() {
        boolean z;
        int i = 1771;
        int i2 = 0;
        String str = "title";
        try {
            String str2 = m615(this, C0057.m2383(this));
            boolean z2 = (str2.isEmpty());
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        if (!z2) {
                            break;
                        } else {
                            i3 = 1709;
                            continue;
                        }
                    case 204:
                        StringBuilder sb = new StringBuilder();
                        (sb.append(m600(this, C0057.m2383(this))));
                        (sb.append("movie&page=1&area=&type=&start="));
                        str2 = (sb.toString());
                        z = true;
                        i = 1740;
                        while (true) {
                            i ^= 1757;
                            switch (i) {
                                case 17:
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        z = false;
                        break;
                    default:
                        continue;
                }
                i3 = 1678;
            }
            String str3 = m616(this, str2);
            m611(str3);
            JSONObject jSONObject = new JSONObject(C0001.m32(str3, m614(this, str3)));
            JSONArray jSONArray = new JSONArray();
            String str4 = "vod_remarks";
            String str5 = "vod_pic";
            String str6 = "vod_id";
            String str7 = "vod_name";
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        if (!z) {
                            break;
                        } else {
                            i4 = 48736;
                            continue;
                        }
                    case 47384:
                        ArrayList arrayList = new ArrayList();
                        m607(this, jSONObject, "vlist", arrayList);
                        boolean z3 = (arrayList.isEmpty());
                        int i5 = 49914;
                        while (true) {
                            i5 ^= 49931;
                            switch (i5) {
                                case 497:
                                    if (!z3) {
                                        break;
                                    } else {
                                        i5 = 50658;
                                        continue;
                                    }
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    m607(this, jSONObject, "vod_list", arrayList);
                                    break;
                                default:
                                    continue;
                            }
                            i5 = 50627;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = (arrayList.iterator());
                        while (true) {
                            boolean z4 = (it.hasNext());
                            int i6 = 50689;
                            while (true) {
                                i6 ^= 50706;
                                switch (i6) {
                                    case 19:
                                        i6 = z4 ? 50782 : 50751;
                                    case 45:
                                        break;
                                    case 50:
                                    case 76:
                                        JSONArray jSONArray2 = (JSONArray) (it.next());
                                        int i7 = 0;
                                        while (true) {
                                            int i8 = (jSONArray2.length());
                                            int i9 = 50813;
                                            while (true) {
                                                i9 ^= 50830;
                                                switch (i9) {
                                                    case 18:
                                                    case 53:
                                                        break;
                                                    case 243:
                                                        i9 = i7 < i8 ? 51557 : 50875;
                                                    case 4075:
                                                        JSONObject jSONObject2 = (jSONArray2.getJSONObject(i7));
                                                        boolean z5 = C0010.m289((jSONObject2.getString(str7)));
                                                        int i10 = 51588;
                                                        while (true) {
                                                            i10 ^= 51605;
                                                            switch (i10) {
                                                                case 17:
                                                                    i10 = z5 ? 51681 : 51650;
                                                                case 54:
                                                                case 87:
                                                                    String str8 = (jSONObject2.getString(str6));
                                                                    boolean z6 = (arrayList2.contains(str8));
                                                                    int i11 = 51836;
                                                                    while (true) {
                                                                        i11 ^= 51853;
                                                                        switch (i11) {
                                                                            case 241:
                                                                                i11 = z6 ? 52580 : 52549;
                                                                            case 1963:
                                                                            case 1992:
                                                                                (arrayList2.add(str8));
                                                                                JSONObject jSONObject3 = new JSONObject();
                                                                                (jSONObject3.put(str6,str8));
                                                                                (jSONObject3.put(str7,(jSONObject2.getString(str7))));
                                                                                (jSONObject3.put(str5,(jSONObject2.getString(str5))));
                                                                                (jSONObject3.put(str4,(jSONObject2.getString(str4))));
                                                                                (jSONArray.put(jSONObject3));
                                                                                break;
                                                                            case 2025:
                                                                                int i12 = 52611;
                                                                                while (true) {
                                                                                    i12 ^= 52628;
                                                                                    switch (i12) {
                                                                                        case 23:
                                                                                            i12 = 52642;
                                                                                        case 54:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    int i13 = 51712;
                                                                    while (true) {
                                                                        i13 ^= 51729;
                                                                        switch (i13) {
                                                                            case 17:
                                                                                i13 = 51743;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        i7++;
                                                        int i14 = 52735;
                                                        while (true) {
                                                            i14 ^= 52752;
                                                            switch (i14) {
                                                                case 14:
                                                                    break;
                                                                case 1007:
                                                                    i14 = 52766;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                    case 47417:
                        JSONArray jSONArray3 = (jSONObject.getJSONArray("data"));
                        while (true) {
                            int i15 = (jSONArray3.length());
                            int i16 = 48767;
                            while (true) {
                                i16 ^= 48784;
                                switch (i16) {
                                    case 14:
                                    case 45:
                                        break;
                                    case 76:
                                        JSONObject jSONObject4 = (jSONArray3.getJSONObject(i2));
                                        boolean z7 = C0010.m289((jSONObject4.getString(str)));
                                        int i17 = 48891;
                                        while (true) {
                                            i17 ^= 48908;
                                            switch (i17) {
                                                case 22:
                                                case 53:
                                                    JSONObject jSONObject5 = new JSONObject();
                                                    (jSONObject5.put(str6,(jSONObject4.getString("nextlink"))));
                                                    (jSONObject5.put(str7,(jSONObject4.getString(str))));
                                                    (jSONObject5.put(str5,(jSONObject4.getString("pic"))));
                                                    (jSONObject5.put(str4,(jSONObject4.getString("state"))));
                                                    (jSONArray.put(jSONObject5));
                                                    break;
                                                case 503:
                                                    i17 = z7 ? 49635 : 48953;
                                                case 32495:
                                                    int i18 = 49666;
                                                    while (true) {
                                                        i18 ^= 49683;
                                                        switch (i18) {
                                                            case 17:
                                                                i18 = 49697;
                                                            case 50:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        i2++;
                                        int i19 = 49790;
                                        while (true) {
                                            i19 ^= 49807;
                                            switch (i19) {
                                                case 18:
                                                    break;
                                                case 241:
                                                    i19 = 49821;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i16 = i2 < i15 ? 48860 : 48829;
                                }
                            }
                        }
                        break;
                    case 47483:
                        break;
                }
                i4 = 48705;
            }
            JSONObject jSONObject6 = new JSONObject();
            (jSONObject6.put("list",jSONArray));
            return (jSONObject6.toString());
        } catch (Exception e) {
            m609(e);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
        r2 = new java.lang.StringBuilder();
        (r2.append(r1));
        (r2.append("筛选"));
        (r2.append(r0));
        (r2.append("+全部=+"));
        (r2.append(((r14.getString(r0)).replace(",","+"))));
        (r2.append("\n"));
        r1 = (r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012b, code lost:
        r1 = 49790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012e, code lost:
        r1 = r1 ^ 49807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0132, code lost:
        switch(r1) {
            case 18: goto L141;
            case 241: goto L142;
            default: goto L144;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0139, code lost:
        r1 = 49821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013e, code lost:
        r0 = 49914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
        r0 = r0 ^ 49931;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0145, code lost:
        switch(r0) {
            case 497: goto L146;
            case 1711: goto L96;
            default: goto L148;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0149, code lost:
        r0 = 50596;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.String i(java.lang.String r13, org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.i(java.lang.String, org.json.JSONObject):java.lang.String");
    }

    public void init(Context context, String str) {
        String str2 = "adFlag";
        String str3 = "sign";
        String str4 = "apiKey";
        String str5 = "rc4";
        String str6 = "url";
        AppYsV2.super.init(context, str);
        boolean z = (str.startsWith("http"));
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
                    this.yq = str;
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    try {
                        JSONObject jSONObject = new JSONObject(C0049.m2191(str));
                        boolean z2 = (jSONObject.has(str6));
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    if (!z2) {
                                        break;
                                    } else {
                                        i3 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    break;
                                case 47417:
                                    this.yq = (jSONObject.getString(str6));
                                    break;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 48705;
                        }
                        boolean z3 = (jSONObject.has(str5));
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    this.SN = (jSONObject.getBoolean(str5));
                                    break;
                                case 239:
                                    if (!z3) {
                                        break;
                                    } else {
                                        i4 = 48860;
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                            i4 = 48829;
                        }
                        boolean z4 = (jSONObject.has(str4));
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    if (!z4) {
                                        break;
                                    } else {
                                        i5 = 49635;
                                        continue;
                                    }
                                case 32495:
                                    this.tF = (jSONObject.getString(str4));
                                    break;
                                default:
                                    continue;
                            }
                            i5 = 48953;
                        }
                        boolean z5 = (jSONObject.has(str3));
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    if (!z5) {
                                        break;
                                    } else {
                                        i6 = 49759;
                                        continue;
                                    }
                                case 50:
                                    break;
                                case 76:
                                    this.zH = (jSONObject.getString(str3));
                                    break;
                                case 83:
                                    break;
                                default:
                                    continue;
                            }
                            i6 = 49728;
                        }
                        boolean z6 = (jSONObject.has(str2));
                        int i7 = 49790;
                        while (true) {
                            i7 ^= 49807;
                            switch (i7) {
                                case 18:
                                    break;
                                case 51:
                                    break;
                                case 84:
                                    this.i = (Arrays.asList(((jSONObject.getString(str2)).split("\\|"))));
                                    int i8 = 49914;
                                    while (true) {
                                        i8 ^= 49931;
                                        switch (i8) {
                                            case 497:
                                                i8 = 50596;
                                                break;
                                            case 1711:
                                                break;
                                        }
                                    }
                                    break;
                                case 241:
                                    if (!z6) {
                                        break;
                                    } else {
                                        i7 = 49883;
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                            i7 = 49852;
                        }
                    } catch (JSONException e) {
                        (e.printStackTrace());
                        break;
                    }
                    break;
            }
            i = 1678;
        }
        int i10 = 50689;
        while (true) {
            i10 ^= 50706;
            switch (i10) {
                case 19:
                    
                        break;
                    
                case 45:
                    return;
                case 50:
                    break;
                case 76:
                    return;
            }
            i10 = 50751;
        }
    }

    public boolean isVideoFormat(String str) {
        return C0042.m2005(str);
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        ArrayList arrayList;
        String str3 = "";
        C0029.m1662();
        C0056.m2351(true);
        try {
            ArrayList arrayList2 = (ArrayList) (m623(this).get((str.replace("免费分享",str3))));
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (arrayList2 != null) {
                            break;
                        } else {
                            i = 1709;
                            continue;
                        }
                    case 204:
                        arrayList = new ArrayList();
                        break;
                    case 239:
                        arrayList = arrayList2;
                        break;
                    default:
                        continue;
                }
                i = 1678;
            }
            boolean z = (arrayList.isEmpty());
            int i2 = 1740;
            while (true) {
                i2 ^= 1757;
                switch (i2) {
                    case 17:
                        if (z) {
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
                        JSONObject jSONObject = m620(this, arrayList, str2);
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    if (jSONObject == null) {
                                        break;
                                    } else {
                                        i3 = 48736;
                                        continue;
                                    }
                                case 47384:
                                    break;
                                case 47417:
                                    return (jSONObject.toString());
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i3 = 48705;
                        }
                    default:
                        continue;
                }
                i2 = 1802;
            }
            boolean z2 = C0042.m2005(str2);
            String str4 = "danmaku";
            String str5 = "url";
            String str6 = "parse";
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                        break;
                    case 45:
                        JSONObject jSONObject2 = new JSONObject();
                        (jSONObject2.put(str6,1));
                        (jSONObject2.put("jx","1"));
                        (jSONObject2.put(str5,str2));
                        (jSONObject2.put(str4,C0033.m1778(str2)));
                        return (jSONObject2.toString());
                    case 76:
                        JSONObject jSONObject3 = new JSONObject();
                        boolean z3 = (str2.contains("m3u8"));
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    if (!z3) {
                                        break;
                                    } else {
                                        i5 = 49635;
                                        continue;
                                    }
                                case 32495:
                                    str2 = C0048.m2137(str2, null);
                                    break;
                                default:
                                    continue;
                            }
                            i5 = 48953;
                        }
                        (jSONObject3.put(str6,0));
                        (jSONObject3.put("playUrl",str3));
                        (jSONObject3.put(str5,str2));
                        (jSONObject3.put(str4,C0033.m1778(str2)));
                        return (jSONObject3.toString());
                    case 239:
                        if (!z2) {
                            break;
                        } else {
                            i4 = 48860;
                            continue;
                        }
                }
                i4 = 48829;
            }
        } catch (Exception e) {
            m609(e);
            return str3;
        }
    }

    final String q(String str) {
        StringBuilder sb;
        String str2;
        boolean z = (str.contains("api.php/app"));
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
                    boolean z2 = (str.contains("xgapp"));
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
                                boolean z3 = (str.contains(".vod"));
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            return "";
                                        case 76:
                                            sb = C0052.m2253(str);
                                            str2 = "/vodPhbAll";
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i4 = 48922;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i3 = 48860;
                                                continue;
                                            }
                                    }
                                    i3 = 48829;
                                }
                                break;
                            case 500:
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            i5 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        sb = C0052.m2253(str);
        str2 = "index_video?token=";
        (sb.append(str2));
        return (sb.toString());
    }

    public String searchContent(String str, boolean z) {
        String str2;
        int i;
        String str3 = "vod_id";
        String str4 = "list";
        String str5 = "data";
        try {
            String str6 = m616(this, m626(this, C0057.m2383(this), C0009.m260(str, "UTF-8")));
            JSONObject jSONObject = new JSONObject(C0001.m32(str6, m614(this, str6)));
            JSONArray jSONArray = null;
            JSONArray jSONArray2 = new JSONArray();
            boolean z2 = (jSONObject.has(str4));
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (!z2) {
                            break;
                        } else {
                            i2 = 1709;
                            continue;
                        }
                    case 204:
                        boolean z3 = (jSONObject.get(str4)) instanceof JSONArray;
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    if (!z3) {
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
                                    jSONArray = (jSONObject.getJSONArray(str4));
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
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
            boolean z4 = (jSONObject.has(str5));
            int i5 = 48767;
            while (true) {
                i5 ^= 48784;
                switch (i5) {
                    case 14:
                        break;
                    case 45:
                        break;
                    case 76:
                        boolean z5 = (jSONObject.get(str5)) instanceof JSONObject;
                        int i6 = 48891;
                        while (true) {
                            i6 ^= 48908;
                            switch (i6) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    if (!z5) {
                                        break;
                                    } else {
                                        i6 = 49635;
                                        continue;
                                    }
                                case 32495:
                                    boolean z6 = ((jSONObject.getJSONObject(str5)).has(str4));
                                    int i7 = 49666;
                                    while (true) {
                                        i7 ^= 49683;
                                        switch (i7) {
                                            case 17:
                                                if (!z6) {
                                                    break;
                                                } else {
                                                    i7 = 49759;
                                                    continue;
                                                }
                                            case 50:
                                                break;
                                            case 76:
                                                boolean z7 = ((jSONObject.getJSONObject(str5)).get(str4)) instanceof JSONArray;
                                                int i8 = 49790;
                                                while (true) {
                                                    i8 ^= 49807;
                                                    switch (i8) {
                                                        case 18:
                                                            break;
                                                        case 51:
                                                            break;
                                                        case 84:
                                                            jSONArray = ((jSONObject.getJSONObject(str5)).getJSONArray(str4));
                                                            int i9 = 49914;
                                                            while (true) {
                                                                i9 ^= 49931;
                                                                switch (i9) {
                                                                    case 497:
                                                                        i9 = 50596;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 241:
                                                            if (!z7) {
                                                                break;
                                                            } else {
                                                                i8 = 49883;
                                                                continue;
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                    i8 = 49852;
                                                }
                                                break;
                                            case 83:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i7 = 49728;
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i6 = 48953;
                        }
                        break;
                    case 239:
                        if (!z4) {
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
            boolean z8 = (jSONObject.has(str5));
            int i10 = 50689;
            while (true) {
                i10 ^= 50706;
                switch (i10) {
                    case 19:
                        if (!z8) {
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
                        boolean z9 = (jSONObject.get(str5)) instanceof JSONArray;
                        int i11 = 50813;
                        while (true) {
                            i11 ^= 50830;
                            switch (i11) {
                                case 18:
                                    break;
                                case 53:
                                    break;
                                case 243:
                                    if (!z9) {
                                        break;
                                    } else {
                                        i11 = 51557;
                                        continue;
                                    }
                                case 4075:
                                    jSONArray = (jSONObject.getJSONArray(str5));
                                    break;
                                default:
                                    continue;
                            }
                            i11 = 50875;
                        }
                    default:
                        continue;
                }
                i10 = 50751;
            }
            int i12 = 51588;
            while (true) {
                i12 ^= 51605;
                switch (i12) {
                    case 17:
                        if (jSONArray == null) {
                            break;
                        } else {
                            i12 = 51681;
                            continue;
                        }
                    case 54:
                        break;
                    case 87:
                        break;
                    case 116:
                        int i13 = 0;
                        while (true) {
                            int i14 = i13;
                            int i15 = (jSONArray.length());
                            int i16 = 51712;
                            while (true) {
                                i16 ^= 51729;
                                switch (i16) {
                                    case 14:
                                    case 17:
                                        i16 = i14 < i15 ? 51805 : 51774;
                                    case 47:
                                        break;
                                    case 76:
                                        try {
                                            JSONObject jSONObject2 = (jSONArray.getJSONObject(i14));
                                            JSONObject jSONObject3 = new JSONObject();
                                            boolean z10 = (jSONObject2.has(str3));
                                            String str7 = "vod_remarks";
                                            String str8 = "vod_pic";
                                            String str9 = "vod_name";
                                            int i17 = 51836;
                                            while (true) {
                                                i17 ^= 51853;
                                                switch (i17) {
                                                    case 241:
                                                        i17 = z10 ? 52580 : 52549;
                                                    case 1963:
                                                    case 1992:
                                                        String str10 = (jSONObject2.getString("title"));
                                                        boolean z11 = C0010.m289(str10);
                                                        int i18 = 53634;
                                                        while (true) {
                                                            i18 ^= 53651;
                                                            switch (i18) {
                                                                case 17:
                                                                    i18 = z11 ? 53727 : 53696;
                                                                case 50:
                                                                case 76:
                                                                    int i19 = 53758;
                                                                    while (true) {
                                                                        i19 ^= 53775;
                                                                        switch (i19) {
                                                                            case 1009:
                                                                                i19 = 54440;
                                                                            case 1703:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    (jSONObject3.put(str3,(jSONObject2.getString("nextlink"))));
                                                                    (jSONObject3.put(str9,str10));
                                                                    (jSONObject3.put(str8,(jSONObject2.getString("pic"))));
                                                                    str2 = (jSONObject2.getString("state"));
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 2025:
                                                        String str11 = (jSONObject2.getString(str9));
                                                        boolean z12 = C0010.m289(str11);
                                                        int i20 = 52611;
                                                        while (true) {
                                                            i20 ^= 52628;
                                                            switch (i20) {
                                                                case 23:
                                                                    i20 = z12 ? 52704 : 52673;
                                                                case 54:
                                                                case 85:
                                                                    (jSONObject3.put(str3,(jSONObject2.getString(str3))));
                                                                    (jSONObject3.put(str9,str11));
                                                                    (jSONObject3.put(str8,(jSONObject2.getString(str8))));
                                                                    str2 = (jSONObject2.getString(str7));
                                                                    int i21 = 53510;
                                                                    while (true) {
                                                                        i21 ^= 53527;
                                                                        switch (i21) {
                                                                            case 17:
                                                                                i21 = 53541;
                                                                            case 50:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    int i22 = 52735;
                                                                    while (true) {
                                                                        i22 ^= 52752;
                                                                        switch (i22) {
                                                                            case 14:
                                                                                break;
                                                                            case 1007:
                                                                                i22 = 52766;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            (jSONObject3.put(str7,str2));
                                            (jSONArray2.put(jSONObject3));
                                            i = 54533;
                                        } catch (Exception e) {
                                            m609(e);
                                        }
                                        while (true) {
                                            i ^= 54550;
                                            switch (i) {
                                                case 19:
                                                    i = 54564;
                                                case 50:
                                                    i13 = i14 + 1;
                                                    int i23 = 54657;
                                                    while (true) {
                                                        i23 ^= 54674;
                                                        switch (i23) {
                                                            case 19:
                                                                i23 = 54688;
                                                            case 50:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i12 = 51650;
            }
            JSONObject jSONObject4 = new JSONObject();
            (jSONObject4.put(str4,jSONArray2));
            return (jSONObject4.toString());
        } catch (Exception e2) {
            m609(e2);
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 357
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    protected final org.json.JSONObject t0(java.util.ArrayList r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.t0(java.util.ArrayList, java.lang.String):org.json.JSONObject");
    }

    final String tF(String str) {
        StringBuilder sb;
        String str2;
        boolean z = (str.contains("api.php/app"));
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
                    boolean z2 = (str.contains("xgapp"));
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
                                boolean z3 = (str.contains(".vod"));
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            sb = C0052.m2253(str);
                                            str2 = "?ac=list&class=";
                                            int i4 = 49914;
                                            while (true) {
                                                i4 ^= 49931;
                                                switch (i4) {
                                                    case 497:
                                                        i4 = 50596;
                                                        break;
                                                    case 1711:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 76:
                                            boolean z4 = (str.contains("iopenyun"));
                                            int i5 = 48891;
                                            while (true) {
                                                i5 ^= 48908;
                                                switch (i5) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        sb = C0052.m2253(str);
                                                        str2 = "?type=";
                                                        int i6 = 49790;
                                                        while (true) {
                                                            i6 ^= 49807;
                                                            switch (i6) {
                                                                case 18:
                                                                    break;
                                                                case 241:
                                                                    i6 = 49821;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        if (!z4) {
                                                            break;
                                                        } else {
                                                            i5 = 49635;
                                                            continue;
                                                        }
                                                    case 32495:
                                                        sb = C0052.m2253(str);
                                                        str2 = "/list?type=";
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
                                                i5 = 48953;
                                            }
                                            break;
                                        case 239:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i3 = 48860;
                                                continue;
                                            }
                                    }
                                    i3 = 48829;
                                }
                                break;
                            case 500:
                                int i8 = 1864;
                                while (true) {
                                    i8 ^= 1881;
                                    switch (i8) {
                                        case 17:
                                            i8 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        boolean z5 = (str.contains("dijiaxia"));
        int i9 = 50689;
        while (true) {
            i9 ^= 50706;
            switch (i9) {
                case 19:
                    if (!z5) {
                        break;
                    } else {
                        i9 = 50782;
                        continue;
                    }
                case 45:
                    sb = C0052.m2253(str);
                    str2 = "video?tid=";
                    break;
                case 50:
                    break;
                case 76:
                    return "http://www.dijiaxia.com/api.php/app/video?tid=";
            }
            i9 = 50751;
        }
        (sb.append(str2));
        return (sb.toString());
    }

    protected final String yq(String str) {
        String str2;
        String str3;
        String str4;
        int i;
        boolean z = (TextUtils.isEmpty(m625(this)));
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
                    return str;
                case 239:
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH");
                    SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("mm");
                    SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyyMMdd");
                    String str5 = (simpleDateFormat.format(date));
                    String str6 = (simpleDateFormat2.format(date));
                    String str7 = (simpleDateFormat3.format(date));
                    boolean z2 = ("date".equals(m625(this)));
                    String str8 = ":";
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
                                StringBuilder sb = new StringBuilder();
                                (sb.append(str5));
                                (sb.append(str8));
                                (sb.append(str6));
                                (sb.append(str8));
                                (sb.append(str5));
                                (sb.append(str8));
                                (sb.append(str7));
                                (sb.append(str8));
                                (sb.append(m625(this)));
                                str2 = (sb.toString());
                                break;
                            case 500:
                                StringBuilder sb2 = new StringBuilder();
                                (sb2.append(str5));
                                (sb2.append(str8));
                                (sb2.append(str6));
                                (sb2.append(str8));
                                (sb2.append(str5));
                                (sb2.append(str8));
                                (sb2.append(str7));
                                (sb2.append(str8));
                                (sb2.append((simpleDateFormat4.format(date))));
                                str2 = (sb2.toString());
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                        i3 = 1802;
                    }
                    String str9 = C0052.m2266(str2);
                    String str10 = (String.valueOf(System.currentTimeMillis() / 1000));
                    boolean z3 = (TextUtils.isEmpty(m604(this)));
                    String str11 = "\\?";
                    int i5 = 48767;
                    while (true) {
                        i5 ^= 48784;
                        switch (i5) {
                            case 14:
                                break;
                            case 45:
                                String[] strArr = (str.split(str11,-1));
                                String str12 = strArr[0];
                                int length = strArr.length;
                                String str13 = "";
                                boolean z4 = true;
                                int i6 = 49666;
                                while (true) {
                                    i6 ^= 49683;
                                    switch (i6) {
                                        case 17:
                                            if (length <= 1) {
                                                break;
                                            } else {
                                                i6 = 49759;
                                                continue;
                                            }
                                        case 50:
                                            break;
                                        case 76:
                                            str3 = strArr[1];
                                            int i7 = 49790;
                                            while (true) {
                                                i7 ^= 49807;
                                                switch (i7) {
                                                    case 18:
                                                        break;
                                                    case 241:
                                                        i7 = 49821;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 83:
                                            str3 = str13;
                                            break;
                                    }
                                    i6 = 49728;
                                }
                                HashMap hashMap = new HashMap();
                                boolean z5 = (str3.isEmpty());
                                String str14 = "=";
                                String str15 = "&";
                                int i8 = 49914;
                                while (true) {
                                    i8 ^= 49931;
                                    switch (i8) {
                                        case 497:
                                            if (z5) {
                                                break;
                                            } else {
                                                i8 = 50658;
                                                continue;
                                            }
                                        case 1711:
                                            break;
                                        case 1736:
                                            break;
                                        case 1769:
                                            String[] strArr2 = (str3.split(str15));
                                            int length2 = strArr2.length;
                                            int i9 = 0;
                                            while (true) {
                                                int i10 = i9;
                                                int i11 = 50689;
                                                while (true) {
                                                    i11 ^= 50706;
                                                    switch (i11) {
                                                        case 19:
                                                            i11 = i10 < length2 ? 50782 : 50751;
                                                        case 45:
                                                            break;
                                                        case 50:
                                                        case 76:
                                                            String[] strArr3 = (strArr2[i10].split(str14,2));
                                                            String str16 = strArr3[0];
                                                            int length3 = strArr3.length;
                                                            int i12 = 50813;
                                                            while (true) {
                                                                i12 ^= 50830;
                                                                switch (i12) {
                                                                    case 18:
                                                                    case 53:
                                                                        str4 = str13;
                                                                        break;
                                                                    case 243:
                                                                        i12 = length3 > 1 ? 51557 : 50875;
                                                                    case 4075:
                                                                        str4 = strArr3[1];
                                                                        int i13 = 51588;
                                                                        while (true) {
                                                                            i13 ^= 51605;
                                                                            switch (i13) {
                                                                                case 17:
                                                                                    i13 = 51619;
                                                                                case 54:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            try {
                                                                str4 = C0039.m1929(str4, "UTF-8");
                                                                i = 51712;
                                                            } catch (UnsupportedEncodingException e) {
                                                                (e.printStackTrace());
                                                            }
                                                            while (true) {
                                                                i ^= 51729;
                                                                switch (i) {
                                                                    case 14:
                                                                        (hashMap.put(str16,str4));
                                                                        i9 = i10 + 1;
                                                                        int i14 = 51836;
                                                                        while (true) {
                                                                            i14 ^= 51853;
                                                                            switch (i14) {
                                                                                case 241:
                                                                                    i14 = 52518;
                                                                                case 1963:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 17:
                                                                        i = 51743;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                    i8 = 50627;
                                }
                                (hashMap.put("keytime",str10));
                                (hashMap.put("apikey",str9));
                                (hashMap.put("timestamp",str10));
                                String str17 = C0002.m58(hashMap, m604(this));
                                StringBuilder sb3 = new StringBuilder(str12);
                                boolean z6 = (hashMap.isEmpty());
                                int i15 = 52611;
                                while (true) {
                                    i15 ^= 52628;
                                    switch (i15) {
                                        case 23:
                                            if (z6) {
                                                break;
                                            } else {
                                                i15 = 52704;
                                                continue;
                                            }
                                        case 54:
                                            break;
                                        case 85:
                                            break;
                                        case 116:
                                            (sb3.append("?"));
                                            Iterator it = ((hashMap.entrySet()).iterator());
                                            while (true) {
                                                boolean z7 = (it.hasNext());
                                                int i16 = 52735;
                                                while (true) {
                                                    i16 ^= 52752;
                                                    switch (i16) {
                                                        case 14:
                                                        case 45:
                                                            break;
                                                        case 1007:
                                                            i16 = z7 ? 53479 : 52797;
                                                        case 7927:
                                                            Map.Entry entry = (Map.Entry) (it.next());
                                                            int i17 = 53510;
                                                            while (true) {
                                                                i17 ^= 53527;
                                                                switch (i17) {
                                                                    case 17:
                                                                        i17 = !z4 ? 53603 : 53572;
                                                                    case 50:
                                                                    case 83:
                                                                        break;
                                                                    case 116:
                                                                        (sb3.append(str15));
                                                                        break;
                                                                }
                                                            }
                                                            (sb3.append((String) (entry.getKey())));
                                                            (sb3.append(str14));
                                                            (sb3.append((String) (entry.getValue())));
                                                            z4 = false;
                                                            int i18 = 53634;
                                                            while (true) {
                                                                i18 ^= 53651;
                                                                switch (i18) {
                                                                    case 17:
                                                                        i18 = 53665;
                                                                    case 50:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                    }
                                    i15 = 52673;
                                }
                                StringBuilder sb4 = new StringBuilder();
                                (sb4.append(sb3));
                                (sb4.append("&datasign="));
                                (sb4.append(str17));
                                return (sb4.toString());
                            case 76:
                                boolean z8 = (str.contains(str11));
                                String str18 = "&apikey=";
                                int i19 = 48891;
                                while (true) {
                                    i19 ^= 48908;
                                    switch (i19) {
                                        case 22:
                                            break;
                                        case 53:
                                            StringBuilder sb5 = new StringBuilder();
                                            (sb5.append(str));
                                            (sb5.append("?keytime="));
                                            (sb5.append(str10));
                                            (sb5.append(str18));
                                            (sb5.append(str9));
                                            return (sb5.toString());
                                        case 503:
                                            if (!z8) {
                                                break;
                                            } else {
                                                i19 = 49635;
                                                continue;
                                            }
                                        case 32495:
                                            StringBuilder sb6 = new StringBuilder();
                                            (sb6.append(str));
                                            (sb6.append("&keytime="));
                                            (sb6.append(str10));
                                            (sb6.append(str18));
                                            (sb6.append(str9));
                                            return (sb6.toString());
                                    }
                                    i19 = 48953;
                                }
                                break;
                            case 239:
                                if (!z3) {
                                    break;
                                } else {
                                    i5 = 48860;
                                    continue;
                                }
                        }
                        i5 = 48829;
                    }
                    break;
            }
            i2 = 1678;
        }
    }

    final String zH(String str) {
        StringBuilder sb;
        String str2;
        boolean z = (str.contains("api.php/app"));
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
                    boolean z2 = (str.contains("xgapp"));
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
                                boolean z3 = (str.contains(".vod"));
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            return "";
                                        case 76:
                                            sb = C0052.m2253(str);
                                            str2 = "/types";
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i4 = 48922;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            if (!z3) {
                                                break;
                                            } else {
                                                i3 = 48860;
                                                continue;
                                            }
                                    }
                                    i3 = 48829;
                                }
                                break;
                            case 500:
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            i5 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        sb = C0052.m2253(str);
        str2 = "nav?token=";
        (sb.append(str2));
        return (sb.toString());
    }
}
