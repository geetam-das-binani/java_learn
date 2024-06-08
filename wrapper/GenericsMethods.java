package wrapper;

public class GenericsMethods {
    public static void main(String[] args) {
        printData("hey");
        printData(true);
        printData(123);

        GenericsMethods genericsMethods = new GenericsMethods();
        genericsMethods.<String>doubleData("hello world");
        // * or below one java compiler will automatically infer the type

        genericsMethods.<Integer>doubleData(123);
        genericsMethods.doubleData(123);

        // ! important generics bounding
        CustomClass customClass = new CustomClass();
        genericsMethods.data(customClass);
    }

    static <E> void printData(E data) {
        System.out.println(data);
    }

    <E> void doubleData(E data) {
        System.out.println(data);
    }

     // !  important generics bounding
    <E extends CustomClass> void data(E data) {
        System.out.println(data);
    }

}

class CustomClass {

}
