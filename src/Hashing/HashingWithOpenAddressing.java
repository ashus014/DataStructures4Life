package Hashing;

public class HashingWithOpenAddressing {

    int []arr;
    int capacity;
    int size;

    public HashingWithOpenAddressing(int capacity) {
        this.capacity = capacity;
        size = 0;

        for (int i=0; i<capacity; i++){
            arr[i] = -1;
        }
    }

    int hash(int key){
        return key % capacity;
    }

    boolean search(int key){
        int h = hash(key);
        int i = h;

        while(arr[i] != -1){
            if(arr[i] == key)
                return true;
            i = (i+1)%capacity;
            if(i == h)
                return false;
        }
        return false;
    }

    boolean insert(int key){
        if(size == capacity)
            return false;
        int i = hash(key);

        while(arr[i] != -1 && arr[i] != -2 && arr[i] != key)
            i = (i+1) % capacity;

        if(arr[i] == key)
            return false;

        else{
            arr[i] = key;
            size++;
            return true;
        }
    }

    //erase is similar to search
    boolean erase(int key){
        int h = hash(key);
        int i = h;

        while(arr[i] != -1){
            if(arr[i] == key){
                arr[i] = -2;
                return true;
            }
            i = (i+1)%capacity;
            if(i == h)
                return false;
        }
        return false;
    }

}
