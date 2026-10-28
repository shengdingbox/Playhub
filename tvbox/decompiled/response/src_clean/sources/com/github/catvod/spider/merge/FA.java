package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class FA {
    private String yq = C0065Ku.zH("playMode", "默认");
    private String SN = C0065Ku.zH("callPlayMode", "默认");
    private String N = C0065Ku.zH("proxyMode", "默认");
    private String tF = C0065Ku.zH("webdavMode", "默认");
    private String zH = C0065Ku.zH("browseMode", "默认");
    private boolean i = C0065Ku.yq("danMu", true);
    private boolean t0 = C0065Ku.yq("appYsc", false);

    public FA() {
        C0065Ku.zH("ad", "true");
        C0065Ku.zH("speedUp", "默认");
    }

    public final void Gc(boolean z) {
        this.i = z;
        C0065Ku.i("danMu", Boolean.valueOf(z));
    }

    public final String N() {
        return this.SN;
    }

    public final String SN() {
        return this.zH;
    }

    public final String i() {
        return this.N;
    }

    public final String t0() {
        return this.tF;
    }

    public final boolean tF() {
        return this.i;
    }

    public final boolean yq() {
        return this.t0;
    }

    public final String zH() {
        return this.yq;
    }
}
