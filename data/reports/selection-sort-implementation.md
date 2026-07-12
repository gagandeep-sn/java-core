# Selection Sort Implementation

## Category

Sorting

## Difficulty

Easy

## Concepts

* Sorting Algorithms
* Array Manipulation

## Code Logic

1. The selectionSort function takes an array of integers as input and initializes a variable n to store the length of the array.
2. The outer loop runs from the first element to the second last element of the array (n-1).
3. Inside the outer loop, the variable minIdx is initialized to the current index i, assuming the smallest element is at the current index.
4. The inner loop runs from the next element of the current index (i+1) to the last element of the array.
5. Inside the inner loop, if an element is found to be smaller than the current smallest element (arr[minIdx]), the minIdx is updated to the index of the smaller element.
6. After the inner loop completes, the smallest element is swapped with the current element at index i.
7. The process is repeated until the entire array is sorted.
8. In the main function, an example array is created and passed to the selectionSort function.
9. After sorting, the elements of the array are printed to the console.

## Time Complexity

O(n²)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Beginner

## Explanation

This Java program implements the selection sort algorithm, which sorts an array of integers in ascending order. It takes an array as input, iterates through it to find the smallest element, and swaps it with the first element. This process is repeated until the entire array is sorted. The output is the sorted array.
