package com.github.catvod.spider.merge;

import java.util.List;
/* renamed from: com.github.catvod.spider.merge.j  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public abstract class AbstractC0124j extends Hj {
    private TM B;
    private boolean F5;
    private N G;
    private boolean G4;
    private String Gc;
    private boolean M;
    private long N;
    private int SN;
    private List<bA> dT;
    private boolean q;
    private int t0;
    private byte[] yq;
    private long tF = 0;
    private long zH = 0;
    private long i = 0;
    private int KJ = 1;

    public final void C(int i) {
        this.SN = i;
    }

    public final void Cu(TM tm) {
        this.B = tm;
    }

    public final N Dr() {
        return this.G;
    }

    public final List<bA> E1() {
        return this.dT;
    }

    public final int Fz() {
        return this.KJ;
    }

    public final int H() {
        return this.SN;
    }

    public final void Hj(int i) {
        this.KJ = i;
    }

    public final boolean J() {
        return this.G4;
    }

    public final void L(long j) {
        this.i = j;
    }

    public final void LY(boolean z) {
        this.G4 = z;
    }

    public final boolean N0() {
        return this.F5;
    }

    public final void Q4(long j) {
        this.tF = j;
    }

    public final boolean R() {
        return this.M;
    }

    public final long RQ() {
        return this.N;
    }

    public final long U() {
        return this.tF;
    }

    public final TM V() {
        return this.B;
    }

    public final void XO(List<bA> list) {
        this.dT = list;
    }

    public final long Z() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof AbstractC0124j)) {
            return this.Gc.equals(((AbstractC0124j) obj).Gc);
        }
        return false;
    }

    public final long g() {
        return this.zH;
    }

    public final void i3(N n) {
        this.G = n;
    }

    public final void j(int i) {
        this.t0 = i;
    }

    public final byte[] k() {
        return this.yq;
    }

    public final void kR(long j) {
        this.N = j;
    }

    public final void lF(long j) {
        this.zH = j;
    }

    public final String m() {
        return this.Gc;
    }

    public final void mG(boolean z) {
        this.M = z;
    }

    public final void nQ(byte[] bArr) {
        this.yq = bArr;
    }

    public final void o(String str) {
        this.Gc = str;
    }

    public final void p(boolean z) {
        this.q = z;
    }

    public final int tO() {
        return this.t0;
    }

    public final void w(boolean z) {
        this.F5 = z;
    }

    public final boolean xU() {
        return this.q;
    }
}
