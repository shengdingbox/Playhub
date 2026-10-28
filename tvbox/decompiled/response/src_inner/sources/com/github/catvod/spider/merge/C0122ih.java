package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: com.github.catvod.spider.merge.ih  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class C0122ih<T> implements Iterator<T> {
    private int SN;
    private final T[] yq;

    public C0122ih(T[] tArr) {
        aq.zH(tArr, "array");
        this.yq = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.SN < this.yq.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.yq;
            int i = this.SN;
            this.SN = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.SN--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
