package com.github.catvod.spider.merge;

import android.os.Build;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class BL {
    public static final /* synthetic */ int SN = 0;
    private static final Pattern yq = Pattern.compile("\\[(\\d{2}):(\\d{2})\\.(\\d{2,3})]");

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        String SN;
        long yq;

        yq(long j, String str) {
            this.yq = j;
            this.SN = str;
        }
    }

    public static List<yq> N(String str) {
        Comparator comparingLong;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            Matcher matcher = yq.matcher(readLine);
            while (matcher.find()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                String group = matcher.group(3);
                arrayList.add(new yq((parseInt2 * 1000) + (parseInt * 60 * 1000) + (group.length() == 2 ? Integer.parseInt(group) * 10 : Integer.parseInt(group)), readLine.substring(matcher.end()).trim()));
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            comparingLong = Comparator.comparingLong(RM.yq);
            arrayList.sort(comparingLong);
        }
        return arrayList;
    }

    private static String SN(long j) {
        long j2 = j / 1000;
        return String.format("%d:%02d:%02d.%02d", Long.valueOf(j2 / 3600), Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60), Long.valueOf((j % 1000) / 10));
    }

    public static String yq(List<yq> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Script Info]\n");
        sb.append("ScriptType: v4.00+\n");
        sb.append("Collisions: Normal\n");
        sb.append("PlayResX: 1280\n");
        sb.append("PlayResY: 720\n");
        sb.append("Timer: 100.0000\n");
        sb.append("\n");
        sb.append("[V4+ Styles]\n");
        sb.append("Format: Name, Fontname, Fontsize, PrimaryColour, SecondaryColour, OutlineColour, BackColour, Bold, Italic, Underline, StrikeOut, ScaleX, ScaleY, Spacing, Angle, BorderStyle, Outline, Shadow, Alignment, MarginL, MarginR, MarginV, Encoding\n");
        sb.append("Style: KTV,Roboto,70,&H4D9A51E6,&HB3FFFFFF,&H00000000,&H64000000,-1,0,0,0,100,85,0,0,1,5,5,2,10,10,100,1\n");
        sb.append("\n");
        sb.append("[Events]\n");
        sb.append("Format: Layer, Start, End, Style, Name, MarginL, MarginR, MarginV, Effect, Text\n");
        int i = 0;
        while (i < list.size()) {
            yq yqVar = list.get(i);
            i++;
            yq yqVar2 = i < list.size() ? list.get(i) : null;
            String SN2 = SN(yqVar.yq);
            String SN3 = SN(yqVar2 != null ? yqVar2.yq : yqVar.yq + 3000);
            Object[] objArr = new Object[3];
            objArr[0] = SN2;
            objArr[1] = SN3;
            String str = yqVar.SN;
            objArr[2] = str == null ? "" : str.replace("\\", "\\\\").replace(",", "\\,");
            sb.append(String.format("Dialogue: 0,%s,%s,KTV,,0,0,0,,%s\n", objArr));
        }
        return sb.toString();
    }
}
