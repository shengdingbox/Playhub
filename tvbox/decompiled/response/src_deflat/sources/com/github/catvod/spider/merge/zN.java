package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.VV;
import com.github.catvod.spider.merge.Z4;
import java.nio.CharBuffer;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class zN {
    public static Z4 yq(String str) {
        VV.yq yqVar = new VV.yq(str.length());
        CharBuffer allocate = CharBuffer.allocate(str.length());
        allocate.put(str);
        allocate.flip();
        yqVar.yq(allocate);
        VV tF = yqVar.tF();
        int zH = kR.zH(tF.tF());
        if (zH == 0) {
            int i = tF.i();
            int t0 = tF.t0();
            byte[] SN = tF.SN();
            tF.yq();
            return new Z4.N(i, t0, SN);
        } else if (zH == 1) {
            int i2 = tF.i();
            int t02 = tF.t0();
            char[] N = tF.N();
            tF.yq();
            return new Z4.yq(i2, t02, N);
        } else if (zH == 2) {
            int i3 = tF.i();
            int t03 = tF.t0();
            int[] zH2 = tF.zH();
            tF.yq();
            return new Z4.SN(i3, t03, zH2);
        } else {
            throw new UnsupportedOperationException("Not reached");
        }
    }
}
