package com.example.tong.csc451kidtracker.model;

import android.content.ContentValues;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.example.tong.csc451kidtracker.database.ItemsTable;

import java.util.Date;
import java.util.UUID;

public class Test {

    private String testId;
    private int numQuestions;
    private int numCorrect;
    private int numIncorrect;
    private String testDate;
    //No argument Constructor
    public Test(){

    }

    //Standard Constructor
    public Test(String testId, int numQuestions, int numCorrect, int numIncorrect, String testDate ){
        if(testId == null){
            testId = UUID.randomUUID().toString();
            testDate = new Date().toString();
        }

        this.testId = testId;
        this.testDate = testDate;
        this.numQuestions = numQuestions;
        this.numCorrect = numCorrect;
        this.numIncorrect = numIncorrect;

    }

    public String getTestId() {
        return testId;
    }



    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void setNumCorrect(int numCorrect) {
        this.numCorrect = numCorrect;
    }

    public int getNumIncorrect() {
        return numIncorrect;
    }

    public void setNumIncorrect(int numIncorrect) {
        this.numIncorrect = numIncorrect;
    }

    public void setTestDate(String testDate) {this.testDate = testDate;}

    public String getTestDate(){return testDate;}
    public ContentValues toTValues(){
        ContentValues tValues = new ContentValues(4);

        tValues.put(ItemsTable.TESTS_ID,testId);
        tValues.put(ItemsTable.TESTS_NUMOFQUESTIONS,numQuestions);
        tValues.put(ItemsTable.TESTS_NUMCORRECT,numCorrect);
        tValues.put(ItemsTable.TESTS_NUMINCORRECT,numIncorrect);
        tValues.put(ItemsTable.TESTS_TESTDATE,testDate);

        return tValues;
    }

    @Override
    public String toString() {
        return "Test{" +
                "testId='" + testId + '\'' +
                ", numQuestions=" + numQuestions +
                ", numCorrect=" + numCorrect +
                ", numIncorrect=" + numIncorrect +
                ", testDate=" + testDate +
                '}';
    }
}
