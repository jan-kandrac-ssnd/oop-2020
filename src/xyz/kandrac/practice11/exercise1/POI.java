package xyz.kandrac.practice11.exercise1;

public class POI {

    private double latitude;
    private double longitude;
    private String name;

    public POI(double latitude, double longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public double distanceFrom(POI that) {
        double dx = that.latitude - this.latitude;
        double dy = that.longitude - this.longitude;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
