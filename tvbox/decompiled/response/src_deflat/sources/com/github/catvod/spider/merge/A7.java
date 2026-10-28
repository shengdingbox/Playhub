package com.github.catvod.spider.merge;

import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class A7 {
    public static String N(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ long SN(int i) {
        if (i == 1) {
            return 67324752L;
        }
        if (i == 2) {
            return 134695760L;
        }
        if (i == 3) {
            return 33639248L;
        }
        if (i == 4) {
            return 101010256L;
        }
        if (i == 5) {
            return 808471376L;
        }
        if (i == 6) {
            return 84233040L;
        }
        if (i == 7) {
            return 134630224L;
        }
        if (i == 8) {
            return 134695760L;
        }
        if (i == 9) {
            return 117853008L;
        }
        if (i == 10) {
            return 101075792L;
        }
        if (i == 11) {
            return 1L;
        }
        if (i == 12) {
            return 39169L;
        }
        throw null;
    }

    public static /* synthetic */ String tF(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "PUT";
        }
        if (i == 3) {
            return "POST";
        }
        if (i == 4) {
            return "DELETE";
        }
        if (i == 5) {
            return "HEAD";
        }
        if (i == 6) {
            return "OPTIONS";
        }
        if (i == 7) {
            return "TRACE";
        }
        if (i == 8) {
            return "CONNECT";
        }
        if (i == 9) {
            return "PATCH";
        }
        if (i == 10) {
            return "PROPFIND";
        }
        if (i == 11) {
            return "PROPPATCH";
        }
        if (i == 12) {
            return "MKCOL";
        }
        if (i == 13) {
            return "MOVE";
        }
        if (i == 14) {
            return "COPY";
        }
        if (i == 15) {
            return "LOCK";
        }
        if (i == 16) {
            return "UNLOCK";
        }
        if (i == 17) {
            return "NOTIFY";
        }
        if (i == 18) {
            return "SUBSCRIBE";
        }
        throw null;
    }

    public static int yq(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return zH(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static /* synthetic */ int zH(String str) {
        Objects.requireNonNull(str, "Name is null");
        if (str.equals("GET")) {
            return 1;
        }
        if (str.equals("PUT")) {
            return 2;
        }
        if (str.equals("POST")) {
            return 3;
        }
        if (str.equals("DELETE")) {
            return 4;
        }
        if (str.equals("HEAD")) {
            return 5;
        }
        if (str.equals("OPTIONS")) {
            return 6;
        }
        if (str.equals("TRACE")) {
            return 7;
        }
        if (str.equals("CONNECT")) {
            return 8;
        }
        if (str.equals("PATCH")) {
            return 9;
        }
        if (str.equals("PROPFIND")) {
            return 10;
        }
        if (str.equals("PROPPATCH")) {
            return 11;
        }
        if (str.equals("MKCOL")) {
            return 12;
        }
        if (str.equals("MOVE")) {
            return 13;
        }
        if (str.equals("COPY")) {
            return 14;
        }
        if (str.equals("LOCK")) {
            return 15;
        }
        if (str.equals("UNLOCK")) {
            return 16;
        }
        if (str.equals("NOTIFY")) {
            return 17;
        }
        if (str.equals("SUBSCRIBE")) {
            return 18;
        }
        throw new IllegalArgumentException("No enum constant org.nanohttpd.protocols.http.request.Method.".concat(str));
    }
}
