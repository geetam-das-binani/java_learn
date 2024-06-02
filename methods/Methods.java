package methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println(greet() + 2);
        System.out.println("finished");
       System.out.println( average(5,6));
    }

    static int greet() {
        System.out.println("Hello World!");
        return 1;
    };

    public static double average(int a, int b) {

        return (double)(a + b) / 2;
    };
}
