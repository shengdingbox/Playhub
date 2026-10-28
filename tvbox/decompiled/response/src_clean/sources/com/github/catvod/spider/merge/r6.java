package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class r6 {
    public static final r6 N = new r6(false, false);
    public static final r6 tF = new r6(true, true);
    private final boolean SN;
    private final boolean yq;

    public r6(boolean z, boolean z2) {
        this.yq = z;
        this.SN = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String yq(String str) {
        return eb.zH(str.trim());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fx N(fx fxVar) {
        if (fxVar != null && !this.SN) {
            fxVar.g9();
        }
        return fxVar;
    }

    public final String SN(String str) {
        String trim = str.trim();
        return !this.SN ? eb.zH(trim) : trim;
    }

    public final boolean i() {
        return this.yq;
    }

    public final String tF(String str) {
        String trim = str.trim();
        return !this.yq ? eb.zH(trim) : trim;
    }

    public final boolean zH() {
        return this.SN;
    }
}
