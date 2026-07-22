# Ceiling Element in Array

## Category

Arrays

## Difficulty

Easy

## Concepts

* Binary Search
* Arrays

## Code Logic

1. We start by initializing two pointers, start and end, to the first and last elements of the array, respectively.
2. We then enter a while loop that continues until start is greater than end.
3. Inside the loop, we calculate the middle index of the current range.
4. We compare the target element to the middle element of the array. If the target is less than the middle element, we move the end pointer to the left of the middle element.
5. If the target is greater than the middle element, we move the start pointer to the right of the middle element.
6. If the target is equal to the middle element, we return the middle index as the ceiling element.
7. If the while loop ends without finding the ceiling element, we return the start index, which points to the ceiling element.

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Intermediate

## Explanation

This program finds the smallest number greater than or equal to a target number in an array. It uses a binary search algorithm to efficiently find the ceiling element. The program takes an array of integers and a target number as input, and prints the ceiling element. If no such element exists, it prints the first element in the array.
