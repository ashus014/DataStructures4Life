package Sorting;

import java.sql.PseudoColumnUsage;
import java.util.Arrays;

//comparing Array of Objects with Comparable interface
class Point implements Comparable<Point>{

    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        return  this.x - o.x;
    }

}

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
