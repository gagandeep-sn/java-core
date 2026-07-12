# Depreciation Value Calculator

## Category

Math

## Difficulty

Easy

## Concepts

* Input Output
* Loops

## Code Logic

1. The program prompts the user to enter the initial price, time in years, and depreciation rate.
2. It stores the user input in variables p, t, and d respectively.
3. The program initializes a variable r to store the current value, which is initially set to the initial price p.
4. The program enters a while loop that runs for t years.
5. Inside the loop, it calculates the depreciation amount I by multiplying the current value r with the depreciation rate d and dividing by 100.
6. It then subtracts the depreciation amount I from the current value r and updates the value of r.
7. The loop continues until t years have passed.
8. Finally, the program prints the depreciating value after t years, which is stored in variable r.

## Time Complexity

O(t)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program calculates the depreciating value of an asset over time. It takes the initial price, time in years, and depreciation rate as input. The program then calculates the depreciating value by subtracting the depreciation amount from the current value for each year. The final output is the depreciating value after the given time period.
