package android.view;

public class Window {

    public static final int FEATURE_NO_TITLE = 1;
    public static final int FEATURE_ACTION_BAR = 8;

    private View decorView = new ViewGroup() {
    };

    public View getDecorView() {
        return decorView;
    }

    public View peekDecorView() {
        return decorView;
    }

    public void setContentView(View view) {
        this.decorView = view == null ? decorView : view;
    }

    public void setContentView(int layoutResId) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
    }

    public void setLayout(int width, int height) {
    }

    public void setFlags(int flags, int mask) {
    }

    public void addFlags(int flags) {
    }

    public void clearFlags(int flags) {
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    public void setBackgroundDrawableResource(int resId) {
    }

    public View findViewById(int id) {
        return new View();
    }

    public boolean requestFeature(int featureId) {
        return true;
    }

    public LayoutParams getAttributes() {
        return new LayoutParams();
    }

    public void setAttributes(LayoutParams params) {
    }

    public void setSoftInputMode(int mode) {
    }

    public static class LayoutParams {

        public static final int FLAG_NOT_FOCUSABLE = 8;
        public static final int FLAG_NOT_TOUCHABLE = 16;
        public static final int FLAG_NOT_TOUCH_MODAL = 32;
        public static final int FLAG_LAYOUT_IN_SCREEN = 256;
        public static final int FLAG_FULLSCREEN = 1024;
        public static final int FLAG_KEEP_SCREEN_ON = 128;

        public static final int TYPE_APPLICATION = 2;
        public static final int TYPE_APPLICATION_OVERLAY = 2038;

        public static final int FORMAT_TRANSLUCENT = -3;
        public static final int FORMAT_RGBA_8888 = 1;

        public int width = -2;
        public int height = -2;
        public int type = TYPE_APPLICATION;
        public int format = -1;
        public int gravity = 0;
        public int flags = 0;
        public float alpha = 1f;
        public float dimAmount = 1f;

        public LayoutParams() {
        }

        public LayoutParams(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public LayoutParams(int width, int height, int type) {
            this.width = width;
            this.height = height;
            this.type = type;
        }
    }
}