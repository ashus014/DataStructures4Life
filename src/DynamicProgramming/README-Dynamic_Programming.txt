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

Memoization is most of the time easy to write, but that is not fast.
The Tabulation solution is comparatively hard, but is fast.

Longest Common Subsequence
--------------------------
Please see the GFG video

Variations of LCS
-----------------
Please see the video

1. Coin change count Problem
2. Edit distance problem




