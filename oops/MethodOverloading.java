package oops;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greeting();
        obj.greeting("geetam");
        obj.greeting(23);


    }
}

class Greet {
    void greeting() {
        System.out.println("Hello Good Morning!");
    }

    void greeting(String name) {
        System.out.println("Hello " + name + " Good Morning!");
        // return 0;
    }

    void greeting(int age) {
        System.out.println("My age is" + " " + age);
    }
}