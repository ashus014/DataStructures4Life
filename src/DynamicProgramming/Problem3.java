package DynamicProgramming;

// Longest common subsequence
public class Problem3 {

    // for memoization purpose
    static int memo[][] = new int[10][10];

    static {
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = -1;
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "AXYZ";
        String s2 = "BAZ";
        System.out.println(longestCommonSubsequenceUsingTabulation(s1, s2, s1.length(), s2.length()));
    }

    // Time Complexity - θ(2^n)
    public static int longestCommonSubsequence(String s1, String s2, int m, int n) {

        if (m == 0 || n == 0)
            return 0;
        // choose from any side, here we are comparing from the end
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return 1 + longestCommonSubsequence(s1, s2, m - 1, n - 1);
        else
            return Math.max(longestCommonSubsequence(s1, s2, m - 1, n),
                    longestCommonSubsequence(s1, s2, m, n - 1));
    }

    // But in this problem we have few overlapping sub-problems, so we can use dynamic programming
    // let's try to solve with memoization based solution
    // here 'm' & 'n' both are changing in recursion calls, so we'll have to use 2D array
    // Time Complexity - θ(m*n)
    public static int longestCommonSubsequenceUsingMemoization(String s1, String s2, int m, int n) {

        if (memo[m][n] != -1)
            return memo[m][n];
        if (m == 0 || n == 0)
            memo[m][n] = 0;
        else {
            if (s1.charAt(m - 1) == s2.charAt(n - 1))
                memo[m][n] = 1 + longestCommonSubsequenceUsingMemoization(s1, s2, m - 1, n - 1);
            else
                memo[m][n] = Math.max(longestCommonSubsequenceUsingMemoization(s1, s2, m - 1, n),
                        longestCommonSubsequenceUsingMemoization(s1, s2, m, n - 1));
        }
        return memo[m][n];
    }

    // Using the Tabulation solution for the same approach
    // Make an array of size [m+1][n+1]
    // why m+1 & n+1 ???
    // while working with our recursive approach we were reaching case where length = 0 & this was top-down approach
    // but in Tabulation we are going to fill the array in bottom-up approach
    // to get the solution of sub-strings 1&1, we are going to need solution for 0,1 & 1,0 & 0,0
    // that is why we have an extra row and column to accommodate this.
    // dp[i][j] = length of LCS of s1[0....i-1] and s2[0....j-1]

    //          B   A   Z
    //      0   0   0   0
    //  A   0   0   1   0
    //  X   0   0   1   1
    //  Y   0   0   1   1
    //  Z   0   0   1   2

    // Your result is always dp[m][n]

    public static int longestCommonSubsequenceUsingTabulation(String s1, String s2, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}

