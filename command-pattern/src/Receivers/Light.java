package Receivers;

public class Light {
    private String location;
    public Light(String location) {
        this.location = location;
    }
    public void on () {
        System.out.println("Light on " + "location: " + location);
    }
    public void off () {
        System.out.println("Light off " + "location: " + location);
    }

}
