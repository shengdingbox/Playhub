package com.github.catvod.spider.merge;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.tl  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0186tl<InputT, OutputT> extends AbstractC0070Qz<OutputT> {
    private static final Logger dT = Logger.getLogger(AbstractC0186tl.class.getName());
    private E3<? extends d7<? extends InputT>> B;
    private final boolean G = false;
    private final boolean G4 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.github.catvod.spider.merge.tl$yq */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public enum yq {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0186tl(E3 e3) {
        super(e3.size());
        this.B = e3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dr(E3<? extends Future<? extends InputT>> e3) {
        Throwable th;
        int s = s();
        C0072So.t0(s >= 0, "Less than 0 remaining futures");
        if (s == 0) {
            if (e3 != null) {
                x1<? extends Future<? extends InputT>> zH = e3.iterator();
                while (zH.hasNext()) {
                    Future<? extends InputT> next = zH.next();
                    if (!next.isCancelled()) {
                        try {
                            X.g(next);
                            Zm();
                        } catch (ExecutionException e) {
                            th = e.getCause();
                            H(th);
                        } catch (Throwable th2) {
                            th = th2;
                            H(th);
                        }
                    }
                }
            }
            g1();
            g();
            Fz(yq.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    private void H(Throwable th) {
        boolean z;
        Objects.requireNonNull(th);
        String str = "Input Future failed with Error";
        if (this.G && !g9(th)) {
            Set<Throwable> n = n();
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = true;
                    break;
                } else if (!n.add(th2)) {
                    z = false;
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            if (z) {
                if (!(th instanceof Error)) {
                    str = "Got more than one input Future failure. Logging failures after the first";
                }
                dT.log(Level.SEVERE, str, th);
                return;
            }
        }
        boolean z2 = th instanceof Error;
        if (z2) {
            if (!z2) {
                str = "Got more than one input Future failure. Logging failures after the first";
            }
            dT.log(Level.SEVERE, str, th);
        }
    }

    public static void un(AbstractC0186tl tlVar, d7 d7Var, int i) {
        Throwable th;
        Objects.requireNonNull(tlVar);
        try {
            if (d7Var.isCancelled()) {
                tlVar.B = null;
                tlVar.cancel(false);
            } else {
                try {
                    X.g(d7Var);
                    tlVar.Zm();
                } catch (ExecutionException e) {
                    th = e.getCause();
                    tlVar.H(th);
                } catch (Throwable th2) {
                    th = th2;
                    tlVar.H(th);
                }
            }
        } finally {
            tlVar.Dr(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Fz(yq yqVar) {
        this.B = null;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0070Qz
    final void O(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (!isCancelled()) {
            Throwable SN = SN();
            Objects.requireNonNull(SN);
            while (SN != null && set.add(SN)) {
                SN = SN.getCause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U() {
        yE yEVar = yE.yq;
        Objects.requireNonNull(this.B);
        if (this.B.isEmpty()) {
            g();
        } else if (this.G) {
            final int i = 0;
            x1<? extends d7<? extends InputT>> zH = this.B.iterator();
            while (zH.hasNext()) {
                final d7<? extends InputT> next = zH.next();
                i++;
                next.yq(new Runnable() { // from class: com.github.catvod.spider.merge.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0186tl.un(AbstractC0186tl.this, next, i);
                    }
                }, yEVar);
            }
        } else {
            final E3<? extends d7<? extends InputT>> e3 = this.G4 ? this.B : null;
            Runnable ueVar = new Runnable() { // from class: com.github.catvod.spider.merge.ue
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0186tl.this.Dr(e3);
                }
            };
            x1<? extends d7<? extends InputT>> zH2 = this.B.iterator();
            while (zH2.hasNext()) {
                zH2.next().yq(ueVar, yEVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.AbstractC0154o
    public final String W() {
        E3<? extends d7<? extends InputT>> e3 = this.B;
        if (e3 == null) {
            return super.W();
        }
        String valueOf = String.valueOf(e3);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    abstract void Zm();

    abstract void g();

    @Override // com.github.catvod.spider.merge.AbstractC0154o
    protected final void q() {
        E3<? extends d7<? extends InputT>> e3 = this.B;
        Fz(yq.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (e3 != null)) {
            boolean xa = xa();
            x1<? extends d7<? extends InputT>> zH = e3.iterator();
            while (zH.hasNext()) {
                zH.next().cancel(xa);
            }
        }
    }
}
