package Sorting;

import java.sql.PseudoColumnUsage;
import java.util.Arrays;

public class WorkingWithArraysSortingWithComparable {

    public static void main(String[] args) {

        Point arr[] = {
                new Point(10,20),
                new Point(3,12),
                new Point(5,7)
        };

        Arrays.sort(arr);

        Arrays.stream(arr)
                .forEach(x -> System.out.println(x.x + " | " + x.y));

    }
}
