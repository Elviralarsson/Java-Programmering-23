package Extra;

import java.util.Random;
import java.util.Scanner;

public class HiLo {
    private static Scanner sc;

public static void main(String[] args) {
// Här ska menyn ligga och vaklet av grad ska sedan kalla på metoden
playGame,
// men svårighetsgrad som argument.
sc = new Scanner(System.in);
System.out.println("Välkommen till HiLo!");
System.out.println("Vilken svårighetsgrad? (1-3)");
System.out.println("1. Lätt (1-10)");
System.out.println("2. Medel (1-100");
System.out.println("3. Svårt (1-1000)");
System.out.println("4. Anpassa mitt spel");
int usedGuesses = 0;
int difficulty = sc.nextInt();
switch (difficulty) {
case 1:
usedGuesses = playGame(10);
System.out.println("Du lyckades på " + usedGuesses + " försök!");
break;
case 2:
usedGuesses = playGame(100);
System.out.println("Du lyckades på " + usedGuesses + " försök!");
break;
case 3:
usedGuesses = playGame(1000);
System.out.println("Du lyckades på " + usedGuesses + " försök!");
break;
case 4:
System.out.println("GE migh minsta talet");
int minNumber = sc.nextInt();
System.out.println("GE maj högsta tal");
int maxNumber = sc.nextInt();
System.out.println("GE mign max gissningar");
int maxGuesses = sc.nextInt();
customPlayGame(minNumber, maxNumber, maxGuesses);
break;
default:
System.out.println("Du behöver välja ett nummer mellan 1 - 4!");
}
}

    public static int playGame(int maxNumber) {
        int answer = (int) (Math.random() * maxNumber) + 1;
        int usedGuesses = 0;
        int guess = 0;
        while (answer != guess) {
            System.out.println("Gissa på ett tal mellan 1 och " + maxNumber);
            guess = sc.nextInt();
            usedGuesses = usedGuesses + 1;
            giveResponse(answer, guess);
        }
        return usedGuesses;
    }

    public static void giveResponse(int answer, int guess) {
        if (answer < guess) {
            System.out.println("Din gissning var högt");
        } else if (answer > guess) {
            System.out.println("Din gissning var för lågt");
        } else {
            System.out.println("Du gissa Rätt!");
        }
    }

public static int customPlayGame(int minNumber, int maxNumber, int maxGuesses) {
System.out.println("Now, LEts spela!");
int answer = (int) (Math.random() * (maxNumber - minNumber + 1)) +
minNumber;
int usedGuesses = 0;
while (usedGuesses < maxGuesses) {
System.out.println("Du har " + (maxGuesses - usedGuesses) + "
försök kvar!");
usedGuesses = usedGuesses + 1;
System.out.println("Gissa på ett tal mellan " + minNumber + " och " +
maxNumber);
int guess = sc.nextInt();
giveResponse(answer, guess);
if (answer == guess) {
return usedGuesses;
}
}
System.out.println("Du runnade ut av gissningar, GAME OVER");
return 0;
}
}
