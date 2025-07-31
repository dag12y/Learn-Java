package random;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\n--- Rock, Paper, Scissors ---");
            System.out.println("Enter your choice (rock, paper, or scissors). To quit, type 'quit'.");
            System.out.print("Your choice: ");
            String playerChoice = scanner.nextLine().toLowerCase();


            if (playerChoice.equals("quit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            // validate the input

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.");
                continue;
            }

            // Computer's choice generation
            // 0 = rock, 1 = paper, 2 = scissors
            int computerChoiceIndex = random.nextInt(3); // Generates 0, 1, or 2
            String computerChoice;

            // Convert computer's numeric choice to string
            if (computerChoiceIndex == 0) {
                computerChoice = "rock";
            } else if (computerChoiceIndex == 1) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }

            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            // Draw condition
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a draw!");
            }
            // Player wins conditions
            else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            }
            // Computer wins (all other cases)
            else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}
