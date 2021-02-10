package xyz.kandrac.practice13.lecture2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> myList = new ArrayList<>();

        Shape s1 = new Circle();
        Shape s2 = new Square();

        myList.add(s1);
        myList.add(s2);
        myList.add(new Circle());
        myList.add(new Circle());
        myList.add(new Square());
        myList.add(new Square());

        myList.sort((o1, o2) -> o2.hashCode() - o1.hashCode());

        for (int i = 0; i < myList.size(); i++) {
            Shape s = myList.get(i);
            if (s instanceof Square) {
                s.print();
            }
        }
    }
}
