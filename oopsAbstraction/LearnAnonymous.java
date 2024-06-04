package oopsAbstraction;

public class LearnAnonymous {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass() { // * anonymous class

            void sing() {
                System.out.println("lalala");
            };

            public void outerMethod() {
                System.out.println("Inner class method");
            }
        };

        SuperInterface obj2 = new SuperInterface() { // * anonymous class
            @Override
            public void interfaceMethod() {
                System.out.println("interface method");
            }

        };

        SuperInterface obj3 = () -> {

        };

        Walkable obj4 = (int steps) -> {

            System.out.println("walked " + steps + " steps");
            return steps + 6;

        };

        Walkable obj5 = (int steps) -> steps * 2;

        // obj.outerMethod();
        // obj.sing();

        obj2.interfaceMethod();

        System.out.println(obj4.walks(5));
        System.out.println(obj5.walks(10));
    }

}

@FunctionalInterface
interface SuperInterface {
    public void interfaceMethod();
}

@FunctionalInterface
interface Walkable {
    int walks(int steps);

}

class OuterClass {
    public void outerMethod() {

    }

    void sing() {

    }
}
