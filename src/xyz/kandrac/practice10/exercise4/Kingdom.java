package xyz.kandrac.practice10.exercise4;

public abstract class Kingdom {

    public abstract String getFirstName();
    public abstract String getLastName();

    public void printName() {
        System.out.println(getFirstName() + " " + getLastName());
    }
}
