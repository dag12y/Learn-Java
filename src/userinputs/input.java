package userinputs;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name=scanner.nextLine();

        System.out.print("Enter Age : ");
        int age = scanner.nextInt();

        System.out.print("Are you student? (true/false) : ");
        boolean isStudent=scanner.nextBoolean();

        System.out.printf("Hello, %s%n.",name);
        System.out.printf("you are %d years old.%n",age);
        if(isStudent){
            System.out.println("so, you are Student");
        }
        else{
            System.out.println("Sad, you are not Student");
        }
        scanner.close();
    }
}

