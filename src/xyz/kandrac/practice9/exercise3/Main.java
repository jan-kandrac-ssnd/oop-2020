package xyz.kandrac.practice9.exercise3;

public class Main {

    public static void main(String[] args) {
        PacMan a = new PacMan(5, 5);
        Point b = new Point(8, 9);

        System.out.println(a.getManhattanDistance(b));
    }
}
