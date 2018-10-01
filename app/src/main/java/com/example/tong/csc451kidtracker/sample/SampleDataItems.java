package com.example.tong.csc451kidtracker.sample;

import com.example.tong.csc451kidtracker.model.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataItems {
    public static List<Question> questionList;
    public static Map<String,Question> questionMap;

    static {
        questionList = new ArrayList<>();
        questionMap = new HashMap<>();

        addQuestion(new Question(null,1,1,2,"+"));
        addQuestion(new Question(null,1,2,3,"+"));
    }

    private static void addQuestion(Question question){
        questionList.add(question);
        questionMap.put(question.getQuestionId(),question);
    }


}
