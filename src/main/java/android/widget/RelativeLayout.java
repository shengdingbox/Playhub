package android.widget;

import android.content.Context;
import android.view.ViewGroup;

public class RelativeLayout extends ViewGroup {

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        public static final int ALIGN_PARENT_TOP = 10;
        public static final int ALIGN_PARENT_BOTTOM = 12;
        public static final int CENTER_IN_PARENT = 13;
        public static final int CENTER_HORIZONTAL = 14;
        public static final int CENTER_VERTICAL = 15;

        public int[] rules = new int[22];
        public boolean alignWithParent;

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }

        public void addRule(int verb) {
            if (verb >= 0 && verb < rules.length) {
                rules[verb] = 1;
            }
        }

        public void addRule(int verb, int subject) {
            if (verb >= 0 && verb < rules.length) {
                rules[verb] = subject;
            }
        }
    }

    public RelativeLayout() {
        super();
    }

    public RelativeLayout(Context context) {
        super(context);
    }

    public void setGravity(int gravity) {
    }
}