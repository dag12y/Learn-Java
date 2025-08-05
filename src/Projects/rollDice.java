package Projects;

import java.util.Random;
import java.util.Scanner;

public class rollDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll : ");
        numOfDice = scanner.nextInt();

        for (int i = 0; i < numOfDice; i++) {
            int rolled = random.nextInt(1, 7);
            displaydice(rolled);
            System.out.printf("You have rolled %d\n",rolled);
            total += rolled;
        }
        System.out.printf("Total : %d\n", total);
    }

    static void displaydice(int n) {
        String[] dice1 = {
                "+-------+",
                "|       |",
                "|   ●   |",
                "|       |",
                "+-------+"
        };

        String[] dice2 = {
                "+-------+",
                "| ●     |",
                "|       |",
                "|     ● |",
                "+-------+"
        };

        String[] dice3 = {
                "+-------+",
                "| ●     |",
                "|   ●   |",
                "|     ● |",
                "+-------+"
        };

        String[] dice4 = {
                "+-------+",
                "| ●   ● |",
                "|       |",
                "| ●   ● |",
                "+-------+"
        };

        String[] dice5 = {
                "+-------+",
                "| ●   ● |",
                "|   ●   |",
                "| ●   ● |",
                "+-------+"
        };

        String[] dice6 = {
                "+-------+",
                "| ●   ● |",
                "| ●   ● |",
                "| ●   ● |",
                "+-------+"
        };

        switch (n){
            case 1 -> printDice(dice1);
            case 2 -> printDice(dice2);
            case 3 -> printDice(dice3);
            case 4 -> printDice(dice4);
            case 5 -> printDice(dice5);
            case 6 -> printDice(dice6);

        }
    }
    static void printDice(String[] dice) {
        for (String line : dice) {
            System.out.println(line);
        }
    }
}
