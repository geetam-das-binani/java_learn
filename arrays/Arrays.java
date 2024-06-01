package arrays;

public class Arrays {
    public static void main(String[] args) {
        int age[]; // declaration of array
        age = new int[5]; // allocation of memory
        // or
        // int[] age=new int[20]

        age[0] = 5;
        age[1] = 10;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);

        System.out.println(age.length);

        int[] marks = { 98, 12, 45, 12, 65 };
        System.out.println(marks[marks.length - 1]);

        String[] names = { "Shubham", "Anjali", "Smita", "Ankita", "Vishal" };

        for (String name : names) {
            System.out.println(name);
            System.out.println(name.length());

        }

    }
}
