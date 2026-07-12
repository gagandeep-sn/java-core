# Highest Common Factor (HCF) of Two Numbers

## Category

Math

## Difficulty

Easy

## Concepts

* Math
* Loops

## Code Logic

1. The program prompts the user to enter two numbers, num1 and num2.
2. It finds the smaller of the two numbers using the Math.min function and stores it in the variable min.
3. It initializes two variables, d and hcf, to 1 and 0 respectively. d is used to check divisors and hcf stores the highest common factor.
4. The program enters a while loop that runs until d is greater than or equal to min.
5. Inside the loop, it checks if both num1 and num2 are divisible by d. If they are, it updates hcf to d.
6. It increments d by 1 in each iteration of the loop.
7. Once the loop finishes, the program prints the highest common factor (hcf) of the two input numbers.

## Time Complexity

O(min(n1, n2))

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program calculates the Highest Common Factor (HCF) of two input numbers. It takes two integers as input, finds the smaller number, and then checks all divisors of the smaller number to find the largest common divisor. The program outputs the HCF of the two input numbers.
