package android.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class ArrayAdapter<T> implements ListAdapter {

    public ArrayAdapter(Context context, int resource) {
    }

    public ArrayAdapter(Context context, int resource, java.util.List<T> objects) {
    }

    public void add(T object) {
    }

    public void addAll(java.util.Collection<? extends T> collection) {
    }

    public void clear() {
    }

    public void notifyDataSetChanged() {
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return convertView;
    }
}