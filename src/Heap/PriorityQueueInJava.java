package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueInJava {

    public static void main(String[] args) {

        // by default min heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // this is how we make it max heap
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
    }
}
