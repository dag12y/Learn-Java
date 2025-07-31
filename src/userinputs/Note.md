
# User Input and Working with It in Java

## Introduction
In Java, programs often need to get input from users to make decisions, perform calculations, or control program flow. Java provides several ways to handle user input, but the most common approach is using the `Scanner` class from the `java.util` package.

---

## 1. Importing Scanner Class
To use the `Scanner` class, you must import it:

```java
import java.util.Scanner;
```

---

## 2. Creating a Scanner Object
Create a `Scanner` object to read input from the standard input stream (keyboard):

```java
Scanner scanner = new Scanner(System.in);
```

---

## 3. Reading Different Types of Input

- **Reading a String:**

```java
String name = scanner.nextLine();  // Reads a whole line including spaces
```

- **Reading a Word (token):**

```java
String word = scanner.next();  // Reads a single word up to space
```

- **Reading an integer:**

```java
int age = scanner.nextInt();
```

- **Reading a double:**

```java
double price = scanner.nextDouble();
```

- **Reading a boolean:**

```java
boolean isJavaFun = scanner.nextBoolean();
```

---

## 4. Example: Simple User Input Program

```java
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for user age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();  // Close the scanner to free resources
    }
}
```

---

## 5. Important Notes

- Always close the `Scanner` object after use with `scanner.close()`.
- Mixing `nextLine()` with other `Scanner` methods like `nextInt()` can cause input issues because `nextInt()` does not consume the newline character. To handle this, add an extra `scanner.nextLine()` after reading numeric input if you plan to read a string next.

Example:

```java
int num = scanner.nextInt();
scanner.nextLine();  // consume the leftover newline
String line = scanner.nextLine();
```

---

## 6. Summary
- Use `Scanner` for user input.
- Use appropriate methods like `nextInt()`, `nextDouble()`, `nextLine()` based on expected input type.
- Always close the scanner.
- Be careful when mixing input methods to avoid input skipping issues.

---
