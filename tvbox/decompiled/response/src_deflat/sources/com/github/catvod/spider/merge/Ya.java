package com.github.catvod.spider.merge;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Ya implements HA {
    public static boolean N(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String SN(String str) {
        int i = xv.yq;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String i(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-1 算法不存在", e);
        }
    }

    public static boolean tF(byte b, int i) {
        return ((1 << i) & ((long) b)) != 0;
    }

    public static String zH(String str, Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    logger.log(level, valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + String.valueOf(sb3).length() + 9);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb5.append((CharSequence) str, i3, indexOf);
            i++;
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
        }
        sb5.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb5.append(" [");
            int i4 = i + 1;
            sb5.append(objArr[i]);
            while (i4 < objArr.length) {
                sb5.append(", ");
                i4++;
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    @Override // com.github.catvod.spider.merge.HA
    public HG yq(String str, i7 i7Var, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            int i3 = 4;
            EnumC0209zK zKVar = EnumC0209zK.ERROR_CORRECTION;
            int t0 = map.containsKey(zKVar) ? C0136m.t0(map.get(zKVar).toString()) : 1;
            EnumC0209zK zKVar2 = EnumC0209zK.MARGIN;
            if (map.containsKey(zKVar2)) {
                i3 = Integer.parseInt(map.get(zKVar2).toString());
            }
            RT yq = CT.N(str, t0, map).yq();
            if (yq != null) {
                int zH = yq.zH();
                int tF = yq.tF();
                int i4 = i3 << 1;
                int i5 = zH + i4;
                int i6 = i4 + tF;
                int max = Math.max(i, i5);
                int max2 = Math.max(i2, i6);
                int min = Math.min(max / i5, max2 / i6);
                int i7 = (max - (zH * min)) / 2;
                int i8 = (max2 - (tF * min)) / 2;
                HG hg = new HG(max, max2);
                int i9 = 0;
                while (i9 < tF) {
                    int i10 = 0;
                    while (i10 < zH) {
                        if (yq.SN(i10, i9) == 1) {
                            hg.tF(i7, i8, min, min);
                        }
                        i10++;
                        i7 += min;
                    }
                    i9++;
                    i8 += min;
                }
                return hg;
            }
            throw new IllegalStateException();
        }
    }
}
