package android.widget;

import android.content.Context;
import android.view.ViewGroup;

public class LinearLayout extends ViewGroup {

    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        public static final int MATCH_PARENT = -1;
        public static final int WRAP_CONTENT = -2;

        public float weight;
        public int gravity = -1;

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(int width, int height, float weight) {
            super(width, height);
            this.weight = weight;
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }
    }

    private int orientation = HORIZONTAL;

    public LinearLayout() {
        super();
    }

    public LinearLayout(Context context) {
        super(context);
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setGravity(int gravity) {
    }

    public void setWeightSum(float weightSum) {
    }
}