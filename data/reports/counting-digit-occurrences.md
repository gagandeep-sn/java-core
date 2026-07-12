# Counting Digit Occurrences

## Category

Miscellaneous

## Difficulty

Easy

## Concepts

* Input Output
* Loops

## Code Logic

1. The program prompts the user to enter a number and stores it in the variable 'num'.
2. It then prompts the user to enter a digit to count and stores it in the variable 'x'.
3. The program initializes a counter variable 'count' to 0.
4. It enters a do-while loop that continues until 'num' becomes 0.
5. Inside the loop, it checks if the last digit of 'num' (obtained by 'num % 10') is equal to 'x'.
6. If they are equal, it increments the 'count' variable.
7. It then removes the last digit from 'num' by performing integer division by 10 ('num = num / 10').
8. The loop repeats steps 5-7 until 'num' becomes 0.
9. Finally, it prints the total count of the digit 'x' in the original number.

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program takes a number and a digit as input from the user, then counts the occurrences of the digit in the number. It processes the input by repeatedly dividing the number by 10 and checking the remainder. The output is the total count of the digit in the number.
