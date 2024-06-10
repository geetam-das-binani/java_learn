package collectionAndLists;

import java.util.*;

public class MoreonLists {
    // public static void main(String[] args) {
    // // List<String> fruits = new LinkedList<>();
    // List<String> fruits = new ArrayList<>();

    // fruits.add("Apple");
    // fruits.add("Banana");
    // fruits.add("Grapes");
    // fruits.add("Orange");
    // fruits.add("Pineapple");

    // for (int i = 0; i < fruits.size(); i++) {
    // System.out.println(fruits.get(i));
    // }

    // for (String fruit : fruits) {
    // System.out.println("fruit is" + fruit);
    // }

    // Iterator<String> iterator = fruits.listIterator();
    // Iterator<String> iterator2 = fruits.iterator();

    // while (iterator.hasNext()) {
    // System.out.println("fruit is" + " " + iterator.next());
    // }

    // while (iterator2.hasNext()) {
    // System.out.println("fruit is" + " " + iterator2.next());
    // }

    // List<String> smallList = fruits.subList(1, 3);
    // System.out.println(smallList);

    // }

    // *<------------------------lists above commented------------------------> */

    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Grapes");
        fruits.push("Orange");
        fruits.push("Pineapple");

        System.out.println(fruits.pop());
        System.out.println(fruits);
        System.out.println(fruits.pop());
        System.out.println(fruits.peek());
        System.out.println(fruits.empty());
    }

}
