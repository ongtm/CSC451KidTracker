package com.example.tong.csc451kidtracker.model;

import java.util.UUID;

public class Question {
    private String questionId;
    private int num1;
    private int num2;
    private int result;
    private String oper;

    //No argument Constructor
    public Question(){

    }

    public Question(String questionId, int num1, int num2, int result, String oper){

        if(questionId == null){
            questionId = UUID.randomUUID().toString();
        }
        this.questionId = questionId;
        this.num1 = num1;
        this.num2=num2;
        this.result = result;
        this.oper = oper;
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
}
