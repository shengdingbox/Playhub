package com.github.catvod.spider.merge;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.github.catvod.spider.InitOrigin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.nio.charset.Charset;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class M4 {
    public static void N(File file) {
        Uri uri;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.addFlags(1);
        if (Build.VERSION.SDK_INT < 24) {
            uri = Uri.fromFile(file);
        } else {
            Application context = InitOrigin.context();
            uri = Zj.yq(context, InitOrigin.context().getPackageName() + ".provider", file);
        }
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(file.getName());
        if (TextUtils.isEmpty(guessContentTypeFromName)) {
            guessContentTypeFromName = "*/*";
        }
        intent.setDataAndType(uri, guessContentTypeFromName);
        InitOrigin.context().startActivity(intent);
    }

    public static File SN(String str) {
        return new File(InitOrigin.context().getFilesDir(), str);
    }

    public static void i(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            try {
                Runtime runtime = Runtime.getRuntime();
                runtime.exec("chmod 777 " + file).waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String tF(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append("\n");
                } else {
                    bufferedReader.close();
                    return Rc.s(sb.toString());
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static File yq(String str) {
        return new File(InitOrigin.context().getCacheDir(), str);
    }

    public static void zH(File file, File file2) {
        try {
            N3 n3 = new N3(file);
            n3.i(Charset.forName("GBK"));
            if (!n3.tF()) {
                System.out.println("无效的ZIP文件");
            } else {
                n3.yq(file2.getAbsolutePath());
            }
        } catch (RH e) {
            e.printStackTrace();
        }
    }
}
