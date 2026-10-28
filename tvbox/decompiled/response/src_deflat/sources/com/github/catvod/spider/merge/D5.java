package com.github.catvod.spider.merge;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class D5 implements Serializable {
    private boolean Gc;
    private boolean N;
    public static final D5 v3 = new yq();
    private static final ThreadLocal<WeakHashMap<Object, Object>> W = new ThreadLocal<>();
    private boolean yq = true;
    private boolean SN = true;
    private boolean tF = true;
    private String zH = "[";
    private String i = "]";
    private String t0 = "=";
    private String M = ",";
    private String KJ = "{";
    private String q = "}";
    private String B = "<null>";
    private String G = "<size=";
    private String G4 = ">";
    private String dT = "<";
    private String F5 = ">";

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class N extends D5 {
        N() {
            OW("[");
            g1(System.lineSeparator() + "  ");
            s();
            Nl(System.lineSeparator() + "]");
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class SN extends D5 {
        SN() {
            g();
            U();
            OW("{");
            Nl("}");
            Gd();
            xa();
            g1(",");
            O();
            n();
            Dr();
            Zm();
            b();
            un();
        }

        @Override // com.github.catvod.spider.merge.D5
        protected final void KJ(StringBuffer stringBuffer, String str) {
            StringBuilder yq = by.yq("\"");
            yq.append(C0200wd.yq(str));
            yq.append("\"");
            D5.super.KJ(stringBuffer, yq.toString());
        }

        @Override // com.github.catvod.spider.merge.D5
        protected final void N(StringBuffer stringBuffer, char c) {
            String valueOf = String.valueOf(c);
            stringBuffer.append('\"');
            stringBuffer.append(C0200wd.yq(valueOf));
            stringBuffer.append('\"');
        }

        @Override // com.github.catvod.spider.merge.D5
        protected final void i(StringBuffer stringBuffer, String str, Collection<?> collection) {
            if (collection == null || collection.isEmpty()) {
                stringBuffer.append(collection);
                return;
            }
            stringBuffer.append(F5());
            int i = 0;
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                i++;
                tF(stringBuffer, str, i, it.next());
            }
            stringBuffer.append(dT());
        }

        @Override // com.github.catvod.spider.merge.D5
        protected final void t0(StringBuffer stringBuffer, Map map) {
            if (map == null || map.isEmpty()) {
                stringBuffer.append(map);
                return;
            }
            stringBuffer.append(W());
            boolean z = true;
            for (Map.Entry entry : map.entrySet()) {
                String objects = Objects.toString(entry.getKey(), null);
                if (objects != null) {
                    if (z) {
                        z = false;
                    } else {
                        M(stringBuffer);
                    }
                    KJ(stringBuffer, objects);
                    Object value = entry.getValue();
                    if (value == null) {
                        B(stringBuffer);
                    } else {
                        q(stringBuffer, objects, value, true);
                    }
                }
            }
            stringBuffer.append(v3());
        }

        @Override // com.github.catvod.spider.merge.D5
        public final void yq(StringBuffer stringBuffer, Object obj) {
            D5.super.yq(stringBuffer, obj);
        }

        @Override // com.github.catvod.spider.merge.D5
        protected final void zH(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                B(stringBuffer);
            } else if ((obj instanceof String) || (obj instanceof Character)) {
                String obj2 = obj.toString();
                stringBuffer.append('\"');
                stringBuffer.append(C0200wd.yq(obj2));
                stringBuffer.append('\"');
            } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
                stringBuffer.append(obj);
            } else {
                String obj3 = obj.toString();
                boolean z = false;
                if (!(obj3.startsWith(W()) && obj3.endsWith(v3()))) {
                    if (obj3.startsWith(F5()) && obj3.endsWith(dT())) {
                        z = true;
                    }
                    if (!z) {
                        zH(stringBuffer, str, obj3);
                        return;
                    }
                }
                stringBuffer.append(obj);
            }
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class i extends D5 {
        i() {
            Fz();
            U();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class t0 extends D5 {
        t0() {
            g();
            U();
            H();
            OW("");
            Nl("");
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class tF extends D5 {
        tF() {
            g();
            U();
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class yq extends D5 {
        yq() {
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    private static final class zH extends D5 {
        zH() {
            H();
        }
    }

    static {
        new N();
        new zH();
        new i();
        new t0();
        new tF();
        new SN();
    }

    protected D5() {
    }

    static void E1(Object obj) {
        Map<Object, Object> ee;
        if (obj != null && (ee = ee()) != null) {
            ee.remove(obj);
            if (ee.isEmpty()) {
                W.remove();
            }
        }
    }

    static Map<Object, Object> ee() {
        return W.get();
    }

    static void g9(Object obj) {
        if (obj != null) {
            if (ee() == null) {
                W.set(new WeakHashMap<>());
            }
            ee().put(obj, null);
        }
    }

    protected final void B(StringBuffer stringBuffer) {
        stringBuffer.append(this.B);
    }

    protected final void Dr() {
        this.dT = "\"<";
    }

    protected final String F5() {
        return this.KJ;
    }

    protected final void Fz() {
        this.N = true;
    }

    public final void G(StringBuffer stringBuffer, Object obj) {
        String str;
        if (obj != null) {
            if (this.SN) {
                g9(obj);
                boolean z = this.N;
                Class<?> cls = obj.getClass();
                if (z) {
                    str = Y.yq(cls);
                } else {
                    str = cls.getName();
                }
                stringBuffer.append(str);
            }
            if (this.tF) {
                g9(obj);
                stringBuffer.append('@');
                stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            }
            stringBuffer.append(this.zH);
            if (this.Gc) {
                stringBuffer.append(this.M);
            }
        }
    }

    protected final void G4(StringBuffer stringBuffer, int i2) {
        stringBuffer.append(this.G);
        stringBuffer.append(i2);
        stringBuffer.append(this.G4);
    }

    public final void Gc(StringBuffer stringBuffer, Object obj) {
        if (Mw.yq(stringBuffer, this.M)) {
            stringBuffer.setLength(stringBuffer.length() - this.M.length());
        }
        stringBuffer.append(this.i);
        E1(obj);
    }

    protected final void Gd() {
        this.KJ = "[";
    }

    protected final void H() {
        this.yq = false;
    }

    protected void KJ(StringBuffer stringBuffer, String str) {
        if (this.yq && str != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.t0);
        }
    }

    protected final void M(StringBuffer stringBuffer) {
        stringBuffer.append(this.M);
    }

    protected void N(StringBuffer stringBuffer, char c) {
        stringBuffer.append(c);
    }

    protected final void Nl(String str) {
        if (str == null) {
            str = "";
        }
        this.i = str;
    }

    protected final void O() {
        this.t0 = ":";
    }

    protected final void OW(String str) {
        this.zH = str;
    }

    public final void SN(StringBuffer stringBuffer, String str, boolean z) {
        KJ(stringBuffer, str);
        stringBuffer.append(z);
        stringBuffer.append(this.M);
    }

    protected final void U() {
        this.tF = false;
    }

    protected final String W() {
        return this.zH;
    }

    protected final void Zm() {
        this.F5 = ">\"";
    }

    protected final void b() {
        this.G = "\"<size=";
    }

    protected final String dT() {
        return this.q;
    }

    protected final void g() {
        this.SN = false;
    }

    protected final void g1(String str) {
        if (str == null) {
            str = "";
        }
        this.M = str;
    }

    protected void i(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    protected final void n() {
        this.B = "null";
    }

    protected final void q(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        int i2;
        Map<Object, Object> ee = ee();
        int i3 = 0;
        if (!(ee != null && ee.containsKey(obj)) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character)) {
            g9(obj);
            try {
                if (!(obj instanceof Collection)) {
                    if (obj instanceof Map) {
                        if (z) {
                            t0(stringBuffer, (Map) obj);
                        } else {
                            i2 = ((Map) obj).size();
                            G4(stringBuffer, i2);
                        }
                    } else if (obj instanceof long[]) {
                        if (z) {
                            long[] jArr = (long[]) obj;
                            stringBuffer.append(this.KJ);
                            while (i3 < jArr.length) {
                                if (i3 > 0) {
                                    stringBuffer.append(",");
                                }
                                stringBuffer.append(jArr[i3]);
                                i3++;
                            }
                            stringBuffer.append(this.q);
                        } else {
                            G4(stringBuffer, ((long[]) obj).length);
                        }
                    } else if (obj instanceof int[]) {
                        if (z) {
                            int[] iArr = (int[]) obj;
                            stringBuffer.append(this.KJ);
                            while (i3 < iArr.length) {
                                if (i3 > 0) {
                                    stringBuffer.append(",");
                                }
                                stringBuffer.append(iArr[i3]);
                                i3++;
                            }
                            stringBuffer.append(this.q);
                        } else {
                            G4(stringBuffer, ((int[]) obj).length);
                        }
                    } else if (obj instanceof short[]) {
                        if (z) {
                            short[] sArr = (short[]) obj;
                            stringBuffer.append(this.KJ);
                            while (i3 < sArr.length) {
                                if (i3 > 0) {
                                    stringBuffer.append(",");
                                }
                                stringBuffer.append((int) sArr[i3]);
                                i3++;
                            }
                            stringBuffer.append(this.q);
                        } else {
                            G4(stringBuffer, ((short[]) obj).length);
                        }
                    } else if (obj instanceof byte[]) {
                        if (z) {
                            byte[] bArr = (byte[]) obj;
                            stringBuffer.append(this.KJ);
                            while (i3 < bArr.length) {
                                if (i3 > 0) {
                                    stringBuffer.append(",");
                                }
                                stringBuffer.append((int) bArr[i3]);
                                i3++;
                            }
                            stringBuffer.append(this.q);
                        } else {
                            G4(stringBuffer, ((byte[]) obj).length);
                        }
                    } else if (obj instanceof char[]) {
                        if (z) {
                            char[] cArr = (char[]) obj;
                            stringBuffer.append(this.KJ);
                            while (i3 < cArr.length) {
                                if (i3 > 0) {
                                    stringBuffer.append(",");
                                }
                                N(stringBuffer, cArr[i3]);
                                i3++;
                            }
                            stringBuffer.append(this.q);
                        } else {
                            G4(stringBuffer, ((char[]) obj).length);
                        }
                    } else if (obj instanceof double[]) {
                        if (z) {
                            double[] dArr = (double[]) obj;
                            stringBuffer.append(this.KJ);
                            while (i3 < dArr.length) {
                                if (i3 > 0) {
                                    stringBuffer.append(",");
                                }
                                stringBuffer.append(dArr[i3]);
                                i3++;
                            }
                            stringBuffer.append(this.q);
                        } else {
                            G4(stringBuffer, ((double[]) obj).length);
                        }
                    } else if (obj instanceof float[]) {
                        if (z) {
                            float[] fArr = (float[]) obj;
                            stringBuffer.append(this.KJ);
                            while (i3 < fArr.length) {
                                if (i3 > 0) {
                                    stringBuffer.append(",");
                                }
                                stringBuffer.append(fArr[i3]);
                                i3++;
                            }
                            stringBuffer.append(this.q);
                        } else {
                            G4(stringBuffer, ((float[]) obj).length);
                        }
                    } else if (obj instanceof boolean[]) {
                        if (z) {
                            boolean[] zArr = (boolean[]) obj;
                            stringBuffer.append(this.KJ);
                            while (i3 < zArr.length) {
                                if (i3 > 0) {
                                    stringBuffer.append(",");
                                }
                                stringBuffer.append(zArr[i3]);
                                i3++;
                            }
                            stringBuffer.append(this.q);
                        } else {
                            G4(stringBuffer, ((boolean[]) obj).length);
                        }
                    } else if (obj.getClass().isArray()) {
                        if (z) {
                            Object[] objArr = (Object[]) obj;
                            stringBuffer.append(this.KJ);
                            while (i3 < objArr.length) {
                                Object obj2 = objArr[i3];
                                if (i3 > 0) {
                                    stringBuffer.append(",");
                                }
                                if (obj2 == null) {
                                    stringBuffer.append(this.B);
                                } else {
                                    q(stringBuffer, str, obj2, true);
                                }
                                i3++;
                            }
                            stringBuffer.append(this.q);
                        } else {
                            G4(stringBuffer, ((Object[]) obj).length);
                        }
                    } else if (z) {
                        zH(stringBuffer, str, obj);
                    } else {
                        stringBuffer.append(this.dT);
                        stringBuffer.append(Y.yq(obj.getClass()));
                        stringBuffer.append(this.F5);
                    }
                } else if (z) {
                    i(stringBuffer, str, (Collection) obj);
                } else {
                    i2 = ((Collection) obj).size();
                    G4(stringBuffer, i2);
                }
            } finally {
                E1(obj);
            }
        } else {
            Ah.yq(stringBuffer, obj);
        }
    }

    protected final void s() {
        this.Gc = true;
    }

    protected void t0(StringBuffer stringBuffer, Map map) {
        stringBuffer.append(map);
    }

    protected final void tF(StringBuffer stringBuffer, String str, int i2, Object obj) {
        if (i2 > 0) {
            stringBuffer.append(",");
        }
        if (obj == null) {
            stringBuffer.append(this.B);
        } else {
            q(stringBuffer, str, obj, true);
        }
    }

    protected final void un() {
        this.G4 = ">\"";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String v() {
        return this.B;
    }

    protected final String v3() {
        return this.i;
    }

    protected final void xa() {
        this.q = "]";
    }

    public void yq(StringBuffer stringBuffer, Object obj) {
        KJ(stringBuffer, "value");
        if (obj == null) {
            stringBuffer.append(this.B);
        } else {
            q(stringBuffer, "value", obj, true);
        }
        stringBuffer.append(this.M);
    }

    protected void zH(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }
}
