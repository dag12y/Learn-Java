# Abstract
In Java, the concepts of abstract and concrete classes are fundamental to object-oriented programming. Here’s a detailed
note on both:

## Abstract Classes

1. **Definition**: An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed. It may
   contain abstract methods (methods without a body) as well as concrete methods (methods with a body).

2. **Purpose**: Abstract classes are used to provide a base for other classes to extend. They allow you to define methods
   that must be implemented by derived classes while also providing some shared functionality.

3. **Syntax**:
   - Declare an abstract class using the abstract keyword.
   - Abstract methods are declared without a body and must be implemented by subclasses.
````Java
   abstract class Animal {
   abstract void makeSound(); // Abstract method

       void eat() { // Concrete method
           System.out.println("This animal eats food.");
       }
   }
   ````


4. **Key Points**:
   - An abstract class can have constructors, fields, and concrete methods.
   - You cannot create an instance of an abstract class directly.
   - A class that extends an abstract class must implement all its abstract methods unless it is also declared abstract.

5. **Example**:
````Java
class Dog extends Animal {
   @Override
   void makeSound() {
      System.out.println("Bark");
      }
 }

public class Main {
   public static void main(String[] args) {
       Animal myDog = new Dog();
       myDog.makeSound(); // Outputs: Bark
       myDog.eat(); // Outputs: This animal eats food.
   }
}
   ````

## Concrete Classes

1. **Definition**: A concrete class is a class that can be instantiated, meaning you can create objects from it. It contains
   implementations for all of its methods.

2. **Purpose**: Concrete classes are used to create objects in Java. They represent real-world entities and provide complete
   functionality.

3. **Syntax**:
   – A concrete class does not use the abstract keyword and provides implementations for all its methods.
````java
   class Cat extends Animal {
      @Override
      void makeSound() {
         System.out.println("Meow");
      }
   }
````

4. **Key Points**:
   - Concrete classes can extend abstract classes or other concrete classes.
   - They can also implement interfaces.
   - You can create instances of concrete classes.

5. **Example**:
   ````java
   public class Main { 
      public static void main(String[] args) {
         Animal myCat = new Cat();
         myCat.makeSound(); // Outputs: Meow
         myCat.eat(); // Outputs: This animal eats food.
      }
   }
   ````

## Summary

### Abstract Classes:
- Cannot be instantiated.
- Can have both abstract and concrete methods.
- Serve as a blueprint for subclasses.

### Concrete Classes:
- Can be instantiated.
- Must provide implementations for all inherited abstract methods.
- Represent specific implementations of an abstract class or interface.

### Use Cases

- Use abstract classes when you want to define a common base with shared behavior but want to leave some methods for
subclasses to implement.
- Use concrete classes when you need to create specific objects that have full functionality.

