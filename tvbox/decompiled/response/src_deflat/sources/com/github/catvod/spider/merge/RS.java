package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.parser.C0015;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0047;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0055;
import com.github.catvod.spider.C0057;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class RS {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f66short = {2793, 2793, 2238, 2706, 2702, 2702, 2698, 2697, 2752, 2773, 2773, 2715, 2698, 2707, 2772, 2708, 2708, 2772, 2713, 2707, 2773, 2709, 2713, 2696, 2773, 2712, 2764, 2766, 2773, 2702, 2719, 2690, 2702, 1677, 1665, 1674, 1675, 2216, 2212, 2212, 2208, 2210, 2222, 762, 728, 717, 734, 731, 731, 726, 664, 642, 665, 647, 663, 671, 751, 646, 646, 652, 663, 763, 734, 729, 706, 719, 663, 726, 726, 709, 724, 735, 641, 643, 670, 663, 758, 711, 711, 731, 722, 736, 722, 725, 764, 734, 707, 664, 642, 644, 640, 665, 644, 641, 663, 671, 764, 767, 739, 762, 763, 667, 663, 731, 734, 732, 722, 663, 752, 722, 724, 732, 728, 670, 663, 756, 735, 709, 728, 730, 722, 664, 646, 643, 655, 665, 647, 665, 647, 665, 647, 663, 740, 726, 721, 726, 709, 734, 664, 642, 644, 640, 665, 644, 641, 1128, 1102, 1112, 1103, 1040, 1148, 1114, 1112, 1107, 1097, 2461, 2444, 2449, 2461, 2502, 2457, 2437, 2440, 2432, 2439, 2514, 2505, 2442, 2433, 2440, 2459, 2458, 2444, 2461, 2516, 2460, 2461, 2447, 2500, 2513, 462, 428, 442, 427, 498, 444, 432, 432, 436, 438, 442, 2741, 2741, 1960, 2949, 2949, 2374, 1265, 1265, 1962, 2575, 2575, 634, 905, 912, 912, 915, 964, 914, 900, 967, 967, 903, 989, 920, 990, 987, 984, 907, 910, 924, 904, 979, 984, 896, 984, 987, 921, 926, 988, 991, 907, 964, 926, 897, 1143, 1136, 1151, 1087, 1138, 1149, 1150, 1124, 1141, 1143, 1149, 1136, 1123, 1140, 1087, 1056, 1065, 1059, 1063, 1065, 1059, 1087, 1129, 1128, 1131, 1913, 1825, 1911, 1891, 1910, 1916, 1825, 1891, 1915, 1899, 1825, 1914, 1902, 1000, 1009, 1018, 944, 998, 1010, 999, 1005, 944, 1011, 1019, 585, 529, 583, 595, 527, 526, 529, 602, 586, 529, 604, 604, 547, 570, 561, 635, 557, 569, 556, 550, 635, 566, 566, 635, 544, 564, 1731, 1738, 1733, 1746, 1748, 1673, 1732, 1732, 274, 272, 328, 287, 287, 258, 277, 287, 277, 328, 274, 265, 278, 3140, 3157, 3148, 3083, 3151, 3150, 3140, 3148, 3083, 3137, 3136, 2055, 2070, 2063, 2120, 2056, 2056, 2120, 2053, 2063, 644, 640, 650, 649, 650, 733, 656, 656, 1904, 1889, 1912, 1855, 1894, 1890, 1896, 1899, 1896, 1855, 1919, 1908, 1893, 672, 672, 672, 761, 699, 702, 693, 673, 702, 696, 761, 699, 702, 689, 690, 512, 534, 534, 535, 539, 518, 529, 605, 515, 513, 540, 1717, 1717, 1717, 1772, 1702, 1709, 1719, 1696, 1699, 1709, 1720, 1706, 1707, 1696, 1709, 1772, 1697, 1709, 1711, 1801, 1795, 1796, 1799, 1803, 1816, 1802, 1803, 1792, 1805, 1868, 1793, 1793};

    public static JSONObject N(String str, HashMap hashMap) {
        Response response;
        OkHttpClient okHttpClient;
        String str2;
        String str3 = C0034.m1781(m1149(), 0, 2, 2758);
        String str4 = C0011.m339(str, str3)[1];
        String str5 = C0005.m169(m1149(), 2, 1, 2193);
        String str6 = (String) C0007.m220((HashMap) m1153(), C0011.m339(str4, str5)[0]);
        String str7 = C0032.m1749(m1149(), 3, 30, 2810);
        String str8 = (String) C0007.m220((HashMap) m1153(), C0011.m339(C0011.m339(str7, str3)[1], str5)[0]);
        String str9 = C0004.m130(m1149(), 33, 4, 1774);
        String str10 = C0006.m180(m1149(), 37, 6, 2251);
        String str11 = C0031.m1705();
        String str12 = C0039.m1937(m1149(), 43, 102, 695);
        String str13 = C0015.m457(m1149(), 145, 10, 1085);
        String str14 = C0025.m1542(m1149(), 155, 25, 2537);
        String str15 = C0046.m2123(m1149(), 180, 1, 501);
        String str16 = C0042.m2010(m1149(), 181, 10, 479);

        if (!(str6 != null)) {
            if (!(str8 != null)) {
                try {
                    Response response2 = m1136(str, hashMap);
                    ResponseBody responseBody = m1146(response2);
                    if (responseBody != null) {
                        List list = m1144(response2, str16);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = C0014.m435(list);
                        while (true) {
                            boolean z = C0000.m11(it);
                            if (z) {
                                C0032.m1746(sb, (String) C0026.m1556(it));
                                C0032.m1746(sb, str15);
                            } else {
                                String str17 = C0043.m2039(sb);
                                InputStream inputStream = m1138(m1146(response2));
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i5 = C0049.m2182(inputStream, bArr);
                                    if (i5 != -1) {
                                        C0023.m1459(byteArrayOutputStream, bArr, 0, i5);
                                    } else {
                                        C0049.m2201(inputStream);
                                        Response response3 = m1140(m1152(m1147(0), m1148(m1141(m1137(m1145(new Request.Builder(), str7), m1143(m1139(str14), C0034.m1790(C0033.m1770(byteArrayOutputStream), 2))), str13, str12))));
                                        ResponseBody responseBody2 = m1146(response3);
                                        if (!(responseBody2 == null)) {
                                            str11 = m1142(m1146(response3));
                                        }
                                        JSONObject jSONObject = new JSONObject();
                                        C0005.m159(jSONObject, str10, str17);
                                        C0005.m159(jSONObject, str9, str11);
                                        return jSONObject;
                                    }
                                }
                            }
                        }
                    } else {
                        return null;
                    }
                } catch (Exception e) {
                    C0011.m342(e);
                    return null;
                }
            }
        }
        int i12 = 51588;
        while (true) {
            i12 ^= 51605;
            try {
                switch (i12) {
                    case 17:
                    if (str6 == null) {
                        break;
                    } else {
                        i12 = 51681;
                        continue;
                    }
                    case 54:
                    break;
                    case 87:
                    response = m1136(str, hashMap);
                    break;
                    case 116:
                    response = m1150(str, hashMap, str6, 0);

                    break;
                }
                i12 = 51650;
            } catch (Exception e2) {
                C0011.m342(e2);
                return null;
            }
        }
        ResponseBody responseBody3 = m1146(response);

        if (responseBody3 != null) {
            List list2 = m1144(response, str16);
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = C0014.m435(list2);
            while (true) {
                boolean z2 = C0000.m11(it2);
                if (z2) {
                    C0032.m1746(sb2, (String) C0026.m1556(it2));
                    C0032.m1746(sb2, str15);
                } else {
                    String str18 = C0043.m2039(sb2);
                    InputStream inputStream2 = m1138(m1146(response));
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int i16 = C0049.m2182(inputStream2, bArr2);
                        if (i16 != -1) {
                            C0023.m1459(byteArrayOutputStream2, bArr2, 0, i16);
                        } else {
                            C0049.m2201(inputStream2);
                            RequestBody requestBody = m1143(m1139(str14), C0034.m1790(C0033.m1770(byteArrayOutputStream2), 2));
                            if (str8 == null) {
                                okHttpClient = m1147(0);
                            } else {
                                okHttpClient = m1135(str8, 0);
                                okHttpClient = m1147(0);
                            }
                            Response response4 = m1140(m1152(okHttpClient, m1148(m1141(m1137(m1145(new Request.Builder(), str7), requestBody), str13, str12))));
                            ResponseBody responseBody4 = m1146(response4);
                            if (responseBody4 == null) {
                                str2 = str11;
                            } else {
                                str2 = m1142(m1146(response4));
                                str2 = str11;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            C0005.m159(jSONObject2, str10, str18);
                            C0005.m159(jSONObject2, str9, str2);
                            return jSONObject2;
                        }
                    }
                }
            }
        } else {
            return null;
        }
    }

    public static String SN(String str, Map<String, String> map, int i) {
        String str2;
        String str3 = (String) C0007.m220((HashMap) m1153(), C0011.m339(C0011.m339(str, C0054.m2301(m1149(), 191, 2, 2714))[1], C0031.m1713(m1149(), 193, 1, 1927))[0]);

        if (str3 != null) {
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                try {
                    switch (i4) {
                        case 17:
                        if (i != 0) {
                            break;
                        } else {
                            i4 = 48736;
                            continue;
                        }
                        case 47384:
                        str2 = C0003.m106(str, map, str3, i);
                        break;
                        case 47417:
                        str2 = C0003.m106(str, map, str3, 0);
                        break;
                        case 47483:
                        break;
                    }
                    i4 = 48705;
                } catch (Exception e) {
                    C0011.m342(e);
                    return null;
                }
            }
            return str2;
        } else {
            if (i != 0) {
                return C0052.m2267(str, map, i);
            } else {
                return C0001.m32(str, map);
            }
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                try {
                    switch (i4) {
                        case 17:
                        if (i != 0) {
                            break;
                        } else {
                            i4 = 48736;
                            continue;
                        }
                        case 47384:
                        str2 = C0003.m106(str, map, str3, i);
                        break;
                        case 47417:
                        str2 = C0003.m106(str, map, str3, 0);
                        break;
                        case 47483:
                        break;
                    }
                    i4 = 48705;
                } catch (Exception e) {
                    C0011.m342(e);
                    return null;
                }
            }
            return str2;
        }
    }

    public static String i(String str, Map<String, String> map, Map<String, String> map2) {
        String str2 = (String) C0007.m220((HashMap) m1153(), C0011.m339(C0011.m339(str, C0010.m296(m1149(), 194, 2, 2986))[1], C0033.m1764(m1149(), 196, 1, 2409))[0]);

        if (str2 != null) {
            try {
                String str4 = C0003.m102(str, map, map2, str2);
                return str4;
            } catch (Exception e) {
                C0011.m342(e);
                return null;
            }
        } else {
            String str3 = C0042.m2001(str, map, map2);
            return str3;
        }
    }

    public static String t0(String str, Map<String, String> map, Map<String, String> map2) {
        String str2 = (String) C0007.m220((HashMap) m1153(), C0011.m339(C0011.m339(str, C0007.m210(m1149(), 197, 2, 1246))[1], C0035.m1833(m1149(), 199, 1, 1925))[0]);

        if (str2 != null) {
            return m1151(m1135(str2, 0), str, null, map, map2, null);
        } else {
            return m1151(m1147(0), str, null, map, map2, null);
        }
    }

    public static Response tF(String str, Map<String, String> map) {
        String str2 = (String) C0007.m220((HashMap) m1153(), C0011.m339(C0011.m339(str, C0033.m1764(m1149(), 200, 2, 2592))[1], C0009.m277(m1149(), 202, 1, 597))[0]);

        if (str2 != null) {
            try {
                return m1150(str, map, str2, 0);
            } catch (Exception e) {
                C0011.m342(e);
                return null;
            }
        } else {
            return m1136(str, map);
        }
    }

    public static String yq(String str, Map<String, String> map) {
        return C0011.m353(str, map, 0);
    }

    private static Map<String, String> zH() {
        String str = "ۣۧ۟";
        String str2 = null;
        HashMap hashMap = null;
        String str3 = null;
        String str4 = null;
        short[] sArr = null;
        while (true) {
            switch (C0002.m76(str)) {
                case 56358:
                short[] sArr2 = m1149();
                str2 = C0054.m2301(sArr2, 235, 25, 1041);
                str = "ۣۢۧ";
                sArr = sArr2;
                break;
                case 1746817:
                sArr = m1149();
                str3 = C0046.m2123(sArr, 331, 11, 3109);
                str = "ۡۧۤ";
                break;
                case 1748673:
                String str5 = C0052.m2261(sArr, 387, 11, 627);
                C0042.m1999(hashMap, str5, str2);
                str = "ۤۥۤ";
                str4 = str5;
                break;
                case 1748740:
                String str6 = C0032.m1749(sArr, 296, 14, 597);
                C0042.m1999(hashMap, str6, str2);
                str = "ۤ۟ۤ";
                str4 = str6;
                break;
                case 1748834:
                C0042.m1999(hashMap, str3, str2);
                sArr = m1149();
                str = "ۥ۟ۡ";
                break;
                case 1748862:
                C0042.m1999(hashMap, str3, str2);
                sArr = m1149();
                str = "ۣۢۨ";
                break;
                case 1749703:
                String str7 = C0038.m1903(sArr, 342, 9, 2150);
                C0042.m1999(hashMap, str7, str2);
                str = "ۤۧۢ";
                str4 = str7;
                break;
                case 1750632:
                sArr = m1149();
                str3 = C0020.m1390(sArr, 260, 13, 1807);
                str = "۠۠";
                break;
                case 1751497:
                sArr = m1149();
                str3 = C0047.m2133(sArr, 310, 8, 1703);
                str = "ۡۦۧ";
                break;
                case 1751590:
                C0042.m1999(hashMap, str3, str2);
                sArr = m1149();
                str = "ۥ۠ۧ";
                break;
                case 1751625:
                sArr = m1149();
                str3 = C0001.m35(sArr, 372, 15, 727);
                str = "ۦۤ۟";
                break;
                case 1751650:
                return hashMap;
                case 1751653:
                C0042.m1999(hashMap, str3, str2);
                sArr = m1149();
                str = "ۣۡۦ";
                break;
                case 1751656:
                sArr = m1149();
                str3 = C0023.m1457(sArr, 284, 12, 575);
                str = "ۤۤۥ";
                break;
                case 1751683:
                sArr = m1149();
                str3 = C0005.m169(sArr, 398, 19, 1730);
                str = "ۤۢۤ";
                break;
                case 1751743:
                sArr = m1149();
                str3 = C0032.m1749(sArr, 351, 8, 755);
                str = "ۨ۟ۧ";
                break;
                case 1752455:
                String str8 = C0002.m57(sArr, 318, 13, 358);
                C0042.m1999(hashMap, str8, str2);
                str = "ۣ۟ۥ";
                str4 = str8;
                break;
                case 1752492:
                String str9 = C0043.m2020(sArr, 417, 13, 1890);
                C0042.m1999(hashMap, str9, str2);
                str = "ۤۤۢ";
                str4 = str9;
                break;
                case 1752735:
                String str10 = C0014.m421(sArr, 359, 13, 1809);
                C0042.m1999(hashMap, str10, str2);
                str = "ۣۤۨ";
                str4 = str10;
                break;
                case 1753482:
                String str11 = C0040.m1953(sArr, 273, 11, 926);
                C0042.m1999(hashMap, str11, str2);
                str = "ۤۤۨ";
                str4 = str11;
                break;
                case 1753569:
                C0042.m1999(hashMap, str3, str2);
                sArr = m1149();
                str = "ۡۡۡ";
                break;
                case 1754499:
                sArr = m1149();
                str4 = C0003.m86(sArr, 203, 32, 1002);
                str = "ۡۧ";
                break;
                case 1755344:
                C0042.m1999(hashMap, str3, str2);
                sArr = m1149();
                str = "ۥۨۢ";
                break;
                default:
                hashMap = C0055.m2325(str4, str2, str3, str2);
                sArr = m1149();
                str = "ۦۡۥ";
                break;
            }
        }
    }

    /* renamed from: تﺭﺕذ  reason: contains not printable characters */
    public static OkHttpClient m1135(Object obj, int i) {
        int i2 = C0002.m60();

        if (i2 > 0) {
            return null;
        } else {
            return C0068Pe.SN((String) obj, i);
        }
    }

    /* renamed from: دﻁﺽﻝ  reason: contains not printable characters */
    public static Response m1136(Object obj, Object obj2) {
        int i = C0000.m13();

        if (i < 0) {
            return null;
        } else {
            return C0068Pe.Gc((String) obj, (Map) obj2);
        }
    }

    /* renamed from: راثـ  reason: contains not printable characters */
    public static Request.Builder m1137(Object obj, Object obj2) {
        int i = C0057.m2368();

        if (i <= 0) {
            return null;
        } else {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
    }

    /* renamed from: رﺽدح  reason: contains not printable characters */
    public static InputStream m1138(Object obj) {
        int i = C0013.m382();

        if (i > 0) {
            return null;
        } else {
            return ((ResponseBody) obj).byteStream();
        }
    }

    /* renamed from: ظﻩﻙﺙ  reason: contains not printable characters */
    public static MediaType m1139(Object obj) {
        int i = C0023.m1475();

        if (i <= 0) {
            return null;
        } else {
            return MediaType.parse((String) obj);
        }
    }

    /* renamed from: فﻕكز  reason: contains not printable characters */
    public static Response m1140(Object obj) {
        int i = C0004.m129();

        if (i >= 0) {
            return null;
        } else {
            return ((Call) obj).execute();
        }
    }

    /* renamed from: قصخل  reason: contains not printable characters */
    public static Request.Builder m1141(Object obj, Object obj2, Object obj3) {
        int i = C0026.m1561();

        if (i > 0) {
            return null;
        } else {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
    }

    /* renamed from: قﻍﺯﻉ  reason: contains not printable characters */
    public static String m1142(Object obj) {
        int i = C0025.m1534();

        if (i > 0) {
            return null;
        } else {
            return ((ResponseBody) obj).string();
        }
    }

    /* renamed from: كﺝﺯﺹ  reason: contains not printable characters */
    public static RequestBody m1143(Object obj, Object obj2) {
        int i = C0013.m382();

        if (i > 0) {
            return null;
        } else {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
    }

    /* renamed from: كﻱﺽﺹ  reason: contains not printable characters */
    public static List m1144(Object obj, Object obj2) {
        int i = C0052.m2256();

        if (i <= 0) {
            return null;
        } else {
            return ((Response) obj).headers((String) obj2);
        }
    }

    /* renamed from: ﺏﺹﻱﺥ  reason: contains not printable characters */
    public static Request.Builder m1145(Object obj, Object obj2) {
        int i = C0052.m2256();

        if (i < 0) {
            return null;
        } else {
            return ((Request.Builder) obj).url((String) obj2);
        }
    }

    /* renamed from: ﺕكشﺙ  reason: contains not printable characters */
    public static ResponseBody m1146(Object obj) {
        int i = C0032.m1750();

        if (i > 0) {
            return null;
        } else {
            return ((Response) obj).body();
        }
    }

    /* renamed from: ﺡثحﺝ  reason: contains not printable characters */
    public static OkHttpClient m1147(int i) {
        int i2 = C0015.m447();

        if (i2 <= 0) {
            return null;
        } else {
            return C0068Pe.yq(i);
        }
    }

    /* renamed from: ﺩﻕظط  reason: contains not printable characters */
    public static Request m1148(Object obj) {
        int i = C0002.m60();

        if (i > 0) {
            return null;
        } else {
            return ((Request.Builder) obj).build();
        }
    }

    /* renamed from: ﺯرتش  reason: contains not printable characters */
    public static short[] m1149() {
        int i = C0002.m60();

        if (i >= 0) {
            return null;
        } else {
            return f66short;
        }
    }

    /* renamed from: ﻁﺵﻅك  reason: contains not printable characters */
    public static Response m1150(Object obj, Object obj2, Object obj3, int i) {
        int i2 = C0011.m344();

        if (i2 < 0) {
            return null;
        } else {
            return C0068Pe.KJ((String) obj, (Map) obj2, (String) obj3, i);
        }
    }

    /* renamed from: ﻝرﺙج  reason: contains not printable characters */
    public static String m1151(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = C0015.m447();

        if (i <= 0) {
            return null;
        } else {
            return C0068Pe.xa((OkHttpClient) obj, (String) obj2, (String) obj3, (Map) obj4, (Map) obj5, (Map) obj6);
        }
    }

    /* renamed from: ﻝﻍـح  reason: contains not printable characters */
    public static Call m1152(Object obj, Object obj2) {
        int i = C0040.m1954();

        if (i > 0) {
            return null;
        } else {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
    }

    /* renamed from: ﻭاﺫﻱ  reason: contains not printable characters */
    public static Map m1153() {
        int i = C0040.m1954();

        if (i > 0) {
            return null;
        } else {
            return zH();
        }
    }
}
