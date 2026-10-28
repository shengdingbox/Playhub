package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class s8 implements AbstractC0101fM {
    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final String name() {
        return "contains";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final C0066Le yq(L1 l1, List<C0066Le> list) {
        LinkedList linkedList = (LinkedList) list;
        return new C0066Le(Boolean.valueOf(((C0066Le) linkedList.get(0)).t0().contains(((C0066Le) linkedList.get(1)).t0())));
    }
}
