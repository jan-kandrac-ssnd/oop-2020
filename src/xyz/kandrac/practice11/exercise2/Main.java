package xyz.kandrac.practice11.exercise2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        List<POI> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            switch (input.next()) {
                case "RESTAURANT" : list.add(new Restaurant(input.nextDouble(), input.nextDouble(), input.next(), input.next(), input.next())); break;
                case "HOTEL" : list.add(new Hotel(input.nextDouble(), input.nextDouble(), input.next(), input.nextDouble())); break;
                default:
            }
        }

        for (int i = 0; i < list.size(); i++) {
            POI myPoi = list.get(i);
            System.out.println(myPoi);
        }
    }
}
