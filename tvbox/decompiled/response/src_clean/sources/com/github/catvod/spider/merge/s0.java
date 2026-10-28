package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class s0 implements T9 {
    @Override // com.github.catvod.spider.merge.T9
    public final String name() {
        return "allText";
    }

    @Override // com.github.catvod.spider.merge.T9
    public final C0066Le yq(L1 l1) {
        LinkedList linkedList = new LinkedList();
        Iterator<hN> it = l1.yq().iterator();
        while (it.hasNext()) {
            hN next = it.next();
            linkedList.add("script".equals(next.v()) ? next.lF() : next.Fo());
        }
        return new C0066Le(linkedList);
    }
}
