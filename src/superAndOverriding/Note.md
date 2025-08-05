# superAndOverriding.Super
- Refers to the parent class(subclass <- superclass)
- Used in constructor and method overriding
- Calls the parent constructor to attributes
## syntax
````Java
public class Person {
    String first;
    String last;

    Person(String first,String last){
        this.first=first;
        this.last=last;
    }
}

````
and then in next class
````Java
public class Student extends Person{
    double gpa;

    Student(String first,String last,double gpa){
        super(first,last);
        this.gpa=gpa;
        //other constructors

    }
}

````
# Method Overriding
- When a subclass provides its own implementation of a method that is already defined.
- Allows for code reusability and give specific implementations.
## syntax
````java
public class subclass extends  parentclass{

    @Override // optional(best to write it.)
    void method(){
        //your code ...
    }
}
````
## example
### `toString()`
- Method inherited from the Object class.
- Used to return a String representation of an object.
- By default, it returns the hash code of a unique identifier.
- It can be overridden to provide meaningful details.

````java
public class myclass{
    @Override
    public String toString(){
        return "Hello, World!";
    }
}

````

