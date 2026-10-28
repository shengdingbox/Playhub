package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0162pa;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class PA {

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq extends IllegalStateException {
        public yq(String str) {
            super(str);
        }

        public yq(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    public static hN yq(String str, hN hNVar) {
        li.KJ(str);
        return new C0162pa.SN(xq.KJ(str)).yq(hNVar, hNVar);
    }
}
