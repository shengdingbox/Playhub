package android.graphics;

public class Color {

    public static final int WHITE = 0xFFFFFFFF;
    public static final int BLACK = 0xFF000000;
    public static final int TRANSPARENT = 0x00000000;
    public static final int RED = 0xFFFF0000;
    public static final int GREEN = 0xFF00FF00;
    public static final int BLUE = 0xFF0000FF;

    public static int parseColor(String colorString) {
        try {
            if (colorString != null && colorString.startsWith("#")) {
                return (int) Long.parseLong(colorString.substring(1), 16);
            }
        } catch (Exception ignore) {
        }
        return BLACK;
    }

    public static int rgb(int red, int green, int blue) {
        return 0xff000000 | (red << 16) | (green << 8) | blue;
    }

    public static int argb(int alpha, int red, int green, int blue) {
        return (alpha << 24) | (red << 16) | (green << 8) | blue;
    }
}