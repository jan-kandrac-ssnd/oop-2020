package xyz.kandrac.test.assignment4;

import java.util.ArrayList;
import java.util.List;

public class DiceCounter {

    private List<Integer> tosses = new ArrayList<>();

    public DiceCounter() {
        for (int i = 0; i < 6; i++) { tosses.add(0); }
    }

    public void storeToss(int toss) {
        tosses.set(toss - 1, tosses.get(toss - 1) + 1);
    }

    public int mostCommonToss() {
        int maxTosses = 0;
        int maxTossPos = 0;
        for (int i = 0; i < 6; i++) {
            if (tosses.get(i) > maxTosses) {
                maxTossPos = i;
                maxTosses = tosses.get(i);
            }
        }
        return maxTossPos + 1;
    }

    public int leastCommonToss() {
        int minTosses = Integer.MAX_VALUE;
        int minTossPos = 0;
        for (int i = 0; i < tosses.size(); i++) {
            if (tosses.get(i) < minTosses) {
                minTossPos = i;
                minTosses = tosses.get(i);
            }
        }
        return minTossPos + 1;
    }
}
