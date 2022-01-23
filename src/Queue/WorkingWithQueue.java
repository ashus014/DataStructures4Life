package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class WorkingWithQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();

        //offer - add to the queue
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);

        //first item of queue
        System.out.println(q.peek());

        //remove the first item and return the item
        System.out.println(q.poll());

        System.out.println(q.peek());

    }
}
