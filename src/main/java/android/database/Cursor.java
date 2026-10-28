package android.database;

/**
 * Minimal desktop-JVM stub of android.database.Cursor.
 * SQLiteDatabase 的桩实现返回空游标，爬虫的本地统计/缓存写入因此变为无操作。
 */
public interface Cursor {

    int getCount();

    boolean moveToFirst();

    boolean moveToNext();

    boolean moveToPosition(int position);

    boolean moveToLast();

    int getColumnIndex(String columnName);

    int getInt(int columnIndex);

    long getLong(int columnIndex);

    short getShort(int columnIndex);

    float getFloat(int columnIndex);

    double getDouble(int columnIndex);

    String getString(int columnIndex);

    byte[] getBlob(int columnIndex);

    boolean isNull(int columnIndex);

    boolean isClosed();

    void close();
}
