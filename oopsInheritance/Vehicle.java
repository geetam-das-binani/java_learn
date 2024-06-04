package oopsInheritance;

public final  class Vehicle {

   final  int gears = 4;
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4);
        // ! v1.gears=6;  // gears is a final variable and cannot be changed 
        System.out.println(v1.wheeelsCount);
        v1.accelerate();
    }
    
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


   final  void accelerate(){
        System.out.println("Vehicle accelerated");
    }
}
