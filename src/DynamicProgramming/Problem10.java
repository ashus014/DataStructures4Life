package DynamicProgramming;

// 0-1 Knapsack Problem
// We have value sand weight, task is to collect maximum values such that it don't exceed max weight
// I/P - values[] = {10,40,30,50} weight[] = {5,4,6,3} ; WeightAllowed = 10
// Hint : All you need to decided, if you want to take this item or not
public class Problem10 {

    public static void main(String[] args) {

        int maxWeight = 10;
        int[] values = {10, 40, 30, 50}, weights = {5, 4, 6, 3};
        System.out.println(knapSack(maxWeight, weights, values, weights.length));
    }

    // recursive approach
    // Time Complexity - θ(2*n) with naive recursive approach
    private static int knapSack(int maxWeight, int[] weights, int[] values, int n) {

        if (n == 0 || maxWeight == 0) return 0;

        if (weights[n - 1] > maxWeight)
            return knapSack(maxWeight, weights, values, n - 1);
        else
            return Math.max(knapSack(maxWeight, weights, values, n - 1), values[n - 1] + knapSack(maxWeight - weights[n - 1], weights, values, n - 1));
    }

    // Spend more time in understanding this logic
    // Time Complexity - θ(maxWeight * n) with tabulation approach
    // make dp[][] with dimension dp[n+1][maxWeight+1]
    // dp[i][j] represents the max values that we can collect with first 'i' items & 'j' knapSack capacity
    private static int knapSackWithTabulation(int maxWeight, int[] weights, int[] values, int n) {
        int[][] dp = new int[n + 1][maxWeight + 1];
        for (int i = 0; i <= maxWeight; i++)
            dp[0][i] = 0;
        for (int i = 0; i <= n; i++)
            dp[i][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= maxWeight; j++) {
                if (weights[i - 1] > j)
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = Math.max(values[i - 1] + dp[i - 1][j - weights[i - 1]], dp[i - 1][j]);
            }
        }
        return dp[n][maxWeight];
    }
}
