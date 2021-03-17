package xyz.kandrac.practice17.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameType vasapremenna;

        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        vasapremenna = value == 521 ? GameType.FULL : GameType.DEMO;

        System.out.println(vasapremenna.name());
    }
}
