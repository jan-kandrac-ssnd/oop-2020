package xyz.kandrac.test.assignment2;

import java.util.HashMap;
import java.util.Map;

public class Capitols {

    private Map<String, String> map = new HashMap<>();

    public void add(String country, String capitol) {
        map.put(country, capitol);
    }

    public String getCapitolName(String country) {
        return map.get(country);
    }
}
