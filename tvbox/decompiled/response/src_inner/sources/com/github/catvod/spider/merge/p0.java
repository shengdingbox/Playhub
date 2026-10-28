package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class p0 {
    public static /* synthetic */ int SN(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 8;
        }
        if (i == 3) {
            return 99;
        }
        throw null;
    }

    public static int yq(int i) {
        int[] i2;
        for (int i3 : kR.i(3)) {
            if (SN(i3) == i) {
                return i3;
            }
        }
        throw new RH("Unknown compression method", 4);
    }
}
