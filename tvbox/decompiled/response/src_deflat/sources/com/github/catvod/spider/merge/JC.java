package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class JC implements AbstractC0101fM {
    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final String name() {
        return "substring-after-last";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final C0066Le yq(L1 l1, List<C0066Le> list) {
        int lastIndexOf;
        LinkedList linkedList = (LinkedList) list;
        String t0 = ((C0066Le) linkedList.get(0)).t0();
        String t02 = ((C0066Le) linkedList.get(1)).t0();
        if (!Mw.N(t0)) {
            t0 = (Mw.N(t02) || (lastIndexOf = t0.lastIndexOf(t02)) == -1 || lastIndexOf == t0.length() - t02.length()) ? "" : t0.substring(t02.length() + lastIndexOf);
        }
        return new C0066Le(t0);
    }
}
