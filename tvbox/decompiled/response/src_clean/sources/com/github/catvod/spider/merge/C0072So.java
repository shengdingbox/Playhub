package com.github.catvod.spider.merge;
/* renamed from: com.github.catvod.spider.merge.So  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0072So {
    static final int[] yq = new int[0];
    static final Object[] SN = new Object[0];

    public static boolean Gc(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void M(aA aAVar, MA ma) {
        li.B(ma);
        MA ma2 = ma;
        int i = 0;
        while (ma2 != null) {
            MA O = ma2.O();
            int t0 = O != null ? O.t0() : 0;
            MA W = ma2.W();
            aAVar.SN(ma2, i);
            if (O != null && !ma2.F5()) {
                if (t0 == O.t0()) {
                    ma2 = O.i(ma2.Dr());
                } else if (W == null) {
                    i--;
                    ma2 = O;
                } else {
                    ma2 = W;
                }
            }
            if (ma2.t0() > 0) {
                ma2 = ma2.i(0);
                i++;
            } else {
                while (ma2.W() == null && i > 0) {
                    aAVar.yq(ma2, i);
                    ma2 = ma2.O();
                    i--;
                }
                aAVar.yq(ma2, i);
                if (ma2 != ma) {
                    ma2 = ma2.W();
                } else {
                    return;
                }
            }
        }
    }

    public static int N(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = Ya.zH("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 >= 0) {
            str = Ya.zH("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static void SN(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void i(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void t0(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int tF(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(yq(i, i2, "index"));
    }

    private static String yq(int i, int i2, String str) {
        if (i < 0) {
            return Ya.zH("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return Ya.zH("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void zH(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = yq(i, i3, "start index");
            } else {
                str = (i2 < 0 || i2 > i3) ? yq(i2, i3, "end index") : Ya.zH("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }
}
