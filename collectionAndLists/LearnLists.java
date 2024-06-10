package collectionAndLists;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);
        list.add(30);

        System.out.println(list.get(list.size() - 1));
        list.set(0, 200);

        list.add(2, 1000);

        // list.clear();

        // list.remove(Integer.valueOf(1));

        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(30));

        System.out.println(list);

        // list2.add(1);
        // list2.add(2);
        // list2.add(3);

        // System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.contains(200));
        // list.remove(1); //* if we pass integer then it removes by considering the
        // index
        // list.remove(Integer.valueOf(1));
        // System.out.println(list);

        // list.addAll(list2);

        // list.removeAll(list2);

        // list.retainAll(list2);

        Object[] a = list.toArray();
        for (Object e : a) {
            Integer temp = (Integer) e;
            // * System.out.println(Integer.parseInt(e.toString()) * 2);
            // * or

            // * System.out.println(temp * 2);
        }

        // System.out.println(list);

    }
}
