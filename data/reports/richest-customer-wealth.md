# Richest Customer Wealth

## Category

Arrays

## Difficulty

Easy

## Concepts

* Multidimensional Arrays
* Loops

## Code Logic

1. Initialize a 2D array to represent the wealth of different customers in different banks.
2. Initialize a variable 'richestCustomer' to keep track of the maximum wealth found, initially set to 0.
3. Iterate through each row in the 2D array, representing each customer's wealth.
4. For each customer, iterate through their wealth in different banks and calculate the total wealth.
5. If the total wealth of the current customer is greater than the 'richestCustomer', update 'richestCustomer' with the new maximum wealth.
6. After iterating through all customers, print the 'richestCustomer' variable, which represents the total wealth of the richest customer.

## Time Complexity

O(n*m)

## Space Complexity

O(1)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program calculates the wealth of the richest customer from a given 2D array where each row represents a customer's wealth in different banks. It iterates through each customer's wealth, calculates the total, and keeps track of the maximum wealth found. The program outputs the maximum wealth, which represents the richest customer's total wealth.
