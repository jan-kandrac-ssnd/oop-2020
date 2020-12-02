package xyz.kandrac.practice6.exercise4;

import java.text.SimpleDateFormat;
import java.util.*;

public class Turniket {

    private final Set<String> names = new HashSet<>();
    private final List<String> accesses = new ArrayList<>();

    public boolean enter(String name) {
        boolean success = names.add(name);
        accesses.add("ENTER - " + name + " " + success + " " + SimpleDateFormat.getTimeInstance().format(new Date()));
        return success;
    }

    public boolean exit(String name) {
        boolean success = names.remove(name);
        accesses.add("EXIT - " + name + " " + success + " " + SimpleDateFormat.getTimeInstance().format(new Date()));
        return success;
    }


    public void printHistory() {
        for (int i = 0; i < accesses.size(); i++) {
            System.out.println(accesses.get(i));
        }
    }
}
