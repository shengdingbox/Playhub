package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.github.catvod.spider.merge.rS  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0172rS {
    protected final Map<Bp, Bp> yq = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<com.github.catvod.spider.merge.Bp, com.github.catvod.spider.merge.Bp>, java.util.HashMap] */
    public final Bp yq(Bp bp) {
        hB hBVar = Bp.SN;
        if (bp == hBVar) {
            return hBVar;
        }
        Bp bp2 = (Bp) this.yq.get(bp);
        if (bp2 != null) {
            return bp2;
        }
        this.yq.put(bp, bp);
        return bp;
    }
}
