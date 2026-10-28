package com.github.catvod.spider.merge;

import android.content.Context;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class A implements Runnable {
    final Context yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(Context context) {
        this.yq = context;
    }

    /* renamed from: بﻕﺎج  reason: contains not printable characters */
    public static Context m1027(Object obj) {
        if (C0007.m214() <= 0) {
            return ((A) obj).yq;
        }
        return null;
    }

    /* renamed from: طﺎﻡﺽ  reason: contains not printable characters */
    public static void m1028(Object obj) {
        if (C0008.m250() > 0) {
            cn.yq((Context) obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        m1028(m1027(this));
    }
}
