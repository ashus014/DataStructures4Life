----------------
Greedy Algorithm
----------------
Mainly used for optimization problems.
Optimization means - Optimizing or minimizing something.

Shortest path is an Optimization Problem.
Longest path problem is also an optimization problem.

----------
Basic Flow
----------
1. Sort
2. Initialize something to 0 | something
3. Compute
4. Return


There are some places where greedy doesn't look much promising -
1. One of example is coin change problem.

There are also some problem where greedy works best -
1. Activity selection
2. Fractional Knapsack
3. Job Sequencing
4. Prim's Algorithm
5. Kruskal's Algorithm
6. Djikstra's Algorithm
7. Huffman Coding
8. Finding to close to optimal solutions, NP hard problem
like travelling Salesman  Problem.

Activity Selection Problem
--------------------------
Maximum number of activities that can happen on a single tasking machine.
(2,3) , (1,4) , (5,8) , (6,10)
OUTPUT - 2

Solution Approach-
1. Sort according to finish line.                                                   ->  n * log(n)
2. Initialize solution to first activity
3. Do following for remaining activities :
    3.1. If current activity overlaps with last picked activity in the solution,
    ignore the current activity.
    3.2. Else add the current activity to the solution.

Overall Time complexity of Problem is O(n*lon(n))

Knapsack Problem (Fractional)
-----------------------------
The knapsack problem is a problem in combinatorial optimization: Given a set of items,
each with a weight and a value, determine the number of each item to include in a collection
so that the total weight is less than or equal to a given limit and the total value is as large as possible.

Solution:

1. Calculate ratio (value/weight) for every item.
2. Sort all items in decreasing order.
3. For rest...follow the algorithm :)

Job Sequencing Problem
----------------------
Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline.
It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1.
How to maximize total profit if only one job can be scheduled at a time.

Solution:

1. Sort jobs in decreasing order of profit.
2. Initialize the result as first job in the sorted list & assign the latest possible slot.
3. Do the following for the remaining (n-1) jobs:
    (a) If this job cannot be added, ignore it.
    (b) Else, add it to the latest possible slot.

Huffman Coding Problem
----------------------
- used for lossless compression
- variable length coding
- prefix free code

High level view : We create a Binary/Huffman tree
