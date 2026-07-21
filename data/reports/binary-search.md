# Binary Search

## Category

Sorting

## Difficulty

Easy

## Concepts

* Arrays
* Sorting
* Searching

## Code Logic

1. We start by initializing two pointers, start and end, to the first and last elements of the array, respectively.
2. We then enter a while loop that continues as long as start is less than or equal to end.
3. Inside the loop, we calculate the middle index of the current search interval.
4. We then compare the target element to the middle element of the array. If the target element is less than the middle element, we update the end pointer to be the middle index minus 1. Otherwise, if the target element is greater than the middle element, we update the start pointer to be the middle index plus 1.
5. If the target element is equal to the middle element, we return the middle index.
6. If the while loop ends without finding the target element, we return -1 to indicate that the target element is not in the array.

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Intermediate

## Explanation

This program performs a binary search on a sorted array to find the index of a target element. It takes an array and a target element as input, and outputs the index of the target element if found. If the target element is not in the array, it outputs -1. The binary search algorithm works by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, the next interval will be the lower half. Otherwise, the next interval will be the upper half. This process continues until the target element is found or the search interval is empty.
