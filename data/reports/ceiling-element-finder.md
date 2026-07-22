# Ceiling Element Finder

## Category

Arrays

## Difficulty

Medium

## Concepts

* Arrays
* Binary Search
* Big-O Notation

## Code Logic

1. We start by defining the start and end indices of the array, which will be used to perform a binary search.
2. We loop until the start index is greater than the end index.
3. Inside the loop, we calculate the middle index of the current range.
4. We compare the target to the middle element. If the target is less than the middle element, we know that the ceiling element must be in the left half of the range, so we update the end index to be the middle index minus one.
5. If the target is greater than the middle element, we know that the ceiling element must be in the right half of the range, so we update the start index to be the middle index plus one.
6. If the target is equal to the middle element, we return the middle index, because it is the ceiling element.
7. If the loop ends without finding the ceiling element, we return the end index, which is the last element in the array.
8. The reason we return the end index instead of the start index is that the end index is guaranteed to be the ceiling element, because the array is sorted in ascending order.

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

Medium

## Topic Mastery

Intermediate

## Explanation

This program finds the ceiling element in an array that is greater than or equal to a given target. It uses binary search to efficiently find the ceiling element. The program takes an array and a target as input, and prints the ceiling element. If no ceiling element exists, it prints the last element in the array.
