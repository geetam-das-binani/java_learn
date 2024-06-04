package oopsInheritance;

public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 12;
        d1.color = "Black";
        d1.bark();

        // * -------------------->
        Dog d2 = new Dog();
        d2.name = "Tom";
        d2.age = 13;
        d2.color = "White";
        d2.walk();
       

        // * -------------------->
        
        Complex c1 = new Complex();
        c1.a = 10;
        c1.b = 20;
        c1.print();

    }

}
class Complex {
    int a , b;

    void print(){
        System.out.println(a + " + " + b + "i");
    }
}


class Dog { // * factory
    String name;
    int age;
    String color;

    void walk() {
        System.out.println(name + " is walking");
    }

    void bark() {
        System.out.println(name + " is barking");
    }

}
