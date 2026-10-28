package com.github.catvod.spider.merge;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.github.catvod.spider.merge.db  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0092db {
    private String N;
    private int SN;
    private Mac yq;

    public C0092db(String str) {
        this.N = str;
        try {
            Mac mac = Mac.getInstance(str);
            this.yq = mac;
            this.SN = mac.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final int N() {
        return this.SN;
    }

    public final byte[] SN(byte[] bArr) {
        return this.yq.doFinal(bArr);
    }

    public final void tF(byte[] bArr) {
        try {
            this.yq.init(new SecretKeySpec(bArr, this.N));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    public final byte[] yq() {
        return this.yq.doFinal();
    }

    public final void zH(byte[] bArr, int i, int i2) {
        try {
            this.yq.update(bArr, i, i2);
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }
}
