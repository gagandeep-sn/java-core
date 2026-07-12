# Perfect Number Checker

## Category

Math

## Difficulty

Easy

## Concepts

* Loops
* Conditional Statements
* Input/Output

## Code Logic

1. The program prompts the user to enter a number and stores it in the variable 'num'.
2. It initializes two variables, 'fac' and 'sum', to 0. 'fac' will store each divisor of 'num', and 'sum' will store the sum of these divisors.
3. The program uses a for loop to iterate from 1 to 'num-1', checking each number to see if it's a divisor of 'num'.
4. If a number 'j' is a divisor of 'num', it's added to 'sum'.
5. After checking all numbers, the program checks if 'sum' is equal to 'num'.
6. If 'sum' is equal to 'num', the program prints that 'num' is a perfect number; otherwise, it prints that 'num' is not a perfect number.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program checks if a given number is a perfect number. A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. The program takes an integer input from the user, calculates the sum of its divisors, and checks if it's equal to the number itself.
