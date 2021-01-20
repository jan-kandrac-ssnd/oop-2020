package xyz.kandrac.practice10.exercise3;


import xyz.kandrac.practice10.exercise3.lib.Painter;

public class Main {

    public static void main(String[] args) {
        PacMan a = new PacMan(50, 50);
        Pellet b = new Pellet(80, 90);

        Painter p = new Painter();
        p.addShape(a);
        p.addShape(b);
    }
}
