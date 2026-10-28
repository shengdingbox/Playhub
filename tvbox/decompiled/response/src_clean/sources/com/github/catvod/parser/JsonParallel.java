package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.JsonBasic;
import com.github.catvod.spider.merge.V3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class JsonParallel {
    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, final String str) {
        if (linkedHashMap.isEmpty()) {
            return new JSONObject();
        }
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
        ArrayList arrayList = new ArrayList();
        for (final String str2 : linkedHashMap.keySet()) {
            final String str3 = linkedHashMap.get(str2);
            arrayList.add(executorCompletionService.submit(new Callable() { // from class: com.github.catvod.spider.merge.T2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str4 = str3;
                    String str5 = str;
                    String str6 = str2;
                    try {
                        HashMap<String, String> reqHeader = JsonBasic.getReqHeader(str4);
                        String str7 = reqHeader.get("url");
                        reqHeader.remove("url");
                        SpiderDebug.log(str7 + str5);
                        JSONObject Nl = Rc.Nl(str5, C0068Pe.xa(C0068Pe.yq(0), str7 + str5, "p_json_parse", null, reqHeader, null));
                        Nl.put("jxFrom", str6);
                        SpiderDebug.log(Nl.toString());
                        return Nl;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }));
        }
        JSONObject jSONObject = null;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            try {
                JSONObject jSONObject2 = (JSONObject) executorCompletionService.take().get();
                if (jSONObject2 != null) {
                    try {
                        V3.yq();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            try {
                                ((Future) arrayList.get(i2)).cancel(true);
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                        }
                        arrayList.clear();
                        jSONObject = jSONObject2;
                        break;
                    } catch (Exception unused) {
                    }
                }
                jSONObject = jSONObject2;
            } catch (Exception unused2) {
            }
            i++;
        }
        newFixedThreadPool.shutdownNow();
        return jSONObject != null ? jSONObject : new JSONObject();
    }
}
