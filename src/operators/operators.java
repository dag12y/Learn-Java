package operators;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String foodName;
        double price;
        int quantity;
        double totalPrice;
        char currency='$';


        System.out.print("What do you want to buy ? : ");
        foodName=scanner.nextLine();

        System.out.print("How many do you want ? (quantity greater and equal to 10 have 10% discount.)  : ");
        quantity=scanner.nextInt();

        System.out.print("What is the price for each ? : ");
        price = scanner.nextDouble();

        totalPrice=quantity*price;
        if(quantity>=10){
            totalPrice*=0.9;
        }

        System.out.println();
        System.out.printf("You have bought %d %s. %n",quantity,foodName);
        System.out.printf("Total price : %.2f",totalPrice);


        scanner.close();
    }
}
