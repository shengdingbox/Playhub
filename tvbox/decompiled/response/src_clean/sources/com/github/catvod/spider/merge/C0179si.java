package com.github.catvod.spider.merge;

import java.util.LinkedList;
import java.util.List;
/* renamed from: com.github.catvod.spider.merge.si  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0179si implements AbstractC0101fM {
    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final String name() {
        return "string-length";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final C0066Le yq(L1 l1, List<C0066Le> list) {
        LinkedList linkedList = (LinkedList) list;
        if (linkedList.size() == 0) {
            return new C0066Le(0);
        }
        return new C0066Le(Integer.valueOf(((C0066Le) linkedList.get(0)).t0().length()));
    }
}
