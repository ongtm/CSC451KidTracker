package com.example.tong.csc451kidtracker.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import com.example.tong.csc451kidtracker.model.Question;
import com.example.tong.csc451kidtracker.model.QuestionSampleData;

import java.util.ArrayList;
import java.util.List;

import static com.example.tong.csc451kidtracker.database.ItemsTable.TABLE_QUESTIONS;
import static com.example.tong.csc451kidtracker.database.ItemsTable.COLUMN_QUESTION_ID;
import static com.example.tong.csc451kidtracker.database.ItemsTable.COLUMN_QUESTION_LEVEL;
import static com.example.tong.csc451kidtracker.database.ItemsTable.COLUMN_QUESTION_NUM1;
import static com.example.tong.csc451kidtracker.database.ItemsTable.COLUMN_QUESTION_NUM2;
import static com.example.tong.csc451kidtracker.database.ItemsTable.COLUMN_QUESTION_OPER;
import static com.example.tong.csc451kidtracker.database.ItemsTable.COLUMN_QUESTION_RESULT;
import static com.example.tong.csc451kidtracker.database.ItemsTable.COLUMN_QUESTION_TESTNAME;

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
        db.execSQL(ItemsTable.SQL_CREATE_TESTS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //here you can either change the table structure and increment the version or
        //delete the table, increment version and recreate
        db.execSQL(ItemsTable.SQL_DELETE_QUESTIONS);
        db.execSQL(ItemsTable.SQL_DELETE_ANSWERS);
        db.execSQL(ItemsTable.SQL_DELETE_TESTS);
        onCreate(db);




    }

/*    public Cursor getQuestions(int level, String oper, SQLiteDatabase db){
        String[] returnColumns = {
            QUESTIONS.QUESTION_ID;


        }
    }*/

    //query(String table, String[] columns, String selectionArgs,
    // String groupBy, String having, String orderBy, String limit)

    public List<Question> getAllQuestions(int level, String oper){

        List<Question> mQuestionBank = new ArrayList<Question>();
        String selectQuery = "SELECT * FROM " + TABLE_QUESTIONS;

        SQLiteDatabase  db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(selectQuery,null);

        if(cursor.moveToFirst()){
            do{

                Question q = new Question();
                q.setQuestionId(cursor.getString(cursor.getColumnIndex(COLUMN_QUESTION_ID)));
                q.setNum1(cursor.getInt(cursor.getColumnIndex(COLUMN_QUESTION_NUM1)));
                q.setNum2(cursor.getInt(cursor.getColumnIndex(COLUMN_QUESTION_NUM2)));
                q.setResult(cursor.getInt(cursor.getColumnIndex(COLUMN_QUESTION_RESULT)));
                q.setOper(cursor.getString(cursor.getColumnIndex(COLUMN_QUESTION_OPER)));
                q.setLevel(cursor.getInt(cursor.getColumnIndex(COLUMN_QUESTION_LEVEL)));
                q.setTestName(cursor.getString(cursor.getColumnIndex(COLUMN_QUESTION_TESTNAME)));

                mQuestionBank.add(q);

            }while(cursor.moveToNext());
        }

        return mQuestionBank;
    }

    public List<Question> getSelectedQuestions(String testName){

        List<Question> mQuestionBank = new ArrayList<Question>();
        String selectQuery = "SELECT * FROM " + TABLE_QUESTIONS + " WHERE " + COLUMN_QUESTION_TESTNAME + "=?";

        SQLiteDatabase  db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(selectQuery,new String[] {testName});

        if(cursor.moveToFirst()){
            do{

                Question q = new Question();
                q.setQuestionId(cursor.getString(cursor.getColumnIndex(COLUMN_QUESTION_ID)));
                q.setNum1(cursor.getInt(cursor.getColumnIndex(COLUMN_QUESTION_NUM1)));
                q.setNum2(cursor.getInt(cursor.getColumnIndex(COLUMN_QUESTION_NUM2)));
                q.setResult(cursor.getInt(cursor.getColumnIndex(COLUMN_QUESTION_RESULT)));
                q.setOper(cursor.getString(cursor.getColumnIndex(COLUMN_QUESTION_OPER)));
                q.setLevel(cursor.getInt(cursor.getColumnIndex(COLUMN_QUESTION_LEVEL)));
                q.setTestName(cursor.getString(cursor.getColumnIndex(COLUMN_QUESTION_TESTNAME)));

                mQuestionBank.add(q);

            }while(cursor.moveToNext());
        }

        return mQuestionBank;
    }

}
