package com.github.catvod.spider;

import android.content.Context;
import android.os.Environment;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.by;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.m7;
import com.github.catvod.spider.merge.rP;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Local extends Spider {
    private SimpleDateFormat yq;

    private ME yq(File file) {
        ME me = new ME();
        me.B(file.getAbsolutePath());
        me.G(file.getName());
        me.G4(file.isDirectory() ? "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://oss4liview.moji.com/thd_file/2025/07/28/edd1dfb11afd77b00310574109f1d35b.jpg" : "https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://oss4liview.moji.com/thd_file/2025/07/28/a6bdb22cc4b0bfc7b333fec5d027b951.jpg");
        me.v3(this.yq.format(Long.valueOf(file.lastModified())));
        me.W(file.isDirectory() ? "folder" : "file");
        return me;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return iX.ee(arrayList);
        }
        Arrays.sort(listFiles, m7.yq);
        for (File file : listFiles) {
            if (!file.getName().startsWith(".")) {
                if (file.isDirectory()) {
                    arrayList3.add(yq(file));
                } else if (Rc.N.contains(Rc.dT(file.getName()))) {
                    arrayList2.add(yq(file));
                }
            }
        }
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList2);
        return iX.ee(arrayList);
    }

    public String detailContent(List<String> list) {
        File file = new File(list.get(0));
        ME me = new ME();
        me.t0("FongMi");
        me.B(file.getAbsolutePath());
        me.G(file.getName());
        me.G4("https://img07.sogoucdn.com/v2/thumb/retype_exclude_gif/ext/auto/q/95/crop/xy/ai/t/0/?appid=122&url=https://oss4liview.moji.com/thd_file/2025/07/28/a6bdb22cc4b0bfc7b333fec5d027b951.jpg");
        me.dT("播放");
        me.F5(file.getName() + "$" + file.getAbsolutePath());
        return iX.v(me);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new rP(Environment.getExternalStorageDirectory().getAbsolutePath(), "本地文件", "1"));
        File[] listFiles = new File("/storage").listFiles();
        if (listFiles == null) {
            arrayList = new ArrayList();
        } else {
            List asList = Arrays.asList("emulated", "sdcard", "self");
            for (File file : listFiles) {
                if (!asList.contains(file.getName())) {
                    arrayList2.add(new rP(file.getAbsolutePath(), file.getName(), "1"));
                }
            }
            arrayList = new ArrayList();
        }
        return iX.xa(arrayList2, arrayList);
    }

    public void init(Context context, String str) {
        this.yq = new SimpleDateFormat("yyyyy/MM/dd HH:mm:ss", Locale.getDefault());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.github.catvod.spider.merge.iX] */
    public String playerContent(String str, String str2, List<String> list) {
        ?? r10;
        ?? iXVar = new iX();
        iXVar.g1("file://" + str2);
        File file = new File(str2);
        File[] listFiles = file.getParentFile() == null ? null : file.getParentFile().listFiles();
        if (listFiles == null || listFiles.length == 0) {
            r10 = Collections.emptyList();
        } else {
            r10 = new ArrayList();
            for (File file2 : listFiles) {
                String dT = Rc.dT(file2.getName());
                if (Rc.xa(dT)) {
                    gU gUVar = new gU();
                    gUVar.N(Rc.g1(file2.getName()));
                    gU SN = gUVar.SN(dT);
                    StringBuilder yq = by.yq("file://");
                    yq.append(file2.getAbsolutePath());
                    SN.zH(yq.toString());
                    r10.add(SN);
                }
            }
        }
        iXVar.O(r10);
        return iXVar.toString();
    }
}
