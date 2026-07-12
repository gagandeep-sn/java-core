# How Many Numbers Are Smaller Than Current

## Category

Arrays

## Difficulty

Easy

## Concepts

* Arrays
* Loops

## Code Logic

1. We create an input array 'nums' and an output array 'ans' of the same length.
2. We iterate over each element in the 'nums' array using the outer loop.
3. For each element in the outer loop, we use an inner loop to compare it with every other element in the 'nums' array.
4. If the current element in the outer loop is greater than the element in the inner loop, we increment a counter 'count'.
5. After the inner loop completes, we assign the 'count' value to the corresponding index in the 'ans' array.
6. We repeat steps 2-5 until all elements in the 'nums' array have been processed.
7. Finally, we print the 'ans' array, which contains the count of smaller elements for each element in the input array.

## Time Complexity

O(n²)

## Space Complexity

O(n)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program takes an array of integers as input and outputs a new array where each element represents the number of elements in the original array that are smaller than the corresponding element. It uses two nested loops to compare each element with every other element in the array. The output array contains the count of smaller elements for each element in the input array.
