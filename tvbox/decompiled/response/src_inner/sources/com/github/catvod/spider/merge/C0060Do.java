package com.github.catvod.spider.merge;

import android.util.Base64;
import com.github.catvod.spider.ProxyOrigin;
import java.util.ArrayList;
/* renamed from: com.github.catvod.spider.merge.Do  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0060Do {
    private static final int[][] yq = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] SN = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] N = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] tF = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static String B(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable th2 = th; th2 != null && !arrayList.contains(th2); th2 = th2.getCause()) {
            arrayList.add(th2);
        }
        Throwable th3 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th3 != null) {
            th = th3;
        }
        int i = Y.zH;
        String yq2 = Y.yq(th.getClass());
        String message = th.getMessage();
        StringBuilder yq3 = Sq.yq(yq2, ": ");
        int i2 = Mw.yq;
        if (message == null) {
            message = "";
        }
        yq3.append(message);
        return yq3.toString();
    }

    private static boolean G(int i) {
        return i == -1;
    }

    private static void Gc(int i, int i2, RT rt) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (G(rt.SN(i, i4))) {
                rt.i(i, i4, 0);
            } else {
                throw new C0148mf();
            }
        }
    }

    public static final boolean KJ(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static String M(String str) {
        if (str != null) {
            return new String(Base64.encode(yq(str.getBytes(), "fantaiying921"), 2));
        }
        return null;
    }

    static int N(int i, int i2) {
        if (i2 != 0) {
            int q = q(i2);
            int i3 = i << (q - 1);
            while (q(i3) >= q) {
                i3 ^= i2 << (q(i3) - q);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void SN(E e, int i, x5 x5Var, int i2, RT rt) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        rt.yq();
        int length = yq[0].length;
        t0(0, 0, rt);
        t0(rt.zH() - length, 0, rt);
        t0(0, rt.zH() - length, rt);
        i(0, 7, rt);
        i(rt.zH() - 8, 7, rt);
        i(0, rt.zH() - 8, rt);
        Gc(7, 0, rt);
        int i7 = -1;
        Gc((rt.tF() - 7) - 1, 0, rt);
        Gc(7, rt.tF() - 7, rt);
        if (rt.SN(8, rt.tF() - 8) != 0) {
            rt.i(8, rt.tF() - 8, 1);
            if (x5Var.i() >= 2) {
                int i8 = x5Var.i() - 1;
                int[][] iArr = N;
                int[] iArr2 = iArr[i8];
                int length2 = iArr[i8].length;
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = iArr2[i9];
                        int i12 = iArr2[i10];
                        if (!(i12 == i7 || i11 == i7 || !G(rt.SN(i12, i11)))) {
                            int i13 = i12 - 2;
                            int i14 = i11 - 2;
                            for (int i15 = 0; i15 < 5; i15++) {
                                for (int i16 = 0; i16 < 5; i16++) {
                                    rt.i(i13 + i16, i14 + i15, SN[i15][i16]);
                                }
                            }
                        }
                        i10++;
                        i7 = -1;
                    }
                    i9++;
                    i7 = -1;
                }
            }
            int i17 = 8;
            while (i17 < rt.zH() - 8) {
                int i18 = i17 + 1;
                int i19 = i18 % 2;
                if (G(rt.SN(i17, 6))) {
                    rt.i(i17, 6, i19);
                }
                if (G(rt.SN(6, i17))) {
                    rt.i(6, i17, i19);
                }
                i17 = i18;
            }
            E e2 = new E();
            if (i2 >= 0 && i2 < 8) {
                int SN2 = (C0136m.SN(i) << 3) | i2;
                e2.N(SN2, 5);
                e2.N(N(SN2, 1335), 10);
                E e3 = new E();
                e3.N(21522, 15);
                e2.Gc(e3);
                if (e2.i() == 15) {
                    for (int i20 = 0; i20 < e2.i(); i20++) {
                        boolean zH = e2.zH((e2.i() - 1) - i20);
                        int[][] iArr3 = tF;
                        rt.t0(iArr3[i20][0], iArr3[i20][1], zH);
                        if (i20 < 8) {
                            rt.t0((rt.zH() - i20) - 1, 8, zH);
                        } else {
                            rt.t0(8, (i20 - 8) + (rt.tF() - 7), zH);
                        }
                    }
                    if (x5Var.i() >= 7) {
                        E e4 = new E();
                        e4.N(x5Var.i(), 6);
                        e4.N(N(x5Var.i(), 7973), 12);
                        if (e4.i() == 18) {
                            int i21 = 17;
                            for (int i22 = 0; i22 < 6; i22++) {
                                for (int i23 = 0; i23 < 3; i23++) {
                                    boolean zH2 = e4.zH(i21);
                                    i21--;
                                    rt.t0(i22, (rt.tF() - 11) + i23, zH2);
                                    rt.t0((rt.tF() - 11) + i23, i22, zH2);
                                }
                            }
                        } else {
                            throw new C0148mf("should not happen but we got: " + e4.i());
                        }
                    }
                    int zH3 = rt.zH() - 1;
                    int tF2 = rt.tF() - 1;
                    int i24 = 0;
                    int i25 = -1;
                    while (zH3 > 0) {
                        if (zH3 == 6) {
                            zH3--;
                        }
                        while (tF2 >= 0 && tF2 < rt.tF()) {
                            for (int i26 = 0; i26 < 2; i26++) {
                                int i27 = zH3 - i26;
                                if (G(rt.SN(i27, tF2))) {
                                    if (i24 < e.i()) {
                                        z = e.zH(i24);
                                        i24++;
                                    } else {
                                        z = false;
                                    }
                                    if (i2 != -1) {
                                        switch (i2) {
                                            case ProxyOrigin.Gc /* 0 */:
                                                i4 = tF2 + i27;
                                                i3 = i4 & 1;
                                                break;
                                            case 1:
                                                i4 = tF2;
                                                i3 = i4 & 1;
                                                break;
                                            case 2:
                                                i3 = i27 % 3;
                                                break;
                                            case 3:
                                                i3 = (tF2 + i27) % 3;
                                                break;
                                            case 4:
                                                i3 = ((i27 / 3) + (tF2 / 2)) & 1;
                                                break;
                                            case 5:
                                                int i28 = tF2 * i27;
                                                i3 = (i28 % 3) + (i28 & 1);
                                                break;
                                            case 6:
                                                int i29 = tF2 * i27;
                                                i5 = i29 & 1;
                                                i6 = i29 % 3;
                                                i4 = i6 + i5;
                                                i3 = i4 & 1;
                                                break;
                                            case 7:
                                                i6 = (tF2 * i27) % 3;
                                                i5 = (tF2 + i27) & 1;
                                                i4 = i6 + i5;
                                                i3 = i4 & 1;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Invalid mask pattern: " + i2);
                                        }
                                        if (i3 == 0) {
                                            z = !z;
                                        }
                                    }
                                    rt.t0(i27, tF2, z);
                                }
                            }
                            tF2 += i25;
                        }
                        i25 = -i25;
                        tF2 += i25;
                        zH3 -= 2;
                    }
                    if (i24 != e.i()) {
                        throw new C0148mf("Not all bits consumed: " + i24 + '/' + e.i());
                    }
                    return;
                }
                throw new C0148mf("should not happen but we got: " + e2.i());
            }
            throw new C0148mf("Invalid mask pattern");
        }
        throw new C0148mf();
    }

    private static void i(int i, int i2, RT rt) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (G(rt.SN(i4, i2))) {
                rt.i(i4, i2, 0);
            } else {
                throw new C0148mf();
            }
        }
    }

    static int q(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    private static void t0(int i, int i2, RT rt) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                rt.i(i + i4, i2 + i3, yq[i3][i4]);
            }
        }
    }

    public static String tF(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        byte[] bytes = str.getBytes();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            byte b = bytes[i2];
            byte b2 = bytes[i2 + 1];
            StringBuilder yq2 = by.yq("0x");
            yq2.append(new String(new byte[]{b}));
            StringBuilder yq3 = by.yq("0x");
            yq3.append(new String(new byte[]{b2}));
            bArr[i] = (byte) (((char) Byte.decode(yq3.toString()).byteValue()) ^ ((char) (((char) Byte.decode(yq2.toString()).byteValue()) << 4)));
        }
        return new String(yq(bArr, str2));
    }

    private static byte[] yq(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr2 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr2[i] = (byte) i;
        }
        if (bytes == null || bytes.length == 0) {
            bArr2 = null;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                i3 = ((bytes[i2] & 255) + (bArr2[i4] & 255) + i3) & 255;
                byte b = bArr2[i4];
                bArr2[i4] = bArr2[i3];
                bArr2[i3] = b;
                i2 = (i2 + 1) % bytes.length;
            }
        }
        byte[] bArr3 = new byte[bArr.length];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < bArr.length; i7++) {
            i5 = (i5 + 1) & 255;
            i6 = ((bArr2[i5] & 255) + i6) & 255;
            byte b2 = bArr2[i5];
            bArr2[i5] = bArr2[i6];
            bArr2[i6] = b2;
            bArr3[i7] = (byte) (bArr2[((bArr2[i5] & 255) + (bArr2[i6] & 255)) & 255] ^ bArr[i7]);
        }
        return bArr3;
    }

    public static String zH(String str) {
        if (str != null) {
            return new String(yq(Base64.decode(str, 2), "fantaiying921"));
        }
        return null;
    }
}
