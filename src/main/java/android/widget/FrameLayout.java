package android.widget;

import android.content.Context;
import android.view.ViewGroup;

public class FrameLayout extends ViewGroup {

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        public static final int MATCH_PARENT = -1;
        public static final int WRAP_CONTENT = -2;

        public int gravity = -1;

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(int width, int height, int gravity) {
            super(width, height);
            this.gravity = gravity;
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }
    }

    public FrameLayout() {
        super();
    }

    public FrameLayout(Context context) {
        super(context);
    }

    public void setForegroundGravity(int gravity) {
    }
}