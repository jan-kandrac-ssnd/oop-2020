package xyz.kandrac.practice8.exercise1;

import xyz.kandrac.practice8.exercise1.CardSorter;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        CardSorter cardSorter = new CardSorter();
        int n = r.nextInt();
        r.nextLine();
        for (int i = 0; i < n; i++) {
            String card = r.nextLine();
            boolean accepted = cardSorter.acceptCard(card);
            if (accepted) {
                System.out.println("Super");
            } else {
                System.out.println("Error");
            }
        }
    }
}
