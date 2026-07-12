# Countdown Program

## Category

Recursion

## Difficulty

Easy

## Concepts

* Recursion
* Base Case

## Code Logic

1. The program starts by calling the count method with the input number 5.
2. Inside the count method, it checks if the input number n is 0. If it is, it prints 'Go!' and returns, ending the recursion.
3. If n is not 0, it prints the current value of n.
4. The method then calls itself with the argument n-1, starting the recursion.
5. Steps 2-4 repeat until n reaches 0, at which point the recursion ends and the method returns.
6. The final output is the countdown from 5 to 1, followed by 'Go!'

## Time Complexity

O(n)

## Space Complexity

O(n)

## Interview Relevance

Low

## Topic Mastery

Beginner

## Explanation

This program takes an integer input and counts down from that number to 1, then prints 'Go!'. The countdown is achieved through recursive function calls. The program demonstrates a basic understanding of recursion and base cases.
