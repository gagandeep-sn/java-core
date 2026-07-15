# Plus One

## Category

Arrays

## Difficulty

Medium

## Concepts

* Arrays
* Loops
* Conditional Statements

## Code Logic

1. Start from the rightmost digit (least significant) of the input array.
2. If the current digit is less than 9, increment it and return the array, because we've successfully added 1 to the number.
3. If the current digit is 9, set it to 0 and move to the next iteration, because we need to carry the 1 to the next digit.
4. If the loop finishes without finding a digit less than 9, it means all digits were 9, so we create a new array that is 1 element larger.
5. Set the first element of the new array to 1, and the rest will default to 0 in Java automatically.
6. Return the new array, which now represents the number incremented by 1.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Interview Relevance

Medium

## Topic Mastery

Intermediate

## Explanation

This program takes an array of digits representing a number and adds 1 to it. It processes the digits from right to left, incrementing each digit until it reaches 9, at which point it sets the digit to 0 and carries the 1 to the next iteration. If all digits were 9, it creates a new array with an additional element.
