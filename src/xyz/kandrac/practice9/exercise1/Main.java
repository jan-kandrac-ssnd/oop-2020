package xyz.kandrac.practice9.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            switch (sc.nextInt()) {
                case 0: {
                    double r = sc.nextDouble();
                    list.add(new Circle(r));
                    break;
                }
                case 1: {
                    list.add(new Rectangle(sc.nextDouble(), sc.nextDouble()));
                    break;
                }
                case 2: {
                    list.add(new Square(sc.nextDouble()));
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Shape shape = list.get(i);
            shape.debugPrint();
        }
    }
}
