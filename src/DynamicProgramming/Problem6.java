package DynamicProgramming;

// Longest increasing sub-sequence problem.
// https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-DP/video/MTEzMw%3D%3D
public class Problem6 {

    public static void main(String[] args) {

        int[] arr = {3, 4, 2, 8, 10};
        System.out.println(longestIncreasingSubSequenceWithTabulation(arr, arr.length));
    }

    // Solution with Tabulation Approach
    // Time Complexity - θ(n*n) with naive recursive approach
    // Better solution with time complexity O(n*log(n)) also exists for this problem using Binary Search Approach
    private static int longestIncreasingSubSequenceWithTabulation(int[] arr, int n) {

        int[] lis = new int[arr.length];
        lis[0] = 1;
        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])
                    lis[i] = Math.max(lis[i], lis[j] + 1);
            }
        }
        int result = lis[0];
        // now finding max form the lis[]
        for (int i = 1; i < n; i++) {
            result = Math.max(result, lis[i]);
        }
        return result;
    }

    // Using Binary Search to solve the problem
    private static int longestIncreasingSubSequenceWithBinarySearch(int[] arr, int n) {

        int[] lis = new int[arr.length];
        lis[0] = 1;
        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])
                    lis[i] = Math.max(lis[i], lis[j] + 1);
            }
        }
        int result = lis[0];
        // now finding max form the lis[]
        for (int i = 1; i < n; i++) {
            result = Math.max(result, lis[i]);
        }
        return result;
    }
}
