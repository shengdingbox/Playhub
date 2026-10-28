package com.github.catvod.spider.merge;

import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Mw {
    public static final /* synthetic */ int yq = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static String Gc(String str, String str2, String str3) {
        if (N(str) || N(str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int yq2 = (str == null || str2 == null) ? -1 : qW.yq(str, str2, 0);
        if (yq2 == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (yq2 != -1) {
            sb.append((CharSequence) str, i, yq2);
            sb.append(str3);
            i = yq2 + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            yq2 = qW.yq(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static String KJ(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0) {
            i2 += str.length();
        }
        if (i < 0) {
            i += str.length();
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        if (i > i2) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return str.substring(i, i2);
    }

    public static String M(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i += str.length();
        }
        if (i < 0) {
            i = 0;
        }
        return i > str.length() ? "" : str.substring(i);
    }

    public static boolean N(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean SN(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String i(String str, String str2) {
        return (N(str) || N(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String t0(String str, String str2) {
        return (N(str) || N(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static boolean tF(CharSequence charSequence) {
        return !SN(charSequence);
    }

    public static boolean yq(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return qW.SN(charSequence, false, charSequence.length() - charSequence2.length(), charSequence2, charSequence2.length());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003f -> B:15:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zH(java.lang.Iterable<?> r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r3 = r3.iterator()
            if (r3 != 0) goto Lb
            goto L47
        Lb:
            boolean r0 = r3.hasNext()
            java.lang.String r1 = ""
            if (r0 != 0) goto L15
            r0 = r1
            goto L47
        L15:
            java.lang.Object r0 = r3.next()
            boolean r2 = r3.hasNext()
            if (r2 != 0) goto L24
            java.lang.String r0 = java.util.Objects.toString(r0, r1)
            goto L47
        L24:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 256(0x100, float:3.59E-43)
            r1.<init>(r2)
            if (r0 == 0) goto L2e
            goto L3f
        L2e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L43
            if (r4 == 0) goto L39
            r1.append(r4)
        L39:
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L2e
        L3f:
            r1.append(r0)
            goto L2e
        L43:
            java.lang.String r0 = r1.toString()
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Mw.zH(java.lang.Iterable, java.lang.String):java.lang.String");
    }
}
