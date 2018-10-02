package com.example.tong.csc451kidtracker.model;

import android.content.ContentValues;

import com.example.tong.csc451kidtracker.database.ItemsTable;

import java.util.UUID;

public class Answer {
    private String answerId;
    private String questionId;
    private int answerEntered;
    private String correctIncorrect;
    private String testId;

    //No argument constructor
    public Answer(){

    }

    //Standard constructor
    public Answer(String answerId, String questionId, int answerEntered, String correctIncorrect, String testId) {
        if (answerId == null) {
            answerId = UUID.randomUUID().toString();
        }

        this.answerId = answerId;
        this.questionId = questionId;
        this.answerEntered = answerEntered;
        this.correctIncorrect = correctIncorrect;
        this.testId = testId;
    }


    public String getAnswerId() {
        return answerId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public int getAnswerEntered() {
        return answerEntered;
    }

    public void setAnswerEntered(int answerEntered) {
        this.answerEntered = answerEntered;
    }

    public String getCorrectIncorrect() {
        return correctIncorrect;
    }

    public void setCorrectIncorrect(String correctIncorrect) {
        this.correctIncorrect = correctIncorrect;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public ContentValues toAValues(){
        ContentValues aValues = new ContentValues(5);

        aValues.put(ItemsTable.ANSWERS_ID, answerId);
        aValues.put(ItemsTable.ANSWERS_ENTERED, answerEntered);
        aValues.put(ItemsTable.ANSWERS_CORRECTINCORRECT, correctIncorrect);
        aValues.put(ItemsTable.ANSWERS_TESTID, testId);
        aValues.put(ItemsTable.ANSWERS_QUESTIONID, questionId);

        return aValues;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId='" + answerId + '\'' +
                ", questionId='" + questionId + '\'' +
                ", answerEntered=" + answerEntered + '\'' +
                ", correctIncorrect='" + correctIncorrect + '\'' +
                ", testId='" + testId + '\'' +
                '}';
    }
}
