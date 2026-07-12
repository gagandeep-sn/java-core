# Check Pangram

## Category

Strings

## Difficulty

Easy

## Concepts

* boolean array
* ASCII values

## Code Logic

1. Initialize a boolean array 'seen' of size 26 to keep track of the letters found in the sentence.
2. Check if the length of the sentence is less than 26, in which case it cannot be a pangram.
3. Iterate through each character in the sentence, convert it to lowercase, and calculate its index in the 'seen' array using the ASCII value of 'a'.
4. Mark the corresponding index in the 'seen' array as true for each character found.
5. Iterate through the 'seen' array to check if all letters have been found.
6. If any letter is missing (i.e., its index in the 'seen' array is false), output 'not pangram' and exit.
7. If all letters are found, output 'pangram'.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program checks if a given sentence is a pangram, meaning it contains all the letters of the alphabet at least once. It takes a sentence as input, converts it to lowercase, and checks each character against a boolean array representing the alphabet. If all letters are found, it outputs 'pangram', otherwise 'not pangram'.
