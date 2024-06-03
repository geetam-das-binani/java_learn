package oops;

public class Car extends Vehicle {
    String color;

    void start() { // * method overriding
        Scooter scooterObj = new Scooter();
        scooterObj.breaking(this);

        super.start();
        // System.out.println(super.wheeelsCount);
        System.out.println("car started");
        // System.out.println(this.model);
        // System.out.println(this.wheeelsCount);
        // System.out.println(this.color);
    }

    Car breaking() {
        return this;

    }

    public Car(int wheeelsCount) {
        super(wheeelsCount);
        System.out.println("Car constructor");
    }

    public static void main(String[] args) {
        Car obj = new Car(6);
        System.out.println(obj.wheeelsCount);
        obj.wheeelsCount = 4;
        obj.model = "maruti";
        obj.color = "red";
        obj.start();
        System.out.println(obj.wheeelsCount);
        System.out.println(obj.breaking());

    }

}

class Scooter {

    void breaking(Car car) {
        System.out.println(car.model + " " + "is breaking");

    }
}