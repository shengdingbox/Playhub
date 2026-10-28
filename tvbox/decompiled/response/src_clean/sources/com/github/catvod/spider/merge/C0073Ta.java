package com.github.catvod.spider.merge;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
/* renamed from: com.github.catvod.spider.merge.Ta  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0073Ta {
    public static final Charset yq;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset forName = Charset.forName("UTF-8");
        yq = forName;
        forName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
