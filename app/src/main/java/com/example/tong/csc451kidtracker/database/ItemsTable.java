package com.example.tong.csc451kidtracker.database;

import android.preference.PreferenceFragment;

public class ItemsTable {

    public static final String QUESTIONS = "questions";
    public static final String QUESTION_ID = "questionId";
    public static final String QUESTION_NUM1 = "num1";
    public static final String QUESTION_NUM2 = "num2";
    public static final String QUESTION_OPER = "oper";
    public static final String QUESTION_RESULT = "result";


    public static final String SQL_CREATE_QUESTIONS =
            "CREATE TABLE " + QUESTIONS + "(" +
                    QUESTION_ID + " TEXT PRIMARY KEY," +
                    QUESTION_NUM1 + " INTEGER," +
                    QUESTION_NUM2 + " INTEGER," +
                    QUESTION_OPER + " TEXT," +
                    QUESTION_RESULT + " INTEGER" + ");";

    public static final String SQL_DELETE_QUESTIONS =
            "DROP TABLE " + QUESTIONS;

    public static final String ANSWERS = "answers";
    public static final String ANSWERS_ID = "answerId";
    public static final String ANSWERS_NUM1="num1";
    public static final String ANSWERS_NUM2="num2";
    public static final String ANSWERS_OPER = "oper";
    public static final String ANSWERS_RESULT = "result";
    public static final String ANSWERS_CORRECT="correct";

    public static final String SQL_CREATE_ANSWERS=
            "CREATE TABLE "+ ANSWERS + "(" +
                    ANSWERS_ID + " TEXT PRIMARY KEY," +
                    ANSWERS_NUM1 + " INTEGER," +
                    ANSWERS_NUM2 + " INTEGER," +
                    ANSWERS_OPER + " TEXT," +
                    ANSWERS_RESULT + " INTEGER," +
                    ANSWERS_CORRECT + " TEXT" + ");";

    public static final String SQL_DELETE_ANSWERS =
            "DROP TABLE " + ANSWERS;
}
