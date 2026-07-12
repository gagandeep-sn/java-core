# Leap Year Checker

## Category

Miscellaneous

## Difficulty

Easy

## Concepts

* Conditional Statements
* Input/Output

## Code Logic

1. The program prompts the user to enter a year and stores it in the 'year' variable.
2. It checks if the year is divisible by 4 using the modulus operator (%).
3. If the year is divisible by 4, it further checks if the year is a century year (divisible by 100) or not.
4. If the year is a century year, it must be divisible by 400 to be a leap year.
5. If the year passes the leap year conditions, it prints that the year is a leap year; otherwise, it prints that the year is not a leap year.

## Time Complexity

O(1)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program checks whether a given year is a leap year or not. It takes an integer input from the user, applies the leap year rules, and outputs the result. A leap year is exactly divisible by 4 except for century years (years ending with 00). The century year is a leap year only if it is perfectly divisible by 400.
