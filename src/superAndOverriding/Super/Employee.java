package superAndOverriding.Super;

public class Employee extends Person{
    int salary;
    Employee(String first,String last,int salary){
        super(first,last);
        this.salary=salary;
    }
    void showSalary(){
        System.out.printf("Salary : $%d",salary);
    }
}
