package xyz.kandrac.practice2;

import java.util.Scanner;

public class Exercise5 {

    public static void exercise5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result;

        do {
            int mood = scanner.nextInt();
            if (scanner.hasNextLine()) {
                scanner.nextLine(); // nextInt neberie znak konca riadku!
            }

            switch (mood) {
                case 1:
                case 2: result = "Thank you for your vote!";break;
                case 3:
                case 4:
                case 5: result = "Hope we can do better next time!";break;
                default: result = "Incorrect input!";
            }
            System.out.println(result);
        } while(result.equals("Incorrect input!"));
    }
}
