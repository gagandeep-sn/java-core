# Factor of a Number

## Category

Math

## Difficulty

Easy

## Concepts

* Loops
* Conditional Statements

## Code Logic

1. The program first prompts the user to enter a number and stores it in the variable 'n'.
2. It initializes two counters, 'c' and 'z', to 1. 'c' is used to check each number up to 'n', and 'z' is used to keep track of the factor number.
3. The program then enters a while loop that runs as long as 'c' is less than or equal to 'n'.
4. Inside the loop, it checks if 'n' is divisible by 'c' by using the modulus operator (%). If 'n' is divisible by 'c', it prints 'c' as a factor and increments 'z'.
5. Regardless of whether 'c' is a factor or not, the program increments 'c' by 1 to check the next number.
6. The loop continues until 'c' is greater than 'n', at which point the program has checked all numbers up to 'n' and printed all its factors.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program takes an integer input from the user and prints all its factors. It checks each number from 1 to the input number to see if it divides the input number evenly. If it does, it prints the number as a factor. The program outputs all the factors of the input number.
