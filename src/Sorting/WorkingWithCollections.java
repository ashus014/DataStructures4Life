package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithCollections {

    public static void main(String[] args) {

        List<Point> list = new ArrayList<>();
        list.add(new Point(5,10));
        list.add(new Point(2,20));
        list.add(new Point(10,30));

        //Decreasing order sort
        Collections.sort(list, (p1,p2) -> p2.x - p1.x);

        list.stream()
                .forEach(x -> System.out.println(x.x + " " + x.y));
    }
}
