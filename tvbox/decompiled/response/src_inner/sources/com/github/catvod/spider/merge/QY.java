package com.github.catvod.spider.merge;

import java.util.Arrays;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class QY {
    public yq[] Gc;
    public QY[] N;
    public i3 SN;
    public Uz i;
    public boolean t0;
    public boolean tF;
    public int yq;
    public int zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        public int SN;
        public r2 yq;

        public yq(r2 r2Var, int i) {
            this.SN = i;
            this.yq = r2Var;
        }

        public final String toString() {
            StringBuilder yq = by.yq("(");
            yq.append(this.yq);
            yq.append(", ");
            yq.append(this.SN);
            yq.append(")");
            return yq.toString();
        }
    }

    public QY() {
        this.yq = -1;
        this.SN = new i3(true);
        this.tF = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QY)) {
            return false;
        }
        return this.SN.equals(((QY) obj).SN);
    }

    public final int hashCode() {
        return A4.zH(A4.Gc(7, this.SN.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.yq);
        sb.append(":");
        sb.append(this.SN);
        if (this.tF) {
            sb.append("=>");
            yq[] yqVarArr = this.Gc;
            if (yqVarArr != null) {
                sb.append(Arrays.toString(yqVarArr));
            } else {
                sb.append(this.zH);
            }
        }
        return sb.toString();
    }

    public QY(i3 i3Var) {
        this.yq = -1;
        new i3(true);
        this.tF = false;
        this.SN = i3Var;
    }
}
