package com.github.catvod.spider.mergeguard.oOoOoOo0O0O0oO0o;

import java.io.PrintStream;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
final class oOoOoOo0oOo0o0oO {
    static /* synthetic */ Class oOo0oOo0Oo0oO0Oo;
    private static boolean oOoOoOoOoOoOoO0o;

    static {
        try {
            oOoOoOoOoOoOoO0o = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
        }
    }

    private static void oOo0oOo0Oo0oO0Oo(String str) {
        if (oOoOoOoOoOoOoO0o) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    private static Object oOoOoOo0O0O0oO0o(String str, ClassLoader classLoader) {
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Provider ");
            stringBuffer.append(str);
            stringBuffer.append(" not found");
            throw new oOoOoOoOoOoOoO0o(stringBuffer.toString(), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Provider ");
            stringBuffer2.append(str);
            stringBuffer2.append(" could not be instantiated: ");
            stringBuffer2.append(e2);
            throw new oOoOoOoOoOoOoO0o(stringBuffer2.toString(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        oOoOoOoOoOoOoO0o();
        com.github.catvod.spider.mergeguard.oOoOoOo0O0O0oO0o.oOoOoOo0oOo0o0oO.oOo0oOo0Oo0oO0Oo = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        r0 = r0.getClassLoader();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object oOoOoOo0oOo0o0oO() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.mergeguard.oOoOoOo0O0O0oO0o.oOoOoOo0oOo0o0oO.oOoOoOo0oOo0o0oO():java.lang.Object");
    }

    static /* synthetic */ Class oOoOoOoOoOoOoO0o() {
        return oOoOoOo0oOo0o0oO.class;
    }
}
