package xyz.kandrac.practice5.exercise1;

public class Closet {

    private int shirts = 1, socks = 2;

    protected String getItemCount() {
        return "number of shirts : " + shirts + "\n" +
                "number of socks : " + socks;
    }

    public void printItemCount() {
        System.out.println(getItemCount());
    }

}
