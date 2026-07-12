# Electricity Bill Calculator

## Category

Miscellaneous

## Difficulty

Easy

## Concepts

* Conditional Statements
* Input Output

## Code Logic

1. The program prompts the user to enter the number of units consumed and stores it in the variable 'u'.
2. It initializes a variable 'bill' to 0, which will store the total bill.
3. The program checks if the number of units is less than or equal to 100, and if so, sets the rate to 5 and calculates the bill by multiplying the units by the rate.
4. If the number of units is more than 100 but less than or equal to 200, it sets the rate to 7, calculates the bill for the first 100 units at the rate of 5, and adds the bill for the remaining units at the rate of 7.
5. If the number of units is more than 200, it sets the rate to 10, calculates the bill for the first 100 units at the rate of 5, adds the bill for the next 100 units at the rate of 7, and adds the bill for the remaining units at the rate of 10.
6. Finally, the program prints the total bill.

## Time Complexity

O(1)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program calculates the electricity bill based on the number of units consumed. It takes the number of units as input, applies different rates for different ranges of units, and outputs the total bill. The program uses if-else statements to determine the rate and calculate the bill.
