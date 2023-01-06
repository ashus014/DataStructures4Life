-----------
Binary Heap
-----------
It is used to implement the Binary Heap Sort.
Also used to implement priority queue.

Priority queue is used in many DS algorithm like
- Djikstra's shortest path algorithm.
- Prim's Algorithm
- Hoffman Coding

Two ways to implement this -
1. Min Heap - Highest priority item is assigned lowest value.
2. Max Heap - Highest priority item is assigned highest value.

Binary Heap is a complete Binary Tree.
A Binary Tree is complete if its all levels are complete filled, except possibly the last level.
And the last level has to be filled form left to right.

                                10
                       20               30
                   49       50      60

Left(i) can be obtained from - 2(i) + 1
Right(i) can be obtained from - 2(i) + 2
Parent of i - floor((i-1)/2)

So above binary tree can be represented like Array like following -

Index   - 0  1  2  3  4  5
Element - 10 20 30 40 50 60

Conditions of a Min Heap
------------------------
1. It is a complete binary tree.
2. Every node has value smaller than its descendants.

eg.

                                10
                       20               15
                   30       40      18

Operations on Heap data structure
---------------------------------
Heapify : One of the sub nodes does not follow the min heap property, and
we need to fix that.