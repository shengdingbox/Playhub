package com.github.catvod.spider.merge;

import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Cr implements AbstractC0101fM {
    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final String name() {
        return "concat";
    }

    @Override // com.github.catvod.spider.merge.AbstractC0101fM
    public final C0066Le yq(L1 l1, List<C0066Le> list) {
        StringBuilder sb = new StringBuilder();
        for (C0066Le le : list) {
            sb.append(le.t0());
        }
        return new C0066Le(sb.toString());
    }
}
