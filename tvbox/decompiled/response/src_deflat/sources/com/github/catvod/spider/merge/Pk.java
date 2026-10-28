package com.github.catvod.spider.merge;

import java.io.Writer;
import java.util.Locale;
@Deprecated
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Pk extends ho {
    private final int SN = 32;
    private final int N = 127;

    @Override // com.github.catvod.spider.merge.ho
    public final boolean SN(int i, Writer writer) {
        if (i >= this.SN && i <= this.N) {
            return false;
        }
        if (i > 65535) {
            char[] chars = Character.toChars(i);
            StringBuilder yq = by.yq("\\u");
            String hexString = Integer.toHexString(chars[0]);
            Locale locale = Locale.ENGLISH;
            yq.append(hexString.toUpperCase(locale));
            yq.append("\\u");
            yq.append(Integer.toHexString(chars[1]).toUpperCase(locale));
            writer.write(yq.toString());
            return true;
        }
        writer.write("\\u");
        char[] cArr = iY.yq;
        writer.write(cArr[(i >> 12) & 15]);
        writer.write(cArr[(i >> 8) & 15]);
        writer.write(cArr[(i >> 4) & 15]);
        writer.write(cArr[i & 15]);
        return true;
    }
}
