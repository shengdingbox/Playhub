package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class hY extends R5 {
    public static byte[] Nl(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        aq.zH(bArr, "<this>");
        aq.zH(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static Object[] O(Object[] objArr, int i, int i2) {
        aq.zH(objArr, "<this>");
        aq.Gc(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        aq.tF(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static byte[] OW(byte[] bArr, int i, int i2) {
        aq.zH(bArr, "<this>");
        aq.Gc(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        aq.tF(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static List g1(Object[] objArr) {
        aq.zH(objArr, "<this>");
        return new ArrayList(new Tt(objArr, false));
    }
}
