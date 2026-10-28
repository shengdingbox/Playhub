package com.github.catvod.spider;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0011;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0026;
import com.github.catvod.spider.merge.C0032;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0037;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0039;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.C0203xU;
import com.github.catvod.spider.merge.H7;
import com.github.catvod.spider.merge.Nh;
import com.github.catvod.spider.merge.RQ;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.T1;
import com.github.catvod.spider.merge.V;
import com.github.catvod.spider.merge.cn;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* renamed from: com.github.catvod.spider.ﻙفﺙﺭ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0056 {

    /* renamed from: ﺭغضح  reason: contains not printable characters */
    public static int f114 = -447;

    /* renamed from: ايطﻡ  reason: contains not printable characters */
    public static JSONObject m2332(Object obj, Object obj2, Object obj3) {
        if (C0038.m1893() <= 0) {
            return ((V) obj).g((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: بكهت  reason: contains not printable characters */
    public static int m2333(Object obj, int i) {
        if (C0054.m2295() < 0) {
            return Integer.parseInt((String) obj, i);
        }
        return 0;
    }

    /* renamed from: بﺩﺏﻩ  reason: contains not printable characters */
    public static HashMap m2334(Object obj) {
        if (C0003.m81() >= 0) {
            return ((V) obj).Nl();
        }
        return null;
    }

    /* renamed from: تﺥشﻩ  reason: contains not printable characters */
    public static boolean m2335(Object obj) {
        if (C0040.m1954() < 0) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* renamed from: حﺕﺹق  reason: contains not printable characters */
    public static TimeUnit m2336() {
        if (C0042.m1998() <= 0) {
            return TimeUnit.NANOSECONDS;
        }
        return null;
    }

    /* renamed from: رظﺙك  reason: contains not printable characters */
    public static String m2337() {
        if (C0049.m2194() < 0) {
            return "Choose an app";
        }
        return null;
    }

    /* renamed from: رعطش  reason: contains not printable characters */
    public static String m2338() {
        if (C0023.m1475() > 0) {
            return "webdavMode";
        }
        return null;
    }

    /* renamed from: سﻍﺹﻉ  reason: contains not printable characters */
    public static int m2340(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: صﻙضﻉ  reason: contains not printable characters */
    public static int m2341() {
        return (-487) ^ C0053.f111;
    }

    /* renamed from: ضﺏﺝق  reason: contains not printable characters */
    public static int m2342(Object obj) {
        if (C0055.m2324() > 0) {
            return ((JSONObject) obj).length();
        }
        return 0;
    }

    /* renamed from: ظﺎهك  reason: contains not printable characters */
    public static boolean m2343(Object obj, Object obj2) {
        if (C0038.m1893() <= 0) {
            return ((String) obj).equalsIgnoreCase((String) obj2);
        }
        return false;
    }

    /* renamed from: ظﺏخد  reason: contains not printable characters */
    public static void m2344(Object obj) {
        if (C0008.m250() > 0) {
            ((C0203xU) obj).x();
        }
    }

    /* renamed from: لواـ  reason: contains not printable characters */
    public static String m2345(Object obj) {
        if (C0032.m1750() < 0) {
            return ((H7) obj).q();
        }
        return null;
    }

    /* renamed from: مﺵﺹﻝ  reason: contains not printable characters */
    public static void m2346(Object obj, Object obj2) {
        if (C0004.m129() <= 0) {
            ((Dialog) obj).setOnDismissListener((DialogInterface.OnDismissListener) obj2);
        }
    }

    /* renamed from: ﺏبﺭﺱ  reason: contains not printable characters */
    public static boolean m2347(Object obj) {
        if (C0051.m2229() <= 0) {
            return ((H7) obj).OW();
        }
        return false;
    }

    /* renamed from: ﺙﺭﺯم  reason: contains not printable characters */
    public static String m2348() {
        if (C0026.m1561() < 0) {
            return File.separator;
        }
        return null;
    }

    /* renamed from: ﺝثظﺕ  reason: contains not printable characters */
    public static HashMap m2349(Object obj) {
        if (C0048.m2140() < 0) {
            return ((RQ) obj).g1();
        }
        return null;
    }

    /* renamed from: ﺥومﺙ  reason: contains not printable characters */
    public static void m2350(Object obj, Object obj2) {
        if (C0023.m1475() >= 0) {
            ((C0203xU) obj).OW((JSONObject) obj2);
        }
    }

    /* renamed from: ﺫوﻝـ  reason: contains not printable characters */
    public static void m2351(boolean z) {
        if (C0037.m1870() > 0) {
            cn.F5(z);
        }
    }

    /* renamed from: ﺫﺯحك  reason: contains not printable characters */
    public static String m2352(Object obj) {
        if (C0033.m1755() < 0) {
            return ((Nh) obj).v3();
        }
        return null;
    }

    /* renamed from: ﺱﺝدﻁ  reason: contains not printable characters */
    public static boolean m2353(Object obj) {
        if (C0042.m1998() < 0) {
            return ((C0203xU) obj).Dr();
        }
        return false;
    }

    /* renamed from: ﺵﺭﺙش  reason: contains not printable characters */
    public static int[] m2354(Object obj) {
        if (C0011.m344() >= 0) {
            return Rc.Gc((int[]) obj);
        }
        return null;
    }

    /* renamed from: ﻉﻝنو  reason: contains not printable characters */
    public static String m2355(String str) {
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

    /* renamed from: ﻍتغﺱ  reason: contains not printable characters */
    public static String m2356() {
        if (C0051.m2229() < 0) {
            return "sub";
        }
        return null;
    }

    /* renamed from: ﻍمﺝﺫ  reason: contains not printable characters */
    public static void m2357(Object obj, Object obj2) {
        if (C0039.m1918() < 0) {
            ((ImageView) obj).setImageBitmap((Bitmap) obj2);
        }
    }

    /* renamed from: ﻕﺙحز  reason: contains not printable characters */
    public static HashMap m2358(Object obj) {
        if (C0006.m193() >= 0) {
            return Rc.i((String) obj);
        }
        return null;
    }

    /* renamed from: ﻙﺫتك  reason: contains not printable characters */
    public static String m2359() {
        if (C0047.m2134() < 0) {
            return "{ //电影\n    \"1\": [{\n            \"key\": \"type\",\n            \"name\": \"类型\",\n            \"value\": [{\n                    \"n\": \"类型\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"剧情\",\n                    \"v\": \"7\"\n                }, {\n                    \"n\": \"喜剧\",\n                    \"v\": \"8\"\n                }, {\n                    \"n\": \"灾难\",\n                    \"v\": \"17\"\n                },{\n                    \"n\": \"惊悚\",\n                    \"v\": \"4\"\n                }, {\n                    \"n\": \"动作\",\n                    \"v\": \"1\"\n                }, {\n                    \"n\": \"爱情\",\n                    \"v\": \"10\"\n                }, {\n                    \"n\": \"犯罪\",\n                    \"v\": \"12\"\n                }, {\n                    \"n\": \"恐怖\",\n                    \"v\": \"3\"\n                }, {\n                    \"n\": \"悬疑\",\n                    \"v\": \"13\"\n                }, {\n                    \"n\": \"冒险\",\n                    \"v\": \"6\"\n                },{\n                    \"n\": \"科幻\",\n                    \"v\": \"2\"\n                },{\n                    \"n\": \"奇幻\",\n                    \"v\": \"5\"\n                },{\n                    \"n\": \"纪录片\",\n                    \"v\": \"43\"\n                },{\n                    \"n\": \"传记\",\n                    \"v\": \"14\"\n                },{\n                    \"n\": \"家庭\",\n                    \"v\": \"9\"\n                },{\n                    \"n\": \"战争\",\n                    \"v\": \"16\"\n                },{\n                    \"n\": \"历史\",\n                    \"v\": \"15\"\n                },{\n                    \"n\": \"音乐\",\n                    \"v\": \"19\"\n                },{\n                    \"n\": \"同性\",\n                    \"v\": \"11\"\n                },{\n                    \"n\": \"运动\",\n                    \"v\": \"23\"\n                },{\n                    \"n\": \"歌舞\",\n                    \"v\": \"28\"\n                },{\n                    \"n\": \"西部\",\n                    \"v\": \"24\"\n                },{\n                    \"n\": \"古装\",\n                    \"v\": \"22\"\n                },{\n                    \"n\": \"短片\",\n                    \"v\": \"35\"\n                },{\n                    \"n\": \"黑色电影\",\n                    \"v\": \"52\"\n                }\n\t\t\t\t\n            ]\n        },{\n            \"key\": \"area\",\n            \"name\": \"地区\",\n            \"value\": [{\n                    \"n\": \"地区\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"大陆台湾\",\n                    \"v\": \"64347\"\n                }, {\n                    \"n\": \"香港\",\n                    \"v\": \"3194\"\n                }, {\n                    \"n\": \"德国\",\n                    \"v\": \"2722\"\n                }, {\n                    \"n\": \"日本\",\n                    \"v\": \"11358\"\n                }, {\n                    \"n\": \"韩国\",\n                    \"v\": \"11871\"\n                }, {\n                    \"n\": \"美国英国\",\n                    \"v\": \"9937\"\n                },{\n                    \"n\": \"俄国\",\n                    \"v\": \"8938\"\n                }, {\n                    \"n\": \"西班牙\",\n                    \"v\": \"3222\"\n                }, {\n                    \"n\": \"法国\",\n                    \"v\": \"838\"\n                }, {\n                    \"n\": \"意大利\",\n                    \"v\": \"41930\"\n                }\n            ]\n        }, {\n            \"key\": \"year\",\n            \"name\": \"年份\",\n            \"value\": [{\n                    \"n\": \"年份\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"2026\",\n                    \"v\": \"65072\"\n                },{\n                    \"n\": \"2025\",\n                    \"v\": \"64935\"\n                },  {\n                    \"n\": \"2024\",\n                    \"v\": \"64427\"\n                }, {\n                    \"n\": \"2023\",\n                    \"v\": \"64344\"\n                }, {\n                    \"n\": \"2022\",\n                    \"v\": \"63723\"\n                }, {\n                    \"n\": \"2021\",\n                    \"v\": \"47104\"\n                }, {\n                    \"n\": \"2020\",\n                    \"v\": \"2708\"\n                }, {\n                    \"n\": \"2019\",\n                    \"v\": \"247\"\n                }, {\n                    \"n\": \"2018\",\n                    \"v\": \"232\"\n                }, {\n                    \"n\": \"2017\",\n                    \"v\": \"113\"\n                }, {\n                    \"n\": \"2016\",\n                    \"v\": \"387\"\n                }, {\n                    \"n\": \"2015\",\n                    \"v\": \"120\"\n                }, {\n                    \"n\": \"2014\",\n                    \"v\": \"87\"\n                }, {\n                    \"n\": \"2013\",\n                    \"v\": \"29\"\n                }, {\n                    \"n\": \"2012\",\n                    \"v\": \"61\"\n                }, {\n                    \"n\": \"2011\",\n                    \"v\": \"24\"\n                }, {\n                    \"n\": \"2010\",\n                    \"v\": \"62\"\n                }\n            ]\n        }, {\n            \"key\": \"by\",\n            \"name\": \"排序\",\n            \"value\": [{\n                    \"n\": \"排序\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"最新\",\n                    \"v\": \"update\"\n                }, {\n                    \"n\": \"人气\",\n                    \"v\": \"view\"\n                }, {\n                    \"n\": \"评分\",\n                    \"v\": \"score\"\n                }\n            ]\n        }\n    ],\n\t//剧集\n    \"3\": [{\n            \"key\": \"type\",\n            \"name\": \"类型\",\n            \"value\": [{\n                    \"n\": \"类型\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"剧情\",\n                    \"v\": \"33\"\n                }, {\n                    \"n\": \"喜剧\",\n                    \"v\": \"39\"\n                }, {\n                    \"n\": \"武侠\",\n                    \"v\": \"99\"\n                },{\n                    \"n\": \"惊悚\",\n                    \"v\": \"37\"\n                }, {\n                    \"n\": \"动作\",\n                    \"v\": \"36\"\n                }, {\n                    \"n\": \"爱情\",\n                    \"v\": \"58\"\n                }, {\n                    \"n\": \"犯罪\",\n                    \"v\": \"34\"\n                }, {\n                    \"n\": \"恐怖\",\n                    \"v\": \"56\"\n                }, {\n                    \"n\": \"悬疑\",\n                    \"v\": \"38\"\n                }, {\n                    \"n\": \"冒险\",\n                    \"v\": \"42\"\n                },{\n                    \"n\": \"科幻\",\n                    \"v\": \"55\"\n                },{\n                    \"n\": \"奇幻\",\n                    \"v\": \"41\"\n                },{\n                    \"n\": \"纪录片\",\n                    \"v\": \"63\"\n                },{\n                    \"n\": \"传记\",\n                    \"v\": \"40\"\n                },{\n                    \"n\": \"家庭\",\n                    \"v\": \"57\"\n                },{\n                    \"n\": \"战争\",\n                    \"v\": \"61\"\n                },{\n                    \"n\": \"历史\",\n                    \"v\": \"60\"\n                },{\n                    \"n\": \"音乐\",\n                    \"v\": \"65\"\n                },{\n                    \"n\": \"同性\",\n                    \"v\": \"75\"\n                },{\n                    \"n\": \"运动\",\n                    \"v\": \"87\"\n                },{\n                    \"n\": \"歌舞\",\n                    \"v\": \"79\"\n                },{\n                    \"n\": \"西部\",\n                    \"v\": \"76\"\n                },{\n                    \"n\": \"古装\",\n                    \"v\": \"88\"\n                },{\n                    \"n\": \"短片\",\n                    \"v\": \"64\"\n                },{\n                    \"n\": \"真人秀\",\n                    \"v\": \"66\"\n                }\n\t\t\t\t\n            ]\n        },{\n            \"key\": \"area\",\n            \"name\": \"地区\",\n            \"value\": [{\n                    \"n\": \"地区\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"大陆台湾\",\n                    \"v\": \"64362\"\n                }, {\n                    \"n\": \"香港\",\n                    \"v\": \"13567\"\n                }, {\n                    \"n\": \"德国\",\n                    \"v\": \"18156\"\n                }, {\n                    \"n\": \"日本\",\n                    \"v\": \"26544\"\n                }, {\n                    \"n\": \"韩国\",\n                    \"v\": \"22290\"\n                }, {\n                    \"n\": \"美国英国\",\n                    \"v\": \"8783\"\n                },{\n                    \"n\": \"泰国\",\n                    \"v\": \"45186\"\n                }, {\n                    \"n\": \"西班牙\",\n                    \"v\": \"4962\"\n                }, {\n                    \"n\": \"法国\",\n                    \"v\": \"25453\"\n                }, {\n                    \"n\": \"意大利\",\n                    \"v\": \"64464\"\n                }\n            ]\n        }, {\n            \"key\": \"year\",\n            \"name\": \"年份\",\n            \"value\": [{\n                    \"n\": \"年份\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"2026\",\n                    \"v\": \"65072\"\n                },{\n                    \"n\": \"2025\",\n                    \"v\": \"64938\"\n                },  {\n                    \"n\": \"2024\",\n                    \"v\": \"64343\"\n                }, {\n                    \"n\": \"2023\",\n                    \"v\": \"64419\"\n                }, {\n                    \"n\": \"2022\",\n                    \"v\": \"64257\"\n                }, {\n                    \"n\": \"2021\",\n                    \"v\": \"86828\"\n                }, {\n                    \"n\": \"2020\",\n                    \"v\": \"7176\"\n                }, {\n                    \"n\": \"2019\",\n                    \"v\": \"3289\"\n                }, {\n                    \"n\": \"2018\",\n                    \"v\": \"3059\"\n                }, {\n                    \"n\": \"2017\",\n                    \"v\": \"3364\"\n                }, {\n                    \"n\": \"2016\",\n                    \"v\": \"2891\"\n                }, {\n                    \"n\": \"2015\",\n                    \"v\": \"1676\"\n                }, {\n                    \"n\": \"2014\",\n                    \"v\": \"1673\"\n                }, {\n                    \"n\": \"2013\",\n                    \"v\": \"1670\"\n                }, {\n                    \"n\": \"2012\",\n                    \"v\": \"1687\"\n                }, {\n                    \"n\": \"2011\",\n                    \"v\": \"3182\"\n                }, {\n                    \"n\": \"2010\",\n                    \"v\": \"3185\"\n                }\n            ]\n        }, {\n            \"key\": \"by\",\n            \"name\": \"排序\",\n            \"value\": [{\n                    \"n\": \"排序\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"最新\",\n                    \"v\": \"update\"\n                }, {\n                    \"n\": \"人气\",\n                    \"v\": \"view\"\n                }, {\n                    \"n\": \"评分\",\n                    \"v\": \"score\"\n                }\n            ]\n        }\n    ],\n    \"2\": [{\n            \"key\": \"type\",\n            \"name\": \"类型\",\n            \"value\": [{\n                    \"n\": \"类型\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"动画\",\n                    \"v\": \"25\"\n                },{\n                    \"n\": \"剧情\",\n                    \"v\": \"30\"\n                }, {\n                    \"n\": \"喜剧\",\n                    \"v\": \"29\"\n                }, {\n                    \"n\": \"惊悚\",\n                    \"v\": \"59\"\n                }, {\n                    \"n\": \"动作\",\n                    \"v\": \"50\"\n                }, {\n                    \"n\": \"爱情\",\n                    \"v\": \"48\"\n                }, {\n                    \"n\": \"犯罪\",\n                    \"v\": \"69\"\n                }, {\n                    \"n\": \"恐怖\",\n                    \"v\": \"67\"\n                }, {\n                    \"n\": \"悬疑\",\n                    \"v\": \"54\"\n                }, {\n                    \"n\": \"冒险\",\n                    \"v\": \"27\"\n                },{\n                    \"n\": \"科幻\",\n                    \"v\": \"53\"\n                },{\n                    \"n\": \"奇幻\",\n                    \"v\": \"26\"\n                },{\n                    \"n\": \"儿童\",\n                    \"v\": \"32\"\n                },{\n                    \"n\": \"传记\",\n                    \"v\": \"80\"\n                },{\n                    \"n\": \"家庭\",\n                    \"v\": \"31\"\n                },{\n                    \"n\": \"战争\",\n                    \"v\": \"70\"\n                },{\n                    \"n\": \"历史\",\n                    \"v\": \"68\"\n                },{\n                    \"n\": \"音乐\",\n                    \"v\": \"47\"\n                },{\n                    \"n\": \"同性\",\n                    \"v\": \"90\"\n                },{\n                    \"n\": \"运动\",\n                    \"v\": \"62\"\n                },{\n                    \"n\": \"歌舞\",\n                    \"v\": \"49\"\n                },{\n                    \"n\": \"古装\",\n                    \"v\": \"94\"\n                },{\n                    \"n\": \"短片\",\n                    \"v\": \"51\"\n                }\t\t\t\t\n            ]\n        },{\n            \"key\": \"area\",\n            \"name\": \"地区\",\n            \"value\": [{\n                    \"n\": \"全部\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"大陆台湾\",\n                    \"v\": \"64433\"\n                }, {\n                    \"n\": \"香港\",\n                    \"v\": \"26475\"\n                }, {\n                    \"n\": \"法国\",\n                    \"v\": \"22281\"\n                }, {\n                    \"n\": \"日本\",\n                    \"v\": \"24476\"\n                }, {\n                    \"n\": \"葡萄牙\",\n                    \"v\": \"64474\"\n                }, {\n                    \"n\": \"美国英国\",\n                    \"v\": \"64425\"\n                }, {\n                    \"n\": \"德国\",\n                    \"v\": \"50478\"\n                }, {\n                    \"n\": \"西班牙\",\n                    \"v\": \"64470\"\n                }, {\n                    \"n\": \"意大利\",\n                    \"v\": \"64473\"\n                }\n            ]\n        }, {\n            \"key\": \"year\",\n            \"name\": \"年份\",\n            \"value\": [{\n                    \"n\": \"年份\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"2026\",\n                    \"v\": \"65072\"\n                },{\n                    \"n\": \"2025\",\n                    \"v\": \"64919\"\n                },  {\n                    \"n\": \"2024\",\n                    \"v\": \"64424\"\n                }, {\n                    \"n\": \"2023\",\n                    \"v\": \"64422\"\n                }, {\n                    \"n\": \"2022\",\n                    \"v\": \"64471\"\n                }, {\n                    \"n\": \"2021\",\n                    \"v\": \"48778\"\n                }, {\n                    \"n\": \"2020\",\n                    \"v\": \"12981\"\n                }, {\n                    \"n\": \"2019\",\n                    \"v\": \"2683\"\n                }, {\n                    \"n\": \"2018\",\n                    \"v\": \"3071\"\n                }, {\n                    \"n\": \"2017\",\n                    \"v\": \"4812\"\n                }, {\n                    \"n\": \"2016\",\n                    \"v\": \"2632\"\n                }, {\n                    \"n\": \"2015\",\n                    \"v\": \"740\"\n                }, {\n                    \"n\": \"2014\",\n                    \"v\": \"1482\"\n                }, {\n                    \"n\": \"2013\",\n                    \"v\": \"2620\"\n                }, {\n                    \"n\": \"2012\",\n                    \"v\": \"2662\"\n                }, {\n                    \"n\": \"2011\",\n                    \"v\": \"2676\"\n                }, {\n                    \"n\": \"2010\",\n                    \"v\": \"5603\"\n                }\n            ]\n        }, {\n            \"key\": \"by\",\n            \"name\": \"排序\",\n            \"value\": [{\n                    \"n\": \"排序\",\n                    \"v\": \"\"\n                }, {\n                    \"n\": \"最新\",\n                    \"v\": \"update\"\n                }, {\n                    \"n\": \"人气\",\n                    \"v\": \"view\"\n                }, {\n                    \"n\": \"评分\",\n                    \"v\": \"score\"\n                }\n            ]\n        }\n    ]\n}\n";
        }
        return null;
    }

    /* renamed from: ﻱدضم  reason: contains not printable characters */
    public static boolean m2360(Object obj) {
        if (C0041.m1981() < 0) {
            return ((T1) obj).zH();
        }
        return false;
    }

    /* renamed from: زبطﻍ  reason: contains not printable characters */
    public static String m2339(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
