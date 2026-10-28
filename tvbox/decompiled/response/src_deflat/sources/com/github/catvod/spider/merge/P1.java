package com.github.catvod.spider.merge;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class P1 {
    public static final /* synthetic */ int i = 0;
    static final String[] yq = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    private static final Pattern SN = Pattern.compile("^/((\\.{1,2}/)+)");
    private static final Pattern N = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    private static final Pattern tF = Pattern.compile("[\\x00-\\x1f]*");
    private static final ThreadLocal<Stack<StringBuilder>> zH = new yq();

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq extends ThreadLocal<Stack<StringBuilder>> {
        yq() {
        }

        @Override // java.lang.ThreadLocal
        protected final Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    public static String Gc(StringBuilder sb) {
        li.B(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = zH.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    public static URL KJ(URL url, String str) {
        String q = q(str);
        if (q.startsWith("?")) {
            q = url.getPath() + q;
        }
        URL url2 = new URL(url, q);
        String replaceFirst = SN.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            StringBuilder yq2 = Sq.yq(replaceFirst, "#");
            yq2.append(url2.getRef());
            replaceFirst = yq2.toString();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }

    public static String M(String str, String str2) {
        String q = q(str);
        String q2 = q(str2);
        try {
            try {
                return KJ(new URL(q), q2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(q2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return N.matcher(q2).find() ? q2 : "";
        }
    }

    public static boolean N(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static StringBuilder SN() {
        Stack<StringBuilder> stack = zH.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    public static String i(Collection<?> collection, String str) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder SN2 = SN();
        li.B(SN2);
        Object obj2 = obj;
        while (true) {
            SN2.append(obj2);
            if (!it.hasNext()) {
                return Gc(SN2);
            }
            Object next = it.next();
            SN2.append(str);
            obj2 = next;
        }
    }

    private static String q(String str) {
        return tF.matcher(str).replaceAll("");
    }

    public static String t0(int i2, int i3) {
        boolean z = true;
        li.t0(i2 >= 0, "width must be >= 0");
        if (i3 < -1) {
            z = false;
        }
        li.i(z);
        if (i3 != -1) {
            i2 = Math.min(i2, i3);
        }
        String[] strArr = yq;
        if (i2 < 21) {
            return strArr[i2];
        }
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static boolean tF(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (!zH(str.codePointAt(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void yq(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (!(codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160)) {
                if (!(codePointAt == 8203 || codePointAt == 173)) {
                    sb.appendCodePoint(codePointAt);
                    z2 = true;
                    z3 = false;
                }
            } else if ((!z || z2) && !z3) {
                sb.append(' ');
                z3 = true;
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    public static boolean zH(int i2) {
        return i2 == 32 || i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13;
    }
}
