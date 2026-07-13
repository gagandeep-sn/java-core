# Maximum Subarray

## Category

Arrays

## Difficulty

Easy

## Concepts

* Dynamic Programming
* Arrays
* Big-O Notation

## Code Logic

1. Initialize two variables: `maximum` to store the maximum sum found so far, and `sum` to store the current sum of the subarray.
2. Iterate through the array using a for loop, starting from the first element and ending at the last element.
3. Inside the loop, add the current element to the `sum` variable.
4. Update the `maximum` variable to be the maximum of the current `sum` and the previous `maximum`.
5. If the `sum` becomes negative, reset it to 0 to start a new subarray.
6. After the loop finishes, print the final value of `maximum`, which is the maximum sum of a subarray.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Beginner

## Explanation

This program finds the maximum sum of a subarray within a given array of integers. It iterates through the array, keeping track of the maximum sum found so far. If the current sum becomes negative, it resets the sum to 0. The final output is the maximum sum of a subarray.
