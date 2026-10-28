package com.github.catvod.spider.merge;

import java.util.NoSuchElementException;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class ak extends x1<Object> {
    final /* synthetic */ Object SN;
    boolean yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ak(Object obj) {
        this.SN = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.yq;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.yq) {
            this.yq = true;
            return this.SN;
        }
        throw new NoSuchElementException();
    }
}
