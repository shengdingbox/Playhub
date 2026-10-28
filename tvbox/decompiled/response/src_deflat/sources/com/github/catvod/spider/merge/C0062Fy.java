package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Va;
/* renamed from: com.github.catvod.spider.merge.Fy  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0062Fy extends AbstractC0161pY {
    public C0062Fy(String str) {
        this.tF = str;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0161pY, com.github.catvod.spider.merge.MA
    public final MA B() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.MA
    final void Gd(Appendable appendable, int i, Va.yq yqVar) {
    }

    @Override // com.github.catvod.spider.merge.MA
    public final MA M() {
        return (C0062Fy) super.clone();
    }

    @Override // com.github.catvod.spider.merge.MA
    public final Object clone() {
        return (C0062Fy) super.clone();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0161pY, com.github.catvod.spider.merge.MA
    public final /* bridge */ /* synthetic */ int t0() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.MA
    public final String toString() {
        return ee();
    }

    @Override // com.github.catvod.spider.merge.MA
    public final String v() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.merge.MA
    final void xa(Appendable appendable, int i, Va.yq yqVar) {
        if (yqVar.t0() && this.SN == 0) {
            MA ma = this.yq;
            if ((ma instanceof hN) && ((hN) ma).I().yq()) {
                v3(appendable, i, yqVar);
            }
        }
        appendable.append("<!--").append(H()).append("-->");
    }
}
