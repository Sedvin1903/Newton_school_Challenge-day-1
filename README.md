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

### *Multiple of 3*

**Problem Statement :**

Given is a positive integer N, where none of the digits is 0. Let k be the number of digits in N. We want to make a multiple of 3 by erasing at least 0 and at most k−1 digits from N and concatenating the remaining digits without changing the order. 
Determine whether it is possible to make a multiple of 3 in this way. If it is possible, find the minimum number of digits that must be erased to make such a number.

**Input :**
The input consists of a single integer N.

**Constraints :**
1 ≤ N ≤ 10^18
None of the digits in N is 0.,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
If it is impossible to make a multiple of 3, print -1; otherwise, print the minimum number of digits that must be erased to make such a number.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 13

### *Maximum Sum Cards*

**Problem Statement :**

We have A cards, each of which has an integer 1 written on it. Similarly, we also have B cards with 0s and C cards with −1s.
We will pick up K among these cards. What is the maximum possible sum of the numbers written on the cards chosen?

**Input :**
The input consists of 4 space separated integers as follows :
A B C K

**Constraints :**
All values in input are integers.
0≤A, B, C
1 ≤ K ≤ A+B+C ≤ 2×10^9 ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the maximum possible sum of the numbers written on the cards chosen.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 14

### *Number Games*

**Problem Statement :**

You are given an integer N. Do the following operation K times on it and print the resulting integer.
If N is a multiple of 200, divide it by 200. Otherwise, see N as a string and append 200 to the end of it.
For example, 7 would become 7200, and 1234 would become 1234200.

**Input :**
The input consists of two space separated integers as follows:
N K

**Constraints :**
All values in input are integers.
1≤ N ≤10^5
1≤ K ≤20,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the answer as an integer.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 16

### *Maximise Product*

**Problem Statement :**

Given are integers a, b, c, and d. If x and y are integers and a≤x≤b and c≤y≤d hold, what is the maximum possible value of x*y?

**Input :**
The input consists of four space-separated integers.
a b c d

**Constraints :**
−10^9≤a≤b≤10^9
−10^9≤c≤d≤10^9
All values in the input are integers.,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the maximum product.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 17

### *Alexa and Digits*

**Problem Statement :**

Having learned the multiplication table, Alexa can multiply two integers between 1 and 9 (inclusive) together. Given an integer N, determine whether N can be represented as the product of two integers between 1 and 9. If it can, print Yes; if it cannot, print No.


**Input :**
The input consists of a single integer.
N

**Constraints :**
1≤N≤100 ,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
If N can be represented as the product of two integers between 1 and 9 (inclusive), print Yes; if it cannot, print No.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 18

### *Alexa and Sockets*

**Problem Statement :**

Alexa's house has only one socket.
Alexa wants to extend it with some number of power strips, each with A sockets, into B or more empty sockets. One power strip with A sockets can extend one empty socket into A empty sockets.
Find the minimum number of power strips required.

**Input :**
The input consists of two space separated integers.
A B


**Constraints :**
All values in input are integers.
2≤A≤20
1≤B≤20,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the minimum number of power strips required.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 19

### *Sum Modulo*

**Problem Statement :**

Let S(n) denote the sum of the digits in the decimal notation of n. For example, S(101)=1+0+1=2.
Given an integer N, determine if S(N) divides N.

**Input :**
The input consists of a single integer.
N

**Constraints :**
1 ≤ N ≤ 10^9,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
If S(N) divides N, print Yes; if it does not, print No.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 20

### *Maximum operations*

**Problem Statement :**

There are N positive integers written on a blackboard: A1,. , AN.
Edward can perform the following operation when all integers on the blackboard are even:

Replace each integer X on the blackboard by X divided by 2.
Find the maximum possible number of operations that Edward can perform.

**Input :**
The input consists of an integer N and N space separated integers.
N
A1 A2. . AN

**Constraints :**
1≤N≤200
1≤Ai≤10^9,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the maximum possible number of operations that Edward can perform.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 21

### *Minimise Time Travel*

**Problem Statement :**

There are three airports A, B, and C, and flights between each pair of airports in both directions.
A one-way flight between airports A and B takes P hours, a one-way flight between airports B and C takes Q hours, and a one-way flight between airports C and A takes R hours. Consider a route where we start at one of the airports, fly to another, and then fly to the other.
What is the minimum possible sum of the flight times?

**Input :**
The input consists of three space separated integers.
P Q R

**Constraints :**
1≤P, Q, R≤100
All values in input are integers,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the minimum possible sum of the flight times.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 22

### *Minimise Time Travel*

**Problem Statement :**

There are three airports A, B, and C, and flights between each pair of airports in both directions.
A one-way flight between airports A and B takes P hours, a one-way flight between airports B and C takes Q hours, and a one-way flight between airports C and A takes R hours. Consider a route where we start at one of the airports, fly to another, and then fly to the other.
What is the minimum possible sum of the flight times?

**Input :**
The input consists of three space separated integers.
P Q R

**Constraints :**
1≤P, Q, R≤100
All values in input are integers,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the minimum possible sum of the flight times.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 23

### *Minimise Time Travel*

**Problem Statement :**

There are three airports A, B, and C, and flights between each pair of airports in both directions.
A one-way flight between airports A and B takes P hours, a one-way flight between airports B and C takes Q hours, and a one-way flight between airports C and A takes R hours. Consider a route where we start at one of the airports, fly to another, and then fly to the other.
What is the minimum possible sum of the flight times?

**Input :**
The input consists of three space separated integers.
P Q R

**Constraints :**
1≤P, Q, R≤100
All values in input are integers,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the minimum possible sum of the flight times.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 24

### *Minimise Time Travel*

**Problem Statement :**

There are three airports A, B, and C, and flights between each pair of airports in both directions.
A one-way flight between airports A and B takes P hours, a one-way flight between airports B and C takes Q hours, and a one-way flight between airports C and A takes R hours. Consider a route where we start at one of the airports, fly to another, and then fly to the other.
What is the minimum possible sum of the flight times?

**Input :**
The input consists of three space separated integers.
P Q R

**Constraints :**
1≤P, Q, R≤100
All values in input are integers,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the minimum possible sum of the flight times.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

## DAY - 25

### *Play With Zeros*

**Problem Statement :**

You are given an integer N between 0 and 9999 (inclusive).
Print it as a four-digit string after appending the necessary number of leading zeros.

**Input :**
The input consists of a single integer.
N

**Constraints :**
0≤N≤9999
N is an integer,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the four digit string after appending to it the necessary number of leading zeros.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
## DAY - 26

### *Multiple Search*

**Problem Statement :**

Print a number between A and B (inclusive) that is a multiple of C. If such numbers exist, print the minimum among them. If there is no such number, print -1.the necessary number of leading zeros.

**Input :**
The input contains three space separated integers.
A B C

**Constraints :**
0≤X≤1000
All values in input are integers.,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the answer.
If there is no number with the desired property, print -1.

------------------------------------------------------
## DAY - 27

### *Card Games*

**Problem Statement :**

Print a number between A and B (inclusive) that is a multiple of C. If such numbers exist, print the minimum among them. If there is no such number, print -1.the necessary number of leading zeros.

**Input :**
The input contains three space separated integers.
A B C

**Constraints :**
0≤X≤1000
All values in input are integers.,
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the answer.
If there is no number with the desired property, print -1.

------------------------------------------------------

## DAY - 28

### *Contest Time*

**Problem Statement :**

Newton School Coding Contest usually starts at 21:00 IST and lasts for 100 minutes.
You are given an integer K between 0 and 100 (inclusive). Print the time K minutes after 21:00 in the HH:MM format, where HH denotes the hour on the 24- hour clock and MM denotes the minute. If the hour or the minute has just one digit, append a 0 to the beginning to represent it as a 2- digit integer.

**Input :**
The input consists of a single integer.
K

**Constraints :**
K is an integer between 0 and 100 (inclusive),
Time Limit: 2 sec ,
Memory Limit: 128000 kB

**Output:**
Print the time K minutes after 21:00 in the format specified in the 

-------------------------------------------------------------------------------------------------------------


