package com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO;

import java.io.PrintStream;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public final class oOoOoOoOoOoOoO0o extends Exception {
    protected Throwable oOoOoOoOoOoOoO0o;

    public oOoOoOoOoOoOoO0o(String str) {
        super(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oOoOoOoOoOoOoO0o(java.lang.Throwable r4) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            r0.append(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "caused by: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r3.oOoOoOoOoOoOoO0o = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.mergeguard.oOoOo0O0Oo0o0OoO.oOoOoOoOoOoOoO0o.<init>(java.lang.Throwable):void");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        if (this.oOoOoOoOoOoOoO0o == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getMessage());
            stringBuffer.append("; nested exception is:");
            printStream.println(stringBuffer.toString());
            this.oOoOoOoOoOoOoO0o.printStackTrace();
        }
    }
}
