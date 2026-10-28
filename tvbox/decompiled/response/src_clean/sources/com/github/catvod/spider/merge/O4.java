package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Va;
import java.io.IOException;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class O4 extends QE {
    public O4(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.QE, com.github.catvod.spider.merge.MA
    final void Gd(Appendable appendable, int i, Va.yq yqVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new Wy(e);
        }
    }

    /* renamed from: k */
    public final O4 clone() {
        return (O4) super.clone();
    }

    @Override // com.github.catvod.spider.merge.QE, com.github.catvod.spider.merge.MA
    public final String v() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.QE, com.github.catvod.spider.merge.MA
    final void xa(Appendable appendable, int i, Va.yq yqVar) {
        appendable.append("<![CDATA[").append(H());
    }
}
