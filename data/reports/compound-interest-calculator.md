# Compound Interest Calculator

## Category

Math

## Difficulty

Easy

## Concepts

* Math.pow
* Scanner

## Code Logic

1. The program starts by asking the user to input the principal amount, time in years, and interest rate using a Scanner object.
2. It stores the user inputs in variables p, t, and r, converting the interest rate from percentage to decimal by dividing by 100.
3. The program calculates the compound interest using the formula p * (1 + r)^t, where p is the principal amount, r is the interest rate, and t is the time in years.
4. It uses the Math.pow function to calculate the power of (1 + r) raised to t.
5. Finally, the program prints the calculated compound interest with two decimal places using System.out.printf.

## Time Complexity

O(1)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This Java program calculates compound interest based on user input for principal amount, time in years, and interest rate. It uses the formula for compound interest and prints the result. The program takes three inputs from the user and outputs the calculated compound interest.
