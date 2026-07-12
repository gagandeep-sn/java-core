# Add to Array Form of Integer

## Category

Arrays

## Difficulty

Easy

## Concepts

* Array Manipulation
* Basic Arithmetic

## Code Logic

1. Initialize an empty ArrayList to store the result.
2. Iterate through the input array from right to left.
3. For each digit in the array, add k to it and calculate the sum.
4. Append the last digit of the sum (sum % 10) to the beginning of the result ArrayList.
5. Update k to be the carry-over value (sum / 10).
6. Repeat steps 3-5 until all digits in the array have been processed.
7. If there is still a carry-over value (k > 0), append it to the beginning of the result ArrayList.
8. Print the result ArrayList.

## Time Complexity

O(n + log k)

## Space Complexity

O(n + log k)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This program takes an array representing a non-negative integer and an integer k as input. It adds k to the integer represented by the array and returns the result as an array. The program processes the input by iterating through the array from right to left, adding k to each digit and carrying over any overflow. The final output is an array representing the sum of the input integer and k.
