package com.github.catvod.spider;

import android.app.Activity;
import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0027;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0098ew;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class MyDrive extends Pan {

    private String g1;
    private int s;
    private String O = "";
    private String n = "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/03/01/805f80fcfad639223558543b4fd52ac6.th.png";

    public MyDrive() {
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

    private String B(String str) {
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        JSONArray jSONArray = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        jSONObject = new JSONObject(str);
        str = "data";
        jSONObject2 = (jSONObject.getJSONObject(str));
        str = "list";
        jSONArray = (jSONObject2.getJSONArray(str));
        str = (jSONArray.toString());
        return str;
}

    private String F5(String str, String str2) {
        Object[] objArr = null;
        HashMap hashMap = null;
        String str4 = null;
        String str5 = null;
        Object obj = null;
        String str6 = null;
        String str7 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        str5 = "夸父";
        str6 = "https://drive-pc.quark.cn/1/clouddrive/file/search?pr=ucpro&fr=pc&uc_param_str=&q=%s&_page=1&_size=10&_fetch_total=1&_sort=file_type:asc,file_name:asc&_is_hl=1";
        str7 = "优汐";
        str4 = "https://pc-api.uc.cn/1/clouddrive/file/search?pr=UCBrowser&fr=pc&q=%s&_page=1&_size=10&_fetch_total=1&_sort=file_type:asc,updated_at:desc&_is_hl=1";
        hashMap = C0055.m2325(str5, str6, str7, str4);
        str5 = "阿狸";
        str6 = "https://api.aliyundrive.com/adrive/v3/file/search";
        obj = (hashMap.put(str5,str6));
        str7 = "嘟嘟";
        str4 = "https://pan.baidu.com/api/search?clienttype=0&app_id=250528&web=1&dp-logid=&order=name&desc=0&num=100&page=1&recursion=1&key=%s";
        obj = (hashMap.put(str7,str4));
        obj = (hashMap.get(str));
        str5 = (String) obj;
        objArr = new Object[1];
        str6 = C0010.m314(str2);
        objArr[0] = str6;
        str7 = (String.format(str5,objArr));
        return str7;
}

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 461
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private void G(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List<java.lang.String> r25, java.util.List<com.github.catvod.spider.merge.ME> r26) {
        /*
            Method dump skipped, instructions count: 1918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.MyDrive.G(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 533
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private void G4(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.List<java.lang.String> r27, java.util.List<com.github.catvod.spider.merge.ME> r28) {
        /*
            Method dump skipped, instructions count: 2584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.MyDrive.G4(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void");
    }

    private Boolean W(String str, int i) {
        boolean z;
        int i2 = (Integer.parseInt(((new JSONObject(str).getJSONObject("metadata")).getString("_total"))));
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 <= i) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    z = true;
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                i4 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                    break;
                case 239:
                    z = false;
                    break;
            }
            i3 = 1678;
        }
        return C0026.m1559(z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 541
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private void dT(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.List<java.lang.String> r27, java.util.List<com.github.catvod.spider.merge.ME> r28) {
        /*
            Method dump skipped, instructions count: 2642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.MyDrive.dT(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void");
    }

    public static String formatQuotedSkipEmpty(List<String> list) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (list == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z = (list.isEmpty());
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                StringBuilder sb = new StringBuilder();
                                Iterator it = (list.iterator());
                                boolean z2 = true;
                                while (true) {
                                    boolean z3 = (it.hasNext());
                                    int i3 = 48767;
                                    while (true) {
                                        i3 ^= 48784;
                                        switch (i3) {
                                            case 14:
                                            case 45:
                                                return (sb.toString());
                                            case 76:
                                                String str = (String) (it.next());
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                        case 53:
                                                            break;
                                                        case 503:
                                                            i4 = str != null ? 49635 : 48953;
                                                        case 32495:
                                                            boolean z4 = (str.isEmpty());
                                                            int i5 = 49666;
                                                            while (true) {
                                                                i5 ^= 49683;
                                                                switch (i5) {
                                                                    case 17:
                                                                        i5 = z4 ? 49759 : 49728;
                                                                    case 50:
                                                                    case 76:
                                                                        int i6 = 49790;
                                                                        while (true) {
                                                                            i6 ^= 49807;
                                                                            switch (i6) {
                                                                                case 18:
                                                                                    continue;
                                                                                case 241:
                                                                                    i6 = 49821;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        int i7 = 49914;
                                                                        while (true) {
                                                                            i7 ^= 49931;
                                                                            switch (i7) {
                                                                                case 497:
                                                                                    i7 = !z2 ? 50658 : 50627;
                                                                                case 1711:
                                                                                case 1736:
                                                                                    z2 = false;
                                                                                    break;
                                                                                case 1769:
                                                                                    (sb.append(","));
                                                                                    int i8 = 50689;
                                                                                    while (true) {
                                                                                        i8 ^= 50706;
                                                                                        switch (i8) {
                                                                                            case 19:
                                                                                                i8 = 50720;
                                                                                            case 50:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                        String str2 = "\"";
                                                                        String str3 = (str.replace(str2,"\\\""));
                                                                        (sb.append(str2));
                                                                        (sb.append(str3));
                                                                        (sb.append(str2));
                                                                        int i9 = 50813;
                                                                        while (true) {
                                                                            i9 ^= 50830;
                                                                            switch (i9) {
                                                                                case 18:
                                                                                    continue;
                                                                                case 243:
                                                                                    i9 = 50844;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i3 = z3 ? 48860 : 48829;
                                        }
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
        return "";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 587
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    private void q(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List<java.lang.String> r28, java.util.List<com.github.catvod.spider.merge.ME> r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 3058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.MyDrive.q(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean):void");
    }

    private String v3(String str, String str2, String str3) {
        String str4 = "夸父";
        String str5 = "https://drive-pc.quark.cn/1/clouddrive/file/sort?pr=ucpro&fr=pc&uc_param_str=&pdir_fid=%s&_page=%s&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc";
        String str6 = "saveQ";
        HashMap hashMap = C0055.m2325(str4, str5, str6, "https://drive-pc.quark.cn/1/clouddrive/file/category?pr=ucpro&fr=pc&uc_param_str=&cat=&_page=1&_size=10&_fetch_total=1&_sort=updated_at:desc&source=save_as&labels=SAVE_AS_TOP_LAYER");
        String str7 = "优汐";
        (hashMap.put(str7,"https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=%s&_page=%s&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc"));
        String str8 = "saveU";
        (hashMap.put(str8,"https://pc-api.uc.cn/1/clouddrive/file/category?pr=UCBrowser&fr=pc&pdir_fid=%s&_page=%s&_size=10&_fetch_total=1&_fetch_sub_dirs=0&_sort=updated_at:desc&source=save_as&labels=SAVE_AS_TOP_LAYER"));
        String str9 = "阿狸";
        (hashMap.put(str9,"https://api.aliyundrive.com/adrive/v3/file/list"));
        String str10 = "saveA";
        (hashMap.put(str10,"https://bizapi.alipan.com/adrive/v1/user/home/recentSave"));
        (hashMap.put("嘟嘟","https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dir=%s&dp-logid=&order=name&desc=0&num=100&page=%s"));
        boolean z = (str2.isEmpty());
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
                    boolean z2 = (str.equals(str4));
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
                                boolean z3 = (str.equals(str7));
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
                                            boolean z4 = (str.equals(str9));
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        return (String) (hashMap.get(str10));
                                                    case 239:
                                                        if (!z4) {
                                                            break;
                                                        } else {
                                                            i4 = 48860;
                                                            continue;
                                                        }
                                                }
                                                i4 = 48829;
                                            }
                                            break;
                                        case 47417:
                                            return (String) (hashMap.get(str8));
                                        case 47483:
                                            break;
                                    }
                                    i3 = 48705;
                                }
                                break;
                            case 500:
                                return (String) (hashMap.get(str6));
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i = 1678;
        }
        return (String.format((String) (hashMap.get(str)),new Object[]{str2, str3}));
    }

    /* renamed from: ثخﻍج  reason: contains not printable characters */
    public static Boolean m888(Object obj, Object obj2, int i) {
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
                    return ((MyDrive) obj).W((String) obj2, i);
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

    /* renamed from: سدذث  reason: contains not printable characters */
    public static String m889(Object obj) {
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
                    return ((MyDrive) obj).O;
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

    /* renamed from: سﻭﺩغ  reason: contains not printable characters */
    public static Boolean m890(Object obj) {
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
                    return ((Pan) obj).dT;
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

    /* renamed from: ظﺕما  reason: contains not printable characters */
    public static String m891(Object obj) {
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
                    return ((MyDrive) obj).n;
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

    /* renamed from: كدعص  reason: contains not printable characters */
    public static String m892(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = (-477) ^ C0042.f100;
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
                    return ((MyDrive) obj).v3((String) obj2, (String) obj3, (String) obj4);
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

    /* renamed from: كذعﻕ  reason: contains not printable characters */
    public static void m893(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
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
                    ((MyDrive) obj).dT((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (List) obj7, (List) obj8);
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
        int i4 = 658 ^ C0029.f87;
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

    /* renamed from: كﺵﻅﺽ  reason: contains not printable characters */
    public static String m894(Object obj, Object obj2) {
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
                    return ((MyDrive) obj).B((String) obj2);
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

    /* renamed from: لواـ  reason: contains not printable characters */
    public static Boolean m895(Object obj) {
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
                    return ((Pan) obj).F5;
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

    /* renamed from: ﺕثجﻡ  reason: contains not printable characters */
    public static void m896(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, boolean z) {
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
                    ((MyDrive) obj).q((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (List) obj8, (List) obj9, z);
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
        int i4 = 802 ^ C0052.f110;
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

    /* renamed from: ﺙﻱﺽص  reason: contains not printable characters */
    public static Boolean m897(Object obj) {
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
                    return ((Pan) obj).W;
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

    /* renamed from: ﺝﺥﺙﻕ  reason: contains not printable characters */
    public static int m898(Object obj) {
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
                    return ((MyDrive) obj).s;
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

    /* renamed from: ﺯﺭخﻙ  reason: contains not printable characters */
    public static Boolean m899(Object obj) {
        int i = (-886) ^ C0021.f79;
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
                    return ((Pan) obj).v3;
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

    /* renamed from: ﺵكـﻅ  reason: contains not printable characters */
    public static void m900(Object obj) {
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

    /* renamed from: ﻅتلك  reason: contains not printable characters */
    public static void m901(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i = 813 ^ C0033.f91;
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
                    ((MyDrive) obj).G4((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (List) obj7, (List) obj8);
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

    /* renamed from: ﻅكﻭﻙ  reason: contains not printable characters */
    public static String m902(Object obj, Object obj2, Object obj3) {
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
                    return ((MyDrive) obj).F5((String) obj2, (String) obj3);
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

    /* renamed from: ﻕثﺎح  reason: contains not printable characters */
    public static String m903(Object obj) {
        int i = 697 ^ C0024.f82;
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
                    return ((MyDrive) obj).g1;
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

    /* renamed from: ﻙﻅﺎﻭ  reason: contains not printable characters */
    public static void m904(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
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
                    ((MyDrive) obj).G((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (List) obj7, (List) obj8);
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

    public String action(String str) {
        String str2 = "";
        try {
            Activity activity = InitOrigin.getActivity();
            boolean z = (str.contains("优汐"));
            String str3 = "url";
            String str4 = "@";
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
                        try {
                            (new C0098ew().i((new JSONObject(super.playerContent((str.split(str4))[0], (str.split(str4))[1], null)).getString(str3))));
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
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 239:
                        break;
                }
                i = 1678;
            }
            boolean z2 = (str.contains("夸父"));
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
                        try {
                            (new C0098ew().i((new JSONObject(super.playerContent((str.split(str4))[0], (str.split(str4))[1], null)).getString(str3))));
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
                        } catch (JSONException e2) {
                            throw new RuntimeException(e2);
                        }
                        break;
                    case 47483:
                        break;
                }
                i3 = 48705;
            }
            boolean z3 = (str.contains("阿狸"));
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
                        try {
                            (new C0098ew().i((new JSONObject(super.playerContent((str.split(str4))[0], (str.split(str4))[1], null)).getString(str3))));
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
                        } catch (JSONException e3) {
                            throw new RuntimeException(e3);
                        }
                        break;
                    default:
                        continue;
                }
                i5 = 48953;
            }
            boolean z4 = (str.equals("playMode"));
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                        break;
                    case 51:
                        break;
                    case 84:
                        String str5 = C0021.m1398(Pan.getPlayModeFilesDir());
                        boolean z5 = C0020.m1370(str5);
                        String str6 = "默认";
                        String str7 = "模式1";
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
                                    boolean z6 = (str5.equals(str6));
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
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                break;
                                            default:
                                                continue;
                                        }
                                        i9 = 50751;
                                    }
                            }
                            i8 = 50627;
                        }
                        Pan.Gd = str7;
                        C0014.m432(Pan.getPlayModeFilesDir(), str7);
                        C0006.m194("播放模式已变更为模式1");
                        boolean z7 = (str5.equals(str7));
                        int i10 = 50813;
                        while (true) {
                            i10 ^= 50830;
                            switch (i10) {
                                case 18:
                                    break;
                                case 53:
                                    break;
                                case 243:
                                    if (!z7) {
                                        break;
                                    } else {
                                        i10 = 51557;
                                        continue;
                                    }
                                case 4075:
                                    Pan.Gd = str6;
                                    C0014.m432(Pan.getPlayModeFilesDir(), str6);
                                    C0006.m194("播放模式已变更为默认模式");
                                    break;
                                default:
                                    continue;
                            }
                            i10 = 50875;
                        }
                        break;
                    case 241:
                        if (!z4) {
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
            boolean z8 = (str.contains("Show"));
            int i11 = 51588;
            while (true) {
                i11 ^= 51605;
                switch (i11) {
                    case 17:
                        if (!z8) {
                            break;
                        } else {
                            i11 = 51681;
                            continue;
                        }
                    case 54:
                        break;
                    case 87:
                        break;
                    case 116:
                        boolean z9 = (str.contains("Login"));
                        int i12 = 51712;
                        while (true) {
                            i12 ^= 51729;
                            switch (i12) {
                                case 14:
                                    break;
                                case 17:
                                    if (!z9) {
                                        break;
                                    } else {
                                        i12 = 51805;
                                        continue;
                                    }
                                case 47:
                                    break;
                                case 76:
                                    (this.show(str,activity));
                                    break;
                                default:
                                    continue;
                            }
                            i12 = 51774;
                        }
                        boolean z10 = (str.contains("pushCk"));
                        int i13 = 51836;
                        while (true) {
                            i13 ^= 51853;
                            switch (i13) {
                                case 241:
                                    if (!z10) {
                                        break;
                                    } else {
                                        i13 = 52580;
                                        continue;
                                    }
                                case 1963:
                                    break;
                                case 1992:
                                    break;
                                case 2025:
                                    (this.show(str,activity));
                                    break;
                                default:
                                    continue;
                            }
                            i13 = 52549;
                        }
                        boolean z11 = (str.contains("panSort"));
                        int i14 = 52611;
                        while (true) {
                            i14 ^= 52628;
                            switch (i14) {
                                case 23:
                                    if (!z11) {
                                        break;
                                    } else {
                                        i14 = 52704;
                                        continue;
                                    }
                                case 54:
                                    break;
                                case 85:
                                    break;
                                case 116:
                                    (this.show(str,activity));
                                    break;
                                default:
                                    continue;
                            }
                            i14 = 52673;
                        }
                        boolean z12 = (str.contains("panSourceSort"));
                        int i15 = 52735;
                        while (true) {
                            i15 ^= 52752;
                            switch (i15) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 1007:
                                    if (!z12) {
                                        break;
                                    } else {
                                        i15 = 53479;
                                        continue;
                                    }
                                case 7927:
                                    (this.show(str,activity));
                                    break;
                                default:
                                    continue;
                            }
                            i15 = 52797;
                        }
                    default:
                        continue;
                }
                i11 = 51650;
            }
            boolean z13 = (str.contains("Clean"));
            int i16 = 53510;
            while (true) {
                i16 ^= 53527;
                switch (i16) {
                    case 17:
                        if (!z13) {
                            break;
                        } else {
                            i16 = 53603;
                            continue;
                        }
                    case 50:
                        break;
                    case 83:
                        return str2;
                    case 116:
                        C0027.m1576(str);
                        C0006.m194("清除成功");
                        return str2;
                    default:
                        continue;
                }
                i16 = 53572;
            }
        } catch (Exception e4) {
            return C0054.m2293(str2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 417
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String categoryContent(java.lang.String r26, java.lang.String r27, boolean r28, java.util.HashMap<java.lang.String, java.lang.String> r29) {
        /*
            Method dump skipped, instructions count: 2026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.MyDrive.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 394
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // com.github.catvod.spider.Pan
    public java.lang.String detailContent(java.util.List<java.lang.String> r26) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.MyDrive.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        (arrayList.add(new rP("peizhi", "云盘配置")));
        boolean z2 = C0020.m1370(C0008.m236(Z.Zm()));
        String str = "1";
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z2) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z3 = C0020.m1370(C0036.m1837(Z.Zm()));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (z3) {
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
        boolean z4 = (m890(this).booleanValue());
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    if (!z4) {
                        break;
                    } else {
                        i3 = 48736;
                        continue;
                    }
                case 47384:
                    break;
                case 47417:
                    String str2 = "夸父";
                    (arrayList.add(new rP(str2, str2, str)));
                    break;
                case 47483:
                    break;
            }
            i3 = 48705;
        }
        boolean z5 = C0020.m1370(C0044.m2073(C0203xU.s()));
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                    break;
                case 45:
                    break;
                case 76:
                    boolean z6 = (m895(this).booleanValue());
                    int i5 = 48891;
                    while (true) {
                        i5 ^= 48908;
                        switch (i5) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                if (!z6) {
                                    break;
                                } else {
                                    i5 = 49635;
                                    continue;
                                }
                            case 32495:
                                String str3 = "优汐";
                                (arrayList.add(new rP(str3, str3, str)));
                                break;
                        }
                        i5 = 48953;
                    }
                    break;
                case 239:
                    if (z5) {
                        break;
                    } else {
                        i4 = 48860;
                        continue;
                    }
            }
            i4 = 48829;
        }
        boolean z7 = C0020.m1370(C0055.m2328(V.v()));
        int i6 = 49666;
        while (true) {
            i6 ^= 49683;
            switch (i6) {
                case 17:
                    if (!z7) {
                        break;
                    } else {
                        i6 = 49759;
                        continue;
                    }
                case 50:
                    break;
                case 76:
                    boolean z8 = C0020.m1370((C0057.m2362(V.v()).t0()));
                    int i7 = 49790;
                    while (true) {
                        i7 ^= 49807;
                        switch (i7) {
                            case 18:
                                break;
                            case 51:
                                break;
                            case 84:
                                break;
                            case 241:
                                if (z8) {
                                    break;
                                } else {
                                    i7 = 49883;
                                    continue;
                                }
                        }
                        i7 = 49852;
                    }
                    break;
                case 83:
                    break;
            }
            i6 = 49728;
        }
        boolean z9 = (m899(this).booleanValue());
        int i8 = 49914;
        while (true) {
            i8 ^= 49931;
            switch (i8) {
                case 497:
                    if (!z9) {
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
                    String str4 = "阿狸";
                    (arrayList.add(new rP(str4, str4, str)));
                    break;
            }
            i8 = 50627;
        }
        boolean z10 = C0020.m1370((C0015.m439(RQ.xa()).N()));
        int i9 = 50689;
        while (true) {
            i9 ^= 50706;
            switch (i9) {
                case 19:
                    if (!z10) {
                        break;
                    } else {
                        i9 = 50782;
                        continue;
                    }
                case 45:
                    break;
                case 50:
                    break;
                case 76:
                    boolean z11 = C0020.m1370(C0055.m2314(RQ.xa()));
                    int i10 = 50813;
                    while (true) {
                        i10 ^= 50830;
                        switch (i10) {
                            case 18:
                                break;
                            case 53:
                                break;
                            case 243:
                                if (z11) {
                                    break;
                                } else {
                                    i10 = 51557;
                                    continue;
                                }
                            case 4075:
                                break;
                        }
                        i10 = 50875;
                    }
                    break;
            }
            i9 = 50751;
        }
        boolean z12 = (m897(this).booleanValue());
        int i11 = 51588;
        while (true) {
            i11 ^= 51605;
            switch (i11) {
                case 17:
                    if (!z12) {
                        break;
                    } else {
                        i11 = 51681;
                        continue;
                    }
                case 54:
                    break;
                case 87:
                    break;
                case 116:
                    String str5 = "嘟嘟";
                    (arrayList.add(new rP(str5, str5, str)));
                    break;
            }
            i11 = 51650;
        }
        return C0038.m1906(arrayList, arrayList2);
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        super.init(context, str);
        int i = (-604) ^ C0013.f13;
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

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = C0020.m1370(C0008.m236(Z.Zm()));
        String str2 = "夸父";
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!z2) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    boolean z3 = C0020.m1370(C0036.m1837(Z.Zm()));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (z3) {
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
        boolean z4 = (m890(this).booleanValue());
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    if (!z4) {
                        break;
                    } else {
                        i3 = 48736;
                        continue;
                    }
                case 47384:
                    break;
                case 47417:
                    (arrayList.add(str2));
                    break;
                case 47483:
                    break;
            }
            i3 = 48705;
        }
        boolean z5 = C0020.m1370(C0044.m2073(C0203xU.s()));
        String str3 = "优汐";
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                    break;
                case 45:
                    break;
                case 76:
                    boolean z6 = (m895(this).booleanValue());
                    int i5 = 48891;
                    while (true) {
                        i5 ^= 48908;
                        switch (i5) {
                            case 22:
                                break;
                            case 53:
                                break;
                            case 503:
                                if (!z6) {
                                    break;
                                } else {
                                    i5 = 49635;
                                    continue;
                                }
                            case 32495:
                                (arrayList.add(str3));
                                break;
                        }
                        i5 = 48953;
                    }
                    break;
                case 239:
                    if (z5) {
                        break;
                    } else {
                        i4 = 48860;
                        continue;
                    }
            }
            i4 = 48829;
        }
        boolean z7 = C0020.m1370((C0057.m2362(V.v()).t0()));
        String str4 = "阿狸";
        int i6 = 49666;
        while (true) {
            i6 ^= 49683;
            switch (i6) {
                case 17:
                    if (!z7) {
                        break;
                    } else {
                        i6 = 49759;
                        continue;
                    }
                case 50:
                    break;
                case 76:
                    boolean z8 = C0020.m1370(C0055.m2328(V.v()));
                    int i7 = 49790;
                    while (true) {
                        i7 ^= 49807;
                        switch (i7) {
                            case 18:
                                break;
                            case 51:
                                break;
                            case 84:
                                break;
                            case 241:
                                if (z8) {
                                    break;
                                } else {
                                    i7 = 49883;
                                    continue;
                                }
                        }
                        i7 = 49852;
                    }
                    break;
                case 83:
                    break;
            }
            i6 = 49728;
        }
        boolean z9 = (m899(this).booleanValue());
        int i8 = 49914;
        while (true) {
            i8 ^= 49931;
            switch (i8) {
                case 497:
                    if (!z9) {
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
                    (arrayList.add(str4));
                    break;
            }
            i8 = 50627;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = (arrayList.iterator());
        while (true) {
            boolean z10 = (it.hasNext());
            int i9 = 50689;
            while (true) {
                i9 ^= 50706;
                switch (i9) {
                    case 19:
                        i9 = z10 ? 50782 : 50751;
                    case 45:
                        iX iXVar = new iX();
                        (iXVar.b(arrayList2));
                        (iXVar.dT(1,1,0,1));
                        return (iXVar.toString());
                    case 50:
                    case 76:
                        String str5 = (String) (it.next());
                        boolean z11 = (str5.equals(str2));
                        int i10 = 50813;
                        while (true) {
                            i10 ^= 50830;
                            switch (i10) {
                                case 18:
                                case 53:
                                    break;
                                case 243:
                                    i10 = z11 ? 51557 : 50875;
                                case 4075:
                                    m901(this, "isSearch", str5, "", "1", str, null, arrayList2);
                                    break;
                            }
                        }
                        boolean z12 = (str5.equals(str3));
                        int i11 = 51588;
                        while (true) {
                            i11 ^= 51605;
                            switch (i11) {
                                case 17:
                                    i11 = z12 ? 51681 : 51650;
                                case 54:
                                case 87:
                                    break;
                                case 116:
                                    m893(this, "isSearch", str5, "", "1", str, null, arrayList2);
                                    break;
                            }
                        }
                        boolean z13 = (str5.equals(str4));
                        int i12 = 51712;
                        while (true) {
                            i12 ^= 51729;
                            switch (i12) {
                                case 14:
                                case 17:
                                    i12 = z13 ? 51805 : 51774;
                                case 47:
                                    break;
                                case 76:
                                    ArrayList arrayList3 = new ArrayList();
                                    (arrayList3.add((C0057.m2362(V.v()).M())));
                                    (arrayList3.add((C0057.m2362(V.v()).tF())));
                                    m896(this, "isSearch", str5, "", C0033.m1767(arrayList3), "", str, null, arrayList2, true);
                                    int i13 = 51836;
                                    while (true) {
                                        i13 ^= 51853;
                                        switch (i13) {
                                            case 241:
                                                i13 = 52518;
                                            case 1963:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        boolean z14 = (str5.equals("嘟嘟"));
                        int i14 = 52611;
                        while (true) {
                            i14 ^= 52628;
                            switch (i14) {
                                case 23:
                                    i14 = z14 ? 52704 : 52673;
                                case 54:
                                case 85:
                                    break;
                                case 116:
                                    m904(this, "isSearch", str5, "", "0", str, null, arrayList2);
                                    break;
                            }
                        }
                        int i15 = 52735;
                        while (true) {
                            i15 ^= 52752;
                            switch (i15) {
                                case 14:
                                    break;
                                case 1007:
                                    i15 = 52766;
                            }
                        }
                        break;
                }
            }
        }
    }
}
