package com.github.catvod.spider.merge;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class rd<E> extends E3<E> implements List<E>, RandomAccess {
    public static final /* synthetic */ int N = 0;
    private static final O9<Object> SN = new yq(DS.i, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class SN extends rd<E> {
        final transient int tF;
        final transient int zH;

        SN(int i, int i2) {
            this.tF = i;
            this.zH = i2;
        }

        @Override // com.github.catvod.spider.merge.rd
        /* renamed from: Gc */
        public final rd<E> subList(int i, int i2) {
            C0072So.zH(i, i2, this.zH);
            rd rdVar = rd.this;
            int i3 = this.tF;
            return rdVar.subList(i + i3, i2 + i3);
        }

        @Override // com.github.catvod.spider.merge.E3
        final int N() {
            return rd.this.tF() + this.tF + this.zH;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.E3
        public final Object[] SN() {
            return rd.this.SN();
        }

        @Override // java.util.List
        public final E get(int i) {
            C0072So.N(i, this.zH);
            return rd.this.get(i + this.tF);
        }

        @Override // com.github.catvod.spider.merge.rd, com.github.catvod.spider.merge.E3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.github.catvod.spider.merge.rd, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.github.catvod.spider.merge.rd, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.zH;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.github.catvod.spider.merge.E3
        public final int tF() {
            return rd.this.tF() + this.tF;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq<E> extends nQ<E> {
        private final rd<E> N;

        yq(rd<E> rdVar, int i) {
            super(rdVar.size(), i);
            this.N = rdVar;
        }

        @Override // com.github.catvod.spider.merge.nQ
        protected final E SN(int i) {
            return this.N.get(i);
        }
    }

    public static <E> rd<E> i(E[] eArr) {
        if (eArr.length == 0) {
            return (rd<E>) DS.i;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            eb.yq(objArr[i], i);
        }
        int length2 = objArr.length;
        if (length2 == 0) {
            return (rd<E>) DS.i;
        }
        return new DS(objArr, length2);
    }

    /* renamed from: Gc */
    public rd<E> subList(int i, int i2) {
        C0072So.zH(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (rd<E>) DS.i;
        }
        return new SN(i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 != r6) goto L6
        L4:
            r0 = 1
            goto L5b
        L6:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto Lb
            goto L5b
        Lb:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
            goto L5b
        L18:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = 0
        L1d:
            if (r3 >= r2) goto L4
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.github.catvod.spider.merge.Ya.N(r4, r5)
            if (r4 != 0) goto L2e
            goto L5b
        L2e:
            int r3 = r3 + 1
            goto L1d
        L31:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L5b
        L46:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = com.github.catvod.spider.merge.Ya.N(r3, r4)
            if (r3 != 0) goto L39
            goto L5b
        L55:
            boolean r7 = r7.hasNext()
            r0 = r7 ^ 1
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.rd.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ((get(i2).hashCode() + (i * 31)) ^ (-1)) ^ (-1);
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.github.catvod.spider.merge.E3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: t0 */
    public final O9<E> listIterator(int i) {
        C0072So.tF(i, size());
        return isEmpty() ? (O9<E>) SN : new yq(this, i);
    }

    @Override // com.github.catvod.spider.merge.E3
    int yq(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[0 + i] = get(i);
        }
        return 0 + size;
    }

    @Override // com.github.catvod.spider.merge.E3
    public final x1<E> zH() {
        return listIterator(0);
    }
}
