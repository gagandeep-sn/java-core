# Infinite Array Search

## Category

Arrays

## Difficulty

Medium

## Concepts

* Arrays
* Binary Search
* Dynamic Programming

## Code Logic

1. We start by defining the initial range of the array, which is a box of size 2.
2. We then enter a while loop where we double the size of the box until the target value lies within the range.
3. Inside the while loop, we use a binary search algorithm to find the target value within the current range.
4. We calculate the middle index of the current range and compare the target value with the middle element.
5. If the target value is less than the middle element, we move the end of the range to the left half. Otherwise, we move the start of the range to the right half.
6. We repeat steps 4-5 until the target value is found or the range is empty.
7. If the target value is found, we return its index. Otherwise, we return -1.

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Intermediate

## Explanation

This program searches for a target value in an infinite array. It uses a binary search algorithm to find the target value. The array is divided into smaller ranges until the target value is found.
