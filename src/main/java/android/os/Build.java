package android.os;

public final class Build {

    public static final String MODEL = "MIBOX4";
    public static final String DEVICE = "once";
    public static final String BRAND = "Xiaomi";
    public static final String MANUFACTURER = "Xiaomi";
    public static final String PRODUCT = "once";
    public static final String BOARD = "once";
    public static final String HARDWARE = "mt8695";
    public static final String HOST = "c3-miui-ota-bd074";
    public static final String ID = "RKQ1.211001.001";
    public static final String DISPLAY = "RKQ1.211001.001 test-keys";
    public static final String FINGERPRINT = "Xiaomi/once/once:11/RKQ1.211001.001/V14.0.0.1.ODMMIXM:user/release-keys";
    public static final String SERIAL = "a0437b95410bcd47";
    public static final String TAGS = "release-keys";
    public static final String TYPE = "user";
    public static final String USER = "builder";
    public static final String RADIO = "unknown";
    public static final String BOOTLOADER = "unknown";
    public static final long TIME = 1638000000000L;

    private Build() {
    }

    public static String getSerial() {
        return SERIAL;
    }

    public static final class VERSION {
        public static final int SDK_INT = 30;
        public static final String RELEASE = "11";

        private VERSION() {
        }
    }
}
