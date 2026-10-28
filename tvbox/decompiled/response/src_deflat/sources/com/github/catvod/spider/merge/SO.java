package com.github.catvod.spider.merge;

import android.app.Application;
import android.os.Build;
import com.github.catvod.spider.InitOrigin;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class SO {
    private static Integer yq;

    public static boolean yq() {
        int i;
        Integer num = yq;
        if (num != null) {
            i = num.intValue();
        } else {
            try {
                Application context = InitOrigin.context();
                if (context != null) {
                    Integer valueOf = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.targetSdkVersion);
                    yq = valueOf;
                    i = valueOf.intValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            i = Build.VERSION.SDK_INT;
        }
        return i >= 37;
    }
}
