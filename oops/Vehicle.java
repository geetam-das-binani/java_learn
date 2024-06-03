package oops;

public class Vehicle {
    int wheeelsCount;
    String model;

    public Vehicle() {
        System.out.println("Vehicle constructor");
    }

    public Vehicle(int wheeelsCount) {
        this.wheeelsCount = wheeelsCount;
        System.out.println("Creating vehicle with wheels count " + wheeelsCount);
    }

    void start() {
        System.out.println("Vehicle started" + " " + wheeelsCount + "  "+ model);
    }
}
