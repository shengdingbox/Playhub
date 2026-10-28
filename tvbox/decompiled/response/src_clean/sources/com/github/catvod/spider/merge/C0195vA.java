package com.github.catvod.spider.merge;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.widget.Button;
import com.github.catvod.spider.InitOrigin;
/* renamed from: com.github.catvod.spider.merge.vA  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0195vA {
    private static Integer N;
    private static boolean SN;
    private static AlertDialog yq;

    private static void Gc() {
        Activity activity = InitOrigin.getActivity();
        if (t0()) {
            try {
                try {
                    Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                    intent.setData(Uri.parse("package:" + activity.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception unused) {
                    InitOrigin.show("请手动在设置中开启存储权限");
                }
            } catch (Exception unused2) {
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.parse("package:" + activity.getPackageName()));
                activity.startActivity(intent2);
            }
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1024);
            } else if (i >= 23) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1024);
            }
        }
    }

    private static void M() {
        try {
            AlertDialog create = new AlertDialog.Builder(InitOrigin.getActivity()).setTitle("部分功能需要授权").setMessage(t0() ? "当前应用需要「所有文件管理权限」才能正常使用存储功能。\n\n点击授权后，请在设置页面中手动开启「允许管理所有文件」开关。" : "需要存储权限来读取和写入文件，请点击授权并允许。").setNegativeButton(17039360, AD.yq).setPositiveButton("开始授权", (DialogInterface.OnClickListener) null).create();
            yq = create;
            create.show();
            Button button = yq.getButton(-1);
            if (button != null) {
                button.setOnClickListener(View$OnClickListenerC0187tm.yq);
            }
            yq.setOnDismissListener(vb.N);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void N() {
        try {
            Gc();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean i() {
        try {
        } catch (Exception e) {
            C0065Ku.i("storage_state", 1);
            System.out.println(e);
        }
        if (C0065Ku.SN("storage_state") > 1) {
            return true;
        }
        if (C0065Ku.SN("storage_state") == 0) {
            if (!zH()) {
                SN = true;
                InitOrigin.run(TJ.yq);
                while (SN && !zH()) {
                    SystemClock.sleep(500L);
                }
                try {
                    AlertDialog alertDialog = yq;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                } catch (Exception unused) {
                }
                if (!zH()) {
                    C0065Ku.i("storage_state", 1);
                    InitOrigin.show("未授权！(下载安装APP受限)");
                }
            }
            C0065Ku.i("storage_state", 2);
            return true;
        }
        return false;
    }

    private static boolean t0() {
        int i;
        Integer num = N;
        if (num != null) {
            i = num.intValue();
        } else {
            try {
                Application context = InitOrigin.context();
                if (context != null) {
                    Integer valueOf = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.targetSdkVersion);
                    N = valueOf;
                    i = valueOf.intValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            i = Build.VERSION.SDK_INT;
        }
        return i >= 37;
    }

    public static void tF() {
        SN = false;
        try {
            AlertDialog alertDialog = yq;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void yq() {
        try {
            M();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean zH() {
        Application context = InitOrigin.context();
        if (t0() && Build.VERSION.SDK_INT >= 30) {
            return Environment.isExternalStorageManager();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        return true;
    }
}
