# Java Methods

Methods in Java are blocks of code that perform a specific task. They allow for code reusability and better organization
of code.

## Basic Syntax

The basic syntax of a method in Java is as follows:
```java
accessModifier returnType methodName(parameterType parameterName) {
// method body
return value; // optional, based on return type
}
```

### Components of a Method

1. **Access Modifier**: Defines the visibility of the method. Common access modifiers include:
    - public: Accessible from any other class.
    - private: Accessible only within the class it is declared.
    - protected: Accessible within the same package and subclasses.

2. **Return Type**: The data type of the value returned by the method. If the method does not return a value, use void.

3. **Method Name**: A descriptive name that follows Java naming conventions (camelCase).

4. **Parameters**: Variables passed to the method. They are defined within parentheses and specify the type and name.

5. **Method Body**: The block of code that defines what the method does.

### Example

Here is an example of a simple method that adds two integers:

```java
public static int add(int a, int b) {
return a + b;
}
````

### Parameters and Arguments

- **Parameters**: These are the variables listed in the method's definition. In the example above, int a and int b are
  parameters.

- **Arguments**: These are the actual values passed to the method when it is called. For instance:

````java
int sum = add(5, 10); // Here, 5 and 10 are arguments.
````
### Return Statement

- The return statement is used to exit a method and optionally return a value to the caller. If a method has a return
  type other than void, it must contain at least one return statement.

### Method Overloading

Java allows you to create multiple methods with the same name but different parameters (different type or number). This
is called method overloading.

````java
public static int add(int a, int b) {
return a + b;
}

public static double add(double a, double b) {
return a + b;
}
````
### Method Scope

- **Local Variables**: Variables declared inside a method are local to that method and cannot be accessed outside of it.

- **Instance Variables**: Variables declared within a class but outside any method can be accessed by any method in the
  class.

### Static vs Instance Methods

- **Static Methods**: Declared with the static keyword, these methods belong to the class rather than any specific
  instance. They can be called without creating an object of the class.

````java
public static void printMessage() {
System.out.println("Hello, World!");
}
````

- **Instance Methods**: These methods require an object of the class to be invoked.

````java
public void display() {
System.out.println("This is an instance method.");
}
````
### Conclusion

Methods are fundamental in Java programming as they promote code reusability and organization. Understanding how to
define, call, and work with methods is essential for effective Java programming.

