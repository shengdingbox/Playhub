package android.view;

public interface WindowManager {

    final class LayoutParams {

        public static final int FLAG_NOT_FOCUSABLE = 8;
        public static final int FLAG_NOT_TOUCHABLE = 16;
        public static final int FLAG_LAYOUT_IN_SCREEN = 256;

        public int width = -2;
        public int height = -2;
        public int type = 0;
        public int format = -1;
        public int gravity = 0;
        public int flags = 0;
        public float alpha = 1f;

        public LayoutParams() {
        }

        public LayoutParams(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    Display getDefaultDisplay();

    void addView(View view, LayoutParams params);

    void removeView(View view);

    void removeViewImmediate(View view);

    void updateViewLayout(View view, LayoutParams params);
}