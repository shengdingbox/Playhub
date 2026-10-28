package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class fU<E> extends AbstractC0082am<E> {
    private static final Object[] Gc;
    static final fU<Object> M;
    final transient Object[] N;
    private final transient int i;
    private final transient int t0;
    private final transient int tF;
    final transient Object[] zH;

    static {
        Object[] objArr = new Object[0];
        Gc = objArr;
        M = new fU<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fU(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.N = objArr;
        this.tF = i;
        this.zH = objArr2;
        this.i = i2;
        this.t0 = i3;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0082am
    final rd<E> M() {
        Object[] objArr = this.N;
        int i = this.t0;
        int i2 = rd.N;
        if (i == 0) {
            return (rd<E>) DS.i;
        }
        return new DS(objArr, i);
    }

    @Override // com.github.catvod.spider.merge.E3
    final int N() {
        return this.t0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.E3
    public final Object[] SN() {
        return this.N;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.zH;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int G = li.G(obj.hashCode());
        while (true) {
            int i = G & this.i;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            G = i + 1;
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0082am, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.tF;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.t0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.E3
    public final int tF() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.E3
    final int yq(Object[] objArr) {
        System.arraycopy(this.N, 0, objArr, 0, this.t0);
        return this.t0 + 0;
    }

    @Override // com.github.catvod.spider.merge.E3
    /* renamed from: zH */
    public final x1<E> iterator() {
        return i().listIterator(0);
    }
}
