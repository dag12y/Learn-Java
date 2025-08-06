package Abstract;

public abstract class Shape {
    abstract double area(); // Abstract

    void display(){ // Concrete
        System.out.println("This is shape.");
    }

}
