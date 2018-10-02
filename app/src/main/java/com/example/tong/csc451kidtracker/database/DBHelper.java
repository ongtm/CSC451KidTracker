package com.example.tong.csc451kidtracker.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    //Name of database
    public static final String DB_FILE_NAME = "questions.db";
    //Version
    public static final Integer DB_VERSION = 1;


    public DBHelper(Context context) {
        super(context, DB_FILE_NAME,null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ItemsTable.SQL_CREATE_QUESTIONS);
        db.execSQL(ItemsTable.SQL_CREATE_ANSWERS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //here you can either change the table structure and increment the version or
        //delete the table, increment version and recreate
        db.execSQL(ItemsTable.SQL_DELETE_QUESTIONS);
        db.execSQL(ItemsTable.SQL_DELETE_ANSWERS);

        onCreate(db);

    }

    /*Public Cursor getQuestions(int level, String oper, SQLiteDatabase db){
        String[] projections = (ItemsTable.QUESTIONS.QUESTION_ID);

        return thisCursor;
    }*/
}
