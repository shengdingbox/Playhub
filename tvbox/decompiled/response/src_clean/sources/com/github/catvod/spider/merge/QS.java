package com.github.catvod.spider.merge;

import java.util.HashSet;
import java.util.Iterator;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class QS implements AbstractC0079a {
    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final String name() {
        return "descendant-or-self";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final C0066Le yq(kB kBVar) {
        HashSet hashSet = new HashSet();
        kB kBVar2 = new kB();
        Iterator<hN> it = kBVar.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().Q4());
        }
        kBVar2.addAll(hashSet);
        return new C0066Le(kBVar2);
    }
}
