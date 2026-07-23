# First and Last Position of Element in Array

## Category

Arrays

## Difficulty

Medium

## Concepts

* Arrays
* Searching
* Binary Search

## Code Logic

1. The program defines a function searchRange that takes an array and a target element as input and returns an array containing the first and last position of the target element.
2. The function searchRange calls the helper function search to find the first occurrence of the target element.
3. If the target element is found, the function searchRange calls the helper function search again to find the last occurrence of the target element.
4. The helper function search uses a binary search algorithm to find the target element in the array.
5. The binary search algorithm works by repeatedly dividing the search interval in half and searching for the target element in one of the two halves.
6. If the target element is found, the algorithm returns its index value.
7. If the target element is not found, the algorithm returns -1.
8. The function searchRange returns an array containing the first and last position of the target element.
9. If the target element is not found, the function returns [-1, -1].

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Intermediate

## Explanation

This program finds the first and last position of a target element in a given array. It uses a binary search algorithm to efficiently locate the target element. The program takes an array and a target element as input and returns an array containing the first and last position of the target element. If the target element is not found, the program returns [-1, -1].
