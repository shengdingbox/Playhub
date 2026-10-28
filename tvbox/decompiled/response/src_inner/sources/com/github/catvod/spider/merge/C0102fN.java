package com.github.catvod.spider.merge;

import java.util.Queue;
/* renamed from: com.github.catvod.spider.merge.fN  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0102fN implements a9 {
    Queue<zF> N;
    GR SN;
    String yq;

    public C0102fN(GR gr, Queue<zF> queue) {
        this.SN = gr;
        this.yq = gr.getName();
        this.N = queue;
    }

    @Override // com.github.catvod.spider.merge.a9
    public final String getName() {
        return this.yq;
    }

    @Override // com.github.catvod.spider.merge.a9
    public final void yq(String str, Throwable th) {
        zF zFVar = new zF();
        System.currentTimeMillis();
        zFVar.yq = this.SN;
        Thread.currentThread().getName();
        this.N.add(zFVar);
    }
}
