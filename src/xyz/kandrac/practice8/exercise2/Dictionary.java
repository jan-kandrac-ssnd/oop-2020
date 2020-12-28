package xyz.kandrac.practice8.exercise2;

import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dict = new HashMap<>();

    public void put(String slovak, String english) {
        dict.put(slovak, english);
    }

    public String get(String translate) {
        return dict.get(translate);
    }
}
