package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class op implements AbstractC0079a {
    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final String name() {
        return "following";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final C0066Le yq(kB kBVar) {
        LinkedList linkedList = new LinkedList();
        Iterator<hN> it = kBVar.iterator();
        while (it.hasNext()) {
            hN next = it.next();
            Iterator<hN> it2 = next.Cu().iterator();
            while (it2.hasNext()) {
                kB M = aq.M(it2.next());
                if (M != null) {
                    Iterator<hN> it3 = M.iterator();
                    while (it3.hasNext()) {
                        linkedList.addAll(it3.next().Q4());
                    }
                }
            }
            kB M2 = aq.M(next);
            if (M2 != null) {
                Iterator<hN> it4 = M2.iterator();
                while (it4.hasNext()) {
                    linkedList.addAll(it4.next().Q4());
                }
            }
        }
        return new C0066Le(new kB(linkedList));
    }
}
