package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Z8 {
    private a0 yq;
    private final Rw SN = new Rw();
    private final byte[] N = new byte[4];

    private void Gc(RandomAccessFile randomAccessFile, long j) {
        if (randomAccessFile instanceof W3) {
            ((W3) randomAccessFile).N(j);
        } else {
            randomAccessFile.seek(j);
        }
    }

    private N SN(List<bA> list, Rw rw) {
        if (list == null) {
            return null;
        }
        for (bA bAVar : list) {
            if (bAVar != null && bAVar.g() == A7.SN(12)) {
                if (bAVar.Dr() != null) {
                    N n = new N();
                    byte[] Dr = bAVar.Dr();
                    n.Fz(C0136m.yq(rw.B(Dr, 0)));
                    byte[] bArr = new byte[2];
                    System.arraycopy(Dr, 2, bArr, 0, 2);
                    new String(bArr);
                    n.U(C0202x.yq(Dr[4] & 255));
                    n.E1(p0.yq(rw.B(Dr, 5)));
                    return n;
                }
                throw new RH("corrupt AES extra data records");
            }
        }
        return null;
    }

    private TM t0(List<bA> list, Rw rw, long j, long j2, long j3, int i) {
        for (bA bAVar : list) {
            if (bAVar != null && A7.SN(11) == bAVar.g()) {
                TM tm = new TM();
                byte[] Dr = bAVar.Dr();
                if (bAVar.H() <= 0) {
                    return null;
                }
                int i2 = 0;
                if (bAVar.H() > 0 && j == 4294967295L) {
                    tm.m(rw.t0(Dr, 0));
                    i2 = 8;
                }
                if (i2 < bAVar.H() && j2 == 4294967295L) {
                    tm.Fz(rw.t0(Dr, i2));
                    i2 += 8;
                }
                if (i2 < bAVar.H() && j3 == 4294967295L) {
                    tm.tO(rw.t0(Dr, i2));
                    i2 += 8;
                }
                if (i2 < bAVar.H() && i == 65535) {
                    tm.E1(rw.tF(Dr, i2));
                }
                return tm;
            }
        }
        return null;
    }

    private List<bA> yq(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < i) {
            bA bAVar = new bA();
            bAVar.Fz(this.SN.B(bArr, i2));
            int i3 = i2 + 2;
            int B = this.SN.B(bArr, i3);
            bAVar.E1(B);
            int i4 = i3 + 2;
            if (B > 0) {
                byte[] bArr2 = new byte[B];
                System.arraycopy(bArr, i4, bArr2, 0, B);
                bAVar.U(bArr2);
            }
            i2 = i4 + B;
            arrayList.add(bAVar);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private vt zH(RandomAccessFile randomAccessFile, Rw rw, H0 h0) {
        long length = randomAccessFile.length();
        if (length >= 22) {
            long j = length - 22;
            Gc(randomAccessFile, j);
            if (this.SN.N(randomAccessFile) != A7.SN(4)) {
                j = randomAccessFile.length() - 22;
                long j2 = 65536;
                if (randomAccessFile.length() < 65536) {
                    j2 = randomAccessFile.length();
                }
                while (j2 > 0 && j > 0) {
                    j--;
                    Gc(randomAccessFile, j);
                    if (this.SN.N(randomAccessFile) != A7.SN(4)) {
                        j2--;
                    }
                }
                throw new RH("Zip headers not found. Probably not a zip file");
            }
            Gc(randomAccessFile, 4 + j);
            vt vtVar = new vt();
            vtVar.Fz(rw.q(randomAccessFile));
            rw.q(randomAccessFile);
            rw.q(randomAccessFile);
            vtVar.m(rw.q(randomAccessFile));
            rw.N(randomAccessFile);
            vtVar.E1(j);
            randomAccessFile.readFully(this.N);
            boolean z = false;
            vtVar.tO(rw.t0(this.N, 0));
            int q = rw.q(randomAccessFile);
            Charset SN = h0.SN();
            if (q > 0) {
                try {
                    byte[] bArr = new byte[q];
                    randomAccessFile.readFully(bArr);
                    if (SN == null) {
                        SN = TA.N;
                    }
                    eb.N(bArr, false, SN);
                } catch (IOException unused) {
                }
            }
            a0 a0Var = this.yq;
            if (vtVar.Dr() > 0) {
                z = true;
            }
            a0Var.KJ(z);
            return vtVar;
        }
        throw new RH("Zip file size less than size of zip headers. Probably not a zip file.");
    }

    public final a0 N(RandomAccessFile randomAccessFile, H0 h0) {
        Z8 z8;
        int i;
        ArrayList arrayList;
        C0180t tVar;
        a0 a0Var;
        byte[] bArr;
        byte[] bArr2;
        NJ nj;
        Z8 z82;
        N SN;
        List<bA> list;
        Z8 z83 = this;
        if (randomAccessFile.length() >= 22) {
            a0 a0Var2 = new a0();
            z83.yq = a0Var2;
            try {
                a0Var2.M(z83.zH(randomAccessFile, z83.SN, h0));
                if (z83.yq.SN().U() == 0) {
                    return z83.yq;
                }
                a0 a0Var3 = z83.yq;
                Rw rw = z83.SN;
                long g = a0Var3.SN().g();
                jo joVar = new jo();
                z83.Gc(randomAccessFile, (((g - 4) - 8) - 4) - 4);
                char c = 1;
                if (rw.N(randomAccessFile) == A7.SN(9)) {
                    z83.yq.G(true);
                    rw.N(randomAccessFile);
                    joVar.g(rw.i(randomAccessFile));
                    rw.N(randomAccessFile);
                } else {
                    z83.yq.G(false);
                    joVar = null;
                }
                a0Var3.q(joVar);
                if (z83.yq.t0()) {
                    a0 a0Var4 = z83.yq;
                    Rw rw2 = z83.SN;
                    if (a0Var4.N() != null) {
                        long Dr = z83.yq.N().Dr();
                        if (Dr >= 0) {
                            randomAccessFile.seek(Dr);
                            NB nb = new NB();
                            if (rw2.N(randomAccessFile) == A7.SN(10)) {
                                nb.tO(rw2.i(randomAccessFile));
                                rw2.q(randomAccessFile);
                                rw2.q(randomAccessFile);
                                nb.Fz(rw2.N(randomAccessFile));
                                rw2.N(randomAccessFile);
                                rw2.i(randomAccessFile);
                                nb.m(rw2.i(randomAccessFile));
                                rw2.i(randomAccessFile);
                                nb.E1(rw2.i(randomAccessFile));
                                long H = nb.H() - 44;
                                if (H > 0) {
                                    randomAccessFile.readFully(new byte[(int) H]);
                                }
                                a0Var4.B(nb);
                                if (z83.yq.tF() == null || z83.yq.tF().Dr() <= 0) {
                                    z83.yq.KJ(false);
                                } else {
                                    z83.yq.KJ(true);
                                }
                            } else {
                                throw new RH("invalid signature for zip64 end of central directory record");
                            }
                        } else {
                            throw new RH("invalid offset for start of end of central directory record");
                        }
                    } else {
                        throw new RH("invalid zip64 end of central directory locator");
                    }
                }
                a0 a0Var5 = z83.yq;
                Rw rw3 = z83.SN;
                Charset SN2 = h0.SN();
                C0180t tVar2 = new C0180t();
                ArrayList arrayList2 = new ArrayList();
                a0 a0Var6 = z83.yq;
                long g2 = a0Var6.t0() ? a0Var6.tF().g() : a0Var6.SN().H();
                a0 a0Var7 = z83.yq;
                long U = a0Var7.t0() ? a0Var7.tF().U() : a0Var7.SN().U();
                randomAccessFile.seek(g2);
                int i2 = 2;
                byte[] bArr3 = new byte[2];
                byte[] bArr4 = new byte[4];
                int i3 = 0;
                int i4 = 0;
                while (i4 < U) {
                    NJ nj2 = new NJ();
                    int i5 = i4;
                    if (rw3.N(randomAccessFile) == A7.SN(3)) {
                        rw3.q(randomAccessFile);
                        rw3.q(randomAccessFile);
                        byte[] bArr5 = new byte[i2];
                        randomAccessFile.readFully(bArr5);
                        nj2.mG(Ya.tF(bArr5[i3], i3));
                        nj2.p(Ya.tF(bArr5[i3], 3));
                        nj2.LY(Ya.tF(bArr5[c], 3));
                        nj2.nQ((byte[]) bArr5.clone());
                        nj2.C(p0.yq(rw3.q(randomAccessFile)));
                        nj2.kR(rw3.N(randomAccessFile));
                        randomAccessFile.readFully(bArr4);
                        nj2.Q4(rw3.t0(bArr4, i3));
                        nj2.lF(rw3.M(randomAccessFile));
                        nj2.L(rw3.M(randomAccessFile));
                        int q = rw3.q(randomAccessFile);
                        nj2.j(rw3.q(randomAccessFile));
                        int q2 = rw3.q(randomAccessFile);
                        nj2.OB(rw3.q(randomAccessFile));
                        randomAccessFile.readFully(bArr3);
                        randomAccessFile.readFully(bArr4);
                        nj2.x((byte[]) bArr4.clone());
                        randomAccessFile.readFully(bArr4);
                        nj2.ue(rw3.t0(bArr4, i3));
                        if (q > 0) {
                            byte[] bArr6 = new byte[q];
                            randomAccessFile.readFully(bArr6);
                            String N = eb.N(bArr6, nj2.J(), SN2);
                            if (N.contains(":\\")) {
                                N = N.substring(N.indexOf(":\\") + i2);
                            }
                            nj2.o(N);
                        } else {
                            nj2.o(null);
                        }
                        byte[] u7 = nj2.u7();
                        String m = nj2.m();
                        nj2.w((u7[i3] != 0 && Ya.tF(u7[i3], 4)) || (u7[3] != 0 && Ya.tF(u7[3], 6)) || (m != null && (m.endsWith("/") || m.endsWith("\\"))));
                        int tO = nj2.tO();
                        if (tO <= 0) {
                            z8 = this;
                        } else {
                            if (tO < 4) {
                                if (tO > 0) {
                                    randomAccessFile.skipBytes(tO);
                                }
                                list = null;
                                z8 = this;
                            } else {
                                byte[] bArr7 = new byte[tO];
                                randomAccessFile.read(bArr7);
                                z8 = this;
                                try {
                                    list = z8.yq(bArr7, tO);
                                } catch (Exception unused) {
                                    list = Collections.emptyList();
                                }
                            }
                            nj2.XO(list);
                        }
                        if (nj2.E1() == null || nj2.E1().size() <= 0) {
                            i = i5;
                            bArr2 = bArr3;
                            bArr = bArr4;
                            arrayList = arrayList2;
                            a0Var = a0Var5;
                            tVar = tVar2;
                            nj = nj2;
                            z82 = z8;
                        } else {
                            bArr2 = bArr3;
                            bArr = bArr4;
                            a0Var = a0Var5;
                            tVar = tVar2;
                            arrayList = arrayList2;
                            nj = nj2;
                            i = i5;
                            z82 = z8;
                            TM t0 = t0(nj2.E1(), rw3, nj2.Z(), nj2.g(), nj2.cS(), nj2.cp());
                            if (t0 != null) {
                                nj.Cu(t0);
                                if (t0.U() != -1) {
                                    nj.L(t0.U());
                                }
                                if (t0.Dr() != -1) {
                                    nj.lF(t0.Dr());
                                }
                                if (t0.H() != -1) {
                                    nj.ue(t0.H());
                                }
                                if (t0.g() != -1) {
                                    nj.OB(t0.g());
                                }
                            }
                        }
                        if (!(nj.E1() == null || nj.E1().size() <= 0 || (SN = z82.SN(nj.E1(), rw3)) == null)) {
                            nj.i3(SN);
                            nj.Hj(4);
                        }
                        if (q2 > 0) {
                            byte[] bArr8 = new byte[q2];
                            randomAccessFile.readFully(bArr8);
                            eb.N(bArr8, nj.J(), SN2);
                        }
                        if (nj.R()) {
                            nj.Hj(nj.Dr() != null ? 4 : 2);
                        }
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(nj);
                        i4 = i + 1;
                        c = 1;
                        arrayList2 = arrayList3;
                        z83 = z82;
                        bArr3 = bArr2;
                        bArr4 = bArr;
                        a0Var5 = a0Var;
                        tVar2 = tVar;
                        i2 = 2;
                        i3 = 0;
                    } else {
                        StringBuilder yq = by.yq("Expected central directory entry not found (#");
                        yq.append(i5 + 1);
                        yq.append(")");
                        throw new RH(yq.toString());
                    }
                }
                a0 a0Var8 = a0Var5;
                C0180t tVar3 = tVar2;
                Z8 z84 = z83;
                tVar3.SN(arrayList2);
                T t = new T();
                if (rw3.N(randomAccessFile) == A7.SN(6)) {
                    t.g(rw3.q(randomAccessFile));
                    if (t.Dr() > 0) {
                        byte[] bArr9 = new byte[t.Dr()];
                        randomAccessFile.readFully(bArr9);
                        new String(bArr9);
                    }
                }
                a0Var8.Gc(tVar3);
                return z84.yq;
            } catch (RH e) {
                throw e;
            } catch (IOException e2) {
                e2.printStackTrace();
                throw new RH("Zip headers not found. Probably not a zip file or a corrupted zip file", (Exception) e2);
            }
        } else {
            throw new RH("Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file");
        }
    }

    public final Ki i(InputStream inputStream, Charset charset) {
        N SN;
        TM t0;
        Ki ki = new Ki();
        byte[] bArr = new byte[4];
        int SN2 = this.SN.SN(inputStream);
        if (SN2 == A7.SN(5)) {
            SN2 = this.SN.SN(inputStream);
        }
        boolean z = true;
        List<bA> list = null;
        if (SN2 != A7.SN(1)) {
            return null;
        }
        this.SN.KJ(inputStream);
        int i = 2;
        byte[] bArr2 = new byte[2];
        if (FO.F5(inputStream, bArr2) == 2) {
            ki.mG(Ya.tF(bArr2[0], 0));
            ki.p(Ya.tF(bArr2[0], 3));
            ki.LY(Ya.tF(bArr2[1], 3));
            ki.nQ((byte[]) bArr2.clone());
            ki.C(p0.yq(this.SN.KJ(inputStream)));
            ki.kR(this.SN.SN(inputStream));
            FO.F5(inputStream, bArr);
            ki.Q4(this.SN.t0(bArr, 0));
            ki.lF(this.SN.Gc(inputStream));
            ki.L(this.SN.Gc(inputStream));
            int KJ = this.SN.KJ(inputStream);
            ki.j(this.SN.KJ(inputStream));
            if (KJ > 0) {
                byte[] bArr3 = new byte[KJ];
                FO.F5(inputStream, bArr3);
                String N = eb.N(bArr3, ki.J(), charset);
                StringBuilder yq = by.yq(":");
                yq.append(System.getProperty("file.separator"));
                if (N.contains(yq.toString())) {
                    StringBuilder yq2 = by.yq(":");
                    yq2.append(System.getProperty("file.separator"));
                    N = N.substring(N.indexOf(yq2.toString()) + 2);
                }
                ki.o(N);
                if (!N.endsWith("/") && !N.endsWith("\\")) {
                    z = false;
                }
                ki.w(z);
            } else {
                ki.o(null);
            }
            int tO = ki.tO();
            if (tO > 0) {
                if (tO >= 4) {
                    byte[] bArr4 = new byte[tO];
                    FO.F5(inputStream, bArr4);
                    try {
                        list = yq(bArr4, tO);
                    } catch (Exception unused) {
                        list = Collections.emptyList();
                    }
                } else if (tO > 0) {
                    inputStream.skip(tO);
                }
                ki.XO(list);
            }
            Rw rw = this.SN;
            if (!(ki.E1() == null || ki.E1().size() <= 0 || (t0 = t0(ki.E1(), rw, ki.Z(), ki.g(), 0L, 0)) == null)) {
                ki.Cu(t0);
                if (t0.U() != -1) {
                    ki.L(t0.U());
                }
                if (t0.Dr() != -1) {
                    ki.lF(t0.Dr());
                }
            }
            Rw rw2 = this.SN;
            if (!(ki.E1() == null || ki.E1().size() <= 0 || (SN = SN(ki.E1(), rw2)) == null)) {
                ki.i3(SN);
                ki.Hj(4);
            }
            if (ki.R() && ki.Fz() != 4) {
                if (Ya.tF(ki.k()[0], 6)) {
                    i = 3;
                }
                ki.Hj(i);
            }
            return ki;
        }
        throw new RH("Could not read enough bytes for generalPurposeFlags");
    }

    public final C0173rT tF(InputStream inputStream, boolean z) {
        long j;
        C0173rT rTVar = new C0173rT();
        byte[] bArr = new byte[4];
        FO.F5(inputStream, bArr);
        long t0 = this.SN.t0(bArr, 0);
        if (t0 == A7.SN(2)) {
            FO.F5(inputStream, bArr);
            rTVar.Fz(this.SN.t0(bArr, 0));
        } else {
            rTVar.Fz(t0);
        }
        if (z) {
            rTVar.U(this.SN.zH(inputStream));
            j = this.SN.zH(inputStream);
        } else {
            rTVar.U(this.SN.SN(inputStream));
            j = this.SN.SN(inputStream);
        }
        rTVar.E1(j);
        return rTVar;
    }
}
