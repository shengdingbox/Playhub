package com.github.catvod.spider.merge;

import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
@Deprecated
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class iQ extends iY {
    private final int tF;
    private final int zH;
    private final HashMap<String, String> SN = new HashMap<>();
    private final HashSet<Character> N = new HashSet<>();

    public iQ(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.SN.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.N.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.tF = i;
        this.zH = i2;
    }

    @Override // com.github.catvod.spider.merge.iY
    public final int yq(CharSequence charSequence, int i, Writer writer) {
        if (!this.N.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int i2 = this.zH;
        if (i + i2 > charSequence.length()) {
            i2 = charSequence.length() - i;
        }
        while (i2 >= this.tF) {
            String str = this.SN.get(charSequence.subSequence(i, i + i2).toString());
            if (str != null) {
                writer.write(str);
                return i2;
            }
            i2--;
        }
        return 0;
    }
}
