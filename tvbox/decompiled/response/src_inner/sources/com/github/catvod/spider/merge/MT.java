package com.github.catvod.spider.merge;

import java.util.Locale;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class MT extends Xu {
    private final int i;

    public MT(zg zgVar, qk qkVar, int i) {
        super(zgVar, qkVar, null);
        this.i = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        char[] charArray;
        String str2;
        int i = this.i;
        if (i < 0 || i >= ((qk) SN()).size()) {
            str = "";
        } else {
            int i2 = this.i;
            String tF = ((qk) SN()).tF(C0169qt.SN(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : tF.toCharArray()) {
                if (c == '\t') {
                    str2 = "\\t";
                } else if (c == '\n') {
                    str2 = "\\n";
                } else if (c == '\r') {
                    str2 = "\\r";
                } else {
                    sb.append(c);
                }
                sb.append(str2);
            }
            str = sb.toString();
        }
        return String.format(Locale.getDefault(), "%s('%s')", MT.class.getSimpleName(), str);
    }
}
