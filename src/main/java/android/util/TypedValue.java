package android.util;

public class TypedValue {

    public static final int COMPLEX_UNIT_PX = 0;
    public static final int COMPLEX_UNIT_DIP = 1;
    public static final int COMPLEX_UNIT_SP = 2;

    public static float applyDimension(int unit, float value, DisplayMetrics metrics) {
        return value;
    }

    public int type = 0;
    public CharSequence string = null;

    public CharSequence coerceToString() {
        return string;
    }
}