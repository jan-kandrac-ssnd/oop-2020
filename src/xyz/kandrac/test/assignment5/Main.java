package xyz.kandrac.test.assignment5;

import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Handshakes handshakes = new Handshakes();

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            handshakes.addHandshake(input.next(), input.next());
        }

        String name = input.next();

        Set<String> newInfected = handshakes.getPersonsInContactWith(name);

        if (newInfected == null) {
            System.out.println(name + " na oslave nebol");
            return;
        }

        for (String infected: newInfected) {
            System.out.println(infected);
        }
    }
}
