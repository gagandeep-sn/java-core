# Target Array in Given Order

## Category

Arrays

## Difficulty

Medium

## Concepts

* Array Manipulation
* Nested Loops

## Code Logic

1. Initialize two input arrays: nums and index, where nums contains the numbers to be placed in the target array and index contains the corresponding indices.
2. Create a new array target with the same length as nums to store the result.
3. Iterate over each number in nums using the outer loop.
4. For each number, use the inner loop to shift existing elements in the target array to the right, starting from the current index down to the target index.
5. Place the current number at its target index in the target array.
6. Repeat steps 3-5 until all numbers have been placed in the target array.
7. Print the constructed target array.

## Time Complexity

O(n²)

## Space Complexity

O(n)

## Interview Relevance

Medium

## Topic Mastery

Intermediate

## Explanation

This program takes two arrays as input: a list of numbers and a list of indices. It then constructs a target array by placing each number at its corresponding index, shifting existing elements to the right if necessary. The output is the constructed target array.
