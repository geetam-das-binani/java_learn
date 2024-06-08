package wrapper;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        Integer obj = 21; // * auto boxing
        char letter = 'k';
        Character lts = 'G';

        char lts1 = lts; // * auto unboxing

        Boolean myBoolean = Boolean.valueOf("0");
        System.out.println(myBoolean);
        ArrayList<Float> a = new ArrayList<Float>();
        

    }
}
