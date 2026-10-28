package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class YG implements AbstractC0101fM {
    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final String name() {
        return "substring-after";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final C0066Le yq(L1 l1, List<C0066Le> list) {
        int indexOf;
        LinkedList linkedList = (LinkedList) list;
        String t0 = ((C0066Le) linkedList.get(0)).t0();
        String t02 = ((C0066Le) linkedList.get(1)).t0();
        if (!Mw.N(t0)) {
            t0 = (t02 == null || (indexOf = t0.indexOf(t02)) == -1) ? "" : t0.substring(t02.length() + indexOf);
        }
        return new C0066Le(t0);
    }
}
