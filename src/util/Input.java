package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Say something: ");
        String userInput = scanner.nextLine();
        System.out.println("You said: " + userInput);
        return userInput;

    }

    public boolean yesNo() {
        System.out.println("continue?: [y/n]");
        String answer = scanner.nextLine();
        return (answer.toLowerCase().contains("yes") || answer.toLowerCase().contains("y"));

    }

    public int getInt() {
        return scanner.nextInt();

    }

    public int getInt(int min, int max) {
        int answer = 0;
        System.out.printf("Please enter a number between %d and %d: \n", min, max);
        do {
            answer = getInt();

            if (answer >= min && answer <= max) {
                return answer;
            } else {
                System.out.printf("Invalid input. Please enter a number between %d and %d.\n", min, max);
            }
        } while (true);

    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        double answer;
        System.out.printf("Enter a number between %f and %f: ", min, max);
        do {
            answer = getDouble();
            if (answer >= min && answer <= max) {
                return answer;
            } else {
                System.out.printf("Invalid input. Please enter a number between %f and %f.", min, max);
            }
        } while (true);
    }
}
