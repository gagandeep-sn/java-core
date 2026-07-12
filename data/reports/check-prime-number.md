# Check Prime Number

## Category

Math

## Difficulty

Easy

## Concepts

* Prime Numbers
* Loops
* Conditional Statements

## Code Logic

1. The program first prompts the user to enter a number.
2. It then reads the input number using a Scanner object.
3. The input number is passed to the checkPrime method, which checks if the number is prime or not.
4. Inside the checkPrime method, it first checks if the number is less than or equal to 1, in which case it's not prime.
5. If the number is greater than 1, it then checks if the number is divisible by any number from 2 to itself using a for loop.
6. If the number is divisible by any of these numbers, it's not prime, so the method returns false.
7. If the number is not divisible by any of these numbers, it's prime, so the method returns true.
8. The main method then prints out whether the number is prime or not based on the result of the checkPrime method.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program checks whether a given number is prime or not. It takes an integer input from the user, checks if it's divisible by any number from 2 to itself, and outputs whether it's prime or not. The program uses a simple trial division method to check for primality.
