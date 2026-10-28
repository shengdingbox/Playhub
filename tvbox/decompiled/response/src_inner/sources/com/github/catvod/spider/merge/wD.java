package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class wD<T> implements Set<T> {
    protected int N;
    protected T[][] SN;
    protected int tF;
    protected final Hj yq;
    protected int zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    protected class yq implements Iterator<T> {
        final T[] yq;
        int SN = 0;
        boolean N = true;

        public yq(T[] tArr) {
            this.yq = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.SN < this.yq.length;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                this.N = false;
                T[] tArr = this.yq;
                int i = this.SN;
                this.SN = i + 1;
                return tArr[i];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.N) {
                wD.this.remove(this.yq[this.SN - 1]);
                this.N = true;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public wD() {
        this(null, 8);
    }

    public wD(Hj hj, int i) {
        this.N = 0;
        this.tF = (int) Math.floor(12.0d);
        this.zH = 8;
        this.yq = hj == null ? qD.yq : hj;
        this.SN = tF(16);
        this.zH = i;
    }

    protected T[] N(int i) {
        return (T[]) new Object[i];
    }

    public final boolean SN(T t) {
        if (t == null) {
            return false;
        }
        T[] tArr = this.SN[zH(t)];
        T t2 = null;
        if (tArr != null) {
            int length = tArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    T t3 = tArr[i];
                    if (t3 == null) {
                        break;
                    } else if (this.yq.b(t3, t)) {
                        t2 = t3;
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        return t2 != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        return i(t) == t;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (T t : collection) {
            if (i(t) != t) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.SN = tF(16);
        this.N = 0;
        this.tF = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return SN(yq(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0029, code lost:
        continue;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection<?> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.github.catvod.spider.merge.wD
            r1 = 0
            if (r0 == 0) goto L2c
            com.github.catvod.spider.merge.wD r8 = (com.github.catvod.spider.merge.wD) r8
            T[][] r8 = r8.SN
            int r0 = r8.length
            r2 = 0
        Lb:
            if (r2 >= r0) goto L45
            r3 = r8[r2]
            if (r3 != 0) goto L12
            goto L29
        L12:
            int r4 = r3.length
            r5 = 0
        L14:
            if (r5 >= r4) goto L29
            r6 = r3[r5]
            if (r6 != 0) goto L1b
            goto L29
        L1b:
            java.lang.Object r6 = r7.yq(r6)
            boolean r6 = r7.SN(r6)
            if (r6 != 0) goto L26
            return r1
        L26:
            int r5 = r5 + 1
            goto L14
        L29:
            int r2 = r2 + 1
            goto Lb
        L2c:
            java.util.Iterator r8 = r8.iterator()
        L30:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r8.next()
            java.lang.Object r0 = r7.yq(r0)
            boolean r0 = r7.SN(r0)
            if (r0 != 0) goto L30
            return r1
        L45:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.wD.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wD)) {
            return false;
        }
        wD wDVar = (wD) obj;
        if (wDVar.N != this.N) {
            return false;
        }
        return containsAll(wDVar);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        T[][] tArr;
        int i = 0;
        for (T[] tArr2 : this.SN) {
            if (tArr2 != null) {
                for (T t : tArr2) {
                    if (t == null) {
                        break;
                    }
                    i = A4.Gc(i, this.yq.Zm(t));
                }
            }
        }
        return A4.zH(i, this.N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T i(T t) {
        T[] tArr;
        int i = 0;
        if (this.N > this.tF) {
            T[][] tArr2 = this.SN;
            int length = tArr2.length * 2;
            T[][] tF = tF(length);
            int[] iArr = new int[tF.length];
            this.SN = tF;
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.tF = (int) (d * 0.75d);
            for (T[] tArr3 : tArr2) {
                if (tArr3 != null) {
                    for (T t2 : tArr3) {
                        if (t2 == null) {
                            break;
                        }
                        int zH = zH(t2);
                        int i2 = iArr[zH];
                        if (i2 == 0) {
                            tArr = N(this.zH);
                            tF[zH] = tArr;
                        } else {
                            tArr = tF[zH];
                            if (i2 == tArr.length) {
                                tArr = (T[]) Arrays.copyOf(tArr, tArr.length * 2);
                                tF[zH] = tArr;
                            }
                        }
                        tArr[i2] = t2;
                        iArr[zH] = iArr[zH] + 1;
                    }
                }
            }
        }
        int zH2 = zH(t);
        T[] tArr4 = this.SN[zH2];
        if (tArr4 != null) {
            while (true) {
                if (i >= tArr4.length) {
                    int length2 = tArr4.length;
                    Object[] copyOf = Arrays.copyOf(tArr4, tArr4.length * 2);
                    this.SN[zH2] = copyOf;
                    copyOf[length2] = t;
                    break;
                }
                T t3 = tArr4[i];
                if (t3 == null) {
                    tArr4[i] = t;
                    break;
                } else if (this.yq.b(t3, t)) {
                    return t3;
                } else {
                    i++;
                }
            }
        } else {
            T[] N = N(this.zH);
            N[0] = t;
            this.SN[zH2] = N;
        }
        this.N++;
        return t;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.N == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new yq(toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return t0(yq(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= t0(yq(it.next()));
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        T[][] tArr;
        boolean z = false;
        int i = 0;
        for (T[] tArr2 : this.SN) {
            if (tArr2 != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < tArr2.length && tArr2[i2] != null) {
                    if (collection.contains(tArr2[i2])) {
                        if (i2 != i3) {
                            tArr2[i3] = tArr2[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    tArr2[i3] = null;
                    i3++;
                }
            }
        }
        if (i != this.N) {
            z = true;
        }
        this.N = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.N;
    }

    public final boolean t0(T t) {
        T t2;
        if (t == null) {
            return false;
        }
        T[] tArr = this.SN[zH(t)];
        if (tArr == null) {
            return false;
        }
        for (int i = 0; i < tArr.length && (t2 = tArr[i]) != null; i++) {
            if (this.yq.b(t2, t)) {
                System.arraycopy(tArr, i + 1, tArr, i, (tArr.length - i) - 1);
                tArr[tArr.length - 1] = null;
                this.N--;
                return true;
            }
        }
        return false;
    }

    protected T[][] tF(int i) {
        return (T[][]) new Object[i];
    }

    @Override // java.util.Set, java.util.Collection
    public final T[] toArray() {
        T[][] tArr;
        T[] N = N(this.N);
        int i = 0;
        for (T[] tArr2 : this.SN) {
            if (tArr2 != null) {
                for (T t : tArr2) {
                    if (t == null) {
                        break;
                    }
                    i++;
                    N[i] = t;
                }
            }
        }
        return N;
    }

    public final String toString() {
        T[][] tArr;
        if (this.N == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (T[] tArr2 : this.SN) {
            if (tArr2 != null) {
                for (T t : tArr2) {
                    if (t == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(t.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected T yq(Object obj) {
        return obj;
    }

    protected final int zH(T t) {
        return this.yq.Zm(t) & (this.SN.length - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final <U> U[] toArray(U[] uArr) {
        T[][] tArr;
        int length = uArr.length;
        int i = this.N;
        if (length < i) {
            uArr = (U[]) Arrays.copyOf(uArr, i);
        }
        int i2 = 0;
        for (T[] tArr2 : this.SN) {
            if (tArr2 != null) {
                for (T t : tArr2) {
                    if (t == null) {
                        break;
                    }
                    i2++;
                    uArr[i2] = t;
                }
            }
        }
        return uArr;
    }
}
