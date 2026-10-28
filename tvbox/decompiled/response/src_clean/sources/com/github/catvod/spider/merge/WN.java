package com.github.catvod.spider.merge;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;
import java.net.URLEncoder;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class WN {
    @SerializedName("authorization")
    private String Gc;
    private OkHttpSardine KJ;
    @SerializedName("webAuthorization")
    private String M;
    @SerializedName("user")
    private String N;
    @SerializedName("server")
    private String SN;
    @SerializedName("base_path")
    private String i;
    @SerializedName("search")
    private Boolean t0;
    @SerializedName("pass")
    private String tF;
    @SerializedName("name")
    private String yq;
    @SerializedName("path")
    private String zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    class yq extends TypeToken<List<WN>> {
        yq() {
        }
    }

    public WN(String str) {
        this.yq = str;
    }

    public static List<WN> yq(String str) {
        return (List) new Gson().fromJson(str, new yq().getType());
    }

    public final Boolean B() {
        Boolean bool = this.t0;
        return Boolean.valueOf(bool == null ? false : bool.booleanValue());
    }

    public final void G(String str) {
        this.i = str;
    }

    public final void G4(String str) {
        this.M = str;
    }

    public final String Gc() {
        return TextUtils.isEmpty(this.SN) ? "" : this.SN;
    }

    public final String KJ() {
        return TextUtils.isEmpty(this.M) ? "" : this.M;
    }

    public final String M() {
        return TextUtils.isEmpty(this.N) ? "" : this.N;
    }

    public final String N() {
        return (!TextUtils.isEmpty(this.i) && !this.i.equals("/")) ? this.i : "";
    }

    public final WN SN() {
        if (this.zH == null) {
            String path = Uri.parse(Gc()).getPath();
            if (TextUtils.isEmpty(path)) {
                path = "";
            }
            this.zH = path;
        }
        return this;
    }

    public final ME dT(DavResource davResource, String str) {
        return new ME(URLEncoder.encode(zH() + davResource.getPath()), davResource.getName(), str, Rc.v3(davResource.getContentLength().longValue()), davResource.isDirectory());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WN)) {
            return false;
        }
        return zH().equals(((WN) obj).zH());
    }

    public final String i() {
        return TextUtils.isEmpty(this.tF) ? "" : this.tF;
    }

    public final Sardine q() {
        if (this.KJ == null) {
            OkHttpSardine okHttpSardine = new OkHttpSardine();
            this.KJ = okHttpSardine;
            okHttpSardine.setCredentials(M(), i());
            String path = Uri.parse(Gc()).getPath();
            if (TextUtils.isEmpty(path)) {
                path = "";
            }
            this.zH = path;
        }
        return this.KJ;
    }

    public final String t0() {
        return Rc.ee(this.zH) ? "" : this.zH;
    }

    public final String tF() {
        return Gc().replace(t0(), "");
    }

    public final String zH() {
        return TextUtils.isEmpty(this.yq) ? "" : this.yq;
    }
}
