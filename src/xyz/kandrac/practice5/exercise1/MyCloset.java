package xyz.kandrac.practice5.exercise1;

public class MyCloset extends Closet {

    private int trousers = 3;

    protected String getItemCount() {
        return super.getItemCount() + "\n" +
                "number of trousers : " + trousers;
    }
}
