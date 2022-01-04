package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//Theory

/*
 * 1 - Array uses random Access - elements are at contigious memory location, so you can get element at O(1)
 * 2 - Cache Friendliness - Cache is faster than RAM then hardDisk etc...when we access any element it's likely
 * that our processor is going to pre-fetch the elements from nearby.
 *
 * Array can be of two types :
 * 1. Fixed sized arrays - normal Arrays
 * 2. Dynamic sized arrays - ArrayList
 *
 * Advantage of ArrayList -
 * 1. Dynamic Size
 * 2. Rich Library Functions
 *
 * Array Problems are pretty much easy so won't be spending much
 * time here.
 *
 * Moving on to search.
 * */


public class Arrays {


    static void printFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        Set key = map.keySet();

        for(Object temp : key){
            System.out.print(temp + " - " + map.get(temp) + " | ");
        }

//        System.out.println(map);
    }

    public static void main(String[] args) {
        int[] arr = {10,10,10,30,30,40};
        printFrequency(arr);
    }


}
