package xyz.kandrac.test.assignment1;

import java.util.HashSet;
import java.util.Set;

public class Collection {

    private Set<String> collection = new HashSet<>();

    boolean addBug(String name) {
        return collection.add(name);
    }

    int getSize() {
        return collection.size();
    }
}
