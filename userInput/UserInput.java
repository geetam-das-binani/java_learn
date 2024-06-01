package userInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = sc.nextInt();
        // System.out.println("Your age is " + age);

        int firstNumber = sc.nextInt();
        float secondNumber = sc.nextFloat();
        // int result=firstNumber + (int)secondNumber;
        // or
        float result = (float)(firstNumber + secondNumber);
        System.out.println(result);
        sc.close();
    }
}
