package DynamicProgramming;
import java.util.Arrays;
// Minimum Coin change problem
// We have certain value, and we have certain coins, we want to get the value by using minimum number of coins.

// que - coins {25,10,5} value = 30
// ans - 1 Coin of value 25 & 1 Coin of value 5, requires only 2 coins

// Greedy Algorithms mostly don't work here
public class Problem8 {

    public static void main(String[] args) {
        int[] coins = {25, 10, 5};
        int val = 30;
        System.out.println(getMinWithTabulation(coins, coins.length, val));
    }

    // Solving problem using naive recursive based approach
    private static int getMin(int[] coins, int n, int val) {
        if (val == 0) return 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (coins[i] <= val) {
                int subRest = getMin(coins, n, val - coins[i]);
                if (subRest != Integer.MAX_VALUE) res = Math.min(res, subRest + 1);
            }
        }
        return res;
    }

    // Solving question using tabulation based approach
    private static int getMinWithTabulation(int[] coins, int n, int val) {
        int[] dp = new int[val + 1];
        dp[0] = 0;
        for (int i = 1; i <= val; i++)
            dp[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < n; j++) {
                if (coins[j] <= i) {
                    int subResult = dp[i - coins[j]];
                    if (subResult != Integer.MAX_VALUE) dp[i] = Math.min(dp[i], subResult + 1);
                }
            }
        }
        return dp[val];
    }
}
