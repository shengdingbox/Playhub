package com.github.catvod.spider;

import com.github.catvod.parser.C0004;
import java.io.ByteArrayOutputStream;
/* renamed from: com.github.catvod.spider.صيﺎغ  reason: contains not printable characters */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0047 {

    /* renamed from: ﻅنفم  reason: contains not printable characters */
    public static int f105 = 16;

    /* renamed from: فﺥﻉﻅ  reason: contains not printable characters */
    public static int m2134() {
        return (-556) ^ C0004.f4;
    }

    /* renamed from: نيسج  reason: contains not printable characters */
    public static String m2135(String str) {
        String str2 = "";
        String str3 = "";
        for (int i = 0; i < 15; i++) {
            str2 = new StringBuffer().append(str2).append(Integer.toHexString(i)).toString();
            str3 = new StringBuffer().append(str3).append(((int) (Math.random() * 10)) ^ i).toString();
        }
        do {
        } while (str2.length() > 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((str2.indexOf(str.charAt(i2)) << 4) | str2.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str3.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str3.charAt(i3 % length2));
        }
        return new String(byteArray);
    }

    /* renamed from: ﻁقجن  reason: contains not printable characters */
    public static int m2136(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: طﻁكس  reason: contains not printable characters */
    public static String m2133(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
