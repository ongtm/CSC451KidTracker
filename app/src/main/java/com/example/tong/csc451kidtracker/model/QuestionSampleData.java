package com.example.tong.csc451kidtracker.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionSampleData {
    public static List<Question> questionList;
    public static Map<String, Question> questionMap;

    static {
        questionList = new ArrayList<>();
        questionMap = new HashMap<>();

        //addTest(new Test(null, 10, 2, 8, "8/31/2018"));
        addQuestion(new Question(null, 1,1,2,"+",1, "addone"));
        addQuestion(new Question(null, 1,2,3,"+",1,"addone"));
        addQuestion(new Question(null, 1,3,4,"+",1,"addone"));
        addQuestion(new Question(null, 1,4,5,"+",1,"addone"));
        addQuestion(new Question(null, 1,5,6,"+",1,"addone"));

        addQuestion(new Question(null, 10,11,21,"+",2,"addtwo"));
        addQuestion(new Question(null, 10,12,22,"+",2,"addtwo"));
        addQuestion(new Question(null, 10,13,23,"+",2,"addtwo"));
        addQuestion(new Question(null, 10,14,24,"+",2,"addtwo"));
        addQuestion(new Question(null, 10,15,25,"+",2,"addtwo"));

        addQuestion(new Question(null, 100,101,201,"+",3,"addthree"));
        addQuestion(new Question(null, 100,102,202,"+",3,"addthree"));
        addQuestion(new Question(null, 100,103,203,"+",3,"adaddthreed_3"));
        addQuestion(new Question(null, 100,104,204,"+",3,"addthree"));
        addQuestion(new Question(null, 100,105,205,"+",3,"addthree"));

        addQuestion(new Question(null, 1000,1001,2001,"+",4,"addfour"));
        addQuestion(new Question(null, 1000,1002,2002,"+",4,"addfour"));
        addQuestion(new Question(null, 1000,1003,2003,"+",4,"addfour"));
        addQuestion(new Question(null, 1000,1004,2004,"+",4,"addfour"));
        addQuestion(new Question(null, 1000,1005,2005,"+",4,"addfour"));

        addQuestion(new Question(null, 10000,10001,20001,"+",5,"addfive"));
        addQuestion(new Question(null, 10000,10002,20002,"+",5,"addfive"));
        addQuestion(new Question(null, 10000,10003,20003,"+",5,"addfive"));
        addQuestion(new Question(null, 10000,10004,20004,"+",5,"addfive"));
        addQuestion(new Question(null, 10000,10005,20005,"+",5,"addfive"));

        addQuestion(new Question(null, 2,1,1,"-",1,"subone"));
        addQuestion(new Question(null, 3,1,2,"-",1,"subone"));
        addQuestion(new Question(null, 4,1,3,"-",1,"subone"));
        addQuestion(new Question(null, 5,1,4,"-",1,"subone"));
        addQuestion(new Question(null, 6,1,5,"-",1,"subone"));

        addQuestion(new Question(null, 11,10,1,"-",2,"subtwo"));
        addQuestion(new Question(null, 12,10,2,"-",2,"subtwo"));
        addQuestion(new Question(null, 13,10,3,"-",2,"subtwo"));
        addQuestion(new Question(null, 14,10,4,"-",2,"subtwo"));
        addQuestion(new Question(null, 15,10,5,"-",2,"subtwo"));

        addQuestion(new Question(null, 101,100,1,"-",3,"subthree"));
        addQuestion(new Question(null, 102,100,2,"-",3,"subthree"));
        addQuestion(new Question(null, 103,100,3,"-",3,"subthree"));
        addQuestion(new Question(null, 104,100,4,"-",3,"subthree"));
        addQuestion(new Question(null, 105,100,5,"-",3,"subthree"));

        addQuestion(new Question(null, 1001,1000,1,"-",4,"subfour"));
        addQuestion(new Question(null, 1002,1000,2,"-",4,"subfour"));
        addQuestion(new Question(null, 1003,1000,3,"-",4,"subfour"));
        addQuestion(new Question(null, 1004,1000,4,"-",4,"subfour"));
        addQuestion(new Question(null, 1005,1000,5,"-",4,"subfour"));

        addQuestion(new Question(null, 10001,10000,1,"-",5,"subfive"));
        addQuestion(new Question(null, 10002,10000,2,"-",5,"subfive"));
        addQuestion(new Question(null, 10003,10000,3,"-",5,"subfive"));
        addQuestion(new Question(null, 10004,10000,4,"-",5,"subfive"));
        addQuestion(new Question(null, 10005,10000,5,"-",5,"subfive"));



        addQuestion(new Question(null, 1,1,1,"*",1,"mulone"));
        addQuestion(new Question(null, 2,1,2,"*",1,"mulone"));
        addQuestion(new Question(null, 3,1,3,"*",1,"mulone"));
        addQuestion(new Question(null, 4,1,4,"*",1,"mulone"));
        addQuestion(new Question(null, 5,1,5,"*",1,"mulone"));

        addQuestion(new Question(null, 1,2,1,"*",2,"multwo"));
        addQuestion(new Question(null, 2,2,4,"*",2,"multwo"));
        addQuestion(new Question(null, 3,2,6,"*",2,"multwo"));
        addQuestion(new Question(null, 4,2,8,"*",2,"multwo"));
        addQuestion(new Question(null, 5,2,10,"*",2,"multwo"));

        addQuestion(new Question(null, 1,100,100,"*",3,"multhree"));
        addQuestion(new Question(null, 2,100,200,"*",3,"multhree"));
        addQuestion(new Question(null, 3,100,300,"*",3,"multhree"));
        addQuestion(new Question(null, 4,100,400,"*",3,"multhree"));
        addQuestion(new Question(null, 5,100,500,"*",3,"multhree"));

        addQuestion(new Question(null, 1,7,7,"*",4,"mulfour"));
        addQuestion(new Question(null, 2,7,14,"*",4,"mulfour"));
        addQuestion(new Question(null, 3,7,21,"*",4,"mulfour"));
        addQuestion(new Question(null, 4,7,28,"*",4,"mulfour"));
        addQuestion(new Question(null, 5,7,35,"*",4,"mulfour"));

        addQuestion(new Question(null, 1,200,200,"*",5,"mulfive"));
        addQuestion(new Question(null, 2,200,400,"*",5,"mulfive"));
        addQuestion(new Question(null, 3,200,600,"*",5,"mulfive"));
        addQuestion(new Question(null, 4,200,800,"*",5,"mulfive"));
        addQuestion(new Question(null, 5,200,1000,"*",5,"mulfive"));



        addQuestion(new Question(null, 1,1,1,"/",1,"divone"));
        addQuestion(new Question(null, 2,1,2,"/",1,"divone"));
        addQuestion(new Question(null, 3,1,3,"/",1,"divone"));
        addQuestion(new Question(null, 4,1,4,"/",1,"divone"));
        addQuestion(new Question(null, 5,1,5,"/",1,"divone"));

        addQuestion(new Question(null, 2,2,1,"/",2,"divtwo"));
        addQuestion(new Question(null, 4,2,2,"/",2,"divtwo"));
        addQuestion(new Question(null, 6,2,3,"/",2,"divtwo"));
        addQuestion(new Question(null, 8,2,4,"/",2,"divtwo"));
        addQuestion(new Question(null, 10,2,5,"/",2,"divtwo"));

        addQuestion(new Question(null, 100,100,1,"/",3,"divthree"));
        addQuestion(new Question(null, 200,100,2,"/",3,"divthree"));
        addQuestion(new Question(null, 300,100,4,"/",3,"divthree"));
        addQuestion(new Question(null, 400,100,5,"/",3,"divthree"));
        addQuestion(new Question(null, 500,100,6,"/",3,"divthree"));

        addQuestion(new Question(null, 7,7,1,"/",4,"divfour"));
        addQuestion(new Question(null, 14,7,2,"/",4,"divfour"));
        addQuestion(new Question(null, 21,7,3,"/",4,"divfour"));
        addQuestion(new Question(null, 28,7,4,"/",4,"divfour"));
        addQuestion(new Question(null, 35,7,5,"/",4,"divfour"));

        addQuestion(new Question(null, 200,200,1,"/",5,"divfive"));
        addQuestion(new Question(null, 400,200,2,"/",5,"divfive"));
        addQuestion(new Question(null, 600,200,3,"/",5,"divfive"));
        addQuestion(new Question(null, 800,200,4,"/",5,"divfive"));
        addQuestion(new Question(null, 1000,200,5,"/",5,"divfive"));




    }

    private static void addQuestion(Question question) {
        questionList.add(question);
        questionMap.put(question.getQuestionId(), question);
    }

}



