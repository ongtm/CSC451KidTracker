package com.example.tong.csc451kidtracker.model;

import android.content.ContentValues;

import com.example.tong.csc451kidtracker.database.ItemsTable;

import java.util.UUID;

public class Question {
    private String questionId;
    private int num1;
    private int num2;
    private int result;
    private String oper;
    private int level;
    private String testName;

    //No argument Constructor
    public Question(){

    }

    public Question( int num1, int num2, int result, String oper, int level, String testName){

        questionId = UUID.randomUUID().toString();
this.questionId = questionId;
        this.num1 = num1;
        this.num2=num2;
        this.result = result;
        this.oper = oper;
        this.level = level;
        this.testName = testName;
    }
    public Question(String questionId, int num1, int num2, int result, String oper, int level, String testName){

        this.questionId = questionId;
        this.num1 = num1;
        this.num2=num2;
        this.result = result;
        this.oper = oper;
        this.level = level;
        this.testName = testName;
        }
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1){
        this.num1=num1;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public void setLevel(int level) { this.level = level;}

    public int getLevel(){return level;}

    public void setTestName (String testName){this.testName = testName;}

    public String getTestName(){return testName;}

    public ContentValues toQValues(){
        ContentValues qValues = new ContentValues(5);

        qValues.put(ItemsTable.COLUMN_QUESTION_ID,questionId);
        qValues.put(ItemsTable.COLUMN_QUESTION_NUM1, num1);
        qValues.put(ItemsTable.COLUMN_QUESTION_NUM2, num2);
        qValues.put(ItemsTable.COLUMN_QUESTION_OPER, oper);
        qValues.put(ItemsTable.COLUMN_QUESTION_RESULT, result);
        qValues.put(ItemsTable.COLUMN_QUESTION_LEVEL, level);
        qValues.put(ItemsTable.COLUMN_QUESTION_TESTNAME,testName);

        return qValues;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId='" + questionId + '\'' +
                ", num1=" + num1 + '\'' +
                ", num2=" + num2 + '\'' +
                ", result=" + result + '\'' +
                ", oper='" + oper + '\'' +
                ", level=" + level + '\'' +
                ", testName-" + testName + '\'' +
                '}';
    }
}