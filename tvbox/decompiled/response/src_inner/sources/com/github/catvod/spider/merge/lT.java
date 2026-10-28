package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class lT<K, V> implements Map<K, V> {
    protected final Hj yq;
    protected int N = 0;
    protected int tF = 12;
    protected LinkedList<yq<K, V>>[] SN = new LinkedList[8];

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq<K, V> {
        public V SN;
        public final K yq;

        public yq(K k, V v) {
            this.yq = k;
            this.SN = v;
        }

        public final String toString() {
            return this.yq.toString() + ":" + this.SN.toString();
        }
    }

    public lT(Hj hj) {
        this.yq = hj;
    }

    @Override // java.util.Map
    public final void clear() {
        this.SN = new LinkedList[16];
        this.N = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int Zm = this.yq.Zm(obj);
        LinkedList<yq<K, V>>[] linkedListArr = this.SN;
        LinkedList<yq<K, V>> linkedList = linkedListArr[Zm & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        Iterator<yq<K, V>> it = linkedList.iterator();
        while (it.hasNext()) {
            yq<K, V> next = it.next();
            if (this.yq.b(next.yq, obj)) {
                return next.SN;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        LinkedList<yq<K, V>>[] linkedListArr;
        yq<K, V> next;
        int i = 0;
        for (LinkedList<yq<K, V>> linkedList : this.SN) {
            if (linkedList != null) {
                Iterator<yq<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    i = A4.Gc(i, this.yq.Zm(next.yq));
                }
            }
        }
        return A4.zH(i, this.N);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.N == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        yq<K, V> next;
        if (k == null) {
            return null;
        }
        if (this.N > this.tF) {
            LinkedList<yq<K, V>>[] linkedListArr = this.SN;
            int length = linkedListArr.length * 2;
            this.SN = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.tF = (int) (d * 0.75d);
            int i = this.N;
            for (LinkedList<yq<K, V>> linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator<yq<K, V>> it = linkedList.iterator();
                    while (it.hasNext() && (next = it.next()) != null) {
                        put(next.yq, next.SN);
                    }
                }
            }
            this.N = i;
        }
        int Zm = this.yq.Zm(k);
        LinkedList<yq<K, V>>[] linkedListArr2 = this.SN;
        int length2 = Zm & (linkedListArr2.length - 1);
        LinkedList<yq<K, V>> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList<>();
            linkedListArr2[length2] = linkedList2;
        }
        Iterator<yq<K, V>> it2 = linkedList2.iterator();
        while (it2.hasNext()) {
            yq<K, V> next2 = it2.next();
            if (this.yq.b(next2.yq, k)) {
                V v2 = next2.SN;
                next2.SN = v;
                this.N++;
                return v2;
            }
        }
        linkedList2.add(new yq<>(k, v));
        this.N++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.N;
    }

    public final String toString() {
        LinkedList<yq<K, V>>[] linkedListArr;
        yq<K, V> next;
        if (this.N == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (LinkedList<yq<K, V>> linkedList : this.SN) {
            if (linkedList != null) {
                Iterator<yq<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(next.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        LinkedList<yq<K, V>>[] linkedListArr;
        ArrayList arrayList = new ArrayList(this.N);
        for (LinkedList<yq<K, V>> linkedList : this.SN) {
            if (linkedList != null) {
                Iterator<yq<K, V>> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().SN);
                }
            }
        }
        return arrayList;
    }
}
