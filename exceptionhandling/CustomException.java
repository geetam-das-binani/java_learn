package exceptionhandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        try {

            if (age > 100) {
                // throw new MyException("Age cannot be greater than 100");
                throw new ArithmeticException("Age cannot be greater than 100");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}