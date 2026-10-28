package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class K1 extends Th {
    public static boolean B(CharSequence charSequence) {
        return N5.KJ(charSequence, "getsockname failed", 0, false) >= 0;
    }

    public static int G(CharSequence charSequence, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(46, i);
    }

    public static String G4(String str, String str2, String str3) {
        int KJ = N5.KJ(str, str2, 0, false);
        if (KJ < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append((CharSequence) str, i2, KJ);
                sb.append(str3);
                i2 = KJ + length;
                if (KJ >= str.length()) {
                    break;
                }
                KJ = N5.KJ(str, str2, KJ + i, false);
            } while (KJ > 0);
            sb.append((CharSequence) str, i2, str.length());
            String sb2 = sb.toString();
            aq.tF(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }
}
