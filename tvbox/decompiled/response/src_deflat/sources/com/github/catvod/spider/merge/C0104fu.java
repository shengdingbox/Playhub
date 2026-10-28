package com.github.catvod.spider.merge;

import java.util.List;
import java.util.Objects;
/* renamed from: com.github.catvod.spider.merge.fu  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0104fu {
    private Object yq;

    public C0104fu(Object obj) {
        this.yq = obj;
    }

    public final C0104fu SN(String str) {
        List<C0104fu> yq = !(this.yq instanceof hN) ? null : new q3(new kB((hN) this.yq)).yq(str);
        if (yq == null || yq.size() <= 0) {
            return null;
        }
        return yq.get(0);
    }

    public final String toString() {
        return yq();
    }

    public final String yq() {
        Object obj = this.yq;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof hN)) {
            return String.valueOf(obj);
        }
        hN hNVar = (hN) obj;
        return Objects.equals(hNVar.tl(), "JX_TEXT") ? hNVar.kR() : hNVar.ee();
    }
}
