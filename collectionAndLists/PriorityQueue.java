package collectionAndLists;

import java.util.ArrayDeque;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new java.util.PriorityQueue<>((a, b) -> b - a);

        pq.add(500);
        pq.add(50);
        pq.add(289);
        pq.add(78);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());  //* null  */
       

    }
}
