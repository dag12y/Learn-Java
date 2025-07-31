
# Java Operators

## Introduction
Operators in Java are special symbols or keywords used to perform operations on variables and values. Java supports a rich set of operators to manipulate data types.

---

## 1. **Arithmetic Operators**
Used for basic mathematical operations.

| Operator | Description       | Example     |
|----------|-------------------|-------------|
| `+`      | Addition           | `a + b`     |
| `-`      | Subtraction        | `a - b`     |
| `*`      | Multiplication     | `a * b`     |
| `/`      | Division           | `a / b`     |
| `%`      | Modulus (remainder)| `a % b`     |

---

## 2. **Assignment Operators**
Used to assign values to variables.

| Operator | Description            | Example     |
|----------|------------------------|-------------|
| `=`      | Assign                 | `a = 10`    |
| `+=`     | Add and assign         | `a += 5`    |
| `-=`     | Subtract and assign    | `a -= 5`    |
| `*=`     | Multiply and assign    | `a *= 2`    |
| `/=`     | Divide and assign      | `a /= 2`    |
| `%=`     | Modulus and assign     | `a %= 3`    |

---

## 3. **Relational (Comparison) Operators**
Used to compare two values.

| Operator | Description              | Example     |
|----------|--------------------------|-------------|
| `==`     | Equal to                 | `a == b`    |
| `!=`     | Not equal to             | `a != b`    |
| `>`      | Greater than             | `a > b`     |
| `<`      | Less than                | `a < b`     |
| `>=`     | Greater than or equal to| `a >= b`    |
| `<=`     | Less than or equal to   | `a <= b`    |

---
## 4. **Logical Operators**
Used to perform logical operations.

| Operator | Description   | Example            |
|----------|---------------|--------------------|
| `&&`     | Logical AND   | `a > b && b > c`   |
| `\|\|`   | Logical OR    | `a > b \|\| b > c` |
| `!`      | Logical NOT   | `!true`            |
---

## 5. **Unary Operators**
Used with only one operand.

| Operator | Description          | Example        |
|----------|----------------------|----------------|
| `+`      | Unary plus           | `+a`           |
| `\-`     | Unary minus          | `\-a`          |
| `++`     | Increment             | `a++` or `++a` |
| `--`     | Decrement             | `a--` or `--a` |
| `!`      | Logical NOT           | `!a`           |

---

## 6. **Bitwise Operators**
Operate on individual bits of integers.

| Operator | Description    | Example  |
|----------|----------------|----------|
| `&`      | Bitwise AND    | `a & b`  |
| `|`      | Bitwise OR     | `a | b`  |
| `^`      | Bitwise XOR    | `a ^ b`  |
| `~`      | Bitwise Complement | `~a` |
| `<<`     | Left shift     | `a << 2` |
| `>>`     | Right shift    | `a >> 2` |

---

## 7. **Ternary Operator**
A shortcut for `if-else`.

```java
int result = (condition) ? value_if_true : value_if_false;
```

Example:
```java
int max = (a > b) ? a : b;
```

---

## 8. **Instanceof Operator**
Checks if an object is an instance of a class.

```java
if (obj instanceof String) {
    // do something
}
```

---

## Summary
Java provides various operators to perform operations efficiently. Understanding how and when to use them is essential for writing clean and effective Java code.

---
