package android.database.sqlite;

import android.content.ContentValues;
import android.database.Cursor;

import java.io.File;

/**
 * No-op desktop-JVM stub of android.database.sqlite.SQLiteDatabase.
 * 爬虫（merge.G/Rc 等）用 SQLite 做统计心跳/本地缓存；桌面端没有 SQLite，
 * 这里全部变为内存无操作：写路径丢弃，读路径返回空游标。爬虫行为等同首次运行。
 */
public class SQLiteDatabase extends SQLiteClosable {

    public static final int OPEN_READONLY = 0x00000001;
    public static final int OPEN_READWRITE = 0x00000000;
    public static final int CREATE_IF_NECESSARY = 0x10000000;

    public interface CursorFactory {
    }

    public static SQLiteDatabase openDatabase(String path, CursorFactory factory, int flags) {
        return new SQLiteDatabase();
    }

    public static SQLiteDatabase openDatabase(File file, int openFlags) {
        return new SQLiteDatabase();
    }

    public static SQLiteDatabase openOrCreateDatabase(String path, CursorFactory factory) {
        return new SQLiteDatabase();
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, CursorFactory factory) {
        return new SQLiteDatabase();
    }

    public void execSQL(String sql) {
    }

    public void execSQL(String sql, Object[] bindArgs) {
    }

    public Cursor rawQuery(String sql, String[] selectionArgs) {
        return new EmptyCursor();
    }

    public Cursor query(String table, String[] columns, String selection, String[] selectionArgs,
                        String groupBy, String having, String orderBy) {
        return new EmptyCursor();
    }

    public long insert(String table, String nullColumnHack, ContentValues values) {
        return 1L;
    }

    public long replace(String table, String nullColumnHack, ContentValues values) {
        return 1L;
    }

    public int update(String table, ContentValues values, String whereClause, String[] whereArgs) {
        return 0;
    }

    public int delete(String table, String whereClause, String[] whereArgs) {
        return 0;
    }

    public void beginTransaction() {
    }

    public void setTransactionSuccessful() {
    }

    public void endTransaction() {
    }

    public boolean isOpen() {
        return true;
    }

    public String getPath() {
        return "";
    }

    private static final class EmptyCursor implements Cursor {
        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public boolean moveToFirst() {
            return false;
        }

        @Override
        public boolean moveToNext() {
            return false;
        }

        @Override
        public boolean moveToPosition(int position) {
            return false;
        }

        @Override
        public boolean moveToLast() {
            return false;
        }

        @Override
        public int getColumnIndex(String columnName) {
            return -1;
        }

        @Override
        public int getInt(int columnIndex) {
            return 0;
        }

        @Override
        public long getLong(int columnIndex) {
            return 0L;
        }

        @Override
        public short getShort(int columnIndex) {
            return 0;
        }

        @Override
        public float getFloat(int columnIndex) {
            return 0f;
        }

        @Override
        public double getDouble(int columnIndex) {
            return 0d;
        }

        @Override
        public String getString(int columnIndex) {
            return null;
        }

        @Override
        public byte[] getBlob(int columnIndex) {
            return null;
        }

        @Override
        public boolean isNull(int columnIndex) {
            return true;
        }

        @Override
        public boolean isClosed() {
            return true;
        }

        @Override
        public void close() {
        }
    }
}
