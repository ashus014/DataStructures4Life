package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

//A Hash Function with Chaining in JAVA
//We are creating an ArrayList of LinkedLists
public class Hashing {

    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    void MyHash(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i=0; i<b; i++){
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key){
        int i = key % BUCKET;
        table.get(i).add(key);
    }

    boolean search(int key){
        int i = key % BUCKET;
        return table.get(i).contains(key);
    }

    void remove(int key){
        int i = key % BUCKET;
        table.get(i).remove((Integer) i);
    }
}
