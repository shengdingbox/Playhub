package com.github.catvod.spider.merge;

import java.util.Objects;
/* renamed from: com.github.catvod.spider.merge.my  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0150my {
    private String SN;
    private String yq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0150my(q2 q2Var, String str) {
        Objects.requireNonNull(q2Var);
        this.yq = q2Var.xa();
        this.SN = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0150my(q2 q2Var, String str, Object... objArr) {
        Objects.requireNonNull(q2Var);
        this.yq = q2Var.xa();
        this.SN = String.format(str, objArr);
    }

    public final String toString() {
        StringBuilder yq = by.yq("<");
        yq.append(this.yq);
        yq.append(">: ");
        yq.append(this.SN);
        return yq.toString();
    }
}
