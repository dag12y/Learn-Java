
# Java Objects and Classes

## 🔹 What is a Class?

A **class** is a blueprint or template for creating objects in Java. It defines the structure and behavior (data and methods) that the objects created from the class will have.

### Syntax:
```java
class ClassName {
    // fields (attributes)
    // methods (functions)
}
```

### Example:
```java
public class Car {
    // Fields
    String color;
    int speed;

    // Method
    void drive() {
        System.out.println("The car is driving.");
    }
}
```

---

## 🔹 What is an Object?

An **object** is an instance of a class. It has state (stored in fields) and behavior (defined by methods).

### Creating an Object:
```java
Car myCar = new Car();
```

This creates an object `myCar` of type `Car`.

---

## 🔹 Accessing Object Members

You can use the dot (`.`) operator to access fields and methods.

```java
myCar.color = "Red";
myCar.speed = 100;
myCar.drive();
```

---

## 🔹 Constructors

A **constructor** is a special method used to initialize objects. It has the same name as the class and no return type.

### Example:
```java
public class Car {
    String color;
    int speed;

    // Constructor
    public Car(String c, int s) {
        color = c;
        speed = s;
    }

    void display() {
        System.out.println("Color: " + color + ", Speed: " + speed);
    }
}
```

### Creating object with constructor:
```java
Car myCar = new Car("Blue", 120);
myCar.display();
```

---

## 🔹 this Keyword

The `this` keyword refers to the current object inside a method or constructor.

### Example:
```java
public class Car {
    String color;

    public Car(String color) {
        this.color = color;
    }
}
```

---

## 🔹 Class vs Object Summary

| Concept  | Description                    |
|----------|--------------------------------|
| Class    | Blueprint/template             |
| Object   | Real instance based on a class |
| Field    | Variable inside a class        |
| Method   | Function inside a class        |
| Constructor | Initializes an object          |

---

## 🔹 Example Program

```java
public class Student {
    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.displayInfo();
    }
}
```

---

## 🔹 Key Points

- A class defines the structure; an object is a specific instance.
- Use constructors to initialize objects.
- Use `this` to refer to the current object.
- Object-oriented programming (OOP) is based on classes and objects.
