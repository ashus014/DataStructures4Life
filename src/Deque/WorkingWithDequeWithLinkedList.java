package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class WorkingWithDequeWithLinkedList {

    public static void main(String[] args) {

        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);


        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        //Remove from First Position
        d.pollFirst();

        //Remove from last Position
        d.pollLast();

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}
