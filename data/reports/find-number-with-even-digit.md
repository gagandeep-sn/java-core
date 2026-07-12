# Find Number With Even Digit

## Category

Arrays

## Difficulty

Easy

## Concepts

* Loops
* Conditional Statements

## Code Logic

1. Initialize an array of integers and variables to store the count of even digits and the total count of integers with even digits.
2. Iterate over each integer in the array.
3. For each integer, initialize a temporary variable to store the integer and a count variable to store the number of digits.
4. If the integer is 0, increment the count by 1.
5. Otherwise, repeatedly divide the integer by 10 and increment the count until the integer becomes 0.
6. Check if the count is even by using the modulus operator.
7. If the count is even, increment the total count of integers with even digits.
8. After iterating over all integers, print the total count of integers with even digits.

## Time Complexity

O(n*m)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This Java program takes an array of integers as input, counts the number of digits in each integer, and checks if the count is even. It then prints the total count of integers with even digits. The program processes each integer by repeatedly dividing it by 10 and counting the number of divisions until the integer becomes 0.
