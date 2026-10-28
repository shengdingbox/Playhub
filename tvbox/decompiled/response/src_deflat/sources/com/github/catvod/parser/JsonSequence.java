package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V3;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class JsonSequence {
    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, String str) {
        JSONObject Nl;
        if (linkedHashMap.isEmpty()) {
            return new JSONObject();
        }
        for (String str2 : linkedHashMap.keySet()) {
            try {
                HashMap<String, String> reqHeader = JsonBasic.getReqHeader(linkedHashMap.get(str2));
                String str3 = reqHeader.get("url");
                reqHeader.remove("url");
                SpiderDebug.log(str3 + str);
                Nl = Rc.Nl(str, V3.q(str3 + str, reqHeader));
            } catch (Exception unused) {
            }
            if (Nl != null) {
                Nl.put("jxFrom", str2);
                return Nl;
            }
        }
        return new JSONObject();
    }
}
