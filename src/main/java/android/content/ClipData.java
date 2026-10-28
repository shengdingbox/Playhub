package android.content;

public class ClipData {

    public static ClipData newPlainText(CharSequence label, CharSequence text) {
        return new ClipData();
    }

    public CharSequence getLabel() {
        return "";
    }

    public int getItemCount() {
        return 1;
    }
}