package com.github.catvod.spider.merge;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class Ir implements HostnameVerifier {
    public static final /* synthetic */ Ir yq = new Ir();

    private /* synthetic */ Ir() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        X509TrustManager x509TrustManager = Bj.SN;
        return true;
    }
}
