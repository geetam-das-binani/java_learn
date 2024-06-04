package oopsAbstraction;

public class LearnInnerClass {

    String name = "geetam";

    class Toy { // *inner class */
        int price;
    }

    static class PlayStation { // * inner static class */
        int price;
    }

    public static void main(String[] args) {

        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 45;

        PlayStation playStation = new LearnInnerClass.PlayStation();
        playStation.price=68000;

    }
}
