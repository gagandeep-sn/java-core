# Grade Checker

## Category

Miscellaneous

## Difficulty

Easy

## Concepts

* Conditional Statements
* Input/Output

## Code Logic

1. The program prompts the user to enter their marks out of 100.
2. The user's input is read using a Scanner object and stored in the 'marks' variable.
3. The 'grade' method is called with the 'marks' variable as an argument.
4. Inside the 'grade' method, a series of if-else statements check the value of 'marks' and print out the corresponding grade.
5. The if-else statements check the 'marks' value in descending order, so the first condition that is true will determine the grade.
6. If none of the conditions are true, the program prints 'Fail'.

## Time Complexity

O(1)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This Java program takes an integer input from the user representing marks out of 100, and then prints out the corresponding grade based on the marks. The program uses if-else statements to determine the grade. The grades are assigned based on the following criteria: AA (91-100), AB (81-90), BB (71-80), BC (61-70), CD (51-60), DD (41-50), and Fail (below 40).
