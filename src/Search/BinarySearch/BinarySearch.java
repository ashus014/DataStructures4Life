package Search.BinarySearch;

public class BinarySearch {

    //01 - Binary search iterative approach
    static int binarySearch(int[] array, int n, int x){
        int low=0, high=n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(array[mid] == x) return mid;
            else if(array[mid] > x) high = mid-1;
            else low = mid + 1;
        }
        return -1;
    }

    //02 - Binary search recursive approach
    static int recursiveBinarySearch(int[] array, int low, int high, int x){
        if(low > high) return -1;
        int mid = (low + high)/2;
        if(array[mid] == x) return mid;
        else if(array[mid] > x)
            return recursiveBinarySearch(array, low, mid-1, x);
        else
            return recursiveBinarySearch(array, mid+1, high, x);
    }

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50,60};
        System.out.println(binarySearch(array, array.length, 50));
    }

}
