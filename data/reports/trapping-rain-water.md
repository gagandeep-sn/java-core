# Trapping Rain Water

## Category

Arrays

## Difficulty

Medium

## Concepts

* Two Pointers

## Code Logic

1. Initialize variables to store the total trapped rainwater, the maximum height of the left and right bars, and two pointers (left and right) to traverse the array.
2. Check if the length of the input array is less than or equal to 2, in which case no rainwater can be trapped, so return 0.
3. Enter a while loop that continues until the left pointer is no longer less than the right pointer.
4. Inside the loop, compare the heights of the bars at the left and right pointers.
5. If the height of the left bar is less than the height of the right bar, check if the height of the left bar is greater than or equal to the maximum height of the left bars seen so far.
6. If it is, update the maximum height of the left bars; otherwise, calculate the trapped rainwater by subtracting the height of the left bar from the maximum height of the left bars and add it to the total trapped rainwater.
7. Move the left pointer to the right.
8. If the height of the right bar is less than or equal to the height of the left bar, perform similar steps as in steps 5-7 but for the right bar and move the right pointer to the left.
9. Once the loop ends, return the total trapped rainwater.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Intermediate

## Explanation

This program calculates the total amount of rainwater that can be trapped between bars of different heights. It takes an array of heights as input, processes it using two pointers, and outputs the total trapped rainwater. The program assumes that the input array represents the heights of bars in a histogram.
