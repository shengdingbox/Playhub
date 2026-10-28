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

        return;
    }

    private static int[] N(byte[] bArr) {
        int length;
        int length2 = bArr.length;

        if ((length2 & 3) != 0) {
            length = (bArr.length >>> 2) + 1;
        } else {
            length = bArr.length >>> 2;
            length = (bArr.length >>> 2) + 1;
        }
        int[] iArr = new int[length];
        int length3 = bArr.length;
        int i3 = 0;
        while (true) {

            if (i3 < length3) {
                int i5 = i3 >>> 2;
                iArr[i5] = iArr[i5] | ((bArr[i3] & 255) << ((i3 & 3) << 3));
                i3++;
            } else {
                return iArr;
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
        hashMap.put(str2,str3);
        return hashMap;
    }

    /* renamed from: اكﺥﺕ  reason: contains not printable characters */
    public static Map m815(Object obj) {

        return ((Kanqiu) obj).yq();
    }

    /* renamed from: غيشـ  reason: contains not printable characters */
    public static int m817(int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = 753 ^ C0000.f0;

        return SN(i, i2, i3, i4, i5, (int[]) obj);
    }

    /* renamed from: ﺡخلج  reason: contains not printable characters */
    public static String m818() {
        int i = (-404) ^ C0021.f79;

        return yq;
    }

    /* renamed from: ﻙقﻉح  reason: contains not printable characters */
    public static int[] m819(Object obj) {
        int i = (-1021) ^ C0026.f84;

        return N((byte[]) obj);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        String str4;
        String str5;
        String str6 = "cateId";
        Object obj = (hashMap.get(str6));

        if (obj != null) {
            str = (String) (hashMap.get(str6));
        } else {
            str = (String) (hashMap.get(str6));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m818());
        boolean z2 = (str.isEmpty());

        if (!z2) {
            str3 = (String.format("/match/%s/live",new Object[]{str}));
        } else {
            str3 = (String.format("%s",new Object[]{str}));
            str3 = (String.format("/match/%s/live",new Object[]{str}));
        }
        sb.append(str3);
        kB kBVar = (C0004.m119(C0028.m1633((sb.toString()), m815(this))).cS(".list-group-item"));
        ArrayList arrayList = new ArrayList();
        Iterator it = (kBVar.iterator());
        while (true) {
            boolean z3 = (it.hasNext());

            if (z3) {
                hN hNVar = (hN) (it.next());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m818());
                String str7 = ".btn.btn-primary";
                sb2.append(((hNVar.cS(str7)).yq("href")));
                String str8 = (sb2.toString());
                String str9 = ((hNVar.cS(".row.d-none")).t0());
                boolean z4 = (str9.isEmpty());
                if (z4) {
                    str4 = (hNVar.Fo());
                } else {
                    str4 = str9;
                }
                String str10 = ((((hNVar.cS(".col-xs-1")).N(0)).i("img")).yq("data-src"));
                boolean z5 = (str10.isEmpty());
                if (z5) {
                    str10 = "https://pic.imgdb.cn/item/657673d6c458853aeff94ab9.jpg";
                }
                boolean z6 = (str10.startsWith("http"));
                if (!z6) {
                    str10 = C0032.m1739(new StringBuilder(), m818(), str10);
                }
                String str11 = ((hNVar.cS(str7)).t0());
                boolean z7 = (str11.isEmpty());
                if (z7) {
                    str5 = ((hNVar.cS(".btn.btn-default")).t0());
                } else {
                    str5 = str11;
                }
                arrayList.add(new ME(str8, str4, str10, str5));
            } else {
                iX iXVar = new iX();
                iXVar.dT(1,1,0,(kBVar.size()));
                iXVar.b(arrayList);
                return (iXVar.toString());
            }
        }
    }

    public String detailContent(List<String> list) {
        String str;
        boolean z = ((String) (list.get(0)).equals(m818()));

        if (!z) {
            JSONArray jSONArray = (new JSONObject(new String(C0022.m1420((((new JSONObject(C0028.m1633(((String) (list.get(0)).replace("play","source")), m815(this))).optString("data")).substring(6)).substring(0,(str.length()) - 2)), 0))).getJSONArray("links"));
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                int i3 = (jSONArray.length());
                if (i2 < i3) {
                    JSONObject jSONObject = (jSONArray.getJSONObject(i2));
                    String str2 = (jSONObject.optString("name"));
                    String str3 = (jSONObject.optString("url"));
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("$");
                    sb.append(str3);
                    arrayList.add((sb.toString()));
                    i2++;
                } else {
                    ME me = new ME();
                    me.B((String) (list.get(0)));
                    me.dT("直播");
                    me.t0("");
                    me.KJ("请勿相信视频中任何广告");
                    me.F5((TextUtils.join("#",arrayList)));
                    return C0000.m21(me);
                }
            }
        } else {
            return iX.i();
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

            if (i2 < i3) {
                arrayList.add(new rP((String) (list.get(i2)), (String) (list2.get(i2))));
                i = i2 + 1;
            } else {
                return C0000.m9(arrayList, new JSONObject("{\"1\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"NBA\", \"v\": \"1\"}, {\"n\": \"CBA\", \"v\": \"2\"}, {\"n\": \"篮球综合\", \"v\": \"4\"}, {\"n\": \"纬来体育\", \"v\": \"21\"}]}],\"8\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"英超\", \"v\": \"8\"}, {\"n\": \"西甲\", \"v\": \"9\"}, {\"n\": \"意甲\", \"v\": \"10\"}, {\"n\": \"欧冠\", \"v\": \"12\"}, {\"n\": \"欧联\", \"v\": \"13\"}, {\"n\": \"德甲\", \"v\": \"14\"}, {\"n\": \"法甲\", \"v\": \"15\"}, {\"n\": \"欧国联\", \"v\": \"16\"}, {\"n\": \"足总杯\", \"v\": \"27\"}, {\"n\": \"国王杯\", \"v\": \"33\"}, {\"n\": \"中超\", \"v\": \"7\"}, {\"n\": \"亚冠\", \"v\": \"11\"}, {\"n\": \"足球综合\", \"v\": \"23\"}, {\"n\": \"欧协联\", \"v\": \"28\"}, {\"n\": \"美职联\", \"v\": \"26\"}]}], \"29\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"网球\", \"v\": \"29\"}, {\"n\": \"斯洛克\", \"v\": \"30\"}, {\"n\": \"MLB\", \"v\": \"38\"}, {\"n\": \"UFC\", \"v\": \"32\"}, {\"n\": \"NFL\", \"v\": \"25\"}, {\"n\": \"CCTV5\", \"v\": \"18\"}]}]}"));
            }
        }
    }

    public void init(Context context, String str) {
        boolean z = (str.isEmpty());

        if (z) {
            return;
        } else {
            yq = str;
            return;
        }
    }

    public String matcher(String str, String str2) {
        Matcher matcher = (C0005.m166(str2).matcher(str));
        boolean z = (matcher.find());

        if (!z) {
            return "";
        } else {
            return (matcher.group(1));
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0056.m2351(true);
        boolean z = (str2.contains("?url="));

        if (!z) {
            boolean z2 = (str2.contains("?id="));
            if (z2) {
                String str4 = C0028.m1633(str2, m815(this));
                String str5 = "encodedStr = '(.*?)'";
                String str6 = (this.matcher(str4,str5));
                boolean z3 = (TextUtils.isEmpty(str6));
                if (z3) {
                    String str7 = (this.matcher(str4,"src='(.*?)\"\\+id"));
                    boolean z4 = (TextUtils.isEmpty(str7));
                    if (!(z4)) {
                        str6 = (this.matcher(C0028.m1633(C0048.m2149((str2.substring(0,(str2.indexOf("/",8)))), str7, ((str2.split("\\?id="))[1].split("&"))[0]), m815(this)),str5));
                    }
                }
                boolean z5 = (TextUtils.isEmpty(str6));
                if (!(z5)) {
                    String str8 = (new JSONObject((this.xxteaDecrypt(C0022.m1420(str6, 0),"ABCDEFGHIJKLMNOPQRSTUVWX"))).optString("url"));
                    iX iXVar2 = new iX();
                    iXVar2.g1(str8);
                    iXVar2.KJ(m815(this));
                    return (iXVar2.toString());
                }
            }
            iX iXVar3 = new iX();
            iXVar3.g1(str2);
            iXVar3.F5();
            iXVar3.KJ(m815(this));
            return (iXVar3.toString());
        } else {
            String str3 = C0055.m2312((str2.split("\\?url="))[1]);
            iX iXVar = new iX();
            iXVar.g1(str3);
            iXVar.KJ(m815(this));
            return (iXVar.toString());
        }
    }

    public String xxteaDecrypt(byte[] bArr, String str) {
        int[] iArr;
        String str2;

        if (!(bArr == null)) {
            int length = bArr.length;
            if (length != 0) {
                int[] iArr2 = m819(bArr);
                int[] iArr3 = m819((str.getBytes(StandardCharsets.UTF_8)));
                int length2 = iArr2.length;
                if (length2 >= 2) {
                    int length3 = iArr3.length;
                    if (length3 >= 4) {
                        iArr = iArr3;
                    } else {
                        iArr = new int[4];
                        C0025.m1532(iArr3, 0, iArr, 0, iArr3.length);
                        iArr = iArr3;
                    }
                    int length4 = iArr2.length - 1;
                    int i5 = ((52 / (length4 + 1)) + 6) * (-1640531527);
                    int i6 = iArr2[0];
                    while (true) {
                        if (i5 != 0) {
                            int i8 = (i5 >>> 2) & 3;
                            int i9 = length4;
                            while (true) {
                                if (i9 > 0) {
                                    int i12 = i9 - 1;
                                    i6 = iArr2[i9] - m817(i5, i6, iArr2[i12], i9, i8, iArr);
                                    iArr2[i9] = i6;
                                    i9 = i12;
                                } else {
                                    i6 = iArr2[0] - m817(i5, i6, iArr2[length4], 0, i8, iArr);
                                    iArr2[0] = i6;
                                    i5 += 1640531527;
                                }
                            }
                        } else {
                            int length5 = iArr2.length;
                            int i14 = iArr2[iArr2.length - 1];
                            int i15 = (length5 << 2) - 4;
                            if (!(i14 < i15 - 3)) {
                                if (i14 <= i15) {
                                    byte[] bArr2 = new byte[i14];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < i14) {
                                            bArr2[i18] = (byte) (iArr2[i18 >>> 2] >>> ((i18 & 3) << 3));
                                            i18++;
                                        } else {
                                            str2 = new String(bArr2, StandardCharsets.UTF_8);
                                        }
                                    }
                                } else {
                                    str2 = null;
                                    byte[] bArr2 = new byte[i14];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < i14) {
                                            bArr2[i18] = (byte) (iArr2[i18 >>> 2] >>> ((i18 & 3) << 3));
                                            i18++;
                                        } else {
                                            str2 = new String(bArr2, StandardCharsets.UTF_8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return null;
                }
            } else {
                str2 = null;
                int[] iArr2 = m819(bArr);
                int[] iArr3 = m819((str.getBytes(StandardCharsets.UTF_8)));
                int length2 = iArr2.length;
                if (length2 >= 2) {
                    int length3 = iArr3.length;
                    if (length3 >= 4) {
                        iArr = iArr3;
                    } else {
                        iArr = new int[4];
                        C0025.m1532(iArr3, 0, iArr, 0, iArr3.length);
                        iArr = iArr3;
                    }
                    int length4 = iArr2.length - 1;
                    int i5 = ((52 / (length4 + 1)) + 6) * (-1640531527);
                    int i6 = iArr2[0];
                    while (true) {
                        if (i5 != 0) {
                            int i8 = (i5 >>> 2) & 3;
                            int i9 = length4;
                            while (true) {
                                if (i9 > 0) {
                                    int i12 = i9 - 1;
                                    i6 = iArr2[i9] - m817(i5, i6, iArr2[i12], i9, i8, iArr);
                                    iArr2[i9] = i6;
                                    i9 = i12;
                                } else {
                                    i6 = iArr2[0] - m817(i5, i6, iArr2[length4], 0, i8, iArr);
                                    iArr2[0] = i6;
                                    i5 += 1640531527;
                                }
                            }
                        } else {
                            int length5 = iArr2.length;
                            int i14 = iArr2[iArr2.length - 1];
                            int i15 = (length5 << 2) - 4;
                            if (!(i14 < i15 - 3)) {
                                if (i14 <= i15) {
                                    byte[] bArr2 = new byte[i14];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < i14) {
                                            bArr2[i18] = (byte) (iArr2[i18 >>> 2] >>> ((i18 & 3) << 3));
                                            i18++;
                                        } else {
                                            str2 = new String(bArr2, StandardCharsets.UTF_8);
                                        }
                                    }
                                } else {
                                    str2 = null;
                                    byte[] bArr2 = new byte[i14];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < i14) {
                                            bArr2[i18] = (byte) (iArr2[i18 >>> 2] >>> ((i18 & 3) << 3));
                                            i18++;
                                        } else {
                                            str2 = new String(bArr2, StandardCharsets.UTF_8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return null;
                }
            }
        }
        str2 = null;
        return str2;
    }
}
