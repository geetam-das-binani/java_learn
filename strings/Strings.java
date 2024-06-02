package strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = "Anuj Kumar Sharma Anuj";
        String sameName = "Anuj";
        String newName = new String("Anuj");

        System.out.println(sameName == newName);
        if (name.equals(newName)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Not equal");
        }

        Scanner sc = new Scanner(System.in);

        // String lastName=sc.nextLine(); //* this returns a string

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.substring(1, 3));
        System.out.println(name.contains("Anuj"));
        System.out.println(name.trim());
        System.out.println(name.startsWith("An"));
        System.out.println(name.endsWith("uj"));

        int age = 123;
        String ageString = String.valueOf(age); // * Returns the string representation of the int argument.

        System.out.println(ageString + 2);
        System.out.println(age + 2);

        System.out.println(name.replace("Anuj", "Gupta"));
        String details = "I love Java , Java is a good language";
        String[] words = details.split(",");

        for (String word : words) {
            System.out.println(word);
        }

        String color = "Brown is my fav color!";
        char[] letters = color.toCharArray();
        for (char letter : letters) {
            System.out.println(letter);

        }

        String animal = "     ";
        if (animal.isEmpty()) {
            System.out.println("empty");

        } else if (animal.isBlank()) {
            System.out.println("blank");
        }

    }
}
