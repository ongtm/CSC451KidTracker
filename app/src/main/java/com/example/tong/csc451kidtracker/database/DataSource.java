package com.example.tong.csc451kidtracker.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.tong.csc451kidtracker.model.Answer;
import com.example.tong.csc451kidtracker.model.Question;
import com.example.tong.csc451kidtracker.model.Test;

public class DataSource {

    private Context mContext;
    private SQLiteDatabase mDatabase;
    SQLiteOpenHelper mDbHelper;


    public DataSource(Context context) {
        this.mContext = context;
        mDbHelper = new DBHelper(mContext);
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void open(){
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void close(){
        mDbHelper.close();
    }

    public Question createQuestion(Question question){
        ContentValues values = question.toQValues();
        mDatabase.insert(ItemsTable.QUESTIONS,null,values);
        return question;
    }

    public Answer createAnswer(Answer answer){
        ContentValues values = answer.toAValues();
        mDatabase.insert(ItemsTable.ANSWERS,null,values);
        return answer;
    }

    public Test createTest(Test test){
        ContentValues values = test.toTValues();
        mDatabase.insert(ItemsTable.TESTS,null,values);
        return test;

    }
}
