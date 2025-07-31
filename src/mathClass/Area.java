package mathClass;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double x;
        double r;
        double area;

        System.out.print("Enter the lenght of Square : ");
        x=scanner.nextDouble();
        area=Math.pow(x,2);
        System.out.printf("The area of square is %.2f cm²",area);

        System.out.println();

        System.out.print("Enter the radius : ");
        r=scanner.nextDouble();
        area=Math.PI*Math.pow(r,2);
        System.out.printf("The area of Circle is %.2f cm²",area);
        System.out.println();
        double volume=(4/3)*Math.PI*Math.pow(r,3);
        System.out.printf("The Volume of Sphere is %.2f cm²",volume);

    }
}
