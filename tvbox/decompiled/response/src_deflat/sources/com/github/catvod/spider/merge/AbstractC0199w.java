package com.github.catvod.spider.merge;

import java.util.UUID;
/* renamed from: com.github.catvod.spider.merge.w  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0199w {
    public static final QY N;
    protected final C0172rS SN;
    public final N0 yq;

    static {
        UUID uuid = C0159p.i;
        UUID uuid2 = C0159p.i;
        QY qy = new QY(new i3(true));
        N = qy;
        qy.yq = Integer.MAX_VALUE;
    }

    public AbstractC0199w(N0 n0, C0172rS rSVar) {
        this.yq = n0;
        this.SN = rSVar;
    }

    public abstract void yq();
}
