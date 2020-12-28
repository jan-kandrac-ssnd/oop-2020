package xyz.kandrac.test.assignment5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Handshakes {

    private Map<String, Set<String>> map = new HashMap<>();

    public void addHandshake(String personA, String personB) {
        if (map.get(personA) == null) { map.put(personA, new HashSet<>()); }
        if (map.get(personB) == null) { map.put(personB, new HashSet<>()); }

        Set<String> personAContacts = map.get(personA);
        Set<String> personBContacts = map.get(personB);

        personAContacts.add(personB);
        personBContacts.add(personA);
    }

    public Set<String> getPersonsInContactWith(String name) {
        return map.get(name);
    }
}
