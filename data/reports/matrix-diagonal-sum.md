# Matrix Diagonal Sum

## Category

Arrays

## Difficulty

Easy

## Concepts

* Matrix Operations

## Code Logic

1. Initialize two variables, primarySum and secondarySum, to store the sums of the primary and secondary diagonals.
2. Iterate over the rows of the matrix, adding the elements of the primary diagonal to primarySum.
3. Initialize a row variable to 0 and iterate over the columns of the matrix in reverse order, adding the elements of the secondary diagonal to secondarySum.
4. Check if the matrix size is odd, and if so, subtract the middle element (which is counted twice) from the total sum.
5. If the matrix size is even, the total sum is the sum of primarySum and secondarySum.
6. Output the total sum of the diagonals.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This program calculates the sum of the primary and secondary diagonals of a square matrix. It takes a 2D array as input, calculates the sums of the diagonals, and outputs the total sum. The program handles both odd and even-sized matrices.
