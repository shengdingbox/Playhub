package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import com.github.catvod.crawler.Spider;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;
import java.util.Random;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public class Init {
    private ClassLoader oOo0oOo0Oo0oO0Oo = getClass().getClassLoader();
    private DexClassLoader oOoOoOo0oOo0o0oO;
    private Application oOoOoOoOoOoOoO0o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
    public class Loader {
        static volatile Init oOoOoOoOoOoOoO0o = new Init();

        private Loader() {
        }
    }

    public static ClassLoader classLoader() {
        return get().oOo0oOo0Oo0oO0Oo;
    }

    public static Application context() {
        return get().oOoOoOoOoOoOoO0o;
    }

    public static int deleteFilesWithFeature(String str, final String str2) {
        File[] listFiles;
        File file = new File(str);
        if (!file.isDirectory() || (listFiles = file.listFiles(new FilenameFilter() { // from class: com.github.catvod.spider.Init.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str3) {
                return str3.contains(str2);
            }
        })) == null) {
            return 0;
        }
        int i = 0;
        for (File file2 : listFiles) {
            if (file2.isFile() && file2.delete()) {
                i++;
            }
        }
        return i;
    }

    public static String generateRandomString(int i) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(cArr[random.nextInt(36)]);
        }
        return sb.toString();
    }

    public static Init get() {
        return Loader.oOoOoOoOoOoOoO0o;
    }

    public static synchronized Spider getSpider(String str) {
        Spider spider;
        synchronized (Init.class) {
            spider = (Spider) DexNative.getSpider(loader(), str);
        }
        return spider;
    }

    public static void init(Context context) {
        get().oOoOoOoOoOoOoO0o = (Application) context;
        get().oOoOoOo0oOo0o0oO = (DexClassLoader) DexNative.getLoader(context);
    }

    public static DexClassLoader loader() {
        return get().oOoOoOo0oOo0o0oO;
    }

    public static Object[] proxyInvoke(Map map) {
        return DexNative.proxyInvoke(loader(), map);
    }
}
