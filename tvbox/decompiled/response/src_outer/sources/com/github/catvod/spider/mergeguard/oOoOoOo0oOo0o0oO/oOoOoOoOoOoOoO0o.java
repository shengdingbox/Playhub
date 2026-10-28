package com.github.catvod.spider.mergeguard.oOoOoOo0oOo0o0oO;

import java.io.Serializable;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public final class oOoOoOoOoOoOoO0o implements Serializable {
    private String oOo0oOo0Oo0oO0Oo;
    private String oOoOoOo0oOo0o0oO;
    private String oOoOoOoOoOoOoO0o;

    public oOoOoOoOoOoOoO0o(String str, String str2, String str3) {
        if (str2 != null) {
            str = str == null ? "" : str;
            str3 = str3 == null ? "" : str3;
            this.oOoOoOoOoOoOoO0o = str;
            this.oOo0oOo0Oo0oO0Oo = str2;
            this.oOoOoOo0oOo0o0oO = str3;
            return;
        }
        throw new IllegalArgumentException("Local part not allowed to be null");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof oOoOoOoOoOoOoO0o)) {
            return false;
        }
        oOoOoOoOoOoOoO0o oooooooooooooo0o = (oOoOoOoOoOoOoO0o) obj;
        return this.oOo0oOo0Oo0oO0Oo.equals(oooooooooooooo0o.oOo0oOo0Oo0oO0Oo) && this.oOoOoOoOoOoOoO0o.equals(oooooooooooooo0o.oOoOoOoOoOoOoO0o);
    }

    public final int hashCode() {
        return this.oOoOoOoOoOoOoO0o.hashCode() ^ this.oOo0oOo0Oo0oO0Oo.hashCode();
    }

    public final String oOo0oOo0Oo0oO0Oo() {
        return this.oOoOoOoOoOoOoO0o;
    }

    public final String oOoOoOo0oOo0o0oO() {
        return this.oOoOoOo0oOo0o0oO;
    }

    public final String oOoOoOoOoOoOoO0o() {
        return this.oOo0oOo0Oo0oO0Oo;
    }

    public final String toString() {
        if (this.oOoOoOoOoOoOoO0o.equals("")) {
            return this.oOo0oOo0Oo0oO0Oo;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(this.oOoOoOoOoOoOoO0o);
        stringBuffer.append("}");
        stringBuffer.append(this.oOo0oOo0Oo0oO0Oo);
        return stringBuffer.toString();
    }
}
