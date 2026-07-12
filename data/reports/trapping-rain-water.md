# Trapping Rain Water

## Category

Arrays

## Difficulty

Medium

## Concepts

* Two Pointers
* Greedy Algorithm

## Code Logic

1. Initialize variables to keep track of the total trapped rainwater, the maximum height of the left and right bars, and the current positions of the left and right pointers.
2. Check if the length of the input array is less than or equal to 2, in which case no rainwater can be trapped, so return 0.
3. Initialize the left and right pointers to the start and end of the array, respectively.
4. Enter a loop that continues until the left pointer is no longer less than the right pointer.
5. Inside the loop, compare the heights of the bars at the current left and right positions.
6. If the height of the left bar is less than the height of the right bar, check if the height of the left bar is greater than or equal to the maximum height of the left bars seen so far.
7. If it is, update the maximum height of the left bars and move the left pointer to the right.
8. If it's not, calculate the trapped rainwater at the current position by subtracting the height of the left bar from the maximum height of the left bars, and add it to the total trapped rainwater.
9. If the height of the right bar is less than or equal to the height of the left bar, perform similar steps for the right bar.
10. After the loop ends, return the total trapped rainwater.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Interview Relevance

High

## Topic Mastery

Intermediate

## Explanation

This program calculates the total amount of rainwater that can be trapped between bars of different heights. It takes an array of heights as input, processes it using a two-pointer technique, and outputs the total trapped rainwater. The program assumes that the input array represents the heights of bars in a histogram, and the trapped rainwater is the area between the bars that can hold water.
