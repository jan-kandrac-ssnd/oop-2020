package xyz.kandrac.practice8.exercise2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String slovak = scanner.next();
            String english = scanner.next();
            dictionary.put(slovak, english);
        }

        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            String translate = scanner.next();
            String translation = dictionary.get(translate);

            if (translation == null) {
                System.out.println("Error");
            } else {
                System.out.println(translation);
            }
        }
    }
}
