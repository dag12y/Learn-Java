package Projects;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int min=1;
        int max=10;
        Random random = new Random();
        Scanner scanner=new Scanner(System.in);

        int randomNumber = random.nextInt(min,max+1);
        int guess;
        int attempts=0;

        System.out.printf("*************  Guess a number between %d- %d  *************\n",min,max);

        do{
            System.out.println();
            System.out.print("Enter a Guess : ");
            guess=scanner.nextInt();
            attempts++;

            if(guess>randomNumber){
                System.out.println("try lower");
            } else if (guess<randomNumber) {
                System.out.println("try higher");
            }
            else{
                System.out.println();
                System.out.println("You found it!");
                System.out.printf("it takes you %d tries.",attempts);
            }


        }while(guess != randomNumber);
    }


}
