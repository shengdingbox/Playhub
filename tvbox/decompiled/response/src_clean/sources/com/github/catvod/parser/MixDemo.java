package com.github.catvod.parser;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class MixDemo {
    private static final HashMap<String, ArrayList<String>> yq = new HashMap<>();
    private static HashMap<String, ArrayList<String>> SN = null;

    private static void SN(LinkedHashMap<String, HashMap<String, String>> linkedHashMap) {
        SN = new HashMap<>();
        for (String str : linkedHashMap.keySet()) {
            HashMap<String, String> hashMap = linkedHashMap.get(str);
            String str2 = hashMap.get("type");
            if (str2.equals("1") || str2.equals("0")) {
                try {
                    JSONArray jSONArray = new JSONObject(hashMap.get("ext")).getJSONArray("flag");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        ArrayList<String> arrayList = SN.get(string);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            SN.put(string, arrayList);
                        }
                        arrayList.add(str);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public static Object[] loadHtml(String str, String str2) {
        try {
            String str3 = new String(Base64.decode(str2, 10), "UTF-8");
            StringBuilder sb = new StringBuilder();
            HashMap<String, ArrayList<String>> hashMap = yq;
            if (hashMap.containsKey(str)) {
                ArrayList<String> arrayList = hashMap.get(str);
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append("\"");
                    sb.append(arrayList.get(i));
                    sb.append("\"");
                    if (i < arrayList.size() - 1) {
                        sb.append(",");
                    }
                }
            }
            return new Object[]{200, "text/html; charset=\"UTF-8\"", new ByteArrayInputStream("\n<!doctype html>\n<html>\n<head>\n<title>解析</title>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE10\" />\n<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\n<meta name=\"viewport\" content=\"width=device-width\">\n</head>\n<body>\n<script>\nvar apiArray=[#jxs#];\nvar urlPs=\"#url#\";\nvar iframeHtml=\"\";\nfor(var i=0;i<apiArray.length;i++){\nvar URL=apiArray[i]+urlPs;\niframeHtml=iframeHtml+\"<iframe sandbox='allow-scripts allow-same-origin allow-forms' frameborder='0' allowfullscreen='true' webkitallowfullscreen='true' mozallowfullscreen='true' src=\"+URL+\"></iframe>\";\n}\ndocument.write(iframeHtml);\n</script>\n</body>\n</html>".replace("#url#", str3).replace("#jxs#", sb.toString()).toString().getBytes("UTF-8"))};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static JSONObject parse(LinkedHashMap<String, HashMap<String, String>> linkedHashMap, String str, String str2, String str3) {
        ArrayList<String> arrayList;
        JSONObject parse;
        try {
            if (SN == null) {
                SN(linkedHashMap);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = SN.get(str2);
            if (arrayList2 == null || arrayList2.isEmpty()) {
                for (String str4 : linkedHashMap.keySet()) {
                    HashMap<String, String> hashMap = linkedHashMap.get(str4);
                    String str5 = hashMap.get("type");
                    if (str5.equals("1")) {
                        linkedHashMap2.put(str4, yq(hashMap.get("url"), hashMap.get("ext")));
                    } else if (str5.equals("0")) {
                        arrayList.add(hashMap.get("url"));
                    }
                }
            } else {
                for (int i = 0; i < arrayList2.size(); i++) {
                    String str6 = arrayList2.get(i);
                    HashMap<String, String> hashMap2 = linkedHashMap.get(str6);
                    String str7 = hashMap2.get("type");
                    if (str7.equals("1")) {
                        linkedHashMap2.put(str6, yq(hashMap2.get("url"), hashMap2.get("ext")));
                    } else if (str7.equals("0")) {
                        arrayList.add(hashMap2.get("url"));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                yq.put(str2, arrayList);
            }
            parse = JsonParallel.parse(linkedHashMap2, str3);
        } catch (Exception unused) {
        }
        if (parse.has("url")) {
            return parse;
        }
        if (!arrayList.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", "proxy://do=parseMix&flag=" + str2 + "&url=" + Base64.encodeToString(str3.getBytes(), 10));
            jSONObject.put("parse", 1);
            return jSONObject;
        }
        return new JSONObject();
    }

    private static String yq(String str, String str2) {
        int indexOf;
        if (str2.trim().isEmpty() || (indexOf = str.indexOf("?")) == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = indexOf + 1;
        sb.append(str.substring(0, i));
        sb.append("cat_ext=");
        sb.append(Base64.encodeToString(str2.getBytes(), 10));
        sb.append("&");
        sb.append(str.substring(i));
        return sb.toString();
    }
}
