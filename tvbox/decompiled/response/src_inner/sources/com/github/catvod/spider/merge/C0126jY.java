package com.github.catvod.spider.merge;

import java.util.function.Supplier;
/* renamed from: com.github.catvod.spider.merge.jY  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class C0126jY implements Supplier {
    public final /* synthetic */ Object[] SN;
    public final /* synthetic */ String yq;

    public /* synthetic */ C0126jY(String str, Object[] objArr) {
        this.yq = str;
        this.SN = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.yq, this.SN);
    }
}
