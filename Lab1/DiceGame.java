package Lab1;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the player's name.
        System.out.print("Enter player's name: ");
        String playerName = scanner.nextLine();

        // Prompt the user to assign the number of rounds they want to play.
        System.out.print("Assign the number of rounds you want to play: ");
        int numbRounds = scanner.nextInt();

        // Prompt the user to assign the number of sides on the die.
        System.out.print("Assign the number of sides on your die: ");
        int numbSides = scanner.nextInt();

        // Create a Player object with the specified player name and number of die sides.
        Player player = new Player(playerName, numbSides);

        int totalScore = 0;

        // Iterate through the specified number of rounds.
        for (int round = 1; round <= numbRounds; round++) {
            // Roll the player's die for the current round.
            player.rollDice();
            int roundResult = player.getCurrentValue();

            System.out.print("Make a guess:");
            int guess = scanner.nextInt();
if(guess == roundResult) {
                System.out.println("Congratulations, your guess is correct!");
                System.out.println("Your multiplied result value is:" + guessroundResult);
             // Update the total score with the result of the current round.
            totalScore += guessroundResult;
            }
            // Print the result of the current round.
            System.out.println("Round " + round + " Result: " + roundResult);
        }

        // Print the combined round results for the player.
        System.out.println("Combined Result of every Round " + playerName + ": " + totalScore);

        // Close the Scanner to release resources.
        scanner.close();
    }
}
