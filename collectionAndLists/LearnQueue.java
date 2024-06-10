package collectionAndLists;

import java.util.*;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.offer(50);
        

        // while (!q.isEmpty()) {
        //     System.out.println(q.poll());
        // }

        // System.out.println(q.poll());
        // System.out.println(q.remove());

        //* both offer and add will add  at the end of the queue  */
        System.out.println(q);
        q.remove(); // * both remove and poll will remove the head of the queue
        System.out.println(q);
        q.poll(); // * both remove and poll will remove the head of the queue

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
}
