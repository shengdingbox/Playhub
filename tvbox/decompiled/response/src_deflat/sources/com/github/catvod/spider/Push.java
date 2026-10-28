package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.ME;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.V3;
import com.github.catvod.spider.merge.by;
import com.github.catvod.spider.merge.cn;
import com.github.catvod.spider.merge.gU;
import com.github.catvod.spider.merge.iX;
import com.github.catvod.spider.merge.oX;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public class Push extends Pan {
    @Override // com.github.catvod.spider.Pan
    public String detailContent(List<String> list) {
        String trim = list.get(0).trim();
        cn.F5(false);
        if (trim.contains("quark") && !trim.contains("192.168") && !trim.contains("127.0.0")) {
            return super.detailContent(list);
        }
        if (trim.contains("aliyundrive") && !trim.contains("192.168") && !trim.contains("127.0.0")) {
            return super.detailContent(list);
        }
        if (trim.contains("alipan") && !trim.contains("192.168") && !trim.contains("127.0.0")) {
            return super.detailContent(list);
        }
        if (trim.contains("drive.uc.cn") && !trim.contains("192.168") && !trim.contains("127.0.0")) {
            return super.detailContent(list);
        }
        if (trim.contains("pan.baidu.com") && !trim.contains("192.168") && !trim.contains("127.0.0")) {
            return super.detailContent(list);
        }
        if (trim.startsWith("magnet") || trim.startsWith("cili")) {
            return super.detailContent(list);
        }
        ME me = new ME();
        me.B(trim);
        me.t0("FongMi");
        me.G(trim.startsWith("file://") ? new File(trim).getName() : trim);
        me.G4("https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        me.dT(TextUtils.join("$$$", Arrays.asList("直連", "嗅探", "解析")));
        me.F5(TextUtils.join("$$$", Arrays.asList(oX.yq("播放$", trim), oX.yq("播放$", trim), oX.yq("播放$", trim))));
        return iX.v(me);
    }

    @Override // com.github.catvod.spider.Pan
    public void init(Context context, String str) {
        super.init(context, str);
    }

    @Override // com.github.catvod.spider.Pan
    public String playerContent(String str, String str2, List<String> list) {
        iX iXVar;
        if (str2.contains("youtube.com")) {
            iXVar = new iX();
            str2 = Youtube.fetch(str2);
        } else if (str.equals("直連")) {
            iXVar = new iX();
            iXVar.g1(str2);
            ArrayList arrayList = new ArrayList();
            if (str2.startsWith("file://")) {
                File file = new File(str2.replace("file://", ""));
                if (file.getParentFile() != null) {
                    File[] listFiles = file.getParentFile().listFiles();
                    Objects.requireNonNull(listFiles);
                    for (File file2 : listFiles) {
                        String dT = Rc.dT(file2.getName());
                        if (Rc.xa(dT)) {
                            gU gUVar = new gU();
                            gUVar.N(Rc.g1(file2.getName()));
                            gU SN = gUVar.SN(dT);
                            StringBuilder yq = by.yq("file://");
                            yq.append(file2.getAbsolutePath());
                            SN.zH(yq.toString());
                            arrayList.add(SN);
                        }
                    }
                }
            }
            if (str2.startsWith("http://")) {
                List asList = Arrays.asList("mp4", "mkv");
                List<String> asList2 = Arrays.asList("srt", "ass");
                if (asList.contains(Rc.dT(str2))) {
                    for (String str3 : asList2) {
                        String concat = Rc.g1(str2).concat(".").concat(str3);
                        if (V3.q(concat, null).length() <= 100) {
                            String lastPathSegment = Uri.parse(concat).getLastPathSegment();
                            gU gUVar2 = new gU();
                            gUVar2.N(lastPathSegment);
                            gU SN2 = gUVar2.SN(str3);
                            SN2.zH(concat);
                            arrayList.add(SN2);
                        }
                    }
                }
            }
            iXVar.O(arrayList);
            return iXVar.toString();
        } else if (str.equals("嗅探")) {
            iXVar = new iX();
            iXVar.F5();
        } else if (!str.equals("解析")) {
            return super.playerContent(str, str2, list);
        } else {
            iXVar = new iX();
            iXVar.F5();
            iXVar.q();
        }
        iXVar.g1(str2);
        return iXVar.toString();
    }
}
