package loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a sum: ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(n + " X " + i + " = " + n * i);
        // }
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // if (i == 3)
        // break;

        // sum += i * 2;

        // }
        // System.out.println("Sum is" + " " + sum);
        // sc.close();
        // while loop

        // int i = 0;
        // while (i <= 5) {
        // System.out.println(i++);
        // }
        // int b = 0;
        // do {
        // System.out.println(b++);
        // if (b == 3) {
        // System.out.println("called");
        // continue;
        // }
        // System.out.println("hello");
        // if (b == 5)
        // break;
        // } while (b < 6);
        outerLoop: for (int i = 10; i > 0; i--) {

            for (int j = i; j > 0; j--) {
                if (j == 3)
                    break outerLoop;
                System.out.print("*" + " ");
            }
            System.out.println("");

        }
    }

}
