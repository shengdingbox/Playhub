package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class QZ implements T9 {
    @Override // com.github.catvod.spider.merge.T9
    public final String name() {
        return "html";
    }

    @Override // com.github.catvod.spider.merge.T9
    public final C0066Le yq(L1 l1) {
        LinkedList linkedList = new LinkedList();
        Iterator<hN> it = l1.yq().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().mG());
        }
        return new C0066Le(linkedList);
    }
}
