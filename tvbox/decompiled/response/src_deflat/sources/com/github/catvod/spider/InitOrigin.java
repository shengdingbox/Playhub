package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0013;
import com.github.catvod.spider.merge.C0038;
import com.github.catvod.spider.merge.G;
import com.github.catvod.spider.merge.g1;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class InitOrigin {
    public static Class<?> i;

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
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField("mActivities");
        declaredField.setAccessible(true);
        for (Object obj : ((Map) declaredField.get(invoke)).values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField("paused");
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField("activity");
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
        return context.getSharedPreferences("ff_sp", 0).getString(str, str2);
    }

    public static void init(Context context) {
        m789("自定义爬虫代码加载成功！");
        InitOrigin.get().N = (Application) context;
        Rc.yq;
        C0057.m2371(RunnableC0067Ly.yq);
        C0005.m157();
        int i2 = C0080aF.B;

        (new Thread(jA.SN).start());
        C0053.m2288(context);
        Boolean bool = HE.yq();

        if (!(bool != null)) {
            C0013.m406();
        }
        try {
            (new Thread(new G(C0048.m2142(0), C0048.m2142(1))).start());

            return;
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
        SharedPreferences.Editor edit = context.getSharedPreferences("ff_sp", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void show(String str) {
        InitOrigin.get();
        boolean z = InitOrigin.zH;

        if (!(z)) {
            m790(InitOrigin.get()).post(new g1(str, 4));
        }
        InitOrigin.get();
        boolean z2 = InitOrigin.zH;

        if (!z2) {
            return;
        } else {
            InitOrigin.get();
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
            InitOrigin.get();
            C0057.m2371(m792());
            return;
        }
    }

    public static void stopShowingToast() {
        get().SN.removeCallbacks(tF);
    }

    /* renamed from: جتﻝﺥ  reason: contains not printable characters */
    public static void m788(Object obj) {
        if (293 ^ C0009.f9 <= 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: خعشك  reason: contains not printable characters */
    public static void m789(Object obj) {
        if (813 ^ C0033.f91 <= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ﺎﺡﺏﺵ  reason: contains not printable characters */
    public static Handler m790(Object obj) {
        if ((-422) ^ C0033.f91 > 0) {
            return ((InitOrigin) obj).SN;
        }
        return null;
    }

    /* renamed from: ﻱضﻕق  reason: contains not printable characters */
    public static Runnable m792() {
        if (215 ^ C0038.f96 <= 0) {
            return tF;
        }
        return null;
    }
}
