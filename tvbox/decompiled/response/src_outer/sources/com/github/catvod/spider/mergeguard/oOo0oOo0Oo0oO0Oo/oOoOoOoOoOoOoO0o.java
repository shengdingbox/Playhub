package com.github.catvod.spider.mergeguard.oOo0oOo0Oo0oO0Oo;

import java.util.ArrayList;
import java.util.Collections;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes.dex */
public final class oOoOoOoOoOoOoO0o {
    private static final DocumentBuilderFactory oOo0oOo0Oo0oO0Oo = DocumentBuilderFactory.newInstance();
    private static final String[] oOoOoOoOoOoOoO0o;

    static {
        String[] strArr = {"yyyy-MM-dd'T'HH:mm:ss'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "EEE MMM dd HH:mm:ss zzz yyyy", "EEEEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMMM d HH:mm:ss yyyy"};
        oOoOoOoOoOoOoO0o = strArr;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < oOoOoOoOoOoOoO0o.length; i++) {
            arrayList.add(new ThreadLocal());
        }
        Collections.unmodifiableList(arrayList);
    }

    public static Element oOoOoOoOoOoOoO0o(com.github.catvod.spider.mergeguard.oOoOoOo0oOo0o0oO.oOoOoOoOoOoOoO0o oooooooooooooo0o) {
        try {
            Document newDocument = oOo0oOo0Oo0oO0Oo.newDocumentBuilder().newDocument();
            String oOo0oOo0Oo0oO0Oo2 = oooooooooooooo0o.oOo0oOo0Oo0oO0Oo();
            return newDocument.createElementNS(oOo0oOo0Oo0oO0Oo2, oooooooooooooo0o.oOoOoOo0oOo0o0oO() + ":" + oooooooooooooo0o.oOoOoOoOoOoOoO0o());
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
