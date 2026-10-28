package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.Objects;
/* renamed from: com.github.catvod.spider.merge.m */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class C0136m {
    public static /* synthetic */ int N(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ int SN(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        return i == 1 ? "L" : i == 2 ? "M" : i == 3 ? "Q" : i == 4 ? "H" : "null";
    }

    public static /* synthetic */ int t0(String str) {
        Objects.requireNonNull(str, "Name is null");
        if (str.equals("L")) {
            return 1;
        }
        if (str.equals("M")) {
            return 2;
        }
        if (str.equals("Q")) {
            return 3;
        }
        if (str.equals("H")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(str));
    }

    public static /* synthetic */ String tF(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "-");
            }
        }
        return sb.toString();
    }

    public static int yq(int i) {
        int[] i2;
        for (int i3 : kR.i(2)) {
            if (N(i3) == i) {
                return i3;
            }
        }
        throw new IllegalArgumentException("Unsupported Aes version");
    }

    public static String zH(String str, long j) {
        return str + j;
    }
}
