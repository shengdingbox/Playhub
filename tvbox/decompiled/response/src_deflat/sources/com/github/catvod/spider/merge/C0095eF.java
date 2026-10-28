package com.github.catvod.spider.merge;

import com.github.catvod.parser.C0000;
import com.github.catvod.parser.C0001;
import com.github.catvod.parser.C0002;
import com.github.catvod.parser.C0004;
import com.github.catvod.parser.C0005;
import com.github.catvod.parser.C0006;
import com.github.catvod.parser.C0010;
import com.github.catvod.parser.C0011;
import com.github.catvod.parser.C0014;
import com.github.catvod.spider.C0042;
import com.github.catvod.spider.C0043;
import com.github.catvod.spider.C0044;
import com.github.catvod.spider.C0045;
import com.github.catvod.spider.C0046;
import com.github.catvod.spider.C0048;
import com.github.catvod.spider.C0049;
import com.github.catvod.spider.C0050;
import com.github.catvod.spider.C0052;
import com.github.catvod.spider.C0053;
import com.github.catvod.spider.C0054;
import com.github.catvod.spider.C0056;
import com.github.catvod.spider.C0057;
import java.io.InputStream;
import java.nio.channels.Pipe;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
/* renamed from: com.github.catvod.spider.merge.eF  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0095eF {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f74short = {518, 565, 570, 563, 561, 2490, 2486, 2487, 2487, 2492, 2490, 2477, 2480, 2486, 2487, 1953, 1978, 1975, 1958, 1968, 2046, 2022, 1959, 2030, 703, 689, 689, 676, 761, 693, 696, 701, 674, 689, 3310, 3317, 3320, 3305, 3327, 3249, 3236, 3280, 3304, 3239, 3237, 3233, 3236, 3280, 3304, 3239, 3237, 3251, 1130, 1113, 1110, 1119, 1117, 1252, 2900, 552, 1688, 1667, 1678, 1695, 1673, 1754, 2553, 2517, 2516, 2510, 2527, 2516, 2510, 2455, 2536, 2523, 2516, 2525, 2527, 3172, 3144, 3145, 3155, 3138, 3145, 3155, 3082, 3179, 3138, 3145, 3136, 3155, 3151, 3206, 3236, 3236, 3234, 3255, 3251, 3306, 3221, 3238, 3241, 3232, 3234, 3252, 1103, 1108, 1113, 1096, 1118, 3114, 3078, 3079, 3079, 3084, 3082, 3101, 3072, 3078, 3079, 2793, 2791, 2791, 2802, 2735, 2787, 2798, 2795, 2804, 2791, 691, 674, 674, 702, 699, 689, 691, 678, 699, 701, 700, 765, 701, 689, 678, 767, 673, 678, 672, 695, 691, 703, 2755, 2756, 2780, 2763, 2758, 2755, 2766, 2698, 2808, 2763, 2756, 2765, 2767, 2704, 2698};
    private boolean B;
    private ExecutorService G;
    private long Gc;
    private boolean KJ;
    private long M;
    private final String N;
    private final Map<String, String> SN;
    private long i;
    private boolean q;
    private long t0;
    private long tF;
    private final BlockingQueue<yq> yq;
    private boolean zH;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.github.catvod.spider.merge.eF$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class yq {
        private Response N;
        private final long SN;
        private final long yq;

        public yq(long j, long j2) {
            this.yq = j;
            this.SN = j2;
            int i = C0014.m418();

            if (i > 0) {
                return;
            } else {
                System.out.println(Double.valueOf(C0042.m2014("pEVZkw6TAuBPYZn")));
                return;
            }
        }

        static /* synthetic */ long SN(yq yqVar) {
            return yqVar.yq;
        }

        static /* synthetic */ long yq(yq yqVar) {
            return yqVar.SN;
        }

        public final Response N() {
            return this.N;
        }

        public final void tF(Response response) {
            this.N = response;
        }
    }

    public C0095eF(String str, Map<String, String> map, Long l, long j) {
        this.yq = new LinkedBlockingQueue();
        this.zH = false;
        this.t0 = -1L;
        this.Gc = -1L;
        this.M = -1L;
        this.KJ = true;
        this.q = true;
        this.G = C0040.m1962(2);
        this.N = str;
        this.SN = map;
        this.tF = C0002.m59(l);
        this.i = j;
        this.B = false;
        int i = C0033.m1755();

        if (i < 0) {
            return;
        } else {
            System.out.println(Integer.valueOf(C0011.m332("lXCgvfPDwPRDWjFIZ")));
            return;
        }
    }

    public C0095eF(String str, Map<String, String> map, Long l, long j, boolean z) {
        this.yq = new LinkedBlockingQueue();
        this.zH = false;
        this.t0 = -1L;
        this.Gc = -1L;
        this.M = -1L;
        this.KJ = true;
        this.q = true;
        this.G = Executors.newFixedThreadPool(2);
        this.N = str;
        this.SN = map;
        this.tF = l.longValue();
        this.i = j;
        this.B = z;
        int i = C0001.m25();

        if (i < 0) {
            return;
        } else {
            System.out.println(Float.parseFloat(C0044.m2045("iTXNpalKhu")));
            return;
        }
    }

    public static void N(C0095eF eFVar) {
        eFVar.G.submit(new Nl(eFVar, 5));
        int i = C0006.m193();

        if (i > 0) {
            return;
        } else {
            System.out.println(Integer.valueOf(C0030.m1663("035s1")));
            return;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
    jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 434
    at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:70)
    at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
    */
    public static void SN(com.github.catvod.spider.merge.C0095eF r14) {
        /*
        Method dump skipped, instructions count: 1536
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0095eF.SN(com.github.catvod.spider.merge.eF):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:2|(3:148|3|(5:4|5|7|157|155))|144|111|112|(5:113|114|117|286|283)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d5, code lost:
    r0 = 54657;
    */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d8, code lost:
    r0 = r0 ^ 54674;
    */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01dc, code lost:
    switch(r0) {
        case 19: goto L298;
        case 50: goto L297;
        default: goto L300;
    };
    */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01e0, code lost:
    r0 = 54688;
    */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0003 A[EXC_TOP_SPLITTER, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.eF$yq>, java.util.concurrent.LinkedBlockingQueue] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.eF$yq>, java.util.concurrent.LinkedBlockingQueue] */
    /*
    Code decompiled incorrectly, please refer to instructions dump.
    To view partially-correct add '--show-bad-code' argument
    */
    public static void yq(com.github.catvod.spider.merge.C0095eF r6, java.nio.channels.Pipe.SinkChannel r7) {
        /*
        Method dump skipped, instructions count: 786
        To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0095eF.yq(com.github.catvod.spider.merge.eF, java.nio.channels.Pipe$SinkChannel):void");
    }

    /* renamed from: اﺏطﻍ  reason: contains not printable characters */
    public static long m1293(Object obj) {
        int i = C0048.m2140();

        if (i > 0) {
            return 0L;
        } else {
            return ((C0095eF) obj).t0;
        }
    }

    /* renamed from: عرﺵـ  reason: contains not printable characters */
    public static long m1294(Object obj) {
        int i = C0000.m13();

        if (i < 0) {
            return 0L;
        } else {
            return ((C0095eF) obj).Gc;
        }
    }

    /* renamed from: ـخرﻉ  reason: contains not printable characters */
    public static long m1295(Object obj) {
        int i = C0050.m2221();

        if (i > 0) {
            return 0L;
        } else {
            return ((C0095eF) obj).tF;
        }
    }

    /* renamed from: كﺡﺯذ  reason: contains not printable characters */
    public static boolean m1296(Object obj) {
        int i = C0054.m2295();

        if (i >= 0) {
            return false;
        } else {
            return ((C0095eF) obj).B;
        }
    }

    /* renamed from: ﺩخضث  reason: contains not printable characters */
    public static Map m1297(Object obj) {
        int i = C0053.m2279();

        if (i > 0) {
            return null;
        } else {
            return ((C0095eF) obj).SN;
        }
    }

    /* renamed from: ﻕريع  reason: contains not printable characters */
    public static short[] m1298() {
        int i = C0004.m129();

        if (i >= 0) {
            return null;
        } else {
            return f74short;
        }
    }

    public final Object[] tF() {
        long j;
        int i;
        long j2;
        StringBuilder sb;
        String str;
        Pattern pattern = C0005.m166(C0024.m1513(m1298(), 34, 18, 3212));
        Map map = m1297(this);
        String str2 = C0056.m2339(m1298(), 52, 5, 1080);
        Matcher matcher = C0022.m1425(pattern, (CharSequence) C0000.m15(map, str2));
        boolean z = C0054.m2303(matcher);

        if (!z) {
            StringBuilder sb3 = C0052.m2253(C0000.m18(m1298(), 153, 15, 2730));
            C0032.m1746(sb3, (String) C0000.m15(m1297(this), str2));
            throw new Exception(C0043.m2039(sb3));
        } else {
            boolean z2 = m1296(this);
            if (!z2) {
                j = C0010.m288(C0030.m1678(matcher, 1));
            } else {
                j = C0010.m288(C0030.m1678(matcher, 1)) + 8;
                j = C0010.m288(C0030.m1678(matcher, 1));
            }
            this.t0 = j;
            String str3 = C0030.m1678(matcher, 2);
            if (!(str3 == null)) {
                this.Gc = C0010.m288(C0030.m1678(matcher, 2));
            }
            long j3 = m1293(this);
            if (j3 != 0) {
                i = 206;
            } else {
                i = 200;
                i = 206;
            }
            long j4 = m1294(this);
            if (!(j4 > 0)) {
                this.Gc = m1295(this) - 1;
            }
            this.M = j3;
            boolean z3 = m1296(this);
            if (!z3) {
                j2 = m1295(this);
            } else {
                j2 = m1295(this) - 8;
                j2 = m1295(this);
            }
            C0038.m1909(new xW(this, 5));
            Pipe pipe = C0043.m2030();
            Pipe.SinkChannel sinkChannel = C0034.m1797(pipe);
            Pipe.SourceChannel sourceChannel = C0043.m2033(pipe);
            HashMap hashMap = new HashMap();
            boolean z4 = m1296(this);
            String str4 = C0057.m2384(m1298(), 57, 1, 1227);
            String str5 = C0026.m1551(m1298(), 58, 1, 2937);
            if (!z4) {
                sb = new StringBuilder();
                C0046.m2118(sb, m1293(this));
                C0032.m1746(sb, str5);
                long j5 = m1294(this);
                if (!(j5 > 0)) {
                    j5 = m1295(this) - 1;
                }
                C0046.m2118(sb, j5);
                C0032.m1746(sb, str4);
                C0046.m2118(sb, m1295(this));
            } else {
                long j6 = m1293(this);
                if (j6 != 8) {
                    sb = new StringBuilder();
                    C0046.m2118(sb, m1293(this));
                    C0032.m1746(sb, str5);
                    long j7 = m1294(this);
                    if (!(j7 > 0)) {
                        j7 = m1295(this) - 1;
                    }
                    C0046.m2118(sb, j7 - 8);
                    C0032.m1746(sb, str4);
                    C0046.m2118(sb, m1295(this) - 8);
                } else {
                    str = C0042.m2010(m1298(), 59, 1, 536);
                    sb = new StringBuilder();
                    C0046.m2118(sb, m1293(this));
                    C0032.m1746(sb, str5);
                    long j7 = m1294(this);
                    if (!(j7 > 0)) {
                        j7 = m1295(this) - 1;
                    }
                    C0046.m2118(sb, j7 - 8);
                    C0032.m1746(sb, str4);
                    C0046.m2118(sb, m1295(this) - 8);
                }
                sb = new StringBuilder();
                C0046.m2118(sb, m1293(this));
                C0032.m1746(sb, str5);
                long j5 = m1294(this);
                if (!(j5 > 0)) {
                    j5 = m1295(this) - 1;
                }
                C0046.m2118(sb, j5);
                C0032.m1746(sb, str4);
                C0046.m2118(sb, m1295(this));
            }
            str = C0043.m2039(sb);
            StringBuilder sb2 = new StringBuilder();
            C0032.m1746(sb2, C0025.m1542(m1298(), 60, 6, 1786));
            C0032.m1746(sb2, str);
            C0042.m1999(hashMap, C0011.m328(m1298(), 66, 13, 2490), C0043.m2039(sb2));
            C0042.m1999(hashMap, C0014.m421(m1298(), 79, 14, 3111), C0049.m2192(j2 - j3));
            C0042.m1999(hashMap, C0046.m2123(m1298(), 93, 13, 3271), C0021.m1417(m1298(), 106, 5, 1069));
            C0042.m1999(hashMap, C0045.m2098(m1298(), 111, 10, 3177), C0011.m328(m1298(), 121, 10, 2690));
            Integer num = C0053.m2274(i);
            String str6 = C0025.m1542(m1298(), 131, 22, 722);
            InputStream inputStream = C0049.m2193(sourceChannel);
            C0005.m174(new Thread(new RunnableC0151n(this, sinkChannel, 2)));
            return new Object[]{num, str6, inputStream, hashMap};
        }
    }
}
