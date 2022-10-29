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
----------------------------------------
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
1. Coin change count Problem
2. Edit distance problem

Variations of Longest Increasing Sub-sequence (LIS) Problem
-----------------------------------------------------------
1. Minimum deletions to make an array sorted
For arr = {5,10,3,6,7,8} user need to delete 2 elements to make it sorted.
So, output = 2
possibility1 = {5,6,7,8} or possibility2 = {3,6,7,8}
ans = n - lis

2. Maximum sum increasing sub-sequence
For arr = {3,20,4,6,7,30}
maxSumSubSequence = {3,20,30} but maxIncreasingSubSequence = {3,4,6,7}
Some change in the LIS code.

3. Maximum length Bitonic Subsequnce
What is Bitonic Subsequnce ?
Ans - Which is first increasing then decreasing.
arr = {1,11,2,10,4,5,2,1}
ans = 6 i.e., {1,2,10,5,2,1}
for sorted array, ans = length of the array (for both increasing and decreasing)
sol - LIS from left, LIS from right
LIS_Left[i] + LIS_Right[i] - 1 = which ever is greater is the answer

4. Building Bridges
(6,2)(4,3)(2,6)(1,5) : make bridge such that there is no overlap
sol - 2 i.e., (2,6) & (1,5)
Step 1: Sort them in increasing order of first value of pair.
If two first values are same like (2,6) and (2,3), then consider second.
Step 2: Find LIS of the sorted array according to second values.

5. Longest Chain of Pairs




