package DynamicProgramming;

// Minimum Jumps to reach at end
// We are going to start form second last cell and check if we can reach last from there

import java.util.Arrays;

public class Problem9 {

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 2, 1};
        System.out.println(minJumpWithTabulation(arr, arr.length));
    }

    private static int minJump(int[] arr, int n) {
        if (n == 1) return 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 2; i++) {
            if (i + arr[i] >= n - 1) {
                int subResult = minJump(arr, i + 1);
                if (subResult != Integer.MAX_VALUE) {
                    result = Math.min(result, subResult + 1);
                }
            }
        }
        return result;
    }

    private static int minJumpWithTabulation(int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            dp[i]  = Integer.MAX_VALUE;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] + j >= i) {
                    if (dp[j] != Integer.MAX_VALUE) dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n - 1];
    }


}
