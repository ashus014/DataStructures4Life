package DynamicProgramming;

// Edit distance problem
// you have to convert s1 into s2 | you can do three operation
// 1. Insert
// 2. Delete
// 3. Replace

// This problem ha special application in dictionary, if you type the wrong word, we can find the
// correct word nearest to that in the Dictionary.

// eg - s1:"CAT" & s2:"CUT" | Ans - 1
public class Problem5 {

    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "CUT";
        System.out.println(editDistanceUsingTabulation(s1, s2, s1.length(), s2.length()));
    }

    private static int editDistance(String s1, String s2, int m, int n) {

        if (m == 0)
            return n;
        if (n == 0)
            return m;
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return editDistance(s1, s2, m - 1, n - 1);
        else
            return 1 + Math.min(editDistance(s1, s2, m, n - 1), //insert
                    Math.min(editDistance(s1, s2, m - 1, n), //delete
                            editDistance(s1, s2, m - 1, n - 1))); //replace
    }

    // Using Tabulation approach to solve the problem
    // Time Complexity - θ(m*n) with naive recursive approach
    private static int editDistanceUsingTabulation(String s1, String s2, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
            }
        }
        return dp[m][n];
    }
}
