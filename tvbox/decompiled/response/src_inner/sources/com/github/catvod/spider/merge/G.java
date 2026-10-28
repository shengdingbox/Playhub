package com.github.catvod.spider.merge;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
import java.nio.channels.Pipe;
import org.json.JSONObject;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final /* synthetic */ class G implements Runnable {
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object SN;
    public final /* synthetic */ int yq;

    public /* synthetic */ G(Object obj, Object obj2, int i) {
        this.yq = i;
        this.N = obj;
        this.SN = obj2;
    }

    public /* synthetic */ G(String str, String str2) {
        this.yq = 4;
        this.SN = str;
        this.N = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.yq) {
            case ProxyOrigin.Gc /* 0 */:
                Z.N((Z) this.N, (String) this.SN);
                return;
            case 1:
                C0203xU.dT((C0203xU) this.N, (String) this.SN);
                return;
            case 2:
                Bili.Nl((Bili) this.N, (JSONObject) this.SN);
                return;
            case 3:
                Ab.SN((Ab) this.N, (Pipe.SinkChannel) this.SN);
                return;
            default:
                String str = (String) this.SN;
                String str2 = (String) this.N;
                String str3 = Rc.yq;
                if (!str.equals(str2) && !str2.contains(".m3u") && !str2.contains(".txt")) {
                    try {
                        Thread.sleep(5000L);
                        try {
                            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(InitOrigin.context().getDatabasePath("tv").getAbsolutePath(), null, 0);
                            long currentTimeMillis = System.currentTimeMillis();
                            openDatabase.execSQL("UPDATE Config SET time = ? WHERE url = ? AND type = 1", new Object[]{Long.valueOf(currentTimeMillis), str});
                            Cursor rawQuery = openDatabase.rawQuery("SELECT COUNT(*) FROM Config WHERE url = ? AND type = 1", new String[]{str});
                            rawQuery.moveToFirst();
                            if (rawQuery.getInt(0) == 0) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("url", str);
                                contentValues.put("type", (Integer) 1);
                                contentValues.put("time", Long.valueOf(currentTimeMillis));
                                openDatabase.insert("Config", null, contentValues);
                            }
                            rawQuery.close();
                            openDatabase.close();
                            try {
                                SQLiteDatabase openDatabase2 = SQLiteDatabase.openDatabase(InitOrigin.context().getDatabasePath("tv").getAbsolutePath(), null, 0);
                                openDatabase2.execSQL("UPDATE Config SET time = ? WHERE url = ? AND type = 1", new Object[]{Long.valueOf(System.currentTimeMillis()), str});
                                openDatabase2.close();
                                return;
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                                return;
                            }
                        } catch (Exception e2) {
                            SpiderDebug.log(e2);
                            return;
                        }
                    } catch (InterruptedException e3) {
                        throw new RuntimeException(e3);
                    }
                } else {
                    return;
                }
        }
    }
}
