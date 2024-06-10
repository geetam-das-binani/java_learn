package collectionAndLists;

import java.util.*;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(10);
        deque.offerLast(20);
        deque.offerFirst(5);
        deque.pollLast();
        // System.out.println(deque);
        // System.out.println(deque.peekLast());
        // System.out.println(deque.peek());

        // ! its is recommended to use ArrayDeque for creating stack and queue

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        // System.out.println(stack.peek());

        // System.out.println(stack);


        ArrayDeque<Integer> queue=new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.push(50);
        System.out.println(queue);
        queue.poll();
        queue.pop();
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
