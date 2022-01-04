package Recursion;

// Theory
/*
* While dealing with recursion always have a condition to exit i.e., Base Case
*
*   Syntax of Recursion -
*       fun(){
*           Base Case
*           Recursion call (i.e., call itself) with atleast one change in parameter
*       }
*
* Application of recursion -
* One of the core topics in programming
*
* Iteration and recursion generally have same recursive power
*
* Many algorithms techniques are based on Recursion:
*  -> Dynamic Programming
*  -> Backtracking
*  -> Divide and Conquer (Binary Search, Quick Sort, Merge Sort)
*
* Many Problems inherently recursive
*  -> Tower of Hanoi
*  -> DFS based traversal (in-Order/pre-order/post-order)
*
* */

public class Test {

    // 1 - Simple recursion function to print 'n' number of times
    static void fun1(int n){
        if(n == 0) return;
        System.out.println("Ashu");
        fun1(n-1);
    }

    // 2 - Print Integer from n to 1
    static void fromNto1(int n){
        if(n==0)return;
        System.out.println(n);
        fromNto1(n-1);
    }

    // 3 - Print Integer from 1 to n
    static void from1toN(int n){
        if(n==0)return;
        from1toN(n-1);
        System.out.println(n);
    }

    // 4 - Tail Recursion
    /*
    * When function has nothing to do after child call then it is a tail recursive
    * otherwise, not a tail recursive function call
    *
    * If dealing with recursion always prefer tail recursive function, because it is optimized by the modern compilers
    * and usually takes less time.
    *
    * Function no (3) is not tail recursive, so updating it for the tail recursion
    *
    * When given problem to traverse a tree and it can be done with all three (inorder, preorder, postorder)
    * Always choose inorder, preorder over post order
    * Since it is not a tail recursion
    * eg - sum of all nodes in a tree
    *
    * */
    static void from1toNpart2(int n, int k){
        if(n==0)return;
        System.out.println(k);
        from1toNpart2(n-1, k+1);
    }

    // 5- Find factorial without tail recursion
    static int factorial1(int n){
        if (n == 0 || n == 1) return 1;
        return n*factorial1(n-1);
    }

    // 5(2) - Find factorial with tail recursion
    static int factorial2(int n, int fact){
        if (n == 0 || n == 1)
            return fact;
        fact = fact*n;
        return factorial2(n-1,fact);
    }

    // 6 - Sum of first 'n' natural numbers
    static int sumOfnNaturalNumbers(int n){
        if(n == 0) return 0;
        return n+sumOfnNaturalNumbers(n-1);
    }

    // 7- Check if the String is Palindrome using Recursion
    static boolean isPalindrome(String str, int start, int end){
        if(start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end) && isPalindrome(str, start+1, end-1));
    }


    public static void main(String[] args) {
        String str = "abdcba";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
