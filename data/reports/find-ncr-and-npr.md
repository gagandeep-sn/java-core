# Find NCR and NPR

## Category

Math

## Difficulty

Easy

## Concepts

* Factorial
* Combinations
* Permutations

## Code Logic

1. The program prompts the user to enter the total number of items and the number of items to choose or arrange.
2. The factorial function calculates the factorial of a given number by multiplying all integers from 1 to that number.
3. The program calculates the factorial of the total number of items (n), the number of items to choose or arrange (r), and the difference between n and r (d).
4. The program calculates NCR (n choose r) by dividing the factorial of n by the product of the factorials of r and d.
5. The program calculates NPR (n permute r) by dividing the factorial of n by the factorial of d.
6. The program prints the calculated values of NCR and NPR.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This Java program calculates the number of combinations (NCR) and permutations (NPR) of a given set of items. It takes two inputs: the total number of items and the number of items to choose or arrange. The program uses the factorial function to calculate NCR and NPR, then prints the results.
