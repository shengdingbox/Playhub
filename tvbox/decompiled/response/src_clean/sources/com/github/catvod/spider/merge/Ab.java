package com.github.catvod.spider.merge;

import android.os.SystemClock;
import com.github.catvod.spider.InitOrigin;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.nio.channels.ReadableByteChannel;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class Ab {
    private long B;
    private boolean F5;
    public final AtomicBoolean G;
    private List<Call> G4;
    private long Gc;
    private long KJ;
    private long M;
    private final String N;
    private final Map<String, String> SN;
    private ExecutorService dT;
    private int i;
    private long q;
    private final int t0;
    private long tF;
    private volatile boolean v3;
    private BlockingQueue<yq> yq;
    private final ReentrantLock zH;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class SN implements Comparator<yq> {
        SN() {
        }

        @Override // java.util.Comparator
        public final int compare(yq yqVar, yq yqVar2) {
            return Long.compare(yqVar.yq, yqVar2.yq);
        }
    }

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public class yq {
        private byte[] N;
        private final long SN;
        private boolean tF;
        private final long yq;
        private Response zH;

        public yq(long j, long j2, boolean z) {
            this.yq = j;
            this.SN = j2;
            this.tF = z;
        }

        public final void i(Response response) {
            this.zH = response;
        }

        public final void t0(byte[] bArr) {
            this.N = bArr;
        }

        public final byte[] tF() {
            return this.N;
        }

        public final Response zH() {
            return this.zH;
        }
    }

    public Ab(String str, Map<String, String> map, int i, long j, long j2, int i2) {
        this.M = -1L;
        this.KJ = -1L;
        this.q = -1L;
        this.B = -1L;
        boolean z = true;
        this.G = new AtomicBoolean(true);
        this.N = str;
        this.SN = map;
        this.t0 = i;
        this.zH = new ReentrantLock();
        this.yq = new PriorityBlockingQueue(i2, new SN());
        this.tF = j;
        this.Gc = j2;
        this.i = i2;
        this.G4 = new CopyOnWriteArrayList();
        this.dT = Executors.newFixedThreadPool(i);
        this.v3 = (str.contains(".ts") || str.contains(".png") || str.contains(".jpg") || str.contains(".jpeg")) ? false : z;
    }

    public Ab(String str, Map<String, String> map, int i, long j, long j2, int i2, boolean z) {
        this.M = -1L;
        this.KJ = -1L;
        this.q = -1L;
        this.B = -1L;
        this.G = new AtomicBoolean(true);
        this.N = str;
        this.SN = map;
        this.t0 = i;
        this.zH = new ReentrantLock();
        this.yq = new PriorityBlockingQueue(i2, new SN());
        this.tF = j;
        this.Gc = j2;
        this.i = i2;
        this.G4 = new CopyOnWriteArrayList();
        this.dT = Executors.newFixedThreadPool(i);
        this.F5 = z;
        this.v3 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.Ab$yq>, java.util.concurrent.PriorityBlockingQueue] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.Ab$yq>, java.util.concurrent.PriorityBlockingQueue] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List<okhttp3.Call>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List<okhttp3.Call>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List<okhttp3.Call>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List<okhttp3.Call>, java.util.concurrent.CopyOnWriteArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void N(com.github.catvod.spider.merge.Ab r15) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.Ab.N(com.github.catvod.spider.merge.Ab):void");
    }

    public static /* synthetic */ void SN(Ab ab, Pipe.SinkChannel sinkChannel) {
        Objects.requireNonNull(ab);
        while (ab.G.get()) {
            try {
                try {
                    Object[] zH = ab.zH();
                    ReadableByteChannel readableByteChannel = null;
                    Response response = zH[0] != null ? (Response) zH[0] : null;
                    byte[] bArr = zH[1] != null ? (byte[]) zH[1] : null;
                    if ((bArr == null || bArr.length == 0) && response == null) {
                        break;
                    }
                    if (response != null) {
                        readableByteChannel = Channels.newChannel(response.body().byteStream());
                    }
                    if (bArr != null) {
                        readableByteChannel = Channels.newChannel(new ByteArrayInputStream(bArr));
                    }
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
                    while (ab.G.get()) {
                        allocateDirect.clear();
                        if (readableByteChannel.read(allocateDirect) == -1) {
                            break;
                        }
                        allocateDirect.flip();
                        while (allocateDirect.hasRemaining() && ab.G.get()) {
                            if (sinkChannel.write(allocateDirect) == 0) {
                                SystemClock.sleep(1L);
                            }
                        }
                    }
                    if (response != null) {
                        response.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    ab.tF();
                }
            } catch (Throwable th) {
                try {
                    sinkChannel.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    ab.tF();
                }
                ab.tF();
                throw th;
            }
        }
        try {
            sinkChannel.close();
        } catch (Exception e3) {
            e3.printStackTrace();
            ab.tF();
        }
        ab.tF();
    }

    public static void yq(Ab ab) {
        long j = 0;
        for (int i = 0; i < ab.t0; i++) {
            if (ab.G.get() && !ab.dT.isShutdown()) {
                try {
                    ab.dT.submit(new H(ab, 3));
                    if (i <= 5) {
                        SystemClock.sleep(j);
                        j += 50;
                    }
                } catch (Exception e) {
                    StringBuilder yq2 = by.yq("异常--");
                    yq2.append(e.getMessage());
                    InitOrigin.show(yq2.toString());
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.Ab$yq>, java.util.concurrent.PriorityBlockingQueue] */
    private Object[] zH() {
        Response response;
        byte[] bArr;
        if (this.q > this.KJ) {
            return null;
        }
        yq yqVar = (yq) this.yq.poll(20L, TimeUnit.SECONDS);
        if (yqVar != null) {
            while (this.G.get()) {
                if (yqVar.tF) {
                    response = yqVar.zH();
                    bArr = null;
                } else {
                    bArr = yqVar.tF();
                    response = null;
                }
                if (bArr != null) {
                    this.q += bArr.length;
                    return new Object[]{null, bArr};
                } else if (response != null) {
                    this.q = (yqVar.SN - yqVar.yq) + 1 + this.q;
                    return new Object[]{response, null};
                } else {
                    SystemClock.sleep(20L);
                }
            }
            return null;
        }
        throw new Exception("read timeout");
    }

    public final Object[] i() {
        String str;
        Matcher matcher = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(this.SN.get("Range"));
        if (matcher.find()) {
            long parseLong = this.F5 ? Long.parseLong(matcher.group(1)) + 8 : Long.parseLong(matcher.group(1));
            this.M = parseLong;
            int i = parseLong == 0 ? 200 : 206;
            if (matcher.group(2) != null) {
                this.KJ = Long.parseLong(matcher.group(2));
            }
            long j = this.M;
            this.B = j;
            this.q = j;
            if (this.KJ <= 0) {
                this.KJ = this.tF - 1;
            }
            boolean z = this.F5;
            long j2 = this.tF;
            if (z) {
                j2 -= 8;
            }
            long j3 = j2 - j;
            long j4 = (j3 / this.t0) + 1;
            if (this.Gc > j4) {
                this.Gc = j4;
            }
            InitOrigin.execute(new g1(this, 8));
            Pipe open = Pipe.open();
            Pipe.SinkChannel sink = open.sink();
            Pipe.SourceChannel source = open.source();
            HashMap hashMap = new HashMap();
            if (!this.F5) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.M);
                sb.append("-");
                long j5 = this.KJ;
                if (j5 <= 0) {
                    j5 = this.tF - 1;
                }
                sb.append(j5);
                sb.append("/");
                sb.append(this.tF);
                str = sb.toString();
            } else if (this.M == 8) {
                str = "0";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.M);
                sb2.append("-");
                long j6 = this.KJ;
                sb2.append(j6 <= 0 ? (this.tF - 1) - 8 : j6 - 8);
                sb2.append("/");
                sb2.append(this.tF - 8);
                str = sb2.toString();
            }
            hashMap.put("Content-Range", "bytes " + str);
            hashMap.put("Content-Length", String.valueOf(j3));
            hashMap.put("Connection", "keep-alive");
            hashMap.put("Accept-Ranges", "bytes");
            Object[] objArr = {Integer.valueOf(i), "application/oct-stream", Channels.newInputStream(source), hashMap};
            InputStream inputStream = (InputStream) objArr[2];
            new Thread(new G(this, sink, 3)).start();
            return objArr;
        }
        StringBuilder yq2 = by.yq("invalid Range: ");
        yq2.append(this.SN.get("Range"));
        throw new Exception(yq2.toString());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.BlockingQueue<com.github.catvod.spider.merge.Ab$yq>, java.util.concurrent.PriorityBlockingQueue] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<okhttp3.Call>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<okhttp3.Call>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List<okhttp3.Call>, java.util.concurrent.CopyOnWriteArrayList] */
    public final void tF() {
        if (this.G.get()) {
            this.G.set(false);
            this.dT.shutdownNow();
            this.yq.clear();
            ?? r0 = this.G4;
            if (r0 != 0 && r0.size() > 0) {
                synchronized (this.G4) {
                    Iterator it = this.G4.iterator();
                    while (it.hasNext()) {
                        Call call = (Call) it.next();
                        if (call != null) {
                            try {
                                call.cancel();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    this.G4.clear();
                }
            }
            System.gc();
        }
    }
}
