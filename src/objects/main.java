package objects;

public class main {
    public static void main(String[] args) {
        Student student1=new Student("dagm",20,3.6);
        Student student2=new Student("Dawit",30,3.4);
        Student student3=new Student();

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);


    }

}
