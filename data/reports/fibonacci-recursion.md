# Fibonacci Recursion

## Category

Recursion

## Difficulty

Medium

## Concepts

* Recursion
* Dynamic Programming

## Code Logic

1. The program defines a recursive function fib that takes an integer n as input.
2. If n is less than or equal to 1, the function returns n, as the first two Fibonacci numbers are 0 and 1.
3. If n is greater than 1, the function calls itself with the arguments n-1 and n-2, and returns the sum of these two calls.
4. The main function calls fib with the argument 10 and prints the result.
5. The recursive calls to fib create a tree-like structure, with each call branching into two more calls, until the base case is reached.
6. The final output is the 10th Fibonacci number, which is calculated by summing the results of the recursive calls.

## Time Complexity

O(2ⁿ)

## Space Complexity

O(n)

## Interview Relevance

High

## Topic Mastery

Intermediate

## Explanation

This program calculates the nth Fibonacci number using recursion. The Fibonacci sequence is a series of numbers where a number is the sum of the two preceding ones, usually starting with 0 and 1. The program takes an integer n as input and returns the nth Fibonacci number. The output is the calculated Fibonacci number.
