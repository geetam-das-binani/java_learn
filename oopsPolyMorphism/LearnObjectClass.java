package oopsPolyMorphism;

public class LearnObjectClass {

    class Toy {
        int price = 5;
    }

    public static void main(String[] args) {
        Car myCar = new Car("BMW", 2010);
        Car myCar2 = new Car("BMW", 2010);

        System.out.println(myCar.equals(myCar2));
        System.out.println(myCar.hashCode());
        System.out.println(myCar2.hashCode());

    }
}

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return model + " " + year;
    }

    @Override
    public boolean equals(Object obj) {
      
        Car that = (Car) obj;
        if (this.model == that.model && this.year == that.year && this.getClass() == that.getClass()) {
            return true;
        }

        // * or below one */

        // if (this.model.equals(that.model) && this.year == that.year) {
        // return true;
        // }

        return false;
    }

    @Override
    public int hashCode() {
        int initialNumber = 31;
        initialNumber += year;
        initialNumber += model.hashCode();

        return initialNumber;
    }
}