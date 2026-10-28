package com.github.catvod.spider.merge;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
/* renamed from: com.github.catvod.spider.merge.l  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0131l<T> {
    private final ExecutorService N;
    private final boolean SN = false;
    private final Z2 yq;

    /* renamed from: com.github.catvod.spider.merge.l$SN */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN {
        private final ExecutorService SN;
        private final Z2 yq;

        public SN(ExecutorService executorService, Z2 z2) {
            this.SN = executorService;
            this.yq = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.l$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public final class yq implements Runnable {
        final /* synthetic */ Object yq;

        yq(Object obj) {
            this.yq = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AbstractC0131l lVar = AbstractC0131l.this;
                lVar.i(this.yq, lVar.yq);
            } catch (RH unused) {
            } catch (Throwable th) {
                AbstractC0131l.this.N.shutdown();
                throw th;
            }
            AbstractC0131l.this.N.shutdown();
        }
    }

    public AbstractC0131l(SN sn) {
        this.yq = sn.yq;
        this.N = sn.SN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(T t, Z2 z2) {
        try {
            zH(t, z2);
            z2.yq();
        } catch (RH e) {
            z2.SN();
            throw e;
        } catch (Exception e2) {
            z2.SN();
            throw new RH(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t0() {
        Objects.requireNonNull(this.yq);
    }

    public final void tF(T t) {
        if (!this.SN || !kR.tF(2, this.yq.tF())) {
            this.yq.N();
            this.yq.zH();
            Objects.requireNonNull(this.yq);
            if (this.SN) {
                long j = 0;
                for (NJ nj : ((I8) this).M().yq().yq()) {
                    j += (nj.V() == null || nj.V().U() <= 0) ? nj.Z() : nj.V().U();
                }
                this.yq.i(j);
                this.N.execute(new yq(t));
                return;
            }
            i(t, this.yq);
            return;
        }
        throw new RH("invalid operation - Zip4j is in busy state");
    }

    protected abstract void zH(T t, Z2 z2);
}
