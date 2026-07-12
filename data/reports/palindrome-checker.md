# Palindrome Checker

## Category

Math

## Difficulty

Easy

## Concepts

* Loops
* Modulus Operator

## Code Logic

1. The program prompts the user to enter a number and stores it in the variable 'num'.
2. The 'palindrom' method is called with the input number 'n'.
3. Inside the 'palindrom' method, a temporary variable 'temp' is initialized with the input number 'n'.
4. Another variable 'newnum' is initialized to 0, which will store the reversed number.
5. A while loop runs until 'temp' becomes 0, in each iteration, the last digit of 'temp' is extracted using the modulus operator ('temp % 10').
6. The extracted digit is appended to 'newnum' by multiplying 'newnum' by 10 and adding the digit.
7. The last digit of 'temp' is removed by performing integer division by 10 ('temp / 10').
8. After the loop, the original number 'n' is compared with the reversed number 'newnum'.
9. If they are equal, the number is a palindrome, and the program outputs 'Num is Palindrom.'; otherwise, it outputs 'not Palindrom.'

## Time Complexity

O(log n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This Java program checks if a given number is a palindrome or not. It takes an integer input from the user, reverses the number, and compares it with the original number. If they are the same, the number is a palindrome. The program outputs 'Num is Palindrom.' if the number is a palindrome, otherwise it outputs 'not Palindrom.'
