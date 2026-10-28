package com.github.catvod.spider.merge;

import java.util.Map;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Qt implements HA {
    public static boolean SN(CharSequence charSequence, CharSequence charSequence2) {
        char c;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((c = (char) ((charAt | ' ') - 97)) >= 26 || c != ((char) ((charAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.HA
    public HG yq(String str, i7 i7Var, int i, int i2, Map map) {
        return new Ya().yq(str, i7.QR_CODE, i, i2, map);
    }
}
