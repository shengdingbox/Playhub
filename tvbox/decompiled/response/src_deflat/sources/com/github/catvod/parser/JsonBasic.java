package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class JsonBasic {
    public static HashMap<String, String> getReqHeader(String str) {
        int indexOf;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("url", str);
        if (!str.contains("cat_ext")) {
            return hashMap;
        }
        try {
            int indexOf2 = str.indexOf("cat_ext=");
            String str2 = new String(Base64.decode(str.substring(indexOf2 + 8, str.indexOf("&", indexOf2)), 10));
            String str3 = str.substring(0, indexOf2) + str.substring(indexOf + 1);
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("header")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("header");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.optString(next, ""));
                }
            }
            hashMap.put("url", str3);
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, String str) {
        JSONObject Nl;
        SpiderDebug.log("Load Json Parse Basic...");
        if (linkedHashMap.isEmpty()) {
            return new JSONObject();
        }
        for (String str2 : linkedHashMap.keySet()) {
            HashMap<String, String> reqHeader = getReqHeader(linkedHashMap.get(str2));
            try {
                String str3 = reqHeader.get("url");
                reqHeader.remove("url");
                SpiderDebug.log(str3 + str);
                Nl = Rc.Nl(str, V3.q(str3 + str, reqHeader));
            } catch (Exception unused) {
            }
            if (Nl != null) {
                Nl.put("jxFrom", str2);
                SpiderDebug.log(Nl.toString());
                return Nl;
            }
        }
        return new JSONObject();
    }
}
