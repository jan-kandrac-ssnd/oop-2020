package xyz.kandrac.practice15;

public class Main {

    public static void main(String[] args) {
        Util.getManhattanDistance(1, 2, 3, 4);

        int a = 1;
        int c =2;

        int b = 0;

        if (a == 1) {
            b = 2;
        } else {
            b = 4;
        }

        b = (a == 1) ? 2 : (c == 2) ? 3 : 4;

    }
}
