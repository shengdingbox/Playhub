package com.github.catvod.spider.merge;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class VQ {
    @SerializedName("data")
    private LP N;
    @SerializedName("message")
    private String SN;
    @SerializedName("code")
    private Integer yq;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        @SerializedName("title")
        private String N;
        @SerializedName("aid")
        private String SN;
        @SerializedName("length")
        private String i;
        @SerializedName("pic")
        private String tF;
        @SerializedName("bvid")
        private String yq;
        @SerializedName("duration")
        private String zH;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.github.catvod.spider.merge.VQ$yq$yq  reason: collision with other inner class name */
        /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
        public class C0017yq extends TypeToken<List<yq>> {
            C0017yq() {
            }
        }

        public static List<yq> yq(JsonElement jsonElement) {
            return (List) new Gson().fromJson(jsonElement, new C0017yq().getType());
        }

        public final String N() {
            return TextUtils.isEmpty(this.N) ? "" : this.N;
        }

        public final String SN() {
            return TextUtils.isEmpty(this.tF) ? "" : this.tF;
        }

        public final ME tF() {
            String str;
            String str2;
            StringBuilder sb;
            ME me = new ME();
            StringBuilder sb2 = new StringBuilder();
            String str3 = "";
            sb2.append(TextUtils.isEmpty(this.yq) ? str3 : this.yq);
            sb2.append("@");
            sb2.append(TextUtils.isEmpty(this.SN) ? str3 : this.SN);
            me.B(sb2.toString());
            me.G(rN.yq(TextUtils.isEmpty(this.N) ? str3 : this.N).Fo());
            if (SN().startsWith("//")) {
                StringBuilder yq = by.yq("https:");
                yq.append(SN());
                str = yq.toString();
            } else {
                str = SN();
            }
            me.G4(str);
            if (!TextUtils.isEmpty(this.zH)) {
                if (this.zH.contains(":")) {
                    sb = new StringBuilder();
                    sb.append(this.zH.split(":")[0]);
                } else if (Integer.parseInt(this.zH) < 60) {
                    sb = new StringBuilder();
                    sb.append(this.zH);
                    str2 = "秒";
                    sb.append(str2);
                    str3 = sb.toString();
                } else {
                    sb = new StringBuilder();
                    sb.append(Integer.parseInt(this.zH) / 60);
                }
                str2 = "分鐘";
                sb.append(str2);
                str3 = sb.toString();
            } else if (!TextUtils.isEmpty(this.i)) {
                str3 = this.i;
            }
            me.v3(str3);
            return me;
        }
    }

    public static VQ SN(String str) {
        return (VQ) C0081aj.yq(str, VQ.class);
    }

    public final LP yq() {
        LP lp = this.N;
        return lp == null ? new LP() : lp;
    }
}
