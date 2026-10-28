package android.app;

import android.content.Context;
import android.content.DialogInterface;

public class Dialog implements DialogInterface {

    protected final Context context;

    public Dialog() {
        this(null);
    }

    public Dialog(Context context) {
        this.context = context;
    }

    public void show() {
    }

    public void dismiss() {
    }

    public void cancel() {
    }

    public void onClick(DialogInterface dialog, int which) {
    }

    public boolean isShowing() {
        return false;
    }

    public void setCancelable(boolean cancelable) {
    }

    public void setCanceledOnTouchOutside(boolean cancel) {
    }

    public void setTitle(CharSequence title) {
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener listener) {
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener listener) {
    }
}