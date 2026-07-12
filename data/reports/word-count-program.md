# Word Count Program

## Category

Collections

## Difficulty

Easy

## Concepts

* HashMap
* String Splitting

## Code Logic

1. The program starts by defining a string variable 'text' with the input text 'hello world hello java world'.
2. A HashMap 'map' is created to store the word counts, where each key is a word and its corresponding value is the count.
3. The program splits the input text into individual words using the 'split' method with a space as the delimiter.
4. A for-each loop is used to iterate over each word in the split text.
5. Inside the loop, the program uses the 'put' method to add the word to the HashMap, or update its count if it already exists. The 'getOrDefault' method is used to get the current count of the word, defaulting to 0 if it's not in the map.
6. After the loop, the program prints out the HashMap with the word counts using 'System.out.println'.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Interview Relevance

Medium

## Topic Mastery

Beginner

## Explanation

This Java program takes a string of text as input, splits it into individual words, and counts the frequency of each word. It uses a HashMap to store the word counts, where each key is a word and its corresponding value is the count. The program then prints out the word counts. The input text is 'hello world hello java world', and the output will be a HashMap with the word counts.
