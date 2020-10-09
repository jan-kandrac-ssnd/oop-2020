package xyz.kandrac.practice2;

import java.util.Scanner;

public class Exercise1 {
    public static void exercise1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int prev = 0;
        int act = 1;

        System.out.println(prev);
        while (act < n) {
            System.out.println(act);
            int help = prev;
            prev = act;
            act = help + act;
        }
    }
}
