package xyz.kandrac.practice11.exercise2;

public class Hotel extends POI {

    private String name;
    private double pricePerNight;

    public Hotel(double latitude, double longitude, String name, double pricePerNight) {
        super(latitude, longitude);
        this.name = name;
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}
