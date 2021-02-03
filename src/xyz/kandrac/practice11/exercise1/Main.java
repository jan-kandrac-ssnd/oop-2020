package xyz.kandrac.practice11.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        List<POI> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new POI(input.nextDouble(), input.nextDouble(), input.next()));
        }

        double smallestDistance = Double.MAX_VALUE;
        POI city1 = null;
        POI city2 = null;
        for (int i = 0; i < list.size(); i++) {
            POI myPoi = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                POI myPoi2 = list.get(j);
                double computedDistance = myPoi.distanceFrom(myPoi2);
                if (computedDistance < smallestDistance) {
                    smallestDistance = computedDistance;
                    city1 = myPoi;
                    city2 = myPoi2;
                }
            }
        }

        System.out.println(city1.getName() + " " + city2.getName());
    }
}
