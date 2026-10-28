package com.github.catvod.spider.merge;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class k9 {
    @SerializedName("t")
    private String N;
    @SerializedName("content")
    private k9 SN;
    @SerializedName("qrCodeStatus")
    private String i;
    @SerializedName("bizExt")
    private String t0;
    @SerializedName("ck")
    private String tF;
    @SerializedName("data")
    private k9 yq;
    @SerializedName("codeContent")
    private String zH;

    public static k9 t0(String str) {
        try {
            k9 k9Var = (k9) new Gson().fromJson(str, k9.class);
            return k9Var == null ? new k9() : k9Var;
        } catch (Exception unused) {
            return new k9();
        }
    }

    public final k9 N() {
        k9 k9Var = this.yq;
        return k9Var == null ? new k9() : k9Var;
    }

    public final k9 SN() {
        k9 k9Var = this.SN;
        return k9Var == null ? new k9() : k9Var;
    }

    public final boolean i() {
        String str = this.i;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (str.equals("CONFIRMED")) {
            String str3 = this.t0;
            if (str3 != null) {
                str2 = str3;
            }
            if (str2.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final Map<String, String> tF() {
        HashMap hashMap = new HashMap();
        String str = this.N;
        if (str == null) {
            str = "";
        }
        hashMap.put("t", str);
        String str2 = this.tF;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("ck", str2);
        hashMap.put("appName", "aliyun_drive");
        hashMap.put("appEntrance", "web");
        hashMap.put("isMobile", "false");
        hashMap.put("lang", "zh_CN");
        hashMap.put("returnUrl", "");
        hashMap.put("fromSite", "52");
        hashMap.put("bizParams", "");
        hashMap.put("navlanguage", "zh-CN");
        hashMap.put("navPlatform", "MacIntel");
        return hashMap;
    }

    public final String yq() {
        String str = this.zH;
        return str == null ? "" : str;
    }

    public final String zH() {
        String str = this.t0;
        if (str == null) {
            str = "";
        }
        return ((C0099f) C0081aj.yq(new String(Base64.decode(str, 0)), C0099f.class)).yq().SN();
    }
}
