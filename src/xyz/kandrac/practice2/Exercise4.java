package xyz.kandrac.practice2;

import java.util.Scanner;

public class Exercise4 {

    public static void exercise4(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How would you rate your experience on scale 1-5?");
        int mood = scanner.nextInt();

        String result;
        switch (mood) {
            case 1:
            case 2: result = "Thank you for your vote!"; break;
            case 3:
            case 4:
            case 5: result = "Hope we can do better next time!"; break;
            default: result = "Incorrect input!";
        }
        System.out.println(result);
    }
}
