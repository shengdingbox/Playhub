package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0159p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Q4 implements C0159p.yq {
    @Override // com.github.catvod.spider.merge.C0159p.yq
    public final int size() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.C0159p.yq
    public final int yq(char[] cArr, int i) {
        return (cArr[i + 1] << 16) | cArr[i];
    }
}
