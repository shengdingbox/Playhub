package com.github.catvod.spider.merge;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class zT<K, V> {
    zT<K, V>.zH N;
    zT<K, V>.N SN;
    zT<K, V>.SN yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class N implements Set<K> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public N() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            zT.this.yq();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return zT.this.N(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            dU dUVar = dU.this;
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!dUVar.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return zT.zH(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i = 0;
            for (int i2 = dU.this.N - 1; i2 >= 0; i2--) {
                Object SN = zT.this.SN(i2, 0);
                i += SN == null ? 0 : SN.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return dU.this.N == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new yq(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            int N = zT.this.N(obj);
            if (N < 0) {
                return false;
            }
            zT.this.tF(N);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            dU dUVar = dU.this;
            int size = dUVar.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                dUVar.remove(it.next());
            }
            return size != dUVar.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            dU dUVar = dU.this;
            int size = dUVar.size();
            Iterator<K> it = dUVar.keySet().iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                }
            }
            return size != dUVar.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return dU.this.N;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            return zT.this.i(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) zT.this.t0(tArr, 0);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class SN implements Set<Map.Entry<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public SN() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int i = dU.this.N;
            for (Map.Entry<K, V> entry : collection) {
                dU.this.put(entry.getKey(), entry.getValue());
            }
            return i != dU.this.N;
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            zT.this.yq();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int N = zT.this.N(entry.getKey());
            if (N < 0) {
                return false;
            }
            return C0072So.Gc(zT.this.SN(N, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return zT.zH(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i = 0;
            for (int i2 = dU.this.N - 1; i2 >= 0; i2--) {
                Object SN = zT.this.SN(i2, 0);
                Object SN2 = zT.this.SN(i2, 1);
                i += (SN == null ? 0 : SN.hashCode()) ^ (SN2 == null ? 0 : SN2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return dU.this.N == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new tF();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return dU.this.N;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class tF implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        boolean N = false;
        int SN = -1;
        int yq;

        tF() {
            this.yq = dU.this.N - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.N) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C0072So.Gc(entry.getKey(), zT.this.SN(this.SN, 0)) && C0072So.Gc(entry.getValue(), zT.this.SN(this.SN, 1));
            }
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.N) {
                return (K) zT.this.SN(this.SN, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.N) {
                return (V) zT.this.SN(this.SN, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.SN < this.yq;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (this.N) {
                int i = 0;
                Object SN = zT.this.SN(this.SN, 0);
                Object SN2 = zT.this.SN(this.SN, 1);
                int hashCode = SN == null ? 0 : SN.hashCode();
                if (SN2 != null) {
                    i = SN2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.SN++;
                this.N = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.N) {
                zT.this.tF(this.SN);
                this.SN--;
                this.yq--;
                this.N = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.N) {
                zT zTVar = zT.this;
                int i = (this.SN << 1) + 1;
                Object[] objArr = dU.this.SN;
                V v2 = (V) objArr[i];
                objArr[i] = v;
                return v2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class yq<T> implements Iterator<T> {
        int N;
        int SN;
        boolean tF = false;
        final int yq;

        yq(int i) {
            this.yq = i;
            this.SN = dU.this.N;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.N < this.SN;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t = (T) zT.this.SN(this.N, this.yq);
                this.N++;
                this.tF = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.tF) {
                int i = this.N - 1;
                this.N = i;
                this.SN--;
                this.tF = false;
                zT.this.tF(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    final class zH implements Collection<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public zH() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            zT.this.yq();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return dU.this.Gc(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return dU.this.N == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new yq(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            int Gc = dU.this.Gc(obj);
            if (Gc < 0) {
                return false;
            }
            zT.this.tF(Gc);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            int i = dU.this.N;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(zT.this.SN(i2, 1))) {
                    zT.this.tF(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            int i = dU.this.N;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(zT.this.SN(i2, 1))) {
                    zT.this.tF(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return dU.this.N;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return zT.this.i(1);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) zT.this.t0(tArr, 1);
        }
    }

    public static <T> boolean zH(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    protected abstract int N(Object obj);

    protected abstract Object SN(int i, int i2);

    public final Object[] i(int i) {
        int i2 = dU.this.N;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = SN(i3, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] t0(T[] tArr, int i) {
        int i2 = dU.this.N;
        if (tArr.length < i2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = SN(i3, i);
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    protected abstract void tF(int i);

    protected abstract void yq();
}
