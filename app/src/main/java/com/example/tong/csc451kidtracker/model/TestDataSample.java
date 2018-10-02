package com.example.tong.csc451kidtracker.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.tong.csc451kidtracker.model.Test;

public class TestDataSample {
    public static List<Test> testList;
    public static Map<String, Test> testMap;

    static {
        testList = new ArrayList<>();
        testMap = new HashMap<>();

        addTest(new Test(null, 10, 2, 8, "8/31/2018"));
        addTest(new Test(null, 10, 8, 2, "9/1/2018"));
        addTest(new Test(null, 10, 5, 5, "9/2/2018"));
        addTest(new Test(null, 10, 10, 0, "9/15/2018"));
    }

    private static void addTest(Test test) {
        testList.add(test);
        testMap.put(test.getTestId(), test);
    }
}

