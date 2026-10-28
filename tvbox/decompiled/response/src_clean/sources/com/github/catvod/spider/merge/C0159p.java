package com.github.catvod.spider.merge;

import com.github.catvod.spider.ProxyOrigin;
import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
/* renamed from: com.github.catvod.spider.merge.p  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0159p {
    private static final UUID N;
    private static final UUID SN;
    public static final UUID i;
    private static final UUID tF;
    private static final List<UUID> zH;
    private final lF yq = lF.yq();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.p$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public interface yq {
        int size();

        int yq(char[] cArr, int i);
    }

    static {
        UUID fromString = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3");
        UUID fromString2 = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61");
        SN = fromString2;
        UUID fromString3 = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E");
        N = fromString3;
        UUID fromString4 = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089");
        tF = fromString4;
        ArrayList arrayList = new ArrayList();
        zH = arrayList;
        arrayList.add(fromString);
        arrayList.add(fromString2);
        arrayList.add(fromString3);
        arrayList.add(fromString4);
        i = fromString4;
    }

    private int N(char[] cArr, int i2, List<C0184ta> list, yq yqVar) {
        int i3 = i2 + 1;
        char c = cArr[i2];
        for (int i4 = 0; i4 < c; i4++) {
            char c2 = cArr[i3];
            int i5 = i3 + 1;
            C0184ta taVar = new C0184ta(new int[0]);
            list.add(taVar);
            i3 = i5 + 1;
            if (cArr[i5] != 0) {
                taVar.yq(-1);
            }
            for (int i6 = 0; i6 < c2; i6++) {
                int yq2 = yqVar.yq(cArr, i3);
                int size = i3 + yqVar.size();
                int yq3 = yqVar.yq(cArr, size);
                i3 = size + yqVar.size();
                taVar.SN(yq2, yq3);
            }
        }
        return i3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.util.UUID>, java.util.ArrayList] */
    protected static boolean tF(UUID uuid, UUID uuid2) {
        ?? r0 = zH;
        int indexOf = r0.indexOf(uuid);
        return indexOf >= 0 && r0.indexOf(uuid2) >= indexOf;
    }

    protected static long zH(char[] cArr, int i2) {
        int i3 = i2 + 2;
        return (((cArr[i3 + 1] << 16) | cArr[i3]) << 32) | ((cArr[i2] | (cArr[i2 + 1] << 16)) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.github.catvod.spider.merge.p] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.github.catvod.spider.merge.V2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [com.github.catvod.spider.merge.xe] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v43, types: [int, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45, types: [com.github.catvod.spider.merge.ur] */
    /* JADX WARN: Type inference failed for: r4v46, types: [com.github.catvod.spider.merge.Pt] */
    /* JADX WARN: Type inference failed for: r4v47, types: [com.github.catvod.spider.merge.Wh] */
    /* JADX WARN: Type inference failed for: r4v48, types: [com.github.catvod.spider.merge.gQ] */
    /* JADX WARN: Type inference failed for: r4v49, types: [com.github.catvod.spider.merge.zW] */
    /* JADX WARN: Type inference failed for: r4v50, types: [com.github.catvod.spider.merge.lx] */
    /* JADX WARN: Type inference failed for: r4v51, types: [com.github.catvod.spider.merge.Gk] */
    /* JADX WARN: Type inference failed for: r4v52, types: [com.github.catvod.spider.merge.S5] */
    /* JADX WARN: Type inference failed for: r4v63, types: [com.github.catvod.spider.merge.Xo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v69, types: [com.github.catvod.spider.merge.V2] */
    /* JADX WARN: Type inference failed for: r5v25, types: [com.github.catvod.spider.merge.N2[]] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.List<com.github.catvod.spider.merge.xc>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.List<com.github.catvod.spider.merge.V2>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List<java.util.UUID>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.List<com.github.catvod.spider.merge.Xo>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    public final N0 SN(char[] cArr) {
        ?? r4;
        xc xcVar;
        AbstractC0137mG mGVar;
        AbstractC0137mG mGVar2;
        char[] cArr2 = (char[]) cArr.clone();
        for (int i2 = 1; i2 < cArr2.length; i2++) {
            cArr2[i2] = (char) (cArr2[i2] - 2);
        }
        char c = cArr2[0];
        if (c == 3) {
            UUID uuid = new UUID(zH(cArr2, 5), zH(cArr2, 1));
            if (zH.contains(uuid)) {
                boolean tF2 = tF(SN, uuid);
                boolean tF3 = tF(N, uuid);
                N0 n0 = new N0(kR.i(2)[cArr2[9]], cArr2[10]);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                char c2 = cArr2[11];
                char c3 = '\f';
                int i3 = 0;
                int i4 = 12;
                while (i3 < c2) {
                    int i5 = i4 + 1;
                    char c4 = cArr2[i4];
                    if (c4 == 0) {
                        n0.yq(null);
                        i4 = i5;
                    } else {
                        int i6 = i5 + 1;
                        char c5 = cArr2[i5];
                        if (c5 == 65535) {
                            c5 = 65535;
                        }
                        switch (c4) {
                            case ProxyOrigin.Gc /* 0 */:
                                mGVar = null;
                                break;
                            case 1:
                                mGVar2 = new Gj();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case 2:
                                mGVar2 = new xe();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case 3:
                                mGVar2 = new C0157og();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case 4:
                                mGVar2 = new mc();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case 5:
                                mGVar2 = new gh();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case 6:
                                mGVar2 = new C0074Xo();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case 7:
                                mGVar2 = new Tq();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case '\b':
                                mGVar2 = new F();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case '\t':
                                mGVar2 = new TZ();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case '\n':
                                mGVar2 = new oE();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case 11:
                                mGVar2 = new rV();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            case '\f':
                                mGVar2 = new O2();
                                mGVar2.N = c5;
                                mGVar = mGVar2;
                                break;
                            default:
                                throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified state type %d is not valid.", Integer.valueOf(c4)));
                        }
                        if (c4 == c3) {
                            i6++;
                            arrayList.add(new C0069Py((O2) mGVar, Integer.valueOf(cArr2[i6])));
                        } else if (mGVar instanceof AbstractC0094e) {
                            i6++;
                            arrayList2.add(new C0069Py((AbstractC0094e) mGVar, Integer.valueOf(cArr2[i6])));
                        }
                        n0.yq(mGVar);
                        i4 = i6;
                    }
                    i3++;
                    c3 = '\f';
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0069Py py = (C0069Py) it.next();
                    ((O2) py.yq).t0 = (AbstractC0137mG) n0.yq.get(((Integer) py.SN).intValue());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C0069Py py2 = (C0069Py) it2.next();
                    ((AbstractC0094e) py2.yq).M = (F) n0.yq.get(((Integer) py2.SN).intValue());
                }
                char c6 = cArr2[i4];
                int i7 = 0;
                int i8 = i4 + 1;
                while (i7 < c6) {
                    ?? r42 = (V2) n0.yq.get(cArr2[i8 + 1]);
                    r42.Gc = true;
                    i7++;
                    i8 = r42;
                }
                if (tF2) {
                    int i9 = (i8 == 1 ? 1 : 0) + 1;
                    char c7 = cArr2[i8 == 1 ? 1 : 0];
                    int i10 = 0;
                    int i11 = i9;
                    while (i10 < c7) {
                        ?? r1 = (xe) n0.yq.get(cArr2[i11 + 1]);
                        r1.Gc = true;
                        i10++;
                        i11 = r1;
                    }
                    i8 = i11;
                }
                int i12 = (i8 == 1 ? 1 : 0) + 1;
                char c8 = cArr2[i8 == 1 ? 1 : 0];
                if (n0.zH == 1) {
                    n0.t0 = new int[c8];
                }
                n0.N = new xe[c8];
                for (int i13 = 0; i13 < c8; i13++) {
                    int i14 = i12 + 1;
                    n0.N[i13] = (xe) n0.yq.get(cArr2[i12]);
                    if (n0.zH == 1) {
                        i12 = i14 + 1;
                        char c9 = cArr2[i14];
                        if (c9 == 65535) {
                            c9 = 65535;
                        }
                        n0.t0[i13] = c9;
                        if (!tF(N, uuid)) {
                            i14 = i12 + 1;
                            char c10 = cArr2[i12];
                        }
                    }
                    i12 = i14;
                }
                n0.tF = new Tq[c8];
                Iterator it3 = n0.yq.iterator();
                while (it3.hasNext()) {
                    AbstractC0137mG mGVar3 = (AbstractC0137mG) it3.next();
                    if (mGVar3 instanceof Tq) {
                        Tq tq = (Tq) mGVar3;
                        Tq[] tqArr = n0.tF;
                        int i15 = mGVar3.N;
                        tqArr[i15] = tq;
                        n0.N[i15].t0 = tq;
                    }
                }
                int i16 = i12 + 1;
                char c11 = cArr2[i12];
                int i17 = 0;
                int i18 = i16;
                while (i17 < c11) {
                    char c12 = cArr2[i18 + 1];
                    ?? r9 = n0.M;
                    ?? r43 = (C0074Xo) n0.yq.get(c12);
                    r9.add(r43);
                    i17++;
                    i18 = r43;
                }
                ArrayList arrayList3 = new ArrayList();
                int N2 = N(cArr2, i18, arrayList3, new C());
                if (tF(tF, uuid)) {
                    N2 = N(cArr2, N2, arrayList3, new Q4());
                }
                int i19 = N2 + 1;
                char c13 = cArr2[N2];
                for (int i20 = 0; i20 < c13; i20++) {
                    char c14 = cArr2[i19];
                    char c15 = cArr2[i19 + 1];
                    char c16 = cArr2[i19 + 2];
                    char c17 = cArr2[i19 + 3];
                    char c18 = cArr2[i19 + 4];
                    char c19 = cArr2[i19 + 5];
                    AbstractC0137mG mGVar4 = (AbstractC0137mG) n0.yq.get(c15);
                    switch (c16) {
                        case 1:
                            xcVar = new C0213zn(mGVar4);
                            continue;
                            ((AbstractC0137mG) n0.yq.get(c14)).yq(xcVar);
                            i19 += 6;
                        case 2:
                            if (c19 != 0) {
                                xcVar = new JN(mGVar4, -1, c18);
                                continue;
                            } else {
                                xcVar = new JN(mGVar4, c17, c18);
                            }
                            ((AbstractC0137mG) n0.yq.get(c14)).yq(xcVar);
                            i19 += 6;
                        case 3:
                            xcVar = new C0133lY((xe) n0.yq.get(c17), c19, mGVar4);
                            break;
                        case 4:
                            xcVar = new RR(mGVar4, c17, c18, c19 != 0);
                            break;
                        case 5:
                            if (c19 != 0) {
                                xcVar = new Rx(mGVar4, -1);
                                break;
                            } else {
                                xcVar = new Rx(mGVar4, c17);
                                break;
                            }
                        case 6:
                            xcVar = new cS(mGVar4, c17, c18);
                            break;
                        case 7:
                            xcVar = new pq(mGVar4, (C0184ta) arrayList3.get(c17));
                            break;
                        case '\b':
                            xcVar = new di(mGVar4, (C0184ta) arrayList3.get(c17));
                            break;
                        case '\t':
                            xcVar = new C0164py(mGVar4);
                            break;
                        case '\n':
                            xcVar = new Cw(mGVar4, c17);
                            break;
                        default:
                            throw new IllegalArgumentException("The specified transition type is not valid.");
                    }
                    ((AbstractC0137mG) n0.yq.get(c14)).yq(xcVar);
                    i19 += 6;
                }
                Iterator it4 = n0.yq.iterator();
                while (it4.hasNext()) {
                    AbstractC0137mG mGVar5 = (AbstractC0137mG) it4.next();
                    for (int i21 = 0; i21 < mGVar5.SN(); i21++) {
                        xc tF4 = mGVar5.tF(i21);
                        if (tF4 instanceof C0133lY) {
                            C0133lY lYVar = (C0133lY) tF4;
                            xe[] xeVarArr = n0.N;
                            int i22 = lYVar.yq.N;
                            if (!xeVarArr[i22].Gc || lYVar.SN != 0) {
                                i22 = -1;
                            }
                            n0.tF[lYVar.yq.N].yq(new C0213zn(lYVar.N, i22));
                        }
                    }
                }
                Iterator it5 = n0.yq.iterator();
                while (it5.hasNext()) {
                    AbstractC0137mG mGVar6 = (AbstractC0137mG) it5.next();
                    if (mGVar6 instanceof AbstractC0094e) {
                        AbstractC0094e eVar = (AbstractC0094e) mGVar6;
                        F f = eVar.M;
                        if (f == null) {
                            throw new IllegalStateException();
                        } else if (f.t0 == null) {
                            f.t0 = eVar;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (mGVar6 instanceof rV) {
                        rV rVVar = (rV) mGVar6;
                        for (int i23 = 0; i23 < rVVar.SN(); i23++) {
                            AbstractC0137mG mGVar7 = rVVar.tF(i23).yq;
                            if (mGVar7 instanceof mc) {
                                ((mc) mGVar7).KJ = rVVar;
                            }
                        }
                    } else if (mGVar6 instanceof TZ) {
                        TZ tz = (TZ) mGVar6;
                        for (int i24 = 0; i24 < tz.SN(); i24++) {
                            AbstractC0137mG mGVar8 = tz.tF(i24).yq;
                            if (mGVar8 instanceof oE) {
                                ((oE) mGVar8).M = tz;
                            }
                        }
                    }
                }
                int i25 = i19 + 1;
                char c20 = cArr2[i19];
                int i26 = 1;
                int i27 = i25;
                while (i26 <= c20) {
                    ?? r12 = (V2) n0.yq.get(cArr2[i27 + 1]);
                    n0.SN.add(r12);
                    r12.t0 = i26 - 1;
                    i26++;
                    i27 = r12;
                }
                if (n0.zH == 1) {
                    if (tF3) {
                        int i28 = i27 + 1;
                        n0.Gc = new N2[cArr2[i27]];
                        int i29 = 0;
                        int i30 = i28;
                        while (i29 < n0.Gc.length) {
                            int i31 = i30 + 1;
                            Jy jy = Jy.values()[cArr2[i30]];
                            int i32 = i31 + 1;
                            char c21 = cArr2[i31];
                            if (c21 == 65535) {
                                c21 = 65535;
                            }
                            ?? r44 = i32 + 1;
                            char c22 = cArr2[i32];
                            if (c22 == 65535) {
                                c22 = 65535;
                            }
                            switch (r44.ordinal()) {
                                case ProxyOrigin.Gc /* 0 */:
                                    r4 = new ur(c21);
                                    break;
                                case 1:
                                    r4 = new Pt(c21, c22);
                                    break;
                                case 2:
                                    r4 = new Wh(c21);
                                    break;
                                case 3:
                                    r4 = gQ.yq;
                                    break;
                                case 4:
                                    r4 = zW.yq;
                                    break;
                                case 5:
                                    r4 = new C0135lx(c21);
                                    break;
                                case 6:
                                    r4 = Gk.yq;
                                    break;
                                case 7:
                                    r4 = new S5(c21);
                                    break;
                                default:
                                    throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified lexer action type %d is not valid.", new Object[]{r44}));
                            }
                            n0.Gc[i29] = r4;
                            i29++;
                            i30 = r4;
                        }
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it6 = n0.yq.iterator();
                        while (it6.hasNext()) {
                            AbstractC0137mG mGVar9 = (AbstractC0137mG) it6.next();
                            for (int i33 = 0; i33 < mGVar9.SN(); i33++) {
                                xc tF5 = mGVar9.tF(i33);
                                if (tF5 instanceof cS) {
                                    cS cSVar = (cS) tF5;
                                    int i34 = cSVar.SN;
                                    Pt pt = new Pt(i34, cSVar.N);
                                    mGVar9.zH.set(i33, new cS(tF5.yq, i34, arrayList4.size()));
                                    arrayList4.add(pt);
                                }
                            }
                        }
                        n0.Gc = (N2[]) arrayList4.toArray(new N2[arrayList4.size()]);
                    }
                }
                Iterator it7 = n0.yq.iterator();
                while (it7.hasNext()) {
                    AbstractC0137mG mGVar10 = (AbstractC0137mG) it7.next();
                    if ((mGVar10 instanceof oE) && n0.N[mGVar10.N].Gc) {
                        AbstractC0137mG mGVar11 = mGVar10.tF(mGVar10.SN() - 1).yq;
                        if ((mGVar11 instanceof O2) && mGVar11.tF && (mGVar11.tF(0).yq instanceof Tq)) {
                            ((oE) mGVar10).KJ = true;
                        }
                    }
                }
                Objects.requireNonNull(this.yq);
                i(n0);
                Objects.requireNonNull(this.yq);
                return n0;
            }
            throw new UnsupportedOperationException(new InvalidClassException(N0.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with UUID %s (expected %s or a legacy UUID).", uuid, i)));
        }
        throw new UnsupportedOperationException(new InvalidClassException(N0.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(c), 3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fe, code lost:
        if (r0.t0 < 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0109, code lost:
        if ((r0 instanceof com.github.catvod.spider.merge.Tq) == false) goto L85;
     */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.github.catvod.spider.merge.mG>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void i(com.github.catvod.spider.merge.N0 r7) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0159p.i(com.github.catvod.spider.merge.N0):void");
    }

    protected final void yq(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }
}
