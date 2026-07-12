# Reverse Array

## Category

Arrays

## Difficulty

Easy

## Concepts

* Two Pointers

## Code Logic

1. Initialize two pointers, left and right, to the start and end of the array, respectively.
2. Enter a while loop that continues until the left pointer is no longer less than the right pointer.
3. Inside the loop, swap the elements at the left and right pointers using a temporary variable.
4. Increment the left pointer and decrement the right pointer to move towards the center of the array.
5. Once the loop ends, the array has been reversed in place.
6. Use a for-each loop to print the reversed array.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Beginner

## Explanation

This program takes an array of integers as input and reverses the order of its elements. It uses two pointers, one at the start and one at the end of the array, to swap elements in a single pass. The output is the reversed array. The program demonstrates a simple and efficient way to reverse an array in place.
