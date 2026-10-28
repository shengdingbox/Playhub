package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Uo implements AbstractC0079a {
    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final String name() {
        return "following-sibling-one";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final C0066Le yq(kB kBVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<hN> it = kBVar.iterator();
        while (it.hasNext()) {
            hN next = it.next();
            if (next.o() != null) {
                linkedList.add(next.o());
            }
        }
        kB kBVar2 = new kB();
        kBVar2.addAll(linkedList);
        return new C0066Le(kBVar2);
    }
}
