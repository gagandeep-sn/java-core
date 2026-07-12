# Permutation Array

## Category

Arrays

## Difficulty

Easy

## Concepts

* Array Indexing
* Array Manipulation

## Code Logic

1. We start with an input array num and create a new array ans of the same length.
2. We iterate through the input array num, using each element as an index into num itself.
3. We assign the value at the indexed position in num to the corresponding position in the ans array.
4. We then iterate through the ans array and print each element, resulting in the permutation of the original array.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This program takes an array of integers as input and generates a new array where each element at index i is the value at index num[i] in the original array. It then prints the new array. The input array is used to index into itself, creating a permutation of the original array.
