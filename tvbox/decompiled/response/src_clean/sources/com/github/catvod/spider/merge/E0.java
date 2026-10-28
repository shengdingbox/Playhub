package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class E0 implements AbstractC0079a {
    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final String name() {
        return "preceding";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final C0066Le yq(kB kBVar) {
        kB kBVar2 = new kB();
        LinkedList linkedList = new LinkedList();
        Iterator<hN> it = kBVar.iterator();
        while (it.hasNext()) {
            hN next = it.next();
            Iterator<hN> it2 = next.Cu().iterator();
            while (it2.hasNext()) {
                kB v3 = aq.v3(it2.next());
                if (v3 != null) {
                    linkedList.addAll(v3);
                }
            }
            kB v32 = aq.v3(next);
            if (v32 != null) {
                linkedList.addAll(v32);
            }
        }
        kBVar2.addAll(linkedList);
        return new C0066Le(kBVar2);
    }
}
