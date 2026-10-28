package com.github.catvod.spider;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.merge.C0023;
import com.github.catvod.spider.merge.C0025;
import com.github.catvod.spider.merge.C0033;
import com.github.catvod.spider.merge.C0065Ku;
import com.github.catvod.spider.merge.C0068Pe;
import com.github.catvod.spider.merge.M4;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.by;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Response;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class DexNative {
    private static volatile boolean N;
    private static volatile boolean SN;
    private static ClassLoader tF;
    private static File zH;

    private static final Object yq = new Object();

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static class LocalSoInfo {
        private LocalSoInfo() {
        }
    }

    static {
        try {
            Application context = InitOrigin.context();
            boolean contains = Build.CPU_ABI.contains("64");
            String str = "v7";
            String str2 = contains ? "v8" : str;
            String str3 = str2.equals(str) ? "https://aisearch.cdn.bcebos.com/fileManager/Vz5O1qFcFIMI5t3IpsXR9DxkPdRvRXGV-Ywqg_6FRNs/1774079804950mDhZnq.jpg" : "https://aisearch.cdn.bcebos.com/fileManager/xqhYC-P80o4zh-0oWqSAcBSmpK3mZ3HPO1G2kpxm-w0/1774079849304Tie0bW.jpg";
            zH = new File(context.getCacheDir(), String.format("danMugo_%s.so", str2));
            if (!str3.startsWith("http")) {
                return;
            }
            if (!str3.equals(C0065Ku.tF("danMuTagUrl")) || !zH.exists()) {
                try {
                    yq(context, str3);
                } catch (Exception e) {
                    N = true;
                }
            }
        } catch (Throwable th) {
            StringBuilder yq2 = by.yq("弹幕服务初始化失败：");
            yq2.append(th.getMessage());
            InitOrigin.show(yq2.toString());
            N = true;
        }
    }

    public static native void GoWeb();

    private static void N(Response response, File file) {
        InputStream byteStream = response.body().byteStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    byteStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            if (byteStream != null) {
                try {
                    byteStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static void SN(boolean z) {
        boolean z2;
        boolean z3 = true;
        try {
            File file = zH;
            if ((file == null || !file.exists()) && !N) {
                StringBuilder sb = new StringBuilder();
                sb.append("本地SO文件不存在：");
                File file2 = zH;
                sb.append(file2 != null ? file2.getAbsolutePath() : "null");
                throw new FileNotFoundException(sb.toString());
            }
            zH.setReadOnly();
            System.load(zH.getAbsolutePath());
            GoWeb();
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                if (System.currentTimeMillis() - currentTimeMillis >= 5000) {
                    z3 = false;
                    break;
                }
                try {
                    new ServerSocket(10001).close();
                    z2 = false;
                } catch (IOException e) {
                    z2 = true;
                }
                if (!z2) {
                    break;
                }
                Thread.sleep(200L);
            }
            if (!z3) {
                InitOrigin.show("弹幕服务启动失败");
                SN = false;
                return;
            }
            if (z) {
                InitOrigin.show("弹幕服务已启动");
            }
            SN = true;
            tF = Thread.currentThread().getContextClassLoader();
            C0065Ku.i("AppPid", Integer.valueOf(Process.myPid()));
        } catch (Throwable th) {
            SN = false;
        }
    }

    public static void danmuStart() {
        C0023.m1471(false);
    }

    public static void danmuStart(boolean z) {
        boolean z2 = false;
        boolean z3 = ("默认".equals(C0014.m419("goDanMuServer", "默认")));

        if (z3) {
            boolean z4 = m708();
            if (!(z4)) {
                boolean z5 = m712();
                if (!z5) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    int i4 = C0001.m41("AppPid");
                    int i5 = Process.myPid();
                    if (!(i4 == i5)) {
                        boolean z6 = (atomicBoolean.get());
                        if (!(z6)) {
                            synchronized (m711()) {
                                boolean z7 = m708();
                                if (z7) {
                                    ClassLoader classLoader = m710();
                                    ClassLoader classLoader2 = (Thread.currentThread().getContextClassLoader());
                                    if (!(classLoader != classLoader2)) {
                                        C0002.m78("AppPid", (Integer.valueOf(Process.myPid())));
                                        z2 = true;
                                    }
                                }
                                if (!(z2)) {
                                    boolean z8 = m708();
                                    if (!(z8)) {
                                        m709(z);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    int i4 = C0001.m41("AppPid");
                    int i5 = Process.myPid();
                    if (!(i4 == i5)) {
                        boolean z6 = (atomicBoolean.get());
                        if (!(z6)) {
                            synchronized (m711()) {
                                boolean z7 = m708();
                                if (z7) {
                                    ClassLoader classLoader = m710();
                                    ClassLoader classLoader2 = (Thread.currentThread().getContextClassLoader());
                                    if (!(classLoader != classLoader2)) {
                                        C0002.m78("AppPid", (Integer.valueOf(Process.myPid())));
                                        z2 = true;
                                    }
                                }
                                if (!(z2)) {
                                    boolean z8 = m708();
                                    if (!(z8)) {
                                        m709(z);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return;
    }

    private static void yq(Context context, String str) {
        File file;
        synchronized (yq) {
            if (str.startsWith("http")) {
                HashMap<String, String> yq2 = Rc.yq();
                yq2.put("range", "bytes=0-");
                Response Gc = C0068Pe.Gc(str, yq2);
                if (!Gc.isSuccessful() || Long.parseLong(Gc.header("content-length")) < 3145728) {
                    InitOrigin.show("文件地址已失效或数据异常，响应码：" + Gc.code());
                    Gc.close();
                    return;
                }
                zH.delete();
                if (!str.contains(".so")) {
                    boolean contains = str.contains(".zip");
                    String str2 = "temp_danmu.zip";
                    String lastPathSegment = contains ? Uri.parse(str).getLastPathSegment() : str2;
                    if (Rc.ee(lastPathSegment)) {
                        lastPathSegment = str2;
                    }
                    file = new File(context.getCacheDir(), lastPathSegment);
                } else {
                    file = zH;
                }
                N(Gc, file);
                if (file.getAbsolutePath().contains(".zip")) {
                    M4.zH(file, context.getCacheDir());
                    file.delete();
                }
                if (zH.exists()) {
                    C0065Ku.i("danMuTagUrl", str);
                    Gc.close();
                    return;
                }
                InitOrigin.show("未找到弹幕服务文件");
                N = true;
                throw new FileNotFoundException("未找到SO文件：" + zH.getAbsolutePath());
            }
            throw new IllegalArgumentException("弹幕服务地址非HTTP协议：" + str);
        }
    }

    /* renamed from: جقﺥﻙ  reason: contains not printable characters */
    public static boolean m708() {
        if (284 ^ C0041.f99 < 0) {
            return SN;
        }
        return false;
    }

    /* renamed from: كيتخ  reason: contains not printable characters */
    public static void m709(boolean z) {
        if ((-768) ^ C0002.f2 <= 0) {
            SN(z);
        }
    }

    /* renamed from: يخﺹه  reason: contains not printable characters */
    public static ClassLoader m710() {
        if (916 ^ C0002.f2 >= 0) {
            return tF;
        }
        return null;
    }

    /* renamed from: ﺡﺯﺏﺹ  reason: contains not printable characters */
    public static Object m711() {
        if ((-26) ^ C0033.f91 >= 0) {
            return yq;
        }
        return null;
    }

    /* renamed from: ﺡﺵخﺕ  reason: contains not printable characters */
    public static boolean m712() {
        if ((-556) ^ C0004.f4 <= 0) {
            return N;
        }
        return false;
    }

}
