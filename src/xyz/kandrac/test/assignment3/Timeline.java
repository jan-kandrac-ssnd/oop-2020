package xyz.kandrac.test.assignment3;

import java.util.ArrayList;
import java.util.Collections;

public class Timeline {

    private ArrayList<Integer> events = new ArrayList<>();

    public void addEvent(int year) {
        events.add(year);
    }

    public int getNextEvent(int actualYear) {
        Collections.sort(events);
        for (int i = 0; i < events.size(); i++) {
            int event = events.get(i);
            if (event > actualYear) {
                return event;
            }
        }
        return Integer.MAX_VALUE;
    }
}
