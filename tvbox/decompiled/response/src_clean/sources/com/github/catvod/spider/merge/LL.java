package com.github.catvod.spider.merge;

import java.util.Iterator;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class LL implements T9 {
    @Override // com.github.catvod.spider.merge.T9
    public final String name() {
        return "node";
    }

    @Override // com.github.catvod.spider.merge.T9
    public final C0066Le yq(L1 l1) {
        kB kBVar = new kB();
        Iterator<hN> it = l1.yq().iterator();
        while (it.hasNext()) {
            hN next = it.next();
            kBVar.addAll(next.J());
            String kR = next.kR();
            if (Mw.tF(kR)) {
                hN hNVar = new hN("");
                hNVar.RQ(kR);
                kBVar.add(hNVar);
            }
        }
        return new C0066Le(kBVar);
    }
}
