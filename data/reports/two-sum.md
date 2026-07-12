# Two Sum

## Category

Arrays

## Difficulty

Easy

## Concepts

* Brute Force

## Code Logic

1. We define an array of integers 'nums' and a target sum 'target'.
2. We create an array 'ans' to store the indices of the two numbers that sum up to the target.
3. We use two nested loops to iterate over the 'nums' array, checking all possible pairs of numbers.
4. Inside the inner loop, we calculate the sum of the current pair of numbers.
5. If the sum equals the target, we store the indices of the two numbers in the 'ans' array and print it.
6. We return from the function after finding the first pair of numbers that sum up to the target.

## Time Complexity

O(n²)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Beginner

## Explanation

This program finds two numbers in an array that add up to a given target. It takes an array of integers and a target sum as input, and outputs the indices of the two numbers that sum up to the target. The program uses a brute force approach to check all possible pairs of numbers in the array.
