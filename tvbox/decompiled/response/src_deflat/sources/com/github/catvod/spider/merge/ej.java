package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class ej implements AbstractC0079a {
    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final String name() {
        return "parent";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final C0066Le yq(kB kBVar) {
        LinkedList linkedList = new LinkedList();
        kB kBVar2 = new kB();
        Iterator<hN> it = kBVar.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().L());
        }
        kBVar2.addAll(linkedList);
        return new C0066Le(kBVar2);
    }
}
