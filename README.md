# Newton_school_Challenge - Ouestion of the day - Solutions [ Jan 29 2023 - PRESENT ] 

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 1

### *Alexa and Strings*

**Problem Statement :**

Alexa loves to play with strings. She is given a string S consisting of lowercase English letters.
If 'a' appears in S, print the last index at which it appears; otherwise, print −1. (The index starts at 1. )

**Input :**
The input contains only one string.
S

**Constraints :**
1 <= |S| <= 100 ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output**
Print the answer.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 2

### *Bob and Exams*

**Problem Statement :**

There was an exam consisting of three problems worth 1, 2, and 4 points.
Alexa, Edward, and Bob took this exam. Alexa scored A points, and Edward scored B points.
Bob solved all of the problems solved by at least one of Alexa and Edward and failed to solve any of the problems solved by, neither of them.
Find Bob's score. It can be proved that Bob's score is uniquely determined under the Constraints of this problem.

**Input :**
The input contains two integers separated by a space
A B

**Constraints :**
0≤A, B≤7 ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output**
Print Bob's score as an integer.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 3

### *Prefix Strings*

**Problem Statement :**

You are given two strings S and T consisting of lowercase English letters. Determine if S is a prefix of T.

**Input :**
The input contains two strings separated by a new line.
S
T

**Constraints :**
S and T are strings of lengths between 1 and 100 (inclusive) consisting of lowercase English letters ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output**
Print "Yes" if S is a prefix of T, "No" otherwise.
Note: that the judge is case-sensitive

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 4

### *Reverse Strings*

**Problem Statement :**

You are given integers L, R, and a string S consisting of lowercase English letters.
Print this string after reversing (the order of) the L-th through R-th characters.


**Input :**
The input line contains L and R separated by space. The next line S
L R
S

**Constraints :**
S consists of lowercase English letters.
1≤ |S| ≤ 10^5 (|S| is the length of S. )
L and R are integers.
1 ≤ L ≤ R ≤ |S| ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output**
Print the specified string.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 5

### *Carry or Not?*

**Problem Statement :**

You are given positive integers A and B.
Let us calculate A+B (in decimal). If it does not involve a carry, print Easy; if it does, print Hard.

**Input :**
The input contains two space separated numbers:
A B

**Constraints :**
A and B are integers.
1 ≤ A, B ≤ 10^18 ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output**
If the calculation does not involve a carry, print Easy; if it does, print Hard.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 6

### *Alexa and Balls*

**Problem Statement :**

There is a container with A cyan balls. Alexa will do the following operation as many times as he likes (possibly zero times):
Add B cyan balls and C red balls into the container.
Alexa's objective is to reach a situation where the number of cyan balls in the container is at most D times the number of red balls in it.

Determine whether the objective is achievable. If it is achievable, find the minimum number of operations needed to achieve it.


**Input :**
The input contains 4 space-separated numbers:
A B C D

All values in the input are integers.

**Constraints :**
1 ≤ A, B, C, D ≤ 105 ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output**
If Alexa's objective is achievable, print the minimum number of operations needed to achieve it. Otherwise, print -1.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 7

### *Chipmunk and Nuts*

**Problem Statement :**

There are N trees. The ith tree bears Ai nuts. Chipmunk will harvest nuts from the trees in the following manner:
From a tree with 10 or fewer nuts, she does not take nuts.
From a tree with more than 10 nuts, she takes all but 10 nuts.
Find the total number of nuts Chipmunk will take from the trees


**Input :**
Input is given from Standard Input in the following format:
N
A1… AN

**Constraints :**
S consists of lowercase English letters.
1 ≤ N ≤ 1000
0 ≤ Ai ≤ 1000
All values in the input are integers. ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output**
Print the answer.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 8

### *Bob and Digits*

**Problem Statement :**

Bob loves to play with numbers. He has an integer N. Find the number of digits that N has in base K.

**Input :**
The input contains two space-separated integers in the following format:
N K

**Constraints :**
All values in the input are integers.
1 ≤ N ≤ 109
2 ≤ K ≤ 10,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output**
Print the number of digits that N has in base K.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 9

### *Shifted String*

**Problem Statement :**

We have a string S consisting of uppercase English letters. Additionally, an integer N will be given.
Shift each character of S by N in alphabetical order (see below), and print the resulting string.

We assume that A follows Z. For example, shifting A by 2 results in C (A → B → C), and shifting Y by 3 results in B (Y → Z → A → B).

**Input :**
The input contains a number and a string separated by a new line.
N
S

**Constraints :**
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output: **

Print the string resulting from shifting each character of S by N in alphabetical order

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 10

### *Cards Shuffle*

**Problem Statement :**
We have 4 cards with an integer 1 written on it, 4 cards with 2, …, 4 cards with N, for a total of 4N cards.
Alexa shuffled these cards, removed one of them, and gave you a pile of the remaining 4N−1 cards. The i- th card (1≤i≤4N−1) of the pile has an integer Ai written on it.

**Input :**
The first line of input contains an integer N.
The second line contains N space separated integers as follows:

N
A1 A2. . AN

**Constraints :**
1≤N≤10^5
1≤Ai≤N(1≤i≤4N−1)
For each k(1≤k≤N), there are at most 4 indices i such that Ai=k.
All values in input are integers ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the answer.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 11

### *String Sequence*

**Problem Statement :**

You are given a sequence of 26 integers P=(P1, P2, …, P26 ) consisting of integers from 1 through 26. It is guaranteed that all elements in P are distinct.

Print a string S of length 26 that satisfies the following condition. For every i (1≤i≤26), the i- th character of S is the lowercase English letter that comes Pi- th in alphabetical order.

**Input :**
The input contains 26 space separated integers as follows:
P1 P2. . P26

**Constraints :**
1≤Pi≤26
All values in input are integers ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the string S

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 12

### *Reverse Strings*

**Problem Statement :**

You are given integers L, R, and a string S consisting of lowercase English letters.
Print this string after reversing (the order of) the L-th through R-th characters.


**Input :**
The input line contains L and R separated by space. The next line S
L R
S

**Constraints :**
S consists of lowercase English letters.
1≤ |S| ≤ 10^5 (|S| is the length of S. )
L and R are integers.
1 ≤ L ≤ R ≤ |S| ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the specified string.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
