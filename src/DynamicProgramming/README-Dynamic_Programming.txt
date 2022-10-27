-------------------
Dynamic Programming
-------------------
Dynamic Programming is an optimization over plain recursion.
and the idea is to re-use the solutions of sub problems, when there are overlapping sub problems.

There are two ways to implement dynamic programming -
1. Memoization (Top-Down)
2. Tabulation (Bottom-Up)

Application of Dynamic Programming
----------------------------------
1. Bellman Ford Algorithm
2. Floyd Warshall Algorithm
3. Diff Utility (Longest Common Subsequence [LCS])
4. Search close words (Edit distance problem)
5. Resource Allocation (0-1 Knapsack)

Memoization
-----------
- In memoization we change the time complexity of a problem from exponential to liner time.
- Main focus in Dynamic problem is to come up with recursive solutions which have overlapping sub-problems.
- Main idea of DP is, if you have computed once, then don't compute again.

Tabulation
----------
This is a bottom-top approach, start form the small and work your way till the top.
Idea is to leave recursion, have an array or a table and build your solution in bottom-up manner.

Memoization is most of the time easy to write, but that is not fast.
The Tabulation solution is comparatively hard, but is fast.

Memoization VS Tabulation
-------------------------
Memoization is very easy to implement once you have the recursive solution.
Simply follow the rules and convert recursion into memoization.

Tabulation is sometimes hard to implement, it was easy for the fibonacci case
but usually not that easy. But the advantage is that it doesn't require the recursion
call overhead. Tabulation is comparatively faster as compared to Memoization.

Variations of Longest Common Subsequence
--------------------------
1. Diff Utility - Mostly used in version control to show differences between two files.
2. Minimum insertions and deletions to convert s1 into s2
GEEK & GFEK
Do the LCS on the two we will get as 3. This means that we need to do two operations (1 Insertion and 1 Deletion).
3. Shortest common supersequnce & Length of the shortest common supersequnce
4. Longest Palindromic Subsequnce
Given a String s1 = "GEEKSFORGEEKS"
just create one more string s2 = reverse of s1 & just find the LCS of both and that is the answer.
5. Longest repeating sebsequnce.
s = AABB ans = 2
because 'A'A'B'B & A'A'B'B'
6. Finding optimised version of LCS
7. Print LCS (the string that is common in both)


Variations of LCS
-----------------
Please see the video

1. Coin change count Problem
2. Edit distance problem




