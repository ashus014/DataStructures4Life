package Hashing;

import java.util.*;

public class ProblemSolvingWithHashing {

    //count distinct elements
    int countDistinct(Integer arr[]){
        HashSet<Integer>s = new HashSet<>(Arrays.asList(arr));
        return s.size();
    }

    //print the frequencies of Array Elements
    void countFrequiencies(Integer arr[]){

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i <arr.length; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
        }

        //printing the values
        for(Map.Entry<Integer, Integer> e : hashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    //insertion of two arrays problem
    void twoArrayInsertion(Integer[] a, Integer[] b){
        int count = 0;
        Set<Integer> set1 = new HashSet<>(Arrays.asList(a));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(b));

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(Integer i : set1){
            hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
        }

        for(Integer i : set2){
            hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> e : hashMap.entrySet()){
            if(e.getValue() > 1){
                count+=1;
            }
        }
        System.out.println("Count : " + count);
    }

    //(2) insertion of two arrays problem
    void twoArrayInsertionWithOptimization(Integer[] a, Integer[] b){
        int count = 0;
        Set<Integer> set1 = new HashSet<>(Arrays.asList(a));

        for(int x : b){
            if(set1.contains(x)){
                count+=1;
                set1.remove(x);
            }
        }
        System.out.println("Count : " + count);

    }

    //count of two unsorted arrays
    void countOfTwoUnsortedArrays(Integer[] a, Integer[] b){
        Set<Integer> set = new HashSet<>(Arrays.asList(a));
        for(int x : b){
            set.add(x);
        }
        System.out.println(set.size());
    }

    //pair with a given sum in unsorted array
    boolean isPair(Integer[] arr, int sum){
        Set<Integer> set = new HashSet<>();
        for(int x : arr){
            if(set.contains(sum - x))
                return true;
            else
                set.add(x);
        }
        return false;
    }

    //sub-array (group of continuous elements) with given sum



    public static void main(String[] args) {
        Integer[] ashu1 = {15,20,5,15};
        Integer[] ashu2 = {15,15,15,20,10};
        ProblemSolvingWithHashing p = new ProblemSolvingWithHashing();
        System.out.println(p.isPair(ashu1,36));
    }
}
