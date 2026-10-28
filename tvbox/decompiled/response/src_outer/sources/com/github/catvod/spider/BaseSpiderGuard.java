package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import java.util.HashMap;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public class BaseSpiderGuard extends Spider {
    private Spider oOoOoOoOoOoOoO0o = Init.getSpider(getClass().getName());

    public String action(String str) {
        return this.oOoOoOoOoOoOoO0o.action(str);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap hashMap) {
        return this.oOoOoOoOoOoOoO0o.categoryContent(str, str2, z, hashMap);
    }

    public void destroy() {
        this.oOoOoOoOoOoOoO0o.destroy();
    }

    public String detailContent(List list) {
        return this.oOoOoOoOoOoOoO0o.detailContent(list);
    }

    public String homeContent(boolean z) {
        return this.oOoOoOoOoOoOoO0o.homeContent(z);
    }

    public String homeVideoContent() {
        return this.oOoOoOoOoOoOoO0o.homeVideoContent();
    }

    public void init(Context context, String str) {
        this.oOoOoOoOoOoOoO0o.init(context, str);
    }

    public String playerContent(String str, String str2, List list) {
        return this.oOoOoOoOoOoOoO0o.playerContent(str, str2, list);
    }

    public String searchContent(String str, boolean z) {
        return this.oOoOoOoOoOoOoO0o.searchContent(str, z);
    }

    public String searchContent(String str, boolean z, String str2) {
        return this.oOoOoOoOoOoOoO0o.searchContent(str, z, str2);
    }
}
