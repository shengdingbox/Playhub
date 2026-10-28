package com.github.catvod.spider.merge;

import java.util.Iterator;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class KU implements AbstractC0079a {
    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final String name() {
        return "child";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0079a
    public final C0066Le yq(kB kBVar) {
        kB kBVar2 = new kB();
        Iterator<hN> it = kBVar.iterator();
        while (it.hasNext()) {
            kBVar2.addAll(it.next().J());
        }
        return new C0066Le(kBVar2);
    }
}
