package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0007;
import com.github.catvod.parser.C0008;
import com.github.catvod.parser.C0009;
import com.github.catvod.parser.C0012;
import com.github.catvod.parser.C0013;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.github.catvod.spider.merge.bb  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0084bb {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f72short = {3160, 3163, 3162, 3165, 3164, 3167, 3166, 3153, 3152, 3155, 3154, 3157, 3156, 3159, 3158, 3145, 3144, 3147, 3146, 3149, 3148, 3151, 3150, 3137, 3136, 3139, 3192, 3195, 3194, 3197, 3196, 3199, 3198, 3185, 3184, 3187, 3186, 3189, 3188, 3191, 3190, 3177, 3176, 3179, 3178, 3181, 3180, 3183, 3182, 3169, 3168, 3171, 3113, 3112, 3115, 3114, 3117, 3116, 3119, 3118, 3105, 3104, 3122, 3126, 3108};
    private static final char[] yq = C0023.m1468(C0026.m1551(m1271(), 0, 65, 3097));
    private static final Map<char[], Map<Character, Integer>> SN = new HashMap();

    /* renamed from: com.github.catvod.spider.merge.bb$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static abstract class SN {
        SN() {
            int i = C0052.m2256();

            if (i > 0) {
                return;
            } else {
                System.out.println(Integer.parseInt(C0014.m410("hGjOoNQgQdHMEHLYtu11ILr")));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.bb$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class yq extends SN {
        final String yq;

        yq(String str) {
            this.yq = str;
            int i = C0031.m1699();

            if (i > 0) {
                return;
            } else {
                System.out.println(Long.parseLong(C0006.m184("ljq8b")));
                return;
            }
        }

        /* renamed from: ذيﺭع  reason: contains not printable characters */
        public static char m1274(Object obj, Object obj2) {
            int i = C0049.m2194();

            if (i >= 0) {
                return (char) 0;
            } else {
                return C0084bb.SN((char[]) obj, (Character) obj2);
            }
        }

        /* renamed from: سﻙيذ  reason: contains not printable characters */
        public static char[] m1275() {
            int i = C0032.m1750();

            if (i >= 0) {
                return null;
            } else {
                return C0084bb.m1273();
            }
        }

        /* renamed from: ﺕظﻙﻕ  reason: contains not printable characters */
        public static String m1276(Object obj) {
            int i = C0027.m1588();

            if (i < 0) {
                return null;
            } else {
                return ((yq) obj).yq;
            }
        }

        public final char yq(int i) {
            char c = 0;
            String str = "ۤۥۥ";
            char[] cArr = null;
            String str2 = null;
            Character ch = null;
            while (true) {
                switch (C0002.m76(str)) {
                    case 1747805:
                    return c;
                    case 1749856:
                    str2 = m1276(this);
                    str = "ۦ۠ۦ";
                    break;
                    case 1751684:
                    cArr = m1275();
                    str = "ۢۨۦ";
                    break;
                    case 1752616:
                    ch = C0013.m391(c);
                    str = "ۥ۟ۤ";
                    break;
                    case 1753452:
                    c = C0008.m244(str2, i);
                    str = "ۥۤۧ";
                    break;
                    default:
                    c = m1274(cArr, ch);
                    str = "۠ۤۡ";
                    break;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 533
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public static java.lang.String N(java.lang.String r21) {
        /*
        Method dump skipped, instructions count: 2176
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0084bb.N(java.lang.String):java.lang.String");
    }

    static char SN(char[] cArr, Character ch) {
        HashMap hashMap = m1270();
        Map map = (Map) C0007.m220(hashMap, cArr);

        if (!(map != null)) {
            HashMap hashMap2 = new HashMap();
            C0042.m1999(hashMap, cArr, hashMap2);
            int i2 = 0;
            while (true) {
                int length = cArr.length;
                if (i2 < length) {
                    C0042.m1999(hashMap2, C0013.m391(cArr[i2]), C0053.m2274(i2));
                    i2++;
                } else {
                    map = hashMap2;
                }
            }
        }
        return (char) C0012.m371((Integer) C0000.m15(map, ch));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<char[], java.util.Map<java.lang.Character, java.lang.Integer>>] */
    /* renamed from: بعﺡﺭ  reason: contains not printable characters */
    public static HashMap m1270() {
        int i = C0028.m1612();

        if (i > 0) {
            return null;
        } else {
            return SN;
        }
    }

    /* renamed from: شﺎصﻱ  reason: contains not printable characters */
    public static short[] m1271() {
        int i = C0009.m276();

        if (i < 0) {
            return null;
        } else {
            return f72short;
        }
    }

    /* renamed from: ﻕفﺝﻅ  reason: contains not printable characters */
    public static char m1272(Object obj, int i) {
        int i2 = C0026.m1561();

        if (i2 > 0) {
            return (char) 0;
        } else {
            return ((yq) obj).yq(i);
        }
    }

    /* renamed from: ﻭﺱحل  reason: contains not printable characters */
    public static char[] m1273() {
        int i = C0009.m276();

        if (i <= 0) {
            return null;
        } else {
            return yq;
        }
    }
}
