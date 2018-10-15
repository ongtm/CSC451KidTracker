package com.example.tong.csc451kidtracker.database;

import android.preference.PreferenceFragment;

import com.example.tong.csc451kidtracker.MainActivity;
import com.example.tong.csc451kidtracker.model.Question;
import com.example.tong.csc451kidtracker.model.QuestionSampleData;

import java.util.List;

public class ItemsTable {

    public static final String TABLE_QUESTIONS = "questions";
    public static final String COLUMN_QUESTION_ID = "questionId";
    public static final String COLUMN_QUESTION_NUM1 = "num1";
    public static final String COLUMN_QUESTION_NUM2 = "num2";
    public static final String COLUMN_QUESTION_OPER = "oper";
    public static final String COLUMN_QUESTION_RESULT = "result";
    public static final String COLUMN_QUESTION_LEVEL = "level";
    public static final String COLUMN_QUESTION_TESTNAME= "testName";

    public static final String SQL_CREATE_QUESTIONS =
            //"CREATE TABLE QUESTIONS " + "(" +
            "CREATE TABLE " + TABLE_QUESTIONS + "(" +
                    COLUMN_QUESTION_ID + " TEXT PRIMARY KEY," +
                    COLUMN_QUESTION_NUM1 + " INTEGER," +
                    COLUMN_QUESTION_NUM2 + " INTEGER," +
                    COLUMN_QUESTION_OPER + " TEXT," +
                    COLUMN_QUESTION_RESULT + " INTEGER," +
                    COLUMN_QUESTION_LEVEL + " INTEGER," +
                    COLUMN_QUESTION_TESTNAME + " TEXT" + ");";

    public static final String SQL_DELETE_QUESTIONS =
        "DROP TABLE TABLE_QUESTIONS";
        //"DROP TABLE " + QUESTIONS;

    public static final String TABLE_ANSWERS = "answers";
    public static final String COLUMN_ANSWERS_ID = "answerId";
    public static final String COLUMN_ANSWERS_CORRECTINCORRECT = "correct";
    public static final String COLUMN_ANSWERS_ENTERED = "entered";
    public static final String COLUMN_ANSWERS_TESTID = "testId";
    public static final String COLUMN_ANSWERS_QUESTIONID = "questionId";

    public static final String SQL_CREATE_ANSWERS=
            "CREATE TABLE "+ TABLE_ANSWERS + "(" +
                    COLUMN_ANSWERS_ID + " TEXT PRIMARY KEY," +
                    COLUMN_ANSWERS_CORRECTINCORRECT + " TEXT," +
                    COLUMN_ANSWERS_ENTERED + " INTEGER," +
                    COLUMN_ANSWERS_TESTID + " TEXT," +
                    COLUMN_ANSWERS_QUESTIONID + " TEXT " + ");";

    public static final String SQL_DELETE_ANSWERS =
            "DROP TABLE " + TABLE_ANSWERS;

    public static final String TABLE_TESTS = "tests";
    public static final String COLUMN_TESTS_ID = "testId";
    public static final String COLUMN_TESTS_NUMOFQUESTIONS = "numOfQuestions";
    public static final String COLUMN_TESTS_NUMCORRECT = "numCorrect";
    public static final String COLUMN_TESTS_NUMINCORRECT = "numIncorrect";
    public static final String COLUMN_TESTS_TESTDATE= "testDate";

    public static final String SQL_CREATE_TESTS =
        "CREATE TABLE " + TABLE_TESTS + "(" +
                COLUMN_TESTS_ID + " TEXT PRIMARY KEY," +
                COLUMN_TESTS_NUMOFQUESTIONS + " INTEGER," +
                COLUMN_TESTS_NUMCORRECT + " INTEGER," +
                COLUMN_TESTS_NUMINCORRECT + " INTEGER" +
                COLUMN_TESTS_TESTDATE + " TEXT" + ");" ;

    public static final String SQL_DELETE_TESTS =
            "DROP TABLE " + TABLE_TESTS;




}
