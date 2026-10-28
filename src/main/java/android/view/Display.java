package android.view;

import android.util.DisplayMetrics;

public final class Display {

    private final DisplayMetrics metrics = new DisplayMetrics();

    public DisplayMetrics getMetrics(DisplayMetrics outMetrics) {
        DisplayMetrics target = outMetrics == null ? metrics : outMetrics;
        target.widthPixels = 1920;
        target.heightPixels = 1080;
        target.density = 1.5f;
        target.densityDpi = 240;
        target.scaledDensity = 1.5f;
        return target;
    }

    public int getWidth() {
        return 1920;
    }

    public int getHeight() {
        return 1080;
    }

    public int getRotation() {
        return 0;
    }
}