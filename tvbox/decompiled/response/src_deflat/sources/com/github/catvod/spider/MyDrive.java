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

        return;
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

        if (i2 <= i) {
            z = false;
        } else {
            z = true;
            z = false;
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

        if (!(list == null)) {
            boolean z = (list.isEmpty());
            if (!z) {
                StringBuilder sb = new StringBuilder();
                Iterator it = (list.iterator());
                boolean z2 = true;
                while (true) {
                    boolean z3 = (it.hasNext());
                    if (z3) {
                        String str = (String) (it.next());
                        if (str != null) {
                            boolean z4 = (str.isEmpty());
                            if (!(z4)) {
                                if (!z2) {
                                    sb.append(",");
                                } else {
                                    z2 = false;
                                }
                                String str2 = "\"";
                                String str3 = (str.replace(str2,"\\\""));
                                sb.append(str2);
                                sb.append(str3);
                                sb.append(str2);
                            }
                        }
                    } else {
                        return (sb.toString());
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                Iterator it = (list.iterator());
                boolean z2 = true;
                while (true) {
                    boolean z3 = (it.hasNext());
                    if (z3) {
                        String str = (String) (it.next());
                        if (str != null) {
                            boolean z4 = (str.isEmpty());
                            if (!(z4)) {
                                if (!z2) {
                                    sb.append(",");
                                } else {
                                    z2 = false;
                                }
                                String str2 = "\"";
                                String str3 = (str.replace(str2,"\\\""));
                                sb.append(str2);
                                sb.append(str3);
                                sb.append(str2);
                            }
                        }
                    } else {
                        return (sb.toString());
                    }
                }
            }
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
        hashMap.put(str7,"https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=%s&_page=%s&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,file_name:asc");
        String str8 = "saveU";
        hashMap.put(str8,"https://pc-api.uc.cn/1/clouddrive/file/category?pr=UCBrowser&fr=pc&pdir_fid=%s&_page=%s&_size=10&_fetch_total=1&_fetch_sub_dirs=0&_sort=updated_at:desc&source=save_as&labels=SAVE_AS_TOP_LAYER");
        String str9 = "阿狸";
        hashMap.put(str9,"https://api.aliyundrive.com/adrive/v3/file/list");
        String str10 = "saveA";
        hashMap.put(str10,"https://bizapi.alipan.com/adrive/v1/user/home/recentSave");
        hashMap.put("嘟嘟","https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dir=%s&dp-logid=&order=name&desc=0&num=100&page=%s");
        boolean z = (str2.isEmpty());

        if (z) {
            boolean z2 = (str.equals(str4));
            if (!z2) {
                boolean z3 = (str.equals(str7));
                if (!z3) {
                    boolean z4 = (str.equals(str9));
                    if (z4) {
                        return (String) (hashMap.get(str10));
                    }
                } else {
                    return (String) (hashMap.get(str8));
                }
            } else {
                return (String) (hashMap.get(str6));
            }
        }
        return (String.format((String) (hashMap.get(str)),new Object[]{str2, str3}));
    }

    /* renamed from: ثخﻍج  reason: contains not printable characters */
    public static Boolean m888(Object obj, Object obj2, int i) {
        int i2 = (-31) ^ C0041.f99;

        return ((MyDrive) obj).W((String) obj2, i);
    }

    /* renamed from: سدذث  reason: contains not printable characters */
    public static String m889(Object obj) {
        int i = 215 ^ C0038.f96;

        return ((MyDrive) obj).O;
    }

    /* renamed from: سﻭﺩغ  reason: contains not printable characters */
    public static Boolean m890(Object obj) {
        int i = (-487) ^ C0053.f111;

        return ((Pan) obj).dT;
    }

    /* renamed from: ظﺕما  reason: contains not printable characters */
    public static String m891(Object obj) {
        int i = (-314) ^ C0002.f2;

        return ((MyDrive) obj).n;
    }

    /* renamed from: كدعص  reason: contains not printable characters */
    public static String m892(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = (-477) ^ C0042.f100;

        return ((MyDrive) obj).v3((String) obj2, (String) obj3, (String) obj4);
    }

    /* renamed from: كذعﻕ  reason: contains not printable characters */
    public static void m893(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i = 284 ^ C0041.f99;

        ((MyDrive) obj).dT((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (List) obj7, (List) obj8);
        int i4 = 658 ^ C0029.f87;

        return;
    }

    /* renamed from: كﺵﻅﺽ  reason: contains not printable characters */
    public static String m894(Object obj, Object obj2) {
        int i = 284 ^ C0041.f99;

        return ((MyDrive) obj).B((String) obj2);
    }

    /* renamed from: لواـ  reason: contains not printable characters */
    public static Boolean m895(Object obj) {
        int i = (-4) ^ C0029.f87;

        return ((Pan) obj).F5;
    }

    /* renamed from: ﺕثجﻡ  reason: contains not printable characters */
    public static void m896(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, boolean z) {
        int i = 215 ^ C0038.f96;

        ((MyDrive) obj).q((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (List) obj8, (List) obj9, z);
        int i4 = 802 ^ C0052.f110;

        return;
    }

    /* renamed from: ﺙﻱﺽص  reason: contains not printable characters */
    public static Boolean m897(Object obj) {
        int i = (-487) ^ C0053.f111;

        return ((Pan) obj).W;
    }

    /* renamed from: ﺝﺥﺙﻕ  reason: contains not printable characters */
    public static int m898(Object obj) {
        int i = 624 ^ C0012.f12;

        return ((MyDrive) obj).s;
    }

    /* renamed from: ﺯﺭخﻙ  reason: contains not printable characters */
    public static Boolean m899(Object obj) {
        int i = (-886) ^ C0021.f79;

        return ((Pan) obj).v3;
    }

    /* renamed from: ﺵكـﻅ  reason: contains not printable characters */
    public static void m900(Object obj) {
        int i = (-314) ^ C0002.f2;

        SpiderDebug.log((Throwable) obj);
        return;
    }

    /* renamed from: ﻅتلك  reason: contains not printable characters */
    public static void m901(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i = 813 ^ C0033.f91;

        ((MyDrive) obj).G4((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (List) obj7, (List) obj8);
        return;
    }

    /* renamed from: ﻅكﻭﻙ  reason: contains not printable characters */
    public static String m902(Object obj, Object obj2, Object obj3) {
        int i = (-314) ^ C0002.f2;

        return ((MyDrive) obj).F5((String) obj2, (String) obj3);
    }

    /* renamed from: ﻕثﺎح  reason: contains not printable characters */
    public static String m903(Object obj) {
        int i = 697 ^ C0024.f82;

        return ((MyDrive) obj).g1;
    }

    /* renamed from: ﻙﻅﺎﻭ  reason: contains not printable characters */
    public static void m904(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i = (-821) ^ C0025.f83;

        ((MyDrive) obj).G((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (List) obj7, (List) obj8);
        return;
    }

    public String action(String str) {
        String str2 = "";
        try {
            Activity activity = InitOrigin.getActivity();
            boolean z = (str.contains("优汐"));
            String str3 = "url";
            String str4 = "@";

            if (z) {
                try {
                    (new C0098ew().i((new JSONObject(super.playerContent((str.split(str4))[0], (str.split(str4))[1], null)).getString(str3))));
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
            boolean z2 = (str.contains("夸父"));

            if (z2) {
                try {
                    (new C0098ew().i((new JSONObject(super.playerContent((str.split(str4))[0], (str.split(str4))[1], null)).getString(str3))));
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            }
            boolean z3 = (str.contains("阿狸"));

            if (z3) {
                try {
                    (new C0098ew().i((new JSONObject(super.playerContent((str.split(str4))[0], (str.split(str4))[1], null)).getString(str3))));
                } catch (JSONException e3) {
                    throw new RuntimeException(e3);
                }
            }
            boolean z4 = (str.equals("playMode"));

            if (z4) {
                String str5 = C0021.m1398(Pan.getPlayModeFilesDir());
                boolean z5 = C0020.m1370(str5);
                String str6 = "默认";
                String str7 = "模式1";
                if (!(z5)) {
                    boolean z6 = (str5.equals(str6));
                }
                Pan.Gd = str7;
                C0014.m432(Pan.getPlayModeFilesDir(), str7);
                C0006.m194("播放模式已变更为模式1");
                boolean z7 = (str5.equals(str7));
                if (z7) {
                    Pan.Gd = str6;
                    C0014.m432(Pan.getPlayModeFilesDir(), str6);
                    C0006.m194("播放模式已变更为默认模式");
                }
            }
            boolean z8 = (str.contains("Show"));

            if (z8) {
                boolean z9 = (str.contains("Login"));
                if (z9) {
                    this.show(str,activity);
                }
                boolean z10 = (str.contains("pushCk"));
                if (z10) {
                    this.show(str,activity);
                }
                boolean z11 = (str.contains("panSort"));
                if (z11) {
                    this.show(str,activity);
                }
                boolean z12 = (str.contains("panSourceSort"));
                if (z12) {
                    this.show(str,activity);
                }
            }
            boolean z13 = (str.contains("Clean"));

            if (!z13) {
                return str2;
            } else {
                C0027.m1576(str);
                C0006.m194("清除成功");
                return str2;
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
        arrayList.add(new rP("peizhi", "云盘配置"));
        boolean z2 = C0020.m1370(C0008.m236(Z.Zm()));
        String str = "1";

        if (z2) {
            boolean z3 = C0020.m1370(C0036.m1837(Z.Zm()));
        }
        boolean z4 = (m890(this).booleanValue());

        if (z4) {
            String str2 = "夸父";
            arrayList.add(new rP(str2, str2, str));
        }
        boolean z5 = C0020.m1370(C0044.m2073(C0203xU.s()));

        if (!(z5)) {
            boolean z6 = (m895(this).booleanValue());
            if (z6) {
                String str3 = "优汐";
                arrayList.add(new rP(str3, str3, str));
            }
        }
        boolean z7 = C0020.m1370(C0055.m2328(V.v()));

        if (z7) {
            boolean z8 = C0020.m1370((C0057.m2362(V.v()).t0()));
        }
        boolean z9 = (m899(this).booleanValue());

        if (z9) {
            String str4 = "阿狸";
            arrayList.add(new rP(str4, str4, str));
        }
        boolean z10 = C0020.m1370((C0015.m439(RQ.xa()).N()));

        if (z10) {
            boolean z11 = C0020.m1370(C0055.m2314(RQ.xa()));
        }
        boolean z12 = (m897(this).booleanValue());

        if (z12) {
            String str5 = "嘟嘟";
            arrayList.add(new rP(str5, str5, str));
        }
        return C0038.m1906(arrayList, arrayList2);
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        super.init(context, str);
        int i = (-604) ^ C0013.f13;

        return;
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = C0020.m1370(C0008.m236(Z.Zm()));
        String str2 = "夸父";

        if (z2) {
            boolean z3 = C0020.m1370(C0036.m1837(Z.Zm()));
        }
        boolean z4 = (m890(this).booleanValue());

        if (z4) {
            arrayList.add(str2);
        }
        boolean z5 = C0020.m1370(C0044.m2073(C0203xU.s()));
        String str3 = "优汐";

        if (!(z5)) {
            boolean z6 = (m895(this).booleanValue());
            if (z6) {
                arrayList.add(str3);
            }
        }
        boolean z7 = C0020.m1370((C0057.m2362(V.v()).t0()));
        String str4 = "阿狸";

        if (z7) {
            boolean z8 = C0020.m1370(C0055.m2328(V.v()));
        }
        boolean z9 = (m899(this).booleanValue());

        if (z9) {
            arrayList.add(str4);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = (arrayList.iterator());
        while (true) {
            boolean z10 = (it.hasNext());

            if (z10) {
                String str5 = (String) (it.next());
                boolean z11 = (str5.equals(str2));
                if (z11) {
                    m901(this, "isSearch", str5, "", "1", str, null, arrayList2);
                }
                boolean z12 = (str5.equals(str3));
                if (z12) {
                    m893(this, "isSearch", str5, "", "1", str, null, arrayList2);
                }
                boolean z13 = (str5.equals(str4));
                if (z13) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add((C0057.m2362(V.v()).M()));
                    arrayList3.add((C0057.m2362(V.v()).tF()));
                    m896(this, "isSearch", str5, "", C0033.m1767(arrayList3), "", str, null, arrayList2, true);
                }
                boolean z14 = (str5.equals("嘟嘟"));
                if (z14) {
                    m904(this, "isSearch", str5, "", "0", str, null, arrayList2);
                }
            } else {
                iX iXVar = new iX();
                iXVar.b(arrayList2);
                iXVar.dT(1,1,0,1);
                return (iXVar.toString());
            }
        }
    }
}
