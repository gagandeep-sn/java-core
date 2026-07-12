# Factorial Recursion

## Category

Recursion

## Difficulty

Easy

## Concepts

* Recursion
* Function Calls

## Code Logic

1. The program defines a recursive function called fact that takes an integer n as input.
2. If n is less than or equal to 1, the function returns 1, which is the base case for the recursion.
3. If n is greater than 1, the function calls itself with the argument n-1 and multiplies the result by n.
4. This recursive call continues until n is less than or equal to 1, at which point the function starts returning the results back up the call stack.
5. The final result is the product of all the numbers from n down to 1, which is the factorial of n.
6. In the main function, the program calls the fact function with the argument 5 and prints the result to the console.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This program calculates the factorial of a given number using recursion. It takes an integer as input, recursively multiplies the number by the factorial of the previous number, and returns the result. The factorial of a number is the product of all positive integers less than or equal to that number. The program outputs the factorial of the input number.
