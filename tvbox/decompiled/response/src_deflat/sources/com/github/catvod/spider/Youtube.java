package com.github.catvod.spider;

import com.github.catvod.spider.merge.V3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Youtube {
    public static String fetch(String str) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36");
            Matcher matcher = Pattern.compile("hlsManifestUrl\\S*?(https\\S*?\\.m3u8)").matcher(V3.q(str, hashMap));
            if (!matcher.find()) {
                return "";
            }
            String group = matcher.group(1);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("User-Agent", "Mozilla/5.0 (X11; Linux aarch64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/148.0.0.0 Safari/537.36");
            String yq = yq(V3.q(group, hashMap2));
            return yq.isEmpty() ? str : yq;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private static String yq(String str) {
        Iterator it = Arrays.asList("301", "300", "96", "95", "94").iterator();
        String str2 = "";
        while (it.hasNext()) {
            Matcher matcher = Pattern.compile("https:/.*/" + ((String) it.next()) + "/.*index.m3u8").matcher(str);
            str2 = matcher.find() ? matcher.group() : "";
            if (!str2.isEmpty()) {
                break;
            }
        }
        return str2;
    }
}
