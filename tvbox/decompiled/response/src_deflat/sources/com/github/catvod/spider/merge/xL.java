package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Va;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class xL extends AbstractC0161pY {
    public xL(String str, String str2, String str3) {
        String str4;
        li.B(str);
        li.B(str2);
        li.B(str3);
        super.g("name", str);
        super.g("publicId", str2);
        super.g("systemId", str3);
        if (Fz("publicId")) {
            str4 = "PUBLIC";
        } else if (Fz("systemId")) {
            str4 = "SYSTEM";
        } else {
            return;
        }
        super.g("pubSysKey", str4);
    }

    private boolean Fz(String str) {
        return !P1.tF(super.N(str));
    }

    @Override // com.github.catvod.spider.merge.AbstractC0161pY, com.github.catvod.spider.merge.MA
    public final MA B() {
        return this;
    }

    public final void E1(String str) {
        if (str != null) {
            super.g("pubSysKey", str);
        }
    }

    @Override // com.github.catvod.spider.merge.MA
    final void Gd(Appendable appendable, int i, Va.yq yqVar) {
    }

    @Override // com.github.catvod.spider.merge.AbstractC0161pY, com.github.catvod.spider.merge.MA
    public final /* bridge */ /* synthetic */ int t0() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.MA
    public final String v() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.MA
    final void xa(Appendable appendable, int i, Va.yq yqVar) {
        if (this.SN > 0 && yqVar.t0()) {
            appendable.append('\n');
        }
        appendable.append((yqVar.Gc() != 1 || Fz("publicId") || Fz("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (Fz("name")) {
            appendable.append(" ").append(super.N("name"));
        }
        if (Fz("pubSysKey")) {
            appendable.append(" ").append(super.N("pubSysKey"));
        }
        if (Fz("publicId")) {
            appendable.append(" \"").append(super.N("publicId")).append('\"');
        }
        if (Fz("systemId")) {
            appendable.append(" \"").append(super.N("systemId")).append('\"');
        }
        appendable.append('>');
    }
}
