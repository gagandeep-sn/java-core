# Armstrong Number Checker

## Category

Math

## Difficulty

Easy

## Concepts

* Loops
* Math Operations

## Code Logic

1. The program first prompts the user to enter a number and stores it in the variable 'num'.
2. It then calculates the number of digits in the input number by dividing the number by 10 in a loop until it becomes 0.
3. The program then calculates the sum of cubes of each digit by taking the modulus of the number with 10 to get the last digit, raising it to the power of the number of digits, and adding it to the sum.
4. After calculating the sum, the program checks if it's equal to the original number.
5. If the sum is equal to the original number, the program prints that the number is an Armstrong number; otherwise, it prints that it's not.

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This Java program checks if a given number is an Armstrong number. An Armstrong number is a number that is equal to the sum of cubes of its digits. The program takes an integer input from the user, calculates the sum of cubes of its digits, and checks if it's equal to the original number.
