package com.github.catvod.spider.merge;

import java.io.IOException;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class RH extends IOException {
    public RH(Exception exc) {
        super(exc);
    }

    public RH(String str) {
        super(str);
    }

    public RH(String str, int i) {
        super(str);
    }

    public RH(String str, Exception exc) {
        super("Zip headers not found. Probably not a zip file or a corrupted zip file", exc);
    }

    public RH(String str, Throwable th) {
        super(str, th);
    }
}
