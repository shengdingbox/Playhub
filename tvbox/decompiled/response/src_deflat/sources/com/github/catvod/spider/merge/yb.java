package com.github.catvod.spider.merge;

import java.io.Writer;
@Deprecated
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class yb extends iY {
    private boolean SN(char c) {
        return c >= '0' && c <= '7';
    }

    @Override // com.github.catvod.spider.merge.iY
    public final int yq(CharSequence charSequence, int i, Writer writer) {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (charSequence.charAt(i) == '\\' && length > 0) {
            int i2 = i + 1;
            if (SN(charSequence.charAt(i2))) {
                int i3 = i + 2;
                int i4 = i + 3;
                sb.append(charSequence.charAt(i2));
                if (length > 1 && SN(charSequence.charAt(i3))) {
                    sb.append(charSequence.charAt(i3));
                    if (length > 2) {
                        char charAt = charSequence.charAt(i2);
                        if (charAt >= '0' && charAt <= '3') {
                            z = true;
                        }
                        if (z && SN(charSequence.charAt(i4))) {
                            sb.append(charSequence.charAt(i4));
                        }
                    }
                }
                writer.write(Integer.parseInt(sb.toString(), 8));
                return sb.length() + 1;
            }
        }
        return 0;
    }
}
