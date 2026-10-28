package android.graphics;

public class Typeface {

    public static final int NORMAL = 0;
    public static final int BOLD = 1;
    public static final int ITALIC = 2;

    public static final Typeface DEFAULT = new Typeface();
    public static final Typeface DEFAULT_BOLD = new Typeface();
    public static final Typeface SANS_SERIF = new Typeface();
    public static final Typeface MONOSPACE = new Typeface();

    public static Typeface create(String familyName, int style) {
        return DEFAULT;
    }

    public static Typeface createFromFile(String path) {
        return DEFAULT;
    }

    public static Typeface defaultFromStyle(int style) {
        return DEFAULT;
    }
}