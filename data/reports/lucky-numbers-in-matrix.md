# Lucky Numbers in Matrix

## Category

Arrays

## Difficulty

Easy

## Concepts

* None

## Code Logic

1. We create two arrays, rowMin and colMax, to store the minimum of each row and the maximum of each column, respectively.
2. We initialize rowMin and colMax with the maximum and minimum possible values.
3. We iterate through the matrix, updating rowMin and colMax as we find smaller and larger numbers.
4. We then iterate through the matrix again, checking if each number is both the minimum of its row and the maximum of its column. If it is, we add it to the answer list.
5. Finally, we return the list of lucky numbers.

## Time Complexity

O(n^2)

## Space Complexity

O(n)

## Interview Relevance

Medium

## Topic Mastery

Intermediate

## Explanation

This program finds lucky numbers in a given matrix. A lucky number is a number that is both the minimum of its row and the maximum of its column. The program takes a 2D array as input, processes it, and returns a list of lucky numbers.
