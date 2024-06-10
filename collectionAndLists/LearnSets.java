package collectionAndLists;

import java.util.*;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " " + name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals called");
        if (this == obj) {
            System.out.println("both are equal");
            return true;
        }

        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return rollNo == other.rollNo;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return Objects.hash(this.rollNo);
    }
}

public class LearnSets {

    enum Color {
        RED, YELLOW, BLUE
    }

    public static void main(String[] args) {
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        System.out.println(enumSet);
        // Set<Integer> set = new HashSet<Integer>(); //* elements will be stored in
        // random order
        // Set<Integer> set = new LinkedHashSet<Integer>(); //* elements will be stored
        // in proper order but will be unique
        Set<Integer> set = new TreeSet<Integer>(); // * elements will be stored in sorted order and will be unique

        set.add(10);
        set.add(78);
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(40);

        // set.remove(10);
        // System.out.println(set.contains(98));
        // System.out.println(set);
        Student s1 = new Student(101, "Anuj");
        Student s2 = new Student(101, "Anuj");

        // System.out.println(s1.equals(s2));

        Set<Student> set2 = new HashSet<>();
        set2.add(new Student(101, "Anuj"));
        System.out.println("1");
        set2.add(new Student(101, "Anuj"));
        System.out.println("2");
        set2.add(new Student(171, "Anuj"));
        System.out.println("3");

        System.out.println(set2);
        // System.out.println(s1.hashCode() == s2.hashCode());

    }
}