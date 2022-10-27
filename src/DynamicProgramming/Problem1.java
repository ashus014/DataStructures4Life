package DynamicProgramming;

// Using memoization in dynamic programming to solve the n factorial problems
public class Problem1 {

    static int memo[] = new int[10];
    static {
        for(int i=0 ;i<memo.length; i++) memo[i] = -1;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(findFibonnaci(4));
    }

    private static int findFibonnaci(int num) {
        return helper(num);

    }

    private static int helper(int n) {

        if(memo[n] == -1) {
            int res;
            if(n==0 || n==1)
                res = n;
            else
                res = helper(n-1) + helper(n-2);

            memo[n] = res;
        }
        return memo[n];
    }
}
