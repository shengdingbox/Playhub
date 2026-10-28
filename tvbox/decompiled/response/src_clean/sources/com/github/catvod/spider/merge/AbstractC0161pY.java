package com.github.catvod.spider.merge;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.pY  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0161pY extends MA {
    Object tF;

    private void U() {
        Object obj = this.tF;
        if (!(obj instanceof fx)) {
            fx fxVar = new fx();
            this.tF = fxVar;
            if (obj != null) {
                fxVar.Gd(v(), (String) obj);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.MA
    public MA B() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.MA
    public final List<MA> G() {
        return MA.N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String H() {
        return N(v());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.MA
    public final MA KJ(MA ma) {
        AbstractC0161pY pYVar = (AbstractC0161pY) super.KJ(ma);
        Object obj = this.tF;
        if (obj instanceof fx) {
            pYVar.tF = ((fx) obj).clone();
        }
        return pYVar;
    }

    @Override // com.github.catvod.spider.merge.MA
    public String N(String str) {
        return !(this.tF instanceof fx) ? v().equals(str) ? (String) this.tF : "" : super.N(str);
    }

    @Override // com.github.catvod.spider.merge.MA
    protected final boolean dT() {
        return this.tF instanceof fx;
    }

    public MA g(String str, String str2) {
        if ((this.tF instanceof fx) || !str.equals("#doctype")) {
            U();
            tF().Nl(iK.yq(this).zH().SN(str), str2);
        } else {
            this.tF = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.MA
    protected final void q(String str) {
    }

    @Override // com.github.catvod.spider.merge.MA
    public int t0() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.MA
    public final fx tF() {
        U();
        return (fx) this.tF;
    }

    @Override // com.github.catvod.spider.merge.MA
    public String yq(String str) {
        U();
        return super.yq(str);
    }

    @Override // com.github.catvod.spider.merge.MA
    public String zH() {
        MA ma = this.yq;
        return ma != null ? ma.zH() : "";
    }
}
