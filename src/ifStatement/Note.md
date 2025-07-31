
# Java Control Flow

## Introduction
Control flow statements in Java manage the order of execution of a program's statements.
The `if` statement is a fundamental control flow construct that allows a program to
make decisions and execute specific blocks of code based on a condition.


## 1. **Basic `if` Statement**
The simplest form evaluates a single boolean expression. If the expression is `true`, the code block inside the `if` statement is executed.

**Syntax:**
```java
if (condition) {
    // Code to be executed if the condition is true
}
````

**Example:**

```java
int score = 75;
if (score >= 60) {
    System.out.println("You passed the exam!");
}
```

-----

## 2\. **`if-else` Statement**

This statement executes one block of code if the condition is `true` and a different block if the condition is `false`.

**Syntax:**

```java
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}
```

**Example:**

```java
int temperature = 25;
if (temperature > 30) {
    System.out.println("It's a hot day!");
} else {
    System.out.println("It's a pleasant day.");
}
```

-----

## 3\. **`if-else if-else` Statement (Ladder)**

This structure is used for handling multiple conditions sequentially. It executes the first block whose condition is `true`. If no conditions are met, the final `else` block is executed.

**Syntax:**

```java
if (condition1) {
    // Code if condition1 is true
} else if (condition2) {
    // Code if condition1 is false and condition2 is true
} else {
    // Code if none of the above are true
}
```

**Example:**

```java
int grade = 85;
if (grade >= 90) {
    System.out.println("Grade: A");
} else if (grade >= 80) {
    System.out.println("Grade: B");
} else if (grade >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

-----

## 4\. **Nested `if` Statements**

An `if` statement can be placed inside another `if` or `else` block. This is useful for checking multiple layers of conditions.

**Syntax:**

```java
if (outerCondition) {
    if (innerCondition) {
        // Code for both outer and inner conditions true
    }
}
```

**Example:**

```java
boolean isLoggedIn = true;
String userRole = "admin";

if (isLoggedIn) {
    System.out.println("User is logged in.");
    if (userRole.equals("admin")) {
        System.out.println("Welcome, Administrator!");
    }
}
```

-----

## Summary

The `if` statement and its variations (`if-else`, `if-else if-else`) are essential for decision-making in Java. Using them with logical operators (`&&`, `||`, `!`) allows for complex and powerful condition checking, enabling your programs to respond dynamically to different inputs and states.

```
```