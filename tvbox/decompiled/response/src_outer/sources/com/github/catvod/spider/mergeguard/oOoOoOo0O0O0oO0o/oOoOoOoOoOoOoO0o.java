package com.github.catvod.spider.mergeguard.oOoOoOo0O0O0oO0o;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public final class oOoOoOoOoOoOoO0o extends Error {
    Exception oOoOoOoOoOoOoO0o;

    public oOoOoOoOoOoOoO0o(String str, Exception exc) {
        super(str);
        this.oOoOoOoOoOoOoO0o = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.oOoOoOoOoOoOoO0o) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.oOoOoOoOoOoOoO0o.getClass().toString() : message2;
    }
}
