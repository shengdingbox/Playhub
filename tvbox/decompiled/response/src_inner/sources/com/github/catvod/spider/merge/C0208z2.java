package com.github.catvod.spider.merge;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* renamed from: com.github.catvod.spider.merge.z2  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class C0208z2<K, V> {
    static Object[] i;
    static int t0;
    static Object[] tF;
    static int zH;
    int[] yq = C0072So.yq;
    Object[] SN = C0072So.SN;
    int N = 0;

    private static int SN(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            try {
                int i7 = iArr[i6];
                if (i7 < i3) {
                    i5 = i6 + 1;
                } else if (i7 <= i3) {
                    return i6;
                } else {
                    i4 = i6 - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return i5 ^ (-1);
    }

    private static void tF(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (dU.class) {
                if (t0 < 10) {
                    objArr[0] = i;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    i = objArr;
                    t0++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (dU.class) {
                if (zH < 10) {
                    objArr[0] = tF;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    tF = objArr;
                    zH++;
                }
            }
        }
    }

    private void yq(int i2) {
        if (i2 == 8) {
            synchronized (dU.class) {
                Object[] objArr = i;
                if (objArr != null) {
                    this.SN = objArr;
                    i = (Object[]) objArr[0];
                    this.yq = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    t0--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (dU.class) {
                Object[] objArr2 = tF;
                if (objArr2 != null) {
                    this.SN = objArr2;
                    tF = (Object[]) objArr2[0];
                    this.yq = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    zH--;
                    return;
                }
            }
        }
        this.yq = new int[i2];
        this.SN = new Object[i2 << 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Gc(Object obj) {
        int i2 = this.N * 2;
        Object[] objArr = this.SN;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final V KJ(int i2) {
        Object[] objArr = this.SN;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.N;
        int i5 = 0;
        if (i4 <= 1) {
            tF(this.yq, objArr, i4);
            this.yq = C0072So.yq;
            this.SN = C0072So.SN;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.yq;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr2 = this.SN;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i3, i9 << 1);
                }
                Object[] objArr3 = this.SN;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                yq(i7);
                if (i4 == this.N) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.yq, 0, i2);
                        System.arraycopy(objArr, 0, this.SN, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.yq, i2, i12);
                        System.arraycopy(objArr, i11 << 1, this.SN, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.N) {
            this.N = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public final K M(int i2) {
        return (K) this.SN[i2 << 1];
    }

    public final void N(int i2) {
        int i3 = this.N;
        int[] iArr = this.yq;
        if (iArr.length < i2) {
            Object[] objArr = this.SN;
            yq(i2);
            if (this.N > 0) {
                System.arraycopy(iArr, 0, this.yq, 0, i3);
                System.arraycopy(objArr, 0, this.SN, 0, i3 << 1);
            }
            tF(iArr, objArr, i3);
        }
        if (this.N != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.N;
        if (i2 > 0) {
            int[] iArr = this.yq;
            Object[] objArr = this.SN;
            this.yq = C0072So.yq;
            this.SN = C0072So.SN;
            this.N = 0;
            tF(iArr, objArr, i2);
        }
        if (this.N > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return Gc(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0208z2) {
            C0208z2 z2Var = (C0208z2) obj;
            if (this.N != z2Var.N) {
                return false;
            }
            for (int i2 = 0; i2 < this.N; i2++) {
                try {
                    K M = M(i2);
                    V q = q(i2);
                    Object obj2 = z2Var.get(M);
                    if (q == null) {
                        if (obj2 != null || !z2Var.containsKey(M)) {
                            return false;
                        }
                    } else if (!q.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.N != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.N; i3++) {
                try {
                    K M2 = M(i3);
                    V q2 = q(i3);
                    Object obj3 = map.get(M2);
                    if (q2 == null) {
                        if (obj3 != null || !map.containsKey(M2)) {
                            return false;
                        }
                    } else if (!q2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final V get(Object obj) {
        int i2 = i(obj);
        if (i2 >= 0) {
            return (V) this.SN[(i2 << 1) + 1];
        }
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.yq;
        Object[] objArr = this.SN;
        int i2 = this.N;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final int i(Object obj) {
        return obj == null ? t0() : zH(obj, obj.hashCode());
    }

    public final boolean isEmpty() {
        return this.N <= 0;
    }

    public final V put(K k, V v) {
        int i2;
        int i3;
        int i4 = this.N;
        if (k == null) {
            i3 = t0();
            i2 = 0;
        } else {
            int hashCode = k.hashCode();
            i3 = zH(k, hashCode);
            i2 = hashCode;
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            Object[] objArr = this.SN;
            V v2 = (V) objArr[i5];
            objArr[i5] = v;
            return v2;
        }
        int i6 = i3 ^ (-1);
        int[] iArr = this.yq;
        if (i4 >= iArr.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            Object[] objArr2 = this.SN;
            yq(i7);
            if (i4 == this.N) {
                int[] iArr2 = this.yq;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.SN, 0, objArr2.length);
                }
                tF(iArr, objArr2, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.yq;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.SN;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.N - i6) << 1);
        }
        int i9 = this.N;
        if (i4 == i9) {
            int[] iArr4 = this.yq;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr4 = this.SN;
                int i10 = i6 << 1;
                objArr4[i10] = k;
                objArr4[i10 + 1] = v;
                this.N = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V q(int i2) {
        return (V) this.SN[(i2 << 1) + 1];
    }

    public final V remove(Object obj) {
        int i2 = i(obj);
        if (i2 >= 0) {
            return KJ(i2);
        }
        return null;
    }

    public final int size() {
        return this.N;
    }

    final int t0() {
        int i2 = this.N;
        if (i2 == 0) {
            return -1;
        }
        int SN = SN(this.yq, i2, 0);
        if (SN < 0 || this.SN[SN << 1] == null) {
            return SN;
        }
        int i3 = SN + 1;
        while (i3 < i2 && this.yq[i3] == 0) {
            if (this.SN[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = SN - 1; i4 >= 0 && this.yq[i4] == 0; i4--) {
            if (this.SN[i4 << 1] == null) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.N * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.N; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K M = M(i2);
            if (M != this) {
                sb.append(M);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V q = q(i2);
            if (q != this) {
                sb.append(q);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    final int zH(Object obj, int i2) {
        int i3 = this.N;
        if (i3 == 0) {
            return -1;
        }
        int SN = SN(this.yq, i3, i2);
        if (SN < 0 || obj.equals(this.SN[SN << 1])) {
            return SN;
        }
        int i4 = SN + 1;
        while (i4 < i3 && this.yq[i4] == i2) {
            if (obj.equals(this.SN[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = SN - 1; i5 >= 0 && this.yq[i5] == i2; i5--) {
            if (obj.equals(this.SN[i5 << 1])) {
                return i5;
            }
        }
        return i4 ^ (-1);
    }
}
