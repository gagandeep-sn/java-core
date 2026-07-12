# Reverse Number

## Category

Miscellaneous

## Difficulty

Easy

## Concepts

* Input Output
* Loops

## Code Logic

1. The program starts by importing the Scanner class to read user input and creating a new Scanner object to read from the console.
2. It prompts the user to enter a number and stores the input in the variable 'n'.
3. A do-while loop is used to extract each digit from the end of the number.
4. Inside the loop, the remainder of 'n' divided by 10 (n%10) is calculated to get the last digit of the number, which is stored in the variable 'count'.
5. The last digit is printed to the console.
6. The number 'n' is then divided by 10 (n=n/10) to remove the last digit.
7. Steps 4-6 repeat until 'n' becomes 0, at which point the loop ends.
8. Finally, the Scanner object is closed to prevent resource leaks.

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This Java program takes an integer input from the user and prints its digits in reverse order. It uses a do-while loop to extract each digit from the end of the number and print it. The program continues until all digits have been printed. The output is the reversed number.
