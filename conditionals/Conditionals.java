package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        int age = 16;
        if (age <= 18) {
            System.out.println("you can vote");
        } else if (age >= 16) {
            System.out.println("you can drive");
        } else {
            System.out.println("you can't vote");
        }

        int a = 26;
        int b = 13;
        int c = 123;
        int max = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println(max);

        switch (4) {
            case 1:
                System.out.println(1);
                break;

            default:
                System.out.println(4);
                
        }

    }
}
