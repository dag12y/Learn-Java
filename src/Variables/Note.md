---
title: Java Variables
---

In Java, variables are containers for storing data values. Each variable
must be declared with a data type, which determines what kind of values
it can hold.

# 1. Declaring Variables

Syntax: type name = value;

Examples:

int age = 20;\
String name = \"Dagm\";\
double price = 99.99;

You can also declare variables without initializing them:

int x;\
x = 10;

# 2. Variable Types

Java supports two broad types of variables:

## a) Primitive Types

These hold actual values and are predefined in Java:

| Type      | Size (bits) | Example             |
| --------- | ----------- | ------------------- |
| `int`     | 32          | `int x = 10;`       |
| `double`  | 64          | `double d = 5.5;`   |
| `char`    | 16          | `char c = 'A';`     |
| `boolean` | 1           | `boolean b = true;` |
| `byte`    | 8           | `byte b = 127;`     |
| `short`   | 16          | `short s = 1000;`   |
| `long`    | 64          | `long l = 100000L;` |
| `float`   | 32          | `float f = 10.5f;`  |


## b) Reference Types

These refer to objects, not actual data:

String str = \"Hello\";\
int\[\] numbers = {1, 2, 3};

# 3. Variable Naming Rules

\- Must start with a letter, \`\_\`, or \`\$\`\
- Cannot use Java keywords (class, int, etc.)\
- Case-sensitive (score and Score are different)

# 4. Final Variables (Constants)

Use \`final\` to make a variable constant:

final int MAX_USERS = 100;

# 5. Scope of Variables

\- Local: Declared inside a method, only accessible within it.\
- Instance: Declared inside a class but outside methods (each object
  gets its own copy).\
- Static (Class): Shared across all instances using \`static\`.

Example:

public class Example {\
int instanceVar = 5;\
static int classVar = 10;\
\
void method() {\
int localVar = 20;\
}\
}

# 6. Type Conversion

## Implicit (Widening)

int x = 10;\
double y = x; // int to double (safe)

## Explicit (Narrowing)

double a = 9.78;\
int b = (int) a; // must cast explicitly

# Summary

\- Variables store data in memory\
- Types matter for memory and behavior\
- Java distinguishes between primitive and reference types\
- Use \`final\` for constants\
- Understand scope for clean code
