package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.github.catvod.spider.merge.rQ  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0171rQ implements Pu {
    boolean yq = false;
    final Map<String, GR> SN = new HashMap();
    final LinkedBlockingQueue<zF> N = new LinkedBlockingQueue<>();

    public final LinkedBlockingQueue<zF> N() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.GR>] */
    public final void SN() {
        this.SN.clear();
        this.N.clear();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.GR>] */
    public final List<GR> tF() {
        return new ArrayList(this.SN.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.GR>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.GR>] */
    @Override // com.github.catvod.spider.merge.Pu
    public final synchronized a9 yq(String str) {
        GR gr;
        gr = (GR) this.SN.get(str);
        if (gr == null) {
            gr = new GR(str, this.N, this.yq);
            this.SN.put(str, gr);
        }
        return gr;
    }

    public final void zH() {
        this.yq = true;
    }
}
