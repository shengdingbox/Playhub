package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.spider.merge.C0020;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0029;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Oh;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Sq;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.WN;
import com.github.catvod.spider.merge.aq;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.p9;
import com.github.catvod.spider.merge.rP;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class WebDAV extends Spider {
    private static String N;
    private static List<String> SN;

    private static long tF;
    private static List<WN> yq;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    class Job implements Callable<List<ME>> {

        /* renamed from: short  reason: not valid java name */
        
        final WebDAV N;
        private final String SN;
        private final WN yq;

        public Job(WebDAV webDAV, WN wn, String str) {
            this.N = webDAV;
            this.yq = wn;
            this.SN = str;
        }

        private boolean yq() {
            String str = "data";
            try {
                String q = aq.q(this.yq.i() + "-https://github.com/alist-org/alist");
                String M = this.yq.M();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("username", M);
                jSONObject.put("password", q);
                jSONObject.put("otp_code", "");
                this.yq.G4(new JSONObject(C0068Pe.dT(this.yq.tF() + "/api/auth/login/hash", jSONObject.toString(), Rc.yq()).body().string()).getJSONObject(str).getString("token"));
                HashMap<String, String> yq = Rc.yq();
                yq.put("Authorization", this.yq.KJ());
                this.yq.G(new JSONObject(C0068Pe.W(this.yq.tF() + "/api/me", yq)).getJSONObject(str).getString("base_path"));
                return true;
            } catch (Exception e) {
                SpiderDebug.log(e);
                return false;
            }
        }

        @Override // java.util.concurrent.Callable
        public List<ME> call() {
            ArrayList arrayList = new ArrayList();
            try {
                if (!Rc.ee(this.yq.KJ()) || yq()) {
                    JSONArray jSONArray = new JSONObject(WebDAV.yq(this.N, this.yq, this.SN)).getJSONObject("data").getJSONArray("content");
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        boolean z = jSONObject.getBoolean("is_dir");
                        String string = jSONObject.getString("name");
                        String string2 = jSONObject.getString("parent");
                        String str = "/";
                        if (z) {
                            arrayList.add(new ME(URLEncoder.encode(this.yq.zH() + string2.replaceFirst(this.yq.N(), "") + str + string), string, "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://oss4liview.moji.com/thd_file/2025/07/28/edd1dfb11afd77b00310574109f1d35b.jpg", this.yq.zH(), z));
                        } else if (Rc.g9(string)) {
                            arrayList2.add(new ME(URLEncoder.encode(this.yq.zH() + string2.replaceFirst(this.yq.N(), "") + str), string, "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://oss4liview.moji.com/thd_file/2025/07/28/a6bdb22cc4b0bfc7b333fec5d027b951.jpg", this.yq.zH(), z));
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            return arrayList;
        }
    }

    private static WN N(String str) {
        List<WN> list = yq;
        return list.get(list.indexOf(new WN(str)));
    }

    private String SN(WN wn, DavResource davResource, List<DavResource> list) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator<DavResource> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = "~~~";
            str2 = "@@@";
            if (!hasNext) {
                break;
            }
            DavResource next = it.next();
            if (Rc.g1(next.getName()).equals(Rc.g1(davResource.getName()))) {
                sb.append(str);
                sb.append(next.getName());
                sb.append(str2);
                sb.append(Rc.dT(next.getName()));
                sb.append(str2);
                sb.append(wn.zH() + next.getPath());
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        for (DavResource davResource2 : list) {
            sb2.append(str);
            sb2.append(davResource2.getName());
            sb2.append(str2);
            sb2.append(Rc.dT(davResource2.getName()));
            sb2.append(str2);
            sb2.append(wn.zH() + davResource2.getPath());
        }
        return sb2.toString();
    }

    private List<gU> i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String str2 = "@@@";
            if (str.contains(str2)) {
                String[] split = str.split(str2);
                String str3 = split[0];
                String str4 = split[1];
                String zH = zH(split[2]);
                gU gUVar = new gU();
                gUVar.N(str3);
                gU SN2 = gUVar.SN(str4);
                SN2.zH(zH);
                arrayList.add(SN2);
            }
        }
        return arrayList;
    }

    private List<DavResource> tF(WN wn, String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(wn.tF());
        if (!str.startsWith(wn.t0())) {
            str = wn.t0() + str;
        }
        sb.append(str);
        List<DavResource> list2 = wn.q().list(sb.toString());
        list2.remove(0);
        Iterator<DavResource> it = list2.iterator();
        while (it.hasNext()) {
            DavResource next = it.next();
            if ((!next.isDirectory() && !next.getName().contains(".")) || (!next.isDirectory() && !list.contains(Rc.dT(next.getName())))) {
                it.remove();
            }
        }
        return list2;
    }

    public static Object[] vod(Map<String, String> map, String str, Map<String, String> map2) {
        String str2;
        String str3;
        String str4 = "/";
        boolean z = (str.contains(str4));
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
                    str2 = (str.substring(0,(str.indexOf(str4))));
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
                    str2 = str;
                    break;
            }
            i = 1678;
        }
        WN wn = m995(str2);
        StringBuilder sb = new StringBuilder();
        (sb.append((wn.tF())));
        (sb.append((str.substring((str2.length())))));
        String str5 = (sb.toString());
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List list = (Arrays.asList(new String[]{"referer", "icy-metadata", "range", "accept-encoding", "user-agent"}));
        Iterator it = ((map2.keySet()).iterator());
        while (true) {
            boolean z2 = (it.hasNext());
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = z2 ? 48736 : 48705;
                    case 47384:
                        (treeMap.put("connection","close"));
                        boolean z3 = C0020.m1370((wn.M()));
                        int i4 = 49666;
                        while (true) {
                            i4 ^= 49683;
                            switch (i4) {
                                case 17:
                                    if (z3) {
                                        break;
                                    } else {
                                        i4 = 49759;
                                        continue;
                                    }
                                case 50:
                                    break;
                                case 76:
                                    StringBuilder sb2 = C0052.m2253("Basic ");
                                    StringBuilder sb3 = new StringBuilder();
                                    (sb3.append((wn.M())));
                                    (sb3.append(":"));
                                    (sb3.append((wn.i())));
                                    (sb2.append(C0029.m1650(((sb3.toString()).getBytes()), 0)));
                                    str3 = (sb2.toString());
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
                                case 83:
                                    str3 = "";
                                    break;
                            }
                            i4 = 49728;
                        }
                        (treeMap.put("Authorization",str3));
                        long j = 0;
                        Matcher matcher = (C0005.m166("bytes=(\\d+)").matcher(C0050.m2227(treeMap)));
                        HashMap hashMap = new HashMap();
                        boolean z4 = (matcher.find());
                        int i6 = 49914;
                        while (true) {
                            i6 ^= 49931;
                            switch (i6) {
                                case 497:
                                    if (!z4) {
                                        break;
                                    } else {
                                        i6 = 50658;
                                        continue;
                                    }
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    j = (Long.parseLong((matcher.group(1))));
                                    break;
                            }
                            i6 = 50627;
                        }
                        StringBuilder sb4 = new StringBuilder();
                        (sb4.append(j));
                        (sb4.append("-"));
                        (sb4.append(m993() - 1));
                        (sb4.append(str4));
                        (sb4.append(m993()));
                        String str6 = (sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        (sb5.append("bytes "));
                        (sb5.append(str6));
                        (hashMap.put("Content-Range",(sb5.toString())));
                        (hashMap.put("Content-Length",(String.valueOf(m993() - j))));
                        return new Object[]{(Integer.valueOf(206)), "application/oct-stream", m994(m992(m996(str5, treeMap))), hashMap};
                    case 47417:
                        String str7 = (String) (it.next());
                        boolean z5 = (list.contains(str7));
                        int i7 = 48767;
                        while (true) {
                            i7 ^= 48784;
                            switch (i7) {
                                case 14:
                                case 45:
                                    break;
                                case 76:
                                    (treeMap.put(str7,(String) (map2.get(str7))));
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
                                case 239:
                                    i7 = z5 ? 48860 : 48829;
                            }
                        }
                        break;
                    case 47483:
                }
            }
        }
    }

    static String yq(WebDAV webDAV, WN wn, String str) {
        Objects.requireNonNull(webDAV);
        Response response = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parent", "/");
            jSONObject.put("keywords", str);
            jSONObject.put("scope", 0);
            jSONObject.put("page", 1);
            jSONObject.put("per_page", 100);
            jSONObject.put("password", "");
            HashMap<String, String> yq2 = Rc.yq();
            yq2.put("Authorization", wn.KJ());
            response = C0068Pe.dT(wn.tF() + "/api/fs/search", jSONObject.toString(), yq2);
            if (response.code() == 200) {
                return response.body().string();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        if (response == null) {
            return "";
        }
        response.close();
        return "";
    }

    private String zH(String str) {
        return ProxyOrigin.getOwnProxyUrl("webdav") + str;
    }

    /* renamed from: ضﻝﺽﺥ  reason: contains not printable characters */
    public static ResponseBody m992(Object obj) {
        if ((-821) ^ C0025.f83 > 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ﺵﺥﻭك  reason: contains not printable characters */
    public static long m993() {
        if ((-914) ^ C0004.f4 <= 0) {
            return tF;
        }
        return 0L;
    }

    /* renamed from: ﺵﻭيﺩ  reason: contains not printable characters */
    public static InputStream m994(Object obj) {
        if (125 ^ C0037.f95 < 0) {
            return ((ResponseBody) obj).byteStream();
        }
        return null;
    }

    /* renamed from: ﺵﻱغﺽ  reason: contains not printable characters */
    public static WN m995(Object obj) {
        if (916 ^ C0002.f2 >= 0) {
            return N((String) obj);
        }
        return null;
    }

    /* renamed from: ﻱﻝﻅﺡ  reason: contains not printable characters */
    public static Response m996(Object obj, Object obj2) {
        if ((-985) ^ C0000.f0 <= 0) {
            return V3.zH((String) obj, (Map) obj2);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String decode = URLDecoder.decode(str);
        String str3 = "/";
        String substring = decode.contains(str3) ? decode.substring(0, decode.indexOf(str3)) : decode;
        String str4 = "";
        String substring2 = decode.contains(str3) ? decode.substring(decode.indexOf(str3)) : "";
        String str5 = "order";
        String str6 = hashMap.containsKey(str5) ? hashMap.get(str5) : "";
        String str7 = "type";
        if (hashMap.containsKey(str7)) {
            str4 = hashMap.get(str7);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WN N2 = N(substring);
        for (DavResource davResource : tF(N2, substring2, Rc.N)) {
            if (davResource.isDirectory()) {
                arrayList.add(davResource);
            } else {
                arrayList2.add(davResource);
            }
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str6)) {
            Oh.yq(str4, str6, arrayList);
            Oh.yq(str4, str6, arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(N2.dT((DavResource) it.next(), "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://oss4liview.moji.com/thd_file/2025/07/28/edd1dfb11afd77b00310574109f1d35b.jpg"));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            DavResource davResource2 = (DavResource) it2.next();
            arrayList3.add(N2.dT(davResource2, davResource2.getName().contains(".iso") ? "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://s1.imagehub.cc/images/2026/03/01/e3c11ec959e4a91ad9c79a1172b4d327" : "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://oss4liview.moji.com/thd_file/2025/07/28/a6bdb22cc4b0bfc7b333fec5d027b951.jpg"));
        }
        iX iXVar = new iX();
        iXVar.b(arrayList3);
        iXVar.dT(1, 1, 0, 1);
        return iXVar.toString();
    }

    public String detailContent(List<String> list) {
        StringBuilder yq2;
        StringBuilder sb;
        String decode = URLDecoder.decode(list.get(0));
        String str = "/";
        String substring = decode.contains(str) ? decode.substring(0, decode.indexOf(str)) : decode;
        String substring2 = decode.substring(0, decode.lastIndexOf(str));
        String str2 = substring2.contains(str) ? substring2.substring(substring2.indexOf(str)) + str : "";
        String substring3 = substring2.substring(substring2.lastIndexOf(str) + 1);
        WN N2 = N(substring);
        List<DavResource> tF2 = tF(N2, str2, SN);
        ArrayList arrayList = new ArrayList();
        for (DavResource davResource : tF2) {
            if (Rc.xa(davResource.getName())) {
                arrayList.add(davResource);
            }
        }
        Oh.yq("name", "asc", tF2);
        ArrayList arrayList2 = new ArrayList();
        Iterator<DavResource> it = tF2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str3 = "#";
            if (hasNext) {
                DavResource next = it.next();
                String replace = next.getName().replace(str3, "").replace("@", "").replace("&", "").replace("+", "");
                if (Rc.g9(next.getName())) {
                    boolean contains = next.getName().contains(".strm");
                    String str4 = "$";
                    if (contains) {
                        yq2 = Sq.yq(replace, str4);
                        sb = new StringBuilder();
                        sb.append(N2.zH());
                        sb.append(next.getPath());
                    } else {
                        yq2 = Sq.yq(replace, str4);
                        sb = new StringBuilder();
                        sb.append(N2.zH());
                        sb.append(next.getPath());
                        sb.append("@|@");
                        sb.append(next.getContentLength());
                    }
                    yq2.append(URLEncoder.encode(sb.toString()));
                    yq2.append(SN(N2, next, arrayList));
                    arrayList2.add(yq2.toString());
                }
            } else {
                ME me = new ME();
                me.B(substring3);
                me.G(substring3);
                me.dT(substring);
                me.F5(TextUtils.join(str3, arrayList2));
                return iX.v(me);
            }
        }
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (WN wn : yq) {
            arrayList.add(new rP(wn.zH(), wn.zH(), "1"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String yq2 = ((rP) it.next()).yq();
            ArrayList arrayList2 = new ArrayList();
            String str = "預設";
            arrayList2.add(new p9("type", "排序類型", Arrays.asList(new p9.yq(str, ""), new p9.yq("名稱", "name"), new p9.yq("大小", "size"), new p9.yq("修改時間", "date"))));
            arrayList2.add(new p9("order", "排序方式", Arrays.asList(new p9.yq(str, ""), new p9.yq("⬆", "asc"), new p9.yq("⬇", "desc"))));
            linkedHashMap.put(yq2, arrayList2);
        }
        return iX.g9(arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        ArrayList arrayList = new ArrayList(Arrays.asList("ass", "ssa", "srt"));
        SN = arrayList;
        arrayList.addAll(Rc.N);
        N = str;
        List<WN> list = yq;
        if (list == null || list.isEmpty()) {
            if (N.startsWith("http")) {
                N = V3.q(N, null);
            }
            if (N.startsWith("./")) {
                N = V3.q(ProxyOrigin.getFileUrl() + N.replace(".", ""), null);
            }
            yq = WN.yq(N);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        cn.F5(false);
        String[] split = str2.split("~~~");
        String[] split2 = URLDecoder.decode(split[0]).split("@\\|@");
        if (split2.length > 1) {
            tF = Long.parseLong(split2[1]);
        }
        if (split2[0].contains(".strm")) {
            String str3 = split2[0];
            String str4 = "/";
            String substring = str3.contains(str4) ? split2[0].substring(0, split2[0].indexOf(str4)) : split2[0];
            WN N2 = N(substring);
            StringBuilder sb = new StringBuilder();
            Sardine q = N2.q();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(q.get(N2.tF() + split2[0].substring(substring.length()))));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            bufferedReader.close();
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            iX iXVar = new iX();
            iXVar.g1(V3.N(sb.toString(), Rc.yq()));
            iXVar.O(i(split));
            return iXVar.toString();
        }
        iX iXVar2 = new iX();
        iXVar2.g1(zH(URLEncoder.encode(split2[0])));
        iXVar2.O(i(split));
        return iXVar2.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        for (WN wn : yq) {
            if (wn.B().booleanValue()) {
                wn.SN();
                arrayList2.add(new Job(this, wn, str));
            }
        }
        for (Future future : newCachedThreadPool.invokeAll(arrayList2, 6L, TimeUnit.SECONDS)) {
            arrayList.addAll((Collection) future.get());
        }
        return iX.ee(arrayList);
    }
}
