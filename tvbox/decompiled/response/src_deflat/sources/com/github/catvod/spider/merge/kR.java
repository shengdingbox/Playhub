package com.github.catvod.spider.merge;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class kR {
    public static final /* synthetic */ int[] yq = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

    public static int N(Collection collection) {
        BitSet bitSet = new BitSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bitSet.set(((BitSet) it.next()).nextSetBit(0));
            if (bitSet.cardinality() > 1) {
                return 0;
            }
        }
        return bitSet.nextSetBit(0);
    }

    public static Collection SN(i3 i3Var) {
        CK ck = new CK();
        Iterator<J> it = i3Var.iterator();
        while (it.hasNext()) {
            J next = it.next();
            BitSet bitSet = (BitSet) ck.get(next);
            if (bitSet == null) {
                bitSet = new BitSet();
                ck.put(next, bitSet);
            }
            bitSet.set(next.SN);
        }
        return ck.values();
    }

    public static /* synthetic */ int[] i(int i) {
        int[] iArr = new int[i];
        System.arraycopy(yq, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean tF(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static boolean yq(i3 i3Var) {
        Iterator<J> it = i3Var.iterator();
        while (it.hasNext()) {
            if (!(it.next().yq instanceof Tq)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int zH(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }
}
