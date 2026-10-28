package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class FN implements AbstractC0079a {
    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final String name() {
        return "preceding-sibling-one";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final C0066Le yq(kB kBVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<hN> it = kBVar.iterator();
        while (it.hasNext()) {
            hN next = it.next();
            if (next.u7() != null) {
                linkedList.add(next.u7());
            }
        }
        kB kBVar2 = new kB();
        kBVar2.addAll(linkedList);
        return new C0066Le(kBVar2);
    }
}
