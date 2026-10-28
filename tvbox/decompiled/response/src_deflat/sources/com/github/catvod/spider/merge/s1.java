package com.github.catvod.spider.merge;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class s1 extends Error {
    Exception yq;

    public s1(String str, Exception exc) {
        super(str);
        this.yq = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.yq) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.yq.getClass().toString() : message2;
    }
}
