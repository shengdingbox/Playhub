package com.github.catvod.spider;

import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public class DexNative {
    static {
        try {
            Init.deleteFilesWithFeature(Init.context().getCacheDir().getAbsolutePath() + File.separator, ".ftyfnw");
            String str = "ftyguard_" + (Build.CPU_ABI.contains("64") ? "v8" : "v7") + ".so";
            File file = new File(Init.context().getCacheDir(), ".ftyfnw" + Init.generateRandomString(10));
            InputStream resourceAsStream = Init.classLoader().getResourceAsStream("assets/" + str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    resourceAsStream.close();
                    fileOutputStream.close();
                    file.setReadOnly();
                    System.load(file.getAbsolutePath());
                    return;
                }
            }
        } catch (Exception e) {
            e.getCause().getMessage();
        }
    }

    public static native int[] calcResult(int[] iArr);

    public static native String decrypt(String str);

    public static native String encrypt(String str);

    public static native Object getLoader(Object obj);

    public static native Object getSpider(Object obj, String str);

    public static native String native_ting_md5(String str);

    public static native String noxSign(String str, String str2, String str3);

    public static native Object[] proxyInvoke(Object obj, Object obj2);
}
