package Heap;

public class ExtractMinimumNumberFromMinHeap {
    int [] arr;
    int size;
    int capacity;

    public ExtractMinimumNumberFromMinHeap(int c){
        arr = new int[c];
        size = 0;
        capacity = c;
    }

    int left(int i){
        return (2*i + 1);
    }

    int right(int i){
        return (2*i + 2);
    }

    int parent(int i){
        return (i-1)/2;
    }

    void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    void minHeapify(int i) {
        int lt = left(i), rt = right(i);
        int smallest = i;
        if(lt < size && arr[lt] < arr[i]) {
            smallest = lt;
        }
        if(rt < size && arr[rt] < arr[smallest]) {
            smallest = rt;
        }
        if(smallest != i) {
            swap(arr, i, smallest);
            minHeapify(smallest);
        }
    }

    // function to extract minimum umber from minHeap
    int extractMin() {
        if(size == 0) {
            return Integer.MAX_VALUE;
        }
        if(size == 1) {
            size--;
            return arr[0];
        }
        swap(arr, 0, size-1);
        size--;
        minHeapify(0);
        return arr[size];
    }
}
