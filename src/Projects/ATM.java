package Projects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    static Scanner scanner=new Scanner(System.in);
    static double balance=0;

    public static void main(String[] args) {

        int choice;
        boolean isRunning=true;

        while(isRunning){
            System.out.println();
            System.out.println("******************************");
            System.out.println("       Welcome to ATM");
            System.out.println("******************************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("******************************");

            System.out.print("Enter your choice 1-4 : ");
            choice=scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance+=deposit();
                case 3 -> balance-=withdraw();
                case 4 -> isRunning=false;
                default -> System.out.println("Wrong input!");
            }
        }


    }
    static void showBalance(double balance){
        System.out.printf("Balance : $%.2f \n",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter deposit amount : ");
        amount=scanner.nextDouble();

        if(amount<0){
            System.out.println("deposit amount can't be negative.");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(){
        double amount;

        System.out.println("Enter withdraw amount : ");
        amount=scanner.nextDouble();

        if(amount>balance){
            System.out.println("Insufficient balance.");
            return 0;
        } else if (amount<0) {
            System.out.println("Withdraw amount can't be negative.");
            return 0;
        }
        else{
            return  amount;
        }

    }
}
