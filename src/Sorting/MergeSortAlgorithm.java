package Sorting;

// It is a divide and conquer algorithm
// It is a stable sorting algorithm, maintains the original order of items
// Time Complexity - θ(n * log(n))
// Space complexity - θ(n)
// For arrays quick sort performs better than merge sort
// Java uses merge sort
// Python uses a variation of merge sort called 'Tim Sort'

import java.util.Arrays;

public class MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] a = {10, 20, 70, 85, 15, 45, 5};
//        int[] b = {5, 15, 45};
//        demoMerge(a, b, a.length, b.length);
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] arr, int l, int h) {
        if (l < h) {
            int m = l + (h - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, h);
            merge(arr, l, m, h);
        }
    }

    // merge function of merge sort
    private static void merge(int[] a, int low, int mid, int high) {
        int sizeOfLeft = mid - low + 1, sizeOfRight = high - mid;
        int[] leftArray = new int[sizeOfLeft];
        int[] rightArray = new int[sizeOfRight];

        for (int i = 0; i < sizeOfLeft; i++) leftArray[i] = a[low + i];
        for (int i = 0; i < sizeOfRight; i++) rightArray[i] = a[mid + i + 1];

        int i = 0, j = 0, k = low;
        while (i < sizeOfLeft && j < sizeOfRight) {
            if (leftArray[i] <= rightArray[j]) a[k++] = leftArray[i++];
            else a[k++] = rightArray[j++];
        }

        while (i < sizeOfLeft) a[k++] = leftArray[i++];
        while (j < sizeOfRight) a[k++] = rightArray[j++];
    }

//    private static void demoMerge(int[] a, int[] b, int m, int n) {
//        int i = 0, j = 0;
//        while (i < m && j < n) {
//            if (a[i] <= b[j]) {
//                System.out.print(a[i] + " ");
//                i++;
//            } else {
//                System.out.print(b[j] + " ");
//                j++;
//            }
//        }
//        System.out.println("\n***********");
//        while (i < m) {
//            System.out.print(a[i] + " ");
//            i++;
//        }
//        System.out.println("\n***********");
//
//        while (j < n) {
//            System.out.println(b[j] + " ");
//            j++;
//        }
//    }
}
