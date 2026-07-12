# LCM of Two Numbers

## Category

Math

## Difficulty

Easy

## Concepts

* Math.max
* while loop
* modulus operator

## Code Logic

1. The program prompts the user to enter two numbers, num1 and num2.
2. It finds the maximum of the two numbers using the Math.max function and stores it in the variable max.
3. It initializes a variable d to the value of max, which will be used to find the LCM.
4. It enters a while loop that continues until it finds a number that is divisible by both num1 and num2.
5. Inside the loop, it checks if d is divisible by both num1 and num2 using the modulus operator (%).
6. If d is divisible by both numbers, it stores the value of d in the variable lcm and breaks out of the loop.
7. If d is not divisible by both numbers, it increments d by 1 and continues the loop.
8. Once the loop ends, it prints the value of lcm, which is the LCM of the two input numbers.

## Time Complexity

O(max(n1, n2))

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program calculates the Least Common Multiple (LCM) of two numbers input by the user. It takes two integers as input, finds the maximum of the two, and then increments from the maximum until it finds a number that is divisible by both input numbers. The program outputs the LCM of the two input numbers.
