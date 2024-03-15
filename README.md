# Java Operators

This repository provides an overview of the operators available in the Java programming language. Understanding operators is crucial for writing Java programs efficiently and effectively.

## Table of Contents

1. [Introduction](#introduction)
2. [Arithmetic Operators](#arithmetic-operators)
3. [Assignment Operators](#assignment-operators)
4. [Comparison Operators](#comparison-operators)
5. [Logical Operators](#logical-operators)
6. [Bitwise Operators](#bitwise-operators)
7. [Conditional (Ternary) Operator](#conditional-ternary-operator)
8. [Instanceof Operator](#instanceof-operator)

## Introduction

Operators in Java are symbols that perform operations on variables and values. Java supports various types of operators, including arithmetic, assignment, comparison, logical, bitwise, conditional, and instanceof operators.

## Arithmetic Operators

Arithmetic operators perform mathematical operations on operands. They include addition `(+)`, subtraction `-`, multiplication `*`, division `/`, and modulus `%`.

Example:

```java
int a = 10;
int b = 5;
int sum = a + b; // sum = 15
int difference = a - b; // difference = 5
int product = a * b; // product = 50
int quotient = a / b; // quotient = 2
int remainder = a % b; // remainder = 0
```
## Assignment Operators
Assignment operators are used to assign values to variables. They include simple assignment =, as well as compound assignment operators like +=, -=, *=, /=, and %=.

Example:

```java
int x = 10;
x += 5; // equivalent to x = x + 5
System.out.println(x); // Output: 15
```

## Comparison Operators

Comparison operators are used to compare two values. They include equal to ==, not equal to !=, greater than >, less than <, greater than or equal to >=, and less than or equal to <=.

Example:

```java
int a = 10;
int b = 5;
boolean isEqual = (a == b); // false
boolean isGreater = (a > b); // true
```

## Logical Operators
Logical operators perform logical AND &&, OR ||, and NOT ! operations.

Example:

```java
boolean x = true;
boolean y = false;
boolean result = (x && y); // false
result = (x || y); // true
result = !x; // false
```

## Bitwise Operators
Bitwise operators perform bit-level manipulation of operands. They include bitwise AND &, bitwise OR |, bitwise XOR ^, bitwise complement ~, left shift <<, signed right shift >>, and unsigned right shift >>>.

Example:

```java
int a = 5; // 101
int b = 3; // 011
int result = a & b; // 001 (AND operation)
result = a | b; // 111 (OR operation)
result = a ^ b; // 110 (XOR operation)
result = ~a; // 11111111111111111111111111111010 (complement)
result = a << 1; // 1010 (left shift by 1)
result = a >> 1; // 10 (signed right shift by 1)
result = a >>> 1; // 10 (unsigned right shift by 1)
```

## Conditional (Ternary) Operator
The conditional operator ?: is a ternary operator that evaluates a boolean expression and returns one of two values based on the result of the evaluation.

Example:

```java
int a = 10;
int b = 5;
int max = (a > b) ? a : b; // max = 10
```

## Instanceof Operator
The instanceof operator is used to test whether an object is an instance of a particular class or interface.

Example:

```java
String str = "Hello";
boolean isString = str instanceof String; // true
```
