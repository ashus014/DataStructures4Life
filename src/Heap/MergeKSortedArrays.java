package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>{
    int val;
    int whichList;
    int whichIndex;

    public Triplet(int val, int whichList, int whichIndex) {
        this.val = val;
        this.whichList = whichList;
        this.whichIndex = whichIndex;
    }

    @Override
    public int compareTo(Triplet t) {
        return (val <= t.val) ? -1 : 1;
    }
}

public class MergeKSortedArrays {

    public static void main(String[] args) {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(5,10),
                Arrays.asList(4,9),
                Arrays.asList(6)
        );

        System.out.println(mergeArr(arr));
    }

    private static List<Integer> mergeArr(List<List<Integer>> arr) {

        List<Integer> result = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for(int i=0; i<arr.size(); i++) {
            pq.add(new Triplet(arr.get(i).get(0), i, 0));
        }

        while (!pq.isEmpty()) {
            Triplet curr = pq.poll();
            result.add(curr.val);
            int ap = curr.whichList;
            int vp = curr.whichIndex;
            if(vp + 1 < arr.get(ap).size()) {
                pq.add(new Triplet(arr.get(ap).get(vp + 1), ap, vp + 1));
            }
        }
        return result;
    }
}
