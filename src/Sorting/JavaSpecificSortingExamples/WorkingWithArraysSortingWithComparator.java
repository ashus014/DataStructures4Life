package Sorting.JavaSpecificSortingExamples;

import Sorting.JavaSpecificSortingExamples.Point;

import java.util.Arrays;

public class WorkingWithArraysSortingWithComparator {

    public static void main(String[] args) {
        Point[] arr = {
                    new Point(10,20),
                    new Point(3,12),
                    new Point(5,7)
        };

        Arrays.sort(arr, (p1,p2) -> p1.x - p2.x);

        Arrays.stream(arr)
                .forEach(x -> System.out.println(x.x + " | " + x.y));
    }
}
