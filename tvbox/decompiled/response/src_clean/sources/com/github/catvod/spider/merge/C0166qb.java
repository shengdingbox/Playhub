package com.github.catvod.spider.merge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.github.catvod.spider.merge.qb  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0166qb {
    private final String N;
    private final String SN;
    private final String yq;
    private static final Pattern tF = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    private static final Pattern zH = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    private static final Pattern i = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    public C0166qb(String str) {
        String str2;
        this.yq = str;
        if (str != null) {
            this.SN = SN(str, tF, "", 1);
            str2 = SN(str, zH, null, 2);
        } else {
            this.SN = "";
            str2 = "UTF-8";
        }
        this.N = str2;
        if ("multipart/form-data".equalsIgnoreCase(this.SN)) {
            SN(str, i, null, 2);
        }
    }

    private String SN(String str, Pattern pattern, String str2, int i2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(i2) : str2;
    }

    public final String N() {
        String str = this.N;
        return str == null ? "US-ASCII" : str;
    }

    public final C0166qb tF() {
        return this.N == null ? new C0166qb(A7.N(new StringBuilder(), this.yq, "; charset=UTF-8")) : this;
    }

    public final String yq() {
        return this.yq;
    }
}
