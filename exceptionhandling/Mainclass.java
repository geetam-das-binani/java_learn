package exceptionhandling;

import java.io.IOException;

public class Mainclass {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("hello");
        try {
            getNumberFromArray(a);
            int result = 5 / 0;
            System.out.println(a[8]);

        }
        // * catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println(e.getMessage());
        // } catch (ArithmeticException e) {
        // System.out.println(e.getMessage());
        // }
        // catch (ArrayIndexOutOfBoundsException | ArithmeticException |
        // NullPointerException e) {
        // System.out.println(e.getMessage());

        // } catch (RuntimeException | IOException e) {

        // }
        catch (Exception e) {
            System.out.println("exception occured" + e.getMessage());
        } finally {
            System.out.println("finally block");
        }

        System.out.println("bye bye");
    }

    // *throws keyword is used with funtions */
    static int getNumberFromArray(int[] a) throws ArithmeticException {
        return a[8];

    }
}
