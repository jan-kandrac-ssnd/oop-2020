package xyz.kandrac.practice11.exercise2;

public class POI {

    private double latitude;
    private double longitude;

    public POI(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
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
}
