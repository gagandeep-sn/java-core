# Reshape the Matrix

## Category

Arrays

## Difficulty

Medium

## Concepts

* 2D arrays
* looping
* reshaping

## Code Logic

1. We first check if the reshaping is possible by comparing the total number of elements in the old and new matrices.
2. If reshaping is possible, we create a new 2D array with the specified number of rows and columns.
3. We initialize two variables, newRow and newCol, to keep track of the current position in the new matrix.
4. We iterate through the old matrix using two nested loops, and for each element, we assign it to the corresponding position in the new matrix.
5. If we reach the end of a row in the new matrix, we move to the next row and reset the column index to 0.
6. Finally, we print the reshaped matrix.

## Time Complexity

O(r * c * oldRow * oldCol)

## Space Complexity

O(r * c)

## Interview Relevance

Medium

## Topic Mastery

Intermediate

## Explanation

This program takes a 2D matrix and attempts to reshape it into a new matrix with a specified number of rows and columns. It checks if the reshaping is possible by comparing the total number of elements in the old and new matrices. If reshaping is possible, it iterates through the old matrix and assigns each element to the corresponding position in the new matrix.
