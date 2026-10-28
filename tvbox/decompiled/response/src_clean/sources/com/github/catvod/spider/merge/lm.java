package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class lm {
    @SerializedName("directors")
    private List<N> B;
    @SerializedName("source_list_source")
    private List<SN> G;
    @SerializedName("dataList")
    private List<lm> G4;
    @SerializedName("year")
    private String Gc;
    @SerializedName("types")
    private List<N> KJ;
    @SerializedName("area")
    private String M;
    @SerializedName(alternate = {"path"}, value = "thumbnail")
    private String N;
    @SerializedName("id")
    private String SN;
    @SerializedName("description")
    private String i;
    @SerializedName("actors")
    private List<N> q;
    @SerializedName("playlist")
    private N t0;
    @SerializedName("title")
    private String tF;
    @SerializedName("jump_id")
    private String yq;
    @SerializedName("mask")
    private String zH;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class N {
        @SerializedName(alternate = {"name"}, value = "title")
        private String yq;

        /* JADX INFO: Access modifiers changed from: private */
        public String SN() {
            return TextUtils.isEmpty(this.yq) ? "" : this.yq;
        }

        public final String N(boolean z) {
            return z ? String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", A7.N(new StringBuilder(), SN(), "/{pg}"), SN(), SN()) : SN();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN {
        @SerializedName("source_list")
        private List<yq> SN;
        @SerializedName("name")
        private String yq;

        public final String SN() {
            return TextUtils.isEmpty(this.yq) ? "" : this.yq;
        }

        public final List<yq> yq() {
            List<yq> list = this.SN;
            return list == null ? Collections.emptyList() : list;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        @SerializedName("url")
        private String SN;
        @SerializedName("source_name")
        private String yq;

        public final String SN() {
            return TextUtils.isEmpty(this.SN) ? "" : this.SN.replaceAll("ftp", "tvbox-xg:ftp");
        }

        public final String yq() {
            return TextUtils.isEmpty(this.yq) ? "" : this.yq;
        }
    }

    public final String B() {
        String str = this.Gc;
        return str == null ? "" : str;
    }

    public final ME G(String str) {
        return new ME(TextUtils.isEmpty(this.yq) ? "" : this.yq, t0(), i(str));
    }

    public final ME G4(String str) {
        String str2 = "";
        String str3 = TextUtils.isEmpty(this.SN) ? str2 : this.SN;
        String t0 = t0();
        String i = i(str);
        if (TextUtils.isEmpty(this.zH)) {
            N n = this.t0;
            if (n != null) {
                str2 = n.SN();
            }
        } else {
            str2 = this.zH;
        }
        return new ME(str3, t0, i, str2);
    }

    public final String Gc() {
        List<N> list = this.KJ;
        return list == null ? "" : M(list, false);
    }

    public final String KJ() {
        ArrayList arrayList = new ArrayList();
        List<SN> list = this.G;
        if (list == null) {
            list = Collections.emptyList();
        }
        for (SN sn : list) {
            arrayList.add(sn.SN());
        }
        if (!cn.yq) {
            StringBuilder yq2 = by.yq((String) arrayList.get(0));
            yq2.append(cn.tF);
            String sb = yq2.toString();
            arrayList.remove(0);
            arrayList.add(0, sb);
        }
        return TextUtils.join("$$$", arrayList);
    }

    public final String M(List<N> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (N n : list) {
            sb.append(n.N(z));
            sb.append(" ");
        }
        String sb2 = sb.toString();
        int i = C0129kT.yq;
        return (sb2 == null || sb2.length() <= 1) ? sb2 : sb2.substring(0, sb2.length() - 1);
    }

    public final List<lm> N() {
        List<lm> list = this.G4;
        return list == null ? Collections.emptyList() : list;
    }

    public final String SN() {
        String str = this.M;
        return str == null ? "" : str;
    }

    public final String i(String str) {
        if (TextUtils.isEmpty(this.N)) {
            return "";
        }
        StringBuilder yq2 = Sq.yq("http://", str);
        yq2.append(this.N);
        return yq2.toString();
    }

    public final String q() {
        ArrayList arrayList = new ArrayList();
        List<SN> list = this.G;
        if (list == null) {
            list = Collections.emptyList();
        }
        for (SN sn : list) {
            ArrayList arrayList2 = new ArrayList();
            for (yq yqVar : sn.yq()) {
                arrayList2.add(yqVar.yq() + "$" + yqVar.SN());
            }
            arrayList.add(TextUtils.join("#", arrayList2));
        }
        return TextUtils.join("$$$", arrayList);
    }

    public final String t0() {
        return TextUtils.isEmpty(this.tF) ? "" : this.tF;
    }

    public final String tF() {
        return TextUtils.isEmpty(this.i) ? "" : this.i.replace("\u3000", "");
    }

    public final String yq() {
        List<N> list = this.q;
        return list == null ? "" : M(list, true);
    }

    public final String zH() {
        List<N> list = this.B;
        return list == null ? "" : M(list, true);
    }
}
