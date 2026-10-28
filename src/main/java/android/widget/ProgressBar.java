package android.widget;

import android.content.Context;
import android.view.View;

public class ProgressBar extends View {

    private int progress;

    public ProgressBar(Context context) {
        super(context);
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getProgress() {
        return progress;
    }

    public void setMax(int max) {
    }

    public void setVisibility(int visibility) {
    }

    public void setIndeterminate(boolean indeterminate) {
    }
}