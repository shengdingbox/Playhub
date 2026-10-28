package com.github.catvod.spider.merge;

import java.io.Writer;
@Deprecated
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class fh extends iY {
    @Override // com.github.catvod.spider.merge.iY
    public final int yq(CharSequence charSequence, int i, Writer writer) {
        int i2;
        int i3;
        if (charSequence.charAt(i) != '\\' || (i2 = i + 1) >= charSequence.length() || charSequence.charAt(i2) != 'u') {
            return 0;
        }
        int i4 = 2;
        while (true) {
            i3 = i + i4;
            if (i3 >= charSequence.length() || charSequence.charAt(i3) != 'u') {
                break;
            }
            i4++;
        }
        if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
            i4++;
        }
        int i5 = i + i4;
        int i6 = i5 + 4;
        if (i6 <= charSequence.length()) {
            CharSequence subSequence = charSequence.subSequence(i5, i6);
            try {
                writer.write((char) Integer.parseInt(subSequence.toString(), 16));
                return i4 + 4;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) subSequence), e);
            }
        } else {
            StringBuilder yq = by.yq("Less than 4 hex digits in unicode value: '");
            yq.append((Object) charSequence.subSequence(i, charSequence.length()));
            yq.append("' due to end of CharSequence");
            throw new IllegalArgumentException(yq.toString());
        }
    }
}
