package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class WU extends Y4 {
    int SN = 0;
    final ArrayList<Y4> yq = new ArrayList<>();

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class SN extends WU {
        /* JADX INFO: Access modifiers changed from: package-private */
        public SN() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SN(Y4... y4Arr) {
            List asList = Arrays.asList(y4Arr);
            if (this.SN > 1) {
                this.yq.add(new yq(asList));
            } else {
                this.yq.addAll(asList);
            }
            SN();
        }

        public final String toString() {
            return P1.i(this.yq, ", ");
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            for (int i = 0; i < this.SN; i++) {
                if (this.yq.get(i).yq(hNVar, hNVar2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static final class yq extends WU {
        /* JADX INFO: Access modifiers changed from: package-private */
        public yq(Collection<Y4> collection) {
            this.yq.addAll(collection);
            SN();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public yq(Y4... y4Arr) {
            this(Arrays.asList(y4Arr));
        }

        public final String toString() {
            return P1.i(this.yq, "");
        }

        @Override // com.github.catvod.spider.merge.Y4
        public final boolean yq(hN hNVar, hN hNVar2) {
            for (int i = this.SN - 1; i >= 0; i--) {
                if (!this.yq.get(i).yq(hNVar, hNVar2)) {
                    return false;
                }
            }
            return true;
        }
    }

    WU() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void SN() {
        this.SN = this.yq.size();
    }
}
