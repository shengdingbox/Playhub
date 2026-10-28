package com.github.catvod.spider.merge;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;
/* renamed from: com.github.catvod.spider.merge.tM  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0181tM<T> {
    private T yq = null;

    /* renamed from: com.github.catvod.spider.merge.tM$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class SN extends AbstractC0181tM<String> {
        @Override // com.github.catvod.spider.merge.AbstractC0181tM
        public void onError(Call call, Exception exc) {
            SN("");
            onFailure(call, exc);
        }

        @Override // com.github.catvod.spider.merge.AbstractC0181tM
        public String onParseResponse(Call call, Response response) {
            try {
                return response.body().string();
            } catch (IOException unused) {
                return "";
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.tM$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static abstract class yq extends AbstractC0181tM<Response> {
        @Override // com.github.catvod.spider.merge.AbstractC0181tM
        public Response onParseResponse(Call call, Response response) {
            return response;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void SN(T t) {
        this.yq = t;
    }

    public T getResult() {
        return this.yq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    protected abstract void onFailure(Call call, Exception exc);

    protected abstract T onParseResponse(Call call, Response response);

    protected abstract void onResponse(T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void yq(Call call, Response response) {
        T onParseResponse = onParseResponse(call, response);
        this.yq = onParseResponse;
        onResponse(onParseResponse);
    }
}
