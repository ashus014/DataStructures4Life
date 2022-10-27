package DynamicProgramming;

// Using memoization in dynamic programming to solve the n factorial problems
public class Problem1 {

    static int memo[] = new int[10];
    static {
        for(int i=0 ;i<memo.length; i++) memo[i] = -1;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(findFibonnaci(num));
    }

    private static int findFibonnaci(int n) {
        if(memo[n] == -1) {
            int res;
            if(n==0 || n==1)
                res = n;
            else
                res = findFibonnaci(n-1) + findFibonnaci(n-2);

            memo[n] = res;
        }
        return memo[n];

    }
}
