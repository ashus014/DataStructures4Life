package Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class WorkingWithDequeWithLinkedList {

    public static void main(String[] args) {

        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);

        d.stream()
                .forEach(System.out::println);

        System.out.println("----------");

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        System.out.println("-----------");
        //Remove from First Position
        d.pollFirst();

        //Remove from last Position
        d.pollLast();

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}
