package Sorting;
import java.util.Arrays;

// Credits - Kunal Kushwaha
public class QuickSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2, 1 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        quicksort(nums, low, end);
        quicksort(nums, start, high);
    }
}
