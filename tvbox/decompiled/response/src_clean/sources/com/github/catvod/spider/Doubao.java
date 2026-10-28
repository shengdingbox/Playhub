package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.rP;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Doubao extends Spider {

    private String yq = "https://www.doubaozhibo.com";
    private String SN = "https://www.doubaozhibo.com/api/v1/schedules/public/local";
    private String N = "https://www.doubaozhibo.com/api/v1/playbacks";
    private String tF = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36";
    private String zH = null;
    private long i = 0;
    private final Map<String, String> t0 = new HashMap();
    private final Map<String, Long> Gc = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class VodWithStatus {
        String N;
        int SN;
        ME yq;

        VodWithStatus(ME me, int i, String str) {
            this.yq = me;
            this.SN = i;
            this.N = str;
            int i2 = (-422) ^ C0033.f91;
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

    public Doubao() {
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

    private List<ME> N() {
        boolean z;
        String str;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = (new JSONObject(m724(this)).optJSONObject("data"));
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (jSONObject != null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    return new ArrayList();
                case 239:
                    JSONArray jSONArray = (jSONObject.optJSONArray("days"));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (jSONArray != null) {
                                    break;
                                } else {
                                    i2 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                int i3 = 0;
                                while (true) {
                                    int i4 = (jSONArray.length());
                                    int i5 = 1864;
                                    while (true) {
                                        i5 ^= 1881;
                                        switch (i5) {
                                            case 17:
                                                i5 = i3 < i4 ? 48736 : 48705;
                                            case 47384:
                                                (Collections.sort(arrayList,new Comparator<VodWithStatus>(this) { // from class: com.github.catvod.spider.Doubao.1
                                                    final Doubao yq;

                                                    {
                                                        this.yq = this;
                                                        int i6 = (-406) ^ C0053.f111;
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 < 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    return;
                                                                case 239:
                                                                    return;
                                                            }
                                                            i7 = 1678;
                                                        }
                                                    }

                                                    /* renamed from: اهسﺕ  reason: contains not printable characters */
                                                    public static String m732(Object obj) {
                                                        int i6 = 284 ^ C0041.f99;
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 > 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    return ((VodWithStatus) obj).N;
                                                                case 239:
                                                                    int i8 = 1740;
                                                                    while (true) {
                                                                        i8 ^= 1757;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                i8 = 1771;
                                                                                break;
                                                                            case 54:
                                                                                return null;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            i7 = 1678;
                                                        }
                                                    }

                                                    /* renamed from: ﺵعﺡض  reason: contains not printable characters */
                                                    public static int m733(Object obj) {
                                                        int i6 = (-404) ^ C0021.f79;
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 > 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    return ((VodWithStatus) obj).SN;
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

                                                    /* renamed from: ﻍغنﻅ  reason: contains not printable characters */
                                                    public static int m734(Object obj, Object obj2, Object obj3) {
                                                        int i6 = 293 ^ C0009.f9;
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 > 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    return ((AnonymousClass1) obj).compare2((VodWithStatus) obj2, (VodWithStatus) obj3);
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

                                                    /* renamed from: ﻱحﺙد  reason: contains not printable characters */
                                                    public static Doubao m735(Object obj) {
                                                        int i6 = (-703) ^ C0036.f94;
                                                        int i7 = 1616;
                                                        while (true) {
                                                            i7 ^= 1633;
                                                            switch (i7) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i6 >= 0) {
                                                                        break;
                                                                    } else {
                                                                        i7 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    return ((AnonymousClass1) obj).yq;
                                                                case 239:
                                                                    int i8 = 1740;
                                                                    while (true) {
                                                                        i8 ^= 1757;
                                                                        switch (i8) {
                                                                            case 17:
                                                                                i8 = 1771;
                                                                                break;
                                                                            case 54:
                                                                                return null;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            i7 = 1678;
                                                        }
                                                    }

                                                    /* renamed from: compare  reason: avoid collision after fix types in other method */
                                                    public int compare2(VodWithStatus vodWithStatus, VodWithStatus vodWithStatus2) {
                                                        int i6;
                                                        int i7 = 3;
                                                        Doubao doubao = m735(this);
                                                        int i8 = m733(vodWithStatus);
                                                        (Objects.requireNonNull(doubao));
                                                        int i9 = 1616;
                                                        while (true) {
                                                            i9 ^= 1633;
                                                            switch (i9) {
                                                                case 14:
                                                                    break;
                                                                case 49:
                                                                    if (i8 == 0) {
                                                                        break;
                                                                    } else {
                                                                        i9 = 1709;
                                                                        continue;
                                                                    }
                                                                case 204:
                                                                    int i10 = 1740;
                                                                    while (true) {
                                                                        i10 ^= 1757;
                                                                        switch (i10) {
                                                                            case 17:
                                                                                if (i8 == 1) {
                                                                                    break;
                                                                                } else {
                                                                                    i10 = 1833;
                                                                                    continue;
                                                                                }
                                                                            case 54:
                                                                                break;
                                                                            case 471:
                                                                                int i11 = 49666;
                                                                                while (true) {
                                                                                    i11 ^= 49683;
                                                                                    switch (i11) {
                                                                                        case 17:
                                                                                            i11 = 49697;
                                                                                            break;
                                                                                        case 50:
                                                                                            i6 = 0;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 500:
                                                                                int i12 = 1864;
                                                                                while (true) {
                                                                                    i12 ^= 1881;
                                                                                    switch (i12) {
                                                                                        case 17:
                                                                                            if (i8 == 2) {
                                                                                                break;
                                                                                            } else {
                                                                                                i12 = 48736;
                                                                                                continue;
                                                                                            }
                                                                                        case 47384:
                                                                                            int i13 = 48891;
                                                                                            while (true) {
                                                                                                i13 ^= 48908;
                                                                                                switch (i13) {
                                                                                                    case 22:
                                                                                                        i6 = 2;
                                                                                                        break;
                                                                                                    case 503:
                                                                                                        i13 = 48922;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 47417:
                                                                                            int i14 = 48767;
                                                                                            while (true) {
                                                                                                i14 ^= 48784;
                                                                                                switch (i14) {
                                                                                                    case 14:
                                                                                                        i6 = 3;
                                                                                                        break;
                                                                                                    case 239:
                                                                                                        i14 = 48798;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 47483:
                                                                                            break;
                                                                                    }
                                                                                    i12 = 48705;
                                                                                }
                                                                                break;
                                                                        }
                                                                        i10 = 1802;
                                                                    }
                                                                    break;
                                                                case 239:
                                                                    i6 = 1;
                                                                    break;
                                                            }
                                                            i9 = 1678;
                                                        }
                                                        Doubao doubao2 = m735(this);
                                                        int i15 = m733(vodWithStatus2);
                                                        (Objects.requireNonNull(doubao2));
                                                        int i16 = 49790;
                                                        while (true) {
                                                            i16 ^= 49807;
                                                            switch (i16) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    i7 = 1;
                                                                    break;
                                                                case 84:
                                                                    int i17 = 49914;
                                                                    while (true) {
                                                                        i17 ^= 49931;
                                                                        switch (i17) {
                                                                            case 497:
                                                                                if (i15 == 1) {
                                                                                    break;
                                                                                } else {
                                                                                    i17 = 50658;
                                                                                    continue;
                                                                                }
                                                                            case 1711:
                                                                                break;
                                                                            case 1736:
                                                                                int i18 = 51712;
                                                                                while (true) {
                                                                                    i18 ^= 51729;
                                                                                    switch (i18) {
                                                                                        case 14:
                                                                                            i7 = 0;
                                                                                            break;
                                                                                        case 17:
                                                                                            i18 = 51743;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1769:
                                                                                int i19 = 50689;
                                                                                while (true) {
                                                                                    i19 ^= 50706;
                                                                                    switch (i19) {
                                                                                        case 19:
                                                                                            if (i15 == 2) {
                                                                                                break;
                                                                                            } else {
                                                                                                i19 = 50782;
                                                                                                continue;
                                                                                            }
                                                                                        case 45:
                                                                                            int i20 = 51588;
                                                                                            while (true) {
                                                                                                i20 ^= 51605;
                                                                                                switch (i20) {
                                                                                                    case 17:
                                                                                                        i20 = 51619;
                                                                                                        break;
                                                                                                    case 54:
                                                                                                        i7 = 2;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case 76:
                                                                                            int i21 = 50813;
                                                                                            while (true) {
                                                                                                i21 ^= 50830;
                                                                                                switch (i21) {
                                                                                                    case 18:
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i21 = 50844;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    i19 = 50751;
                                                                                }
                                                                                break;
                                                                        }
                                                                        i17 = 50627;
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    if (i15 == 0) {
                                                                        break;
                                                                    } else {
                                                                        i16 = 49883;
                                                                        continue;
                                                                    }
                                                            }
                                                            i16 = 49852;
                                                        }
                                                        int i22 = 51836;
                                                        while (true) {
                                                            i22 ^= 51853;
                                                            switch (i22) {
                                                                case 241:
                                                                    if (i6 == i7) {
                                                                        break;
                                                                    } else {
                                                                        i22 = 52580;
                                                                        continue;
                                                                    }
                                                                case 1963:
                                                                    break;
                                                                case 1992:
                                                                    String str2 = m732(vodWithStatus);
                                                                    int i23 = 52611;
                                                                    while (true) {
                                                                        i23 ^= 52628;
                                                                        switch (i23) {
                                                                            case 23:
                                                                                if (str2 == null) {
                                                                                    break;
                                                                                } else {
                                                                                    i23 = 52704;
                                                                                    continue;
                                                                                }
                                                                            case 54:
                                                                                break;
                                                                            case 85:
                                                                                return 0;
                                                                            case 116:
                                                                                String str3 = m732(vodWithStatus2);
                                                                                int i24 = 52735;
                                                                                while (true) {
                                                                                    i24 ^= 52752;
                                                                                    switch (i24) {
                                                                                        case 14:
                                                                                            break;
                                                                                        case 45:
                                                                                            return 0;
                                                                                        case 1007:
                                                                                            if (str3 == null) {
                                                                                                break;
                                                                                            } else {
                                                                                                i24 = 53479;
                                                                                                continue;
                                                                                            }
                                                                                        case 7927:
                                                                                            return (str2.compareTo(str3));
                                                                                    }
                                                                                    i24 = 52797;
                                                                                }
                                                                                break;
                                                                        }
                                                                        i23 = 52673;
                                                                    }
                                                                    break;
                                                                case 2025:
                                                                    return (Integer.compare(i6,i7));
                                                            }
                                                            i22 = 52549;
                                                        }
                                                    }

                                                    @Override // java.util.Comparator
                                                    public /* bridge */ /* synthetic */ int compare(VodWithStatus vodWithStatus, VodWithStatus vodWithStatus2) {
                                                        int i6 = 0;
                                                        VodWithStatus vodWithStatus3 = null;
                                                        VodWithStatus vodWithStatus4 = null;
                                                                // [deflattened] 控制流平坦化已还原为线性代码
        vodWithStatus4 = vodWithStatus;
        vodWithStatus3 = vodWithStatus2;
        i6 = m734(this, vodWithStatus4, vodWithStatus3);
        return i6;
}
                                                }));
                                                ArrayList arrayList2 = new ArrayList();
                                                Iterator it = (arrayList.iterator());
                                                while (true) {
                                                    boolean z2 = (it.hasNext());
                                                    int i6 = 55556;
                                                    while (true) {
                                                        i6 ^= 55573;
                                                        switch (i6) {
                                                            case 17:
                                                                i6 = z2 ? 55649 : 55618;
                                                            case 54:
                                                            case 87:
                                                                return arrayList2;
                                                            case 116:
                                                                (arrayList2.add(m730((VodWithStatus) (it.next()))));
                                                                int i7 = 55680;
                                                                while (true) {
                                                                    i7 ^= 55697;
                                                                    switch (i7) {
                                                                        case 17:
                                                                            i7 = 56362;
                                                                        case 1467:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 47417:
                                                JSONArray jSONArray2 = ((jSONArray.getJSONObject(i3)).optJSONArray("live"));
                                                int i8 = 48767;
                                                while (true) {
                                                    i8 ^= 48784;
                                                    switch (i8) {
                                                        case 14:
                                                        case 45:
                                                            int i9 = 0;
                                                            while (true) {
                                                                int i10 = (jSONArray2.length());
                                                                int i11 = 49666;
                                                                while (true) {
                                                                    i11 ^= 49683;
                                                                    switch (i11) {
                                                                        case 17:
                                                                            i11 = i9 < i10 ? 49759 : 49728;
                                                                        case 50:
                                                                        case 76:
                                                                            JSONObject jSONObject2 = (jSONArray2.getJSONObject(i9));
                                                                            String str2 = "playbackId";
                                                                            boolean z3 = (jSONObject2.isNull(str2));
                                                                            int i12 = 49790;
                                                                            while (true) {
                                                                                i12 ^= 49807;
                                                                                switch (i12) {
                                                                                    case 18:
                                                                                    case 51:
                                                                                        break;
                                                                                    case 84:
                                                                                        int i13 = (jSONObject2.optInt(str2,0));
                                                                                        int i14 = 49914;
                                                                                        while (true) {
                                                                                            i14 ^= 49931;
                                                                                            switch (i14) {
                                                                                                case 497:
                                                                                                    i14 = i13 > 0 ? 50658 : 50627;
                                                                                                case 1711:
                                                                                                case 1736:
                                                                                                    break;
                                                                                                case 1769:
                                                                                                    z = true;
                                                                                                    int i15 = 50689;
                                                                                                    while (true) {
                                                                                                        i15 ^= 50706;
                                                                                                        switch (i15) {
                                                                                                            case 19:
                                                                                                                i15 = 50720;
                                                                                                            case 50:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 241:
                                                                                        i12 = !z3 ? 49883 : 49852;
                                                                                }
                                                                            }
                                                                            z = false;
                                                                            int i16 = 50813;
                                                                            while (true) {
                                                                                i16 ^= 50830;
                                                                                switch (i16) {
                                                                                    case 18:
                                                                                    case 53:
                                                                                        String str3 = "status";
                                                                                        int i17 = (jSONObject2.optInt(str3,0));
                                                                                        String str4 = "matchTime";
                                                                                        String str5 = (jSONObject2.optString(str4));
                                                                                        String str6 = (jSONObject2.optString("id"));
                                                                                        String str7 = (jSONObject2.optString("league"));
                                                                                        String str8 = (jSONObject2.optString("teamA"));
                                                                                        String str9 = (jSONObject2.optString("teamB"));
                                                                                        String str10 = (jSONObject2.optString(str4));
                                                                                        int i18 = (jSONObject2.optInt(str3,0));
                                                                                        int i19 = (jSONObject2.optInt("teamAscore",0));
                                                                                        int i20 = (jSONObject2.optInt("teamBscore",0));
                                                                                        String str11 = m720(this, str10);
                                                                                        int i21 = 51712;
                                                                                        while (true) {
                                                                                            i21 ^= 51729;
                                                                                            switch (i21) {
                                                                                                case 14:
                                                                                                case 17:
                                                                                                    i21 = i18 != 1 ? 51805 : 51774;
                                                                                                case 47:
                                                                                                    str = "🔴";
                                                                                                    break;
                                                                                                case 76:
                                                                                                    int i22 = 51836;
                                                                                                    while (true) {
                                                                                                        i22 ^= 51853;
                                                                                                        switch (i22) {
                                                                                                            case 241:
                                                                                                                i22 = i18 != 2 ? 52580 : 52549;
                                                                                                            case 1963:
                                                                                                            case 1992:
                                                                                                                str = "⚫";
                                                                                                                int i23 = 52735;
                                                                                                                while (true) {
                                                                                                                    i23 ^= 52752;
                                                                                                                    switch (i23) {
                                                                                                                        case 14:
                                                                                                                            break;
                                                                                                                        case 1007:
                                                                                                                            i23 = 52766;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 2025:
                                                                                                                str = "⏰";
                                                                                                                int i24 = 52611;
                                                                                                                while (true) {
                                                                                                                    i24 ^= 52628;
                                                                                                                    switch (i24) {
                                                                                                                        case 23:
                                                                                                                            i24 = 52642;
                                                                                                                        case 54:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        String str12 = C0048.m2149(str8, " vs ", str9);
                                                                                        StringBuilder sb = new StringBuilder();
                                                                                        (sb.append(str));
                                                                                        String str13 = " ";
                                                                                        (sb.append(str13));
                                                                                        (sb.append(str11));
                                                                                        String str14 = " | ";
                                                                                        (sb.append(str14));
                                                                                        (sb.append(str7));
                                                                                        String str15 = (sb.toString());
                                                                                        int i25 = 53510;
                                                                                        while (true) {
                                                                                            i25 ^= 53527;
                                                                                            switch (i25) {
                                                                                                case 17:
                                                                                                    i25 = i18 != 1 ? 53603 : 53572;
                                                                                                case 50:
                                                                                                case 83:
                                                                                                    break;
                                                                                                case 116:
                                                                                                    int i26 = 53634;
                                                                                                    while (true) {
                                                                                                        i26 ^= 53651;
                                                                                                        switch (i26) {
                                                                                                            case 17:
                                                                                                                i26 = i18 == 2 ? 53727 : 53696;
                                                                                                            case 50:
                                                                                                            case 76:
                                                                                                                int i27 = 53758;
                                                                                                                while (true) {
                                                                                                                    i27 ^= 53775;
                                                                                                                    switch (i27) {
                                                                                                                        case 1009:
                                                                                                                            i27 = 54440;
                                                                                                                        case 1703:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 83:
                                                                                                                int i28 = 54533;
                                                                                                                while (true) {
                                                                                                                    i28 ^= 54550;
                                                                                                                    switch (i28) {
                                                                                                                        case 19:
                                                                                                                            i28 = 54564;
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
                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                        (sb2.append(str8));
                                                                                        (sb2.append(str13));
                                                                                        (sb2.append(i19));
                                                                                        String str16 = "-";
                                                                                        (sb2.append(str16));
                                                                                        (sb2.append(i20));
                                                                                        str12 = C0032.m1739(sb2, str13, str9);
                                                                                        StringBuilder sb3 = new StringBuilder();
                                                                                        (sb3.append(str));
                                                                                        (sb3.append(str13));
                                                                                        (sb3.append(str11));
                                                                                        (sb3.append(str14));
                                                                                        (sb3.append(str7));
                                                                                        (sb3.append(str14));
                                                                                        (sb3.append(i19));
                                                                                        (sb3.append(str16));
                                                                                        (sb3.append(i20));
                                                                                        str15 = (sb3.toString());
                                                                                        ME me = new ME();
                                                                                        StringBuilder sb4 = new StringBuilder();
                                                                                        (sb4.append("live###"));
                                                                                        (sb4.append(str6));
                                                                                        (me.B((sb4.toString())));
                                                                                        (me.G(str12));
                                                                                        (me.G4((jSONObject2.optString("teamAImage"))));
                                                                                        (me.v3(str15));
                                                                                        (arrayList.add(new VodWithStatus(me, i17, str5)));
                                                                                        break;
                                                                                    case 243:
                                                                                        i16 = z ? 51557 : 50875;
                                                                                    case 4075:
                                                                                        int i29 = 51588;
                                                                                        while (true) {
                                                                                            i29 ^= 51605;
                                                                                            switch (i29) {
                                                                                                case 17:
                                                                                                    i29 = 51619;
                                                                                                case 54:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i9++;
                                                                            int i30 = 54657;
                                                                            while (true) {
                                                                                i30 ^= 54674;
                                                                                switch (i30) {
                                                                                    case 19:
                                                                                        i30 = 54688;
                                                                                    case 50:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 76:
                                                            break;
                                                        case 239:
                                                            i8 = jSONArray2 == null ? 48860 : 48829;
                                                    }
                                                }
                                                int i31 = 48891;
                                                while (true) {
                                                    i31 ^= 48908;
                                                    switch (i31) {
                                                        case 22:
                                                            i3++;
                                                            int i32 = 55432;
                                                            while (true) {
                                                                i32 ^= 55449;
                                                                switch (i32) {
                                                                    case 17:
                                                                        i32 = 55463;
                                                                    case 62:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 503:
                                                            i31 = 48922;
                                                    }
                                                }
                                                break;
                                            case 47483:
                                        }
                                    }
                                }
                                break;
                            case 500:
                                return new ArrayList();
                        }
                        i2 = 1802;
                    }
                    break;
            }
            i = 1678;
        }
    }

    private String SN() {
        long j = System.currentTimeMillis();
        String str = m731(this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str == null) {
                        break;
                    } else {
                        i = 1709;
                        continue;
                    }
                case 204:
                    long j2 = m719(this);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (j - j2 <= 60000) {
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
        this.zH = C0011.m353(m728(this), m718(this), 0);
        this.i = j;
        return m731(this);
    }

    private String tF(String str, String str2) {
        String str3 = C0048.m2149(str, "_", str2);
        long j = System.currentTimeMillis();
        Long l = (Long) (m717(this).get(str3));
        boolean z = (m722(this).containsKey(str3));
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
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (l == null) {
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
                                long j2 = (l.longValue());
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (j - j2 <= 60000) {
                                                break;
                                            } else {
                                                i3 = 48736;
                                                continue;
                                            }
                                        case 47384:
                                            break;
                                        case 47417:
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
        StringBuilder sb = new StringBuilder();
        (sb.append(m725(this)));
        (sb.append("?page="));
        (sb.append(str));
        (sb.append("&pageSize=20&dataType="));
        (sb.append(str2));
        (m722(this).put(str3,C0011.m353((sb.toString()), m718(this), 0)));
        (m717(this).put(str3,(Long.valueOf(j))));
        return (String) (m722(this).get(str3));
    }

    private Map<String, String> yq() {
        HashMap hashMap = null;
        String str2 = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        hashMap = new HashMap();
        str2 = m721(this);
        str3 = "User-Agent";
        (hashMap.put(str3,str2));
        str3 = "Accept";
        str2 = "application/json";
        (hashMap.put(str3,str2));
        str3 = "Accept-Language";
        str2 = "zh-CN";
        (hashMap.put(str3,str2));
        return hashMap;
}

    private String zH(String str) {
        boolean z = (TextUtils.isEmpty(str));
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
                    return "";
                case 239:
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
                        (simpleDateFormat.setTimeZone(C0049.m2188("UTC")));
                        Date date = (simpleDateFormat.parse(str));
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault());
                        (simpleDateFormat2.setTimeZone(C0049.m2188("Asia/Shanghai")));
                        return (simpleDateFormat2.format(date));
                    } catch (Exception e) {
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    return str;
                            }
                        }
                    }
                    break;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.Long>, java.util.HashMap] */
    /* renamed from: زﻍعﺭ  reason: contains not printable characters */
    public static HashMap m717(Object obj) {
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
                    return ((Doubao) obj).Gc;
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

    /* renamed from: شﻕجو  reason: contains not printable characters */
    public static Map m718(Object obj) {
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
                    return ((Doubao) obj).yq();
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

    /* renamed from: ـصﻡﺱ  reason: contains not printable characters */
    public static long m719(Object obj) {
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
                    return ((Doubao) obj).i;
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

    /* renamed from: فﻩصﺝ  reason: contains not printable characters */
    public static String m720(Object obj, Object obj2) {
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
                    return ((Doubao) obj).zH((String) obj2);
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

    /* renamed from: كتﺱق  reason: contains not printable characters */
    public static String m721(Object obj) {
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
                    return ((Doubao) obj).tF;
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

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* renamed from: وﺫاﺩ  reason: contains not printable characters */
    public static HashMap m722(Object obj) {
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
                    return ((Doubao) obj).t0;
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

    /* renamed from: ﺎﻅصﺽ  reason: contains not printable characters */
    public static String m724(Object obj) {
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
                    return ((Doubao) obj).SN();
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

    /* renamed from: ﺝشـص  reason: contains not printable characters */
    public static String m725(Object obj) {
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
                    return ((Doubao) obj).N;
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

    /* renamed from: ﺡبﺥﺭ  reason: contains not printable characters */
    public static String m726(Object obj, Object obj2, Object obj3) {
        int i = (-768) ^ C0002.f2;
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
                    return ((Doubao) obj).tF((String) obj2, (String) obj3);
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

    /* renamed from: ﺫﺹﻅﺽ  reason: contains not printable characters */
    public static String m727(Object obj) {
        int i = (-768) ^ C0002.f2;
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
                    return ((Doubao) obj).yq;
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

    /* renamed from: ﺯلعا  reason: contains not printable characters */
    public static String m728(Object obj) {
        int i = (-604) ^ C0013.f13;
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
                    return ((Doubao) obj).SN;
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

    /* renamed from: ﺱﺡﺹط  reason: contains not printable characters */
    public static List m729(Object obj) {
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
                    return ((Doubao) obj).N();
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

    /* renamed from: ﺽﺫظﻱ  reason: contains not printable characters */
    public static ME m730(Object obj) {
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
                    return ((VodWithStatus) obj).yq;
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

    /* renamed from: ﻙخدذ  reason: contains not printable characters */
    public static String m731(Object obj) {
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
                    return ((Doubao) obj).zH;
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

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
        (r5.b(r4));
        r4 = 50813;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
        r4 = r4 ^ 50830;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017d, code lost:
        switch(r4) {
            case 18: goto L177;
            case 243: goto L178;
            default: goto L180;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
        r4 = 50844;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String categoryContent(java.lang.String r23, java.lang.String r24, boolean r25, java.util.HashMap<java.lang.String, java.lang.String> r26) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Doubao.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 522
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public java.lang.String detailContent(java.util.List<java.lang.String> r31) {
        /*
            Method dump skipped, instructions count: 3178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Doubao.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        List list = null;
        ArrayList arrayList = null;
        String str2 = null;
        rP rPVar = null;
        String str3 = null;
        // [deflattened] 控制流平坦化已还原为线性代码
        arrayList = new ArrayList();
        str3 = "live_tab";
        str2 = "📡 赛事直播";
        rPVar = new rP(str3, str2);
        (arrayList.add(rPVar));
        str3 = "replay_all";
        str2 = "🎬 全部回放";
        rPVar = new rP(str3, str2);
        (arrayList.add(rPVar));
        str3 = "replay_football";
        str2 = "⚽ 足球回放";
        rPVar = new rP(str3, str2);
        (arrayList.add(rPVar));
        str3 = "replay_basketball";
        str2 = "🏀 篮球回放";
        rPVar = new rP(str3, str2);
        (arrayList.add(rPVar));
        list = m729(this);
        str3 = C0038.m1906(arrayList, list);
        return str3;
}

    public boolean isVideoFormat(String str) {
        boolean z = (str.contains(".m3u8"));
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
                    boolean z2 = (str.contains(".mp4"));
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
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            return false;
                                        case 239:
                                            i3 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 500:
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

    public boolean manualVideoCheck() {
        return false;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        C0056.m2351(true);
        boolean z = (str2.startsWith("http"));
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
                    iX iXVar = new iX();
                    (iXVar.g1(str2));
                    (iXVar.KJ(m718(this)));
                    return (iXVar.toString());
                case 239:
                    StringBuilder sb = new StringBuilder();
                    (sb.append(m727(this)));
                    (sb.append("/play/"));
                    (sb.append(str2));
                    String str4 = (sb.toString());
                    String str5 = C0011.m353(str4, m718(this), 0);
                    String str6 = "";
                    try {
                        Matcher matcher = (C0005.m166("(https?://[\\w.\\-/:?=&]+\\.m3u8[^,\"\\s]*)").matcher((str5.replace("\\u002F","/"))));
                        str3 = str6;
                        while (true) {
                            boolean z2 = (matcher.find());
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = z2 ? 1833 : 1802;
                                    case 54:
                                    case 471:
                                        break;
                                    case 500:
                                        str3 = ((matcher.group(1)).replaceAll("[,\"]+$",str6));
                                        boolean z3 = (str3.contains("rtmpcdn"));
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    i3 = !z3 ? 48736 : 48705;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    boolean z4 = (str3.contains("live."));
                                                    int i4 = 48767;
                                                    while (true) {
                                                        i4 ^= 48784;
                                                        switch (i4) {
                                                            case 14:
                                                            case 45:
                                                                break;
                                                            case 76:
                                                                boolean z5 = (str3.contains("pul-"));
                                                                int i5 = 48891;
                                                                while (true) {
                                                                    i5 ^= 48908;
                                                                    switch (i5) {
                                                                        case 22:
                                                                        case 53:
                                                                            break;
                                                                        case 503:
                                                                            i5 = !z5 ? 49635 : 48953;
                                                                        case 32495:
                                                                            boolean z6 = (str3.contains("gkykp"));
                                                                            int i6 = 49666;
                                                                            while (true) {
                                                                                i6 ^= 49683;
                                                                                switch (i6) {
                                                                                    case 17:
                                                                                        i6 = z6 ? 49759 : 49728;
                                                                                    case 50:
                                                                                    case 76:
                                                                                        break;
                                                                                    case 83:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 239:
                                                                i4 = !z4 ? 48860 : 48829;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        int i7 = 49914;
                        while (true) {
                            i7 ^= 49931;
                            switch (i7) {
                                case 497:
                                    i7 = 50596;
                                    break;
                                case 1711:
                                    str3 = str6;
                                    break;
                            }
                        }
                    }
                    boolean z7 = (TextUtils.isEmpty(str3));
                    int i8 = 49790;
                    while (true) {
                        i8 ^= 49807;
                        switch (i8) {
                            case 18:
                                break;
                            case 51:
                                iX iXVar2 = new iX();
                                (iXVar2.g1(str4));
                                (iXVar2.F5());
                                (iXVar2.KJ(m718(this)));
                                return (iXVar2.toString());
                            case 84:
                                iX iXVar3 = new iX();
                                (iXVar3.g1(str3));
                                (iXVar3.KJ(m718(this)));
                                return (iXVar3.toString());
                            case 241:
                                if (z7) {
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
            i = 1678;
        }
    }
}
