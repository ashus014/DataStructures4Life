package DynamicProgramming;

// Coin Change Problem
public class Problem4 {

    public static void main(String[] args) {

        int[] coins = {2, 5, 3};
        System.out.println(countWaysWithTabulation(coins, coins.length, 10000));
    }

    // Time Complexity - θ(2^n) with naive recursive approach
    private static int countWays(int[] coins, int n, int s) {

        if (s == 0)
            return 1;
        if (s < 0)
            return 0;
        if (n == 0)
            return 0;
        return countWays(coins, n, s - coins[n - 1]) + countWays(coins, n - 1, s);
    }

    // Using Tabulation approach to solve the problem
    // Time Complexity - θ(n*s) with naive recursive approach
    //      0   1   2   3   4
    //  0   1   0   0   0   0
    //  1   1
    //  2   1
    //  3   1

    private static int countWaysWithTabulation(int[] coins, int n, int s) {

        int[][] dp = new int[n + 1][s + 1];
        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;
        for (int j = 1; j <= s; j++)
            dp[0][j] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= s; j++) {
                dp[i][j] = dp[i - 1][j];
                if (coins[i - 1] <= j)
                    dp[i][j] += dp[i][j - coins[i - 1]];
            }
        }
        return dp[n][s];
    }
}
