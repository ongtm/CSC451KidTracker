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
    public static final String ANSWERS_CORRECTINCORRECT = "correct";
    public static final String ANSWERS_ENTERED = "entered";
    public static final String ANSWERS_TESTID = "testId";
    public static final String ANSWERS_QUESTIONID = "questionId";

    public static final String SQL_CREATE_ANSWERS=
            "CREATE TABLE "+ ANSWERS + "(" +
                    ANSWERS_ID + " TEXT PRIMARY KEY," +
                    ANSWERS_CORRECTINCORRECT + " TEXT," +
                    ANSWERS_ENTERED + " INTEGER," +
                    ANSWERS_TESTID + " TEXT," +
                    ANSWERS_QUESTIONID + " TEXT " + ");";

    public static final String SQL_DELETE_ANSWERS =
            "DROP TABLE " + ANSWERS;

    public static final String TESTS = "tests";
    public static final String TESTS_ID = "testId";
    public static final String TESTS_NUMOFQUESTIONS = "numOfQuestions";
    public static final String TESTS_NUMCORRECT = "numCorrect";
    public static final String TESTS_NUMINCORRECT = "numIncorrect";

    public static final String SQL_CREATE_TESTS =
        "CREATE TABLE " + TESTS + "(" +
                TESTS_ID + " TEXT PRIMARY KEY," +
                TESTS_NUMOFQUESTIONS + " INTEGER," +
                TESTS_NUMCORRECT + " INTEGER," +
                TESTS_NUMINCORRECT + " INTEGER" + ");" ;

    public static final String SQL_DELETE_TESTS =
            "DROP TABLE " + TESTS;

}
