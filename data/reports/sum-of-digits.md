# Sum of Digits

## Category

Math

## Difficulty

Easy

## Concepts

* Modulus Operator
* Division Operator

## Code Logic

1. The program starts by asking the user to enter a number, which is stored in the variable 'num'.
2. The variable 'sum' is initialized to 0 to store the sum of the digits.
3. A while loop is used to extract each digit from the number, which continues until 'num' becomes 0.
4. Inside the loop, the modulus operator (%) is used to get the last digit of the number, which is stored in the variable 'c'.
5. The digit 'c' is added to the 'sum'.
6. The number 'num' is then divided by 10 to remove the last digit.
7. Steps 4-6 are repeated until 'num' becomes 0.
8. Finally, the program prints the sum of the digits.

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This Java program calculates the sum of digits of a given integer. The user is prompted to enter a number, and the program processes it by extracting each digit and adding it to the sum. The final output is the sum of the digits. For example, if the input is 123, the output will be 6 (1+2+3).
