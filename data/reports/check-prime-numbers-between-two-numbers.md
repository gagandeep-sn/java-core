# Check Prime Numbers Between Two Numbers

## Category

Math

## Difficulty

Easy

## Concepts

* Prime Numbers
* Input/Output
* Loops

## Code Logic

1. The program prompts the user to enter two numbers, num1 and num2.
2. It calculates the maximum and minimum of the two numbers to determine the range of numbers to check.
3. The program enters a while loop that iterates over the range of numbers from min to max.
4. Inside the loop, it calls the checkPrime function to check if the current number is prime.
5. If the number is prime, it prints the number.
6. The checkPrime function checks if a number is prime by iterating from 2 to the square root of the number and checking for divisibility.
7. If the number is divisible by any of the numbers in the range, it returns false, indicating that the number is not prime.
8. If the number is not divisible by any of the numbers in the range, it returns true, indicating that the number is prime.

## Time Complexity

O(n*sqrt(n))

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This Java program takes two numbers as input from the user and prints all prime numbers between them. It uses a helper function to check if a number is prime. The program processes the input by iterating over the range of numbers and checking each one for primality. The output is a list of prime numbers between the two input numbers.
