package xyz.kandrac.practice6;

import java.util.*;

public class Main {


    public static void listUsage() {
        ArrayList<Integer> a;    // namiesto int
        ArrayList<Character> b;  // namiesto char
        ArrayList<Double> c;     // namiesto double
        ArrayList<Float> d;      // namiesto float

        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        list.add(0, 1);
        list.add(0, 2);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void setUsage() {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('d');
        set.add('a');
        set.remove('a');

        // prevedenie setu do pola a iteracia poloziek
        Character[] arr = set.toArray(new Character[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // pouzitie iteratora pre iterovanie poloziek
        for (Character item : set) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

    }
}
