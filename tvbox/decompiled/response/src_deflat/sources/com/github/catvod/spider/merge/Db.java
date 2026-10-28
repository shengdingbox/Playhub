package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Db {
    public String N;
    public int SN;
    public int yq;

    public Db(int i, int i2, String str) {
        this.yq = i;
        this.SN = i2;
        this.N = str;
    }

    public final String toString() {
        StringBuilder yq = by.yq("TaskTemplate{template_width=");
        yq.append(this.yq);
        yq.append(", template_height=");
        yq.append(this.SN);
        yq.append(", url='");
        yq.append(this.N);
        yq.append('\'');
        yq.append('}');
        return yq.toString();
    }
}
