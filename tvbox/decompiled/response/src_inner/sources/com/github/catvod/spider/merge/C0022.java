package com.github.catvod.spider.merge;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.webkit.WebSettings;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.C0041;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.Cloud_quark;
import com.github.catvod.spider.InitOrigin;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.merge.دﻡﺩي  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0022 {

    /* renamed from: هظﻱﻕ  reason: contains not printable characters */
    public static int f80 = -470;

    /* renamed from: اﺱﺙل  reason: contains not printable characters */
    public static void m1419(Object obj, int i) {
        if (C0054.m2295() < 0) {
            ((WebSettings) obj).setMixedContentMode(i);
        }
    }

    /* renamed from: تكخﻉ  reason: contains not printable characters */
    public static byte[] m1420(Object obj, int i) {
        if (C0046.m2112() > 0) {
            return Base64.decode((String) obj, i);
        }
        return null;
    }

    /* renamed from: ثوكﺙ  reason: contains not printable characters */
    public static HashMap m1421(Object obj) {
        if (C0020.m1371() < 0) {
            return ((RQ) obj).un();
        }
        return null;
    }

    /* renamed from: جـسﻝ  reason: contains not printable characters */
    public static String m1422(Object obj) {
        if (C0048.m2140() <= 0) {
            return zr.N((Map) obj);
        }
        return null;
    }

    /* renamed from: سﻁصﺩ  reason: contains not printable characters */
    public static String m1423() {
        if (C0001.m25() <= 0) {
            return "https://broccoli.uc.cn/";
        }
        return null;
    }

    /* renamed from: شغخج  reason: contains not printable characters */
    public static void m1424(Object obj, Object obj2) {
        if (C0039.m1918() < 0) {
            ((Cloud_quark) obj).setFlag((String) obj2);
        }
    }

    /* renamed from: شـﻱﻡ  reason: contains not printable characters */
    public static Matcher m1425(Object obj, Object obj2) {
        if (C0036.m1838() < 0) {
            return ((Pattern) obj).matcher((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: صﻭخن  reason: contains not printable characters */
    public static String m1426() {
        if (m1429() <= 0) {
            return "已启动外置webDav播放器播放";
        }
        return null;
    }

    /* renamed from: ضقﻉﺫ  reason: contains not printable characters */
    public static String m1427(Object obj) {
        if (C0008.m250() >= 0) {
            return ((hN) obj).Fo();
        }
        return null;
    }

    /* renamed from: طﻡﺕﺯ  reason: contains not printable characters */
    public static String m1428() {
        if (C0037.m1870() > 0) {
            return Build.MANUFACTURER;
        }
        return null;
    }

    /* renamed from: ـعدن  reason: contains not printable characters */
    public static int m1429() {
        return 284 ^ C0041.f99;
    }

    /* renamed from: كﺡﺕﺽ  reason: contains not printable characters */
    public static int m1430(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: لفﺙا  reason: contains not printable characters */
    public static hN m1431(Object obj) {
        if (C0021.m1415() > 0) {
            return ((kB) obj).tF();
        }
        return null;
    }

    /* renamed from: وشغﺱ  reason: contains not printable characters */
    public static String m1432(Object obj) {
        if (C0007.m214() <= 0) {
            return ((H7) obj).dT();
        }
        return null;
    }

    /* renamed from: ﺝقﺕﻭ  reason: contains not printable characters */
    public static String m1434(Object obj, Object obj2) {
        if (C0007.m214() <= 0) {
            return oX.yq((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ﺝهﻱﻕ  reason: contains not printable characters */
    public static String m1435(Object obj) {
        if (C0004.m129() <= 0) {
            return iX.ee((List) obj);
        }
        return null;
    }

    /* renamed from: ﺥجضﻕ  reason: contains not printable characters */
    public static OM m1436(Object obj) {
        if (C0005.m152() < 0) {
            return ((OM) obj).Gc();
        }
        return null;
    }

    /* renamed from: ﺭجﺙس  reason: contains not printable characters */
    public static ContentResolver m1437(Object obj) {
        if (C0005.m152() < 0) {
            return ((Context) obj).getContentResolver();
        }
        return null;
    }

    /* renamed from: ﺭﺯضﻭ  reason: contains not printable characters */
    public static String m1438() {
        if (C0041.m1981() < 0) {
            return "bytes=0-0";
        }
        return null;
    }

    /* renamed from: ﺯلعا  reason: contains not printable characters */
    public static String m1439(Object obj) {
        if (C0011.m344() >= 0) {
            return ((gE) obj).SN();
        }
        return null;
    }

    /* renamed from: ﺹطﻭذ  reason: contains not printable characters */
    public static String m1440(Object obj) {
        if (C0041.m1981() <= 0) {
            return ((WN) obj).i();
        }
        return null;
    }

    /* renamed from: ﺹغهﻉ  reason: contains not printable characters */
    public static int m1441(Object obj, Object obj2, int i) {
        if (C0033.m1755() < 0) {
            return ((String) obj).lastIndexOf((String) obj2, i);
        }
        return 0;
    }

    /* renamed from: ﺽسوﺫ  reason: contains not printable characters */
    public static String m1442(Object obj) {
        if (C0013.m382() < 0) {
            return ((H7) obj).v3();
        }
        return null;
    }

    /* renamed from: ﺽيوت  reason: contains not printable characters */
    public static String m1443() {
        if (C0045.m2093() > 0) {
            return "{\"hot_gaia\": [{\"key\": \"sort\", \"name\": \"排序\", \"value\": [{\"n\": \"热度\", \"v\": \"recommend\"}, {\"n\": \"最新\", \"v\": \"time\"}, {\"n\": \"评分\", \"v\": \"rank\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"全部\"}, {\"n\": \"华语\", \"v\": \"华语\"}, {\"n\": \"欧美\", \"v\": \"欧美\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"日本\", \"v\": \"日本\"}]}], \"tv_hot\": [{\"key\": \"type\", \"name\": \"分类\", \"value\": [{\"n\": \"综合\", \"v\": \"tv_hot\"}, {\"n\": \"国产剧\", \"v\": \"tv_domestic\"}, {\"n\": \"欧美剧\", \"v\": \"tv_american\"}, {\"n\": \"日剧\", \"v\": \"tv_japanese\"}, {\"n\": \"韩剧\", \"v\": \"tv_korean\"}, {\"n\": \"动画\", \"v\": \"tv_animation\"}]}], \"show_hot\": [{\"key\": \"type\", \"name\": \"分类\", \"value\": [{\"n\": \"综合\", \"v\": \"show_hot\"}, {\"n\": \"国内\", \"v\": \"show_domestic\"}, {\"n\": \"国外\", \"v\": \"show_foreign\"}]}], \"movie\": [{\"key\": \"类型\", \"name\": \"类型\", \"value\": [{\"n\": \"全部类型\", \"v\": \"\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"爱情\", \"v\": \"爱情\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"动画\", \"v\": \"动画\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"犯罪\", \"v\": \"犯罪\"}, {\"n\": \"惊悚\", \"v\": \"惊悚\"}, {\"n\": \"冒险\", \"v\": \"冒险\"}, {\"n\": \"音乐\", \"v\": \"音乐\"}, {\"n\": \"历史\", \"v\": \"历史\"}, {\"n\": \"奇幻\", \"v\": \"奇幻\"}, {\"n\": \"恐怖\", \"v\": \"恐怖\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"传记\", \"v\": \"传记\"}, {\"n\": \"歌舞\", \"v\": \"歌舞\"}, {\"n\": \"武侠\", \"v\": \"武侠\"}, {\"n\": \"灾难\", \"v\": \"灾难\"}, {\"n\": \"西部\", \"v\": \"西部\"}, {\"n\": \"纪录片\", \"v\": \"纪录片\"}, {\"n\": \"短片\", \"v\": \"短片\"}]}, {\"key\": \"地区\", \"name\": \"地区\", \"value\": [{\"n\": \"全部地区\", \"v\": \"\"}, {\"n\": \"华语\", \"v\": \"华语\"}, {\"n\": \"欧美\", \"v\": \"欧美\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"中国香港\", \"v\": \"中国香港\"}, {\"n\": \"中国台湾\", \"v\": \"中国台湾\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"德国\", \"v\": \"德国\"}, {\"n\": \"意大利\", \"v\": \"意大利\"}, {\"n\": \"西班牙\", \"v\": \"西班牙\"}, {\"n\": \"印度\", \"v\": \"印度\"}, {\"n\": \"泰国\", \"v\": \"泰国\"}, {\"n\": \"俄罗斯\", \"v\": \"俄罗斯\"}, {\"n\": \"加拿大\", \"v\": \"加拿大\"}, {\"n\": \"澳大利亚\", \"v\": \"澳大利亚\"}, {\"n\": \"爱尔兰\", \"v\": \"爱尔兰\"}, {\"n\": \"瑞典\", \"v\": \"瑞典\"}, {\"n\": \"巴西\", \"v\": \"巴西\"}, {\"n\": \"丹麦\", \"v\": \"丹麦\"}]}, {\"key\": \"sort\", \"name\": \"排序\", \"value\": [{\"n\": \"近期热度\", \"v\": \"T\"}, {\"n\": \"首映时间\", \"v\": \"R\"}, {\"n\": \"高分优先\", \"v\": \"S\"}]}, {\"key\": \"年代\", \"name\": \"年代\", \"value\": [{\"n\": \"全部年代\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\": \"2024\", \"v\": \"2024\"},{\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2010年代\", \"v\": \"2010年代\"}, {\"n\": \"2000年代\", \"v\": \"2000年代\"}, {\"n\": \"90年代\", \"v\": \"90年代\"}, {\"n\": \"80年代\", \"v\": \"80年代\"}, {\"n\": \"70年代\", \"v\": \"70年代\"}, {\"n\": \"60年代\", \"v\": \"60年代\"}, {\"n\": \"更早\", \"v\": \"更早\"}]}], \"tv\": [{\"key\": \"类型\", \"name\": \"类型\", \"value\": [{\"n\": \"不限\", \"v\": \"\"}, {\"n\": \"电视剧\", \"v\": \"电视剧\"}, {\"n\": \"综艺\", \"v\": \"综艺\"}]}, {\"key\": \"电视剧形式\", \"name\": \"电视剧形式\", \"value\": [{\"n\": \"不限\", \"v\": \"\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"爱情\", \"v\": \"爱情\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"动画\", \"v\": \"动画\"}, {\"n\": \"武侠\", \"v\": \"武侠\"}, {\"n\": \"古装\", \"v\": \"古装\"}, {\"n\": \"家庭\", \"v\": \"家庭\"}, {\"n\": \"犯罪\", \"v\": \"犯罪\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"恐怖\", \"v\": \"恐怖\"}, {\"n\": \"历史\", \"v\": \"历史\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"冒险\", \"v\": \"冒险\"}, {\"n\": \"传记\", \"v\": \"传记\"}, {\"n\": \"剧情\", \"v\": \"剧情\"}, {\"n\": \"奇幻\", \"v\": \"奇幻\"}, {\"n\": \"惊悚\", \"v\": \"惊悚\"}, {\"n\": \"灾难\", \"v\": \"灾难\"}, {\"n\": \"歌舞\", \"v\": \"歌舞\"}, {\"n\": \"音乐\", \"v\": \"音乐\"}]}, {\"key\": \"综艺形式\", \"name\": \"综艺形式\", \"value\": [{\"n\": \"不限\", \"v\": \"\"}, {\"n\": \"真人秀\", \"v\": \"真人秀\"}, {\"n\": \"脱口秀\", \"v\": \"脱口秀\"}, {\"n\": \"音乐\", \"v\": \"音乐\"}, {\"n\": \"歌舞\", \"v\": \"歌舞\"}]}, {\"key\": \"地区\", \"name\": \"地区\", \"value\": [{\"n\": \"全部地区\", \"v\": \"\"}, {\"n\": \"华语\", \"v\": \"华语\"}, {\"n\": \"欧美\", \"v\": \"欧美\"}, {\"n\": \"国外\", \"v\": \"国外\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"中国香港\", \"v\": \"中国香港\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"泰国\", \"v\": \"泰国\"}, {\"n\": \"中国台湾\", \"v\": \"中国台湾\"}, {\"n\": \"意大利\", \"v\": \"意大利\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"德国\", \"v\": \"德国\"}, {\"n\": \"西班牙\", \"v\": \"西班牙\"}, {\"n\": \"俄罗斯\", \"v\": \"俄罗斯\"}, {\"n\": \"瑞典\", \"v\": \"瑞典\"}, {\"n\": \"巴西\", \"v\": \"巴西\"}, {\"n\": \"丹麦\", \"v\": \"丹麦\"}, {\"n\": \"印度\", \"v\": \"印度\"}, {\"n\": \"加拿大\", \"v\": \"加拿大\"}, {\"n\": \"爱尔兰\", \"v\": \"爱尔兰\"}, {\"n\": \"澳大利亚\", \"v\": \"澳大利亚\"}]}, {\"key\": \"sort\", \"name\": \"排序\", \"value\": [{\"n\": \"近期热度\", \"v\": \"T\"}, {\"n\": \"首播时间\", \"v\": \"R\"}, {\"n\": \"高分优先\", \"v\": \"S\"}]}, {\"key\": \"年代\", \"name\": \"年代\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2026\", \"v\": \"2026\"},{\"n\": \"2025\", \"v\": \"2025\"},{\"n\": \"2024\", \"v\": \"2024\"},{\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2010年代\", \"v\": \"2010年代\"}, {\"n\": \"2000年代\", \"v\": \"2000年代\"}, {\"n\": \"90年代\", \"v\": \"90年代\"}, {\"n\": \"80年代\", \"v\": \"80年代\"}, {\"n\": \"70年代\", \"v\": \"70年代\"}, {\"n\": \"60年代\", \"v\": \"60年代\"}, {\"n\": \"更早\", \"v\": \"更早\"}]}, {\"key\": \"平台\", \"name\": \"平台\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"腾讯视频\", \"v\": \"腾讯视频\"}, {\"n\": \"爱奇艺\", \"v\": \"爱奇艺\"}, {\"n\": \"优酷\", \"v\": \"优酷\"}, {\"n\": \"湖南卫视\", \"v\": \"湖南卫视\"}, {\"n\": \"Netflix\", \"v\": \"Netflix\"}, {\"n\": \"HBO\", \"v\": \"HBO\"}, {\"n\": \"BBC\", \"v\": \"BBC\"}, {\"n\": \"NHK\", \"v\": \"NHK\"}, {\"n\": \"CBS\", \"v\": \"CBS\"}, {\"n\": \"NBC\", \"v\": \"NBC\"}, {\"n\": \"tvN\", \"v\": \"tvN\"}]}], \"rank_list_movie\": [{\"key\": \"榜单\", \"name\": \"榜单\", \"value\": [{\"n\": \"实时热门电影\", \"v\": \"movie_real_time_hotest\"}, {\"n\": \"一周口碑电影榜\", \"v\": \"movie_weekly_best\"}, {\"n\": \"豆瓣电影Top250\", \"v\": \"movie_top250\"}]}], \"rank_list_tv\": [{\"key\": \"榜单\", \"name\": \"榜单\", \"value\": [{\"n\": \"实时热门电视\", \"v\": \"tv_real_time_hotest\"}, {\"n\": \"华语口碑剧集榜\", \"v\": \"tv_chinese_best_weekly\"}, {\"n\": \"全球口碑剧集榜\", \"v\": \"tv_global_best_weekly\"}, {\"n\": \"国内口碑综艺榜\", \"v\": \"show_chinese_best_weekly\"}, {\"n\": \"国外口碑综艺榜\", \"v\": \"show_global_best_weekly\"}]}]}";
        }
        return null;
    }

    /* renamed from: ﻁﺡاﻍ  reason: contains not printable characters */
    public static Activity m1444() {
        if (C0052.m2256() >= 0) {
            return InitOrigin.getActivity();
        }
        return null;
    }

    /* renamed from: ﻅظلﻕ  reason: contains not printable characters */
    public static boolean m1445(Object obj, Object obj2) {
        if (C0003.m81() >= 0) {
            return ((ArrayList) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ﻕﺭصش  reason: contains not printable characters */
    public static String m1446(String str) {
        String str2 = "";
        String str3 = "";
        for (int i = 0; i < 15; i++) {
            str2 = new StringBuffer().append(str2).append(Integer.toHexString(i)).toString();
            str3 = new StringBuffer().append(str3).append(((int) (Math.random() * 10)) ^ i).toString();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((str2.indexOf(str.charAt(i2)) << 4) | str2.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str3.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str3.charAt((-1) % length2));
        }
        for (int i3 = 0; i3 < byteArray.length; i3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ﻝظﺫش  reason: contains not printable characters */
    public static boolean m1447(Object obj) {
        if (C0040.m1954() < 0) {
            return ((tX) obj).OW();
        }
        return false;
    }

    /* renamed from: ﻩطشﺽ  reason: contains not printable characters */
    public static boolean m1448(Object obj, Object obj2) {
        if (C0046.m2112() > 0) {
            return ((String) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ﻭﻁصذ  reason: contains not printable characters */
    public static String m1449(Object obj) {
        if (C0008.m250() >= 0) {
            return ((C0059Dl) obj).v3();
        }
        return null;
    }

    /* renamed from: ﻱﺎـﺙ  reason: contains not printable characters */
    public static String m1450(Object obj, Object obj2) {
        if (C0036.m1838() < 0) {
            return ((JSONObject) obj).getString((String) obj2);
        }
        return null;
    }

    /* renamed from: ﻱﻕزﻡ  reason: contains not printable characters */
    public static Q6 m1451(Object obj) {
        if (C0014.m418() >= 0) {
            return ((Q6) obj).yq();
        }
        return null;
    }

    /* renamed from: وفنب  reason: contains not printable characters */
    public static String m1433(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
