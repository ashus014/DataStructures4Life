package DynamicProgramming;

// 0-1 Knapsack Problem
// We have value sand weight, task is to collect maximum values such that it don't exceed max weight
// I/P - values[] = {10,40,30,50} weight[] = {5,4,6,3} ; WeightAllowed = 10
// Hint : All you need to decided, if you want to take this item or not
public class Problem10 {

    public static void main(String[] args) {

        int maxWeight = 10;
        int[] values = {10,40,30,50}, weights = {5,4,6,3};
        System.out.println(knapSack(maxWeight, weights, values, weights.length));
    }

    // recursive approach
    private static int knapSack(int maxWeight, int[] weights, int[] values, int n) {

        if (n == 0 || maxWeight == 0) return 0;

        if (weights[n - 1] > maxWeight)
            return knapSack(maxWeight, weights, values, n - 1);
        else
            return Math.max(knapSack(maxWeight, weights, values, n - 1), values[n - 1] + knapSack(maxWeight - weights[n - 1], weights, values, n - 1));
    }
}
