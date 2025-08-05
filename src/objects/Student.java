package objects;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled=true;

    Student(String name, int age, double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
    Student(){
        this.name="Guest";
        this.age=0;
        this.gpa=0;
        this.isEnrolled=false;

    }
}
