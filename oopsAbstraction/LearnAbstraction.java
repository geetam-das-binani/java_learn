package oopsAbstraction;

public class LearnAbstraction {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.accelerate();
        car.honks();
        System.out.println(car.brakes(4));
    }
}

abstract class Vehicle {

    abstract void accelerate(); // * no body */

    abstract int brakes(int wheels); // * no body */


    void honks(){
        System.out.println("Vehicle honks");
    }

}

class Car extends Vehicle {
    @Override   //* annotation */
    void accelerate() {
        System.out.println("Vehicle accelerated");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("Vehicle stopped");
        return wheels;
    };

    
    void honks(){  //* metthod overloading */
        System.out.println("Car honks");
    }
}