package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class oy {
    private static Map<String, AbstractC0079a> yq = new HashMap();
    private static Map<String, T9> SN = new HashMap();
    private static Map<String, AbstractC0101fM> N = new HashMap();
    private static a9 tF = mu.tF(oy.class);

    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.fM>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.a>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.T9>, java.util.HashMap] */
    static {
        Class[] clsArr = {D.class, C7.class, RL.class, KU.class, QS.class, T4.class, op.class, Uo.class, hf.class, ej.class, E0.class, FN.class, mZ.class, JL.class};
        int i = 0;
        for (int i2 = 14; i < i2; i2 = 14) {
            try {
                AbstractC0079a aVar = (AbstractC0079a) clsArr[i].newInstance();
                yq.put(aVar.name(), aVar);
            } catch (Exception e) {
                tF.yq(C0060Do.B(e), e);
            }
            i++;
        }
        Class[] clsArr2 = {Cr.class, s8.class, Mm.class, qJ.class, zE.class, C0090co.class, Gt.class, RK.class, C0179si.class, Nr.class, YG.class, uu.class, DL.class, m0.class, JC.class, C0109gg.class, Yk.class};
        for (int i3 = 0; i3 < 17; i3++) {
            try {
                AbstractC0101fM fMVar = (AbstractC0101fM) clsArr2[i3].newInstance();
                N.put(fMVar.name(), fMVar);
            } catch (Exception e2) {
                tF.yq(C0060Do.B(e2), e2);
            }
        }
        Class[] clsArr3 = {s0.class, QZ.class, LL.class, IV.class, C0212zm.class, XX.class};
        for (int i4 = 0; i4 < 6; i4++) {
            try {
                T9 t9 = (T9) clsArr3[i4].newInstance();
                SN.put(t9.name(), t9);
            } catch (Exception e3) {
                tF.yq(C0060Do.B(e3), e3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.a>, java.util.HashMap] */
    public static AbstractC0079a N(String str) {
        AbstractC0079a aVar = (AbstractC0079a) yq.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new S9(oX.yq("not support axis: ", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, com.github.catvod.spider.merge.T9>, java.util.HashMap] */
    public static T9 SN(String str) {
        T9 t9 = (T9) SN.get(str);
        if (t9 != null) {
            return t9;
        }
        throw new jM(oX.yq("not support nodeTest: ", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.fM>] */
    public static AbstractC0101fM yq(String str) {
        AbstractC0101fM fMVar = (AbstractC0101fM) N.get(str);
        if (fMVar != null) {
            return fMVar;
        }
        throw new jM(oX.yq("not support function: ", str));
    }
}
