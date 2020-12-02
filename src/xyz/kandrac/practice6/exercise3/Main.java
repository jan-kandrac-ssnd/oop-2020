package xyz.kandrac.practice6.exercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<String> set = new HashSet<>();

        do {
            String value = input.nextLine();
            if (value.equals("quit")) { break; }

            boolean success = set.add(value);

            if (success) {
                System.out.println("OK");
            } else {
                System.out.println("chyba - daný človek už turniketom prešiel");
            }

        } while (true);
    }
}
