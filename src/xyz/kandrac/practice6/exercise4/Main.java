package xyz.kandrac.practice6.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Turniket turniket = new Turniket();

        do {
            String value = input.nextLine();
            if (value.equals("quit")) { break; }

            boolean result;
            if (value.startsWith("+")) {
                result = turniket.enter(value.substring(1));
            } else {
                result = turniket.exit(value.substring(1));
            }

            if (result) {
                System.out.println("authenticated");
            } else {
                System.out.println("security error");
            }
        } while (true);

        turniket.printHistory();
    }
}
