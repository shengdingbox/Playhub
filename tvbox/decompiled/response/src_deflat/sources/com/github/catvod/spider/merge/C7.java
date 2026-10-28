package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C7 implements AbstractC0079a {
    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final String name() {
        return "ancestor";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final C0066Le yq(kB kBVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<hN> it = kBVar.iterator();
        while (it.hasNext()) {
            linkedList.addAll(it.next().Cu());
        }
        return new C0066Le(new kB(linkedList));
    }
}
