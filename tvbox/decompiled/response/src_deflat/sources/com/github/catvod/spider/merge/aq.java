package com.github.catvod.spider.merge;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class aq {
    private static final Object[] yq = new Object[0];

    public static String B(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            byte[] doFinal = mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : doFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String F5(String str) {
        String str2;
        StringBuilder sb;
        boolean z = true;
        if (str.startsWith("_")) {
            str = str.substring(1);
        }
        if (str.startsWith("-")) {
            str = str.substring(1);
        }
        if (str.startsWith("-")) {
            str = str.substring(1);
        }
        if (str.contains("HDR") || str.contains("hdr") || str.contains("帧") || str.contains("高码") || str.contains("FPS") || str.contains("fps") || str.contains("DV") || str.contains("杜比")) {
            sb = new StringBuilder();
            str2 = "3K";
        } else {
            if (!str.contains("4K") && !str.contains("4k") && !str.contains("2160")) {
                z = false;
            }
            sb = new StringBuilder();
            str2 = z ? "1K" : "2K";
        }
        return A7.N(sb, str2, str);
    }

    public static boolean G(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (Pattern.matches("^([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,}$", str)) {
            return true;
        }
        return Pattern.matches("^[a-zA-Z0-9\\-]+$", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G4(java.lang.String r7) {
        /*
            boolean r0 = G(r7)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L60
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = 2
            java.lang.String r4 = ":"
            if (r7 == 0) goto L31
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L17
            goto L31
        L17:
            java.lang.String[] r5 = r7.split(r4)
            int r6 = r5.length
            if (r6 == r3) goto L1f
            goto L31
        L1f:
            r6 = r5[r2]     // Catch: java.lang.NumberFormatException -> L31
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L31
            if (r6 < r2) goto L31
            if (r6 <= r0) goto L2a
            goto L31
        L2a:
            r5 = r5[r1]
            boolean r5 = G(r5)
            goto L32
        L31:
            r5 = 0
        L32:
            if (r5 != 0) goto L60
            boolean r5 = dT(r7)
            if (r5 != 0) goto L60
            if (r7 == 0) goto L5d
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L43
            goto L5d
        L43:
            java.lang.String[] r7 = r7.split(r4)
            int r4 = r7.length
            if (r4 == r3) goto L4b
            goto L5d
        L4b:
            r3 = r7[r2]     // Catch: java.lang.NumberFormatException -> L5d
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L5d
            if (r3 < r2) goto L5d
            if (r3 <= r0) goto L56
            goto L5d
        L56:
            r7 = r7[r1]
            boolean r7 = dT(r7)
            goto L5e
        L5d:
            r7 = 0
        L5e:
            if (r7 == 0) goto L61
        L60:
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.aq.G4(java.lang.String):boolean");
    }

    public static final void Gc(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }

    public static final Object[] Gd(Collection collection, Object[] objArr) {
        Object[] objArr2;
        zH(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    N(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        tF(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        tF(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    public static int KJ(hN hNVar, L1 l1) {
        Iterator<hN> it = hNVar.L().J().iterator();
        int i = 1;
        while (it.hasNext()) {
            hN next = it.next();
            if (hNVar.tl().equals(next.tl()) && l1.yq().contains(next)) {
                if (hNVar == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public static kB M(hN hNVar) {
        kB kBVar = new kB();
        while (true) {
            hNVar = hNVar.o();
            if (hNVar == null) {
                break;
            }
            kBVar.add(hNVar);
        }
        if (kBVar.size() > 0) {
            return kBVar;
        }
        return null;
    }

    public static void N(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            W(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void SN(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            W(nullPointerException);
            throw nullPointerException;
        }
    }

    private static Throwable W(Throwable th) {
        String name = aq.class.getName();
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th;
    }

    public static boolean dT(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return false;
        }
        for (String str2 : split) {
            try {
                int parseInt = Integer.parseInt(str2);
                if (parseInt < 0 || parseInt > 255 || !String.valueOf(parseInt).equals(str2)) {
                    return false;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return true;
        return false;
    }

    public static void ee(hN hNVar, int i) {
        hNVar.V("EL_SAME_TAG_ALL_NUM", String.valueOf(i));
    }

    private static List g9(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("(\\d+)|[^\\d]+").matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static int i(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static String q(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
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
            throw new RuntimeException(e);
        }
    }

    public static int t0(String str, String str2) {
        String F5 = F5(str);
        String F52 = F5(str2);
        List g9 = g9(F5);
        List g92 = g9(F52);
        Iterator it = ((ArrayList) g9).iterator();
        Iterator it2 = ((ArrayList) g92).iterator();
        while (it.hasNext() && it2.hasNext()) {
            String str3 = (String) it.next();
            String str4 = (String) it2.next();
            if (!str3.matches("\\d+") || !str4.matches("\\d+")) {
                int compareTo = str3.compareTo(str4);
                if (compareTo != 0) {
                    return compareTo;
                }
            } else {
                int parseInt = Integer.parseInt(str3);
                int parseInt2 = Integer.parseInt(str4);
                if (parseInt != parseInt2) {
                    return Integer.compare(parseInt, parseInt2);
                }
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public static void tF(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(oX.yq(str, " must not be null"));
            W(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void v(hN hNVar, int i) {
        hNVar.V("EL_SAME_TAG_INDEX", String.valueOf(i));
    }

    public static kB v3(hN hNVar) {
        kB kBVar = new kB();
        while (true) {
            hNVar = hNVar.u7();
            if (hNVar == null) {
                break;
            }
            kBVar.add(hNVar);
        }
        if (kBVar.size() > 0) {
            return kBVar;
        }
        return null;
    }

    public static final Object[] xa(Collection collection) {
        zH(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i3 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        tF(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        tF(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return yq;
    }

    public static boolean yq(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void zH(Object obj, String str) {
        if (obj == null) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            W(nullPointerException);
            throw nullPointerException;
        }
    }
}
