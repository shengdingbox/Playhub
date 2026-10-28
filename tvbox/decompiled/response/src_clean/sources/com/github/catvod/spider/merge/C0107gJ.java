package com.github.catvod.spider.merge;

import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
/* renamed from: com.github.catvod.spider.merge.gJ  reason: case insensitive filesystem */
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class C0107gJ {
    public static final String yq = C0107gJ.class.getSimpleName() + " --> ";
    public static final Charset SN = Charset.forName("UTF-8");

    private static void N(Exception exc) {
        exc.printStackTrace();
        String str = yq;
        Log.e(str, str + exc);
    }

    public static String SN(String str, String str2) {
        PublicKey publicKey;
        try {
            byte[] bytes = str.getBytes(SN);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
            } catch (Exception e) {
                N(e);
                publicKey = null;
            }
            cipher.init(1, publicKey);
            int length = bytes.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 > 0) {
                    byte[] doFinal = i3 > 117 ? cipher.doFinal(bytes, i, 117) : cipher.doFinal(bytes, i, i3);
                    byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                    i2++;
                    i = i2 * 117;
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return Base64.encodeToString(byteArray, 2);
                }
            }
        } catch (Exception e2) {
            N(e2);
            return null;
        }
    }

    public static String yq(String str, String str2) {
        PrivateKey privateKey;
        byte[] decode = Base64.decode(str, 2);
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            try {
                privateKey = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 2)));
            } catch (Exception e) {
                N(e);
                privateKey = null;
            }
            cipher.init(2, privateKey);
            int length = decode.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 > 0) {
                    byte[] doFinal = i3 > 128 ? cipher.doFinal(decode, i, 128) : cipher.doFinal(decode, i, i3);
                    byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                    i2++;
                    i = i2 * 128;
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return new String(byteArray, SN);
                }
            }
        } catch (Exception e2) {
            N(e2);
            return null;
        }
    }
}
