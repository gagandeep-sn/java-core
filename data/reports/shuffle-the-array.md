# Shuffle the Array

## Category

Arrays

## Difficulty

Easy

## Concepts

* Array manipulation
* Loops

## Code Logic

1. The program starts by defining an array of integers and calculating the middle index of the array.
2. Two pointers, 'first' and 'second', are initialized to the start of the first half and the start of the second half of the array, respectively.
3. A new array 'ans' is created to store the shuffled elements, and a pointer 'next' is initialized to keep track of the current position in the 'ans' array.
4. The program then enters a loop that runs for 'n' iterations, where 'n' is the number of elements in the first half of the array.
5. Inside the loop, the program takes one element from the first half of the array and adds it to the 'ans' array, then increments the 'first' pointer and the 'next' pointer.
6. The program then takes one element from the second half of the array and adds it to the 'ans' array, then increments the 'second' pointer and the 'next' pointer.
7. The loop continues until all elements from both halves of the array have been added to the 'ans' array.
8. Finally, the program prints the shuffled array.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This program takes an array of integers as input and shuffles it by rearranging the elements in a specific pattern. The array is divided into two halves and the elements are rearranged by taking one element from the first half and then one element from the second half. The output is the shuffled array.
