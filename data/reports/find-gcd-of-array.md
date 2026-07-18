# Find GCD of Array

## Category

Arrays

## Difficulty

Easy

## Concepts

* Arrays
* Sorting

## Code Logic

1. We start by initializing two variables, min and max, to the first number in the array.
2. We then iterate through the rest of the array, updating min and max if we find a number that is smaller or larger than the current min or max.
3. After finding the max and min, we use the Euclidean algorithm to find their GCD.
4. In the Euclidean algorithm, we repeatedly apply the division algorithm: we divide the larger number by the smaller number, and take the remainder.
5. We then replace the larger number with the smaller number, and the smaller number with the remainder.
6. We repeat steps 4-5 until the smaller number becomes 0.
7. At this point, the larger number is the GCD of the original max and min.
8. We print out the GCD as the final output.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This program finds the Greatest Common Divisor (GCD) of the maximum and minimum numbers in an array. It first finds the maximum and minimum numbers in the array, then uses the Euclidean algorithm to find their GCD. The Euclidean algorithm is a way to find the GCD of two numbers by repeatedly applying the division algorithm.
