package xyz.kandrac.test.assignment3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Timeline timeline = new Timeline();

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            timeline.addEvent(input.nextInt());
        }

        int m = input.nextInt();
        int nextEvent = timeline.getNextEvent(m);

        if (nextEvent == Integer.MAX_VALUE) {
            System.out.println("Po roku " + m + " sa uz nic vyznamne neudialo");
        } else {
            System.out.println(nextEvent);
        }
    }
}
