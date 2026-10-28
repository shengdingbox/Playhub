package com.github.catvod.utils;

import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 加解密与摘要工具。
 * <p>对应原来的混淆包装：{@code Rc.zH/t0/v}（摘要与十六进制）、
 * {@code A4.SN}（AES 解密）、{@code C0107gJ.SN/yq}（RSA 加解密）。
 */
public final class Crypto {

    private Crypto() {
    }

    /** MD5 摘要，返回小写十六进制（不足 32 位左侧补 '0'）。 */
    public static String md5(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1,
                    MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception e) {
            return "";
        }
    }

    /** 字节数组转十六进制字符串。 */
    public static String hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(b & 255);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }

    /** 十六进制字符串转字节数组。 */
    public static byte[] unhex(String hex) {
        int length = hex.length();
        byte[] out = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            out[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
        }
        return out;
    }

    /** AES/CBC/PKCS7Padding 解密。 */
    public static byte[] aesDecrypt(byte[] data, byte[] key, byte[] iv) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
            return cipher.doFinal(data);
        } catch (Exception e) {
            return null;
        }
    }

    /** RSA 公钥加密：入参明文按 117 字节分段，输出 Base64。 */
    public static String rsaEncrypt(String str, String publicKeyBase64) {
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, KeyFactory.getInstance("RSA")
                    .generatePublic(new X509EncodedKeySpec(Base64.decode(publicKeyBase64, 2))));
            int length = bytes.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offset = 0;
            while (true) {
                int remain = length - offset;
                if (remain <= 0) {
                    byte[] result = out.toByteArray();
                    out.close();
                    return Base64.encodeToString(result, 2);
                }
                byte[] block = remain > 117 ? cipher.doFinal(bytes, offset, 117) : cipher.doFinal(bytes, offset, remain);
                out.write(block, 0, block.length);
                offset += 117;
            }
        } catch (Exception e) {
            return null;
        }
    }

    /** RSA 私钥解密：入参 Base64 密文按 128 字节分段，输出 UTF-8 明文。 */
    public static String rsaDecrypt(String str, String privateKeyBase64) {
        byte[] decode = Base64.decode(str, 2);
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, KeyFactory.getInstance("RSA")
                    .generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(privateKeyBase64, 2))));
            int length = decode.length;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int offset = 0;
            while (true) {
                int remain = length - offset;
                if (remain <= 0) {
                    byte[] result = out.toByteArray();
                    out.close();
                    return new String(result, StandardCharsets.UTF_8);
                }
                byte[] block = remain > 128 ? cipher.doFinal(decode, offset, 128) : cipher.doFinal(decode, offset, remain);
                out.write(block, 0, block.length);
                offset += 128;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
