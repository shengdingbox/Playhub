package com.github.catvod.spider.merge;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
/* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
public final class VV {
    private final CharBuffer N;
    private final ByteBuffer SN;
    private final IntBuffer tF;
    private final int yq;

    /* loaded from: E:\develop\workspace\private\Playhub\tvbox\decompiled\response\classes_inner.dex */
    public static class yq {
        private ByteBuffer SN;
        private int yq = 1;
        private CharBuffer N = null;
        private IntBuffer tF = null;
        private int zH = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        public yq(int i) {
            this.SN = ByteBuffer.allocate(i);
        }

        private void N(CharBuffer charBuffer) {
            char[] array = charBuffer.array();
            int position = charBuffer.position() + charBuffer.arrayOffset();
            int limit = charBuffer.limit() + charBuffer.arrayOffset();
            int[] array2 = this.tF.array();
            int position2 = this.tF.position() + this.tF.arrayOffset();
            while (true) {
                int i = -1;
                if (position >= limit) {
                    break;
                }
                char c = array[position];
                position++;
                if (this.zH != -1) {
                    if (Character.isLowSurrogate(c)) {
                        array2[position2] = Character.toCodePoint((char) this.zH, c);
                    } else {
                        array2[position2] = this.zH;
                        position2++;
                        if (!Character.isHighSurrogate(c)) {
                            array2[position2] = 65535 & c;
                        }
                    }
                    position2++;
                    this.zH = i;
                } else if (!Character.isHighSurrogate(c)) {
                    array2[position2] = c & 65535;
                    position2++;
                }
                i = c & 65535;
                this.zH = i;
            }
            int i2 = this.zH;
            if (i2 != -1) {
                array2[position2] = i2 & 65535;
                position2++;
            }
            charBuffer.position(position - charBuffer.arrayOffset());
            IntBuffer intBuffer = this.tF;
            intBuffer.position(position2 - intBuffer.arrayOffset());
        }

        private void SN(CharBuffer charBuffer) {
            char[] array = charBuffer.array();
            int position = charBuffer.position() + charBuffer.arrayOffset();
            int limit = charBuffer.limit() + charBuffer.arrayOffset();
            char[] array2 = this.N.array();
            int position2 = this.N.position() + this.N.arrayOffset();
            while (position < limit) {
                char c = array[position];
                if (!Character.isHighSurrogate(c)) {
                    array2[position2] = c;
                    position++;
                    position2++;
                } else {
                    charBuffer.position(position - charBuffer.arrayOffset());
                    CharBuffer charBuffer2 = this.N;
                    charBuffer2.position(position2 - charBuffer2.arrayOffset());
                    int remaining = charBuffer.remaining();
                    this.N.flip();
                    IntBuffer allocate = IntBuffer.allocate(Math.max(this.N.remaining() + remaining, this.N.capacity() / 2));
                    while (this.N.hasRemaining()) {
                        allocate.put(this.N.get() & 65535);
                    }
                    this.yq = 3;
                    this.N = null;
                    this.tF = allocate;
                    N(charBuffer);
                    return;
                }
            }
            charBuffer.position(position - charBuffer.arrayOffset());
            CharBuffer charBuffer3 = this.N;
            charBuffer3.position(position2 - charBuffer3.arrayOffset());
        }

        private static int zH(int i) {
            return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
        }

        public final VV tF() {
            int zH = kR.zH(this.yq);
            if (zH == 0) {
                this.SN.flip();
            } else if (zH == 1) {
                this.N.flip();
            } else if (zH == 2) {
                this.tF.flip();
            }
            return new VV(this.yq, this.SN, this.N, this.tF);
        }

        public final void yq(CharBuffer charBuffer) {
            int remaining = charBuffer.remaining();
            int zH = kR.zH(this.yq);
            if (zH != 0) {
                if (zH != 1) {
                    if (zH == 2 && this.tF.remaining() < remaining) {
                        IntBuffer allocate = IntBuffer.allocate(zH(this.tF.capacity() + remaining));
                        this.tF.flip();
                        allocate.put(this.tF);
                        this.tF = allocate;
                    }
                } else if (this.N.remaining() < remaining) {
                    CharBuffer allocate2 = CharBuffer.allocate(zH(this.N.capacity() + remaining));
                    this.N.flip();
                    allocate2.put(this.N);
                    this.N = allocate2;
                }
            } else if (this.SN.remaining() < remaining) {
                ByteBuffer allocate3 = ByteBuffer.allocate(zH(this.SN.capacity() + remaining));
                this.SN.flip();
                allocate3.put(this.SN);
                this.SN = allocate3;
            }
            if (charBuffer.hasArray()) {
                int zH2 = kR.zH(this.yq);
                if (zH2 == 0) {
                    char[] array = charBuffer.array();
                    int position = charBuffer.position() + charBuffer.arrayOffset();
                    int limit = charBuffer.limit() + charBuffer.arrayOffset();
                    byte[] array2 = this.SN.array();
                    int position2 = this.SN.position() + this.SN.arrayOffset();
                    while (position < limit) {
                        char c = array[position];
                        if (c <= 255) {
                            array2[position2] = (byte) (c & 255);
                            position++;
                            position2++;
                        } else {
                            charBuffer.position(position - charBuffer.arrayOffset());
                            ByteBuffer byteBuffer = this.SN;
                            byteBuffer.position(position2 - byteBuffer.arrayOffset());
                            if (!Character.isHighSurrogate(c)) {
                                int remaining2 = charBuffer.remaining();
                                this.SN.flip();
                                CharBuffer allocate4 = CharBuffer.allocate(Math.max(this.SN.remaining() + remaining2, this.SN.capacity() / 2));
                                while (this.SN.hasRemaining()) {
                                    allocate4.put((char) (this.SN.get() & 255));
                                }
                                this.yq = 2;
                                this.SN = null;
                                this.N = allocate4;
                                SN(charBuffer);
                                return;
                            }
                            int remaining3 = charBuffer.remaining();
                            this.SN.flip();
                            IntBuffer allocate5 = IntBuffer.allocate(Math.max(this.SN.remaining() + remaining3, this.SN.capacity() / 4));
                            while (this.SN.hasRemaining()) {
                                allocate5.put(this.SN.get() & 255);
                            }
                            this.yq = 3;
                            this.SN = null;
                            this.tF = allocate5;
                            N(charBuffer);
                            return;
                        }
                    }
                    charBuffer.position(position - charBuffer.arrayOffset());
                    ByteBuffer byteBuffer2 = this.SN;
                    byteBuffer2.position(position2 - byteBuffer2.arrayOffset());
                } else if (zH2 == 1) {
                    SN(charBuffer);
                } else if (zH2 == 2) {
                    N(charBuffer);
                }
            } else {
                throw new UnsupportedOperationException("TODO");
            }
        }
    }

    VV(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.yq = i;
        this.SN = byteBuffer;
        this.N = charBuffer;
        this.tF = intBuffer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char[] N() {
        return this.N.array();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] SN() {
        return this.SN.array();
    }

    public final int i() {
        Buffer buffer;
        int zH = kR.zH(this.yq);
        if (zH == 0) {
            buffer = this.SN;
        } else if (zH == 1) {
            buffer = this.N;
        } else if (zH == 2) {
            buffer = this.tF;
        } else {
            throw new UnsupportedOperationException("Not reached");
        }
        return buffer.position();
    }

    public final int t0() {
        Buffer buffer;
        int zH = kR.zH(this.yq);
        if (zH == 0) {
            buffer = this.SN;
        } else if (zH == 1) {
            buffer = this.N;
        } else if (zH == 2) {
            buffer = this.tF;
        } else {
            throw new UnsupportedOperationException("Not reached");
        }
        return buffer.remaining();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int tF() {
        return this.yq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int yq() {
        int zH = kR.zH(this.yq);
        if (zH == 0) {
            return this.SN.arrayOffset();
        }
        if (zH == 1) {
            return this.N.arrayOffset();
        }
        if (zH == 2) {
            return this.tF.arrayOffset();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] zH() {
        return this.tF.array();
    }
}
