package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class CT {
    private static final int[] yq = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
        r7 = r3;
     */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map<Lcom/github/catvod/spider/merge/zK;*>;)Lcom/github/catvod/spider/merge/KL; */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f5 A[LOOP:2: B:58:0x00c7->B:72:0x00f5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.github.catvod.spider.merge.KL N(java.lang.String r23, int r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.CT.N(java.lang.String, int, java.util.Map):com.github.catvod.spider.merge.KL");
    }

    private static x5 SN(int i, int i2) {
        for (int i3 = 1; i3 <= 40; i3++) {
            x5 zH = x5.zH(i3);
            if (zH(i, zH, i2)) {
                return zH;
            }
        }
        throw new C0148mf("Data too big");
    }

    static int tF(int i) {
        int[] iArr = yq;
        if (i < 96) {
            return iArr[i];
        }
        return -1;
    }

    private static int yq(J7 j7, E e, E e2, x5 x5Var) {
        return e2.i() + j7.SN(x5Var) + e.i();
    }

    private static boolean zH(int i, x5 x5Var, int i2) {
        return x5Var.tF() - x5Var.N(i2).tF() >= (i + 7) / 8;
    }
}
