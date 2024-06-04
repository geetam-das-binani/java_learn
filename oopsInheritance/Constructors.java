package oopsInheritance;

public class Constructors {
    public static void main(String[] args) {
        Complex num1 = new Complex(6, 10);
        Complex num2 = new Complex(12);
      
        num1.print();
        num2.print();
        System.out.println("adding two numbers");
        Complex result = num1.add(num1);
        System.out.println(num1);
        result.print();
    }

}

class Complex {
    int a, b;

    public Complex(int a, int b) { // * constructor function
        this.a = a;
        this.b = b;
        System.out.println("Creating a new object");
    }

    public Complex(int num1) {
        // * constructor function method overlaoding
        a = num1;
        b = 12;
        System.out.println("Creating a new object");
    }

    // * default constructor
    // * function which java compiler creates during runtime
    // public Complex() {
    // a = 0;
    // b = 0;
    // }

    void print() {
        System.out.println(a + " + " + b + "i");
    }

    Complex add(Complex num1) {
        System.out.println(this);
        this.print();
       
        return new Complex(a + num1.a, b + num1.b);
    }
}
