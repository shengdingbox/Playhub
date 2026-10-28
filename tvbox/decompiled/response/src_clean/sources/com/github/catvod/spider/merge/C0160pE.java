package com.github.catvod.spider.merge;
/* renamed from: com.github.catvod.spider.merge.pE  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class C0160pE<E> extends AbstractC0082am<E> {
    final transient E N;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0160pE(E e) {
        this.N = e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.N.equals(obj);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0082am, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.N.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.N.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.E3
    final int yq(Object[] objArr) {
        objArr[0] = this.N;
        return 1;
    }

    @Override // com.github.catvod.spider.merge.E3
    /* renamed from: zH */
    public final x1<E> iterator() {
        return new ak(this.N);
    }
}
