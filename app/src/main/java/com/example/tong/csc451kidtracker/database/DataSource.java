package com.example.tong.csc451kidtracker.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.tong.csc451kidtracker.model.Answer;
import com.example.tong.csc451kidtracker.model.Question;
import com.example.tong.csc451kidtracker.model.QuestionSampleData;
import com.example.tong.csc451kidtracker.model.Test;

import java.util.List;

import static com.example.tong.csc451kidtracker.database.ItemsTable.TABLE_QUESTIONS;

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

        //Check if questions table has records
            if(isEmpty("questions")==0) {
                List<Question> question = QuestionSampleData.questionList;
                for (Question q : question) {
                    createQuestion(q);
                }
            }
    }

    public void close(){
        mDbHelper.close();
    }

    public Question createQuestion(Question question){
        ContentValues values = question.toQValues();
        mDatabase.insert(TABLE_QUESTIONS,null,values);
        return question;
    }

    public Answer createAnswer(Answer answer){
        ContentValues values = answer.toAValues();
        mDatabase.insert(ItemsTable.TABLE_ANSWERS,null,values);
        return answer;
    }

    public Test createTest(Test test){
        ContentValues values = test.toTValues();
        mDatabase.insert(ItemsTable.TABLE_TESTS,null,values);
        return test;

    }

    public long isEmpty(String table){
        SQLiteDatabase database = this.mDatabase;
        return DatabaseUtils.queryNumEntries(database,table);
    }
}
