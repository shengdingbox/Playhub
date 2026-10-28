package com.github.catvod.spider.merge;

import java.io.PrintStream;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Og {
    private static boolean SN;
    private static yq yq;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class yq extends SecurityManager {
        yq() {
        }

        @Override // java.lang.SecurityManager
        protected final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private Og() {
    }

    public static final void N(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static final void SN(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    public static Class<?> yq() {
        int i;
        yq yqVar = yq;
        if (yqVar == null) {
            if (SN) {
                yqVar = null;
            } else {
                try {
                    yqVar = new yq();
                } catch (SecurityException unused) {
                    yqVar = null;
                }
                yq = yqVar;
                SN = true;
            }
        }
        if (yqVar == null) {
            return null;
        }
        Class<?>[] classContext = yqVar.getClassContext();
        String name = Og.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
            return classContext[i];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }
}
