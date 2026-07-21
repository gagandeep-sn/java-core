# Order-Agnostic Binary Search

## Category

Sorting

## Difficulty

Medium

## Concepts

* Binary Search
* Arrays
* Loops
* Conditional Statements

## Code Logic

1. Initialize two pointers, start and end, to the beginning and end of the array, respectively.
2. Determine the relationship between the start and end elements to decide the direction of the search.
3. Calculate the middle index of the current range.
4. Compare the middle element to the target element. If they match, return the middle index.
5. If the target is less than the middle element, move the end pointer to the left of the middle index. Otherwise, move the start pointer to the right of the middle index.
6. Repeat steps 3-5 until the target is found or the search range is empty.
7. If the target is not found, return -1.

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Intermediate

## Explanation

This program performs an order-agnostic binary search on a given array to find the index of a target element. It takes an array and a target element as input, processes the array to find the target, and returns the index of the target if found. If the target is not found, it returns -1.
