package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0003;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0021;
import com.github.catvod.spider.merge.C0028;
import com.github.catvod.spider.merge.C0030;
import com.github.catvod.spider.merge.C0031;
import com.github.catvod.spider.merge.C0034;
import com.github.catvod.spider.merge.C0036;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.C0040;
import com.github.catvod.spider.merge.G;
import com.github.catvod.spider.merge.g1;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class InitOrigin {
    public static Class<?> i;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f29short = {3177, 3174, 3180, 3194, 3175, 3169, 3180, 3110, 3177, 3192, 3192, 3110, 3145, 3179, 3196, 3169, 3198, 3169, 3196, 3185, 3164, 3168, 3194, 3181, 3177, 3180, 2443, 2461, 2458, 2458, 2445, 2438, 2460, 2473, 2443, 2460, 2433, 2462, 2433, 2460, 2449, 2492, 2432, 2458, 2445, 2441, 2444, 3112, 3076, 3110, 3121, 3116, 3123, 3116, 3121, 3116, 3104, 3126, 2718, 2703, 2715, 2717, 2699, 2698, 2499, 2497, 2518, 2507, 2516, 2507, 2518, 2523, 2144, 2144, 2137, 2165, 2166, -31448, 24408, 19083, 30446, -32087, 18977, 31939, 22114, -29761, 26322, 22109, -1085, 1056, 1056, 1049, 1077, 1078};
    private static Runnable tF;
    public static boolean zH;
    private Application N;
    private final Handler SN = new Handler(Looper.getMainLooper());
    private final ExecutorService yq = Executors.newFixedThreadPool(5);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class Loader {
        static volatile InitOrigin yq = new InitOrigin();

        private Loader() {
        }
    }

    public static Application context() {
        return get().N;
    }

    public static void execute(Runnable runnable) {
        get().yq.execute(runnable);
    }

    public static InitOrigin get() {
        return Loader.yq;
    }

    public static Activity getActivity() {
        Class<?> cls = Class.forName(C0057.m2384(f29short, 0, 26, 3080));
        Object invoke = cls.getMethod(C0021.m1417(f29short, 26, 21, 2536), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(C0030.m1688(f29short, 47, 11, 3141));
        declaredField.setAccessible(true);
        for (Object obj : ((Map) declaredField.get(invoke)).values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(C0038.m1903(f29short, 58, 6, 2798));
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField(C0009.m277(f29short, 64, 8, 2466));
                declaredField3.setAccessible(true);
                Activity activity = (Activity) declaredField3.get(obj);
                SpiderDebug.log(activity.getComponentName().getClassName());
                return activity;
            }
        }
        return null;
    }

    public static String getSpStr(String str, String str2) {
        Application context = context();
        context();
        return context.getSharedPreferences(C0045.m2098(f29short, 72, 5, 2054), 0).getString(str, str2);
    }

    public static void init(Context context) {
        m789(C0006.m180(m791(), 77, 12, 1218));
        C0003.m89().N = (Application) context;
        C0038.m1916();
        C0057.m2371(C0034.m1780());
        C0005.m157();
        int i2 = C0031.m1707();
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (i2 >= 6677) {
                        break;
                    } else {
                        i3 = 1709;
                        continue;
                    }
                case 204:
                    int i4 = 1740;
                    while (true) {
                        i4 ^= 1757;
                        switch (i4) {
                            case 17:
                                if (i2 > 7000) {
                                    break;
                                } else {
                                    i4 = 1833;
                                    continue;
                                }
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                break;
                        }
                        i4 = 1802;
                    }
                    break;
                case 239:
                    break;
            }
            i3 = 1678;
        }
        C0005.m174(new Thread(C0013.m386()));
        C0053.m2288(context);
        Boolean bool = C0052.m2249();
        int i5 = 1864;
        while (true) {
            i5 ^= 1881;
            switch (i5) {
                case 17:
                    if (bool != null) {
                        break;
                    } else {
                        i5 = 48736;
                        continue;
                    }
                case 47384:
                    break;
                case 47417:
                    C0013.m406();
                    break;
                case 47483:
                    break;
            }
            i5 = 48705;
        }
        try {
            C0005.m174(new Thread(new G(C0048.m2142(0), C0048.m2142(1))));
            int i6 = 48767;
            while (true) {
                i6 ^= 48784;
                switch (i6) {
                    case 14:
                        return;
                    case 239:
                        i6 = 48798;
                        break;
                }
            }
        } catch (Exception e) {
            m788(e);
        }
    }

    public static void run(Runnable runnable) {
        get().SN.post(runnable);
    }

    public static void run(Runnable runnable, int i2) {
        get().SN.postDelayed(runnable, i2);
    }

    public static void setClass(Class<?> cls) {
        i = cls;
    }

    public static void setSpStr(String str, String str2) {
        Application context = context();
        context();
        SharedPreferences.Editor edit = context.getSharedPreferences(C0056.m2339(f29short, 89, 5, 1094), 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void show(String str) {
        C0003.m89();
        boolean z = C0021.m1403();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (z) {
                        break;
                    } else {
                        i2 = 1709;
                        continue;
                    }
                case 204:
                    C0009.m286(m790(C0003.m89()), new g1(str, 4));
                    break;
                case 239:
                    break;
            }
            i2 = 1678;
        }
        C0003.m89();
        boolean z2 = C0021.m1403();
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
                    return;
                case 500:
                    C0003.m89();
                    tF = new Runnable(str) { // from class: com.github.catvod.spider.InitOrigin.1
                        final String yq;

                        {
                            this.yq = str;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (InitOrigin.zH) {
                                Toast makeText = Toast.makeText(InitOrigin.context(), this.yq, 1);
                                makeText.setGravity(80, 0, 10);
                                makeText.show();
                                InitOrigin.run(this, 7000);
                            }
                        }
                    };
                    C0003.m89();
                    C0057.m2371(m792());
                    return;
            }
            i3 = 1802;
        }
    }

    public static void stopShowingToast() {
        get().SN.removeCallbacks(tF);
    }

    /* renamed from: جتﻝﺥ  reason: contains not printable characters */
    public static void m788(Object obj) {
        if (C0028.m1612() <= 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: خعشك  reason: contains not printable characters */
    public static void m789(Object obj) {
        if (C0043.m2042() <= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ﺎﺡﺏﺵ  reason: contains not printable characters */
    public static Handler m790(Object obj) {
        if (C0021.m1415() > 0) {
            return ((InitOrigin) obj).SN;
        }
        return null;
    }

    /* renamed from: ﺵﻡﺯد  reason: contains not printable characters */
    public static short[] m791() {
        if (C0040.m1954() <= 0) {
            return f29short;
        }
        return null;
    }

    /* renamed from: ﻱضﻕق  reason: contains not printable characters */
    public static Runnable m792() {
        if (C0036.m1838() <= 0) {
            return tF;
        }
        return null;
    }
}
