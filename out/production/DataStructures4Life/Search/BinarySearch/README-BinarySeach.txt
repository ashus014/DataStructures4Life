//Theory

/*
* Using the fact that array is sorted.
* Using the approach that going to each element one-by-one and checking that element is present at that location takes
* theta(n) time.
*
* And above approach is not using tha fact that array is sorted.
*
* Using Binary Search Approach -
*
* 1. First we find the mid-point
* 2. We compare the element with the element to find and this gives three more cases -
*           i> Element is equal to mid
*           ii> Element is less than mid
*           iii> Element is greater than mid
*
* Time complexity of Binary search is -> log n
*
* So, it's always a good idea to use binary search when the elements are sorted.
*
* */