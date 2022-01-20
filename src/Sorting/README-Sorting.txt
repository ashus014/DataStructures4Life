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

------------------------------------------------------------------------------------

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

