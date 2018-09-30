package com.example.tong.csc451kidtracker.model;

import java.util.UUID;

public class Test {

    private String testId;
    private int numQuestions;
    private int numCorrect;
    private int numIncorrect;

    //No argument Constructor
    public Test(){

    }

    //Standard Constructor
    public Test(String testId, int numQuestions, int numCorrect, int numIncorrect ){
        if(testId == null){
            testId = UUID.randomUUID().toString();
        }
        this.testId = testId;
        this.numQuestions = numQuestions;
        this.numCorrect = numCorrect;
        this.numIncorrect = numIncorrect;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
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
}
