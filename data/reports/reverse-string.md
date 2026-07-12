# Reverse String

## Category

Strings

## Difficulty

Easy

## Concepts

* String manipulation
* Loops

## Code Logic

1. The program prompts the user to enter a string and stores it in the variable 'str'.
2. It initializes an integer 'i' to the last index of the string 'str'.
3. It initializes an empty string 'f' to store the reversed string.
4. The program uses a for loop to iterate over the characters in the string 'str' from the end to the beginning.
5. Inside the loop, it extracts the character at the current index 'j' using 'str.charAt(j)' and appends it to the string 'f'.
6. The loop continues until all characters in the string have been processed.
7. Finally, the program prints the reversed string 'f' to the console.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This program takes a string input from the user and reverses it. It uses a for loop to iterate over the characters in the string from the end to the beginning, appending each character to a new string. The reversed string is then printed to the console. The program demonstrates basic string manipulation and loop control.
