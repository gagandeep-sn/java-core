# Running Sum of 1D Array

## Category

Arrays

## Difficulty

Easy

## Concepts

* Arrays
* Loops

## Code Logic

1. Initialize an array 'nums' with the input values.
2. Create a new array 'ans' of the same length as 'nums' to store the running sum.
3. Set the first element of 'ans' to the first element of 'nums'.
4. Iterate through 'nums' starting from the second element (index 1).
5. For each element, calculate the running sum by adding the current element to the previous sum stored in 'ans'.
6. Store the calculated sum in the corresponding index of 'ans'.
7. Iterate through 'ans' and print each element, which represents the running sum up to that index in 'nums'.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This program calculates the running sum of a given 1D array. It takes an array of integers as input, processes each element to calculate the cumulative sum, and outputs the resulting array. The running sum is calculated by adding each element to the sum of all previous elements. The output is an array where each element is the sum of all elements up to that index in the input array.
