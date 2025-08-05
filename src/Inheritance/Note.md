
# Java Access Modifiers and Inheritance

## 🔹 Access Modifiers in Java

Access modifiers define the visibility/scope of a class, method, or variable.

| Modifier    | Class | Package | Subclass | World |
|-------------|:-----:|:-------:|:--------:|:-----:|
| `public`    |  ✔️   |   ✔️    |    ✔️    |  ✔️   |
| `protected` |  ✔️   |   ✔️    |    ✔️    |   ❌   |
| (default)   |  ✔️   |   ✔️    |    ❌     |   ❌   |
| `private`   |  ✔️   |    ❌    |    ❌     |   ❌   |

### 1. `public`
- Accessible from anywhere.

### 2. `private`
- Accessible only within the same class.

### 3. `protected`
- Accessible within the same package and subclasses (even in different packages).

### 4. Default (no modifier)
- Accessible only within the same package.

### Example:
```java
public class Example {
    public int a;
    private int b;
    protected int c;
    int d; // default
}
```

---

## 🔹 Inheritance in Java

Inheritance allows one class to acquire properties and behavior (methods) of another class.

### Syntax:
```java
class Subclass extends Superclass {
    // additional fields and methods
}
```

### Example:
```java
public class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

public class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
```

### Using the inherited method:
```java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method
        dog.bark(); // Dog's own method
    }
}
```

---

## 🔹 Types of Inheritance in Java

> Note: Java supports **single**, **multilevel**, and **hierarchical** inheritance. **Multiple inheritance with classes is not supported** (to avoid ambiguity), but it can be achieved using interfaces.

### 1. Single Inheritance
One class inherits from one superclass.

### 2. Multilevel Inheritance
A class inherits from a class which in turn inherits from another class.

### 3. Hierarchical Inheritance
Multiple classes inherit from the same superclass.

### 4. Multiple Inheritance (via Interfaces)
Achieved using interfaces.

```java
interface A {
    void display();
}

interface B {
    void show();
}

class C implements A, B {
    public void display() { System.out.println("A"); }
    public void show() { System.out.println("B"); }
}
```

---

## 🔹 super Keyword

- Refers to the immediate superclass object.
- Used to access superclass methods and constructors.

### Example:
```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        super.sound(); // Call parent method
        System.out.println("Meow");
    }
}
```

---

## 🔹 Summary

- Use **access modifiers** to control access to class members.
- Use **inheritance** to reuse code and establish relationships between classes.
- Java uses **`extends`** for class inheritance and **`implements`** for interface inheritance.
- The **`super`** keyword gives access to superclass members.
