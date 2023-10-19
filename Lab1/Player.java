package Lab1;

public class Player {

        private String name; // Stores the player's name.
        private int score; // Stores the player's score.
        private Dice die; // Represents the player's die for rolling.
    
        // Constructor for initializing the Player object.
        public Player(String name, int numberOfSides) {
            this.name = name; // Initialize the player's name.
            score = 0; // Initialize the player's score to zero.
            die = new Dice(numberOfSides); // Create a Die object with the specified number of sides.
        }
    
        // Getter method to retrieve the player's score.
        public int getScore() {
            return score;
        }
    
        // Method for rolling the player's die.
        public void rollDice() {
            die.roll(); // Roll the die, updating its current value.
        }
    
        // Getter method to retrieve the current value of the player's die.
        public int getCurrentValue() {
            return die.getCurrentValue();
        }
    
        // Method for increasing the player's score by one.
        public void increaseScore() {
            score++; // Increment the player's score by one.
        }
    }

