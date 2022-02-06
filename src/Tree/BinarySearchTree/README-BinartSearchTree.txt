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

Search in BST - Worst time taken during search in BST is the height of BST.


