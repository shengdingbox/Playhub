package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class li {
    public static void B(Object obj) {
        if (obj == null) {
            throw new ID("Object must not be null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    private static boolean Gc(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void KJ(String str) {
        if (str == null || str.length() == 0) {
            throw new ID("String must not be empty");
        }
    }

    private static boolean M(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(RT rt) {
        byte[][] N = rt.N();
        int zH = rt.zH();
        int tF = rt.tF();
        int i = 0;
        for (int i2 = 0; i2 < tF; i2++) {
            for (int i3 = 0; i3 < zH; i3++) {
                byte[] bArr = N[i2];
                int i4 = i3 + 6;
                if (i4 < zH && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (Gc(bArr, i3 - 4, i3) || Gc(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < tF && N[i2][i3] == 1 && N[i2 + 1][i3] == 0 && N[i2 + 2][i3] == 1 && N[i2 + 3][i3] == 1 && N[i2 + 4][i3] == 1 && N[i2 + 5][i3] == 0 && N[i5][i3] == 1 && (M(N, i3, i2 - 4, i2) || M(N, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    private static int SN(RT rt, boolean z) {
        int tF = z ? rt.tF() : rt.zH();
        int zH = z ? rt.zH() : rt.tF();
        byte[][] N = rt.N();
        int i = 0;
        for (int i2 = 0; i2 < tF; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < zH; i4++) {
                byte b2 = z ? N[i2][i4] : N[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    b = b2;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i = (i3 - 5) + 3 + i;
            }
        }
        return i;
    }

    public static void i(boolean z) {
        if (!z) {
            throw new ID("Must be true");
        }
    }

    public static void q(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new ID(str2);
        }
    }

    public static void t0(boolean z, String str) {
        if (!z) {
            throw new ID(str);
        }
    }

    public static void tF(String str) {
        throw new ID(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int yq(RT rt) {
        return SN(rt, true) + SN(rt, false);
    }

    public static void zH(boolean z) {
        if (z) {
            throw new ID("Must be false");
        }
    }
}
