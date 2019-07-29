import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        int rando = random.nextInt(100) + 1;
        int i = 0;
        System.out.println("GUESS THE NUMBER: ");

        do {
            System.out.println("TAKE YOUR GUESS, MORTAL: ");
            int userGuess = scanner.nextInt();
            if (userGuess > rando) {
                System.out.println("TOO HIGH MORTAL");
                i++;
                System.out.println(i);
            } else if (userGuess < rando) {
                System.out.println("TOO LOW MORTAL");
                i++;
                System.out.println(i);
            } else if (userGuess == rando) {
                System.out.println("YOU HAVE GUESSED MY FREEING NUMBER, MORTAL, NOW I SHALL CONSUME ALL! HAHAHAHAHAHAHAHAHAA!");
                System.out.format("Number of guesses: " + i);
                break;
            }
        } while (true);
    }
}
