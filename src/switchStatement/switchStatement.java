package switchStatement;
import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Day : ");
        String day = scanner.next();

        switch (day.toLowerCase()){
            case "monday","tuesday","wednsday","thursday","friday" ->
                    System.out.println("it is working day");
            case "saturday","sunday" ->
                    System.out.println("it is weekend");
            default -> System.out.println(day+" is not a day");
        }
        scanner.close();
    }
}
