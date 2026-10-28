package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;
/* renamed from: com.github.catvod.spider.merge.jn  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
final class C0127jn extends AbstractC0181tM<Response> {
    final /* synthetic */ Map SN;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0127jn(Map map) {
        this.SN = map;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0181tM
    public final void onFailure(Call call, Exception exc) {
        SN(null);
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.merge.AbstractC0181tM
    public final Response onParseResponse(Call call, Response response) {
        try {
            Map map = this.SN;
            if (map == null) {
                return response;
            }
            map.clear();
            this.SN.putAll(response.headers().toMultimap());
            return response;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0181tM
    public final /* bridge */ /* synthetic */ void onResponse(Response response) {
    }
}
