# Number of Good Pairs

## Category

Arrays

## Difficulty

Easy

## Concepts

* Nested Loops
* Pair Counting

## Code Logic

1. Initialize a counter variable 'count' to 0 to store the number of good pairs.
2. Use two nested loops to compare each element in the array with every other element.
3. The outer loop iterates over each element in the array, and the inner loop starts from the next index of the outer loop to avoid comparing an element with itself.
4. Inside the inner loop, check if the current element is equal to the compared element.
5. If they are equal, increment the 'count' variable by 1.
6. After the loops finish, print the total count of good pairs.

## Time Complexity

O(n²)

## Space Complexity

O(1)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This program takes an array of integers as input and counts the number of pairs of equal elements. It uses nested loops to compare each element with every other element. The output is the total count of good pairs, where a good pair is a pair of equal elements.
