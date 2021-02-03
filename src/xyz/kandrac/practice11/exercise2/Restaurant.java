package xyz.kandrac.practice11.exercise2;

public class Restaurant extends POI {

    private String name;
    private String opensAt;
    private String closesAt;

    public Restaurant(double latitude, double longitude, String name, String opensAt, String closesAt) {
        super(latitude, longitude);
        this.name = name;
        this.opensAt = opensAt;
        this.closesAt = closesAt;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", opensAt='" + opensAt + '\'' +
                ", closesAt='" + closesAt + '\'' +
                '}';
    }
}
