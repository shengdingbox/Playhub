package com.github.catvod.spider;

import com.github.catvod.spider.KkSs;
import com.github.catvod.spider.UuSs;
import com.github.catvod.spider.merge.RS;
import com.github.catvod.spider.merge.Rc;
import java.util.Objects;
import java.util.concurrent.Callable;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class yq implements Callable {
    public final /* synthetic */ String N;
    public final /* synthetic */ String SN;
    public final /* synthetic */ Pan tF;
    public final /* synthetic */ int yq;

    public /* synthetic */ yq(Pan pan, String str, String str2, int i) {
        this.yq = i;
        this.tF = pan;
        this.SN = str;
        this.N = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2;
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                String str3 = this.SN;
                String str4 = this.N;
                Objects.requireNonNull((KkSs) this.tF);
                try {
                    str2 = RS.SN(str3 + "index.php/vod/search.html?wd=" + str4, Rc.yq(), 6);
                } catch (Exception e) {
                    e.printStackTrace();
                    str2 = null;
                }
                return new KkSs.WebsiteResponse(str3, str2);
            default:
                String str5 = this.SN;
                String str6 = this.N;
                Objects.requireNonNull((UuSs) this.tF);
                try {
                    str = RS.SN(str5 + "index.php/vod/search.html?wd=" + str6, Rc.yq(), 6);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    str = "";
                }
                return new UuSs.WebsiteResponse(str5, str);
        }
    }
}
