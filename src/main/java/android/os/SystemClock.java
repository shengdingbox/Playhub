package android.os;

/**
 * Minimal desktop-JVM stub of android.os.SystemClock so that spiders converted
 * from Android DEX bytecode can resolve the class. Time values are backed by
 * System.nanoTime(), matching Android semantics (monotonic, ms since boot-ish).
 */
public final class SystemClock {

    private SystemClock() {
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean setCurrentTimeMillis(long millis) {
        return false;
    }

    public static long uptimeMillis() {
        return System.nanoTime() / 1_000_000L;
    }

    public static long elapsedRealtime() {
        return uptimeMillis();
    }

    public static long elapsedRealtimeNanos() {
        return System.nanoTime();
    }

    public static long currentThreadTimeMillis() {
        return uptimeMillis();
    }
}
