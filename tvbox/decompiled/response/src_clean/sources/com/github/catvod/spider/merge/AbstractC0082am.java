package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
/* renamed from: com.github.catvod.spider.merge.am  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0082am<E> extends E3<E> implements Set<E> {
    private transient rd<E> SN;

    private static <E> AbstractC0082am<E> Gc(int i, Object... objArr) {
        if (i == 0) {
            return fU.M;
        }
        boolean z = false;
        if (i != 1) {
            int t0 = t0(i);
            Object[] objArr2 = new Object[t0];
            int i2 = t0 - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                eb.yq(obj, i5);
                int hashCode = obj.hashCode();
                int G = li.G(hashCode);
                while (true) {
                    int i6 = G & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        i4++;
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        G++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new C0160pE(obj3);
            } else if (t0(i4) < t0 / 2) {
                return Gc(i4, objArr);
            } else {
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    z = true;
                }
                if (z) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new fU(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C0160pE(obj4);
        }
    }

    public static AbstractC0082am KJ() {
        return Gc(4, "br", "deflate", "gzip", "x-gzip");
    }

    static int t0(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= max) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C0072So.SN(z, "collection too large");
            return 1073741824;
        }
    }

    rd<E> M() {
        Object[] array = toArray();
        int i = rd.N;
        int length = array.length;
        if (length == 0) {
            return (rd<E>) DS.i;
        }
        return new DS(array, length);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0082am) && (this instanceof fU)) {
            AbstractC0082am amVar = (AbstractC0082am) obj;
            Objects.requireNonNull(amVar);
            if ((amVar instanceof fU) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            E next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ (-1)) ^ (-1);
        }
        return i;
    }

    public final rd<E> i() {
        rd<E> rdVar = this.SN;
        if (rdVar != null) {
            return rdVar;
        }
        rd<E> M = M();
        this.SN = M;
        return M;
    }
}
