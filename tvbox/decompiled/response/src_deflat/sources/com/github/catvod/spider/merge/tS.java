package com.github.catvod.spider.merge;

import java.io.Serializable;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class tS implements Serializable {
    private String N;
    private String SN;
    private String yq;

    public tS(String str, String str2, String str3) {
        if (str2 != null) {
            str = str == null ? "" : str;
            str3 = str3 == null ? "" : str3;
            this.yq = str;
            this.SN = str2;
            this.N = str3;
            return;
        }
        throw new IllegalArgumentException("Local part not allowed to be null");
    }

    public final String N() {
        return this.N;
    }

    public final String SN() {
        return this.yq;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof tS)) {
            return false;
        }
        tS tSVar = (tS) obj;
        return this.SN.equals(tSVar.SN) && this.yq.equals(tSVar.yq);
    }

    public final int hashCode() {
        return this.yq.hashCode() ^ this.SN.hashCode();
    }

    public final String toString() {
        if (this.yq.equals("")) {
            return this.SN;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(this.yq);
        stringBuffer.append("}");
        stringBuffer.append(this.SN);
        return stringBuffer.toString();
    }

    public final String yq() {
        return this.SN;
    }
}
