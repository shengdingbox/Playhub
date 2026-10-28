package com.github.catvod.spider.merge;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Yx {
    public static String N(String str, String str2, int i) {
        if (str2 == null) {
            return "";
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str.isEmpty()) {
            return "";
        }
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.find() && i >= 0 && i <= matcher.groupCount()) {
            String group = matcher.group(i);
            return group == null ? "" : group;
        }
        return "";
    }

    public static String SN(String str) {
        return N("\\d+", str, 0);
    }

    public static JSONObject yq() {
        try {
            Response execute = C0068Pe.yq(0).newCall(new Request.Builder().url("https://45.150.165.226/include/vdimgck.php").addHeader("User-Agent", "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36").build()).execute();
            String str = execute.headers().get("set-cookie");
            SpiderDebug.log("set-cookie--" + str);
            InputStream byteStream = execute.body().byteStream();
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String string = C0068Pe.yq(0).newCall(new Request.Builder().url("https://api.nn.ci/ocr/b64/text").post(RequestBody.create(MediaType.parse("text/plain; charset=utf-8"), Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0))).addHeader("User-Agent", "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36").build()).execute().body().string();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cookie", str);
                    jSONObject.put("code", string);
                    return jSONObject;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
