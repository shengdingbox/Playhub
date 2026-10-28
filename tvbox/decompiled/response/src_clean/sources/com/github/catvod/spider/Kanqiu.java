package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0022;
import com.github.catvod.spider.merge.C0024;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.hN;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.kB;
import com.github.catvod.spider.merge.rP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Kanqiu extends Spider {

    private static String yq = "http://www.88kanqiu.us";

    public Kanqiu() {
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

    private static int[] N(byte[] bArr) {
        int length;
        int length2 = bArr.length;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if ((length2 & 3) != 0) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    length = bArr.length >>> 2;
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
                    length = (bArr.length >>> 2) + 1;
                    break;
            }
            i = 1678;
        }
        int[] iArr = new int[length];
        int length3 = bArr.length;
        int i3 = 0;
        while (true) {
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        i4 = i3 < length3 ? 48736 : 48705;
                    case 47384:
                        return iArr;
                    case 47417:
                        int i5 = i3 >>> 2;
                        iArr[i5] = iArr[i5] | ((bArr[i3] & 255) << ((i3 & 3) << 3));
                        i3++;
                        int i6 = 48767;
                        while (true) {
                            i6 ^= 48784;
                            switch (i6) {
                                case 14:
                                    break;
                                case 239:
                                    i6 = 48798;
                            }
                        }
                        break;
                    case 47483:
                }
            }
        }
    }

    private static int SN(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
                // [deflattened] 控制流平坦化已还原为线性代码
        i7 = i3 >>> 5;
        i9 = i2 << 2;
        i8 = i7 ^ i9;
        i7 = i2 >>> 3;
        i9 = i3 << 4;
        i10 = i7 ^ i9;
        i7 = i8 + i10;
        i8 = i ^ i2;
        i9 = i4 & 3;
        i10 = i9 ^ i5;
        i6 = iArr[i10];
        i10 = i6 ^ i3;
        i = i8 + i10;
        i8 = i ^ i7;
        return i8;
}

    private Map<String, String> yq() {
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap();
        str2 = "User-Agent";
        str3 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36";
        (hashMap.put(str2,str3));
        return hashMap;
}

    /* renamed from: اكﺥﺕ  reason: contains not printable characters */
    public static Map m815(Object obj) {
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
                    return ((Kanqiu) obj).yq();
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

    /* renamed from: غيشـ  reason: contains not printable characters */
    public static int m817(int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = 753 ^ C0000.f0;
        int i7 = 1616;
        while (true) {
            i7 ^= 1633;
            switch (i7) {
                case 14:
                    break;
                case 49:
                    
                        i7 = 1709;
                        continue;
                    
                case 204:
                    return SN(i, i2, i3, i4, i5, (int[]) obj);
                case 239:
                    int i8 = 1740;
                    while (true) {
                        i8 ^= 1757;
                        switch (i8) {
                            case 17:
                                i8 = 1771;
                                break;
                            case 54:
                                return 0;
                        }
                    }
                    break;
            }
            i7 = 1678;
        }
    }

    /* renamed from: ﺡخلج  reason: contains not printable characters */
    public static String m818() {
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
                    return yq;
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

    /* renamed from: ﻙقﻉح  reason: contains not printable characters */
    public static int[] m819(Object obj) {
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
                    return N((byte[]) obj);
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

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4;
        String str5;
        String str6 = "cateId";
        Object obj = (hashMap.get(str6));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (obj != null) {
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
                                break;
                        }
                    }
                    break;
                case 239:
                    str = (String) (hashMap.get(str6));
                    break;
            }
            i = 1678;
        }
        StringBuilder sb = new StringBuilder();
        (sb.append(m818()));
        boolean z2 = (str.isEmpty());
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
                    str3 = (String.format("/match/%s/live",new Object[]{str}));
                    break;
                case 47417:
                    str3 = (String.format("%s",new Object[]{str}));
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
        (sb.append(str3));
        kB kBVar = (C0004.m119(C0028.m1633((sb.toString()), m815(this))).cS(".list-group-item"));
        ArrayList arrayList = new ArrayList();
        Iterator it = (kBVar.iterator());
        while (true) {
            boolean z3 = (it.hasNext());
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                    case 53:
                        iX iXVar = new iX();
                        (iXVar.dT(1,1,0,(kBVar.size())));
                        (iXVar.b(arrayList));
                        return (iXVar.toString());
                    case 503:
                        i5 = z3 ? 49635 : 48953;
                    case 32495:
                        hN hNVar = (hN) (it.next());
                        StringBuilder sb2 = new StringBuilder();
                        (sb2.append(m818()));
                        String str7 = ".btn.btn-primary";
                        (sb2.append(((hNVar.cS(str7)).yq("href"))));
                        String str8 = (sb2.toString());
                        String str9 = ((hNVar.cS(".row.d-none")).t0());
                        boolean z4 = (str9.isEmpty());
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    i6 = z4 ? 49759 : 49728;
                                case 50:
                                case 76:
                                    str4 = (hNVar.Fo());
                                    break;
                                case 83:
                                    str4 = str9;
                                    break;
                            }
                        }
                        String str10 = ((((hNVar.cS(".col-xs-1")).N(0)).i("img")).yq("data-src"));
                        boolean z5 = (str10.isEmpty());
                        int i7 = 49790;
                        while (true) {
                            i7 ^= 49807;
                            switch (i7) {
                                case 18:
                                case 51:
                                    break;
                                case 84:
                                    str10 = "https://pic.imgdb.cn/item/657673d6c458853aeff94ab9.jpg";
                                    break;
                                case 241:
                                    i7 = z5 ? 49883 : 49852;
                            }
                        }
                        boolean z6 = (str10.startsWith("http"));
                        int i8 = 49914;
                        while (true) {
                            i8 ^= 49931;
                            switch (i8) {
                                case 497:
                                    i8 = !z6 ? 50658 : 50627;
                                case 1711:
                                case 1736:
                                    break;
                                case 1769:
                                    str10 = C0032.m1739(new StringBuilder(), m818(), str10);
                                    break;
                            }
                        }
                        String str11 = ((hNVar.cS(str7)).t0());
                        boolean z7 = (str11.isEmpty());
                        int i9 = 50689;
                        while (true) {
                            i9 ^= 50706;
                            switch (i9) {
                                case 19:
                                    i9 = z7 ? 50782 : 50751;
                                case 45:
                                    str5 = str11;
                                    break;
                                case 50:
                                case 76:
                                    str5 = ((hNVar.cS(".btn.btn-default")).t0());
                                    break;
                            }
                        }
                        (arrayList.add(new ME(str8, str4, str10, str5)));
                        int i10 = 50813;
                        while (true) {
                            i10 ^= 50830;
                            switch (i10) {
                                case 18:
                                    break;
                                case 243:
                                    i10 = 50844;
                            }
                        }
                        break;
                }
            }
        }
    }

    public String detailContent(List<String> list) {
        String str;
        boolean z = ((String) (list.get(0)).equals(m818()));
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
                    return iX.i();
                case 239:
                    JSONArray jSONArray = (new JSONObject(new String(C0022.m1420((((new JSONObject(C0028.m1633(((String) (list.get(0)).replace("play","source")), m815(this))).optString("data")).substring(6)).substring(0,(str.length()) - 2)), 0))).getJSONArray("links"));
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    while (true) {
                        int i3 = (jSONArray.length());
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = i2 < i3 ? 1833 : 1802;
                                case 54:
                                case 471:
                                    ME me = new ME();
                                    (me.B((String) (list.get(0))));
                                    (me.dT("直播"));
                                    (me.t0(""));
                                    (me.KJ("请勿相信视频中任何广告"));
                                    (me.F5((TextUtils.join("#",arrayList))));
                                    return C0000.m21(me);
                                case 500:
                                    JSONObject jSONObject = (jSONArray.getJSONObject(i2));
                                    String str2 = (jSONObject.optString("name"));
                                    String str3 = (jSONObject.optString("url"));
                                    StringBuilder sb = new StringBuilder();
                                    (sb.append(str2));
                                    (sb.append("$"));
                                    (sb.append(str3));
                                    (arrayList.add((sb.toString())));
                                    i2++;
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = 48674;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    public String homeContent(boolean z) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        List list = (Arrays.asList(new String[]{"", "1", "8", "21"}));
        List list2 = (Arrays.asList(new String[]{"全部直播", "篮球直播", "足球直播", "其他直播"}));
        while (true) {
            int i2 = i;
            int i3 = (list.size());
            int i4 = 1616;
            while (true) {
                i4 ^= 1633;
                switch (i4) {
                    case 14:
                    case 49:
                        i4 = i2 < i3 ? 1709 : 1678;
                    case 204:
                        (arrayList.add(new rP((String) (list.get(i2)), (String) (list2.get(i2)))));
                        i = i2 + 1;
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            switch (i5) {
                                case 17:
                                    i5 = 1771;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        return C0000.m9(arrayList, new JSONObject("{\"1\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"NBA\", \"v\": \"1\"}, {\"n\": \"CBA\", \"v\": \"2\"}, {\"n\": \"篮球综合\", \"v\": \"4\"}, {\"n\": \"纬来体育\", \"v\": \"21\"}]}],\"8\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"英超\", \"v\": \"8\"}, {\"n\": \"西甲\", \"v\": \"9\"}, {\"n\": \"意甲\", \"v\": \"10\"}, {\"n\": \"欧冠\", \"v\": \"12\"}, {\"n\": \"欧联\", \"v\": \"13\"}, {\"n\": \"德甲\", \"v\": \"14\"}, {\"n\": \"法甲\", \"v\": \"15\"}, {\"n\": \"欧国联\", \"v\": \"16\"}, {\"n\": \"足总杯\", \"v\": \"27\"}, {\"n\": \"国王杯\", \"v\": \"33\"}, {\"n\": \"中超\", \"v\": \"7\"}, {\"n\": \"亚冠\", \"v\": \"11\"}, {\"n\": \"足球综合\", \"v\": \"23\"}, {\"n\": \"欧协联\", \"v\": \"28\"}, {\"n\": \"美职联\", \"v\": \"26\"}]}], \"29\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"网球\", \"v\": \"29\"}, {\"n\": \"斯洛克\", \"v\": \"30\"}, {\"n\": \"MLB\", \"v\": \"38\"}, {\"n\": \"UFC\", \"v\": \"32\"}, {\"n\": \"NFL\", \"v\": \"25\"}, {\"n\": \"CCTV5\", \"v\": \"18\"}]}]}"));
                }
            }
        }
    }

    public void init(Context context, String str) {
        boolean z = (str.isEmpty());
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
                    yq = str;
                    return;
                case 239:
                    return;
            }
            i = 1678;
        }
    }

    public String matcher(String str, String str2) {
        Matcher matcher = (C0005.m166(str2).matcher(str));
        boolean z = (matcher.find());
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
                    return (matcher.group(1));
                case 239:
                    return "";
            }
            i = 1678;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0056.m2351(true);
        boolean z = (str2.contains("?url="));
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
                    String str3 = C0055.m2312((str2.split("\\?url="))[1]);
                    iX iXVar = new iX();
                    (iXVar.g1(str3));
                    (iXVar.KJ(m815(this)));
                    return (iXVar.toString());
                case 239:
                    boolean z2 = (str2.contains("?id="));
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
                                break;
                            case 500:
                                String str4 = C0028.m1633(str2, m815(this));
                                String str5 = "encodedStr = '(.*?)'";
                                String str6 = (this.matcher(str4,str5));
                                boolean z3 = (TextUtils.isEmpty(str6));
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
                                            break;
                                        case 47417:
                                            String str7 = (this.matcher(str4,"src='(.*?)\"\\+id"));
                                            boolean z4 = (TextUtils.isEmpty(str7));
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        str6 = (this.matcher(C0028.m1633(C0048.m2149((str2.substring(0,(str2.indexOf("/",8)))), str7, ((str2.split("\\?id="))[1].split("&"))[0]), m815(this)),str5));
                                                        break;
                                                    case 239:
                                                        if (z4) {
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
                                boolean z5 = (TextUtils.isEmpty(str6));
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            if (z5) {
                                                break;
                                            } else {
                                                i5 = 49635;
                                                continue;
                                            }
                                        case 32495:
                                            String str8 = (new JSONObject((this.xxteaDecrypt(C0022.m1420(str6, 0),"ABCDEFGHIJKLMNOPQRSTUVWX"))).optString("url"));
                                            iX iXVar2 = new iX();
                                            (iXVar2.g1(str8));
                                            (iXVar2.KJ(m815(this)));
                                            return (iXVar2.toString());
                                    }
                                    i5 = 48953;
                                }
                                break;
                        }
                        i2 = 1802;
                    }
                    iX iXVar3 = new iX();
                    (iXVar3.g1(str2));
                    (iXVar3.F5());
                    (iXVar3.KJ(m815(this)));
                    return (iXVar3.toString());
            }
            i = 1678;
        }
    }

    public String xxteaDecrypt(byte[] bArr, String str) {
        int[] iArr;
        String str2;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (bArr == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    int length = bArr.length;
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (length != 0) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                int[] iArr2 = m819(bArr);
                                int[] iArr3 = m819((str.getBytes(StandardCharsets.UTF_8)));
                                int length2 = iArr2.length;
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            int length3 = iArr3.length;
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        iArr = iArr3;
                                                        break;
                                                    case 503:
                                                        if (length3 >= 4) {
                                                            break;
                                                        } else {
                                                            i4 = 49635;
                                                            continue;
                                                        }
                                                    case 32495:
                                                        iArr = new int[4];
                                                        C0025.m1532(iArr3, 0, iArr, 0, iArr3.length);
                                                        break;
                                                }
                                                i4 = 48953;
                                            }
                                            int length4 = iArr2.length - 1;
                                            int i5 = ((52 / (length4 + 1)) + 6) * (-1640531527);
                                            int i6 = iArr2[0];
                                            while (true) {
                                                int i7 = 49666;
                                                while (true) {
                                                    i7 ^= 49683;
                                                    switch (i7) {
                                                        case 17:
                                                            i7 = i5 != 0 ? 49759 : 49728;
                                                        case 50:
                                                        case 76:
                                                            int i8 = (i5 >>> 2) & 3;
                                                            int i9 = length4;
                                                            while (true) {
                                                                int i10 = 49790;
                                                                while (true) {
                                                                    i10 ^= 49807;
                                                                    switch (i10) {
                                                                        case 18:
                                                                        case 51:
                                                                            i6 = iArr2[0] - m817(i5, i6, iArr2[length4], 0, i8, iArr);
                                                                            iArr2[0] = i6;
                                                                            i5 += 1640531527;
                                                                            int i11 = 50689;
                                                                            while (true) {
                                                                                i11 ^= 50706;
                                                                                switch (i11) {
                                                                                    case 19:
                                                                                        i11 = 50720;
                                                                                    case 50:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 84:
                                                                            int i12 = i9 - 1;
                                                                            i6 = iArr2[i9] - m817(i5, i6, iArr2[i12], i9, i8, iArr);
                                                                            iArr2[i9] = i6;
                                                                            int i13 = 49914;
                                                                            while (true) {
                                                                                i13 ^= 49931;
                                                                                switch (i13) {
                                                                                    case 497:
                                                                                        i13 = 50596;
                                                                                    case 1711:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i9 = i12;
                                                                            break;
                                                                        case 241:
                                                                            i10 = i9 > 0 ? 49883 : 49852;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 83:
                                                            int length5 = iArr2.length;
                                                            int i14 = iArr2[iArr2.length - 1];
                                                            int i15 = (length5 << 2) - 4;
                                                            int i16 = 50813;
                                                            while (true) {
                                                                i16 ^= 50830;
                                                                switch (i16) {
                                                                    case 18:
                                                                        break;
                                                                    case 53:
                                                                        break;
                                                                    case 243:
                                                                        if (i14 < i15 - 3) {
                                                                            break;
                                                                        } else {
                                                                            i16 = 51557;
                                                                            continue;
                                                                        }
                                                                    case 4075:
                                                                        int i17 = 51588;
                                                                        while (true) {
                                                                            i17 ^= 51605;
                                                                            switch (i17) {
                                                                                case 17:
                                                                                    if (i14 <= i15) {
                                                                                        break;
                                                                                    } else {
                                                                                        i17 = 51681;
                                                                                        continue;
                                                                                    }
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    byte[] bArr2 = new byte[i14];
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        int i19 = 51836;
                                                                                        while (true) {
                                                                                            i19 ^= 51853;
                                                                                            switch (i19) {
                                                                                                case 241:
                                                                                                    i19 = i18 < i14 ? 52580 : 52549;
                                                                                                case 1963:
                                                                                                case 1992:
                                                                                                    str2 = new String(bArr2, StandardCharsets.UTF_8);
                                                                                                    break;
                                                                                                case 2025:
                                                                                                    bArr2[i18] = (byte) (iArr2[i18 >>> 2] >>> ((i18 & 3) << 3));
                                                                                                    i18++;
                                                                                                    int i20 = 52611;
                                                                                                    while (true) {
                                                                                                        i20 ^= 52628;
                                                                                                        switch (i20) {
                                                                                                            case 23:
                                                                                                                i20 = 52642;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 116:
                                                                                    int i21 = 51712;
                                                                                    while (true) {
                                                                                        i21 ^= 51729;
                                                                                        switch (i21) {
                                                                                            case 14:
                                                                                                str2 = null;
                                                                                                break;
                                                                                            case 17:
                                                                                                i21 = 51743;
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            i17 = 51650;
                                                                        }
                                                                        break;
                                                                }
                                                                i16 = 50875;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 76:
                                            return null;
                                        case 239:
                                            if (length2 >= 2) {
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
                                int i22 = 1864;
                                while (true) {
                                    i22 ^= 1881;
                                    switch (i22) {
                                        case 17:
                                            i22 = 48674;
                                            break;
                                        case 47483:
                                            str2 = null;
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
        str2 = null;
        return str2;
    }
}
