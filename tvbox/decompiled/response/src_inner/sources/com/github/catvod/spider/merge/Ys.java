package com.github.catvod.spider.merge;

import android.graphics.Bitmap;
import java.util.EnumMap;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Ys {
    public static Bitmap yq(String str, int i, int i2) {
        try {
            EnumMap enumMap = new EnumMap(EnumC0209zK.class);
            enumMap.put((EnumMap) EnumC0209zK.CHARACTER_SET, (EnumC0209zK) "UTF-8");
            enumMap.put((EnumMap) EnumC0209zK.MARGIN, (EnumC0209zK) Integer.valueOf(i2));
            HG yq = new Qt().yq(str, i7.QR_CODE, Rc.q(i), Rc.q(i), enumMap);
            int N = yq.N();
            int SN = yq.SN();
            int[] iArr = new int[N * SN];
            for (int i3 = 0; i3 < SN; i3++) {
                int i4 = i3 * N;
                for (int i5 = 0; i5 < N; i5++) {
                    iArr[i4 + i5] = yq.yq(i5, i3) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(N, SN, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, N, 0, 0, N, SN);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
