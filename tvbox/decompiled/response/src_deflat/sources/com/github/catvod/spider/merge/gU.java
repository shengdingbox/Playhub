package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class gU {
    @SerializedName("lang")
    private String N;
    @SerializedName("name")
    private String SN;
    @SerializedName("data")
    private String i;
    @SerializedName("format")
    private String tF;
    @SerializedName("url")
    private String yq;
    @SerializedName("selected")
    private boolean zH;

    public final gU N(String str) {
        this.SN = str;
        return this;
    }

    public final gU SN(String str) {
        Objects.requireNonNull(str);
        char c = 65535;
        switch (str.hashCode()) {
            case 96897:
                if (str.equals("ass")) {
                    c = 0;
                    break;
                }
                break;
            case 114177:
                if (str.equals("ssa")) {
                    c = 1;
                    break;
                }
                break;
            case 117110:
                if (str.equals("vtt")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case ProxyOrigin.Gc /* 0 */:
            case 1:
                this.tF = "text/x-ssa";
                return this;
            case 2:
                this.tF = "text/vtt";
                return this;
            default:
                this.tF = "application/x-subrip";
                return this;
        }
    }

    public final gU tF() {
        this.zH = true;
        return this;
    }

    public final gU yq(String str) {
        this.i = str;
        return this;
    }

    public final gU zH(String str) {
        this.yq = str;
        return this;
    }
}
