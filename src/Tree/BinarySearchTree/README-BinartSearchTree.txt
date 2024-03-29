----------------------------------
    Binary Search Tree
----------------------------------

               Array(Unsorted)      Array(Sorted)       LinkedList                      BST(Balanced)      HashTable
Search              O(n)               O(logn)            O(n)                          O(logn)             O(1)
Insert              O(1)               O(n)               O(1) & O(n) [Sorted]          O(logn)             O(1)
Delete              O(n)               O(n)               O(n)                          O(logn)             O(1)
Find Closest        O(n)               O(logn)            O(n)                          O(logn)             O(n)
Sort Traversal      O(nlog)            O(n)               O(nlogn) & O(n) [Sorted]      O(n)                O(nlogn)

In Binary Search Tree data is organised in such a way that when you are searching an item you can skip almost half of the items.
The idea is based on Binary Search Algorithm on Array.

For a particular head all the value to left is smaller & all vales to right is greater.

                                50
                       30               70
                   10       40      60       80

When we consider Binary Search trees, we usually consider distinct values.
BSTs are like linked lists,it is like a linked data structure.
-------------
  Advantage
-------------
You never require, you can always insert the new items as long as you have memory available.

-------------
  Disadvantage
-------------
Not being cache friendly, since items are at different locations.

--------------------------------
        Operations on BST
--------------------------------

BSTs are almost same as Binary Tree, the only difference is that they have special insert operations.
There is order in how you insert elements.
Order also needs to be maintained while deleting items.

Search in BST -
-------------
Worst time taken during search in BST is the height of BST.

Deleting in BST -
---------------
1. Deleting a leaf node is easy
2. Delete a node with one child is also easy
3. But we face some issue when the node is let's say a root node - the node needs to be replaces with the closest lower/higher value.

It's up-to you to select but have one rule & follow it throughout.
So find the inorder successor and replace the deleted node with inorder successor and delete the inorder successor.

The aim is that the BST property should not be violated.

Floor in BST -
------------
To find the largest value which is smaller than the given value.
If no smaller value present, then return null.

--------------------------------
Self Balancing BSTs
--------------------------------

Which keeps balancing themselves, it's not that thr height of left side is more than right side.
AVL Tree & Red Black Trees are the example of Self balancing trees.

AVL Tree -
This is very strict in terms of height. It tries to maintain very strict balance.
It is a self-balancing binary search tree.
It is also height balanced i.e., for every node, difference between left & right heights does not exceed one.
Balance Factor = |lf - rh|
Balance Factor <= 1
AVL Tree does rotation to re-structure itself during insert and delete operations.


Red Black Tree -
-- In JAVA & C++ implementation if HashSet and HashMap, red-black tree is used.
It is slightly loose in terms of balance. Since this is loose in terms of balance.
It requires less restructuring if you are doing insert or delete.
Here as well, insertion & deletion operation requires some restructuring.
Every node is either Red or Black.
ROOT is always Black.
No. two consecutive Reds are allowed.
No. of black nodes from  every node to all its descandent leaves should be same.

IMPORTANT
----------
Since searches are many and AVL Tree has the fastest search operation, always prefer AVL Tree.
But when you have a mix of insertion, deletion & searches, Red-Black Tree is always a good option.

Application of BST
------------------
To maintain sorted stream of data.
To implement doubly ended priority queue.
To solve problems like -
    - count smaller/greater in a stream
    - floor/ceiling/greater/smaller in a stream



