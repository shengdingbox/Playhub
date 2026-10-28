package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class DL implements AbstractC0101fM {
    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final String name() {
        return "substring-ex";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final C0066Le yq(L1 l1, List<C0066Le> list) {
        LinkedList linkedList = (LinkedList) list;
        String t0 = ((C0066Le) linkedList.get(0)).t0();
        int intValue = ((C0066Le) linkedList.get(1)).i().intValue();
        if (linkedList.get(2) != null) {
            return new C0066Le(Mw.KJ(t0, intValue, ((C0066Le) linkedList.get(2)).i().intValue()));
        }
        return new C0066Le(Mw.M(t0, intValue));
    }
}
