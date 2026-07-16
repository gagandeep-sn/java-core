# Flipping an Image

## Category

Arrays

## Difficulty

Easy

## Concepts

* Arrays
* Pattern

## Code Logic

1. We create a 2D array called image to represent the image.
2. We iterate through each row of the image.
3. For each row, we initialize two pointers, left and right, to the start and end of the row.
4. We then enter a while loop that continues until the left pointer meets the right pointer.
5. Inside the loop, we swap the values at the left and right pointers.
6. We then invert the colors of the swapped values by subtracting them from 1.
7. We increment the left pointer and decrement the right pointer to move towards the center of the row.
8. After the loop finishes, we print the modified image.
9. The final output is the flipped and inverted image, where black and white colors are swapped and inverted.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

Medium

## Topic Mastery

Intermediate

## Explanation

This program takes an image represented as a 2D array and flips it horizontally. It then inverts the colors of the flipped image. The input is a 2D array of 0s and 1s, where 0 represents black and 1 represents white. The output is the flipped and inverted image.
