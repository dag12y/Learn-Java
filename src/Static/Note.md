
# Java `static` Keyword

## 🔹 What is `static` in Java?

The `static` keyword in Java is used to indicate that a particular **field, method, block, or nested class belongs to the class itself**, rather than to instances of the class.

This means:
- You can access `static` members **without creating an object** of the class.
- Static members are **shared among all instances** of the class.

---

## 🔹 Static Variables (Class Variables)

A static variable is shared across all objects of the class.

### Example:
```java
public class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }
}
```

### Usage:
```java
public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // prints 1
        Counter c2 = new Counter(); // prints 2
    }
}
```

---

## 🔹 Static Methods

- Belong to the class, not objects.
- Can be called without creating an object.
- **Cannot access non-static members** directly.

### Example:
```java
public class MathUtils {
    public static int square(int x) {
        return x * x;
    }
}
```

### Usage:
```java
public class Main {
    public static void main(String[] args) {
        int result = MathUtils.square(5);
        System.out.println(result); // prints 25
    }
}
```

---

## 🔹 Static Blocks

- Used for **static initialization** of a class.
- Executes **only once** when the class is loaded.

### Example:
```java
public class Test {
    static int x;

    static {
        x = 10;
        System.out.println("Static block initialized. x = " + x);
    }

    public static void main(String[] args) {
        System.out.println("Main method.");
    }
}
```

---

## 🔹 Static Classes

- Only **nested classes** can be static (a class inside another class).
- A static nested class can be instantiated **without an object** of the outer class.

### Example:
```java
public class Outer {
    static class Nested {
        void message() {
            System.out.println("Hello from static nested class!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Nested obj = new Outer.Nested();
        obj.message();
    }
}
```

---

## 🔹 Summary

| Feature      | Can be static? | Notes                                          |
|--------------|----------------|------------------------------------------------|
| Variable     | ✅ Yes          | Shared across all instances                    |
| Method       | ✅ Yes          | Cannot access instance variables directly      |
| Block        | ✅ Yes          | Used for static initialization                 |
| Nested Class | ✅ Yes          | Can be instantiated without outer class object |

- Static members belong to the class, not instances.
- Use class name to access static members.
- Common use cases include: utility methods, constants, and counters.

