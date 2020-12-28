package xyz.kandrac.test.assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Capitols capitols = new Capitols();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            capitols.add(scanner.next(), scanner.next());
        }

        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            String capitol = capitols.getCapitolName(scanner.next());
            if (capitol == null) {
                System.out.println("Neznama krajina");
            } else {
                System.out.println(capitol);
            }
        }
    }
}
