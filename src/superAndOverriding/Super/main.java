package superAndOverriding.Super;

public class main {
    public static void main(String[] args) {
        Person person=new Person("Harry","Potter");
        Student student=new Student("Dagm","Yibabe",3.9);
        Employee employee=new Employee("Dawit","Yibabe",3000);

        person.showName();
        student.showGpa();
        employee.showSalary();
    }
}
