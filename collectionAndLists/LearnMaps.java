package collectionAndLists;

import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {
        // Student student=new Student(101, "Anuj", 98);
        Map<String, String> map = new HashMap<>();
        map.put("us", "united states");
        map.put("in", "india");
        map.put("au", "australia");
        // map.put("in", "india2");
        // map.putIfAbsent("in", "india3");

        // map.remove("us");

        System.out.println(map.containsKey("in"));
        System.out.println(map.containsValue(map.getOrDefault("n", "not found")));

        System.out.println(map);

        System.out.println(map.get("in"));
        System.out.println(map.get("n"));
        System.out.println(map.getOrDefault("i", "not found"));

        map.remove("in", "india2");
        // System.out.println(map);

        // *** <------------ Important ------------------->

        Set<String> set = map.keySet();

        // Set<String> values =(Set<String>) map.values();
        // * or
        Collection<String> values2 = map.values();
        System.out.println(values2);

        for (String s : set) {
            System.out.println(s);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }
}

// class Student{
// int id;
// String name;
// int marks;

// public Student(int id, String name, int marks) {
// this.id = id;
// this.name = name;
// this.marks = marks;
// }

// }
