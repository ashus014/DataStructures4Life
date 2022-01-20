//Theory

In JAVA Sort is implemented in two classes -

1. Arrays Class
---------------
Arrays class has sort implementation for normal arrays

2. Collections Class
--------------------
Collections class has sort implementation for Collections.

Collections which are List Interface implementing classes allows sorting.
-ArrayList
-LinkedList
-Vector

------------------------------------------------------------------------------------------------------------------------

There are two types of Arrays in JAVA -

1. Array of primitives - int, char

2. Array of non-primitives - String, Integer, Student


When you have non-primitives then the stability is needed -
---------------------------------------------------------
JAVA has simple rule -
It uses a stable algorithm, when Array of non-primitives is sorted. (Algorithm used here is MergeSort [Adaption from TimSort, used in Python])

It uses an unstable algorithm, when Array of primitives is sorted. (Algorithm which is used here is dual-pivot Quick Sort)

Arrays.sort()
-------------
It does not provide custom comparator.
You can only sort in natural order or increasing order.

Arrays.sort() also provide custom sub array sorting : <<Arrays.sort(arr, stat-index, end-index)>>


Collections.sort()
------------------
Used to sort List (Collection) -> ArrayList & LinkedList

Wrapper Classes implement Comparable Interface, which means they have "compareTo" function inside them.
Which could be used to compare two integers to decide which one should go first.

------------------------------------------------------------------------------------------------------------------------
Stability of Sorting Algorithms
------------------------------------------------------------------------------------------------------------------------
Stability is required when you have two or more fields, and you want to maintain order in all of them.

Example of Stable Sorting : Bubble Sort, Insertion Sort, Merge Sort, ...
Example of Unstable Sorting : Selection Sort, Quick Sort, Heap Sort, ...

Bubble Sort
-----------
We do multiple pass here -
1st Pass - Maximum Element reaches to its final Position.
2nd Pass - Second Maximum Element reaches to its final Position.




