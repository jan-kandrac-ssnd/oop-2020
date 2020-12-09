package xyz.kandrac.practice7;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();

        HashMap<String, HashMap<String, String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String l, k, v;
            l = reader.next();
            k = reader.next();
            v = reader.nextLine().substring(1);

            HashMap<String, String> langMap = map.get(l);
            if (langMap == null) {
                langMap = new HashMap<>();
            }
            langMap.put(k, v);
            map.put(l, langMap);
        }

        String l = reader.next();
        String k = reader.next();

        System.out.println(map.get(l).get(k));

    }

}
