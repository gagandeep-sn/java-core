# Find Largest Number

## Category

Miscellaneous

## Difficulty

Easy

## Concepts

* Input Output
* Loops

## Code Logic

1. We import the Scanner class to read input from the user.
2. We create a Scanner object to read from the standard input (keyboard).
3. We initialize a variable 'max' to 0 to keep track of the largest number entered so far.
4. We enter a while loop that runs indefinitely until we break out of it.
5. Inside the loop, we prompt the user to enter a number and store it in the variable 'n'.
6. We check if the entered number 'n' is greater than the current 'max'. If it is, we update 'max' to be 'n'.
7. We check if the entered number 'n' is 0. If it is, we break out of the loop.
8. Once we break out of the loop, we print out the largest number that was entered, which is stored in 'max'.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program takes a series of numbers as input from the user until a 0 is entered. It keeps track of the largest number entered so far. Once a 0 is entered, the program stops taking input and prints out the largest number that was entered. The program uses a simple loop to continuously take input from the user.
