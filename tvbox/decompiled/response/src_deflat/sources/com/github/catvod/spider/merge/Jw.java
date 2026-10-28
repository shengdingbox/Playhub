package com.github.catvod.spider.merge;

import java.io.PrintStream;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class Jw {
    static /* synthetic */ Class SN;
    private static boolean yq;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static abstract class yq {
        private yq() {
        }

        abstract ClassLoader yq();
    }

    static {
        try {
            yq = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
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
        yq();
        com.github.catvod.spider.merge.Jw.SN = r0;
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
    public static java.lang.Object N() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Jw.N():java.lang.Object");
    }

    private static void SN(String str) {
        if (yq) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    private static Object tF(String str, ClassLoader classLoader) {
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Provider ");
            stringBuffer.append(str);
            stringBuffer.append(" not found");
            throw new s1(stringBuffer.toString(), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Provider ");
            stringBuffer2.append(str);
            stringBuffer2.append(" could not be instantiated: ");
            stringBuffer2.append(e2);
            throw new s1(stringBuffer2.toString(), e2);
        }
    }

    static /* synthetic */ Class yq() {
        return Jw.class;
    }
}
