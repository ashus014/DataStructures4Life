package Sorting;


import java.util.Arrays;

class Point2 {
    int x,y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class WorkingWithArraysSortingWithComparator {

    public static void main(String[] args) {
        Point2[] arr = {
                    new Point2(10,20),
                    new Point2(3,12),
                    new Point2(5,7)
        };

        Arrays.sort(arr, (p1,p2) -> p1.x - p2.x);

        Arrays.stream(arr)
                .forEach(x -> System.out.println(x.x + " | " + x.y));
    }
}
