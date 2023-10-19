package Lab1;

import java.util.Random;

public class Dice {
    
        private int numbSides; // Stores the number of sides on the die.
    private int currentValue; // Stores the current value (result) of rolling the die.
    private Random randomgen = new Random(); // Random number generator for rolling the die.

    // Constructor for initializing the Die object with the specified number of sides.
    public Dice(int numbSidesInput) {
        numbSides = numbSidesInput;
    }

    // Getter method to retrieve the current value of the die.
    public int getCurrentValue() {
        return currentValue;
    }

    // Method for rolling the die, updating its current value with a random number between 1 and the number of sides.
    public void roll() {
        currentValue = randomgen.nextInt(numbSides) + 1;
    }


}
