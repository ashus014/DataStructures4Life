package DynamicProgramming;

// Using tabulation in dynamic programming to solve problems
// v.v.important
// Idea is to leave recursion, have an array or a table and build your solution in bottom-up manner.
// Time Complexity - θ(n)
// Auxiliary Space - θ(n)
// DP is not the best solution for Fibonacci
public class Problem2 {

    public static void main(String[] args) {
        int num = 6;
        System.out.println(findFibonacci(num));
    }

    private static int findFibonacci(int num) {

        int[] factorial = new int[num + 1];
        factorial[0] = 0;
        factorial[1] = 1;
        for (int i = 2; i <= num; i++) {
            factorial[i] = factorial[i - 1] + factorial[i - 2];
        }
        return factorial[num];
    }
}
