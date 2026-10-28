package android.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;

public class ImageView extends View {

    public enum ScaleType {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public ImageView() {
        super();
    }

    public ImageView(Context context) {
        super(context);
    }

    public void setScaleType(ScaleType scaleType) {
    }

    public void setAdjustViewBounds(boolean adjustViewBounds) {
    }

    public void setImageBitmap(Bitmap bitmap) {
    }

    public void setImageResource(int resId) {
    }
}
