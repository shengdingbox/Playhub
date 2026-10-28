package com.github.catvod.spider.merge;

import java.util.function.BinaryOperator;
/* renamed from: com.github.catvod.spider.merge.qq  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class C0168qq implements BinaryOperator {
    public static final /* synthetic */ C0168qq yq = new C0168qq();

    private /* synthetic */ C0168qq() {
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Double.valueOf(((Double) obj2).doubleValue() + ((Double) obj).doubleValue());
    }
}
