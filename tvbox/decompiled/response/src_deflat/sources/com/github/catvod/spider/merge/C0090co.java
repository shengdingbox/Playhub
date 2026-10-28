package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;
/* renamed from: com.github.catvod.spider.merge.co  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0090co implements AbstractC0101fM {
    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final String name() {
        return "not";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final C0066Le yq(L1 l1, List<C0066Le> list) {
        LinkedList linkedList = (LinkedList) list;
        if (linkedList.size() == 1) {
            return new C0066Le(Boolean.valueOf(!((C0066Le) linkedList.get(0)).yq().booleanValue()));
        }
        throw new B1("error param in not(bool) function.Please check.");
    }
}
