package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class eb implements AbstractC0119i8 {
    public static final eb yq = new eb();

    public static void Gc(String str, String str2, JSONArray jSONArray) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type_id", str);
            jSONObject.put("type_name", str2);
            jSONArray.put(new JSONObject(jSONObject.toString()));
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    public static Throwable M(PY py) {
        return py.SN();
    }

    public static String N(byte[] bArr, boolean z, Charset charset) {
        if (charset != null) {
            return new String(bArr, charset);
        }
        if (z) {
            return new String(bArr, TA.SN);
        }
        try {
            return new String(bArr, "Cp437");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static String i(String str) {
        return zH(str).trim();
    }

    public static void t0(JSONArray jSONArray, JSONObject jSONObject, String str) {
        try {
            jSONObject.put("page", str);
            int i = Integer.MAX_VALUE;
            jSONObject.put("pagecount", jSONArray.length() == 0 ? 1 : Integer.MAX_VALUE);
            jSONObject.put("limit", jSONArray.length());
            if (jSONArray.length() == 0) {
                i = jSONArray.length();
            }
            jSONObject.put("total", i);
            jSONObject.put("list", jSONArray);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    public static String tF(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object yq(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public static String zH(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public YW SN(C0069Py py, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        X7 x7 = new X7(py, i, i2, i3, i4);
        x7.SN = i5;
        x7.N = i6;
        if (str != null) {
            x7.i = str;
        }
        return x7;
    }
}
